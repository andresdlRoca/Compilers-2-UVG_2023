from YAPLListener import YAPLListener
from YAPLParser import YAPLParser
from itertools import groupby
from symbol_table import *

class YAPLPrinter(YAPLListener):
    def __init__(self) -> None:
        self.root = None

        self.STRING = "String"
        self.INT = "Int"
        self.BOOL = "Bool"
        self.IO = "io"
        self.VOID = "void"
        self.ERROR = "error"

        self.data_type = {
            'String': self.STRING,
            'Int': self.INT,
            'Bool': self.BOOL,
            'io': self.IO,
            'void': self.VOID,
            'error': self.ERROR
        }

        self.scopes = []
        self.current_scope = None
        self.type_table = TypeTable()
        self.errors = SemanticError()
        self.method_table = MethodTable()
        self.parameter_table = ParameterTable()

        self.node_type = {}

    
    def popscope(self):
        self.current_scope.totable()
        self.current_scope = self.scopes.pop()
    
    def newscope(self):
        self.scopes.append(self.current_scope)
        self.current_scope = SymbolTable()
    
    def find(self, var):
        lookup = self.current_scope.lookup(var)
        if lookup == 0:
            scope_reverse = self.scopes.copy()
            scope_reverse.reverse()
            for scope in scope_reverse:
                lookup2 = scope.lookup(var)
                if lookup2 != 0:
                    return lookup2
            return 0
        else:
            return lookup
        
    def intersection(self, a, b):
        return [v for v in a if v in b]
    
    def allequal(self, iterable):
        g = groupby(iterable)
        return next(g, True) and not next(g, False)
    
    def childrenhaserror(self, ctx):
        non_terminals = [self.node_type[i] for i in ctx.children if type(i) in [YAPLParser.LocationContext, YAPLParser.ExprContext, YAPLParser.BlockContext, YAPLParser.DeclarationContext]]
        if self.ERROR in non_terminals:
            return True
        return False

    def enterprogram(self, ctx: YAPLParser.ProgramContext):
        print(" --- INICIO PROGRAMA --- ")
        self.root = ctx
        self.current_scope = SymbolTable()

    def enterMethod_definition(self, ctx: YAPLParser.Method_definitionContext):
        method = ctx.ID().getText()
        parameters = []
        if self.method_table.lookup(method) == 0:
            if ctx.type_() != None:
                type = "void"
            else:
                type = ctx.type_().getText()
            print("Entrando a metodo: " + method)
            children = ctx.getChildCount()

            for i in range(children):
                if isinstance(ctx.getChild(i), YAPLParser.TypeContext):
                    typeparameter = self.data_type[ctx.getChild(i).getText()]
                    idparameter = ctx.getChild(i+1).getText()
                    if idparameter in [i['ID'] for i in parameters]:
                        line = ctx.getChild(i+1).start.line
                        col = ctx.getChild(i+1).start.column
                        # TODO: Agregar error semantico respecto a Identificardor declarado muchas veces

                    parameters.append({
                        'Type': typeparameter,
                        'ID': idparameter
                    })
                    self.parameter_table.add(typeparameter, idparameter)
            self.method_table.add(type, method, parameters, None)
        else:
            line = ctx.start.line
            col = ctx.start.column
            # TODO: Agregar error semantico respecto a identificador declarado muchas veces
        
        self.newscope()

        for parameter in parameters:
            type_symbol = self.type_table.lookup(parameter['Type'])
            print(type_symbol)
            description = type_symbol['Description']
            self.current_scope.add(parameter['Type'], parameter['ID'], description, True)
    
    def exitMethod_definition(self, ctx: YAPLParser.Method_definitionContext):
        method = ctx.ID().getText()
        self.parameter_table.Clear()
        self.popscope()
        print("Saliendo de metodo: " + method)

        return_type = ctx.type_().getText()
        block_type = self.node_type[ctx.block()]

        if return_type == self.VOID and block_type != self.VOID and block_type != self.ERROR:
            self.node_type[ctx] = self.ERROR
            line = ctx.type_().start.line
            col = ctx.type_().start.column
            self.errors.add(line, col, "El metodo no retorna nada")
            return

        if return_type != block_type:
            if block_type == self.ERROR:
                self.node_type[ctx] = self.ERROR
                return
            self.node_type[ctx] = self.ERROR
            line = ctx.block().start.line
            col = ctx.block().start.column
            self.errors.add(line, col, "El tipo de retorno no coincide con el tipo de la funcion")
        
        self.node_type[ctx] = return_type

    def enterFormal(self, ctx: YAPLParser.FormalContext):
        type = ctx.type_().getText()

        if ctx.type_() is not None:
            id = ctx.ID().getText()

            if self.parameter_table.lookup(id) != 0:
                self.node_type[ctx] = self.ERROR
                self.node_type[ctx.ID] = self.ERROR
                self.errors.add(ctx.ID().start.line, ctx.ID().start.column, "El tipo no existe previamente")
            
            if self.current_scope.lookup(id) == 0:
                # TODO: Agregar error semantico respecto a identificador no existente previamente
                pass
            else:
                # TODO: Agregar error semantico respecto a identificador declarado muchas veces
                pass
                
        elif ctx.ID is not None:
            id = ctx.ID().getText()
            if self.current_scope.lookup(id) != 0:
                # TODO: Error shadow parameter
                pass
            if self.parameter_table.lookup(id) == 0:
                # TODO: Agregar error semantico respecto a identificador no existente previamente
                pass
            
    
    def enterBlock(self, ctx: YAPLParser.BlockContext):
        parent = ctx.parentCtx

        if not isinstance(parent, YAPLParser.Method_definitionContext):
            self.newscope()
    
    def exitBlock(self, ctx: YAPLParser.BlockContext):
        parent = ctx.parentCtx

        if not isinstance(parent, YAPLParser.Method_definitionContext):
            self.popscope()
        
        for child in ctx.children:
            if not isinstance(child, YAPLParser.StatementContext):
                continue # TODO: error semantico
    
    def exitProgram(self, ctx: YAPLParser.ProgramContext):
        main_class = self.method_table.lookup("main")
        if main_class != 0:
            pass # TODO: errores semanticos

        self.current_scope.totable()
        print(" --- FIN PROGRAMA --- ")

        self.method_table.totable()
    



