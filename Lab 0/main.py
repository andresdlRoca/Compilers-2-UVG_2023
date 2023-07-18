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

    def print_tokens(self):
        # Tokenize the input
        self.lexer.reset()
        token = self.lexer.nextToken()
        # Iterate over all the tokens
        while token.type != Token.EOF:
            print(token.type)
            print(f"Token type: {self.getType(token.type)}, Token text: {token.text}")
            token = self.lexer.nextToken()
    
    def getType(self, tokenType):
        # Match the YAPLLexer.tokens to the tokenType with ifs
        if tokenType == self.lexer.BOOL:
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
        else:
            return "ERROR"

compile = Compile("test.yapl")
compile.print_tokens()