// Generated from Solidity.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SolidityParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, T__85=86, T__86=87, 
		T__87=88, T__88=89, T__89=90, T__90=91, T__91=92, T__92=93, T__93=94, 
		T__94=95, NatSpecSingleLine=96, NatSpecMultiLine=97, Int=98, Uint=99, 
		Byte=100, Fixed=101, Ufixed=102, BooleanLiteral=103, DecimalNumber=104, 
		HexNumber=105, NumberUnit=106, HexLiteral=107, ReservedKeyword=108, AnonymousKeyword=109, 
		BreakKeyword=110, ConstantKeyword=111, ContinueKeyword=112, LeaveKeyword=113, 
		ExternalKeyword=114, IndexedKeyword=115, InternalKeyword=116, PayableKeyword=117, 
		PrivateKeyword=118, PublicKeyword=119, PureKeyword=120, TypeKeyword=121, 
		ViewKeyword=122, Identifier=123, StringLiteral=124, WS=125, COMMENT=126, 
		LINE_COMMENT=127;
	public static final int
		RULE_sourceUnit = 0, RULE_pragmaDirective = 1, RULE_pragmaName = 2, RULE_importDeclaration = 3, 
		RULE_importDirective = 4, RULE_natSpec = 5, RULE_contractDefinition = 6, 
		RULE_inheritanceSpecifier = 7, RULE_contractPart = 8, RULE_stateVariableDeclaration = 9, 
		RULE_usingForDeclaration = 10, RULE_structDefinition = 11, RULE_constructorDefinition = 12, 
		RULE_modifierDefinition = 13, RULE_modifierInvocation = 14, RULE_functionDefinition = 15, 
		RULE_returnParameters = 16, RULE_modifierList = 17, RULE_eventDefinition = 18, 
		RULE_enumValue = 19, RULE_enumDefinition = 20, RULE_parameterList = 21, 
		RULE_parameter = 22, RULE_eventParameterList = 23, RULE_eventParameter = 24, 
		RULE_functionTypeParameterList = 25, RULE_functionTypeParameter = 26, 
		RULE_variableDeclaration = 27, RULE_typeName = 28, RULE_userDefinedTypeName = 29, 
		RULE_mapping = 30, RULE_functionTypeName = 31, RULE_storageLocation = 32, 
		RULE_stateMutability = 33, RULE_block = 34, RULE_statement = 35, RULE_expressionStatement = 36, 
		RULE_ifStatement = 37, RULE_tryStatement = 38, RULE_catchClause = 39, 
		RULE_whileStatement = 40, RULE_simpleStatement = 41, RULE_forStatement = 42, 
		RULE_inlineAssemblyStatement = 43, RULE_doWhileStatement = 44, RULE_continueStatement = 45, 
		RULE_breakStatement = 46, RULE_returnStatement = 47, RULE_throwStatement = 48, 
		RULE_emitStatement = 49, RULE_variableDeclarationStatement = 50, RULE_variableDeclarationList = 51, 
		RULE_identifierList = 52, RULE_elementaryTypeName = 53, RULE_expression = 54, 
		RULE_primaryExpression = 55, RULE_expressionList = 56, RULE_newExpression = 57, 
		RULE_nameValueList = 58, RULE_nameValue = 59, RULE_functionCallArguments = 60, 
		RULE_functionCall = 61, RULE_assemblyBlock = 62, RULE_assemblyItem = 63, 
		RULE_assemblyExpression = 64, RULE_assemblyCall = 65, RULE_assemblyLocalDefinition = 66, 
		RULE_assemblyAssignment = 67, RULE_assemblyIdentifierOrList = 68, RULE_assemblyIdentifierList = 69, 
		RULE_assemblyStackAssignment = 70, RULE_labelDefinition = 71, RULE_assemblySwitch = 72, 
		RULE_assemblyCase = 73, RULE_assemblyFunctionDefinition = 74, RULE_assemblyFunctionReturns = 75, 
		RULE_assemblyFor = 76, RULE_assemblyIf = 77, RULE_assemblyLiteral = 78, 
		RULE_subAssembly = 79, RULE_tupleExpression = 80, RULE_typeNameExpression = 81, 
		RULE_numberLiteral = 82, RULE_identifier = 83, RULE_overrideSpecifier = 84;
	private static String[] makeRuleNames() {
		return new String[] {
			"sourceUnit", "pragmaDirective", "pragmaName", "importDeclaration", "importDirective", 
			"natSpec", "contractDefinition", "inheritanceSpecifier", "contractPart", 
			"stateVariableDeclaration", "usingForDeclaration", "structDefinition", 
			"constructorDefinition", "modifierDefinition", "modifierInvocation", 
			"functionDefinition", "returnParameters", "modifierList", "eventDefinition", 
			"enumValue", "enumDefinition", "parameterList", "parameter", "eventParameterList", 
			"eventParameter", "functionTypeParameterList", "functionTypeParameter", 
			"variableDeclaration", "typeName", "userDefinedTypeName", "mapping", 
			"functionTypeName", "storageLocation", "stateMutability", "block", "statement", 
			"expressionStatement", "ifStatement", "tryStatement", "catchClause", 
			"whileStatement", "simpleStatement", "forStatement", "inlineAssemblyStatement", 
			"doWhileStatement", "continueStatement", "breakStatement", "returnStatement", 
			"throwStatement", "emitStatement", "variableDeclarationStatement", "variableDeclarationList", 
			"identifierList", "elementaryTypeName", "expression", "primaryExpression", 
			"expressionList", "newExpression", "nameValueList", "nameValue", "functionCallArguments", 
			"functionCall", "assemblyBlock", "assemblyItem", "assemblyExpression", 
			"assemblyCall", "assemblyLocalDefinition", "assemblyAssignment", "assemblyIdentifierOrList", 
			"assemblyIdentifierList", "assemblyStackAssignment", "labelDefinition", 
			"assemblySwitch", "assemblyCase", "assemblyFunctionDefinition", "assemblyFunctionReturns", 
			"assemblyFor", "assemblyIf", "assemblyLiteral", "subAssembly", "tupleExpression", 
			"typeNameExpression", "numberLiteral", "identifier", "overrideSpecifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'pragma'", "';'", "'as'", "'import'", "'*'", "'from'", "'{'", 
			"','", "'}'", "'abstract'", "'contract'", "'interface'", "'library'", 
			"'is'", "'('", "')'", "'='", "'using'", "'for'", "'struct'", "'constructor'", 
			"'modifier'", "'virtual'", "'function'", "'returns'", "'event'", "'enum'", 
			"'['", "']'", "'address'", "'.'", "'mapping'", "'=>'", "'memory'", "'storage'", 
			"'calldata'", "'if'", "'else'", "'try'", "'catch'", "'while'", "'assembly'", 
			"'do'", "'return'", "'throw'", "'emit'", "'var'", "'bool'", "'string'", 
			"'byte'", "'++'", "'--'", "':'", "'+'", "'-'", "'after'", "'delete'", 
			"'!'", "'~'", "'**'", "'/'", "'%'", "'<<'", "'>>'", "'&'", "'^'", "'|'", 
			"'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'&&'", "'||'", "'?'", 
			"'|='", "'^='", "'&='", "'<<='", "'>>='", "'+='", "'-='", "'*='", "'/='", 
			"'%='", "'new'", "'let'", "':='", "'=:'", "'switch'", "'case'", "'default'", 
			"'->'", "'override'", null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "'anonymous'", "'break'", "'constant'", 
			"'continue'", "'leave'", "'external'", "'indexed'", "'internal'", "'payable'", 
			"'private'", "'public'", "'pure'", "'type'", "'view'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"NatSpecSingleLine", "NatSpecMultiLine", "Int", "Uint", "Byte", "Fixed", 
			"Ufixed", "BooleanLiteral", "DecimalNumber", "HexNumber", "NumberUnit", 
			"HexLiteral", "ReservedKeyword", "AnonymousKeyword", "BreakKeyword", 
			"ConstantKeyword", "ContinueKeyword", "LeaveKeyword", "ExternalKeyword", 
			"IndexedKeyword", "InternalKeyword", "PayableKeyword", "PrivateKeyword", 
			"PublicKeyword", "PureKeyword", "TypeKeyword", "ViewKeyword", "Identifier", 
			"StringLiteral", "WS", "COMMENT", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "Solidity.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SolidityParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SourceUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SolidityParser.EOF, 0); }
		public List<PragmaDirectiveContext> pragmaDirective() {
			return getRuleContexts(PragmaDirectiveContext.class);
		}
		public PragmaDirectiveContext pragmaDirective(int i) {
			return getRuleContext(PragmaDirectiveContext.class,i);
		}
		public List<ImportDirectiveContext> importDirective() {
			return getRuleContexts(ImportDirectiveContext.class);
		}
		public ImportDirectiveContext importDirective(int i) {
			return getRuleContext(ImportDirectiveContext.class,i);
		}
		public List<ContractDefinitionContext> contractDefinition() {
			return getRuleContexts(ContractDefinitionContext.class);
		}
		public ContractDefinitionContext contractDefinition(int i) {
			return getRuleContext(ContractDefinitionContext.class,i);
		}
		public SourceUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterSourceUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitSourceUnit(this);
		}
	}

	public final SourceUnitContext sourceUnit() throws RecognitionException {
		SourceUnitContext _localctx = new SourceUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sourceUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12))) != 0) || _la==NatSpecSingleLine || _la==NatSpecMultiLine) {
				{
				setState(173);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(170);
					pragmaDirective();
					}
					break;
				case T__3:
					{
					setState(171);
					importDirective();
					}
					break;
				case T__9:
				case T__10:
				case T__11:
				case T__12:
				case NatSpecSingleLine:
				case NatSpecMultiLine:
					{
					setState(172);
					contractDefinition();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(178);
			match(EOF);
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

	public static class PragmaDirectiveContext extends ParserRuleContext {
		public PragmaNameContext pragmaName() {
			return getRuleContext(PragmaNameContext.class,0);
		}
		public PragmaDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragmaDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterPragmaDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitPragmaDirective(this);
		}
	}

	public final PragmaDirectiveContext pragmaDirective() throws RecognitionException {
		PragmaDirectiveContext _localctx = new PragmaDirectiveContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_pragmaDirective);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(T__0);
			setState(181);
			pragmaName();
			setState(185);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(182);
					matchWildcard();
					}
					} 
				}
				setState(187);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(188);
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

	public static class PragmaNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SolidityParser.Identifier, 0); }
		public PragmaNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragmaName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterPragmaName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitPragmaName(this);
		}
	}

	public final PragmaNameContext pragmaName() throws RecognitionException {
		PragmaNameContext _localctx = new PragmaNameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pragmaName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(Identifier);
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

	public static class ImportDeclarationContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitImportDeclaration(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			identifier();
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(193);
				match(T__2);
				setState(194);
				identifier();
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

	public static class ImportDirectiveContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(SolidityParser.StringLiteral, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public ImportDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterImportDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitImportDirective(this);
		}
	}

	public final ImportDirectiveContext importDirective() throws RecognitionException {
		ImportDirectiveContext _localctx = new ImportDirectiveContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_importDirective);
		int _la;
		try {
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				match(T__3);
				setState(198);
				match(StringLiteral);
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(199);
					match(T__2);
					setState(200);
					identifier();
					}
				}

				setState(203);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				match(T__3);
				setState(207);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__4:
					{
					setState(205);
					match(T__4);
					}
					break;
				case T__5:
				case T__35:
				case Identifier:
					{
					setState(206);
					identifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(209);
					match(T__2);
					setState(210);
					identifier();
					}
				}

				setState(213);
				match(T__5);
				setState(214);
				match(StringLiteral);
				setState(215);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(216);
				match(T__3);
				setState(217);
				match(T__6);
				setState(218);
				importDeclaration();
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(219);
					match(T__7);
					setState(220);
					importDeclaration();
					}
					}
					setState(225);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(226);
				match(T__8);
				setState(227);
				match(T__5);
				setState(228);
				match(StringLiteral);
				setState(229);
				match(T__1);
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

	public static class NatSpecContext extends ParserRuleContext {
		public TerminalNode NatSpecSingleLine() { return getToken(SolidityParser.NatSpecSingleLine, 0); }
		public TerminalNode NatSpecMultiLine() { return getToken(SolidityParser.NatSpecMultiLine, 0); }
		public NatSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_natSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterNatSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitNatSpec(this);
		}
	}

	public final NatSpecContext natSpec() throws RecognitionException {
		NatSpecContext _localctx = new NatSpecContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_natSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			_la = _input.LA(1);
			if ( !(_la==NatSpecSingleLine || _la==NatSpecMultiLine) ) {
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

	public static class ContractDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NatSpecContext natSpec() {
			return getRuleContext(NatSpecContext.class,0);
		}
		public List<InheritanceSpecifierContext> inheritanceSpecifier() {
			return getRuleContexts(InheritanceSpecifierContext.class);
		}
		public InheritanceSpecifierContext inheritanceSpecifier(int i) {
			return getRuleContext(InheritanceSpecifierContext.class,i);
		}
		public List<ContractPartContext> contractPart() {
			return getRuleContexts(ContractPartContext.class);
		}
		public ContractPartContext contractPart(int i) {
			return getRuleContext(ContractPartContext.class,i);
		}
		public ContractDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contractDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterContractDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitContractDefinition(this);
		}
	}

	public final ContractDefinitionContext contractDefinition() throws RecognitionException {
		ContractDefinitionContext _localctx = new ContractDefinitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_contractDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NatSpecSingleLine || _la==NatSpecMultiLine) {
				{
				setState(235);
				natSpec();
				}
			}

			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(238);
				match(T__9);
				}
			}

			setState(241);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(242);
			identifier();
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(243);
				match(T__13);
				setState(244);
				inheritanceSpecifier();
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(245);
					match(T__7);
					setState(246);
					inheritanceSpecifier();
					}
					}
					setState(251);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(254);
			match(T__6);
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__23) | (1L << T__25) | (1L << T__26) | (1L << T__29) | (1L << T__31) | (1L << T__35) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (NatSpecSingleLine - 96)) | (1L << (NatSpecMultiLine - 96)) | (1L << (Int - 96)) | (1L << (Uint - 96)) | (1L << (Byte - 96)) | (1L << (Fixed - 96)) | (1L << (Ufixed - 96)) | (1L << (Identifier - 96)))) != 0)) {
				{
				{
				setState(255);
				contractPart();
				}
				}
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(261);
			match(T__8);
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

	public static class InheritanceSpecifierContext extends ParserRuleContext {
		public UserDefinedTypeNameContext userDefinedTypeName() {
			return getRuleContext(UserDefinedTypeNameContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public InheritanceSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inheritanceSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterInheritanceSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitInheritanceSpecifier(this);
		}
	}

	public final InheritanceSpecifierContext inheritanceSpecifier() throws RecognitionException {
		InheritanceSpecifierContext _localctx = new InheritanceSpecifierContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_inheritanceSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			userDefinedTypeName();
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(264);
				match(T__14);
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__14) | (1L << T__27) | (1L << T__29) | (1L << T__35) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (T__86 - 87)) | (1L << (Int - 87)) | (1L << (Uint - 87)) | (1L << (Byte - 87)) | (1L << (Fixed - 87)) | (1L << (Ufixed - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (DecimalNumber - 87)) | (1L << (HexNumber - 87)) | (1L << (HexLiteral - 87)) | (1L << (TypeKeyword - 87)) | (1L << (Identifier - 87)) | (1L << (StringLiteral - 87)))) != 0)) {
					{
					setState(265);
					expressionList();
					}
				}

				setState(268);
				match(T__15);
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

	public static class ContractPartContext extends ParserRuleContext {
		public StateVariableDeclarationContext stateVariableDeclaration() {
			return getRuleContext(StateVariableDeclarationContext.class,0);
		}
		public UsingForDeclarationContext usingForDeclaration() {
			return getRuleContext(UsingForDeclarationContext.class,0);
		}
		public StructDefinitionContext structDefinition() {
			return getRuleContext(StructDefinitionContext.class,0);
		}
		public ConstructorDefinitionContext constructorDefinition() {
			return getRuleContext(ConstructorDefinitionContext.class,0);
		}
		public ModifierDefinitionContext modifierDefinition() {
			return getRuleContext(ModifierDefinitionContext.class,0);
		}
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public EventDefinitionContext eventDefinition() {
			return getRuleContext(EventDefinitionContext.class,0);
		}
		public EnumDefinitionContext enumDefinition() {
			return getRuleContext(EnumDefinitionContext.class,0);
		}
		public ContractPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contractPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterContractPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitContractPart(this);
		}
	}

	public final ContractPartContext contractPart() throws RecognitionException {
		ContractPartContext _localctx = new ContractPartContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_contractPart);
		try {
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				stateVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				usingForDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(273);
				structDefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(274);
				constructorDefinition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(275);
				modifierDefinition();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(276);
				functionDefinition();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(277);
				eventDefinition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(278);
				enumDefinition();
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

	public static class StateVariableDeclarationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> PublicKeyword() { return getTokens(SolidityParser.PublicKeyword); }
		public TerminalNode PublicKeyword(int i) {
			return getToken(SolidityParser.PublicKeyword, i);
		}
		public List<TerminalNode> InternalKeyword() { return getTokens(SolidityParser.InternalKeyword); }
		public TerminalNode InternalKeyword(int i) {
			return getToken(SolidityParser.InternalKeyword, i);
		}
		public List<TerminalNode> PrivateKeyword() { return getTokens(SolidityParser.PrivateKeyword); }
		public TerminalNode PrivateKeyword(int i) {
			return getToken(SolidityParser.PrivateKeyword, i);
		}
		public List<TerminalNode> ConstantKeyword() { return getTokens(SolidityParser.ConstantKeyword); }
		public TerminalNode ConstantKeyword(int i) {
			return getToken(SolidityParser.ConstantKeyword, i);
		}
		public List<OverrideSpecifierContext> overrideSpecifier() {
			return getRuleContexts(OverrideSpecifierContext.class);
		}
		public OverrideSpecifierContext overrideSpecifier(int i) {
			return getRuleContext(OverrideSpecifierContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StateVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterStateVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitStateVariableDeclaration(this);
		}
	}

	public final StateVariableDeclarationContext stateVariableDeclaration() throws RecognitionException {
		StateVariableDeclarationContext _localctx = new StateVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_stateVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			typeName(0);
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (T__94 - 95)) | (1L << (ConstantKeyword - 95)) | (1L << (InternalKeyword - 95)) | (1L << (PrivateKeyword - 95)) | (1L << (PublicKeyword - 95)))) != 0)) {
				{
				setState(287);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PublicKeyword:
					{
					setState(282);
					match(PublicKeyword);
					}
					break;
				case InternalKeyword:
					{
					setState(283);
					match(InternalKeyword);
					}
					break;
				case PrivateKeyword:
					{
					setState(284);
					match(PrivateKeyword);
					}
					break;
				case ConstantKeyword:
					{
					setState(285);
					match(ConstantKeyword);
					}
					break;
				case T__94:
					{
					setState(286);
					overrideSpecifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(292);
			identifier();
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(293);
				match(T__16);
				setState(294);
				expression(0);
				}
			}

			setState(297);
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

	public static class UsingForDeclarationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public UsingForDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingForDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterUsingForDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitUsingForDeclaration(this);
		}
	}

	public final UsingForDeclarationContext usingForDeclaration() throws RecognitionException {
		UsingForDeclarationContext _localctx = new UsingForDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_usingForDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(T__17);
			setState(300);
			identifier();
			setState(301);
			match(T__18);
			setState(304);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				{
				setState(302);
				match(T__4);
				}
				break;
			case T__5:
			case T__23:
			case T__29:
			case T__31:
			case T__35:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case Identifier:
				{
				setState(303);
				typeName(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(306);
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

	public static class StructDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public StructDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterStructDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitStructDefinition(this);
		}
	}

	public final StructDefinitionContext structDefinition() throws RecognitionException {
		StructDefinitionContext _localctx = new StructDefinitionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_structDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(T__19);
			setState(309);
			identifier();
			setState(310);
			match(T__6);
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__23) | (1L << T__29) | (1L << T__31) | (1L << T__35) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49))) != 0) || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (Int - 98)) | (1L << (Uint - 98)) | (1L << (Byte - 98)) | (1L << (Fixed - 98)) | (1L << (Ufixed - 98)) | (1L << (Identifier - 98)))) != 0)) {
				{
				setState(311);
				variableDeclaration();
				setState(312);
				match(T__1);
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__23) | (1L << T__29) | (1L << T__31) | (1L << T__35) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49))) != 0) || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (Int - 98)) | (1L << (Uint - 98)) | (1L << (Byte - 98)) | (1L << (Fixed - 98)) | (1L << (Ufixed - 98)) | (1L << (Identifier - 98)))) != 0)) {
					{
					{
					setState(313);
					variableDeclaration();
					setState(314);
					match(T__1);
					}
					}
					setState(320);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(323);
			match(T__8);
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

	public static class ConstructorDefinitionContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ConstructorDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterConstructorDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitConstructorDefinition(this);
		}
	}

	public final ConstructorDefinitionContext constructorDefinition() throws RecognitionException {
		ConstructorDefinitionContext _localctx = new ConstructorDefinitionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_constructorDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(T__20);
			setState(326);
			parameterList();
			setState(327);
			modifierList();
			setState(328);
			block();
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

	public static class ModifierDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public List<OverrideSpecifierContext> overrideSpecifier() {
			return getRuleContexts(OverrideSpecifierContext.class);
		}
		public OverrideSpecifierContext overrideSpecifier(int i) {
			return getRuleContext(OverrideSpecifierContext.class,i);
		}
		public ModifierDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifierDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterModifierDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitModifierDefinition(this);
		}
	}

	public final ModifierDefinitionContext modifierDefinition() throws RecognitionException {
		ModifierDefinitionContext _localctx = new ModifierDefinitionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_modifierDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(T__21);
			setState(331);
			identifier();
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(332);
				parameterList();
				}
			}

			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__22 || _la==T__94) {
				{
				setState(337);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__22:
					{
					setState(335);
					match(T__22);
					}
					break;
				case T__94:
					{
					setState(336);
					overrideSpecifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(342);
			block();
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

	public static class ModifierInvocationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ModifierInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifierInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterModifierInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitModifierInvocation(this);
		}
	}

	public final ModifierInvocationContext modifierInvocation() throws RecognitionException {
		ModifierInvocationContext _localctx = new ModifierInvocationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_modifierInvocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			identifier();
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(345);
				match(T__14);
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__14) | (1L << T__27) | (1L << T__29) | (1L << T__35) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (T__86 - 87)) | (1L << (Int - 87)) | (1L << (Uint - 87)) | (1L << (Byte - 87)) | (1L << (Fixed - 87)) | (1L << (Ufixed - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (DecimalNumber - 87)) | (1L << (HexNumber - 87)) | (1L << (HexLiteral - 87)) | (1L << (TypeKeyword - 87)) | (1L << (Identifier - 87)) | (1L << (StringLiteral - 87)))) != 0)) {
					{
					setState(346);
					expressionList();
					}
				}

				setState(349);
				match(T__15);
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

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public NatSpecContext natSpec() {
			return getRuleContext(NatSpecContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ReturnParametersContext returnParameters() {
			return getRuleContext(ReturnParametersContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitFunctionDefinition(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NatSpecSingleLine || _la==NatSpecMultiLine) {
				{
				setState(352);
				natSpec();
				}
			}

			setState(355);
			match(T__23);
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5 || _la==T__35 || _la==Identifier) {
				{
				setState(356);
				identifier();
				}
			}

			setState(359);
			parameterList();
			setState(360);
			modifierList();
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(361);
				returnParameters();
				}
			}

			setState(366);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(364);
				match(T__1);
				}
				break;
			case T__6:
				{
				setState(365);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ReturnParametersContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ReturnParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterReturnParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitReturnParameters(this);
		}
	}

	public final ReturnParametersContext returnParameters() throws RecognitionException {
		ReturnParametersContext _localctx = new ReturnParametersContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_returnParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(T__24);
			setState(369);
			parameterList();
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

	public static class ModifierListContext extends ParserRuleContext {
		public List<ModifierInvocationContext> modifierInvocation() {
			return getRuleContexts(ModifierInvocationContext.class);
		}
		public ModifierInvocationContext modifierInvocation(int i) {
			return getRuleContext(ModifierInvocationContext.class,i);
		}
		public List<StateMutabilityContext> stateMutability() {
			return getRuleContexts(StateMutabilityContext.class);
		}
		public StateMutabilityContext stateMutability(int i) {
			return getRuleContext(StateMutabilityContext.class,i);
		}
		public List<TerminalNode> ExternalKeyword() { return getTokens(SolidityParser.ExternalKeyword); }
		public TerminalNode ExternalKeyword(int i) {
			return getToken(SolidityParser.ExternalKeyword, i);
		}
		public List<TerminalNode> PublicKeyword() { return getTokens(SolidityParser.PublicKeyword); }
		public TerminalNode PublicKeyword(int i) {
			return getToken(SolidityParser.PublicKeyword, i);
		}
		public List<TerminalNode> InternalKeyword() { return getTokens(SolidityParser.InternalKeyword); }
		public TerminalNode InternalKeyword(int i) {
			return getToken(SolidityParser.InternalKeyword, i);
		}
		public List<TerminalNode> PrivateKeyword() { return getTokens(SolidityParser.PrivateKeyword); }
		public TerminalNode PrivateKeyword(int i) {
			return getToken(SolidityParser.PrivateKeyword, i);
		}
		public List<OverrideSpecifierContext> overrideSpecifier() {
			return getRuleContexts(OverrideSpecifierContext.class);
		}
		public OverrideSpecifierContext overrideSpecifier(int i) {
			return getRuleContext(OverrideSpecifierContext.class,i);
		}
		public ModifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterModifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitModifierList(this);
		}
	}

	public final ModifierListContext modifierList() throws RecognitionException {
		ModifierListContext _localctx = new ModifierListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_modifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__22) | (1L << T__35))) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (T__94 - 95)) | (1L << (ConstantKeyword - 95)) | (1L << (ExternalKeyword - 95)) | (1L << (InternalKeyword - 95)) | (1L << (PayableKeyword - 95)) | (1L << (PrivateKeyword - 95)) | (1L << (PublicKeyword - 95)) | (1L << (PureKeyword - 95)) | (1L << (ViewKeyword - 95)) | (1L << (Identifier - 95)))) != 0)) {
				{
				setState(379);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__5:
				case T__35:
				case Identifier:
					{
					setState(371);
					modifierInvocation();
					}
					break;
				case ConstantKeyword:
				case PayableKeyword:
				case PureKeyword:
				case ViewKeyword:
					{
					setState(372);
					stateMutability();
					}
					break;
				case ExternalKeyword:
					{
					setState(373);
					match(ExternalKeyword);
					}
					break;
				case PublicKeyword:
					{
					setState(374);
					match(PublicKeyword);
					}
					break;
				case InternalKeyword:
					{
					setState(375);
					match(InternalKeyword);
					}
					break;
				case PrivateKeyword:
					{
					setState(376);
					match(PrivateKeyword);
					}
					break;
				case T__22:
					{
					setState(377);
					match(T__22);
					}
					break;
				case T__94:
					{
					setState(378);
					overrideSpecifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(383);
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

	public static class EventDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EventParameterListContext eventParameterList() {
			return getRuleContext(EventParameterListContext.class,0);
		}
		public NatSpecContext natSpec() {
			return getRuleContext(NatSpecContext.class,0);
		}
		public TerminalNode AnonymousKeyword() { return getToken(SolidityParser.AnonymousKeyword, 0); }
		public EventDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterEventDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitEventDefinition(this);
		}
	}

	public final EventDefinitionContext eventDefinition() throws RecognitionException {
		EventDefinitionContext _localctx = new EventDefinitionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_eventDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NatSpecSingleLine || _la==NatSpecMultiLine) {
				{
				setState(384);
				natSpec();
				}
			}

			setState(387);
			match(T__25);
			setState(388);
			identifier();
			setState(389);
			eventParameterList();
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AnonymousKeyword) {
				{
				setState(390);
				match(AnonymousKeyword);
				}
			}

			setState(393);
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

	public static class EnumValueContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EnumValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterEnumValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitEnumValue(this);
		}
	}

	public final EnumValueContext enumValue() throws RecognitionException {
		EnumValueContext _localctx = new EnumValueContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_enumValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			identifier();
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

	public static class EnumDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<EnumValueContext> enumValue() {
			return getRuleContexts(EnumValueContext.class);
		}
		public EnumValueContext enumValue(int i) {
			return getRuleContext(EnumValueContext.class,i);
		}
		public EnumDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterEnumDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitEnumDefinition(this);
		}
	}

	public final EnumDefinitionContext enumDefinition() throws RecognitionException {
		EnumDefinitionContext _localctx = new EnumDefinitionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_enumDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(T__26);
			setState(398);
			identifier();
			setState(399);
			match(T__6);
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5 || _la==T__35 || _la==Identifier) {
				{
				setState(400);
				enumValue();
				}
			}

			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(403);
				match(T__7);
				setState(404);
				enumValue();
				}
				}
				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(410);
			match(T__8);
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

	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitParameterList(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			match(T__14);
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__23) | (1L << T__29) | (1L << T__31) | (1L << T__35) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49))) != 0) || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (Int - 98)) | (1L << (Uint - 98)) | (1L << (Byte - 98)) | (1L << (Fixed - 98)) | (1L << (Ufixed - 98)) | (1L << (Identifier - 98)))) != 0)) {
				{
				setState(413);
				parameter();
				setState(418);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(414);
					match(T__7);
					setState(415);
					parameter();
					}
					}
					setState(420);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(423);
			match(T__15);
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

	public static class ParameterContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public StorageLocationContext storageLocation() {
			return getRuleContext(StorageLocationContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			typeName(0);
			setState(427);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(426);
				storageLocation();
				}
				break;
			}
			setState(430);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5 || _la==T__35 || _la==Identifier) {
				{
				setState(429);
				identifier();
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

	public static class EventParameterListContext extends ParserRuleContext {
		public List<EventParameterContext> eventParameter() {
			return getRuleContexts(EventParameterContext.class);
		}
		public EventParameterContext eventParameter(int i) {
			return getRuleContext(EventParameterContext.class,i);
		}
		public EventParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterEventParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitEventParameterList(this);
		}
	}

	public final EventParameterListContext eventParameterList() throws RecognitionException {
		EventParameterListContext _localctx = new EventParameterListContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_eventParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			match(T__14);
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__23) | (1L << T__29) | (1L << T__31) | (1L << T__35) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49))) != 0) || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (Int - 98)) | (1L << (Uint - 98)) | (1L << (Byte - 98)) | (1L << (Fixed - 98)) | (1L << (Ufixed - 98)) | (1L << (Identifier - 98)))) != 0)) {
				{
				setState(433);
				eventParameter();
				setState(438);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(434);
					match(T__7);
					setState(435);
					eventParameter();
					}
					}
					setState(440);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(443);
			match(T__15);
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

	public static class EventParameterContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode IndexedKeyword() { return getToken(SolidityParser.IndexedKeyword, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EventParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterEventParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitEventParameter(this);
		}
	}

	public final EventParameterContext eventParameter() throws RecognitionException {
		EventParameterContext _localctx = new EventParameterContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_eventParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			typeName(0);
			setState(447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IndexedKeyword) {
				{
				setState(446);
				match(IndexedKeyword);
				}
			}

			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5 || _la==T__35 || _la==Identifier) {
				{
				setState(449);
				identifier();
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

	public static class FunctionTypeParameterListContext extends ParserRuleContext {
		public List<FunctionTypeParameterContext> functionTypeParameter() {
			return getRuleContexts(FunctionTypeParameterContext.class);
		}
		public FunctionTypeParameterContext functionTypeParameter(int i) {
			return getRuleContext(FunctionTypeParameterContext.class,i);
		}
		public FunctionTypeParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTypeParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterFunctionTypeParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitFunctionTypeParameterList(this);
		}
	}

	public final FunctionTypeParameterListContext functionTypeParameterList() throws RecognitionException {
		FunctionTypeParameterListContext _localctx = new FunctionTypeParameterListContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_functionTypeParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			match(T__14);
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__23) | (1L << T__29) | (1L << T__31) | (1L << T__35) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49))) != 0) || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (Int - 98)) | (1L << (Uint - 98)) | (1L << (Byte - 98)) | (1L << (Fixed - 98)) | (1L << (Ufixed - 98)) | (1L << (Identifier - 98)))) != 0)) {
				{
				setState(453);
				functionTypeParameter();
				setState(458);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(454);
					match(T__7);
					setState(455);
					functionTypeParameter();
					}
					}
					setState(460);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(463);
			match(T__15);
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

	public static class FunctionTypeParameterContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public StorageLocationContext storageLocation() {
			return getRuleContext(StorageLocationContext.class,0);
		}
		public FunctionTypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTypeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterFunctionTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitFunctionTypeParameter(this);
		}
	}

	public final FunctionTypeParameterContext functionTypeParameter() throws RecognitionException {
		FunctionTypeParameterContext _localctx = new FunctionTypeParameterContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_functionTypeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			typeName(0);
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__33) | (1L << T__34) | (1L << T__35))) != 0)) {
				{
				setState(466);
				storageLocation();
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StorageLocationContext storageLocation() {
			return getRuleContext(StorageLocationContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitVariableDeclaration(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			typeName(0);
			setState(471);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(470);
				storageLocation();
				}
				break;
			}
			setState(473);
			identifier();
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

	public static class TypeNameContext extends ParserRuleContext {
		public ElementaryTypeNameContext elementaryTypeName() {
			return getRuleContext(ElementaryTypeNameContext.class,0);
		}
		public UserDefinedTypeNameContext userDefinedTypeName() {
			return getRuleContext(UserDefinedTypeNameContext.class,0);
		}
		public MappingContext mapping() {
			return getRuleContext(MappingContext.class,0);
		}
		public FunctionTypeNameContext functionTypeName() {
			return getRuleContext(FunctionTypeNameContext.class,0);
		}
		public TerminalNode PayableKeyword() { return getToken(SolidityParser.PayableKeyword, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitTypeName(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		return typeName(0);
	}

	private TypeNameContext typeName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeNameContext _localctx = new TypeNameContext(_ctx, _parentState);
		TypeNameContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_typeName, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(476);
				elementaryTypeName();
				}
				break;
			case 2:
				{
				setState(477);
				userDefinedTypeName();
				}
				break;
			case 3:
				{
				setState(478);
				mapping();
				}
				break;
			case 4:
				{
				setState(479);
				functionTypeName();
				}
				break;
			case 5:
				{
				setState(480);
				match(T__29);
				setState(481);
				match(PayableKeyword);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(492);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeName);
					setState(484);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(485);
					match(T__27);
					setState(487);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__14) | (1L << T__27) | (1L << T__29) | (1L << T__35) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (T__86 - 87)) | (1L << (Int - 87)) | (1L << (Uint - 87)) | (1L << (Byte - 87)) | (1L << (Fixed - 87)) | (1L << (Ufixed - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (DecimalNumber - 87)) | (1L << (HexNumber - 87)) | (1L << (HexLiteral - 87)) | (1L << (TypeKeyword - 87)) | (1L << (Identifier - 87)) | (1L << (StringLiteral - 87)))) != 0)) {
						{
						setState(486);
						expression(0);
						}
					}

					setState(489);
					match(T__28);
					}
					} 
				}
				setState(494);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
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

	public static class UserDefinedTypeNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public UserDefinedTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userDefinedTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterUserDefinedTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitUserDefinedTypeName(this);
		}
	}

	public final UserDefinedTypeNameContext userDefinedTypeName() throws RecognitionException {
		UserDefinedTypeNameContext _localctx = new UserDefinedTypeNameContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_userDefinedTypeName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			identifier();
			setState(500);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(496);
					match(T__30);
					setState(497);
					identifier();
					}
					} 
				}
				setState(502);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
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

	public static class MappingContext extends ParserRuleContext {
		public ElementaryTypeNameContext elementaryTypeName() {
			return getRuleContext(ElementaryTypeNameContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public MappingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapping; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterMapping(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitMapping(this);
		}
	}

	public final MappingContext mapping() throws RecognitionException {
		MappingContext _localctx = new MappingContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_mapping);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			match(T__31);
			setState(504);
			match(T__14);
			setState(505);
			elementaryTypeName();
			setState(506);
			match(T__32);
			setState(507);
			typeName(0);
			setState(508);
			match(T__15);
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

	public static class FunctionTypeNameContext extends ParserRuleContext {
		public List<FunctionTypeParameterListContext> functionTypeParameterList() {
			return getRuleContexts(FunctionTypeParameterListContext.class);
		}
		public FunctionTypeParameterListContext functionTypeParameterList(int i) {
			return getRuleContext(FunctionTypeParameterListContext.class,i);
		}
		public List<TerminalNode> InternalKeyword() { return getTokens(SolidityParser.InternalKeyword); }
		public TerminalNode InternalKeyword(int i) {
			return getToken(SolidityParser.InternalKeyword, i);
		}
		public List<TerminalNode> ExternalKeyword() { return getTokens(SolidityParser.ExternalKeyword); }
		public TerminalNode ExternalKeyword(int i) {
			return getToken(SolidityParser.ExternalKeyword, i);
		}
		public List<StateMutabilityContext> stateMutability() {
			return getRuleContexts(StateMutabilityContext.class);
		}
		public StateMutabilityContext stateMutability(int i) {
			return getRuleContext(StateMutabilityContext.class,i);
		}
		public FunctionTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterFunctionTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitFunctionTypeName(this);
		}
	}

	public final FunctionTypeNameContext functionTypeName() throws RecognitionException {
		FunctionTypeNameContext _localctx = new FunctionTypeNameContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_functionTypeName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			match(T__23);
			setState(511);
			functionTypeParameterList();
			setState(517);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(515);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case InternalKeyword:
						{
						setState(512);
						match(InternalKeyword);
						}
						break;
					case ExternalKeyword:
						{
						setState(513);
						match(ExternalKeyword);
						}
						break;
					case ConstantKeyword:
					case PayableKeyword:
					case PureKeyword:
					case ViewKeyword:
						{
						setState(514);
						stateMutability();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(519);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			}
			setState(522);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(520);
				match(T__24);
				setState(521);
				functionTypeParameterList();
				}
				break;
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

	public static class StorageLocationContext extends ParserRuleContext {
		public StorageLocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageLocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterStorageLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitStorageLocation(this);
		}
	}

	public final StorageLocationContext storageLocation() throws RecognitionException {
		StorageLocationContext _localctx = new StorageLocationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_storageLocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__33) | (1L << T__34) | (1L << T__35))) != 0)) ) {
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

	public static class StateMutabilityContext extends ParserRuleContext {
		public TerminalNode PureKeyword() { return getToken(SolidityParser.PureKeyword, 0); }
		public TerminalNode ConstantKeyword() { return getToken(SolidityParser.ConstantKeyword, 0); }
		public TerminalNode ViewKeyword() { return getToken(SolidityParser.ViewKeyword, 0); }
		public TerminalNode PayableKeyword() { return getToken(SolidityParser.PayableKeyword, 0); }
		public StateMutabilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateMutability; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterStateMutability(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitStateMutability(this);
		}
	}

	public final StateMutabilityContext stateMutability() throws RecognitionException {
		StateMutabilityContext _localctx = new StateMutabilityContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_stateMutability);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			_la = _input.LA(1);
			if ( !(((((_la - 111)) & ~0x3f) == 0 && ((1L << (_la - 111)) & ((1L << (ConstantKeyword - 111)) | (1L << (PayableKeyword - 111)) | (1L << (PureKeyword - 111)) | (1L << (ViewKeyword - 111)))) != 0)) ) {
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			match(T__6);
			setState(532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__14) | (1L << T__18) | (1L << T__23) | (1L << T__27) | (1L << T__29) | (1L << T__31) | (1L << T__35) | (1L << T__36) | (1L << T__38) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (T__86 - 87)) | (1L << (Int - 87)) | (1L << (Uint - 87)) | (1L << (Byte - 87)) | (1L << (Fixed - 87)) | (1L << (Ufixed - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (DecimalNumber - 87)) | (1L << (HexNumber - 87)) | (1L << (HexLiteral - 87)) | (1L << (BreakKeyword - 87)) | (1L << (ContinueKeyword - 87)) | (1L << (TypeKeyword - 87)) | (1L << (Identifier - 87)) | (1L << (StringLiteral - 87)))) != 0)) {
				{
				{
				setState(529);
				statement();
				}
				}
				setState(534);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(535);
			match(T__8);
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
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public TryStatementContext tryStatement() {
			return getRuleContext(TryStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public InlineAssemblyStatementContext inlineAssemblyStatement() {
			return getRuleContext(InlineAssemblyStatementContext.class,0);
		}
		public DoWhileStatementContext doWhileStatement() {
			return getRuleContext(DoWhileStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public EmitStatementContext emitStatement() {
			return getRuleContext(EmitStatementContext.class,0);
		}
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_statement);
		try {
			setState(550);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__36:
				enterOuterAlt(_localctx, 1);
				{
				setState(537);
				ifStatement();
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 2);
				{
				setState(538);
				tryStatement();
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 3);
				{
				setState(539);
				whileStatement();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 4);
				{
				setState(540);
				forStatement();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 5);
				{
				setState(541);
				block();
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 6);
				{
				setState(542);
				inlineAssemblyStatement();
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 7);
				{
				setState(543);
				doWhileStatement();
				}
				break;
			case ContinueKeyword:
				enterOuterAlt(_localctx, 8);
				{
				setState(544);
				continueStatement();
				}
				break;
			case BreakKeyword:
				enterOuterAlt(_localctx, 9);
				{
				setState(545);
				breakStatement();
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 10);
				{
				setState(546);
				returnStatement();
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 11);
				{
				setState(547);
				throwStatement();
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 12);
				{
				setState(548);
				emitStatement();
				}
				break;
			case T__5:
			case T__14:
			case T__23:
			case T__27:
			case T__29:
			case T__31:
			case T__35:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__86:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case BooleanLiteral:
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case TypeKeyword:
			case Identifier:
			case StringLiteral:
				enterOuterAlt(_localctx, 13);
				{
				setState(549);
				simpleStatement();
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

	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitExpressionStatement(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			expression(0);
			setState(553);
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

	public static class IfStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			match(T__36);
			setState(556);
			match(T__14);
			setState(557);
			expression(0);
			setState(558);
			match(T__15);
			setState(559);
			statement();
			setState(562);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(560);
				match(T__37);
				setState(561);
				statement();
				}
				break;
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

	public static class TryStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public TryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterTryStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitTryStatement(this);
		}
	}

	public final TryStatementContext tryStatement() throws RecognitionException {
		TryStatementContext _localctx = new TryStatementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_tryStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			match(T__38);
			setState(565);
			expression(0);
			setState(568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(566);
				match(T__24);
				setState(567);
				parameterList();
				}
			}

			setState(570);
			block();
			setState(572); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(571);
				catchClause();
				}
				}
				setState(574); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__39 );
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

	public static class CatchClauseContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitCatchClause(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_catchClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			match(T__39);
			setState(578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5 || _la==T__35 || _la==Identifier) {
				{
				setState(577);
				identifier();
				}
			}

			setState(580);
			parameterList();
			setState(581);
			block();
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

	public static class WhileStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			match(T__40);
			setState(584);
			match(T__14);
			setState(585);
			expression(0);
			setState(586);
			match(T__15);
			setState(587);
			statement();
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

	public static class SimpleStatementContext extends ParserRuleContext {
		public VariableDeclarationStatementContext variableDeclarationStatement() {
			return getRuleContext(VariableDeclarationStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public SimpleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterSimpleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitSimpleStatement(this);
		}
	}

	public final SimpleStatementContext simpleStatement() throws RecognitionException {
		SimpleStatementContext _localctx = new SimpleStatementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_simpleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(589);
				variableDeclarationStatement();
				}
				break;
			case 2:
				{
				setState(590);
				expressionStatement();
				}
				break;
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

	public static class ForStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitForStatement(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			match(T__18);
			setState(594);
			match(T__14);
			setState(597);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__14:
			case T__23:
			case T__27:
			case T__29:
			case T__31:
			case T__35:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__86:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case BooleanLiteral:
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case TypeKeyword:
			case Identifier:
			case StringLiteral:
				{
				setState(595);
				simpleStatement();
				}
				break;
			case T__1:
				{
				setState(596);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(601);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__14:
			case T__27:
			case T__29:
			case T__35:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__86:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case BooleanLiteral:
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case TypeKeyword:
			case Identifier:
			case StringLiteral:
				{
				setState(599);
				expressionStatement();
				}
				break;
			case T__1:
				{
				setState(600);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(604);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__14) | (1L << T__27) | (1L << T__29) | (1L << T__35) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (T__86 - 87)) | (1L << (Int - 87)) | (1L << (Uint - 87)) | (1L << (Byte - 87)) | (1L << (Fixed - 87)) | (1L << (Ufixed - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (DecimalNumber - 87)) | (1L << (HexNumber - 87)) | (1L << (HexLiteral - 87)) | (1L << (TypeKeyword - 87)) | (1L << (Identifier - 87)) | (1L << (StringLiteral - 87)))) != 0)) {
				{
				setState(603);
				expression(0);
				}
			}

			setState(606);
			match(T__15);
			setState(607);
			statement();
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

	public static class InlineAssemblyStatementContext extends ParserRuleContext {
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(SolidityParser.StringLiteral, 0); }
		public InlineAssemblyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineAssemblyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterInlineAssemblyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitInlineAssemblyStatement(this);
		}
	}

	public final InlineAssemblyStatementContext inlineAssemblyStatement() throws RecognitionException {
		InlineAssemblyStatementContext _localctx = new InlineAssemblyStatementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_inlineAssemblyStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			match(T__41);
			setState(611);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==StringLiteral) {
				{
				setState(610);
				match(StringLiteral);
				}
			}

			setState(613);
			assemblyBlock();
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

	public static class DoWhileStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DoWhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterDoWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitDoWhileStatement(this);
		}
	}

	public final DoWhileStatementContext doWhileStatement() throws RecognitionException {
		DoWhileStatementContext _localctx = new DoWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			match(T__42);
			setState(616);
			statement();
			setState(617);
			match(T__40);
			setState(618);
			match(T__14);
			setState(619);
			expression(0);
			setState(620);
			match(T__15);
			setState(621);
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

	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode ContinueKeyword() { return getToken(SolidityParser.ContinueKeyword, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitContinueStatement(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			match(ContinueKeyword);
			setState(624);
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

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode BreakKeyword() { return getToken(SolidityParser.BreakKeyword, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitBreakStatement(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			match(BreakKeyword);
			setState(627);
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitReturnStatement(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(629);
			match(T__43);
			setState(631);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__14) | (1L << T__27) | (1L << T__29) | (1L << T__35) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (T__86 - 87)) | (1L << (Int - 87)) | (1L << (Uint - 87)) | (1L << (Byte - 87)) | (1L << (Fixed - 87)) | (1L << (Ufixed - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (DecimalNumber - 87)) | (1L << (HexNumber - 87)) | (1L << (HexLiteral - 87)) | (1L << (TypeKeyword - 87)) | (1L << (Identifier - 87)) | (1L << (StringLiteral - 87)))) != 0)) {
				{
				setState(630);
				expression(0);
				}
			}

			setState(633);
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

	public static class ThrowStatementContext extends ParserRuleContext {
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitThrowStatement(this);
		}
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
			match(T__44);
			setState(636);
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

	public static class EmitStatementContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public EmitStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emitStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterEmitStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitEmitStatement(this);
		}
	}

	public final EmitStatementContext emitStatement() throws RecognitionException {
		EmitStatementContext _localctx = new EmitStatementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_emitStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			match(T__45);
			setState(639);
			functionCall();
			setState(640);
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

	public static class VariableDeclarationStatementContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public VariableDeclarationListContext variableDeclarationList() {
			return getRuleContext(VariableDeclarationListContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitVariableDeclarationStatement(this);
		}
	}

	public final VariableDeclarationStatementContext variableDeclarationStatement() throws RecognitionException {
		VariableDeclarationStatementContext _localctx = new VariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_variableDeclarationStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(642);
				match(T__46);
				setState(643);
				identifierList();
				}
				break;
			case 2:
				{
				setState(644);
				variableDeclaration();
				}
				break;
			case 3:
				{
				setState(645);
				match(T__14);
				setState(646);
				variableDeclarationList();
				setState(647);
				match(T__15);
				}
				break;
			}
			setState(653);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(651);
				match(T__16);
				setState(652);
				expression(0);
				}
			}

			setState(655);
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

	public static class VariableDeclarationListContext extends ParserRuleContext {
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public VariableDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterVariableDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitVariableDeclarationList(this);
		}
	}

	public final VariableDeclarationListContext variableDeclarationList() throws RecognitionException {
		VariableDeclarationListContext _localctx = new VariableDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_variableDeclarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__23) | (1L << T__29) | (1L << T__31) | (1L << T__35) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49))) != 0) || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (Int - 98)) | (1L << (Uint - 98)) | (1L << (Byte - 98)) | (1L << (Fixed - 98)) | (1L << (Ufixed - 98)) | (1L << (Identifier - 98)))) != 0)) {
				{
				setState(657);
				variableDeclaration();
				}
			}

			setState(666);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(660);
				match(T__7);
				setState(662);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__23) | (1L << T__29) | (1L << T__31) | (1L << T__35) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49))) != 0) || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (Int - 98)) | (1L << (Uint - 98)) | (1L << (Byte - 98)) | (1L << (Fixed - 98)) | (1L << (Ufixed - 98)) | (1L << (Identifier - 98)))) != 0)) {
					{
					setState(661);
					variableDeclaration();
					}
				}

				}
				}
				setState(668);
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

	public static class IdentifierListContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitIdentifierList(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_identifierList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(669);
			match(T__14);
			setState(676);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(671);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__5 || _la==T__35 || _la==Identifier) {
						{
						setState(670);
						identifier();
						}
					}

					setState(673);
					match(T__7);
					}
					} 
				}
				setState(678);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			}
			setState(680);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5 || _la==T__35 || _la==Identifier) {
				{
				setState(679);
				identifier();
				}
			}

			setState(682);
			match(T__15);
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

	public static class ElementaryTypeNameContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(SolidityParser.Int, 0); }
		public TerminalNode Uint() { return getToken(SolidityParser.Uint, 0); }
		public TerminalNode Byte() { return getToken(SolidityParser.Byte, 0); }
		public TerminalNode Fixed() { return getToken(SolidityParser.Fixed, 0); }
		public TerminalNode Ufixed() { return getToken(SolidityParser.Ufixed, 0); }
		public ElementaryTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementaryTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterElementaryTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitElementaryTypeName(this);
		}
	}

	public final ElementaryTypeNameContext elementaryTypeName() throws RecognitionException {
		ElementaryTypeNameContext _localctx = new ElementaryTypeNameContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_elementaryTypeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49))) != 0) || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (Int - 98)) | (1L << (Uint - 98)) | (1L << (Byte - 98)) | (1L << (Fixed - 98)) | (1L << (Ufixed - 98)))) != 0)) ) {
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

	public static class ExpressionContext extends ParserRuleContext {
		public NewExpressionContext newExpression() {
			return getRuleContext(NewExpressionContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FunctionCallArgumentsContext functionCallArguments() {
			return getRuleContext(FunctionCallArgumentsContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 108;
		enterRecursionRule(_localctx, 108, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(687);
				newExpression();
				}
				break;
			case 2:
				{
				setState(688);
				match(T__14);
				setState(689);
				expression(0);
				setState(690);
				match(T__15);
				}
				break;
			case 3:
				{
				setState(692);
				_la = _input.LA(1);
				if ( !(_la==T__50 || _la==T__51) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(693);
				expression(19);
				}
				break;
			case 4:
				{
				setState(694);
				_la = _input.LA(1);
				if ( !(_la==T__53 || _la==T__54) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(695);
				expression(18);
				}
				break;
			case 5:
				{
				setState(696);
				_la = _input.LA(1);
				if ( !(_la==T__55 || _la==T__56) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(697);
				expression(17);
				}
				break;
			case 6:
				{
				setState(698);
				match(T__57);
				setState(699);
				expression(16);
				}
				break;
			case 7:
				{
				setState(700);
				match(T__58);
				setState(701);
				expression(15);
				}
				break;
			case 8:
				{
				setState(702);
				primaryExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(775);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(773);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(705);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(706);
						match(T__59);
						setState(707);
						expression(15);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(708);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(709);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__60) | (1L << T__61))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(710);
						expression(14);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(711);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(712);
						_la = _input.LA(1);
						if ( !(_la==T__53 || _la==T__54) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(713);
						expression(13);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(714);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(715);
						_la = _input.LA(1);
						if ( !(_la==T__62 || _la==T__63) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(716);
						expression(12);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(717);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(718);
						match(T__64);
						setState(719);
						expression(11);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(720);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(721);
						match(T__65);
						setState(722);
						expression(10);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(723);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(724);
						match(T__66);
						setState(725);
						expression(9);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(726);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(727);
						_la = _input.LA(1);
						if ( !(((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (T__67 - 68)) | (1L << (T__68 - 68)) | (1L << (T__69 - 68)) | (1L << (T__70 - 68)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(728);
						expression(8);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(729);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(730);
						_la = _input.LA(1);
						if ( !(_la==T__71 || _la==T__72) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(731);
						expression(7);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(732);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(733);
						match(T__73);
						setState(734);
						expression(6);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(735);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(736);
						match(T__74);
						setState(737);
						expression(5);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(738);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(739);
						match(T__75);
						setState(740);
						expression(0);
						setState(741);
						match(T__52);
						setState(742);
						expression(4);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(744);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(745);
						_la = _input.LA(1);
						if ( !(_la==T__16 || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (T__76 - 77)) | (1L << (T__77 - 77)) | (1L << (T__78 - 77)) | (1L << (T__79 - 77)) | (1L << (T__80 - 77)) | (1L << (T__81 - 77)) | (1L << (T__82 - 77)) | (1L << (T__83 - 77)) | (1L << (T__84 - 77)) | (1L << (T__85 - 77)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(746);
						expression(3);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(747);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(748);
						_la = _input.LA(1);
						if ( !(_la==T__50 || _la==T__51) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(749);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(750);
						match(T__27);
						setState(752);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__14) | (1L << T__27) | (1L << T__29) | (1L << T__35) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (T__86 - 87)) | (1L << (Int - 87)) | (1L << (Uint - 87)) | (1L << (Byte - 87)) | (1L << (Fixed - 87)) | (1L << (Ufixed - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (DecimalNumber - 87)) | (1L << (HexNumber - 87)) | (1L << (HexLiteral - 87)) | (1L << (TypeKeyword - 87)) | (1L << (Identifier - 87)) | (1L << (StringLiteral - 87)))) != 0)) {
							{
							setState(751);
							expression(0);
							}
						}

						setState(754);
						match(T__28);
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(755);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(756);
						match(T__27);
						setState(758);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__14) | (1L << T__27) | (1L << T__29) | (1L << T__35) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (T__86 - 87)) | (1L << (Int - 87)) | (1L << (Uint - 87)) | (1L << (Byte - 87)) | (1L << (Fixed - 87)) | (1L << (Ufixed - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (DecimalNumber - 87)) | (1L << (HexNumber - 87)) | (1L << (HexLiteral - 87)) | (1L << (TypeKeyword - 87)) | (1L << (Identifier - 87)) | (1L << (StringLiteral - 87)))) != 0)) {
							{
							setState(757);
							expression(0);
							}
						}

						setState(760);
						match(T__52);
						setState(762);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__14) | (1L << T__27) | (1L << T__29) | (1L << T__35) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (T__86 - 87)) | (1L << (Int - 87)) | (1L << (Uint - 87)) | (1L << (Byte - 87)) | (1L << (Fixed - 87)) | (1L << (Ufixed - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (DecimalNumber - 87)) | (1L << (HexNumber - 87)) | (1L << (HexLiteral - 87)) | (1L << (TypeKeyword - 87)) | (1L << (Identifier - 87)) | (1L << (StringLiteral - 87)))) != 0)) {
							{
							setState(761);
							expression(0);
							}
						}

						setState(764);
						match(T__28);
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(765);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(766);
						match(T__30);
						setState(767);
						identifier();
						}
						break;
					case 18:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(768);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(769);
						match(T__14);
						setState(770);
						functionCallArguments();
						setState(771);
						match(T__15);
						}
						break;
					}
					} 
				}
				setState(777);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
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

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public TerminalNode BooleanLiteral() { return getToken(SolidityParser.BooleanLiteral, 0); }
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public TerminalNode HexLiteral() { return getToken(SolidityParser.HexLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(SolidityParser.StringLiteral, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TypeKeyword() { return getToken(SolidityParser.TypeKeyword, 0); }
		public TupleExpressionContext tupleExpression() {
			return getRuleContext(TupleExpressionContext.class,0);
		}
		public TypeNameExpressionContext typeNameExpression() {
			return getRuleContext(TypeNameExpressionContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitPrimaryExpression(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_primaryExpression);
		try {
			setState(794);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(778);
				match(BooleanLiteral);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(779);
				numberLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(780);
				match(HexLiteral);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(781);
				match(StringLiteral);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(782);
				identifier();
				setState(785);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
				case 1:
					{
					setState(783);
					match(T__27);
					setState(784);
					match(T__28);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(787);
				match(TypeKeyword);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(788);
				tupleExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(789);
				typeNameExpression();
				setState(792);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(790);
					match(T__27);
					setState(791);
					match(T__28);
					}
					break;
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

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
			expression(0);
			setState(801);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(797);
				match(T__7);
				setState(798);
				expression(0);
				}
				}
				setState(803);
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

	public static class NewExpressionContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public NewExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterNewExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitNewExpression(this);
		}
	}

	public final NewExpressionContext newExpression() throws RecognitionException {
		NewExpressionContext _localctx = new NewExpressionContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_newExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(804);
			match(T__86);
			setState(805);
			typeName(0);
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

	public static class NameValueListContext extends ParserRuleContext {
		public List<NameValueContext> nameValue() {
			return getRuleContexts(NameValueContext.class);
		}
		public NameValueContext nameValue(int i) {
			return getRuleContext(NameValueContext.class,i);
		}
		public NameValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameValueList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterNameValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitNameValueList(this);
		}
	}

	public final NameValueListContext nameValueList() throws RecognitionException {
		NameValueListContext _localctx = new NameValueListContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_nameValueList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(807);
			nameValue();
			setState(812);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(808);
					match(T__7);
					setState(809);
					nameValue();
					}
					} 
				}
				setState(814);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			}
			setState(816);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(815);
				match(T__7);
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

	public static class NameValueContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NameValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterNameValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitNameValue(this);
		}
	}

	public final NameValueContext nameValue() throws RecognitionException {
		NameValueContext _localctx = new NameValueContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_nameValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(818);
			identifier();
			setState(819);
			match(T__52);
			setState(820);
			expression(0);
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

	public static class FunctionCallArgumentsContext extends ParserRuleContext {
		public NameValueListContext nameValueList() {
			return getRuleContext(NameValueListContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public FunctionCallArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterFunctionCallArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitFunctionCallArguments(this);
		}
	}

	public final FunctionCallArgumentsContext functionCallArguments() throws RecognitionException {
		FunctionCallArgumentsContext _localctx = new FunctionCallArgumentsContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_functionCallArguments);
		int _la;
		try {
			setState(830);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(822);
				match(T__6);
				setState(824);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5 || _la==T__35 || _la==Identifier) {
					{
					setState(823);
					nameValueList();
					}
				}

				setState(826);
				match(T__8);
				}
				break;
			case T__5:
			case T__14:
			case T__15:
			case T__27:
			case T__29:
			case T__35:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__86:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case BooleanLiteral:
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case TypeKeyword:
			case Identifier:
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(828);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__14) | (1L << T__27) | (1L << T__29) | (1L << T__35) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (T__86 - 87)) | (1L << (Int - 87)) | (1L << (Uint - 87)) | (1L << (Byte - 87)) | (1L << (Fixed - 87)) | (1L << (Ufixed - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (DecimalNumber - 87)) | (1L << (HexNumber - 87)) | (1L << (HexLiteral - 87)) | (1L << (TypeKeyword - 87)) | (1L << (Identifier - 87)) | (1L << (StringLiteral - 87)))) != 0)) {
					{
					setState(827);
					expressionList();
					}
				}

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

	public static class FunctionCallContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionCallArgumentsContext functionCallArguments() {
			return getRuleContext(FunctionCallArgumentsContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitFunctionCall(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(832);
			expression(0);
			setState(833);
			match(T__14);
			setState(834);
			functionCallArguments();
			setState(835);
			match(T__15);
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

	public static class AssemblyBlockContext extends ParserRuleContext {
		public List<AssemblyItemContext> assemblyItem() {
			return getRuleContexts(AssemblyItemContext.class);
		}
		public AssemblyItemContext assemblyItem(int i) {
			return getRuleContext(AssemblyItemContext.class,i);
		}
		public AssemblyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyBlock(this);
		}
	}

	public final AssemblyBlockContext assemblyBlock() throws RecognitionException {
		AssemblyBlockContext _localctx = new AssemblyBlockContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_assemblyBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(837);
			match(T__6);
			setState(841);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__14) | (1L << T__18) | (1L << T__23) | (1L << T__29) | (1L << T__35) | (1L << T__36) | (1L << T__41) | (1L << T__43) | (1L << T__49))) != 0) || ((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & ((1L << (T__87 - 88)) | (1L << (T__89 - 88)) | (1L << (T__90 - 88)) | (1L << (DecimalNumber - 88)) | (1L << (HexNumber - 88)) | (1L << (HexLiteral - 88)) | (1L << (BreakKeyword - 88)) | (1L << (ContinueKeyword - 88)) | (1L << (LeaveKeyword - 88)) | (1L << (Identifier - 88)) | (1L << (StringLiteral - 88)))) != 0)) {
				{
				{
				setState(838);
				assemblyItem();
				}
				}
				setState(843);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(844);
			match(T__8);
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

	public static class AssemblyItemContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public AssemblyExpressionContext assemblyExpression() {
			return getRuleContext(AssemblyExpressionContext.class,0);
		}
		public AssemblyLocalDefinitionContext assemblyLocalDefinition() {
			return getRuleContext(AssemblyLocalDefinitionContext.class,0);
		}
		public AssemblyAssignmentContext assemblyAssignment() {
			return getRuleContext(AssemblyAssignmentContext.class,0);
		}
		public AssemblyStackAssignmentContext assemblyStackAssignment() {
			return getRuleContext(AssemblyStackAssignmentContext.class,0);
		}
		public LabelDefinitionContext labelDefinition() {
			return getRuleContext(LabelDefinitionContext.class,0);
		}
		public AssemblySwitchContext assemblySwitch() {
			return getRuleContext(AssemblySwitchContext.class,0);
		}
		public AssemblyFunctionDefinitionContext assemblyFunctionDefinition() {
			return getRuleContext(AssemblyFunctionDefinitionContext.class,0);
		}
		public AssemblyForContext assemblyFor() {
			return getRuleContext(AssemblyForContext.class,0);
		}
		public AssemblyIfContext assemblyIf() {
			return getRuleContext(AssemblyIfContext.class,0);
		}
		public TerminalNode BreakKeyword() { return getToken(SolidityParser.BreakKeyword, 0); }
		public TerminalNode ContinueKeyword() { return getToken(SolidityParser.ContinueKeyword, 0); }
		public TerminalNode LeaveKeyword() { return getToken(SolidityParser.LeaveKeyword, 0); }
		public SubAssemblyContext subAssembly() {
			return getRuleContext(SubAssemblyContext.class,0);
		}
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(SolidityParser.StringLiteral, 0); }
		public TerminalNode HexLiteral() { return getToken(SolidityParser.HexLiteral, 0); }
		public AssemblyItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyItem(this);
		}
	}

	public final AssemblyItemContext assemblyItem() throws RecognitionException {
		AssemblyItemContext _localctx = new AssemblyItemContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_assemblyItem);
		try {
			setState(864);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(846);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(847);
				assemblyBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(848);
				assemblyExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(849);
				assemblyLocalDefinition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(850);
				assemblyAssignment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(851);
				assemblyStackAssignment();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(852);
				labelDefinition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(853);
				assemblySwitch();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(854);
				assemblyFunctionDefinition();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(855);
				assemblyFor();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(856);
				assemblyIf();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(857);
				match(BreakKeyword);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(858);
				match(ContinueKeyword);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(859);
				match(LeaveKeyword);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(860);
				subAssembly();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(861);
				numberLiteral();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(862);
				match(StringLiteral);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(863);
				match(HexLiteral);
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

	public static class AssemblyExpressionContext extends ParserRuleContext {
		public AssemblyCallContext assemblyCall() {
			return getRuleContext(AssemblyCallContext.class,0);
		}
		public AssemblyLiteralContext assemblyLiteral() {
			return getRuleContext(AssemblyLiteralContext.class,0);
		}
		public AssemblyExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyExpression(this);
		}
	}

	public final AssemblyExpressionContext assemblyExpression() throws RecognitionException {
		AssemblyExpressionContext _localctx = new AssemblyExpressionContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_assemblyExpression);
		try {
			setState(868);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__29:
			case T__35:
			case T__43:
			case T__49:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(866);
				assemblyCall();
				}
				break;
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(867);
				assemblyLiteral();
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

	public static class AssemblyCallContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<AssemblyExpressionContext> assemblyExpression() {
			return getRuleContexts(AssemblyExpressionContext.class);
		}
		public AssemblyExpressionContext assemblyExpression(int i) {
			return getRuleContext(AssemblyExpressionContext.class,i);
		}
		public AssemblyCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyCall(this);
		}
	}

	public final AssemblyCallContext assemblyCall() throws RecognitionException {
		AssemblyCallContext _localctx = new AssemblyCallContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_assemblyCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(874);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__43:
				{
				setState(870);
				match(T__43);
				}
				break;
			case T__29:
				{
				setState(871);
				match(T__29);
				}
				break;
			case T__49:
				{
				setState(872);
				match(T__49);
				}
				break;
			case T__5:
			case T__35:
			case Identifier:
				{
				setState(873);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(888);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(876);
				match(T__14);
				setState(878);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__29) | (1L << T__35) | (1L << T__43) | (1L << T__49))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (DecimalNumber - 104)) | (1L << (HexNumber - 104)) | (1L << (HexLiteral - 104)) | (1L << (Identifier - 104)) | (1L << (StringLiteral - 104)))) != 0)) {
					{
					setState(877);
					assemblyExpression();
					}
				}

				setState(884);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(880);
					match(T__7);
					setState(881);
					assemblyExpression();
					}
					}
					setState(886);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(887);
				match(T__15);
				}
				break;
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

	public static class AssemblyLocalDefinitionContext extends ParserRuleContext {
		public AssemblyIdentifierOrListContext assemblyIdentifierOrList() {
			return getRuleContext(AssemblyIdentifierOrListContext.class,0);
		}
		public AssemblyExpressionContext assemblyExpression() {
			return getRuleContext(AssemblyExpressionContext.class,0);
		}
		public AssemblyLocalDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyLocalDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyLocalDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyLocalDefinition(this);
		}
	}

	public final AssemblyLocalDefinitionContext assemblyLocalDefinition() throws RecognitionException {
		AssemblyLocalDefinitionContext _localctx = new AssemblyLocalDefinitionContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_assemblyLocalDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(890);
			match(T__87);
			setState(891);
			assemblyIdentifierOrList();
			setState(894);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__88) {
				{
				setState(892);
				match(T__88);
				setState(893);
				assemblyExpression();
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

	public static class AssemblyAssignmentContext extends ParserRuleContext {
		public AssemblyIdentifierOrListContext assemblyIdentifierOrList() {
			return getRuleContext(AssemblyIdentifierOrListContext.class,0);
		}
		public AssemblyExpressionContext assemblyExpression() {
			return getRuleContext(AssemblyExpressionContext.class,0);
		}
		public AssemblyAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyAssignment(this);
		}
	}

	public final AssemblyAssignmentContext assemblyAssignment() throws RecognitionException {
		AssemblyAssignmentContext _localctx = new AssemblyAssignmentContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_assemblyAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(896);
			assemblyIdentifierOrList();
			setState(897);
			match(T__88);
			setState(898);
			assemblyExpression();
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

	public static class AssemblyIdentifierOrListContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssemblyIdentifierListContext assemblyIdentifierList() {
			return getRuleContext(AssemblyIdentifierListContext.class,0);
		}
		public AssemblyIdentifierOrListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyIdentifierOrList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyIdentifierOrList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyIdentifierOrList(this);
		}
	}

	public final AssemblyIdentifierOrListContext assemblyIdentifierOrList() throws RecognitionException {
		AssemblyIdentifierOrListContext _localctx = new AssemblyIdentifierOrListContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_assemblyIdentifierOrList);
		try {
			setState(905);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__35:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(900);
				identifier();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(901);
				match(T__14);
				setState(902);
				assemblyIdentifierList();
				setState(903);
				match(T__15);
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

	public static class AssemblyIdentifierListContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public AssemblyIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyIdentifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyIdentifierList(this);
		}
	}

	public final AssemblyIdentifierListContext assemblyIdentifierList() throws RecognitionException {
		AssemblyIdentifierListContext _localctx = new AssemblyIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_assemblyIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(907);
			identifier();
			setState(912);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(908);
				match(T__7);
				setState(909);
				identifier();
				}
				}
				setState(914);
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

	public static class AssemblyStackAssignmentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssemblyStackAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyStackAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyStackAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyStackAssignment(this);
		}
	}

	public final AssemblyStackAssignmentContext assemblyStackAssignment() throws RecognitionException {
		AssemblyStackAssignmentContext _localctx = new AssemblyStackAssignmentContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_assemblyStackAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(915);
			match(T__89);
			setState(916);
			identifier();
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

	public static class LabelDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LabelDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterLabelDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitLabelDefinition(this);
		}
	}

	public final LabelDefinitionContext labelDefinition() throws RecognitionException {
		LabelDefinitionContext _localctx = new LabelDefinitionContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_labelDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(918);
			identifier();
			setState(919);
			match(T__52);
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

	public static class AssemblySwitchContext extends ParserRuleContext {
		public AssemblyExpressionContext assemblyExpression() {
			return getRuleContext(AssemblyExpressionContext.class,0);
		}
		public List<AssemblyCaseContext> assemblyCase() {
			return getRuleContexts(AssemblyCaseContext.class);
		}
		public AssemblyCaseContext assemblyCase(int i) {
			return getRuleContext(AssemblyCaseContext.class,i);
		}
		public AssemblySwitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblySwitch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblySwitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblySwitch(this);
		}
	}

	public final AssemblySwitchContext assemblySwitch() throws RecognitionException {
		AssemblySwitchContext _localctx = new AssemblySwitchContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_assemblySwitch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(921);
			match(T__90);
			setState(922);
			assemblyExpression();
			setState(926);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__91 || _la==T__92) {
				{
				{
				setState(923);
				assemblyCase();
				}
				}
				setState(928);
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

	public static class AssemblyCaseContext extends ParserRuleContext {
		public AssemblyLiteralContext assemblyLiteral() {
			return getRuleContext(AssemblyLiteralContext.class,0);
		}
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public AssemblyCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyCase(this);
		}
	}

	public final AssemblyCaseContext assemblyCase() throws RecognitionException {
		AssemblyCaseContext _localctx = new AssemblyCaseContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_assemblyCase);
		try {
			setState(935);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__91:
				enterOuterAlt(_localctx, 1);
				{
				setState(929);
				match(T__91);
				setState(930);
				assemblyLiteral();
				setState(931);
				assemblyBlock();
				}
				break;
			case T__92:
				enterOuterAlt(_localctx, 2);
				{
				setState(933);
				match(T__92);
				setState(934);
				assemblyBlock();
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

	public static class AssemblyFunctionDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public AssemblyIdentifierListContext assemblyIdentifierList() {
			return getRuleContext(AssemblyIdentifierListContext.class,0);
		}
		public AssemblyFunctionReturnsContext assemblyFunctionReturns() {
			return getRuleContext(AssemblyFunctionReturnsContext.class,0);
		}
		public AssemblyFunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyFunctionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyFunctionDefinition(this);
		}
	}

	public final AssemblyFunctionDefinitionContext assemblyFunctionDefinition() throws RecognitionException {
		AssemblyFunctionDefinitionContext _localctx = new AssemblyFunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_assemblyFunctionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(937);
			match(T__23);
			setState(938);
			identifier();
			setState(939);
			match(T__14);
			setState(941);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5 || _la==T__35 || _la==Identifier) {
				{
				setState(940);
				assemblyIdentifierList();
				}
			}

			setState(943);
			match(T__15);
			setState(945);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__93) {
				{
				setState(944);
				assemblyFunctionReturns();
				}
			}

			setState(947);
			assemblyBlock();
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

	public static class AssemblyFunctionReturnsContext extends ParserRuleContext {
		public AssemblyIdentifierListContext assemblyIdentifierList() {
			return getRuleContext(AssemblyIdentifierListContext.class,0);
		}
		public AssemblyFunctionReturnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyFunctionReturns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyFunctionReturns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyFunctionReturns(this);
		}
	}

	public final AssemblyFunctionReturnsContext assemblyFunctionReturns() throws RecognitionException {
		AssemblyFunctionReturnsContext _localctx = new AssemblyFunctionReturnsContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_assemblyFunctionReturns);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(949);
			match(T__93);
			setState(950);
			assemblyIdentifierList();
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

	public static class AssemblyForContext extends ParserRuleContext {
		public List<AssemblyExpressionContext> assemblyExpression() {
			return getRuleContexts(AssemblyExpressionContext.class);
		}
		public AssemblyExpressionContext assemblyExpression(int i) {
			return getRuleContext(AssemblyExpressionContext.class,i);
		}
		public List<AssemblyBlockContext> assemblyBlock() {
			return getRuleContexts(AssemblyBlockContext.class);
		}
		public AssemblyBlockContext assemblyBlock(int i) {
			return getRuleContext(AssemblyBlockContext.class,i);
		}
		public AssemblyForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyFor(this);
		}
	}

	public final AssemblyForContext assemblyFor() throws RecognitionException {
		AssemblyForContext _localctx = new AssemblyForContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_assemblyFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(952);
			match(T__18);
			setState(955);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				{
				setState(953);
				assemblyBlock();
				}
				break;
			case T__5:
			case T__29:
			case T__35:
			case T__43:
			case T__49:
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case Identifier:
			case StringLiteral:
				{
				setState(954);
				assemblyExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(957);
			assemblyExpression();
			setState(960);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				{
				setState(958);
				assemblyBlock();
				}
				break;
			case T__5:
			case T__29:
			case T__35:
			case T__43:
			case T__49:
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case Identifier:
			case StringLiteral:
				{
				setState(959);
				assemblyExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(962);
			assemblyBlock();
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

	public static class AssemblyIfContext extends ParserRuleContext {
		public AssemblyExpressionContext assemblyExpression() {
			return getRuleContext(AssemblyExpressionContext.class,0);
		}
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public AssemblyIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyIf(this);
		}
	}

	public final AssemblyIfContext assemblyIf() throws RecognitionException {
		AssemblyIfContext _localctx = new AssemblyIfContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_assemblyIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(964);
			match(T__36);
			setState(965);
			assemblyExpression();
			setState(966);
			assemblyBlock();
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

	public static class AssemblyLiteralContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(SolidityParser.StringLiteral, 0); }
		public TerminalNode DecimalNumber() { return getToken(SolidityParser.DecimalNumber, 0); }
		public TerminalNode HexNumber() { return getToken(SolidityParser.HexNumber, 0); }
		public TerminalNode HexLiteral() { return getToken(SolidityParser.HexLiteral, 0); }
		public AssemblyLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyLiteral(this);
		}
	}

	public final AssemblyLiteralContext assemblyLiteral() throws RecognitionException {
		AssemblyLiteralContext _localctx = new AssemblyLiteralContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_assemblyLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(968);
			_la = _input.LA(1);
			if ( !(((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (DecimalNumber - 104)) | (1L << (HexNumber - 104)) | (1L << (HexLiteral - 104)) | (1L << (StringLiteral - 104)))) != 0)) ) {
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

	public static class SubAssemblyContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public SubAssemblyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subAssembly; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterSubAssembly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitSubAssembly(this);
		}
	}

	public final SubAssemblyContext subAssembly() throws RecognitionException {
		SubAssemblyContext _localctx = new SubAssemblyContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_subAssembly);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(970);
			match(T__41);
			setState(971);
			identifier();
			setState(972);
			assemblyBlock();
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

	public static class TupleExpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TupleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterTupleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitTupleExpression(this);
		}
	}

	public final TupleExpressionContext tupleExpression() throws RecognitionException {
		TupleExpressionContext _localctx = new TupleExpressionContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_tupleExpression);
		int _la;
		try {
			setState(1000);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(974);
				match(T__14);
				{
				setState(976);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__14) | (1L << T__27) | (1L << T__29) | (1L << T__35) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (T__86 - 87)) | (1L << (Int - 87)) | (1L << (Uint - 87)) | (1L << (Byte - 87)) | (1L << (Fixed - 87)) | (1L << (Ufixed - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (DecimalNumber - 87)) | (1L << (HexNumber - 87)) | (1L << (HexLiteral - 87)) | (1L << (TypeKeyword - 87)) | (1L << (Identifier - 87)) | (1L << (StringLiteral - 87)))) != 0)) {
					{
					setState(975);
					expression(0);
					}
				}

				setState(984);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(978);
					match(T__7);
					setState(980);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__14) | (1L << T__27) | (1L << T__29) | (1L << T__35) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (T__86 - 87)) | (1L << (Int - 87)) | (1L << (Uint - 87)) | (1L << (Byte - 87)) | (1L << (Fixed - 87)) | (1L << (Ufixed - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (DecimalNumber - 87)) | (1L << (HexNumber - 87)) | (1L << (HexLiteral - 87)) | (1L << (TypeKeyword - 87)) | (1L << (Identifier - 87)) | (1L << (StringLiteral - 87)))) != 0)) {
						{
						setState(979);
						expression(0);
						}
					}

					}
					}
					setState(986);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(987);
				match(T__15);
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
				setState(988);
				match(T__27);
				setState(997);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__14) | (1L << T__27) | (1L << T__29) | (1L << T__35) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58))) != 0) || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (T__86 - 87)) | (1L << (Int - 87)) | (1L << (Uint - 87)) | (1L << (Byte - 87)) | (1L << (Fixed - 87)) | (1L << (Ufixed - 87)) | (1L << (BooleanLiteral - 87)) | (1L << (DecimalNumber - 87)) | (1L << (HexNumber - 87)) | (1L << (HexLiteral - 87)) | (1L << (TypeKeyword - 87)) | (1L << (Identifier - 87)) | (1L << (StringLiteral - 87)))) != 0)) {
					{
					setState(989);
					expression(0);
					setState(994);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__7) {
						{
						{
						setState(990);
						match(T__7);
						setState(991);
						expression(0);
						}
						}
						setState(996);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(999);
				match(T__28);
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

	public static class TypeNameExpressionContext extends ParserRuleContext {
		public ElementaryTypeNameContext elementaryTypeName() {
			return getRuleContext(ElementaryTypeNameContext.class,0);
		}
		public UserDefinedTypeNameContext userDefinedTypeName() {
			return getRuleContext(UserDefinedTypeNameContext.class,0);
		}
		public TypeNameExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeNameExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterTypeNameExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitTypeNameExpression(this);
		}
	}

	public final TypeNameExpressionContext typeNameExpression() throws RecognitionException {
		TypeNameExpressionContext _localctx = new TypeNameExpressionContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_typeNameExpression);
		try {
			setState(1004);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
				enterOuterAlt(_localctx, 1);
				{
				setState(1002);
				elementaryTypeName();
				}
				break;
			case T__5:
			case T__35:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1003);
				userDefinedTypeName();
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

	public static class NumberLiteralContext extends ParserRuleContext {
		public TerminalNode DecimalNumber() { return getToken(SolidityParser.DecimalNumber, 0); }
		public TerminalNode HexNumber() { return getToken(SolidityParser.HexNumber, 0); }
		public TerminalNode NumberUnit() { return getToken(SolidityParser.NumberUnit, 0); }
		public NumberLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterNumberLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitNumberLiteral(this);
		}
	}

	public final NumberLiteralContext numberLiteral() throws RecognitionException {
		NumberLiteralContext _localctx = new NumberLiteralContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_numberLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1006);
			_la = _input.LA(1);
			if ( !(_la==DecimalNumber || _la==HexNumber) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1008);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				{
				setState(1007);
				match(NumberUnit);
				}
				break;
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SolidityParser.Identifier, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1010);
			_la = _input.LA(1);
			if ( !(_la==T__5 || _la==T__35 || _la==Identifier) ) {
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

	public static class OverrideSpecifierContext extends ParserRuleContext {
		public List<UserDefinedTypeNameContext> userDefinedTypeName() {
			return getRuleContexts(UserDefinedTypeNameContext.class);
		}
		public UserDefinedTypeNameContext userDefinedTypeName(int i) {
			return getRuleContext(UserDefinedTypeNameContext.class,i);
		}
		public OverrideSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_overrideSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterOverrideSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitOverrideSpecifier(this);
		}
	}

	public final OverrideSpecifierContext overrideSpecifier() throws RecognitionException {
		OverrideSpecifierContext _localctx = new OverrideSpecifierContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_overrideSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1012);
			match(T__94);
			setState(1024);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(1013);
				match(T__14);
				setState(1014);
				userDefinedTypeName();
				setState(1019);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(1015);
					match(T__7);
					setState(1016);
					userDefinedTypeName();
					}
					}
					setState(1021);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1022);
				match(T__15);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 28:
			return typeName_sempred((TypeNameContext)_localctx, predIndex);
		case 54:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean typeName_sempred(TypeNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 12);
		case 4:
			return precpred(_ctx, 11);
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 9);
		case 7:
			return precpred(_ctx, 8);
		case 8:
			return precpred(_ctx, 7);
		case 9:
			return precpred(_ctx, 6);
		case 10:
			return precpred(_ctx, 5);
		case 11:
			return precpred(_ctx, 4);
		case 12:
			return precpred(_ctx, 3);
		case 13:
			return precpred(_ctx, 2);
		case 14:
			return precpred(_ctx, 26);
		case 15:
			return precpred(_ctx, 24);
		case 16:
			return precpred(_ctx, 23);
		case 17:
			return precpred(_ctx, 22);
		case 18:
			return precpred(_ctx, 21);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0081\u0405\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\3\2\3\2\3\2\7\2\u00b0\n\2\f\2\16\2\u00b3\13\2\3\2\3\2\3\3"+
		"\3\3\3\3\7\3\u00ba\n\3\f\3\16\3\u00bd\13\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5"+
		"\5\5\u00c6\n\5\3\6\3\6\3\6\3\6\5\6\u00cc\n\6\3\6\3\6\3\6\3\6\5\6\u00d2"+
		"\n\6\3\6\3\6\5\6\u00d6\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u00e0\n"+
		"\6\f\6\16\6\u00e3\13\6\3\6\3\6\3\6\3\6\3\6\5\6\u00ea\n\6\3\7\3\7\3\b\5"+
		"\b\u00ef\n\b\3\b\5\b\u00f2\n\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00fa\n\b\f"+
		"\b\16\b\u00fd\13\b\5\b\u00ff\n\b\3\b\3\b\7\b\u0103\n\b\f\b\16\b\u0106"+
		"\13\b\3\b\3\b\3\t\3\t\3\t\5\t\u010d\n\t\3\t\5\t\u0110\n\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\5\n\u011a\n\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13"+
		"\u0122\n\13\f\13\16\13\u0125\13\13\3\13\3\13\3\13\5\13\u012a\n\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\5\f\u0133\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\7\r\u013f\n\r\f\r\16\r\u0142\13\r\5\r\u0144\n\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\5\17\u0150\n\17\3\17\3\17\7\17\u0154"+
		"\n\17\f\17\16\17\u0157\13\17\3\17\3\17\3\20\3\20\3\20\5\20\u015e\n\20"+
		"\3\20\5\20\u0161\n\20\3\21\5\21\u0164\n\21\3\21\3\21\5\21\u0168\n\21\3"+
		"\21\3\21\3\21\5\21\u016d\n\21\3\21\3\21\5\21\u0171\n\21\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u017e\n\23\f\23\16\23\u0181"+
		"\13\23\3\24\5\24\u0184\n\24\3\24\3\24\3\24\3\24\5\24\u018a\n\24\3\24\3"+
		"\24\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u0194\n\26\3\26\3\26\7\26\u0198"+
		"\n\26\f\26\16\26\u019b\13\26\3\26\3\26\3\27\3\27\3\27\3\27\7\27\u01a3"+
		"\n\27\f\27\16\27\u01a6\13\27\5\27\u01a8\n\27\3\27\3\27\3\30\3\30\5\30"+
		"\u01ae\n\30\3\30\5\30\u01b1\n\30\3\31\3\31\3\31\3\31\7\31\u01b7\n\31\f"+
		"\31\16\31\u01ba\13\31\5\31\u01bc\n\31\3\31\3\31\3\32\3\32\5\32\u01c2\n"+
		"\32\3\32\5\32\u01c5\n\32\3\33\3\33\3\33\3\33\7\33\u01cb\n\33\f\33\16\33"+
		"\u01ce\13\33\5\33\u01d0\n\33\3\33\3\33\3\34\3\34\5\34\u01d6\n\34\3\35"+
		"\3\35\5\35\u01da\n\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36"+
		"\u01e5\n\36\3\36\3\36\3\36\5\36\u01ea\n\36\3\36\7\36\u01ed\n\36\f\36\16"+
		"\36\u01f0\13\36\3\37\3\37\3\37\7\37\u01f5\n\37\f\37\16\37\u01f8\13\37"+
		"\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\7!\u0206\n!\f!\16!\u0209\13!\3!\3"+
		"!\5!\u020d\n!\3\"\3\"\3#\3#\3$\3$\7$\u0215\n$\f$\16$\u0218\13$\3$\3$\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u0229\n%\3&\3&\3&\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\5\'\u0235\n\'\3(\3(\3(\3(\5(\u023b\n(\3(\3(\6(\u023f"+
		"\n(\r(\16(\u0240\3)\3)\5)\u0245\n)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\5"+
		"+\u0252\n+\3,\3,\3,\3,\5,\u0258\n,\3,\3,\5,\u025c\n,\3,\5,\u025f\n,\3"+
		",\3,\3,\3-\3-\5-\u0266\n-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3\60"+
		"\3\60\3\60\3\61\3\61\5\61\u027a\n\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63"+
		"\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u028c\n\64\3\64\3\64"+
		"\5\64\u0290\n\64\3\64\3\64\3\65\5\65\u0295\n\65\3\65\3\65\5\65\u0299\n"+
		"\65\7\65\u029b\n\65\f\65\16\65\u029e\13\65\3\66\3\66\5\66\u02a2\n\66\3"+
		"\66\7\66\u02a5\n\66\f\66\16\66\u02a8\13\66\3\66\5\66\u02ab\n\66\3\66\3"+
		"\66\3\67\3\67\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\58\u02c2"+
		"\n8\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38"+
		"\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38"+
		"\38\38\58\u02f3\n8\38\38\38\38\58\u02f9\n8\38\38\58\u02fd\n8\38\38\38"+
		"\38\38\38\38\38\38\78\u0308\n8\f8\168\u030b\138\39\39\39\39\39\39\39\5"+
		"9\u0314\n9\39\39\39\39\39\59\u031b\n9\59\u031d\n9\3:\3:\3:\7:\u0322\n"+
		":\f:\16:\u0325\13:\3;\3;\3;\3<\3<\3<\7<\u032d\n<\f<\16<\u0330\13<\3<\5"+
		"<\u0333\n<\3=\3=\3=\3=\3>\3>\5>\u033b\n>\3>\3>\5>\u033f\n>\5>\u0341\n"+
		">\3?\3?\3?\3?\3?\3@\3@\7@\u034a\n@\f@\16@\u034d\13@\3@\3@\3A\3A\3A\3A"+
		"\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\5A\u0363\nA\3B\3B\5B\u0367"+
		"\nB\3C\3C\3C\3C\5C\u036d\nC\3C\3C\5C\u0371\nC\3C\3C\7C\u0375\nC\fC\16"+
		"C\u0378\13C\3C\5C\u037b\nC\3D\3D\3D\3D\5D\u0381\nD\3E\3E\3E\3E\3F\3F\3"+
		"F\3F\3F\5F\u038c\nF\3G\3G\3G\7G\u0391\nG\fG\16G\u0394\13G\3H\3H\3H\3I"+
		"\3I\3I\3J\3J\3J\7J\u039f\nJ\fJ\16J\u03a2\13J\3K\3K\3K\3K\3K\3K\5K\u03aa"+
		"\nK\3L\3L\3L\3L\5L\u03b0\nL\3L\3L\5L\u03b4\nL\3L\3L\3M\3M\3M\3N\3N\3N"+
		"\5N\u03be\nN\3N\3N\3N\5N\u03c3\nN\3N\3N\3O\3O\3O\3O\3P\3P\3Q\3Q\3Q\3Q"+
		"\3R\3R\5R\u03d3\nR\3R\3R\5R\u03d7\nR\7R\u03d9\nR\fR\16R\u03dc\13R\3R\3"+
		"R\3R\3R\3R\7R\u03e3\nR\fR\16R\u03e6\13R\5R\u03e8\nR\3R\5R\u03eb\nR\3S"+
		"\3S\5S\u03ef\nS\3T\3T\5T\u03f3\nT\3U\3U\3V\3V\3V\3V\3V\7V\u03fc\nV\fV"+
		"\16V\u03ff\13V\3V\3V\5V\u0403\nV\3V\3\u00bb\4:nW\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnp"+
		"rtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\2\22"+
		"\3\2bc\3\2\r\17\3\2$&\6\2qqwwzz||\5\2  \61\64dh\3\2\65\66\3\289\3\2:;"+
		"\4\2\7\7?@\3\2AB\3\2FI\3\2JK\4\2\23\23OX\5\2jkmm~~\3\2jk\5\2\b\b&&}}\2"+
		"\u0474\2\u00b1\3\2\2\2\4\u00b6\3\2\2\2\6\u00c0\3\2\2\2\b\u00c2\3\2\2\2"+
		"\n\u00e9\3\2\2\2\f\u00eb\3\2\2\2\16\u00ee\3\2\2\2\20\u0109\3\2\2\2\22"+
		"\u0119\3\2\2\2\24\u011b\3\2\2\2\26\u012d\3\2\2\2\30\u0136\3\2\2\2\32\u0147"+
		"\3\2\2\2\34\u014c\3\2\2\2\36\u015a\3\2\2\2 \u0163\3\2\2\2\"\u0172\3\2"+
		"\2\2$\u017f\3\2\2\2&\u0183\3\2\2\2(\u018d\3\2\2\2*\u018f\3\2\2\2,\u019e"+
		"\3\2\2\2.\u01ab\3\2\2\2\60\u01b2\3\2\2\2\62\u01bf\3\2\2\2\64\u01c6\3\2"+
		"\2\2\66\u01d3\3\2\2\28\u01d7\3\2\2\2:\u01e4\3\2\2\2<\u01f1\3\2\2\2>\u01f9"+
		"\3\2\2\2@\u0200\3\2\2\2B\u020e\3\2\2\2D\u0210\3\2\2\2F\u0212\3\2\2\2H"+
		"\u0228\3\2\2\2J\u022a\3\2\2\2L\u022d\3\2\2\2N\u0236\3\2\2\2P\u0242\3\2"+
		"\2\2R\u0249\3\2\2\2T\u0251\3\2\2\2V\u0253\3\2\2\2X\u0263\3\2\2\2Z\u0269"+
		"\3\2\2\2\\\u0271\3\2\2\2^\u0274\3\2\2\2`\u0277\3\2\2\2b\u027d\3\2\2\2"+
		"d\u0280\3\2\2\2f\u028b\3\2\2\2h\u0294\3\2\2\2j\u029f\3\2\2\2l\u02ae\3"+
		"\2\2\2n\u02c1\3\2\2\2p\u031c\3\2\2\2r\u031e\3\2\2\2t\u0326\3\2\2\2v\u0329"+
		"\3\2\2\2x\u0334\3\2\2\2z\u0340\3\2\2\2|\u0342\3\2\2\2~\u0347\3\2\2\2\u0080"+
		"\u0362\3\2\2\2\u0082\u0366\3\2\2\2\u0084\u036c\3\2\2\2\u0086\u037c\3\2"+
		"\2\2\u0088\u0382\3\2\2\2\u008a\u038b\3\2\2\2\u008c\u038d\3\2\2\2\u008e"+
		"\u0395\3\2\2\2\u0090\u0398\3\2\2\2\u0092\u039b\3\2\2\2\u0094\u03a9\3\2"+
		"\2\2\u0096\u03ab\3\2\2\2\u0098\u03b7\3\2\2\2\u009a\u03ba\3\2\2\2\u009c"+
		"\u03c6\3\2\2\2\u009e\u03ca\3\2\2\2\u00a0\u03cc\3\2\2\2\u00a2\u03ea\3\2"+
		"\2\2\u00a4\u03ee\3\2\2\2\u00a6\u03f0\3\2\2\2\u00a8\u03f4\3\2\2\2\u00aa"+
		"\u03f6\3\2\2\2\u00ac\u00b0\5\4\3\2\u00ad\u00b0\5\n\6\2\u00ae\u00b0\5\16"+
		"\b\2\u00af\u00ac\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00ae\3\2\2\2\u00b0"+
		"\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\3\2"+
		"\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b5\7\2\2\3\u00b5\3\3\2\2\2\u00b6\u00b7"+
		"\7\3\2\2\u00b7\u00bb\5\6\4\2\u00b8\u00ba\13\2\2\2\u00b9\u00b8\3\2\2\2"+
		"\u00ba\u00bd\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00be"+
		"\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00bf\7\4\2\2\u00bf\5\3\2\2\2\u00c0"+
		"\u00c1\7}\2\2\u00c1\7\3\2\2\2\u00c2\u00c5\5\u00a8U\2\u00c3\u00c4\7\5\2"+
		"\2\u00c4\u00c6\5\u00a8U\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"\t\3\2\2\2\u00c7\u00c8\7\6\2\2\u00c8\u00cb\7~\2\2\u00c9\u00ca\7\5\2\2"+
		"\u00ca\u00cc\5\u00a8U\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\u00cd\3\2\2\2\u00cd\u00ea\7\4\2\2\u00ce\u00d1\7\6\2\2\u00cf\u00d2\7\7"+
		"\2\2\u00d0\u00d2\5\u00a8U\2\u00d1\u00cf\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d2"+
		"\u00d5\3\2\2\2\u00d3\u00d4\7\5\2\2\u00d4\u00d6\5\u00a8U\2\u00d5\u00d3"+
		"\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\7\b\2\2\u00d8"+
		"\u00d9\7~\2\2\u00d9\u00ea\7\4\2\2\u00da\u00db\7\6\2\2\u00db\u00dc\7\t"+
		"\2\2\u00dc\u00e1\5\b\5\2\u00dd\u00de\7\n\2\2\u00de\u00e0\5\b\5\2\u00df"+
		"\u00dd\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2"+
		"\2\2\u00e2\u00e4\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e5\7\13\2\2\u00e5"+
		"\u00e6\7\b\2\2\u00e6\u00e7\7~\2\2\u00e7\u00e8\7\4\2\2\u00e8\u00ea\3\2"+
		"\2\2\u00e9\u00c7\3\2\2\2\u00e9\u00ce\3\2\2\2\u00e9\u00da\3\2\2\2\u00ea"+
		"\13\3\2\2\2\u00eb\u00ec\t\2\2\2\u00ec\r\3\2\2\2\u00ed\u00ef\5\f\7\2\u00ee"+
		"\u00ed\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00f2\7\f"+
		"\2\2\u00f1\u00f0\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		"\u00f4\t\3\2\2\u00f4\u00fe\5\u00a8U\2\u00f5\u00f6\7\20\2\2\u00f6\u00fb"+
		"\5\20\t\2\u00f7\u00f8\7\n\2\2\u00f8\u00fa\5\20\t\2\u00f9\u00f7\3\2\2\2"+
		"\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00ff"+
		"\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u00f5\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\u0104\7\t\2\2\u0101\u0103\5\22\n\2\u0102\u0101\3"+
		"\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105"+
		"\u0107\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0108\7\13\2\2\u0108\17\3\2\2"+
		"\2\u0109\u010f\5<\37\2\u010a\u010c\7\21\2\2\u010b\u010d\5r:\2\u010c\u010b"+
		"\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0110\7\22\2\2"+
		"\u010f\u010a\3\2\2\2\u010f\u0110\3\2\2\2\u0110\21\3\2\2\2\u0111\u011a"+
		"\5\24\13\2\u0112\u011a\5\26\f\2\u0113\u011a\5\30\r\2\u0114\u011a\5\32"+
		"\16\2\u0115\u011a\5\34\17\2\u0116\u011a\5 \21\2\u0117\u011a\5&\24\2\u0118"+
		"\u011a\5*\26\2\u0119\u0111\3\2\2\2\u0119\u0112\3\2\2\2\u0119\u0113\3\2"+
		"\2\2\u0119\u0114\3\2\2\2\u0119\u0115\3\2\2\2\u0119\u0116\3\2\2\2\u0119"+
		"\u0117\3\2\2\2\u0119\u0118\3\2\2\2\u011a\23\3\2\2\2\u011b\u0123\5:\36"+
		"\2\u011c\u0122\7y\2\2\u011d\u0122\7v\2\2\u011e\u0122\7x\2\2\u011f\u0122"+
		"\7q\2\2\u0120\u0122\5\u00aaV\2\u0121\u011c\3\2\2\2\u0121\u011d\3\2\2\2"+
		"\u0121\u011e\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0120\3\2\2\2\u0122\u0125"+
		"\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0126\3\2\2\2\u0125"+
		"\u0123\3\2\2\2\u0126\u0129\5\u00a8U\2\u0127\u0128\7\23\2\2\u0128\u012a"+
		"\5n8\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b\3\2\2\2\u012b"+
		"\u012c\7\4\2\2\u012c\25\3\2\2\2\u012d\u012e\7\24\2\2\u012e\u012f\5\u00a8"+
		"U\2\u012f\u0132\7\25\2\2\u0130\u0133\7\7\2\2\u0131\u0133\5:\36\2\u0132"+
		"\u0130\3\2\2\2\u0132\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135\7\4"+
		"\2\2\u0135\27\3\2\2\2\u0136\u0137\7\26\2\2\u0137\u0138\5\u00a8U\2\u0138"+
		"\u0143\7\t\2\2\u0139\u013a\58\35\2\u013a\u0140\7\4\2\2\u013b\u013c\58"+
		"\35\2\u013c\u013d\7\4\2\2\u013d\u013f\3\2\2\2\u013e\u013b\3\2\2\2\u013f"+
		"\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0144\3\2"+
		"\2\2\u0142\u0140\3\2\2\2\u0143\u0139\3\2\2\2\u0143\u0144\3\2\2\2\u0144"+
		"\u0145\3\2\2\2\u0145\u0146\7\13\2\2\u0146\31\3\2\2\2\u0147\u0148\7\27"+
		"\2\2\u0148\u0149\5,\27\2\u0149\u014a\5$\23\2\u014a\u014b\5F$\2\u014b\33"+
		"\3\2\2\2\u014c\u014d\7\30\2\2\u014d\u014f\5\u00a8U\2\u014e\u0150\5,\27"+
		"\2\u014f\u014e\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0155\3\2\2\2\u0151\u0154"+
		"\7\31\2\2\u0152\u0154\5\u00aaV\2\u0153\u0151\3\2\2\2\u0153\u0152\3\2\2"+
		"\2\u0154\u0157\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0158"+
		"\3\2\2\2\u0157\u0155\3\2\2\2\u0158\u0159\5F$\2\u0159\35\3\2\2\2\u015a"+
		"\u0160\5\u00a8U\2\u015b\u015d\7\21\2\2\u015c\u015e\5r:\2\u015d\u015c\3"+
		"\2\2\2\u015d\u015e\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0161\7\22\2\2\u0160"+
		"\u015b\3\2\2\2\u0160\u0161\3\2\2\2\u0161\37\3\2\2\2\u0162\u0164\5\f\7"+
		"\2\u0163\u0162\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0167"+
		"\7\32\2\2\u0166\u0168\5\u00a8U\2\u0167\u0166\3\2\2\2\u0167\u0168\3\2\2"+
		"\2\u0168\u0169\3\2\2\2\u0169\u016a\5,\27\2\u016a\u016c\5$\23\2\u016b\u016d"+
		"\5\"\22\2\u016c\u016b\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u0170\3\2\2\2"+
		"\u016e\u0171\7\4\2\2\u016f\u0171\5F$\2\u0170\u016e\3\2\2\2\u0170\u016f"+
		"\3\2\2\2\u0171!\3\2\2\2\u0172\u0173\7\33\2\2\u0173\u0174\5,\27\2\u0174"+
		"#\3\2\2\2\u0175\u017e\5\36\20\2\u0176\u017e\5D#\2\u0177\u017e\7t\2\2\u0178"+
		"\u017e\7y\2\2\u0179\u017e\7v\2\2\u017a\u017e\7x\2\2\u017b\u017e\7\31\2"+
		"\2\u017c\u017e\5\u00aaV\2\u017d\u0175\3\2\2\2\u017d\u0176\3\2\2\2\u017d"+
		"\u0177\3\2\2\2\u017d\u0178\3\2\2\2\u017d\u0179\3\2\2\2\u017d\u017a\3\2"+
		"\2\2\u017d\u017b\3\2\2\2\u017d\u017c\3\2\2\2\u017e\u0181\3\2\2\2\u017f"+
		"\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180%\3\2\2\2\u0181\u017f\3\2\2\2"+
		"\u0182\u0184\5\f\7\2\u0183\u0182\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0185"+
		"\3\2\2\2\u0185\u0186\7\34\2\2\u0186\u0187\5\u00a8U\2\u0187\u0189\5\60"+
		"\31\2\u0188\u018a\7o\2\2\u0189\u0188\3\2\2\2\u0189\u018a\3\2\2\2\u018a"+
		"\u018b\3\2\2\2\u018b\u018c\7\4\2\2\u018c\'\3\2\2\2\u018d\u018e\5\u00a8"+
		"U\2\u018e)\3\2\2\2\u018f\u0190\7\35\2\2\u0190\u0191\5\u00a8U\2\u0191\u0193"+
		"\7\t\2\2\u0192\u0194\5(\25\2\u0193\u0192\3\2\2\2\u0193\u0194\3\2\2\2\u0194"+
		"\u0199\3\2\2\2\u0195\u0196\7\n\2\2\u0196\u0198\5(\25\2\u0197\u0195\3\2"+
		"\2\2\u0198\u019b\3\2\2\2\u0199\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a"+
		"\u019c\3\2\2\2\u019b\u0199\3\2\2\2\u019c\u019d\7\13\2\2\u019d+\3\2\2\2"+
		"\u019e\u01a7\7\21\2\2\u019f\u01a4\5.\30\2\u01a0\u01a1\7\n\2\2\u01a1\u01a3"+
		"\5.\30\2\u01a2\u01a0\3\2\2\2\u01a3\u01a6\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4"+
		"\u01a5\3\2\2\2\u01a5\u01a8\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a7\u019f\3\2"+
		"\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01aa\7\22\2\2\u01aa"+
		"-\3\2\2\2\u01ab\u01ad\5:\36\2\u01ac\u01ae\5B\"\2\u01ad\u01ac\3\2\2\2\u01ad"+
		"\u01ae\3\2\2\2\u01ae\u01b0\3\2\2\2\u01af\u01b1\5\u00a8U\2\u01b0\u01af"+
		"\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1/\3\2\2\2\u01b2\u01bb\7\21\2\2\u01b3"+
		"\u01b8\5\62\32\2\u01b4\u01b5\7\n\2\2\u01b5\u01b7\5\62\32\2\u01b6\u01b4"+
		"\3\2\2\2\u01b7\u01ba\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9"+
		"\u01bc\3\2\2\2\u01ba\u01b8\3\2\2\2\u01bb\u01b3\3\2\2\2\u01bb\u01bc\3\2"+
		"\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01be\7\22\2\2\u01be\61\3\2\2\2\u01bf\u01c1"+
		"\5:\36\2\u01c0\u01c2\7u\2\2\u01c1\u01c0\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2"+
		"\u01c4\3\2\2\2\u01c3\u01c5\5\u00a8U\2\u01c4\u01c3\3\2\2\2\u01c4\u01c5"+
		"\3\2\2\2\u01c5\63\3\2\2\2\u01c6\u01cf\7\21\2\2\u01c7\u01cc\5\66\34\2\u01c8"+
		"\u01c9\7\n\2\2\u01c9\u01cb\5\66\34\2\u01ca\u01c8\3\2\2\2\u01cb\u01ce\3"+
		"\2\2\2\u01cc\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01d0\3\2\2\2\u01ce"+
		"\u01cc\3\2\2\2\u01cf\u01c7\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d1\3\2"+
		"\2\2\u01d1\u01d2\7\22\2\2\u01d2\65\3\2\2\2\u01d3\u01d5\5:\36\2\u01d4\u01d6"+
		"\5B\"\2\u01d5\u01d4\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\67\3\2\2\2\u01d7"+
		"\u01d9\5:\36\2\u01d8\u01da\5B\"\2\u01d9\u01d8\3\2\2\2\u01d9\u01da\3\2"+
		"\2\2\u01da\u01db\3\2\2\2\u01db\u01dc\5\u00a8U\2\u01dc9\3\2\2\2\u01dd\u01de"+
		"\b\36\1\2\u01de\u01e5\5l\67\2\u01df\u01e5\5<\37\2\u01e0\u01e5\5> \2\u01e1"+
		"\u01e5\5@!\2\u01e2\u01e3\7 \2\2\u01e3\u01e5\7w\2\2\u01e4\u01dd\3\2\2\2"+
		"\u01e4\u01df\3\2\2\2\u01e4\u01e0\3\2\2\2\u01e4\u01e1\3\2\2\2\u01e4\u01e2"+
		"\3\2\2\2\u01e5\u01ee\3\2\2\2\u01e6\u01e7\f\5\2\2\u01e7\u01e9\7\36\2\2"+
		"\u01e8\u01ea\5n8\2\u01e9\u01e8\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01eb"+
		"\3\2\2\2\u01eb\u01ed\7\37\2\2\u01ec\u01e6\3\2\2\2\u01ed\u01f0\3\2\2\2"+
		"\u01ee\u01ec\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef;\3\2\2\2\u01f0\u01ee\3"+
		"\2\2\2\u01f1\u01f6\5\u00a8U\2\u01f2\u01f3\7!\2\2\u01f3\u01f5\5\u00a8U"+
		"\2\u01f4\u01f2\3\2\2\2\u01f5\u01f8\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f6\u01f7"+
		"\3\2\2\2\u01f7=\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f9\u01fa\7\"\2\2\u01fa"+
		"\u01fb\7\21\2\2\u01fb\u01fc\5l\67\2\u01fc\u01fd\7#\2\2\u01fd\u01fe\5:"+
		"\36\2\u01fe\u01ff\7\22\2\2\u01ff?\3\2\2\2\u0200\u0201\7\32\2\2\u0201\u0207"+
		"\5\64\33\2\u0202\u0206\7v\2\2\u0203\u0206\7t\2\2\u0204\u0206\5D#\2\u0205"+
		"\u0202\3\2\2\2\u0205\u0203\3\2\2\2\u0205\u0204\3\2\2\2\u0206\u0209\3\2"+
		"\2\2\u0207\u0205\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u020c\3\2\2\2\u0209"+
		"\u0207\3\2\2\2\u020a\u020b\7\33\2\2\u020b\u020d\5\64\33\2\u020c\u020a"+
		"\3\2\2\2\u020c\u020d\3\2\2\2\u020dA\3\2\2\2\u020e\u020f\t\4\2\2\u020f"+
		"C\3\2\2\2\u0210\u0211\t\5\2\2\u0211E\3\2\2\2\u0212\u0216\7\t\2\2\u0213"+
		"\u0215\5H%\2\u0214\u0213\3\2\2\2\u0215\u0218\3\2\2\2\u0216\u0214\3\2\2"+
		"\2\u0216\u0217\3\2\2\2\u0217\u0219\3\2\2\2\u0218\u0216\3\2\2\2\u0219\u021a"+
		"\7\13\2\2\u021aG\3\2\2\2\u021b\u0229\5L\'\2\u021c\u0229\5N(\2\u021d\u0229"+
		"\5R*\2\u021e\u0229\5V,\2\u021f\u0229\5F$\2\u0220\u0229\5X-\2\u0221\u0229"+
		"\5Z.\2\u0222\u0229\5\\/\2\u0223\u0229\5^\60\2\u0224\u0229\5`\61\2\u0225"+
		"\u0229\5b\62\2\u0226\u0229\5d\63\2\u0227\u0229\5T+\2\u0228\u021b\3\2\2"+
		"\2\u0228\u021c\3\2\2\2\u0228\u021d\3\2\2\2\u0228\u021e\3\2\2\2\u0228\u021f"+
		"\3\2\2\2\u0228\u0220\3\2\2\2\u0228\u0221\3\2\2\2\u0228\u0222\3\2\2\2\u0228"+
		"\u0223\3\2\2\2\u0228\u0224\3\2\2\2\u0228\u0225\3\2\2\2\u0228\u0226\3\2"+
		"\2\2\u0228\u0227\3\2\2\2\u0229I\3\2\2\2\u022a\u022b\5n8\2\u022b\u022c"+
		"\7\4\2\2\u022cK\3\2\2\2\u022d\u022e\7\'\2\2\u022e\u022f\7\21\2\2\u022f"+
		"\u0230\5n8\2\u0230\u0231\7\22\2\2\u0231\u0234\5H%\2\u0232\u0233\7(\2\2"+
		"\u0233\u0235\5H%\2\u0234\u0232\3\2\2\2\u0234\u0235\3\2\2\2\u0235M\3\2"+
		"\2\2\u0236\u0237\7)\2\2\u0237\u023a\5n8\2\u0238\u0239\7\33\2\2\u0239\u023b"+
		"\5,\27\2\u023a\u0238\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u023c\3\2\2\2\u023c"+
		"\u023e\5F$\2\u023d\u023f\5P)\2\u023e\u023d\3\2\2\2\u023f\u0240\3\2\2\2"+
		"\u0240\u023e\3\2\2\2\u0240\u0241\3\2\2\2\u0241O\3\2\2\2\u0242\u0244\7"+
		"*\2\2\u0243\u0245\5\u00a8U\2\u0244\u0243\3\2\2\2\u0244\u0245\3\2\2\2\u0245"+
		"\u0246\3\2\2\2\u0246\u0247\5,\27\2\u0247\u0248\5F$\2\u0248Q\3\2\2\2\u0249"+
		"\u024a\7+\2\2\u024a\u024b\7\21\2\2\u024b\u024c\5n8\2\u024c\u024d\7\22"+
		"\2\2\u024d\u024e\5H%\2\u024eS\3\2\2\2\u024f\u0252\5f\64\2\u0250\u0252"+
		"\5J&\2\u0251\u024f\3\2\2\2\u0251\u0250\3\2\2\2\u0252U\3\2\2\2\u0253\u0254"+
		"\7\25\2\2\u0254\u0257\7\21\2\2\u0255\u0258\5T+\2\u0256\u0258\7\4\2\2\u0257"+
		"\u0255\3\2\2\2\u0257\u0256\3\2\2\2\u0258\u025b\3\2\2\2\u0259\u025c\5J"+
		"&\2\u025a\u025c\7\4\2\2\u025b\u0259\3\2\2\2\u025b\u025a\3\2\2\2\u025c"+
		"\u025e\3\2\2\2\u025d\u025f\5n8\2\u025e\u025d\3\2\2\2\u025e\u025f\3\2\2"+
		"\2\u025f\u0260\3\2\2\2\u0260\u0261\7\22\2\2\u0261\u0262\5H%\2\u0262W\3"+
		"\2\2\2\u0263\u0265\7,\2\2\u0264\u0266\7~\2\2\u0265\u0264\3\2\2\2\u0265"+
		"\u0266\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u0268\5~@\2\u0268Y\3\2\2\2\u0269"+
		"\u026a\7-\2\2\u026a\u026b\5H%\2\u026b\u026c\7+\2\2\u026c\u026d\7\21\2"+
		"\2\u026d\u026e\5n8\2\u026e\u026f\7\22\2\2\u026f\u0270\7\4\2\2\u0270[\3"+
		"\2\2\2\u0271\u0272\7r\2\2\u0272\u0273\7\4\2\2\u0273]\3\2\2\2\u0274\u0275"+
		"\7p\2\2\u0275\u0276\7\4\2\2\u0276_\3\2\2\2\u0277\u0279\7.\2\2\u0278\u027a"+
		"\5n8\2\u0279\u0278\3\2\2\2\u0279\u027a\3\2\2\2\u027a\u027b\3\2\2\2\u027b"+
		"\u027c\7\4\2\2\u027ca\3\2\2\2\u027d\u027e\7/\2\2\u027e\u027f\7\4\2\2\u027f"+
		"c\3\2\2\2\u0280\u0281\7\60\2\2\u0281\u0282\5|?\2\u0282\u0283\7\4\2\2\u0283"+
		"e\3\2\2\2\u0284\u0285\7\61\2\2\u0285\u028c\5j\66\2\u0286\u028c\58\35\2"+
		"\u0287\u0288\7\21\2\2\u0288\u0289\5h\65\2\u0289\u028a\7\22\2\2\u028a\u028c"+
		"\3\2\2\2\u028b\u0284\3\2\2\2\u028b\u0286\3\2\2\2\u028b\u0287\3\2\2\2\u028c"+
		"\u028f\3\2\2\2\u028d\u028e\7\23\2\2\u028e\u0290\5n8\2\u028f\u028d\3\2"+
		"\2\2\u028f\u0290\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u0292\7\4\2\2\u0292"+
		"g\3\2\2\2\u0293\u0295\58\35\2\u0294\u0293\3\2\2\2\u0294\u0295\3\2\2\2"+
		"\u0295\u029c\3\2\2\2\u0296\u0298\7\n\2\2\u0297\u0299\58\35\2\u0298\u0297"+
		"\3\2\2\2\u0298\u0299\3\2\2\2\u0299\u029b\3\2\2\2\u029a\u0296\3\2\2\2\u029b"+
		"\u029e\3\2\2\2\u029c\u029a\3\2\2\2\u029c\u029d\3\2\2\2\u029di\3\2\2\2"+
		"\u029e\u029c\3\2\2\2\u029f\u02a6\7\21\2\2\u02a0\u02a2\5\u00a8U\2\u02a1"+
		"\u02a0\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02a5\7\n"+
		"\2\2\u02a4\u02a1\3\2\2\2\u02a5\u02a8\3\2\2\2\u02a6\u02a4\3\2\2\2\u02a6"+
		"\u02a7\3\2\2\2\u02a7\u02aa\3\2\2\2\u02a8\u02a6\3\2\2\2\u02a9\u02ab\5\u00a8"+
		"U\2\u02aa\u02a9\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac"+
		"\u02ad\7\22\2\2\u02adk\3\2\2\2\u02ae\u02af\t\6\2\2\u02afm\3\2\2\2\u02b0"+
		"\u02b1\b8\1\2\u02b1\u02c2\5t;\2\u02b2\u02b3\7\21\2\2\u02b3\u02b4\5n8\2"+
		"\u02b4\u02b5\7\22\2\2\u02b5\u02c2\3\2\2\2\u02b6\u02b7\t\7\2\2\u02b7\u02c2"+
		"\5n8\25\u02b8\u02b9\t\b\2\2\u02b9\u02c2\5n8\24\u02ba\u02bb\t\t\2\2\u02bb"+
		"\u02c2\5n8\23\u02bc\u02bd\7<\2\2\u02bd\u02c2\5n8\22\u02be\u02bf\7=\2\2"+
		"\u02bf\u02c2\5n8\21\u02c0\u02c2\5p9\2\u02c1\u02b0\3\2\2\2\u02c1\u02b2"+
		"\3\2\2\2\u02c1\u02b6\3\2\2\2\u02c1\u02b8\3\2\2\2\u02c1\u02ba\3\2\2\2\u02c1"+
		"\u02bc\3\2\2\2\u02c1\u02be\3\2\2\2\u02c1\u02c0\3\2\2\2\u02c2\u0309\3\2"+
		"\2\2\u02c3\u02c4\f\20\2\2\u02c4\u02c5\7>\2\2\u02c5\u0308\5n8\21\u02c6"+
		"\u02c7\f\17\2\2\u02c7\u02c8\t\n\2\2\u02c8\u0308\5n8\20\u02c9\u02ca\f\16"+
		"\2\2\u02ca\u02cb\t\b\2\2\u02cb\u0308\5n8\17\u02cc\u02cd\f\r\2\2\u02cd"+
		"\u02ce\t\13\2\2\u02ce\u0308\5n8\16\u02cf\u02d0\f\f\2\2\u02d0\u02d1\7C"+
		"\2\2\u02d1\u0308\5n8\r\u02d2\u02d3\f\13\2\2\u02d3\u02d4\7D\2\2\u02d4\u0308"+
		"\5n8\f\u02d5\u02d6\f\n\2\2\u02d6\u02d7\7E\2\2\u02d7\u0308\5n8\13\u02d8"+
		"\u02d9\f\t\2\2\u02d9\u02da\t\f\2\2\u02da\u0308\5n8\n\u02db\u02dc\f\b\2"+
		"\2\u02dc\u02dd\t\r\2\2\u02dd\u0308\5n8\t\u02de\u02df\f\7\2\2\u02df\u02e0"+
		"\7L\2\2\u02e0\u0308\5n8\b\u02e1\u02e2\f\6\2\2\u02e2\u02e3\7M\2\2\u02e3"+
		"\u0308\5n8\7\u02e4\u02e5\f\5\2\2\u02e5\u02e6\7N\2\2\u02e6\u02e7\5n8\2"+
		"\u02e7\u02e8\7\67\2\2\u02e8\u02e9\5n8\6\u02e9\u0308\3\2\2\2\u02ea\u02eb"+
		"\f\4\2\2\u02eb\u02ec\t\16\2\2\u02ec\u0308\5n8\5\u02ed\u02ee\f\34\2\2\u02ee"+
		"\u0308\t\7\2\2\u02ef\u02f0\f\32\2\2\u02f0\u02f2\7\36\2\2\u02f1\u02f3\5"+
		"n8\2\u02f2\u02f1\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4"+
		"\u0308\7\37\2\2\u02f5\u02f6\f\31\2\2\u02f6\u02f8\7\36\2\2\u02f7\u02f9"+
		"\5n8\2\u02f8\u02f7\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa"+
		"\u02fc\7\67\2\2\u02fb\u02fd\5n8\2\u02fc\u02fb\3\2\2\2\u02fc\u02fd\3\2"+
		"\2\2\u02fd\u02fe\3\2\2\2\u02fe\u0308\7\37\2\2\u02ff\u0300\f\30\2\2\u0300"+
		"\u0301\7!\2\2\u0301\u0308\5\u00a8U\2\u0302\u0303\f\27\2\2\u0303\u0304"+
		"\7\21\2\2\u0304\u0305\5z>\2\u0305\u0306\7\22\2\2\u0306\u0308\3\2\2\2\u0307"+
		"\u02c3\3\2\2\2\u0307\u02c6\3\2\2\2\u0307\u02c9\3\2\2\2\u0307\u02cc\3\2"+
		"\2\2\u0307\u02cf\3\2\2\2\u0307\u02d2\3\2\2\2\u0307\u02d5\3\2\2\2\u0307"+
		"\u02d8\3\2\2\2\u0307\u02db\3\2\2\2\u0307\u02de\3\2\2\2\u0307\u02e1\3\2"+
		"\2\2\u0307\u02e4\3\2\2\2\u0307\u02ea\3\2\2\2\u0307\u02ed\3\2\2\2\u0307"+
		"\u02ef\3\2\2\2\u0307\u02f5\3\2\2\2\u0307\u02ff\3\2\2\2\u0307\u0302\3\2"+
		"\2\2\u0308\u030b\3\2\2\2\u0309\u0307\3\2\2\2\u0309\u030a\3\2\2\2\u030a"+
		"o\3\2\2\2\u030b\u0309\3\2\2\2\u030c\u031d\7i\2\2\u030d\u031d\5\u00a6T"+
		"\2\u030e\u031d\7m\2\2\u030f\u031d\7~\2\2\u0310\u0313\5\u00a8U\2\u0311"+
		"\u0312\7\36\2\2\u0312\u0314\7\37\2\2\u0313\u0311\3\2\2\2\u0313\u0314\3"+
		"\2\2\2\u0314\u031d\3\2\2\2\u0315\u031d\7{\2\2\u0316\u031d\5\u00a2R\2\u0317"+
		"\u031a\5\u00a4S\2\u0318\u0319\7\36\2\2\u0319\u031b\7\37\2\2\u031a\u0318"+
		"\3\2\2\2\u031a\u031b\3\2\2\2\u031b\u031d\3\2\2\2\u031c\u030c\3\2\2\2\u031c"+
		"\u030d\3\2\2\2\u031c\u030e\3\2\2\2\u031c\u030f\3\2\2\2\u031c\u0310\3\2"+
		"\2\2\u031c\u0315\3\2\2\2\u031c\u0316\3\2\2\2\u031c\u0317\3\2\2\2\u031d"+
		"q\3\2\2\2\u031e\u0323\5n8\2\u031f\u0320\7\n\2\2\u0320\u0322\5n8\2\u0321"+
		"\u031f\3\2\2\2\u0322\u0325\3\2\2\2\u0323\u0321\3\2\2\2\u0323\u0324\3\2"+
		"\2\2\u0324s\3\2\2\2\u0325\u0323\3\2\2\2\u0326\u0327\7Y\2\2\u0327\u0328"+
		"\5:\36\2\u0328u\3\2\2\2\u0329\u032e\5x=\2\u032a\u032b\7\n\2\2\u032b\u032d"+
		"\5x=\2\u032c\u032a\3\2\2\2\u032d\u0330\3\2\2\2\u032e\u032c\3\2\2\2\u032e"+
		"\u032f\3\2\2\2\u032f\u0332\3\2\2\2\u0330\u032e\3\2\2\2\u0331\u0333\7\n"+
		"\2\2\u0332\u0331\3\2\2\2\u0332\u0333\3\2\2\2\u0333w\3\2\2\2\u0334\u0335"+
		"\5\u00a8U\2\u0335\u0336\7\67\2\2\u0336\u0337\5n8\2\u0337y\3\2\2\2\u0338"+
		"\u033a\7\t\2\2\u0339\u033b\5v<\2\u033a\u0339\3\2\2\2\u033a\u033b\3\2\2"+
		"\2\u033b\u033c\3\2\2\2\u033c\u0341\7\13\2\2\u033d\u033f\5r:\2\u033e\u033d"+
		"\3\2\2\2\u033e\u033f\3\2\2\2\u033f\u0341\3\2\2\2\u0340\u0338\3\2\2\2\u0340"+
		"\u033e\3\2\2\2\u0341{\3\2\2\2\u0342\u0343\5n8\2\u0343\u0344\7\21\2\2\u0344"+
		"\u0345\5z>\2\u0345\u0346\7\22\2\2\u0346}\3\2\2\2\u0347\u034b\7\t\2\2\u0348"+
		"\u034a\5\u0080A\2\u0349\u0348\3\2\2\2\u034a\u034d\3\2\2\2\u034b\u0349"+
		"\3\2\2\2\u034b\u034c\3\2\2\2\u034c\u034e\3\2\2\2\u034d\u034b\3\2\2\2\u034e"+
		"\u034f\7\13\2\2\u034f\177\3\2\2\2\u0350\u0363\5\u00a8U\2\u0351\u0363\5"+
		"~@\2\u0352\u0363\5\u0082B\2\u0353\u0363\5\u0086D\2\u0354\u0363\5\u0088"+
		"E\2\u0355\u0363\5\u008eH\2\u0356\u0363\5\u0090I\2\u0357\u0363\5\u0092"+
		"J\2\u0358\u0363\5\u0096L\2\u0359\u0363\5\u009aN\2\u035a\u0363\5\u009c"+
		"O\2\u035b\u0363\7p\2\2\u035c\u0363\7r\2\2\u035d\u0363\7s\2\2\u035e\u0363"+
		"\5\u00a0Q\2\u035f\u0363\5\u00a6T\2\u0360\u0363\7~\2\2\u0361\u0363\7m\2"+
		"\2\u0362\u0350\3\2\2\2\u0362\u0351\3\2\2\2\u0362\u0352\3\2\2\2\u0362\u0353"+
		"\3\2\2\2\u0362\u0354\3\2\2\2\u0362\u0355\3\2\2\2\u0362\u0356\3\2\2\2\u0362"+
		"\u0357\3\2\2\2\u0362\u0358\3\2\2\2\u0362\u0359\3\2\2\2\u0362\u035a\3\2"+
		"\2\2\u0362\u035b\3\2\2\2\u0362\u035c\3\2\2\2\u0362\u035d\3\2\2\2\u0362"+
		"\u035e\3\2\2\2\u0362\u035f\3\2\2\2\u0362\u0360\3\2\2\2\u0362\u0361\3\2"+
		"\2\2\u0363\u0081\3\2\2\2\u0364\u0367\5\u0084C\2\u0365\u0367\5\u009eP\2"+
		"\u0366\u0364\3\2\2\2\u0366\u0365\3\2\2\2\u0367\u0083\3\2\2\2\u0368\u036d"+
		"\7.\2\2\u0369\u036d\7 \2\2\u036a\u036d\7\64\2\2\u036b\u036d\5\u00a8U\2"+
		"\u036c\u0368\3\2\2\2\u036c\u0369\3\2\2\2\u036c\u036a\3\2\2\2\u036c\u036b"+
		"\3\2\2\2\u036d\u037a\3\2\2\2\u036e\u0370\7\21\2\2\u036f\u0371\5\u0082"+
		"B\2\u0370\u036f\3\2\2\2\u0370\u0371\3\2\2\2\u0371\u0376\3\2\2\2\u0372"+
		"\u0373\7\n\2\2\u0373\u0375\5\u0082B\2\u0374\u0372\3\2\2\2\u0375\u0378"+
		"\3\2\2\2\u0376\u0374\3\2\2\2\u0376\u0377\3\2\2\2\u0377\u0379\3\2\2\2\u0378"+
		"\u0376\3\2\2\2\u0379\u037b\7\22\2\2\u037a\u036e\3\2\2\2\u037a\u037b\3"+
		"\2\2\2\u037b\u0085\3\2\2\2\u037c\u037d\7Z\2\2\u037d\u0380\5\u008aF\2\u037e"+
		"\u037f\7[\2\2\u037f\u0381\5\u0082B\2\u0380\u037e\3\2\2\2\u0380\u0381\3"+
		"\2\2\2\u0381\u0087\3\2\2\2\u0382\u0383\5\u008aF\2\u0383\u0384\7[\2\2\u0384"+
		"\u0385\5\u0082B\2\u0385\u0089\3\2\2\2\u0386\u038c\5\u00a8U\2\u0387\u0388"+
		"\7\21\2\2\u0388\u0389\5\u008cG\2\u0389\u038a\7\22\2\2\u038a\u038c\3\2"+
		"\2\2\u038b\u0386\3\2\2\2\u038b\u0387\3\2\2\2\u038c\u008b\3\2\2\2\u038d"+
		"\u0392\5\u00a8U\2\u038e\u038f\7\n\2\2\u038f\u0391\5\u00a8U\2\u0390\u038e"+
		"\3\2\2\2\u0391\u0394\3\2\2\2\u0392\u0390\3\2\2\2\u0392\u0393\3\2\2\2\u0393"+
		"\u008d\3\2\2\2\u0394\u0392\3\2\2\2\u0395\u0396\7\\\2\2\u0396\u0397\5\u00a8"+
		"U\2\u0397\u008f\3\2\2\2\u0398\u0399\5\u00a8U\2\u0399\u039a\7\67\2\2\u039a"+
		"\u0091\3\2\2\2\u039b\u039c\7]\2\2\u039c\u03a0\5\u0082B\2\u039d\u039f\5"+
		"\u0094K\2\u039e\u039d\3\2\2\2\u039f\u03a2\3\2\2\2\u03a0\u039e\3\2\2\2"+
		"\u03a0\u03a1\3\2\2\2\u03a1\u0093\3\2\2\2\u03a2\u03a0\3\2\2\2\u03a3\u03a4"+
		"\7^\2\2\u03a4\u03a5\5\u009eP\2\u03a5\u03a6\5~@\2\u03a6\u03aa\3\2\2\2\u03a7"+
		"\u03a8\7_\2\2\u03a8\u03aa\5~@\2\u03a9\u03a3\3\2\2\2\u03a9\u03a7\3\2\2"+
		"\2\u03aa\u0095\3\2\2\2\u03ab\u03ac\7\32\2\2\u03ac\u03ad\5\u00a8U\2\u03ad"+
		"\u03af\7\21\2\2\u03ae\u03b0\5\u008cG\2\u03af\u03ae\3\2\2\2\u03af\u03b0"+
		"\3\2\2\2\u03b0\u03b1\3\2\2\2\u03b1\u03b3\7\22\2\2\u03b2\u03b4\5\u0098"+
		"M\2\u03b3\u03b2\3\2\2\2\u03b3\u03b4\3\2\2\2\u03b4\u03b5\3\2\2\2\u03b5"+
		"\u03b6\5~@\2\u03b6\u0097\3\2\2\2\u03b7\u03b8\7`\2\2\u03b8\u03b9\5\u008c"+
		"G\2\u03b9\u0099\3\2\2\2\u03ba\u03bd\7\25\2\2\u03bb\u03be\5~@\2\u03bc\u03be"+
		"\5\u0082B\2\u03bd\u03bb\3\2\2\2\u03bd\u03bc\3\2\2\2\u03be\u03bf\3\2\2"+
		"\2\u03bf\u03c2\5\u0082B\2\u03c0\u03c3\5~@\2\u03c1\u03c3\5\u0082B\2\u03c2"+
		"\u03c0\3\2\2\2\u03c2\u03c1\3\2\2\2\u03c3\u03c4\3\2\2\2\u03c4\u03c5\5~"+
		"@\2\u03c5\u009b\3\2\2\2\u03c6\u03c7\7\'\2\2\u03c7\u03c8\5\u0082B\2\u03c8"+
		"\u03c9\5~@\2\u03c9\u009d\3\2\2\2\u03ca\u03cb\t\17\2\2\u03cb\u009f\3\2"+
		"\2\2\u03cc\u03cd\7,\2\2\u03cd\u03ce\5\u00a8U\2\u03ce\u03cf\5~@\2\u03cf"+
		"\u00a1\3\2\2\2\u03d0\u03d2\7\21\2\2\u03d1\u03d3\5n8\2\u03d2\u03d1\3\2"+
		"\2\2\u03d2\u03d3\3\2\2\2\u03d3\u03da\3\2\2\2\u03d4\u03d6\7\n\2\2\u03d5"+
		"\u03d7\5n8\2\u03d6\u03d5\3\2\2\2\u03d6\u03d7\3\2\2\2\u03d7\u03d9\3\2\2"+
		"\2\u03d8\u03d4\3\2\2\2\u03d9\u03dc\3\2\2\2\u03da\u03d8\3\2\2\2\u03da\u03db"+
		"\3\2\2\2\u03db\u03dd\3\2\2\2\u03dc\u03da\3\2\2\2\u03dd\u03eb\7\22\2\2"+
		"\u03de\u03e7\7\36\2\2\u03df\u03e4\5n8\2\u03e0\u03e1\7\n\2\2\u03e1\u03e3"+
		"\5n8\2\u03e2\u03e0\3\2\2\2\u03e3\u03e6\3\2\2\2\u03e4\u03e2\3\2\2\2\u03e4"+
		"\u03e5\3\2\2\2\u03e5\u03e8\3\2\2\2\u03e6\u03e4\3\2\2\2\u03e7\u03df\3\2"+
		"\2\2\u03e7\u03e8\3\2\2\2\u03e8\u03e9\3\2\2\2\u03e9\u03eb\7\37\2\2\u03ea"+
		"\u03d0\3\2\2\2\u03ea\u03de\3\2\2\2\u03eb\u00a3\3\2\2\2\u03ec\u03ef\5l"+
		"\67\2\u03ed\u03ef\5<\37\2\u03ee\u03ec\3\2\2\2\u03ee\u03ed\3\2\2\2\u03ef"+
		"\u00a5\3\2\2\2\u03f0\u03f2\t\20\2\2\u03f1\u03f3\7l\2\2\u03f2\u03f1\3\2"+
		"\2\2\u03f2\u03f3\3\2\2\2\u03f3\u00a7\3\2\2\2\u03f4\u03f5\t\21\2\2\u03f5"+
		"\u00a9\3\2\2\2\u03f6\u0402\7a\2\2\u03f7\u03f8\7\21\2\2\u03f8\u03fd\5<"+
		"\37\2\u03f9\u03fa\7\n\2\2\u03fa\u03fc\5<\37\2\u03fb\u03f9\3\2\2\2\u03fc"+
		"\u03ff\3\2\2\2\u03fd\u03fb\3\2\2\2\u03fd\u03fe\3\2\2\2\u03fe\u0400\3\2"+
		"\2\2\u03ff\u03fd\3\2\2\2\u0400\u0401\7\22\2\2\u0401\u0403\3\2\2\2\u0402"+
		"\u03f7\3\2\2\2\u0402\u0403\3\2\2\2\u0403\u00ab\3\2\2\2x\u00af\u00b1\u00bb"+
		"\u00c5\u00cb\u00d1\u00d5\u00e1\u00e9\u00ee\u00f1\u00fb\u00fe\u0104\u010c"+
		"\u010f\u0119\u0121\u0123\u0129\u0132\u0140\u0143\u014f\u0153\u0155\u015d"+
		"\u0160\u0163\u0167\u016c\u0170\u017d\u017f\u0183\u0189\u0193\u0199\u01a4"+
		"\u01a7\u01ad\u01b0\u01b8\u01bb\u01c1\u01c4\u01cc\u01cf\u01d5\u01d9\u01e4"+
		"\u01e9\u01ee\u01f6\u0205\u0207\u020c\u0216\u0228\u0234\u023a\u0240\u0244"+
		"\u0251\u0257\u025b\u025e\u0265\u0279\u028b\u028f\u0294\u0298\u029c\u02a1"+
		"\u02a6\u02aa\u02c1\u02f2\u02f8\u02fc\u0307\u0309\u0313\u031a\u031c\u0323"+
		"\u032e\u0332\u033a\u033e\u0340\u034b\u0362\u0366\u036c\u0370\u0376\u037a"+
		"\u0380\u038b\u0392\u03a0\u03a9\u03af\u03b3\u03bd\u03c2\u03d2\u03d6\u03da"+
		"\u03e4\u03e7\u03ea\u03ee\u03f2\u03fd\u0402";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}