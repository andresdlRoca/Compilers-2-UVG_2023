from YAPLListener import YAPLListener
from YAPLParser import YAPLParser
from itertools import groupby
from antlr4.tree.Trees import TerminalNode
from antlr4.error.ErrorListener import ErrorListener
from symbol_table import *

class YAPLPrinter(YAPLListener):
    def __init__(self) -> None:
        self.root = None

        self.STRING = "string"
        self.INT = "int"
        self.BOOL = "bool"
        self.IO = "io"
        self.VOID = "void"
        self.ERROR = "error"

        self.basic_data_type = {
            'string': self.STRING,
            'int': self.INT,
            'bool': self.BOOL,
        }

        self.default_data_types = {
            'string': self.STRING,
            'int': self.INT,
            'bool': self.BOOL,
            'io': self.IO,
            'void': self.VOID
        }

        self.scopes = []
        self.current_scope = None
        self.current_scope_statement = None
        self.current_scope_class = None
        # self.type_table = TypeTable()
        self.global_symbol_table = SymbolTable()
        self.errors = SemanticError()
        self.global_method_table = MethodTable() # Saves ALL the methods
        self.global_method_call_table = MethodCallTable() # Saves ALL the method calls
        self.method_table = MethodTable() # Saves the methods of the current scope
        self.method_call_table = MethodCallTable() # Saves the method calls of the current scope
        self.class_table = ClassTable()

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
        line = ctx.type_()[0].start.line
        col = ctx.type_()[0].start.column
        address = hex(id(ctx))
        class_type = ctx.type_()[0].getText()            


        position = "Linea: " + str(line) + " Columna: " + str(col)
        try:
            inheritance = ctx.type_()[1].getText()
        except:
            inheritance = None

        # Check for recursive inheritance
        if inheritance is not None:
            if inheritance == class_type:
                self.errors.add(line, col, "Herencia a si mismo no es permitido: " + inheritance)

        
        # Error si clase main es heredada por otra clase
        if inheritance is not None:
            if ctx.type_()[1].getText().lower() == 'main':
                self.errors.add(line, col, "Main no puede ser heredada por otra clase")

        if class_type.lower() == 'main': # Error si clase main hereda de otra clase
            if inheritance is not None:
                self.errors.add(line, col, "Main no puede heredar de otra clase")

        if self.class_table.lookup(class_type) == 0:
            self.class_table.add(class_type, class_type, self.current_scope_statement, position, inheritance, address)
        
        else: # Error si hay clases duplicadas
            line = ctx.type_()[0].start.line
            col = ctx.type_()[0].start.column
            self.errors.add(line, col, "Clase duplicada: " + class_type)
        
        self.current_scope_statement = "global -> " + class_type
        self.current_scope_class = self.current_scope_statement
        self.newscope()

        # Add inherited variables to current scope
        if inheritance is not None:
            inherited_symbols = self.global_symbol_table._symbols.copy()
            # print('inherited_symbols', inherited_symbols)
            for symbol in inherited_symbols:
                if symbol['Scope'] == 'global -> ' + inheritance:
                    if symbol['IsInherited'] == False:
                        self.current_scope.add(symbol['Type'], symbol['ID'], self.current_scope_statement, symbol['Value'], symbol['Position'], symbol['Address'], symbol['IsParameter'], True)
                        self.global_symbol_table.add(symbol['Type'], symbol['ID'], self.current_scope_statement, symbol['Value'], symbol['Position'], symbol['Address'], symbol['IsParameter'], True)
                    else:
                        pass # No se agregan variables heredadas de variables heredadas (Evita herencia multiple)

    # Entrando a declaraciones de variables
    def enterAttribute_definition(self, ctx: YAPLParser.Attribute_definitionContext):
        tipo = ctx.type_().getText()
        address = hex(id(ctx))
        position = "Linea: " + str(ctx.type_().start.line) + " Columna: " + str(ctx.type_().start.column)
        
        value = ctx.expr().pop().getText() if len(ctx.expr()) > 0 else None

        if value is not None: # Si hay valor convertir a tipo de dato esperado
            if tipo.lower() == self.basic_data_type['string']:
                value = str(value)
            elif tipo.lower() == self.basic_data_type['int']:
                value = int(value)
            elif tipo.lower() == self.basic_data_type['bool']:
                value = bool(value)
        
        if tipo.lower() not in self.default_data_types: # Buscar en tabla de clases si no es tipo basico
            if self.class_table.lookup(tipo) == 0:
                line = ctx.type_().start.line
                col = ctx.type_().start.column
                self.errors.add(line, col, "Tipo no existe: " + tipo)

        # Valores default si no se ha asignado previamente un valor a la variable
        if tipo.lower() in self.basic_data_type and value is None:
            if tipo.lower() == self.basic_data_type['string']:
                value = ""
            elif tipo.lower() == self.basic_data_type['int']:
                value = 0
            elif tipo.lower() == self.basic_data_type['bool']:
                value = False

        # Check recursive inheritance
        scope_split = self.current_scope_statement.split(" -> ")
        if len(scope_split) > 1:
            if scope_split[1] == tipo:
                self.errors.add(ctx.type_().start.line, ctx.type_().start.column, "Herencia recursiva no permitida: " + tipo)

        if ctx.ID() is not None:
            ctx_id = ctx.ID().getText()
            if self.current_scope.lookup(ctx_id) == 0:
                # Allow only simple inheritance
                self.current_scope.add(tipo, ctx_id, self.current_scope_statement, value, position, address, False, False)
                self.global_symbol_table.add(tipo, ctx_id, self.current_scope_statement, value, position, address, False, False)
            else:
                if self.current_scope.lookup(ctx_id)['IsInherited'] == True: # Overriding de variable heredada
                    self.current_scope.delete(ctx_id)
                    self.global_symbol_table.delete(ctx_id)
                    self.current_scope.add(tipo, ctx_id, self.current_scope_statement, value, position, address, False, False)
                    self.global_symbol_table.add(tipo, ctx_id, self.current_scope_statement, value, position, address, False, False)
                else: # Error si hay variables duplicadas
                    line = ctx.type_().start.line
                    col = ctx.type_().start.column
                    self.errors.add(line, col, "Variable duplicada: " + ctx_id)
                
    
    def exitAttribute_definition(self, ctx: YAPLParser.Attribute_definitionContext):
        print('Saliendo de la declaracion de atributo: ' + ctx.ID().getText())

    
    def enterMethod_definition(self, ctx: YAPLParser.Method_definitionContext):
        method_id = ctx.ID().getText()
        method_type = None
        if ctx.type_():
            method_type = ctx.type_().getText()
            # Buscar en tabla de clases si no es tipo basico
            if method_type.lower() not in self.default_data_types:
                if self.class_table.lookup(method_type) == 0:
                    line = ctx.type_().start.line
                    col = ctx.type_().start.column
                    self.errors.add(line, col, "Tipo no existe: " + method_type)

        else:
            method_type = None
            self.errors.add(ctx.start.line, ctx.start.column, "Se debe especificar el tipo del metodo: " + method_id)
        address = hex(id(ctx))
        parameters = []
        if method_type:
            position = "Linea: " + str(ctx.type_().start.line) + " Columna: " + str(ctx.type_().start.column)
        else:
            position = "Linea: " + str(ctx.parameter_list().start.line) + " Columna: " + str(ctx.parameter_list().start.column)

        parameter_list = ctx.parameter_list()
        if parameter_list is not None: # Si hay parametros
            formal_list = parameter_list.formal() # Parametros
            for formal in formal_list:
                parameters.append(formal.getText())

        if self.method_table.lookup(method_id) == 0:
            self.global_method_table.add(method_type, method_id, parameters, self.current_scope_statement, address, position)
            self.method_table.add(method_type, method_id, parameters, self.current_scope_statement, address, position)
        else:
            line = ctx.type_().start.line
            col = ctx.type_().start.column
            self.errors.add(line, col, "Metodo duplicado: " + method_id)

        self.current_scope_statement = "local"

        self.newscope()
    
    def exitIf_statement(self, ctx: YAPLParser.If_statementContext):
        return super().exitIf_statement(ctx)
    
    def exitWhile_statement(self, ctx: YAPLParser.While_statementContext):
        return super().exitWhile_statement(ctx)
    
    def enterLet_declaration(self, ctx: YAPLParser.Let_declarationContext):
        return super().enterLet_declaration(ctx)
    
    def exitLet_declaration(self, ctx: YAPLParser.Let_declarationContext):
        return super().exitLet_declaration(ctx)
    
    def exitExpr(self, ctx: YAPLParser.ExprContext):
        return super().exitExpr(ctx)
    
    def exitVar_assign(self, ctx: YAPLParser.Var_assignContext):
        # Check if variable exists
        # print(self.current_scope._symbols)
        # print("ID", ctx.ID)
        if self.current_scope.lookup(ctx.ID().getText()) == 0:
            line = ctx.expr().start.line
            col = ctx.expr().start.column
            self.errors.add(line,col,"Variable no existe: " + ctx.ID().getText())
        else:
            variable_declaration = self.current_scope.lookup(ctx.ID())
            variable_type = self.current_scope.lookup(ctx.ID().getText())['Type']
            value = ctx.expr().getText()

            start_with_quote = value.startswith("'") or value.startswith('"')
            end_with_quote = value.endswith("'") or value.endswith('"')

            # Check if assignment is boolean
            if value == 'true' or value == 'false':
                if variable_type.lower() != self.BOOL.lower():
                    line = ctx.expr().start.line
                    col = ctx.expr().start.column
                    self.errors.add(line,col,"Variable de tipo: " + self.BOOL + " no puede ser asignada a: " + ctx.ID().getText())
            
            # Check if assignment is digit
            elif value.isdigit():
                if variable_type.lower() != self.INT.lower():
                    line = ctx.expr().start.line
                    col = ctx.expr().start.line
                    self.errors.add(line,col, "Variable de tipo: " + self.INT + " no puede ser asignada a: " + ctx.ID().getText())
            
            #Check if assignment is string
            elif start_with_quote and end_with_quote:
                if variable_type.lower() != self.STRING.lower():
                    line = ctx.expr().start.line
                    col = ctx.expr().start.column
                    self.errors.add(line,col,"Variable de tipo: " + self.STRING + " no puede ser asignada a: " + ctx.ID().getText())

            # Check if assigned variable is valid
            elif value:
                # TODO: Validate if variable is valid
                pass
        

        # tipo = ctx.type_().getText()
        # address = hex(id(ctx))
        # position = "Linea: " + str(ctx.type_().start.line) + " Columna: " + str(ctx.type_().start.column)
        # value = ctx.expr().pop().getText() if len(ctx.expr()) > 0 else None

    def exitMethod_definition(self, ctx: YAPLParser.Method_definitionContext):
        self.popscope()
        self.current_scope_statement = self.current_scope_class
    
    def enterSimple_method_definition(self, ctx: YAPLParser.Simple_method_definitionContext):
        # self.current_scope_statement = "local"

        function_call_id = None
        variable_name = None
        variable_type = None

        # Check if ctx.ID is array or not
        if type(ctx.ID()) is TerminalNode:
            function_call_id = ctx.ID().getText()
        else:
            if len(ctx.ID()) > 1:
                variable_name = ctx.ID()[0].getText()
                function_call_id = ctx.ID()[1].getText()
            else:
                function_call_id = ctx.ID()[0].getText()

        # Check if variable exists
        if variable_name is not None:
            if self.current_scope.lookup(variable_name) == 0:
                if variable_name != 'main':
                    line = ctx.start.line
                    col = ctx.start.column
                    self.errors.add(line,col,"Variable de la llamada no existe: " + variable_name + '.' + function_call_id + '()')
            else:
                variable_type = self.current_scope.lookup(variable_name)['Type']     



        address = hex(id(ctx))
        parameters = []
        position = "Linea: " + str(ctx.start.line) + " Columna: " + str(ctx.start.column)

        parameter_list = ctx.expr()
        for parameter in parameter_list:
            parameters.append(parameter.getText())

        # Check if number of parameters is the same
        method = self.global_method_table.lookup_w_class(function_call_id, variable_type)
        if method != 0:
            if len(method['Parameters']) != len(parameters):
                # print('Lenes', len(method['Parameters']), len(parameters))
                line = ctx.start.line
                col = ctx.start.column
                self.errors.add(line,col,"Numero de parametros no coincide con la declaracion: " + variable_name + '.' + function_call_id + '()')

        # Check if method has already called init()
        if function_call_id == 'init':
            lookupmethod = self.method_call_table.lookup(variable_name)
            if lookupmethod != 0 and lookupmethod['Function_ID'] == 'init' and lookupmethod['ID'] == variable_name:
                line = ctx.start.line
                col = ctx.start.column
                self.errors.add(line,col,"Metodo init() ya ha sido llamado")

        #Check if method calls another method before init()
        if function_call_id != 'init':
            lookupmethod = self.method_call_table.lookup(variable_name)
            if lookupmethod == 0 and variable_name != 'main':
                line = ctx.start.line
                col = ctx.start.column
                self.errors.add(line,col,"Metodo init() debe ser llamado primero")


        if self.method_call_table.lookup(function_call_id) == 0:
            self.global_method_call_table.add(variable_type, variable_name, function_call_id, parameters, self.current_scope_statement, address, position)
            self.method_call_table.add(variable_type, variable_name, function_call_id, parameters, self.current_scope_statement, address, position)
        else:
            line = ctx.start.line
            col = ctx.start.column
            self.errors.add(line, col, "Metodo duplicado: " + function_call_id)

        


        # self.newscope()

    def exitSimple_method_definition(self, ctx: YAPLParser.Simple_method_definitionContext):
        # self.popscope()
        # self.method_call_table = MethodCallTable()

        variable_name = None

        # Check if ctx.ID is array or not
        if type(ctx.ID()) is TerminalNode:
            method_id = ctx.ID().getText()
        else:
            if len(ctx.ID()) > 1:
                variable_name = ctx.ID()[0].getText()
                method_id = ctx.ID()[1].getText()
            else:
                method_id = ctx.ID()[0].getText()

        # Get current type of variable
        variable_lookup = self.current_scope.lookup(variable_name)
        if type(variable_lookup) is not int:
            variable_type = self.current_scope.lookup(variable_name)['Type']     

            # Get if method exists
            method = self.global_method_table.lookup_w_class(method_id, variable_type)
            if method == 0:
                line = ctx.start.line
                col = ctx.start.column
                self.errors.add(line,col,"Metodo no existe: " + method_id + " en clase: " + variable_type)
        

    def exitClas_list(self, ctx: YAPLParser.Clas_listContext):
        class_type = ctx.type_()[0].getText()
        line = ctx.type_()[0].start.line
        col = ctx.type_()[0].start.column

        # Verificar que haya un metodo main en clase main sin parametros
        if class_type.lower() == 'main':
            main_method = self.method_table.lookup("main")
            if main_method == 0:
                self.errors.add(line,col,"No se encontro metodo main")
            else:
                if len(main_method['Parameters']) > 0:
                    line = main_method['Position'].split(" ")[1]
                    col = main_method['Position'].split(" ")[3]
                    self.errors.add(line,col,"Metodo main no puede tener parametros")

        self.method_table = MethodTable()


        self.popscope()
        self.current_scope_statement = "global"
        print('Saliendo de la clase: ' + class_type)

        if class_type == self.VOID:
            self.node_type[ctx] = self.ERROR
            self.errors.add(line, col, "Clase no puede ser tipo void")
            return
        
        

    def exitProgram(self, ctx: YAPLParser.ProgramContext):
        main_class = self.class_table.lookup("main")
        if main_class == 0: # Error si no hay clase main
            self.errors.add(0,0,"No se encontro clase main")

        for i in self.class_table._classes:
            if i['Inheritance'] is not None:
                if self.class_table.lookup(i['Inheritance']) == 0:

                    # Check if it is basic data type
                    if i['Inheritance'].lower() in self.basic_data_type:
                        line = i['Position'].split(" ")[1]
                        col = i['Position'].split(" ")[3]
                        self.errors.add(line,col,"Clase heredada no puede ser tipo basico: " + i['Inheritance'])
                    else:
                        line = i['Position'].split(" ")[1]
                        col = i['Position'].split(" ")[3]
                        self.errors.add(line,col,"Clase heredada no existe: " + i['Inheritance'])

        self.current_scope.totable()
        print(" --- FIN PROGRAMA --- ")

        print("\n --- Resumen de tablas --- ")
        self.class_table.totable()
        self.global_method_table.totable()
        print(" --- Llamadas a metodos --- ")
        self.global_method_call_table.totable()
        print(" --- Tabla de simbolos (Todos los simbolos) --- ")
        self.global_symbol_table.totable()

        if len(self.errors.GetErrores()) > 0:
            print(" --- ERRORES --- ")
            print(self.errors.GetErrores())



