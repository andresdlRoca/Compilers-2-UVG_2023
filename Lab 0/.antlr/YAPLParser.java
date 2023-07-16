// Generated from c:\Users\Andre\OneDrive\Universidad\Cuarto año\Segundo Semestre\Compiladores\Laboratorios\Lab 0\YAPL.g4 by ANTLR 4.9.2
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
		ID=18, INT_CONST=19, STR_CONST=20, WS=21, BOOL=22, INT=23, STRING=24, 
		IO=25, OBJECT=26, SELF_TYPE=27, IF=28, THEN=29, ELSE=30, FI=31, WHILE=32, 
		LOOP=33, POOL=34, LET=35, IN=36, CASE=37, OF=38, ESAC=39, NEW=40, ISVOID=41, 
		NOT=42, ASSIGN=43, ARROW=44, SEMI=45, COLON=46, COMMA=47, DOT=48, LPAREN=49, 
		RPAREN=50, LBRACE=51, RBRACE=52;
	public static final int
		RULE_class = 0, RULE_inherits = 1, RULE_type = 2, RULE_binary_op = 3, 
		RULE_unary_op = 4, RULE_program = 5, RULE_clas_list = 6, RULE_feature_list = 7, 
		RULE_feature = 8, RULE_attribute_definition = 9, RULE_method_definition = 10, 
		RULE_block = 11, RULE_statement = 12, RULE_formal = 13, RULE_assignment_statement = 14, 
		RULE_if_statement = 15, RULE_while_statement = 16, RULE_parameter_list = 17, 
		RULE_let_declaration = 18, RULE_let_binding = 19, RULE_expr = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"class", "inherits", "type", "binary_op", "unary_op", "program", "clas_list", 
			"feature_list", "feature", "attribute_definition", "method_definition", 
			"block", "statement", "formal", "assignment_statement", "if_statement", 
			"while_statement", "parameter_list", "let_declaration", "let_binding", 
			"expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'inherits'", "'+'", "'-'", "'*'", "'/'", "'<'", "'<='", 
			"'='", "'@'", "'~'", "'>'", "'%'", "'^'", "'true'", "'false'", "'void'", 
			null, null, null, null, "'Bool'", "'Int'", "'String'", "'IO'", "'Object'", 
			"'SELF_TYPE'", "'if'", "'then'", "'else'", "'fi'", "'while'", "'loop'", 
			"'pool'", "'let'", "'in'", "'case'", "'of'", "'esac'", "'new'", "'isvoid'", 
			"'not'", "'<-'", "'=>'", "';'", "':'", "','", "'.'", "'('", "')'", "'{'", 
			"'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "ID", "INT_CONST", "STR_CONST", "WS", 
			"BOOL", "INT", "STRING", "IO", "OBJECT", "SELF_TYPE", "IF", "THEN", "ELSE", 
			"FI", "WHILE", "LOOP", "POOL", "LET", "IN", "CASE", "OF", "ESAC", "NEW", 
			"ISVOID", "NOT", "ASSIGN", "ARROW", "SEMI", "COLON", "COMMA", "DOT", 
			"LPAREN", "RPAREN", "LBRACE", "RBRACE"
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
		public Clas_listContext clas_list() {
			return getRuleContext(Clas_listContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			clas_list();
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
			setState(54);
			match(T__0);
			setState(55);
			type();
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(56);
				match(T__1);
				setState(57);
				type();
				}
			}

			setState(60);
			match(LBRACE);
			{
			setState(61);
			feature_list();
			}
			setState(62);
			match(RBRACE);
			setState(63);
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
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(65);
					feature();
					}
					}
					setState(70);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(71);
					formal();
					}
					}
					setState(76);
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
		public FeatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feature; }
	}

	public final FeatureContext feature() throws RecognitionException {
		FeatureContext _localctx = new FeatureContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_feature);
		try {
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				attribute_definition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				method_definition();
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
		public TerminalNode SEMI() { return getToken(YAPLParser.SEMI, 0); }
		public TerminalNode ASSIGN() { return getToken(YAPLParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Attribute_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_definition; }
	}

	public final Attribute_definitionContext attribute_definition() throws RecognitionException {
		Attribute_definitionContext _localctx = new Attribute_definitionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_attribute_definition);
		try {
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				match(ID);
				setState(84);
				match(COLON);
				setState(85);
				type();
				setState(86);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				match(ID);
				setState(89);
				match(ASSIGN);
				setState(90);
				expr(0);
				setState(91);
				match(SEMI);
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

	public static class Method_definitionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(YAPLParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(YAPLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(YAPLParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(YAPLParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(YAPLParser.LBRACE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(YAPLParser.RBRACE, 0); }
		public TerminalNode SEMI() { return getToken(YAPLParser.SEMI, 0); }
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public Method_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_definition; }
	}

	public final Method_definitionContext method_definition() throws RecognitionException {
		Method_definitionContext _localctx = new Method_definitionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_method_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(ID);
			setState(96);
			match(LPAREN);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(97);
				parameter_list();
				}
			}

			setState(100);
			match(RPAREN);
			setState(101);
			match(COLON);
			setState(102);
			type();
			setState(103);
			match(LBRACE);
			setState(104);
			block();
			setState(105);
			match(RBRACE);
			setState(106);
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(108);
					statement();
					}
					} 
				}
				setState(113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(YAPLParser.ID, 0); }
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_statement);
		try {
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				assignment_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
				if_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(117);
				while_statement();
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
		enterRule(_localctx, 26, RULE_formal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(ID);
			setState(121);
			match(COLON);
			setState(122);
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

	public static class Assignment_statementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(YAPLParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(YAPLParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(YAPLParser.SEMI, 0); }
		public Assignment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_statement; }
	}

	public final Assignment_statementContext assignment_statement() throws RecognitionException {
		Assignment_statementContext _localctx = new Assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assignment_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(ID);
			setState(125);
			match(ASSIGN);
			setState(126);
			expr(0);
			setState(127);
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

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(YAPLParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode THEN() { return getToken(YAPLParser.THEN, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode FI() { return getToken(YAPLParser.FI, 0); }
		public TerminalNode ELSE() { return getToken(YAPLParser.ELSE, 0); }
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(IF);
			setState(130);
			expr(0);
			setState(131);
			match(THEN);
			setState(132);
			block();
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(133);
				match(ELSE);
				setState(134);
				block();
				}
			}

			setState(137);
			match(FI);
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
		public TerminalNode WHILE() { return getToken(YAPLParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LOOP() { return getToken(YAPLParser.LOOP, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode POOL() { return getToken(YAPLParser.POOL, 0); }
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(WHILE);
			setState(140);
			expr(0);
			setState(141);
			match(LOOP);
			setState(142);
			block();
			setState(143);
			match(POOL);
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
		enterRule(_localctx, 34, RULE_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			formal();
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(146);
				match(COMMA);
				setState(147);
				formal();
				}
				}
				setState(152);
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
		public Let_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_let_declaration; }
	}

	public final Let_declarationContext let_declaration() throws RecognitionException {
		Let_declarationContext _localctx = new Let_declarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_let_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			let_binding();
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(154);
				match(COMMA);
				setState(155);
				let_binding();
				}
				}
				setState(160);
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

	public static class Let_bindingContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(YAPLParser.ID, 0); }
		public TerminalNode COLON() { return getToken(YAPLParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
		enterRule(_localctx, 38, RULE_let_binding);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(ID);
			setState(162);
			match(COLON);
			setState(163);
			type();
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(164);
				match(ASSIGN);
				setState(165);
				expr(0);
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(YAPLParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(YAPLParser.ASSIGN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode IF() { return getToken(YAPLParser.IF, 0); }
		public TerminalNode THEN() { return getToken(YAPLParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(YAPLParser.ELSE, 0); }
		public TerminalNode FI() { return getToken(YAPLParser.FI, 0); }
		public TerminalNode WHILE() { return getToken(YAPLParser.WHILE, 0); }
		public TerminalNode LOOP() { return getToken(YAPLParser.LOOP, 0); }
		public TerminalNode POOL() { return getToken(YAPLParser.POOL, 0); }
		public TerminalNode NEW() { return getToken(YAPLParser.NEW, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ISVOID() { return getToken(YAPLParser.ISVOID, 0); }
		public TerminalNode NOT() { return getToken(YAPLParser.NOT, 0); }
		public TerminalNode LPAREN() { return getToken(YAPLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(YAPLParser.RPAREN, 0); }
		public TerminalNode INT_CONST() { return getToken(YAPLParser.INT_CONST, 0); }
		public TerminalNode STR_CONST() { return getToken(YAPLParser.STR_CONST, 0); }
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode LET() { return getToken(YAPLParser.LET, 0); }
		public Let_declarationContext let_declaration() {
			return getRuleContext(Let_declarationContext.class,0);
		}
		public TerminalNode IN() { return getToken(YAPLParser.IN, 0); }
		public TerminalNode DOT() { return getToken(YAPLParser.DOT, 0); }
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(169);
				match(ID);
				setState(170);
				match(ASSIGN);
				setState(171);
				expr(32);
				}
				break;
			case 2:
				{
				setState(172);
				match(IF);
				setState(173);
				expr(0);
				setState(174);
				match(THEN);
				setState(175);
				expr(0);
				setState(176);
				match(ELSE);
				setState(177);
				expr(0);
				setState(178);
				match(FI);
				}
				break;
			case 3:
				{
				setState(180);
				match(WHILE);
				setState(181);
				expr(0);
				setState(182);
				match(LOOP);
				setState(183);
				expr(0);
				setState(184);
				match(POOL);
				}
				break;
			case 4:
				{
				setState(186);
				match(NEW);
				setState(187);
				type();
				}
				break;
			case 5:
				{
				setState(188);
				match(ISVOID);
				setState(189);
				expr(27);
				}
				break;
			case 6:
				{
				setState(190);
				match(NOT);
				setState(191);
				expr(14);
				}
				break;
			case 7:
				{
				setState(192);
				match(LPAREN);
				setState(193);
				expr(0);
				setState(194);
				match(RPAREN);
				}
				break;
			case 8:
				{
				setState(196);
				match(ID);
				}
				break;
			case 9:
				{
				setState(197);
				match(INT_CONST);
				}
				break;
			case 10:
				{
				setState(198);
				match(STR_CONST);
				}
				break;
			case 11:
				{
				setState(199);
				match(T__14);
				}
				break;
			case 12:
				{
				setState(200);
				match(T__15);
				}
				break;
			case 13:
				{
				setState(201);
				match(T__16);
				}
				break;
			case 14:
				{
				setState(202);
				if_statement();
				}
				break;
			case 15:
				{
				setState(203);
				while_statement();
				}
				break;
			case 16:
				{
				setState(204);
				match(ISVOID);
				setState(205);
				expr(4);
				}
				break;
			case 17:
				{
				setState(206);
				block();
				}
				break;
			case 18:
				{
				setState(207);
				match(NEW);
				setState(208);
				type();
				}
				break;
			case 19:
				{
				setState(209);
				match(LET);
				setState(210);
				let_declaration();
				setState(211);
				match(IN);
				setState(212);
				expr(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(257);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(255);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(216);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(217);
						match(T__3);
						setState(218);
						expr(27);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(219);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(220);
						match(T__2);
						setState(221);
						expr(26);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(222);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(223);
						match(T__6);
						setState(224);
						expr(25);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(225);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(226);
						match(T__11);
						setState(227);
						expr(24);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(228);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(229);
						match(T__8);
						setState(230);
						expr(23);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(231);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(232);
						match(T__2);
						setState(233);
						expr(22);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(234);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(235);
						match(T__3);
						setState(236);
						expr(21);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(237);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(238);
						match(T__4);
						setState(239);
						expr(20);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(240);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(241);
						match(T__5);
						setState(242);
						expr(19);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(243);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(244);
						match(T__12);
						setState(245);
						expr(18);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(246);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(247);
						match(T__13);
						setState(248);
						expr(17);
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(249);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(250);
						match(T__7);
						setState(251);
						expr(16);
						}
						break;
					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(252);
						if (!(precpred(_ctx, 31))) throw new FailedPredicateException(this, "precpred(_ctx, 31)");
						setState(253);
						match(DOT);
						setState(254);
						match(ID);
						}
						break;
					}
					} 
				}
				setState(259);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
			return precpred(_ctx, 26);
		case 1:
			return precpred(_ctx, 25);
		case 2:
			return precpred(_ctx, 24);
		case 3:
			return precpred(_ctx, 23);
		case 4:
			return precpred(_ctx, 22);
		case 5:
			return precpred(_ctx, 21);
		case 6:
			return precpred(_ctx, 20);
		case 7:
			return precpred(_ctx, 19);
		case 8:
			return precpred(_ctx, 18);
		case 9:
			return precpred(_ctx, 17);
		case 10:
			return precpred(_ctx, 16);
		case 11:
			return precpred(_ctx, 15);
		case 12:
			return precpred(_ctx, 31);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\66\u0107\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\5\b=\n\b\3\b\3\b\3\b\3\b\3\b\3\t\7"+
		"\tE\n\t\f\t\16\tH\13\t\3\t\7\tK\n\t\f\t\16\tN\13\t\5\tP\n\t\3\n\3\n\5"+
		"\nT\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13`\n\13\3"+
		"\f\3\f\3\f\5\fe\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\7\rp\n\r\f\r\16"+
		"\rs\13\r\3\16\3\16\3\16\3\16\5\16y\n\16\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u008a\n\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\7\23\u0097\n\23\f\23\16"+
		"\23\u009a\13\23\3\24\3\24\3\24\7\24\u009f\n\24\f\24\16\24\u00a2\13\24"+
		"\3\25\3\25\3\25\3\25\3\25\5\25\u00a9\n\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00d9"+
		"\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u0102"+
		"\n\26\f\26\16\26\u0105\13\26\3\26\2\3*\27\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*\2\5\4\2\24\24\30\35\3\2\5\f\4\2\r\r,,\2\u011f\2,\3\2"+
		"\2\2\4.\3\2\2\2\6\60\3\2\2\2\b\62\3\2\2\2\n\64\3\2\2\2\f\66\3\2\2\2\16"+
		"8\3\2\2\2\20O\3\2\2\2\22S\3\2\2\2\24_\3\2\2\2\26a\3\2\2\2\30q\3\2\2\2"+
		"\32x\3\2\2\2\34z\3\2\2\2\36~\3\2\2\2 \u0083\3\2\2\2\"\u008d\3\2\2\2$\u0093"+
		"\3\2\2\2&\u009b\3\2\2\2(\u00a3\3\2\2\2*\u00d8\3\2\2\2,-\7\3\2\2-\3\3\2"+
		"\2\2./\7\4\2\2/\5\3\2\2\2\60\61\t\2\2\2\61\7\3\2\2\2\62\63\t\3\2\2\63"+
		"\t\3\2\2\2\64\65\t\4\2\2\65\13\3\2\2\2\66\67\5\16\b\2\67\r\3\2\2\289\7"+
		"\3\2\29<\5\6\4\2:;\7\4\2\2;=\5\6\4\2<:\3\2\2\2<=\3\2\2\2=>\3\2\2\2>?\7"+
		"\65\2\2?@\5\20\t\2@A\7\66\2\2AB\7/\2\2B\17\3\2\2\2CE\5\22\n\2DC\3\2\2"+
		"\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GP\3\2\2\2HF\3\2\2\2IK\5\34\17\2JI\3\2"+
		"\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MP\3\2\2\2NL\3\2\2\2OF\3\2\2\2OL\3\2"+
		"\2\2P\21\3\2\2\2QT\5\24\13\2RT\5\26\f\2SQ\3\2\2\2SR\3\2\2\2T\23\3\2\2"+
		"\2UV\7\24\2\2VW\7\60\2\2WX\5\6\4\2XY\7/\2\2Y`\3\2\2\2Z[\7\24\2\2[\\\7"+
		"-\2\2\\]\5*\26\2]^\7/\2\2^`\3\2\2\2_U\3\2\2\2_Z\3\2\2\2`\25\3\2\2\2ab"+
		"\7\24\2\2bd\7\63\2\2ce\5$\23\2dc\3\2\2\2de\3\2\2\2ef\3\2\2\2fg\7\64\2"+
		"\2gh\7\60\2\2hi\5\6\4\2ij\7\65\2\2jk\5\30\r\2kl\7\66\2\2lm\7/\2\2m\27"+
		"\3\2\2\2np\5\32\16\2on\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\31\3\2\2"+
		"\2sq\3\2\2\2ty\7\24\2\2uy\5\36\20\2vy\5 \21\2wy\5\"\22\2xt\3\2\2\2xu\3"+
		"\2\2\2xv\3\2\2\2xw\3\2\2\2y\33\3\2\2\2z{\7\24\2\2{|\7\60\2\2|}\5\6\4\2"+
		"}\35\3\2\2\2~\177\7\24\2\2\177\u0080\7-\2\2\u0080\u0081\5*\26\2\u0081"+
		"\u0082\7/\2\2\u0082\37\3\2\2\2\u0083\u0084\7\36\2\2\u0084\u0085\5*\26"+
		"\2\u0085\u0086\7\37\2\2\u0086\u0089\5\30\r\2\u0087\u0088\7 \2\2\u0088"+
		"\u008a\5\30\r\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3"+
		"\2\2\2\u008b\u008c\7!\2\2\u008c!\3\2\2\2\u008d\u008e\7\"\2\2\u008e\u008f"+
		"\5*\26\2\u008f\u0090\7#\2\2\u0090\u0091\5\30\r\2\u0091\u0092\7$\2\2\u0092"+
		"#\3\2\2\2\u0093\u0098\5\34\17\2\u0094\u0095\7\61\2\2\u0095\u0097\5\34"+
		"\17\2\u0096\u0094\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099%\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u00a0\5(\25\2"+
		"\u009c\u009d\7\61\2\2\u009d\u009f\5(\25\2\u009e\u009c\3\2\2\2\u009f\u00a2"+
		"\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\'\3\2\2\2\u00a2"+
		"\u00a0\3\2\2\2\u00a3\u00a4\7\24\2\2\u00a4\u00a5\7\60\2\2\u00a5\u00a8\5"+
		"\6\4\2\u00a6\u00a7\7-\2\2\u00a7\u00a9\5*\26\2\u00a8\u00a6\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9)\3\2\2\2\u00aa\u00ab\b\26\1\2\u00ab\u00ac\7\24\2"+
		"\2\u00ac\u00ad\7-\2\2\u00ad\u00d9\5*\26\"\u00ae\u00af\7\36\2\2\u00af\u00b0"+
		"\5*\26\2\u00b0\u00b1\7\37\2\2\u00b1\u00b2\5*\26\2\u00b2\u00b3\7 \2\2\u00b3"+
		"\u00b4\5*\26\2\u00b4\u00b5\7!\2\2\u00b5\u00d9\3\2\2\2\u00b6\u00b7\7\""+
		"\2\2\u00b7\u00b8\5*\26\2\u00b8\u00b9\7#\2\2\u00b9\u00ba\5*\26\2\u00ba"+
		"\u00bb\7$\2\2\u00bb\u00d9\3\2\2\2\u00bc\u00bd\7*\2\2\u00bd\u00d9\5\6\4"+
		"\2\u00be\u00bf\7+\2\2\u00bf\u00d9\5*\26\35\u00c0\u00c1\7,\2\2\u00c1\u00d9"+
		"\5*\26\20\u00c2\u00c3\7\63\2\2\u00c3\u00c4\5*\26\2\u00c4\u00c5\7\64\2"+
		"\2\u00c5\u00d9\3\2\2\2\u00c6\u00d9\7\24\2\2\u00c7\u00d9\7\25\2\2\u00c8"+
		"\u00d9\7\26\2\2\u00c9\u00d9\7\21\2\2\u00ca\u00d9\7\22\2\2\u00cb\u00d9"+
		"\7\23\2\2\u00cc\u00d9\5 \21\2\u00cd\u00d9\5\"\22\2\u00ce\u00cf\7+\2\2"+
		"\u00cf\u00d9\5*\26\6\u00d0\u00d9\5\30\r\2\u00d1\u00d2\7*\2\2\u00d2\u00d9"+
		"\5\6\4\2\u00d3\u00d4\7%\2\2\u00d4\u00d5\5&\24\2\u00d5\u00d6\7&\2\2\u00d6"+
		"\u00d7\5*\26\3\u00d7\u00d9\3\2\2\2\u00d8\u00aa\3\2\2\2\u00d8\u00ae\3\2"+
		"\2\2\u00d8\u00b6\3\2\2\2\u00d8\u00bc\3\2\2\2\u00d8\u00be\3\2\2\2\u00d8"+
		"\u00c0\3\2\2\2\u00d8\u00c2\3\2\2\2\u00d8\u00c6\3\2\2\2\u00d8\u00c7\3\2"+
		"\2\2\u00d8\u00c8\3\2\2\2\u00d8\u00c9\3\2\2\2\u00d8\u00ca\3\2\2\2\u00d8"+
		"\u00cb\3\2\2\2\u00d8\u00cc\3\2\2\2\u00d8\u00cd\3\2\2\2\u00d8\u00ce\3\2"+
		"\2\2\u00d8\u00d0\3\2\2\2\u00d8\u00d1\3\2\2\2\u00d8\u00d3\3\2\2\2\u00d9"+
		"\u0103\3\2\2\2\u00da\u00db\f\34\2\2\u00db\u00dc\7\6\2\2\u00dc\u0102\5"+
		"*\26\35\u00dd\u00de\f\33\2\2\u00de\u00df\7\5\2\2\u00df\u0102\5*\26\34"+
		"\u00e0\u00e1\f\32\2\2\u00e1\u00e2\7\t\2\2\u00e2\u0102\5*\26\33\u00e3\u00e4"+
		"\f\31\2\2\u00e4\u00e5\7\16\2\2\u00e5\u0102\5*\26\32\u00e6\u00e7\f\30\2"+
		"\2\u00e7\u00e8\7\13\2\2\u00e8\u0102\5*\26\31\u00e9\u00ea\f\27\2\2\u00ea"+
		"\u00eb\7\5\2\2\u00eb\u0102\5*\26\30\u00ec\u00ed\f\26\2\2\u00ed\u00ee\7"+
		"\6\2\2\u00ee\u0102\5*\26\27\u00ef\u00f0\f\25\2\2\u00f0\u00f1\7\7\2\2\u00f1"+
		"\u0102\5*\26\26\u00f2\u00f3\f\24\2\2\u00f3\u00f4\7\b\2\2\u00f4\u0102\5"+
		"*\26\25\u00f5\u00f6\f\23\2\2\u00f6\u00f7\7\17\2\2\u00f7\u0102\5*\26\24"+
		"\u00f8\u00f9\f\22\2\2\u00f9\u00fa\7\20\2\2\u00fa\u0102\5*\26\23\u00fb"+
		"\u00fc\f\21\2\2\u00fc\u00fd\7\n\2\2\u00fd\u0102\5*\26\22\u00fe\u00ff\f"+
		"!\2\2\u00ff\u0100\7\62\2\2\u0100\u0102\7\24\2\2\u0101\u00da\3\2\2\2\u0101"+
		"\u00dd\3\2\2\2\u0101\u00e0\3\2\2\2\u0101\u00e3\3\2\2\2\u0101\u00e6\3\2"+
		"\2\2\u0101\u00e9\3\2\2\2\u0101\u00ec\3\2\2\2\u0101\u00ef\3\2\2\2\u0101"+
		"\u00f2\3\2\2\2\u0101\u00f5\3\2\2\2\u0101\u00f8\3\2\2\2\u0101\u00fb\3\2"+
		"\2\2\u0101\u00fe\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103"+
		"\u0104\3\2\2\2\u0104+\3\2\2\2\u0105\u0103\3\2\2\2\22<FLOS_dqx\u0089\u0098"+
		"\u00a0\u00a8\u00d8\u0101\u0103";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}