# Generated from YAPL.g4 by ANTLR 4.13.0
from antlr4 import *
if "." in __name__:
    from .YAPLParser import YAPLParser
else:
    from YAPLParser import YAPLParser

# This class defines a complete listener for a parse tree produced by YAPLParser.
class YAPLListener(ParseTreeListener):

    # Enter a parse tree produced by YAPLParser#program.
    def enterProgram(self, ctx:YAPLParser.ProgramContext):
        pass

    # Exit a parse tree produced by YAPLParser#program.
    def exitProgram(self, ctx:YAPLParser.ProgramContext):
        pass


    # Enter a parse tree produced by YAPLParser#class_list.
    def enterClass_list(self, ctx:YAPLParser.Class_listContext):
        pass

    # Exit a parse tree produced by YAPLParser#class_list.
    def exitClass_list(self, ctx:YAPLParser.Class_listContext):
        pass


    # Enter a parse tree produced by YAPLParser#class_item.
    def enterClass_item(self, ctx:YAPLParser.Class_itemContext):
        pass

    # Exit a parse tree produced by YAPLParser#class_item.
    def exitClass_item(self, ctx:YAPLParser.Class_itemContext):
        pass


    # Enter a parse tree produced by YAPLParser#feature_list.
    def enterFeature_list(self, ctx:YAPLParser.Feature_listContext):
        pass

    # Exit a parse tree produced by YAPLParser#feature_list.
    def exitFeature_list(self, ctx:YAPLParser.Feature_listContext):
        pass


    # Enter a parse tree produced by YAPLParser#feature_item.
    def enterFeature_item(self, ctx:YAPLParser.Feature_itemContext):
        pass

    # Exit a parse tree produced by YAPLParser#feature_item.
    def exitFeature_item(self, ctx:YAPLParser.Feature_itemContext):
        pass


    # Enter a parse tree produced by YAPLParser#attribute.
    def enterAttribute(self, ctx:YAPLParser.AttributeContext):
        pass

    # Exit a parse tree produced by YAPLParser#attribute.
    def exitAttribute(self, ctx:YAPLParser.AttributeContext):
        pass


    # Enter a parse tree produced by YAPLParser#method.
    def enterMethod(self, ctx:YAPLParser.MethodContext):
        pass

    # Exit a parse tree produced by YAPLParser#method.
    def exitMethod(self, ctx:YAPLParser.MethodContext):
        pass


    # Enter a parse tree produced by YAPLParser#param_list.
    def enterParam_list(self, ctx:YAPLParser.Param_listContext):
        pass

    # Exit a parse tree produced by YAPLParser#param_list.
    def exitParam_list(self, ctx:YAPLParser.Param_listContext):
        pass


    # Enter a parse tree produced by YAPLParser#formal_param.
    def enterFormal_param(self, ctx:YAPLParser.Formal_paramContext):
        pass

    # Exit a parse tree produced by YAPLParser#formal_param.
    def exitFormal_param(self, ctx:YAPLParser.Formal_paramContext):
        pass


    # Enter a parse tree produced by YAPLParser#expr.
    def enterExpr(self, ctx:YAPLParser.ExprContext):
        pass

    # Exit a parse tree produced by YAPLParser#expr.
    def exitExpr(self, ctx:YAPLParser.ExprContext):
        pass


    # Enter a parse tree produced by YAPLParser#if_expr.
    def enterIf_expr(self, ctx:YAPLParser.If_exprContext):
        pass

    # Exit a parse tree produced by YAPLParser#if_expr.
    def exitIf_expr(self, ctx:YAPLParser.If_exprContext):
        pass


    # Enter a parse tree produced by YAPLParser#if_expr_tail.
    def enterIf_expr_tail(self, ctx:YAPLParser.If_expr_tailContext):
        pass

    # Exit a parse tree produced by YAPLParser#if_expr_tail.
    def exitIf_expr_tail(self, ctx:YAPLParser.If_expr_tailContext):
        pass


    # Enter a parse tree produced by YAPLParser#while_expr.
    def enterWhile_expr(self, ctx:YAPLParser.While_exprContext):
        pass

    # Exit a parse tree produced by YAPLParser#while_expr.
    def exitWhile_expr(self, ctx:YAPLParser.While_exprContext):
        pass


    # Enter a parse tree produced by YAPLParser#block_expr.
    def enterBlock_expr(self, ctx:YAPLParser.Block_exprContext):
        pass

    # Exit a parse tree produced by YAPLParser#block_expr.
    def exitBlock_expr(self, ctx:YAPLParser.Block_exprContext):
        pass


    # Enter a parse tree produced by YAPLParser#block_expr_tail.
    def enterBlock_expr_tail(self, ctx:YAPLParser.Block_expr_tailContext):
        pass

    # Exit a parse tree produced by YAPLParser#block_expr_tail.
    def exitBlock_expr_tail(self, ctx:YAPLParser.Block_expr_tailContext):
        pass


    # Enter a parse tree produced by YAPLParser#let_expr.
    def enterLet_expr(self, ctx:YAPLParser.Let_exprContext):
        pass

    # Exit a parse tree produced by YAPLParser#let_expr.
    def exitLet_expr(self, ctx:YAPLParser.Let_exprContext):
        pass


    # Enter a parse tree produced by YAPLParser#let_expr_tail.
    def enterLet_expr_tail(self, ctx:YAPLParser.Let_expr_tailContext):
        pass

    # Exit a parse tree produced by YAPLParser#let_expr_tail.
    def exitLet_expr_tail(self, ctx:YAPLParser.Let_expr_tailContext):
        pass


    # Enter a parse tree produced by YAPLParser#case_expr.
    def enterCase_expr(self, ctx:YAPLParser.Case_exprContext):
        pass

    # Exit a parse tree produced by YAPLParser#case_expr.
    def exitCase_expr(self, ctx:YAPLParser.Case_exprContext):
        pass


    # Enter a parse tree produced by YAPLParser#case_expr_tail.
    def enterCase_expr_tail(self, ctx:YAPLParser.Case_expr_tailContext):
        pass

    # Exit a parse tree produced by YAPLParser#case_expr_tail.
    def exitCase_expr_tail(self, ctx:YAPLParser.Case_expr_tailContext):
        pass


    # Enter a parse tree produced by YAPLParser#new_expr.
    def enterNew_expr(self, ctx:YAPLParser.New_exprContext):
        pass

    # Exit a parse tree produced by YAPLParser#new_expr.
    def exitNew_expr(self, ctx:YAPLParser.New_exprContext):
        pass


    # Enter a parse tree produced by YAPLParser#new_expr_tail.
    def enterNew_expr_tail(self, ctx:YAPLParser.New_expr_tailContext):
        pass

    # Exit a parse tree produced by YAPLParser#new_expr_tail.
    def exitNew_expr_tail(self, ctx:YAPLParser.New_expr_tailContext):
        pass


    # Enter a parse tree produced by YAPLParser#isvoid_expr.
    def enterIsvoid_expr(self, ctx:YAPLParser.Isvoid_exprContext):
        pass

    # Exit a parse tree produced by YAPLParser#isvoid_expr.
    def exitIsvoid_expr(self, ctx:YAPLParser.Isvoid_exprContext):
        pass


    # Enter a parse tree produced by YAPLParser#isvoid_expr_tail.
    def enterIsvoid_expr_tail(self, ctx:YAPLParser.Isvoid_expr_tailContext):
        pass

    # Exit a parse tree produced by YAPLParser#isvoid_expr_tail.
    def exitIsvoid_expr_tail(self, ctx:YAPLParser.Isvoid_expr_tailContext):
        pass


    # Enter a parse tree produced by YAPLParser#binary_expr.
    def enterBinary_expr(self, ctx:YAPLParser.Binary_exprContext):
        pass

    # Exit a parse tree produced by YAPLParser#binary_expr.
    def exitBinary_expr(self, ctx:YAPLParser.Binary_exprContext):
        pass


    # Enter a parse tree produced by YAPLParser#unary_expr.
    def enterUnary_expr(self, ctx:YAPLParser.Unary_exprContext):
        pass

    # Exit a parse tree produced by YAPLParser#unary_expr.
    def exitUnary_expr(self, ctx:YAPLParser.Unary_exprContext):
        pass


    # Enter a parse tree produced by YAPLParser#primary_expr.
    def enterPrimary_expr(self, ctx:YAPLParser.Primary_exprContext):
        pass

    # Exit a parse tree produced by YAPLParser#primary_expr.
    def exitPrimary_expr(self, ctx:YAPLParser.Primary_exprContext):
        pass


    # Enter a parse tree produced by YAPLParser#arg_list.
    def enterArg_list(self, ctx:YAPLParser.Arg_listContext):
        pass

    # Exit a parse tree produced by YAPLParser#arg_list.
    def exitArg_list(self, ctx:YAPLParser.Arg_listContext):
        pass


    # Enter a parse tree produced by YAPLParser#binary_op.
    def enterBinary_op(self, ctx:YAPLParser.Binary_opContext):
        pass

    # Exit a parse tree produced by YAPLParser#binary_op.
    def exitBinary_op(self, ctx:YAPLParser.Binary_opContext):
        pass



del YAPLParser