from prettytable import PrettyTable

class SymbolTable():
    def __init__(self) -> None:
        self.pretty_table = PrettyTable()
        self._symbols = []
        print('Iniciando nuevo ambito/scope')
    
    def add(self, type, id, description, isParameter):
        self._symbols.append({
            'Type': type,
            'ID': id,
            'Description': description,
            'IsParameter': isParameter
        })
    
    def lookup(self, id):
        symbols_copy = self._symbols.copy()
        symbols_copy.reverse()
        for symbol in symbols_copy:
            if symbol['id'] == id:
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
            if symbol['id'] == id:
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

# class StructTable():

#     def __init__(self) -> None:
#         self.pretty_table = PrettyTable()
#         self._symbols = []

#     def add(self, parent, type, id, description):
#         self._symbols.append({
#             'Parent': parent,
#             'Type': type,
#             'ID': id,
#             'Description': description
#         })
    
#     def lookup(self, variable):
#         symbols_copy = self._symbols.copy()
#         symbols_copy.reverse()
#         for symbol in symbols_copy:
#             if symbol['id'] == id:
#                 return symbol
#         return 0
    
#     def totable(self):
#         self.pretty_table.field_names = ['Parent', 'Type', 'ID', 'Description']
#         for i in self._symbols:
#             self.pretty_table.add_row(list(i.values()))

#         print(" -- Structs -- ")
#         print(self.pretty_table)
#         self.pretty_table.clear_rows()
    
#     def extract(self, parent, scope, type_table):
#         for i in scope._symbols:
#             type = type_table.lookup(i['Type'])
#             self.add(parent, type['Type'], i['ID'], type['Description'])
    
#     def getchild(self, type, name):
#         symbols_copy = self._symbols.copy()
#         symbols_copy.reverse()
#         for symbol in symbols_copy:
#             if symbol['Parent'] == type and symbol['ID'] == name:
#                 return symbol
#         return 0

class MethodTable():

    def __init__(self) -> None:
        self.pretty_table = PrettyTable()
        self._methods = []
        print(" -- Iniciando nuevo ambito/scope -- ")

    def add(self, type, id, parameters, returnvariable):
        self._methods.append({
            'Type': type,
            'ID': id,
            'Parameters': parameters,
            'Return': returnvariable
        })
    
    def lookup(self, variable):
        for method in self._methods:
            if method['id'] == id:
                return method
        return 0
    
    def totable(self):
        self.pretty_table.field_names = ['Type', 'ID', 'Parameters', 'Return']
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
        # TODO: Agregar errores semanticos
    
    def add(self, line, col, msg):
        self._errors.append({
            'Line': line,
            'Column': col,
            'Description': msg
        })

    def ToString(self):
        for error in self.errores:
            print(' => Line ' + str(error['Line']) + ':' + str(error['Col']) + ' ' + error['Msg'])

    def GetErrores(self):
        errors = []
        for error in self.errores:
            errors.append(' => Line ' + str(error['Line']) + ':' + str(error['Col']) + ' ' + error['Msg'])
        return errors