from YAPLListener import YAPLListener
from YAPLParser import YAPLParser
from itertools import groupby
from antlr4.tree.Trees import TerminalNode
from antlr4.error.ErrorListener import ErrorListener
from symbol_table import *

class YAPLPrinter(YAPLListener):
    def __init__(self) -> None:
        self.root = None

        self.STRING = "String"
        self.INT = "Int"
        self.BOOL = "Bool"
        self.IO = "io"
        self.VOID = "Void"
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
        self.current_scope_statement = None
        self.type_table = TypeTable()
        self.errors = SemanticError()
        self.method_table = MethodTable()
        self.class_table = ClassTable()
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

    def enterProgram(self, ctx: YAPLParser.ProgramContext):
        print(" --- INICIO PROGRAMA --- ")
        self.root = ctx
        self.current_scope = SymbolTable()
        self.current_scope_statement = "global"
    
    def enterClas_list(self, ctx: YAPLParser.Clas_listContext):
        address = hex(id(ctx))
        class_type = ctx.type_()[0].getText()
        line = ctx.type_()[0].start.line
        col = ctx.type_()[0].start.column

        position = "Linea: " + str(line) + " Columna: " + str(col)
        try:
            inheritance = ctx.type_()[1].getText()
        except:
            inheritance = None

        if self.class_table.lookup(class_type) == 0:
            self.class_table.add(class_type, class_type, self.current_scope_statement, position, inheritance, address)
        
        else: # Error si hay clases duplicadas
            line = ctx.type_()[0].start.line
            col = ctx.type_()[0].start.column
            self.errors.add(line, col, "Clase duplicada: " + class_type)
        
        self.current_scope_statement = "global -> " + class_type
        self.newscope()

    # Entrando a declaraciones de variables
    def enterAttribute_definition(self, ctx: YAPLParser.Attribute_definitionContext):
        tipo = ctx.type_().getText()
        address = hex(id(ctx))
        position = "Linea: " + str(ctx.type_().start.line) + " Columna: " + str(ctx.type_().start.column)

        if ctx.ID() is not None:
            ctx_id = ctx.ID().getText()
            if self.current_scope.lookup(ctx_id) == 0:
                self.current_scope.add(tipo, ctx_id, self.current_scope_statement, position, address, False)
            else:
                line = ctx.type_().start.line
                col = ctx.type_().start.column
                self.errors.add(line, col, "Variable duplicada: " + ctx_id)
                
    
    def exitAttribute_definition(self, ctx: YAPLParser.Attribute_definitionContext):
        print('Saliendo de la declaracion de atributo: ' + ctx.ID().getText())

    
    def enterMethod_definition(self, ctx: YAPLParser.Method_definitionContext):
        self.current_scope_statement = "local"
        method_id = ctx.ID().getText()
        method_type = ctx.type_().getText()
        address = hex(id(ctx))
        parameters = []
        position = "Linea: " + str(ctx.type_().start.line) + " Columna: " + str(ctx.type_().start.column)

        parameter_list = ctx.parameter_list()
        formal_list = parameter_list.formal() # Parametros
        for formal in formal_list:
            parameters.append(formal.getText())

        if self.method_table.lookup(method_id) == 0:
            self.method_table.add(method_type, method_id, parameters, self.current_scope_statement, address, position)
        else:
            line = ctx.type_().start.line
            col = ctx.type_().start.column
            self.errors.add(line, col, "Metodo duplicado: " + method_id)

        self.newscope()
    
    def exitMethod_definition(self, ctx: YAPLParser.Method_definitionContext):
        self.popscope()

    def exitClas_list(self, ctx: YAPLParser.Clas_listContext):
        class_type = ctx.type_()[0].getText()
        self.popscope()
        self.current_scope_statement = "global"
        print('Saliendo de la clase: ' + class_type)

        if class_type == self.VOID:
            self.node_type[ctx] = self.ERROR
            line = ctx.type_()[0].start.line
            col = ctx.type_()[0].start.column
            self.errors.add(line, col, "Clase no puede ser tipo void")
            return
        

        
    # def enterMethod_definition(self, ctx: YAPLParser.Method_definitionContext):
    #     method_type = ctx.type_().getText()
    #     method_name = ctx.ID().getText()
    #     parameters = []

    #     hijos = ctx.getChildCount()

    #     for i in range(hijos):
    #         print(ctx.getChild(i).getText())
    #         if isinstance(ctx.getChild(i), YAPLParser.FormalContext):
    #             idParameter = ctx.getChild(i).ID().getText()
    #             typeParameter = self.data_type[ctx.getChild(i).type_().getText()]
    #             if idParameter in [i['ID'] for i in parameters]:
    #                 line = ctx.getChild(i).ID().start.line
    #                 col = ctx.getChild(i).ID().start.column
    #                 self.errors.add(line, col, "Parametro duplicado: " + idParameter)
    #             parameters.append({'type': typeParameter, 'ID': idParameter})
    #             self.parameter_table.add(typeParameter, idParameter)

    #     if self.method_table.lookup(method_name) == 0:
    #         self.method_table.add(method_type, method_name, parameters)
    #     else:
    #         line = ctx.type_().start.line
    #         col = ctx.type_().start.column
    #         self.errors.add(line, col, "Metodo duplicado: " + method_name)

    #     self.newscope()
    #     print('Entrando al metodo: ' + method_name)
            


    def exitProgram(self, ctx: YAPLParser.ProgramContext):
        main_class = self.method_table.lookup("main")
        if main_class != 0:
            hasError = self.childrenhaserror(ctx)
            if hasError:
                print("El programa contiene errores")
                # self.errors.add(0,0,"El programa contiene errores")


        self.current_scope.totable()
        print(" --- FIN PROGRAMA --- ")

        self.class_table.totable()
        self.method_table.totable()

        if len(self.errors.GetErrores()) > 0:
            print(" --- ERRORES --- ")
            print(self.errors.GetErrores())



