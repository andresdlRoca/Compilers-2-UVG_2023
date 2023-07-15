from prettytable.prettytable import NONE
from antlr4 import *
from antlr4.tree.Tree import TerminalNode
from antlr4.error.ErrorListener import ErrorListener
from YAPLLexer import YAPLLexer
from YAPLListener import YAPLListener
from YAPLParser import YAPLParser
from itertools import groupby

class Compile():
    def __init__(self, url):
        self.printer = None

        input = FileStream(url)
        lexer = YAPLLexer(input)
        stream = CommonTokenStream(lexer)
        parser = YAPLParser(stream)
        self.myError = None # TODO: Agregar un Error listener
        parser.removeErrorListeners()
        # parser.addErrorListener(self.myError)
        tree = parser.program()
        print(tree.toStringTree(recog=parser))


compile = Compile("test.yapl")
