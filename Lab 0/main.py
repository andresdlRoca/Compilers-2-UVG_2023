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
        self.lexer = YAPLLexer(input)
        stream = CommonTokenStream(self.lexer)
        parser = YAPLParser(stream)
        self.myError = None # TODO: Agregar un Error listener
        parser.removeErrorListeners()
        # parser.addErrorListener(self.myError)
        tree = parser.program()
        print(tree.toStringTree(recog=parser))

        # Scanner / Lexer
        # token = self.lexer.nextToken()
        # print(token)
        # # while token.type != self.lexer.EOF:
        # #     print(f'\n{self.getType(token.type)}: {token.text}')
        # #     token = self.lexer.nextToken()

    
    def getType(self, tokenType):
        # Match the YAPLLexer.tokens to the tokenType with ifs
        if tokenType == self.lexer.CLASS:
            return "CLASS"
        elif tokenType == self.lexer.INHERITS:
            return "INHERITS"
        elif tokenType == self.lexer.BOOL:
            return "BOOL"
        elif tokenType == self.lexer.INT:
            return "INT"
        elif tokenType == self.lexer.STRING:
            return "STRING"
        elif tokenType == self.lexer.IO:
            return "IO"
        elif tokenType == self.lexer.OBJECT:
            return "OBJECT"
        elif tokenType == self.lexer.SELF_TYPE:
            return "SELF_TYPE"
        elif tokenType == self.lexer.IF:
            return "IF"
        elif tokenType == self.lexer.THEN:
            return "THEN"
        elif tokenType == self.lexer.ELSE:
            return "ELSE"
        elif tokenType == self.lexer.FI:
            return "FI"
        elif tokenType == self.lexer.WHILE:
            return "WHILE"
        elif tokenType == self.lexer.LOOP:
            return "LOOP"
        elif tokenType == self.lexer.POOL:
            return "POOL"
        elif tokenType == self.lexer.LET:
            return "LET"
        elif tokenType == self.lexer.IN:
            return "IN"
        elif tokenType == self.lexer.CASE:
            return "CASE"
        elif tokenType == self.lexer.OF:
            return "OF"
        elif tokenType == self.lexer.ESAC:
            return "ESAC"
        elif tokenType == self.lexer.NEW:
            return "NEW"
        elif tokenType == self.lexer.ISVOID:
            return "ISVOID"
        elif tokenType == self.lexer.NOT:
            return "NOT"
        elif tokenType == self.lexer.ID:
            return "ID"
        elif tokenType == self.lexer.INT_CONST:
            return "INT_CONST"
        elif tokenType == self.lexer.STR_CONST:
            return "STR_CONST"
        elif tokenType == self.lexer.WS:
            return "WS"

compile = Compile("test.yapl")
