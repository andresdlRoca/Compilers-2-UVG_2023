from prettytable import PrettyTable

class SymbolTable():
    def __init__(self) -> None:
        self.pretty_table = PrettyTable()
        self._symbols = []
        print('Iniciando nuevo ambito/scope')
    
    def add(self, type, id, scope, value, position, address, isParameter):
        self._symbols.append({
            'Type': type,
            'ID': id,
            'Scope': scope,
            'Value': value,
            'Position': position,
            'Address': address,
            'IsParameter': isParameter,
        })
    
    def lookup(self, id):
        symbols_copy = self._symbols.copy()
        symbols_copy.reverse()
        for symbol in symbols_copy:
            if symbol['ID'] == id:
                return symbol
        return 0

    def getsize(self):
        return sum(symbol['size'] for symbol in self._symbols)
    
    def totable(self):
        self.pretty_table.field_names = ['Type', 'ID', 'Scope', 'Value','Position', 'Address', 'IsParameter']
        for i in self._symbols:
            self.pretty_table.add_row(list(i.values()))

        print(" -- Simbolos -- ")
        print(self.pretty_table)
        self.pretty_table.clear_rows()

class ClassTable():
    def __init__(self) -> None:
        self.pretty_table = PrettyTable()
        self._classes = []
        print(" -- Iniciando nuevo ambito/scope -- ")
    def add(self,type, id, scope, position, inheritance, address):
        self._classes.append({
            'Type': type,
            'ID': id,
            'Scope': scope,
            'Inheritance': inheritance,
            'Position': position,
            'Memory Address': address
        })
    def lookup(self, type):
        for _class in self._classes:
            if _class['Type'] == type:
                return _class
        return 0
    
    def totable(self):
        self.pretty_table.field_names = ['Type', 'ID', 'Scope', 'Inheritance', 'Position', 'Memory Address']
        for i in self._classes:
            self.pretty_table.add_row(list(i.values()))

        print(" -- Clases -- ")
        print(self.pretty_table)
        self.pretty_table.clear_rows()


class MethodTable():

    def __init__(self) -> None:
        self.pretty_table = PrettyTable()
        self._methods = []
        print(" -- Iniciando nuevo ambito/scope -- ")

    def add(self, type, id, parameters, scope, address, position):
        self._methods.append({
            'Type': type,
            'ID': id,
            'Parameters': parameters,
            'Scope': scope,
            'Address': address,
            'Position': position
        })
    
    def lookup(self, variable):
        for method in self._methods:
            if method['ID'] == variable:
                return method
        return 0
    
    def totable(self):
        self.pretty_table.field_names = ['Type', 'ID', 'Parameters', 'Scope', 'Address', 'Position']
        for i in self._methods:
            self.pretty_table.add_row(list(i.values()))

        print(" -- Metodos -- ")
        print(self.pretty_table)
        self.pretty_table.clear_rows()

class SemanticError():
    def __init__(self) -> None:
        self._errors = []
        self.IDENTIFICADOR_DECLARADO_MULTIPLES_VECES = 'El identificador ya fue declarado'
        self.PARAMETROS_INCORRECTOS_METODO = 'Los parametros del metodo no coinciden'
        self.TIPO_INCORRECTO = 'El tipo de dato del parametro no coincide'
        self.EQ_OPS = 'El tipo de datos de operandos no es el mismo para los operadores de igualacion'
        self.ARITH_OP = 'El tipo de dato de operando debe ser INT para operadores aritméticos.'
        self.REL_OP = 'El tipo de dato de operando debe ser INT para operadores de relación.'
        self.COND_OP = 'El tipo de dato en operación condicional debe ser boolean.'
        self.IF_BOOLEAN = 'El tipo de dato dentro de condición de IF debe ser boolean.'
        self.WHILE_BOOLEAN = 'El tipo de dato dentro de condición de WHILE debe ser boolean.'
        self.ASIGNACION = 'La asignación de dos valores deben ser del mismo tipo.'
        self.RETURN_TYPE = 'El valor de retorno debe de ser del mismo tipo con que fue declarado el método.'
        self.METHOD_NOT_DECLARED = 'El método no existe o no hay definición del método previamente a ser invocado.'

    
    def add(self, line, col, msg):
        self._errors.append({
            'Line': line,
            'Column': col,
            'Description': msg
        })

    def ToString(self):
        for error in self._errors:
            print(' => Line ' + str(error['Line']) + ':' + str(error['Column']) + ' ' + error['Description'])

    def GetErrores(self):
        errors = []
        for error in self._errors:
            errors.append(' => Line ' + str(error['Line']) + ':' + str(error['Column']) + ' ' + error['Description'])
        return errors