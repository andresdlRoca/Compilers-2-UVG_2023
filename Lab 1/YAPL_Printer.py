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

    def enterprogram(self, ctx: YAPLParser.ProgramContext):
        print(" --- INICIO PROGRAMA --- ")
        self.root = ctx
        self.current_scope = SymbolTable()
    
    def enterClas_list(self, ctx: YAPLParser.Clas_listContext):
        class_type = ctx.type_()[0].getText()
        try:
            inheritance = ctx.type_()[1].getText()
        except:
            inheritance = None
        # print(class_type, inheritance)
        if self.class_table.lookup(class_type) == 0:
            hijos = ctx.getChildCount()

            # for i in range(hijos):
            #     if isinstance(ctx.getChild(i)): # TODO: Agregar chequeo de declaracion de variables
            #         pass
        
            self.class_table.add(class_type, class_type, inheritance)
        
        else: # Error si hay clases duplicadas
            line = ctx.type_()[0].start.line
            col = ctx.type_()[0].start.column
            self.errors.add(line, col, "Clase duplicada: " + class_type)

    def exitClas_list(self, ctx: YAPLParser.Clas_listContext):
        class_type = ctx.type_()[0].getText()
        self.parameter_table.clear()
        # self.popscope()
        print('Saliendo de la clase: ' + class_type)

        if class_type == self.VOID:
            self.node_type[ctx] = self.ERROR
            line = ctx.type_()[0].start.line
            col = ctx.type_()[0].start.column
            self.errors.add(line, col, "Clase no puede ser tipo void")
            return
        
        self.node_type[ctx] = self.VOID

    def exitProgram(self, ctx: YAPLParser.ProgramContext):
        main_class = self.method_table.lookup("main")
        if main_class != 0:
            hasError = self.childrenhaserror(ctx)
            if hasError:
                print("El programa contiene errores")
                # self.errors.add(0,0,"El programa contiene errores")


        # self.current_scope.totable()
        print(" --- FIN PROGRAMA --- ")

        self.class_table.totable()
        self.method_table.totable()

        if len(self.errors.GetErrores()) > 0:
            print(" --- ERRORES --- ")
            print(self.errors.GetErrores())



