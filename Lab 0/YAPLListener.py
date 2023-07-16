# Generated from YAPL.g4 by ANTLR 4.13.0
from antlr4 import *
if "." in __name__:
    from .YAPLParser import YAPLParser
else:
    from YAPLParser import YAPLParser

# This class defines a complete listener for a parse tree produced by YAPLParser.
class YAPLListener(ParseTreeListener):

    # Enter a parse tree produced by YAPLParser#class.
    def enterClass(self, ctx:YAPLParser.ClassContext):
        pass

    # Exit a parse tree produced by YAPLParser#class.
    def exitClass(self, ctx:YAPLParser.ClassContext):
        pass


    # Enter a parse tree produced by YAPLParser#inherits.
    def enterInherits(self, ctx:YAPLParser.InheritsContext):
        pass

    # Exit a parse tree produced by YAPLParser#inherits.
    def exitInherits(self, ctx:YAPLParser.InheritsContext):
        pass


    # Enter a parse tree produced by YAPLParser#bool.
    def enterBool(self, ctx:YAPLParser.BoolContext):
        pass

    # Exit a parse tree produced by YAPLParser#bool.
    def exitBool(self, ctx:YAPLParser.BoolContext):
        pass


    # Enter a parse tree produced by YAPLParser#int.
    def enterInt(self, ctx:YAPLParser.IntContext):
        pass

    # Exit a parse tree produced by YAPLParser#int.
    def exitInt(self, ctx:YAPLParser.IntContext):
        pass


    # Enter a parse tree produced by YAPLParser#string.
    def enterString(self, ctx:YAPLParser.StringContext):
        pass

    # Exit a parse tree produced by YAPLParser#string.
    def exitString(self, ctx:YAPLParser.StringContext):
        pass


    # Enter a parse tree produced by YAPLParser#io.
    def enterIo(self, ctx:YAPLParser.IoContext):
        pass

    # Exit a parse tree produced by YAPLParser#io.
    def exitIo(self, ctx:YAPLParser.IoContext):
        pass


    # Enter a parse tree produced by YAPLParser#object.
    def enterObject(self, ctx:YAPLParser.ObjectContext):
        pass

    # Exit a parse tree produced by YAPLParser#object.
    def exitObject(self, ctx:YAPLParser.ObjectContext):
        pass


    # Enter a parse tree produced by YAPLParser#self_type.
    def enterSelf_type(self, ctx:YAPLParser.Self_typeContext):
        pass

    # Exit a parse tree produced by YAPLParser#self_type.
    def exitSelf_type(self, ctx:YAPLParser.Self_typeContext):
        pass


    # Enter a parse tree produced by YAPLParser#if.
    def enterIf(self, ctx:YAPLParser.IfContext):
        pass

    # Exit a parse tree produced by YAPLParser#if.
    def exitIf(self, ctx:YAPLParser.IfContext):
        pass


    # Enter a parse tree produced by YAPLParser#then.
    def enterThen(self, ctx:YAPLParser.ThenContext):
        pass

    # Exit a parse tree produced by YAPLParser#then.
    def exitThen(self, ctx:YAPLParser.ThenContext):
        pass


    # Enter a parse tree produced by YAPLParser#else.
    def enterElse(self, ctx:YAPLParser.ElseContext):
        pass

    # Exit a parse tree produced by YAPLParser#else.
    def exitElse(self, ctx:YAPLParser.ElseContext):
        pass


    # Enter a parse tree produced by YAPLParser#fi.
    def enterFi(self, ctx:YAPLParser.FiContext):
        pass

    # Exit a parse tree produced by YAPLParser#fi.
    def exitFi(self, ctx:YAPLParser.FiContext):
        pass


    # Enter a parse tree produced by YAPLParser#while.
    def enterWhile(self, ctx:YAPLParser.WhileContext):
        pass

    # Exit a parse tree produced by YAPLParser#while.
    def exitWhile(self, ctx:YAPLParser.WhileContext):
        pass


    # Enter a parse tree produced by YAPLParser#loop.
    def enterLoop(self, ctx:YAPLParser.LoopContext):
        pass

    # Exit a parse tree produced by YAPLParser#loop.
    def exitLoop(self, ctx:YAPLParser.LoopContext):
        pass


    # Enter a parse tree produced by YAPLParser#pool.
    def enterPool(self, ctx:YAPLParser.PoolContext):
        pass

    # Exit a parse tree produced by YAPLParser#pool.
    def exitPool(self, ctx:YAPLParser.PoolContext):
        pass


    # Enter a parse tree produced by YAPLParser#let.
    def enterLet(self, ctx:YAPLParser.LetContext):
        pass

    # Exit a parse tree produced by YAPLParser#let.
    def exitLet(self, ctx:YAPLParser.LetContext):
        pass


    # Enter a parse tree produced by YAPLParser#in.
    def enterIn(self, ctx:YAPLParser.InContext):
        pass

    # Exit a parse tree produced by YAPLParser#in.
    def exitIn(self, ctx:YAPLParser.InContext):
        pass


    # Enter a parse tree produced by YAPLParser#case.
    def enterCase(self, ctx:YAPLParser.CaseContext):
        pass

    # Exit a parse tree produced by YAPLParser#case.
    def exitCase(self, ctx:YAPLParser.CaseContext):
        pass


    # Enter a parse tree produced by YAPLParser#of.
    def enterOf(self, ctx:YAPLParser.OfContext):
        pass

    # Exit a parse tree produced by YAPLParser#of.
    def exitOf(self, ctx:YAPLParser.OfContext):
        pass


    # Enter a parse tree produced by YAPLParser#esac.
    def enterEsac(self, ctx:YAPLParser.EsacContext):
        pass

    # Exit a parse tree produced by YAPLParser#esac.
    def exitEsac(self, ctx:YAPLParser.EsacContext):
        pass


    # Enter a parse tree produced by YAPLParser#new.
    def enterNew(self, ctx:YAPLParser.NewContext):
        pass

    # Exit a parse tree produced by YAPLParser#new.
    def exitNew(self, ctx:YAPLParser.NewContext):
        pass


    # Enter a parse tree produced by YAPLParser#isvoid.
    def enterIsvoid(self, ctx:YAPLParser.IsvoidContext):
        pass

    # Exit a parse tree produced by YAPLParser#isvoid.
    def exitIsvoid(self, ctx:YAPLParser.IsvoidContext):
        pass


    # Enter a parse tree produced by YAPLParser#not.
    def enterNot(self, ctx:YAPLParser.NotContext):
        pass

    # Exit a parse tree produced by YAPLParser#not.
    def exitNot(self, ctx:YAPLParser.NotContext):
        pass


    # Enter a parse tree produced by YAPLParser#type.
    def enterType(self, ctx:YAPLParser.TypeContext):
        pass

    # Exit a parse tree produced by YAPLParser#type.
    def exitType(self, ctx:YAPLParser.TypeContext):
        pass


    # Enter a parse tree produced by YAPLParser#binary_op.
    def enterBinary_op(self, ctx:YAPLParser.Binary_opContext):
        pass

    # Exit a parse tree produced by YAPLParser#binary_op.
    def exitBinary_op(self, ctx:YAPLParser.Binary_opContext):
        pass


    # Enter a parse tree produced by YAPLParser#unary_op.
    def enterUnary_op(self, ctx:YAPLParser.Unary_opContext):
        pass

    # Exit a parse tree produced by YAPLParser#unary_op.
    def exitUnary_op(self, ctx:YAPLParser.Unary_opContext):
        pass


    # Enter a parse tree produced by YAPLParser#assign.
    def enterAssign(self, ctx:YAPLParser.AssignContext):
        pass

    # Exit a parse tree produced by YAPLParser#assign.
    def exitAssign(self, ctx:YAPLParser.AssignContext):
        pass


    # Enter a parse tree produced by YAPLParser#arrow.
    def enterArrow(self, ctx:YAPLParser.ArrowContext):
        pass

    # Exit a parse tree produced by YAPLParser#arrow.
    def exitArrow(self, ctx:YAPLParser.ArrowContext):
        pass


    # Enter a parse tree produced by YAPLParser#semi.
    def enterSemi(self, ctx:YAPLParser.SemiContext):
        pass

    # Exit a parse tree produced by YAPLParser#semi.
    def exitSemi(self, ctx:YAPLParser.SemiContext):
        pass


    # Enter a parse tree produced by YAPLParser#colon.
    def enterColon(self, ctx:YAPLParser.ColonContext):
        pass

    # Exit a parse tree produced by YAPLParser#colon.
    def exitColon(self, ctx:YAPLParser.ColonContext):
        pass


    # Enter a parse tree produced by YAPLParser#comma.
    def enterComma(self, ctx:YAPLParser.CommaContext):
        pass

    # Exit a parse tree produced by YAPLParser#comma.
    def exitComma(self, ctx:YAPLParser.CommaContext):
        pass


    # Enter a parse tree produced by YAPLParser#dot.
    def enterDot(self, ctx:YAPLParser.DotContext):
        pass

    # Exit a parse tree produced by YAPLParser#dot.
    def exitDot(self, ctx:YAPLParser.DotContext):
        pass


    # Enter a parse tree produced by YAPLParser#lparen.
    def enterLparen(self, ctx:YAPLParser.LparenContext):
        pass

    # Exit a parse tree produced by YAPLParser#lparen.
    def exitLparen(self, ctx:YAPLParser.LparenContext):
        pass


    # Enter a parse tree produced by YAPLParser#rparen.
    def enterRparen(self, ctx:YAPLParser.RparenContext):
        pass

    # Exit a parse tree produced by YAPLParser#rparen.
    def exitRparen(self, ctx:YAPLParser.RparenContext):
        pass


    # Enter a parse tree produced by YAPLParser#lbrace.
    def enterLbrace(self, ctx:YAPLParser.LbraceContext):
        pass

    # Exit a parse tree produced by YAPLParser#lbrace.
    def exitLbrace(self, ctx:YAPLParser.LbraceContext):
        pass


    # Enter a parse tree produced by YAPLParser#rbrace.
    def enterRbrace(self, ctx:YAPLParser.RbraceContext):
        pass

    # Exit a parse tree produced by YAPLParser#rbrace.
    def exitRbrace(self, ctx:YAPLParser.RbraceContext):
        pass


    # Enter a parse tree produced by YAPLParser#program.
    def enterProgram(self, ctx:YAPLParser.ProgramContext):
        pass

    # Exit a parse tree produced by YAPLParser#program.
    def exitProgram(self, ctx:YAPLParser.ProgramContext):
        pass


    # Enter a parse tree produced by YAPLParser#class_definition.
    def enterClass_definition(self, ctx:YAPLParser.Class_definitionContext):
        pass

    # Exit a parse tree produced by YAPLParser#class_definition.
    def exitClass_definition(self, ctx:YAPLParser.Class_definitionContext):
        pass


    # Enter a parse tree produced by YAPLParser#feature_list.
    def enterFeature_list(self, ctx:YAPLParser.Feature_listContext):
        pass

    # Exit a parse tree produced by YAPLParser#feature_list.
    def exitFeature_list(self, ctx:YAPLParser.Feature_listContext):
        pass


    # Enter a parse tree produced by YAPLParser#feature.
    def enterFeature(self, ctx:YAPLParser.FeatureContext):
        pass

    # Exit a parse tree produced by YAPLParser#feature.
    def exitFeature(self, ctx:YAPLParser.FeatureContext):
        pass


    # Enter a parse tree produced by YAPLParser#attribute_definition.
    def enterAttribute_definition(self, ctx:YAPLParser.Attribute_definitionContext):
        pass

    # Exit a parse tree produced by YAPLParser#attribute_definition.
    def exitAttribute_definition(self, ctx:YAPLParser.Attribute_definitionContext):
        pass


    # Enter a parse tree produced by YAPLParser#method_definition.
    def enterMethod_definition(self, ctx:YAPLParser.Method_definitionContext):
        pass

    # Exit a parse tree produced by YAPLParser#method_definition.
    def exitMethod_definition(self, ctx:YAPLParser.Method_definitionContext):
        pass


    # Enter a parse tree produced by YAPLParser#block.
    def enterBlock(self, ctx:YAPLParser.BlockContext):
        pass

    # Exit a parse tree produced by YAPLParser#block.
    def exitBlock(self, ctx:YAPLParser.BlockContext):
        pass


    # Enter a parse tree produced by YAPLParser#statement.
    def enterStatement(self, ctx:YAPLParser.StatementContext):
        pass

    # Exit a parse tree produced by YAPLParser#statement.
    def exitStatement(self, ctx:YAPLParser.StatementContext):
        pass


    # Enter a parse tree produced by YAPLParser#formal.
    def enterFormal(self, ctx:YAPLParser.FormalContext):
        pass

    # Exit a parse tree produced by YAPLParser#formal.
    def exitFormal(self, ctx:YAPLParser.FormalContext):
        pass


    # Enter a parse tree produced by YAPLParser#assignment_statement.
    def enterAssignment_statement(self, ctx:YAPLParser.Assignment_statementContext):
        pass

    # Exit a parse tree produced by YAPLParser#assignment_statement.
    def exitAssignment_statement(self, ctx:YAPLParser.Assignment_statementContext):
        pass


    # Enter a parse tree produced by YAPLParser#if_statement.
    def enterIf_statement(self, ctx:YAPLParser.If_statementContext):
        pass

    # Exit a parse tree produced by YAPLParser#if_statement.
    def exitIf_statement(self, ctx:YAPLParser.If_statementContext):
        pass


    # Enter a parse tree produced by YAPLParser#while_statement.
    def enterWhile_statement(self, ctx:YAPLParser.While_statementContext):
        pass

    # Exit a parse tree produced by YAPLParser#while_statement.
    def exitWhile_statement(self, ctx:YAPLParser.While_statementContext):
        pass


    # Enter a parse tree produced by YAPLParser#parameter_list.
    def enterParameter_list(self, ctx:YAPLParser.Parameter_listContext):
        pass

    # Exit a parse tree produced by YAPLParser#parameter_list.
    def exitParameter_list(self, ctx:YAPLParser.Parameter_listContext):
        pass


    # Enter a parse tree produced by YAPLParser#let_declaration.
    def enterLet_declaration(self, ctx:YAPLParser.Let_declarationContext):
        pass

    # Exit a parse tree produced by YAPLParser#let_declaration.
    def exitLet_declaration(self, ctx:YAPLParser.Let_declarationContext):
        pass


    # Enter a parse tree produced by YAPLParser#let_binding.
    def enterLet_binding(self, ctx:YAPLParser.Let_bindingContext):
        pass

    # Exit a parse tree produced by YAPLParser#let_binding.
    def exitLet_binding(self, ctx:YAPLParser.Let_bindingContext):
        pass


    # Enter a parse tree produced by YAPLParser#expr.
    def enterExpr(self, ctx:YAPLParser.ExprContext):
        pass

    # Exit a parse tree produced by YAPLParser#expr.
    def exitExpr(self, ctx:YAPLParser.ExprContext):
        pass



del YAPLParser