// Generated from c:\Users\Andre\OneDrive\Universidad\Cuarto año\Segundo Semestre\Compiladores\Laboratorios\Proyecto 1\YAPL.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class YAPLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, ID=28, INT_CONST=29, STR_CONST=30, WS=31, 
		BOOL=32, INT=33, STRING=34, IO=35, OBJECT=36, SELF_TYPE=37, CASE=38, OF=39, 
		ESAC=40, NEW=41, ISVOID=42, NOT=43, ASSIGN=44, ARROW=45, SEMI=46, COLON=47, 
		COMMA=48, DOT=49, LPAREN=50, RPAREN=51, LBRACE=52, RBRACE=53, LINE_COMMENT=54, 
		COMMENT=55, ErrorChar=56;
	public static final int
		RULE_class = 0, RULE_inherits = 1, RULE_type = 2, RULE_binary_op = 3, 
		RULE_unary_op = 4, RULE_program = 5, RULE_clas_list = 6, RULE_feature_list = 7, 
		RULE_feature = 8, RULE_attribute_definition = 9, RULE_var_assign = 10, 
		RULE_method_definition = 11, RULE_let_declaration = 12, RULE_let_binding = 13, 
		RULE_if_statement = 14, RULE_while_statement = 15, RULE_block = 16, RULE_simple_method_definition = 17, 
		RULE_formal = 18, RULE_parameter_list = 19, RULE_expr = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"class", "inherits", "type", "binary_op", "unary_op", "program", "clas_list", 
			"feature_list", "feature", "attribute_definition", "var_assign", "method_definition", 
			"let_declaration", "let_binding", "if_statement", "while_statement", 
			"block", "simple_method_definition", "formal", "parameter_list", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'inherits'", "'+'", "'-'", "'*'", "'/'", "'<'", "'<='", 
			"'='", "'@'", "'~'", "'let'", "'in'", "'if'", "'then'", "'else'", "'fi'", 
			"'while'", "'loop'", "'pool'", "'self'", "'true'", "'false'", "'void'", 
			"'>'", "'%'", "'^'", null, null, null, null, "'Bool'", "'Int'", "'String'", 
			"'IO'", "'Object'", "'SELF_TYPE'", "'case'", "'of'", "'esac'", "'new'", 
			"'isvoid'", "'not'", "'<-'", "'=>'", "';'", "':'", "','", "'.'", "'('", 
			"')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "ID", "INT_CONST", "STR_CONST", "WS", "BOOL", 
			"INT", "STRING", "IO", "OBJECT", "SELF_TYPE", "CASE", "OF", "ESAC", "NEW", 
			"ISVOID", "NOT", "ASSIGN", "ARROW", "SEMI", "COLON", "COMMA", "DOT", 
			"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LINE_COMMENT", "COMMENT", "ErrorChar"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "YAPL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public YAPLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ClassContext extends ParserRuleContext {
		public ClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class; }
	}

	public final ClassContext class() throws RecognitionException {
		ClassContext _localctx = new ClassContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_class);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InheritsContext extends ParserRuleContext {
		public InheritsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inherits; }
	}

	public final InheritsContext inherits() throws RecognitionException {
		InheritsContext _localctx = new InheritsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_inherits);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(YAPLParser.ID, 0); }
		public TerminalNode BOOL() { return getToken(YAPLParser.BOOL, 0); }
		public TerminalNode INT() { return getToken(YAPLParser.INT, 0); }
		public TerminalNode STRING() { return getToken(YAPLParser.STRING, 0); }
		public TerminalNode IO() { return getToken(YAPLParser.IO, 0); }
		public TerminalNode OBJECT() { return getToken(YAPLParser.OBJECT, 0); }
		public TerminalNode SELF_TYPE() { return getToken(YAPLParser.SELF_TYPE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << BOOL) | (1L << INT) | (1L << STRING) | (1L << IO) | (1L << OBJECT) | (1L << SELF_TYPE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Binary_opContext extends ParserRuleContext {
		public Binary_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_op; }
	}

	public final Binary_opContext binary_op() throws RecognitionException {
		Binary_opContext _localctx = new Binary_opContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_binary_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_opContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(YAPLParser.NOT, 0); }
		public Unary_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_op; }
	}

	public final Unary_opContext unary_op() throws RecognitionException {
		Unary_opContext _localctx = new Unary_opContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_unary_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_la = _input.LA(1);
			if ( !(_la==T__10 || _la==NOT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<Clas_listContext> clas_list() {
			return getRuleContexts(Clas_listContext.class);
		}
		public Clas_listContext clas_list(int i) {
			return getRuleContext(Clas_listContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(52);
				clas_list();
				}
				}
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Clas_listContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode LBRACE() { return getToken(YAPLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(YAPLParser.RBRACE, 0); }
		public TerminalNode SEMI() { return getToken(YAPLParser.SEMI, 0); }
		public Feature_listContext feature_list() {
			return getRuleContext(Feature_listContext.class,0);
		}
		public Clas_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clas_list; }
	}

	public final Clas_listContext clas_list() throws RecognitionException {
		Clas_listContext _localctx = new Clas_listContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_clas_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(T__0);
			setState(58);
			type();
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(59);
				match(T__1);
				setState(60);
				type();
				}
			}

			setState(63);
			match(LBRACE);
			{
			setState(64);
			feature_list();
			}
			setState(65);
			match(RBRACE);
			setState(66);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Feature_listContext extends ParserRuleContext {
		public List<FeatureContext> feature() {
			return getRuleContexts(FeatureContext.class);
		}
		public FeatureContext feature(int i) {
			return getRuleContext(FeatureContext.class,i);
		}
		public List<FormalContext> formal() {
			return getRuleContexts(FormalContext.class);
		}
		public FormalContext formal(int i) {
			return getRuleContext(FormalContext.class,i);
		}
		public Feature_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feature_list; }
	}

	public final Feature_listContext feature_list() throws RecognitionException {
		Feature_listContext _localctx = new Feature_listContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_feature_list);
		int _la;
		try {
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(68);
					feature();
					}
					}
					setState(73);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(74);
					formal();
					}
					}
					setState(79);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FeatureContext extends ParserRuleContext {
		public Attribute_definitionContext attribute_definition() {
			return getRuleContext(Attribute_definitionContext.class,0);
		}
		public Method_definitionContext method_definition() {
			return getRuleContext(Method_definitionContext.class,0);
		}
		public Simple_method_definitionContext simple_method_definition() {
			return getRuleContext(Simple_method_definitionContext.class,0);
		}
		public FeatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feature; }
	}

	public final FeatureContext feature() throws RecognitionException {
		FeatureContext _localctx = new FeatureContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_feature);
		try {
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				attribute_definition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				method_definition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				simple_method_definition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attribute_definitionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(YAPLParser.ID, 0); }
		public TerminalNode COLON() { return getToken(YAPLParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(YAPLParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(YAPLParser.SEMI, i);
		}
		public TerminalNode ASSIGN() { return getToken(YAPLParser.ASSIGN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(YAPLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(YAPLParser.RPAREN, 0); }
		public Attribute_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_definition; }
	}

	public final Attribute_definitionContext attribute_definition() throws RecognitionException {
		Attribute_definitionContext _localctx = new Attribute_definitionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_attribute_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(ID);
			setState(88);
			match(COLON);
			setState(89);
			type();
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(90);
				match(ASSIGN);
				setState(91);
				expr(0);
				}
			}

			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(94);
				match(LPAREN);
				setState(95);
				expr(0);
				setState(96);
				match(SEMI);
				setState(97);
				match(RPAREN);
				}
			}

			setState(101);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_assignContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(YAPLParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(YAPLParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Var_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_assign; }
	}

	public final Var_assignContext var_assign() throws RecognitionException {
		Var_assignContext _localctx = new Var_assignContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_var_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(ID);
			setState(104);
			match(ASSIGN);
			setState(105);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_definitionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(YAPLParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(YAPLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(YAPLParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(YAPLParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(YAPLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(YAPLParser.RBRACE, 0); }
		public List<TerminalNode> SEMI() { return getTokens(YAPLParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(YAPLParser.SEMI, i);
		}
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public Method_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_definition; }
	}

	public final Method_definitionContext method_definition() throws RecognitionException {
		Method_definitionContext _localctx = new Method_definitionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_method_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(ID);
			setState(108);
			match(LPAREN);
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(109);
				parameter_list();
				}
			}

			setState(112);
			match(RPAREN);
			setState(113);
			match(COLON);
			setState(114);
			type();
			setState(115);
			match(LBRACE);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__13) | (1L << T__17) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << ID) | (1L << INT_CONST) | (1L << STR_CONST) | (1L << NEW) | (1L << ISVOID) | (1L << NOT) | (1L << SEMI) | (1L << LPAREN) | (1L << LBRACE))) != 0)) {
				{
				{
				setState(116);
				block();
				setState(117);
				match(SEMI);
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
			match(RBRACE);
			setState(125);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Let_declarationContext extends ParserRuleContext {
		public List<Let_bindingContext> let_binding() {
			return getRuleContexts(Let_bindingContext.class);
		}
		public Let_bindingContext let_binding(int i) {
			return getRuleContext(Let_bindingContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(YAPLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(YAPLParser.COMMA, i);
		}
		public TerminalNode LBRACE() { return getToken(YAPLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(YAPLParser.RBRACE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(YAPLParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(YAPLParser.SEMI, i);
		}
		public Let_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_let_declaration; }
	}

	public final Let_declarationContext let_declaration() throws RecognitionException {
		Let_declarationContext _localctx = new Let_declarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_let_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(T__11);
			setState(128);
			let_binding();
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(129);
				match(COMMA);
				setState(130);
				let_binding();
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(136);
				match(T__12);
				setState(137);
				match(LBRACE);
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << ID) | (1L << INT_CONST) | (1L << STR_CONST) | (1L << NEW) | (1L << ISVOID) | (1L << NOT) | (1L << LPAREN) | (1L << LBRACE))) != 0)) {
					{
					{
					setState(138);
					expr(0);
					setState(139);
					match(SEMI);
					}
					}
					setState(145);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(146);
				match(RBRACE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Let_bindingContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(YAPLParser.ID, 0); }
		public TerminalNode COLON() { return getToken(YAPLParser.COLON, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(YAPLParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Let_bindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_let_binding; }
	}

	public final Let_bindingContext let_binding() throws RecognitionException {
		Let_bindingContext _localctx = new Let_bindingContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_let_binding);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(ID);
			setState(150);
			match(COLON);
			setState(151);
			type();
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(152);
				match(ASSIGN);
				setState(153);
				expr(0);
				}
			}

			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << BOOL) | (1L << INT) | (1L << STRING) | (1L << IO) | (1L << OBJECT) | (1L << SELF_TYPE))) != 0)) {
				{
				setState(156);
				type();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_statementContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<While_statementContext> while_statement() {
			return getRuleContexts(While_statementContext.class);
		}
		public While_statementContext while_statement(int i) {
			return getRuleContext(While_statementContext.class,i);
		}
		public List<If_statementContext> if_statement() {
			return getRuleContexts(If_statementContext.class);
		}
		public If_statementContext if_statement(int i) {
			return getRuleContext(If_statementContext.class,i);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(T__13);
			setState(160);
			expr(0);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(161);
				match(T__14);
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__17) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << ID) | (1L << INT_CONST) | (1L << STR_CONST) | (1L << NEW) | (1L << ISVOID) | (1L << NOT) | (1L << LPAREN) | (1L << LBRACE))) != 0)) {
					{
					setState(165);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__20:
					case T__21:
					case T__22:
					case T__23:
					case ID:
					case INT_CONST:
					case STR_CONST:
					case NEW:
					case ISVOID:
					case NOT:
					case LPAREN:
					case LBRACE:
						{
						setState(162);
						expr(0);
						}
						break;
					case T__17:
						{
						setState(163);
						while_statement();
						}
						break;
					case T__13:
						{
						setState(164);
						if_statement();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(169);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(175);
				match(T__15);
				setState(179);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__20:
				case T__21:
				case T__22:
				case T__23:
				case ID:
				case INT_CONST:
				case STR_CONST:
				case NEW:
				case ISVOID:
				case NOT:
				case LPAREN:
				case LBRACE:
					{
					setState(176);
					expr(0);
					}
					break;
				case T__17:
					{
					setState(177);
					while_statement();
					}
					break;
				case T__13:
					{
					setState(178);
					if_statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(183);
			match(T__16);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_statementContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<While_statementContext> while_statement() {
			return getRuleContexts(While_statementContext.class);
		}
		public While_statementContext while_statement(int i) {
			return getRuleContext(While_statementContext.class,i);
		}
		public List<If_statementContext> if_statement() {
			return getRuleContexts(If_statementContext.class);
		}
		public If_statementContext if_statement(int i) {
			return getRuleContext(If_statementContext.class,i);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_while_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(T__17);
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__17) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << ID) | (1L << INT_CONST) | (1L << STR_CONST) | (1L << NEW) | (1L << ISVOID) | (1L << NOT) | (1L << LPAREN) | (1L << LBRACE))) != 0)) {
				{
				setState(189);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__20:
				case T__21:
				case T__22:
				case T__23:
				case ID:
				case INT_CONST:
				case STR_CONST:
				case NEW:
				case ISVOID:
				case NOT:
				case LPAREN:
				case LBRACE:
					{
					setState(186);
					expr(0);
					}
					break;
				case T__17:
					{
					setState(187);
					while_statement();
					}
					break;
				case T__13:
					{
					setState(188);
					if_statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(194);
			match(T__18);
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__17) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << ID) | (1L << INT_CONST) | (1L << STR_CONST) | (1L << NEW) | (1L << ISVOID) | (1L << NOT) | (1L << LPAREN) | (1L << LBRACE))) != 0)) {
				{
				setState(198);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__20:
				case T__21:
				case T__22:
				case T__23:
				case ID:
				case INT_CONST:
				case STR_CONST:
				case NEW:
				case ISVOID:
				case NOT:
				case LPAREN:
				case LBRACE:
					{
					setState(195);
					expr(0);
					}
					break;
				case T__17:
					{
					setState(196);
					while_statement();
					}
					break;
				case T__13:
					{
					setState(197);
					if_statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(203);
			match(T__19);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<If_statementContext> if_statement() {
			return getRuleContexts(If_statementContext.class);
		}
		public If_statementContext if_statement(int i) {
			return getRuleContext(If_statementContext.class,i);
		}
		public List<While_statementContext> while_statement() {
			return getRuleContexts(While_statementContext.class);
		}
		public While_statementContext while_statement(int i) {
			return getRuleContext(While_statementContext.class,i);
		}
		public List<Let_declarationContext> let_declaration() {
			return getRuleContexts(Let_declarationContext.class);
		}
		public Let_declarationContext let_declaration(int i) {
			return getRuleContext(Let_declarationContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_block);
		int _la;
		try {
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(205);
					if_statement();
					}
					}
					setState(210);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(211);
					while_statement();
					}
					}
					setState(216);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(217);
					let_declaration();
					}
					}
					setState(222);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << ID) | (1L << INT_CONST) | (1L << STR_CONST) | (1L << NEW) | (1L << ISVOID) | (1L << NOT) | (1L << LPAREN) | (1L << LBRACE))) != 0)) {
					{
					{
					setState(223);
					expr(0);
					}
					}
					setState(228);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_method_definitionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(YAPLParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(YAPLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(YAPLParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(YAPLParser.SEMI, 0); }
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public Simple_method_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_method_definition; }
	}

	public final Simple_method_definitionContext simple_method_definition() throws RecognitionException {
		Simple_method_definitionContext _localctx = new Simple_method_definitionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_simple_method_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(ID);
			setState(232);
			match(LPAREN);
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(233);
				parameter_list();
				}
			}

			setState(236);
			match(RPAREN);
			setState(237);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(YAPLParser.ID, 0); }
		public TerminalNode COLON() { return getToken(YAPLParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FormalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal; }
	}

	public final FormalContext formal() throws RecognitionException {
		FormalContext _localctx = new FormalContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_formal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(ID);
			setState(240);
			match(COLON);
			setState(241);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_listContext extends ParserRuleContext {
		public List<FormalContext> formal() {
			return getRuleContexts(FormalContext.class);
		}
		public FormalContext formal(int i) {
			return getRuleContext(FormalContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(YAPLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(YAPLParser.COMMA, i);
		}
		public Parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list; }
	}

	public final Parameter_listContext parameter_list() throws RecognitionException {
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			formal();
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(244);
				match(COMMA);
				setState(245);
				formal();
				}
				}
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(YAPLParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(YAPLParser.ASSIGN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode STR_CONST() { return getToken(YAPLParser.STR_CONST, 0); }
		public TerminalNode LPAREN() { return getToken(YAPLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(YAPLParser.RPAREN, 0); }
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(YAPLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(YAPLParser.RBRACE, 0); }
		public TerminalNode INT_CONST() { return getToken(YAPLParser.INT_CONST, 0); }
		public TerminalNode NEW() { return getToken(YAPLParser.NEW, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ISVOID() { return getToken(YAPLParser.ISVOID, 0); }
		public TerminalNode NOT() { return getToken(YAPLParser.NOT, 0); }
		public TerminalNode DOT() { return getToken(YAPLParser.DOT, 0); }
		public List<TerminalNode> SEMI() { return getTokens(YAPLParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(YAPLParser.SEMI, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(252);
				match(ID);
				setState(253);
				match(ASSIGN);
				setState(254);
				expr(39);
				}
				break;
			case 2:
				{
				setState(255);
				match(STR_CONST);
				}
				break;
			case 3:
				{
				setState(256);
				match(ID);
				setState(257);
				match(LPAREN);
				setState(258);
				expr(0);
				setState(259);
				match(RPAREN);
				}
				break;
			case 4:
				{
				setState(261);
				match(ID);
				setState(262);
				match(LPAREN);
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(263);
					parameter_list();
					}
				}

				setState(266);
				match(RPAREN);
				}
				break;
			case 5:
				{
				setState(267);
				match(LBRACE);
				setState(268);
				expr(0);
				setState(269);
				match(RBRACE);
				}
				break;
			case 6:
				{
				setState(271);
				match(STR_CONST);
				}
				break;
			case 7:
				{
				setState(272);
				match(ID);
				setState(273);
				match(LPAREN);
				setState(274);
				match(STR_CONST);
				setState(275);
				match(RPAREN);
				}
				break;
			case 8:
				{
				setState(276);
				match(LPAREN);
				setState(277);
				match(STR_CONST);
				setState(278);
				match(RPAREN);
				}
				break;
			case 9:
				{
				setState(279);
				match(INT_CONST);
				}
				break;
			case 10:
				{
				setState(280);
				match(NEW);
				setState(281);
				match(ID);
				}
				break;
			case 11:
				{
				setState(282);
				match(NEW);
				setState(283);
				type();
				}
				break;
			case 12:
				{
				setState(284);
				match(ISVOID);
				setState(285);
				expr(28);
				}
				break;
			case 13:
				{
				setState(286);
				match(INT_CONST);
				}
				break;
			case 14:
				{
				setState(287);
				match(STR_CONST);
				}
				break;
			case 15:
				{
				setState(288);
				match(NOT);
				setState(289);
				expr(25);
				}
				break;
			case 16:
				{
				setState(290);
				match(LPAREN);
				setState(292); 
				_errHandler.sync(this);
				_alt = 1+1;
				do {
					switch (_alt) {
					case 1+1:
						{
						{
						setState(291);
						expr(0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(294); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(296);
				match(RPAREN);
				}
				break;
			case 17:
				{
				setState(298);
				match(ISVOID);
				setState(299);
				expr(23);
				}
				break;
			case 18:
				{
				setState(300);
				match(T__20);
				}
				break;
			case 19:
				{
				setState(301);
				match(T__21);
				}
				break;
			case 20:
				{
				setState(302);
				match(T__22);
				}
				break;
			case 21:
				{
				setState(303);
				match(T__23);
				}
				break;
			case 22:
				{
				setState(304);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(415);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(413);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(307);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(308);
						match(DOT);
						setState(309);
						match(ID);
						setState(310);
						match(ASSIGN);
						setState(311);
						expr(17);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(312);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(313);
						match(T__8);
						setState(314);
						expr(10);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(315);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(316);
						match(T__26);
						setState(317);
						expr(4);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(318);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(319);
						match(T__7);
						setState(320);
						expr(3);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(321);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(322);
						match(DOT);
						setState(323);
						match(ID);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(324);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(325);
						match(DOT);
						setState(326);
						match(ID);
						setState(327);
						match(LPAREN);
						setState(329);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << ID) | (1L << INT_CONST) | (1L << STR_CONST) | (1L << NEW) | (1L << ISVOID) | (1L << NOT) | (1L << LPAREN) | (1L << LBRACE))) != 0)) {
							{
							setState(328);
							expr(0);
							}
						}

						setState(331);
						match(RPAREN);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(332);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(333);
						match(T__9);
						setState(334);
						type();
						setState(335);
						match(DOT);
						setState(336);
						match(ID);
						setState(337);
						match(LPAREN);
						setState(338);
						expr(0);
						setState(343);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==SEMI) {
							{
							{
							setState(339);
							match(SEMI);
							setState(340);
							expr(0);
							}
							}
							setState(345);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(346);
						match(RPAREN);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(348);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(349);
						match(T__10);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(350);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(353); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(351);
								match(T__3);
								setState(352);
								expr(0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(355); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(357);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(360); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(358);
								match(T__2);
								setState(359);
								expr(0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(362); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(364);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(367); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(365);
								match(T__6);
								setState(366);
								expr(0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(369); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(371);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(374); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(372);
								match(T__24);
								setState(373);
								expr(0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(376); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(378);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(381); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(379);
								match(T__2);
								setState(380);
								expr(0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(383); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case 14:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(385);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(388); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(386);
								match(T__3);
								setState(387);
								expr(0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(390); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case 15:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(392);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(395); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(393);
								match(T__4);
								setState(394);
								expr(0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(397); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case 16:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(399);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(402); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(400);
								match(T__5);
								setState(401);
								expr(0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(404); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case 17:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(406);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(409); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(407);
								match(T__25);
								setState(408);
								expr(0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(411); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					}
					} 
				}
				setState(417);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 20:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 16);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 18);
		case 5:
			return precpred(_ctx, 17);
		case 6:
			return precpred(_ctx, 15);
		case 7:
			return precpred(_ctx, 14);
		case 8:
			return precpred(_ctx, 13);
		case 9:
			return precpred(_ctx, 12);
		case 10:
			return precpred(_ctx, 11);
		case 11:
			return precpred(_ctx, 10);
		case 12:
			return precpred(_ctx, 8);
		case 13:
			return precpred(_ctx, 7);
		case 14:
			return precpred(_ctx, 6);
		case 15:
			return precpred(_ctx, 5);
		case 16:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u01a5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\7\6\78\n\7\r\7\16\79\3\b\3\b\3\b\3\b\5\b@\n\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\7\tH\n\t\f\t\16\tK\13\t\3\t\7\tN\n\t\f\t\16\tQ\13\t\5\tS"+
		"\n\t\3\n\3\n\3\n\5\nX\n\n\3\13\3\13\3\13\3\13\3\13\5\13_\n\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13f\n\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\5\rq"+
		"\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\rz\n\r\f\r\16\r}\13\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\7\16\u0086\n\16\f\16\16\16\u0089\13\16\3\16\3\16\3"+
		"\16\3\16\3\16\7\16\u0090\n\16\f\16\16\16\u0093\13\16\3\16\5\16\u0096\n"+
		"\16\3\17\3\17\3\17\3\17\3\17\5\17\u009d\n\17\3\17\5\17\u00a0\n\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\7\20\u00a8\n\20\f\20\16\20\u00ab\13\20\7\20"+
		"\u00ad\n\20\f\20\16\20\u00b0\13\20\3\20\3\20\3\20\3\20\5\20\u00b6\n\20"+
		"\5\20\u00b8\n\20\3\20\3\20\3\21\3\21\3\21\3\21\7\21\u00c0\n\21\f\21\16"+
		"\21\u00c3\13\21\3\21\3\21\3\21\3\21\7\21\u00c9\n\21\f\21\16\21\u00cc\13"+
		"\21\3\21\3\21\3\22\7\22\u00d1\n\22\f\22\16\22\u00d4\13\22\3\22\7\22\u00d7"+
		"\n\22\f\22\16\22\u00da\13\22\3\22\7\22\u00dd\n\22\f\22\16\22\u00e0\13"+
		"\22\3\22\7\22\u00e3\n\22\f\22\16\22\u00e6\13\22\5\22\u00e8\n\22\3\23\3"+
		"\23\3\23\5\23\u00ed\n\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\7\25\u00f9\n\25\f\25\16\25\u00fc\13\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u010b\n\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\6\26\u0127\n\26\r\26\16"+
		"\26\u0128\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0134\n\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u014c\n\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u0158\n\26\f\26\16\26\u015b\13"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\6\26\u0164\n\26\r\26\16\26\u0165"+
		"\3\26\3\26\3\26\6\26\u016b\n\26\r\26\16\26\u016c\3\26\3\26\3\26\6\26\u0172"+
		"\n\26\r\26\16\26\u0173\3\26\3\26\3\26\6\26\u0179\n\26\r\26\16\26\u017a"+
		"\3\26\3\26\3\26\6\26\u0180\n\26\r\26\16\26\u0181\3\26\3\26\3\26\6\26\u0187"+
		"\n\26\r\26\16\26\u0188\3\26\3\26\3\26\6\26\u018e\n\26\r\26\16\26\u018f"+
		"\3\26\3\26\3\26\6\26\u0195\n\26\r\26\16\26\u0196\3\26\3\26\3\26\6\26\u019c"+
		"\n\26\r\26\16\26\u019d\7\26\u01a0\n\26\f\26\16\26\u01a3\13\26\3\26\3\u0128"+
		"\3*\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\5\4\2\36\36\"\'"+
		"\3\2\5\f\4\2\r\r--\2\u01e8\2,\3\2\2\2\4.\3\2\2\2\6\60\3\2\2\2\b\62\3\2"+
		"\2\2\n\64\3\2\2\2\f\67\3\2\2\2\16;\3\2\2\2\20R\3\2\2\2\22W\3\2\2\2\24"+
		"Y\3\2\2\2\26i\3\2\2\2\30m\3\2\2\2\32\u0081\3\2\2\2\34\u0097\3\2\2\2\36"+
		"\u00a1\3\2\2\2 \u00bb\3\2\2\2\"\u00e7\3\2\2\2$\u00e9\3\2\2\2&\u00f1\3"+
		"\2\2\2(\u00f5\3\2\2\2*\u0133\3\2\2\2,-\7\3\2\2-\3\3\2\2\2./\7\4\2\2/\5"+
		"\3\2\2\2\60\61\t\2\2\2\61\7\3\2\2\2\62\63\t\3\2\2\63\t\3\2\2\2\64\65\t"+
		"\4\2\2\65\13\3\2\2\2\668\5\16\b\2\67\66\3\2\2\289\3\2\2\29\67\3\2\2\2"+
		"9:\3\2\2\2:\r\3\2\2\2;<\7\3\2\2<?\5\6\4\2=>\7\4\2\2>@\5\6\4\2?=\3\2\2"+
		"\2?@\3\2\2\2@A\3\2\2\2AB\7\66\2\2BC\5\20\t\2CD\7\67\2\2DE\7\60\2\2E\17"+
		"\3\2\2\2FH\5\22\n\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JS\3\2\2\2"+
		"KI\3\2\2\2LN\5&\24\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PS\3\2\2\2"+
		"QO\3\2\2\2RI\3\2\2\2RO\3\2\2\2S\21\3\2\2\2TX\5\24\13\2UX\5\30\r\2VX\5"+
		"$\23\2WT\3\2\2\2WU\3\2\2\2WV\3\2\2\2X\23\3\2\2\2YZ\7\36\2\2Z[\7\61\2\2"+
		"[^\5\6\4\2\\]\7.\2\2]_\5*\26\2^\\\3\2\2\2^_\3\2\2\2_e\3\2\2\2`a\7\64\2"+
		"\2ab\5*\26\2bc\7\60\2\2cd\7\65\2\2df\3\2\2\2e`\3\2\2\2ef\3\2\2\2fg\3\2"+
		"\2\2gh\7\60\2\2h\25\3\2\2\2ij\7\36\2\2jk\7.\2\2kl\5*\26\2l\27\3\2\2\2"+
		"mn\7\36\2\2np\7\64\2\2oq\5(\25\2po\3\2\2\2pq\3\2\2\2qr\3\2\2\2rs\7\65"+
		"\2\2st\7\61\2\2tu\5\6\4\2u{\7\66\2\2vw\5\"\22\2wx\7\60\2\2xz\3\2\2\2y"+
		"v\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|~\3\2\2\2}{\3\2\2\2~\177\7\67"+
		"\2\2\177\u0080\7\60\2\2\u0080\31\3\2\2\2\u0081\u0082\7\16\2\2\u0082\u0087"+
		"\5\34\17\2\u0083\u0084\7\62\2\2\u0084\u0086\5\34\17\2\u0085\u0083\3\2"+
		"\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\u0095\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008b\7\17\2\2\u008b\u0091\7"+
		"\66\2\2\u008c\u008d\5*\26\2\u008d\u008e\7\60\2\2\u008e\u0090\3\2\2\2\u008f"+
		"\u008c\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2"+
		"\2\2\u0092\u0094\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0096\7\67\2\2\u0095"+
		"\u008a\3\2\2\2\u0095\u0096\3\2\2\2\u0096\33\3\2\2\2\u0097\u0098\7\36\2"+
		"\2\u0098\u0099\7\61\2\2\u0099\u009c\5\6\4\2\u009a\u009b\7.\2\2\u009b\u009d"+
		"\5*\26\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e"+
		"\u00a0\5\6\4\2\u009f\u009e\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\35\3\2\2"+
		"\2\u00a1\u00a2\7\20\2\2\u00a2\u00ae\5*\26\2\u00a3\u00a9\7\21\2\2\u00a4"+
		"\u00a8\5*\26\2\u00a5\u00a8\5 \21\2\u00a6\u00a8\5\36\20\2\u00a7\u00a4\3"+
		"\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2"+
		"\2\2\u00ac\u00a3\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af\u00b7\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b5\7\22"+
		"\2\2\u00b2\u00b6\5*\26\2\u00b3\u00b6\5 \21\2\u00b4\u00b6\5\36\20\2\u00b5"+
		"\u00b2\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6\u00b8\3\2"+
		"\2\2\u00b7\u00b1\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\u00ba\7\23\2\2\u00ba\37\3\2\2\2\u00bb\u00c1\7\24\2\2\u00bc\u00c0\5*\26"+
		"\2\u00bd\u00c0\5 \21\2\u00be\u00c0\5\36\20\2\u00bf\u00bc\3\2\2\2\u00bf"+
		"\u00bd\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2"+
		"\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4"+
		"\u00ca\7\25\2\2\u00c5\u00c9\5*\26\2\u00c6\u00c9\5 \21\2\u00c7\u00c9\5"+
		"\36\20\2\u00c8\u00c5\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9"+
		"\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cd\3\2"+
		"\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\7\26\2\2\u00ce!\3\2\2\2\u00cf\u00d1"+
		"\5\36\20\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2"+
		"\u00d2\u00d3\3\2\2\2\u00d3\u00e8\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d7"+
		"\5 \21\2\u00d6\u00d5\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8"+
		"\u00d9\3\2\2\2\u00d9\u00e8\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00dd\5\32"+
		"\16\2\u00dc\u00db\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de"+
		"\u00df\3\2\2\2\u00df\u00e8\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e3\5*"+
		"\26\2\u00e2\u00e1\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00d2\3\2"+
		"\2\2\u00e7\u00d8\3\2\2\2\u00e7\u00de\3\2\2\2\u00e7\u00e4\3\2\2\2\u00e8"+
		"#\3\2\2\2\u00e9\u00ea\7\36\2\2\u00ea\u00ec\7\64\2\2\u00eb\u00ed\5(\25"+
		"\2\u00ec\u00eb\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef"+
		"\7\65\2\2\u00ef\u00f0\7\60\2\2\u00f0%\3\2\2\2\u00f1\u00f2\7\36\2\2\u00f2"+
		"\u00f3\7\61\2\2\u00f3\u00f4\5\6\4\2\u00f4\'\3\2\2\2\u00f5\u00fa\5&\24"+
		"\2\u00f6\u00f7\7\62\2\2\u00f7\u00f9\5&\24\2\u00f8\u00f6\3\2\2\2\u00f9"+
		"\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb)\3\2\2\2"+
		"\u00fc\u00fa\3\2\2\2\u00fd\u00fe\b\26\1\2\u00fe\u00ff\7\36\2\2\u00ff\u0100"+
		"\7.\2\2\u0100\u0134\5*\26)\u0101\u0134\7 \2\2\u0102\u0103\7\36\2\2\u0103"+
		"\u0104\7\64\2\2\u0104\u0105\5*\26\2\u0105\u0106\7\65\2\2\u0106\u0134\3"+
		"\2\2\2\u0107\u0108\7\36\2\2\u0108\u010a\7\64\2\2\u0109\u010b\5(\25\2\u010a"+
		"\u0109\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u0134\7\65"+
		"\2\2\u010d\u010e\7\66\2\2\u010e\u010f\5*\26\2\u010f\u0110\7\67\2\2\u0110"+
		"\u0134\3\2\2\2\u0111\u0134\7 \2\2\u0112\u0113\7\36\2\2\u0113\u0114\7\64"+
		"\2\2\u0114\u0115\7 \2\2\u0115\u0134\7\65\2\2\u0116\u0117\7\64\2\2\u0117"+
		"\u0118\7 \2\2\u0118\u0134\7\65\2\2\u0119\u0134\7\37\2\2\u011a\u011b\7"+
		"+\2\2\u011b\u0134\7\36\2\2\u011c\u011d\7+\2\2\u011d\u0134\5\6\4\2\u011e"+
		"\u011f\7,\2\2\u011f\u0134\5*\26\36\u0120\u0134\7\37\2\2\u0121\u0134\7"+
		" \2\2\u0122\u0123\7-\2\2\u0123\u0134\5*\26\33\u0124\u0126\7\64\2\2\u0125"+
		"\u0127\5*\26\2\u0126\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\3\2"+
		"\2\2\u0128\u0126\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b\7\65\2\2\u012b"+
		"\u0134\3\2\2\2\u012c\u012d\7,\2\2\u012d\u0134\5*\26\31\u012e\u0134\7\27"+
		"\2\2\u012f\u0134\7\30\2\2\u0130\u0134\7\31\2\2\u0131\u0134\7\32\2\2\u0132"+
		"\u0134\7\36\2\2\u0133\u00fd\3\2\2\2\u0133\u0101\3\2\2\2\u0133\u0102\3"+
		"\2\2\2\u0133\u0107\3\2\2\2\u0133\u010d\3\2\2\2\u0133\u0111\3\2\2\2\u0133"+
		"\u0112\3\2\2\2\u0133\u0116\3\2\2\2\u0133\u0119\3\2\2\2\u0133\u011a\3\2"+
		"\2\2\u0133\u011c\3\2\2\2\u0133\u011e\3\2\2\2\u0133\u0120\3\2\2\2\u0133"+
		"\u0121\3\2\2\2\u0133\u0122\3\2\2\2\u0133\u0124\3\2\2\2\u0133\u012c\3\2"+
		"\2\2\u0133\u012e\3\2\2\2\u0133\u012f\3\2\2\2\u0133\u0130\3\2\2\2\u0133"+
		"\u0131\3\2\2\2\u0133\u0132\3\2\2\2\u0134\u01a1\3\2\2\2\u0135\u0136\f\22"+
		"\2\2\u0136\u0137\7\63\2\2\u0137\u0138\7\36\2\2\u0138\u0139\7.\2\2\u0139"+
		"\u01a0\5*\26\23\u013a\u013b\f\13\2\2\u013b\u013c\7\13\2\2\u013c\u01a0"+
		"\5*\26\f\u013d\u013e\f\5\2\2\u013e\u013f\7\35\2\2\u013f\u01a0\5*\26\6"+
		"\u0140\u0141\f\4\2\2\u0141\u0142\7\n\2\2\u0142\u01a0\5*\26\5\u0143\u0144"+
		"\f\24\2\2\u0144\u0145\7\63\2\2\u0145\u01a0\7\36\2\2\u0146\u0147\f\23\2"+
		"\2\u0147\u0148\7\63\2\2\u0148\u0149\7\36\2\2\u0149\u014b\7\64\2\2\u014a"+
		"\u014c\5*\26\2\u014b\u014a\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014d\3\2"+
		"\2\2\u014d\u01a0\7\65\2\2\u014e\u014f\f\21\2\2\u014f\u0150\7\f\2\2\u0150"+
		"\u0151\5\6\4\2\u0151\u0152\7\63\2\2\u0152\u0153\7\36\2\2\u0153\u0154\7"+
		"\64\2\2\u0154\u0159\5*\26\2\u0155\u0156\7\60\2\2\u0156\u0158\5*\26\2\u0157"+
		"\u0155\3\2\2\2\u0158\u015b\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2"+
		"\2\2\u015a\u015c\3\2\2\2\u015b\u0159\3\2\2\2\u015c\u015d\7\65\2\2\u015d"+
		"\u01a0\3\2\2\2\u015e\u015f\f\20\2\2\u015f\u01a0\7\r\2\2\u0160\u0163\f"+
		"\17\2\2\u0161\u0162\7\6\2\2\u0162\u0164\5*\26\2\u0163\u0161\3\2\2\2\u0164"+
		"\u0165\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u01a0\3\2"+
		"\2\2\u0167\u016a\f\16\2\2\u0168\u0169\7\5\2\2\u0169\u016b\5*\26\2\u016a"+
		"\u0168\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016d\3\2"+
		"\2\2\u016d\u01a0\3\2\2\2\u016e\u0171\f\r\2\2\u016f\u0170\7\t\2\2\u0170"+
		"\u0172\5*\26\2\u0171\u016f\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0171\3\2"+
		"\2\2\u0173\u0174\3\2\2\2\u0174\u01a0\3\2\2\2\u0175\u0178\f\f\2\2\u0176"+
		"\u0177\7\33\2\2\u0177\u0179\5*\26\2\u0178\u0176\3\2\2\2\u0179\u017a\3"+
		"\2\2\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u01a0\3\2\2\2\u017c"+
		"\u017f\f\n\2\2\u017d\u017e\7\5\2\2\u017e\u0180\5*\26\2\u017f\u017d\3\2"+
		"\2\2\u0180\u0181\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182"+
		"\u01a0\3\2\2\2\u0183\u0186\f\t\2\2\u0184\u0185\7\6\2\2\u0185\u0187\5*"+
		"\26\2\u0186\u0184\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0186\3\2\2\2\u0188"+
		"\u0189\3\2\2\2\u0189\u01a0\3\2\2\2\u018a\u018d\f\b\2\2\u018b\u018c\7\7"+
		"\2\2\u018c\u018e\5*\26\2\u018d\u018b\3\2\2\2\u018e\u018f\3\2\2\2\u018f"+
		"\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u01a0\3\2\2\2\u0191\u0194\f\7"+
		"\2\2\u0192\u0193\7\b\2\2\u0193\u0195\5*\26\2\u0194\u0192\3\2\2\2\u0195"+
		"\u0196\3\2\2\2\u0196\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u01a0\3\2"+
		"\2\2\u0198\u019b\f\6\2\2\u0199\u019a\7\34\2\2\u019a\u019c\5*\26\2\u019b"+
		"\u0199\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019e\3\2"+
		"\2\2\u019e\u01a0\3\2\2\2\u019f\u0135\3\2\2\2\u019f\u013a\3\2\2\2\u019f"+
		"\u013d\3\2\2\2\u019f\u0140\3\2\2\2\u019f\u0143\3\2\2\2\u019f\u0146\3\2"+
		"\2\2\u019f\u014e\3\2\2\2\u019f\u015e\3\2\2\2\u019f\u0160\3\2\2\2\u019f"+
		"\u0167\3\2\2\2\u019f\u016e\3\2\2\2\u019f\u0175\3\2\2\2\u019f\u017c\3\2"+
		"\2\2\u019f\u0183\3\2\2\2\u019f\u018a\3\2\2\2\u019f\u0191\3\2\2\2\u019f"+
		"\u0198\3\2\2\2\u01a0\u01a3\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2"+
		"\2\2\u01a2+\3\2\2\2\u01a3\u01a1\3\2\2\2\619?IORW^ep{\u0087\u0091\u0095"+
		"\u009c\u009f\u00a7\u00a9\u00ae\u00b5\u00b7\u00bf\u00c1\u00c8\u00ca\u00d2"+
		"\u00d8\u00de\u00e4\u00e7\u00ec\u00fa\u010a\u0128\u0133\u014b\u0159\u0165"+
		"\u016c\u0173\u017a\u0181\u0188\u018f\u0196\u019d\u019f\u01a1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}