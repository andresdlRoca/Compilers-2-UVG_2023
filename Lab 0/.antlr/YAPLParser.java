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
		RULE_unary_op = 4, RULE_program = 5, RULE_feature_list = 6, RULE_feature = 7, 
		RULE_attribute_definition = 8, RULE_method_definition = 9, RULE_block = 10, 
		RULE_statement = 11, RULE_formal = 12, RULE_assignment_statement = 13, 
		RULE_if_statement = 14, RULE_while_statement = 15, RULE_parameter_list = 16, 
		RULE_let_declaration = 17, RULE_let_binding = 18, RULE_expr = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"class", "inherits", "type", "binary_op", "unary_op", "program", "feature_list", 
			"feature", "attribute_definition", "method_definition", "block", "statement", 
			"formal", "assignment_statement", "if_statement", "while_statement", 
			"parameter_list", "let_declaration", "let_binding", "expr"
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
			setState(40);
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
			setState(42);
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
			setState(44);
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
			setState(46);
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
			setState(48);
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
		public TerminalNode ID() { return getToken(YAPLParser.ID, 0); }
		public TerminalNode LBRACE() { return getToken(YAPLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(YAPLParser.RBRACE, 0); }
		public TerminalNode SEMI() { return getToken(YAPLParser.SEMI, 0); }
		public Feature_listContext feature_list() {
			return getRuleContext(Feature_listContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
			setState(50);
			match(T__0);
			setState(51);
			match(ID);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(52);
				match(T__1);
				setState(53);
				type();
				}
			}

			setState(56);
			match(LBRACE);
			{
			setState(57);
			feature_list();
			}
			setState(58);
			match(RBRACE);
			setState(59);
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
		enterRule(_localctx, 12, RULE_feature_list);
		int _la;
		try {
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(61);
					feature();
					}
					}
					setState(66);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(67);
					formal();
					}
					}
					setState(72);
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
		enterRule(_localctx, 14, RULE_feature);
		try {
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				attribute_definition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
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
		public Attribute_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_definition; }
	}

	public final Attribute_definitionContext attribute_definition() throws RecognitionException {
		Attribute_definitionContext _localctx = new Attribute_definitionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_attribute_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(ID);
			setState(80);
			match(COLON);
			setState(81);
			type();
			setState(82);
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

	public static class Method_definitionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(YAPLParser.ID, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(YAPLParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(YAPLParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(YAPLParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(YAPLParser.RBRACE, i);
		}
		public TerminalNode COLON() { return getToken(YAPLParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
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
		enterRule(_localctx, 18, RULE_method_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(ID);
			setState(85);
			match(LBRACE);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(86);
				parameter_list();
				}
			}

			setState(89);
			match(RBRACE);
			setState(90);
			match(COLON);
			setState(91);
			type();
			setState(92);
			match(LBRACE);
			setState(93);
			block();
			setState(94);
			match(RBRACE);
			setState(95);
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
		enterRule(_localctx, 20, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(97);
					statement();
					}
					} 
				}
				setState(102);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
		enterRule(_localctx, 22, RULE_statement);
		try {
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				assignment_statement();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				if_statement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(105);
				while_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		enterRule(_localctx, 24, RULE_formal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(ID);
			setState(109);
			match(COLON);
			setState(110);
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
		enterRule(_localctx, 26, RULE_assignment_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(ID);
			setState(113);
			match(ASSIGN);
			setState(114);
			expr(0);
			setState(115);
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
		enterRule(_localctx, 28, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(IF);
			setState(118);
			expr(0);
			setState(119);
			match(THEN);
			setState(120);
			block();
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(121);
				match(ELSE);
				setState(122);
				block();
				}
			}

			setState(125);
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
		enterRule(_localctx, 30, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(WHILE);
			setState(128);
			expr(0);
			setState(129);
			match(LOOP);
			setState(130);
			block();
			setState(131);
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
		enterRule(_localctx, 32, RULE_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			formal();
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(134);
				match(COMMA);
				setState(135);
				formal();
				}
				}
				setState(140);
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
		enterRule(_localctx, 34, RULE_let_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			let_binding();
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(142);
				match(COMMA);
				setState(143);
				let_binding();
				}
				}
				setState(148);
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
		enterRule(_localctx, 36, RULE_let_binding);
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
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(157);
				match(ID);
				setState(158);
				match(ASSIGN);
				setState(159);
				expr(32);
				}
				break;
			case 2:
				{
				setState(160);
				match(IF);
				setState(161);
				expr(0);
				setState(162);
				match(THEN);
				setState(163);
				expr(0);
				setState(164);
				match(ELSE);
				setState(165);
				expr(0);
				setState(166);
				match(FI);
				}
				break;
			case 3:
				{
				setState(168);
				match(WHILE);
				setState(169);
				expr(0);
				setState(170);
				match(LOOP);
				setState(171);
				expr(0);
				setState(172);
				match(POOL);
				}
				break;
			case 4:
				{
				setState(174);
				match(NEW);
				setState(175);
				type();
				}
				break;
			case 5:
				{
				setState(176);
				match(ISVOID);
				setState(177);
				expr(27);
				}
				break;
			case 6:
				{
				setState(178);
				match(NOT);
				setState(179);
				expr(14);
				}
				break;
			case 7:
				{
				setState(180);
				match(LPAREN);
				setState(181);
				expr(0);
				setState(182);
				match(RPAREN);
				}
				break;
			case 8:
				{
				setState(184);
				match(ID);
				}
				break;
			case 9:
				{
				setState(185);
				match(INT_CONST);
				}
				break;
			case 10:
				{
				setState(186);
				match(STR_CONST);
				}
				break;
			case 11:
				{
				setState(187);
				match(T__14);
				}
				break;
			case 12:
				{
				setState(188);
				match(T__15);
				}
				break;
			case 13:
				{
				setState(189);
				match(T__16);
				}
				break;
			case 14:
				{
				setState(190);
				if_statement();
				}
				break;
			case 15:
				{
				setState(191);
				while_statement();
				}
				break;
			case 16:
				{
				setState(192);
				match(ISVOID);
				setState(193);
				expr(4);
				}
				break;
			case 17:
				{
				setState(194);
				block();
				}
				break;
			case 18:
				{
				setState(195);
				match(NEW);
				setState(196);
				type();
				}
				break;
			case 19:
				{
				setState(197);
				match(LET);
				setState(198);
				let_declaration();
				setState(199);
				match(IN);
				setState(200);
				expr(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(245);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(243);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(204);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(205);
						match(T__3);
						setState(206);
						expr(27);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(207);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(208);
						match(T__2);
						setState(209);
						expr(26);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(210);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(211);
						match(T__6);
						setState(212);
						expr(25);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(213);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(214);
						match(T__11);
						setState(215);
						expr(24);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(216);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(217);
						match(T__8);
						setState(218);
						expr(23);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(219);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(220);
						match(T__2);
						setState(221);
						expr(22);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(222);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(223);
						match(T__3);
						setState(224);
						expr(21);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(225);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(226);
						match(T__4);
						setState(227);
						expr(20);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(228);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(229);
						match(T__5);
						setState(230);
						expr(19);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(231);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(232);
						match(T__12);
						setState(233);
						expr(18);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(234);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(235);
						match(T__13);
						setState(236);
						expr(17);
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(237);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(238);
						match(T__7);
						setState(239);
						expr(16);
						}
						break;
					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(240);
						if (!(precpred(_ctx, 31))) throw new FailedPredicateException(this, "precpred(_ctx, 31)");
						setState(241);
						match(DOT);
						setState(242);
						match(ID);
						}
						break;
					}
					} 
				}
				setState(247);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
		case 19:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\66\u00fb\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\5\79\n\7\3\7\3\7\3\7\3\7\3\7\3\b\7\bA\n\b\f\b\16\bD\13"+
		"\b\3\b\7\bG\n\b\f\b\16\bJ\13\b\5\bL\n\b\3\t\3\t\5\tP\n\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\5\13Z\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\7\fe\n\f\f\f\16\fh\13\f\3\r\3\r\3\r\5\rm\n\r\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20~\n\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\7\22\u008b\n\22"+
		"\f\22\16\22\u008e\13\22\3\23\3\23\3\23\7\23\u0093\n\23\f\23\16\23\u0096"+
		"\13\23\3\24\3\24\3\24\3\24\3\24\5\24\u009d\n\24\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5"+
		"\25\u00cd\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\7\25\u00f6\n\25\f\25\16\25\u00f9\13\25\3\25\2\3(\26\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(\2\5\4\2\24\24\30\35\3\2\5\f\4\2\r\r,,\2\u0112"+
		"\2*\3\2\2\2\4,\3\2\2\2\6.\3\2\2\2\b\60\3\2\2\2\n\62\3\2\2\2\f\64\3\2\2"+
		"\2\16K\3\2\2\2\20O\3\2\2\2\22Q\3\2\2\2\24V\3\2\2\2\26f\3\2\2\2\30l\3\2"+
		"\2\2\32n\3\2\2\2\34r\3\2\2\2\36w\3\2\2\2 \u0081\3\2\2\2\"\u0087\3\2\2"+
		"\2$\u008f\3\2\2\2&\u0097\3\2\2\2(\u00cc\3\2\2\2*+\7\3\2\2+\3\3\2\2\2,"+
		"-\7\4\2\2-\5\3\2\2\2./\t\2\2\2/\7\3\2\2\2\60\61\t\3\2\2\61\t\3\2\2\2\62"+
		"\63\t\4\2\2\63\13\3\2\2\2\64\65\7\3\2\2\658\7\24\2\2\66\67\7\4\2\2\67"+
		"9\5\6\4\28\66\3\2\2\289\3\2\2\29:\3\2\2\2:;\7\65\2\2;<\5\16\b\2<=\7\66"+
		"\2\2=>\7/\2\2>\r\3\2\2\2?A\5\20\t\2@?\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3"+
		"\2\2\2CL\3\2\2\2DB\3\2\2\2EG\5\32\16\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2H"+
		"I\3\2\2\2IL\3\2\2\2JH\3\2\2\2KB\3\2\2\2KH\3\2\2\2L\17\3\2\2\2MP\5\22\n"+
		"\2NP\5\24\13\2OM\3\2\2\2ON\3\2\2\2P\21\3\2\2\2QR\7\24\2\2RS\7\60\2\2S"+
		"T\5\6\4\2TU\7/\2\2U\23\3\2\2\2VW\7\24\2\2WY\7\65\2\2XZ\5\"\22\2YX\3\2"+
		"\2\2YZ\3\2\2\2Z[\3\2\2\2[\\\7\66\2\2\\]\7\60\2\2]^\5\6\4\2^_\7\65\2\2"+
		"_`\5\26\f\2`a\7\66\2\2ab\7/\2\2b\25\3\2\2\2ce\5\30\r\2dc\3\2\2\2eh\3\2"+
		"\2\2fd\3\2\2\2fg\3\2\2\2g\27\3\2\2\2hf\3\2\2\2im\5\34\17\2jm\5\36\20\2"+
		"km\5 \21\2li\3\2\2\2lj\3\2\2\2lk\3\2\2\2m\31\3\2\2\2no\7\24\2\2op\7\60"+
		"\2\2pq\5\6\4\2q\33\3\2\2\2rs\7\24\2\2st\7-\2\2tu\5(\25\2uv\7/\2\2v\35"+
		"\3\2\2\2wx\7\36\2\2xy\5(\25\2yz\7\37\2\2z}\5\26\f\2{|\7 \2\2|~\5\26\f"+
		"\2}{\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177\u0080\7!\2\2\u0080\37\3\2\2\2"+
		"\u0081\u0082\7\"\2\2\u0082\u0083\5(\25\2\u0083\u0084\7#\2\2\u0084\u0085"+
		"\5\26\f\2\u0085\u0086\7$\2\2\u0086!\3\2\2\2\u0087\u008c\5\32\16\2\u0088"+
		"\u0089\7\61\2\2\u0089\u008b\5\32\16\2\u008a\u0088\3\2\2\2\u008b\u008e"+
		"\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d#\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008f\u0094\5&\24\2\u0090\u0091\7\61\2\2\u0091\u0093\5"+
		"&\24\2\u0092\u0090\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095%\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0098\7\24\2\2"+
		"\u0098\u0099\7\60\2\2\u0099\u009c\5\6\4\2\u009a\u009b\7-\2\2\u009b\u009d"+
		"\5(\25\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\'\3\2\2\2\u009e"+
		"\u009f\b\25\1\2\u009f\u00a0\7\24\2\2\u00a0\u00a1\7-\2\2\u00a1\u00cd\5"+
		"(\25\"\u00a2\u00a3\7\36\2\2\u00a3\u00a4\5(\25\2\u00a4\u00a5\7\37\2\2\u00a5"+
		"\u00a6\5(\25\2\u00a6\u00a7\7 \2\2\u00a7\u00a8\5(\25\2\u00a8\u00a9\7!\2"+
		"\2\u00a9\u00cd\3\2\2\2\u00aa\u00ab\7\"\2\2\u00ab\u00ac\5(\25\2\u00ac\u00ad"+
		"\7#\2\2\u00ad\u00ae\5(\25\2\u00ae\u00af\7$\2\2\u00af\u00cd\3\2\2\2\u00b0"+
		"\u00b1\7*\2\2\u00b1\u00cd\5\6\4\2\u00b2\u00b3\7+\2\2\u00b3\u00cd\5(\25"+
		"\35\u00b4\u00b5\7,\2\2\u00b5\u00cd\5(\25\20\u00b6\u00b7\7\63\2\2\u00b7"+
		"\u00b8\5(\25\2\u00b8\u00b9\7\64\2\2\u00b9\u00cd\3\2\2\2\u00ba\u00cd\7"+
		"\24\2\2\u00bb\u00cd\7\25\2\2\u00bc\u00cd\7\26\2\2\u00bd\u00cd\7\21\2\2"+
		"\u00be\u00cd\7\22\2\2\u00bf\u00cd\7\23\2\2\u00c0\u00cd\5\36\20\2\u00c1"+
		"\u00cd\5 \21\2\u00c2\u00c3\7+\2\2\u00c3\u00cd\5(\25\6\u00c4\u00cd\5\26"+
		"\f\2\u00c5\u00c6\7*\2\2\u00c6\u00cd\5\6\4\2\u00c7\u00c8\7%\2\2\u00c8\u00c9"+
		"\5$\23\2\u00c9\u00ca\7&\2\2\u00ca\u00cb\5(\25\3\u00cb\u00cd\3\2\2\2\u00cc"+
		"\u009e\3\2\2\2\u00cc\u00a2\3\2\2\2\u00cc\u00aa\3\2\2\2\u00cc\u00b0\3\2"+
		"\2\2\u00cc\u00b2\3\2\2\2\u00cc\u00b4\3\2\2\2\u00cc\u00b6\3\2\2\2\u00cc"+
		"\u00ba\3\2\2\2\u00cc\u00bb\3\2\2\2\u00cc\u00bc\3\2\2\2\u00cc\u00bd\3\2"+
		"\2\2\u00cc\u00be\3\2\2\2\u00cc\u00bf\3\2\2\2\u00cc\u00c0\3\2\2\2\u00cc"+
		"\u00c1\3\2\2\2\u00cc\u00c2\3\2\2\2\u00cc\u00c4\3\2\2\2\u00cc\u00c5\3\2"+
		"\2\2\u00cc\u00c7\3\2\2\2\u00cd\u00f7\3\2\2\2\u00ce\u00cf\f\34\2\2\u00cf"+
		"\u00d0\7\6\2\2\u00d0\u00f6\5(\25\35\u00d1\u00d2\f\33\2\2\u00d2\u00d3\7"+
		"\5\2\2\u00d3\u00f6\5(\25\34\u00d4\u00d5\f\32\2\2\u00d5\u00d6\7\t\2\2\u00d6"+
		"\u00f6\5(\25\33\u00d7\u00d8\f\31\2\2\u00d8\u00d9\7\16\2\2\u00d9\u00f6"+
		"\5(\25\32\u00da\u00db\f\30\2\2\u00db\u00dc\7\13\2\2\u00dc\u00f6\5(\25"+
		"\31\u00dd\u00de\f\27\2\2\u00de\u00df\7\5\2\2\u00df\u00f6\5(\25\30\u00e0"+
		"\u00e1\f\26\2\2\u00e1\u00e2\7\6\2\2\u00e2\u00f6\5(\25\27\u00e3\u00e4\f"+
		"\25\2\2\u00e4\u00e5\7\7\2\2\u00e5\u00f6\5(\25\26\u00e6\u00e7\f\24\2\2"+
		"\u00e7\u00e8\7\b\2\2\u00e8\u00f6\5(\25\25\u00e9\u00ea\f\23\2\2\u00ea\u00eb"+
		"\7\17\2\2\u00eb\u00f6\5(\25\24\u00ec\u00ed\f\22\2\2\u00ed\u00ee\7\20\2"+
		"\2\u00ee\u00f6\5(\25\23\u00ef\u00f0\f\21\2\2\u00f0\u00f1\7\n\2\2\u00f1"+
		"\u00f6\5(\25\22\u00f2\u00f3\f!\2\2\u00f3\u00f4\7\62\2\2\u00f4\u00f6\7"+
		"\24\2\2\u00f5\u00ce\3\2\2\2\u00f5\u00d1\3\2\2\2\u00f5\u00d4\3\2\2\2\u00f5"+
		"\u00d7\3\2\2\2\u00f5\u00da\3\2\2\2\u00f5\u00dd\3\2\2\2\u00f5\u00e0\3\2"+
		"\2\2\u00f5\u00e3\3\2\2\2\u00f5\u00e6\3\2\2\2\u00f5\u00e9\3\2\2\2\u00f5"+
		"\u00ec\3\2\2\2\u00f5\u00ef\3\2\2\2\u00f5\u00f2\3\2\2\2\u00f6\u00f9\3\2"+
		"\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8)\3\2\2\2\u00f9\u00f7"+
		"\3\2\2\2\218BHKOYfl}\u008c\u0094\u009c\u00cc\u00f5\u00f7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}