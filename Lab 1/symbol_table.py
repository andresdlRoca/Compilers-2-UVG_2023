from prettytable import PrettyTable

class SymbolTable():
    def __init__(self) -> None:
        self.pretty_table = PrettyTable()
        self._symbols = []
        print('Iniciando nuevo ambito/scope')
    
    def add(self, type, id, size, isParameter):
        self._symbols.append({
            'Type': type,
            'ID': id,
            'Size': size,
            'IsParameter': isParameter
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
        self.pretty_table.field_names = ['Type', 'ID', 'Size','IsParameter']
        for i in self._symbols:
            self.pretty_table.add_row(list(i.values()))

        print(" -- Simbolos -- ")
        print(self.pretty_table)
        self.pretty_table.clear_rows()

class ParameterTable():
    def __init__(self) -> None:
        self.pretty_table = PrettyTable()
        self._symbols = []
        print(" -- Iniciando nuevo ambito/scope -- ")
    
    def add(self, type, id):
        self._symbols.append({
            'Type': type,
            'ID': id,
        })
    
    def lookup(self, variable):
        symbols_copy = self._symbols.copy()
        symbols_copy.reverse()
        for symbol in symbols_copy:
            if symbol['ID'] == variable:
                return symbol
        return 0

    def totable(self):
        self.pretty_table.field_names = ['Type', 'ID']
        for i in self._symbols:
            self.pretty_table.add_row(list(i.values()))

        print(" -- Parametros -- ")
        print(self.pretty_table)
        self.pretty_table.clear_rows()
    
    def clear(self):
        self.totable()
        self._symbols = []


class ClassTable():
    def __init__(self) -> None:
        self.pretty_table = PrettyTable()
        self._classes = []
        print(" -- Iniciando nuevo ambito/scope -- ")
    def add(self,type, id, inheritance):
        self._classes.append({
            'Type': type,
            'ID': id,
            'Inheritance': inheritance
        })
    def lookup(self, type):
        for _class in self._classes:
            if _class['Type'] == type:
                return _class
        return 0
    
    def totable(self):
        self.pretty_table.field_names = ['Type', 'ID', 'Inheritance']
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

    def add(self, type, id, parameters):
        self._methods.append({
            'Type': type,
            'ID': id,
            'Parameters': parameters,
        })
    
    def lookup(self, variable):
        for method in self._methods:
            if method['ID'] == variable:
                return method
        return 0
    
    def totable(self):
        self.pretty_table.field_names = ['Type', 'ID', 'Parameters']
        for i in self._methods:
            self.pretty_table.add_row(list(i.values()))

        print(" -- Metodos -- ")
        print(self.pretty_table)
        self.pretty_table.clear_rows()
    
    
class TypeTable():
    def __init__(self) -> None:
        self.PRIMITIVE = 'primitive'
        self.OBJECT = 'object'
        self.IO = 'io'

        self._types = []
        self.add('int', self.PRIMITIVE, 0);
        self.add('string', self.PRIMITIVE, '""')
        self.add('bool', self.PRIMITIVE, False)
        self.add('void', self.PRIMITIVE, None)
    
    def add(self, type, description, default_value):
        self._types.append({
            'Type': type,
            'Description': description,
            'Default': default_value
        })
    
    def lookup(self, type):
        types_copy = self._types.copy()
        types_copy.reverse()
        for type in types_copy:
            if type['Type'] == type:
                return type
        return 0

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