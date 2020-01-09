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
		T__87=88, T__88=89, T__89=90, T__90=91, NatSpecSingleLine=92, NatSpecMultiLine=93, 
		Int=94, Uint=95, Byte=96, Fixed=97, Ufixed=98, VersionLiteral=99, BooleanLiteral=100, 
		DecimalNumber=101, HexNumber=102, NumberUnit=103, HexLiteral=104, ReservedKeyword=105, 
		AnonymousKeyword=106, BreakKeyword=107, ConstantKeyword=108, ContinueKeyword=109, 
		LeaveKeyword=110, ExternalKeyword=111, IndexedKeyword=112, InternalKeyword=113, 
		PayableKeyword=114, PrivateKeyword=115, PublicKeyword=116, PureKeyword=117, 
		TypeKeyword=118, ViewKeyword=119, Identifier=120, StringLiteral=121, WS=122, 
		COMMENT=123, LINE_COMMENT=124;
	public static final int
		RULE_sourceUnit = 0, RULE_pragmaDirective = 1, RULE_pragmaName = 2, RULE_version = 3, 
		RULE_versionOperator = 4, RULE_versionConstraint = 5, RULE_importDeclaration = 6, 
		RULE_importDirective = 7, RULE_natSpec = 8, RULE_contractDefinition = 9, 
		RULE_inheritanceSpecifier = 10, RULE_contractPart = 11, RULE_stateVariableDeclaration = 12, 
		RULE_usingForDeclaration = 13, RULE_structDefinition = 14, RULE_constructorDefinition = 15, 
		RULE_modifierDefinition = 16, RULE_modifierInvocation = 17, RULE_functionDefinition = 18, 
		RULE_returnParameters = 19, RULE_modifierList = 20, RULE_eventDefinition = 21, 
		RULE_enumValue = 22, RULE_enumDefinition = 23, RULE_parameterList = 24, 
		RULE_parameter = 25, RULE_eventParameterList = 26, RULE_eventParameter = 27, 
		RULE_functionTypeParameterList = 28, RULE_functionTypeParameter = 29, 
		RULE_variableDeclaration = 30, RULE_typeName = 31, RULE_userDefinedTypeName = 32, 
		RULE_mapping = 33, RULE_functionTypeName = 34, RULE_storageLocation = 35, 
		RULE_stateMutability = 36, RULE_block = 37, RULE_statement = 38, RULE_expressionStatement = 39, 
		RULE_ifStatement = 40, RULE_whileStatement = 41, RULE_simpleStatement = 42, 
		RULE_forStatement = 43, RULE_inlineAssemblyStatement = 44, RULE_doWhileStatement = 45, 
		RULE_continueStatement = 46, RULE_breakStatement = 47, RULE_returnStatement = 48, 
		RULE_throwStatement = 49, RULE_emitStatement = 50, RULE_variableDeclarationStatement = 51, 
		RULE_variableDeclarationList = 52, RULE_identifierList = 53, RULE_elementaryTypeName = 54, 
		RULE_expression = 55, RULE_primaryExpression = 56, RULE_expressionList = 57, 
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
			"sourceUnit", "pragmaDirective", "pragmaName", "version", "versionOperator", 
			"versionConstraint", "importDeclaration", "importDirective", "natSpec", 
			"contractDefinition", "inheritanceSpecifier", "contractPart", "stateVariableDeclaration", 
			"usingForDeclaration", "structDefinition", "constructorDefinition", "modifierDefinition", 
			"modifierInvocation", "functionDefinition", "returnParameters", "modifierList", 
			"eventDefinition", "enumValue", "enumDefinition", "parameterList", "parameter", 
			"eventParameterList", "eventParameter", "functionTypeParameterList", 
			"functionTypeParameter", "variableDeclaration", "typeName", "userDefinedTypeName", 
			"mapping", "functionTypeName", "storageLocation", "stateMutability", 
			"block", "statement", "expressionStatement", "ifStatement", "whileStatement", 
			"simpleStatement", "forStatement", "inlineAssemblyStatement", "doWhileStatement", 
			"continueStatement", "breakStatement", "returnStatement", "throwStatement", 
			"emitStatement", "variableDeclarationStatement", "variableDeclarationList", 
			"identifierList", "elementaryTypeName", "expression", "primaryExpression", 
			"expressionList", "nameValueList", "nameValue", "functionCallArguments", 
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
			null, "'pragma'", "';'", "'^'", "'~'", "'>='", "'>'", "'<'", "'<='", 
			"'='", "'as'", "'import'", "'*'", "'from'", "'{'", "','", "'}'", "'contract'", 
			"'interface'", "'library'", "'is'", "'('", "')'", "'using'", "'for'", 
			"'struct'", "'constructor'", "'modifier'", "'function'", "'returns'", 
			"'event'", "'enum'", "'['", "']'", "'address'", "'.'", "'mapping'", "'=>'", 
			"'memory'", "'storage'", "'calldata'", "'if'", "'else'", "'while'", "'assembly'", 
			"'do'", "'return'", "'throw'", "'emit'", "'var'", "'bool'", "'string'", 
			"'byte'", "'++'", "'--'", "'new'", "'+'", "'-'", "'after'", "'delete'", 
			"'!'", "'**'", "'/'", "'%'", "'<<'", "'>>'", "'&'", "'|'", "'=='", "'!='", 
			"'&&'", "'||'", "'?'", "':'", "'|='", "'^='", "'&='", "'<<='", "'>>='", 
			"'+='", "'-='", "'*='", "'/='", "'%='", "'let'", "':='", "'=:'", "'switch'", 
			"'case'", "'default'", "'->'", "'override'", null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "'anonymous'", 
			"'break'", "'constant'", "'continue'", "'leave'", "'external'", "'indexed'", 
			"'internal'", "'payable'", "'private'", "'public'", "'pure'", "'type'", 
			"'view'"
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
			null, null, null, null, null, null, null, null, "NatSpecSingleLine", 
			"NatSpecMultiLine", "Int", "Uint", "Byte", "Fixed", "Ufixed", "VersionLiteral", 
			"BooleanLiteral", "DecimalNumber", "HexNumber", "NumberUnit", "HexLiteral", 
			"ReservedKeyword", "AnonymousKeyword", "BreakKeyword", "ConstantKeyword", 
			"ContinueKeyword", "LeaveKeyword", "ExternalKeyword", "IndexedKeyword", 
			"InternalKeyword", "PayableKeyword", "PrivateKeyword", "PublicKeyword", 
			"PureKeyword", "TypeKeyword", "ViewKeyword", "Identifier", "StringLiteral", 
			"WS", "COMMENT", "LINE_COMMENT"
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__10) | (1L << T__16) | (1L << T__17) | (1L << T__18))) != 0) || _la==NatSpecSingleLine || _la==NatSpecMultiLine) {
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
				case T__10:
					{
					setState(171);
					importDirective();
					}
					break;
				case T__16:
				case T__17:
				case T__18:
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

	public static class VersionContext extends ParserRuleContext {
		public List<VersionConstraintContext> versionConstraint() {
			return getRuleContexts(VersionConstraintContext.class);
		}
		public VersionConstraintContext versionConstraint(int i) {
			return getRuleContext(VersionConstraintContext.class,i);
		}
		public VersionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_version; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterVersion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitVersion(this);
		}
	}

	public final VersionContext version() throws RecognitionException {
		VersionContext _localctx = new VersionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_version);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			versionConstraint();
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0) || _la==VersionLiteral) {
				{
				setState(193);
				versionConstraint();
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

	public static class VersionOperatorContext extends ParserRuleContext {
		public VersionOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_versionOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterVersionOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitVersionOperator(this);
		}
	}

	public final VersionOperatorContext versionOperator() throws RecognitionException {
		VersionOperatorContext _localctx = new VersionOperatorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_versionOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) ) {
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

	public static class VersionConstraintContext extends ParserRuleContext {
		public TerminalNode VersionLiteral() { return getToken(SolidityParser.VersionLiteral, 0); }
		public VersionOperatorContext versionOperator() {
			return getRuleContext(VersionOperatorContext.class,0);
		}
		public VersionConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_versionConstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterVersionConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitVersionConstraint(this);
		}
	}

	public final VersionConstraintContext versionConstraint() throws RecognitionException {
		VersionConstraintContext _localctx = new VersionConstraintContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_versionConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) {
				{
				setState(198);
				versionOperator();
				}
			}

			setState(201);
			match(VersionLiteral);
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
		enterRule(_localctx, 12, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			identifier();
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(204);
				match(T__9);
				setState(205);
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
		enterRule(_localctx, 14, RULE_importDirective);
		int _la;
		try {
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				match(T__10);
				setState(209);
				match(StringLiteral);
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(210);
					match(T__9);
					setState(211);
					identifier();
					}
				}

				setState(214);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				match(T__10);
				setState(218);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__11:
					{
					setState(216);
					match(T__11);
					}
					break;
				case T__12:
				case T__39:
				case Identifier:
					{
					setState(217);
					identifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(220);
					match(T__9);
					setState(221);
					identifier();
					}
				}

				setState(224);
				match(T__12);
				setState(225);
				match(StringLiteral);
				setState(226);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(227);
				match(T__10);
				setState(228);
				match(T__13);
				setState(229);
				importDeclaration();
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(230);
					match(T__14);
					setState(231);
					importDeclaration();
					}
					}
					setState(236);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(237);
				match(T__15);
				setState(238);
				match(T__12);
				setState(239);
				match(StringLiteral);
				setState(240);
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
		enterRule(_localctx, 16, RULE_natSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
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
		enterRule(_localctx, 18, RULE_contractDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NatSpecSingleLine || _la==NatSpecMultiLine) {
				{
				setState(246);
				natSpec();
				}
			}

			setState(249);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << T__18))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(250);
			identifier();
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(251);
				match(T__19);
				setState(252);
				inheritanceSpecifier();
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(253);
					match(T__14);
					setState(254);
					inheritanceSpecifier();
					}
					}
					setState(259);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(262);
			match(T__13);
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__22) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__33) | (1L << T__35) | (1L << T__39) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51))) != 0) || ((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (NatSpecSingleLine - 92)) | (1L << (NatSpecMultiLine - 92)) | (1L << (Int - 92)) | (1L << (Uint - 92)) | (1L << (Byte - 92)) | (1L << (Fixed - 92)) | (1L << (Ufixed - 92)) | (1L << (Identifier - 92)))) != 0)) {
				{
				{
				setState(263);
				contractPart();
				}
				}
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(269);
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
		enterRule(_localctx, 20, RULE_inheritanceSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			userDefinedTypeName();
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(272);
				match(T__20);
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__12) | (1L << T__20) | (1L << T__31) | (1L << T__33) | (1L << T__39) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59))) != 0) || ((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & ((1L << (Int - 94)) | (1L << (Uint - 94)) | (1L << (Byte - 94)) | (1L << (Fixed - 94)) | (1L << (Ufixed - 94)) | (1L << (BooleanLiteral - 94)) | (1L << (DecimalNumber - 94)) | (1L << (HexNumber - 94)) | (1L << (HexLiteral - 94)) | (1L << (TypeKeyword - 94)) | (1L << (Identifier - 94)) | (1L << (StringLiteral - 94)))) != 0)) {
					{
					setState(273);
					expressionList();
					}
				}

				setState(276);
				match(T__21);
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
		enterRule(_localctx, 22, RULE_contractPart);
		try {
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				stateVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(280);
				usingForDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(281);
				structDefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(282);
				constructorDefinition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(283);
				modifierDefinition();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(284);
				functionDefinition();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(285);
				eventDefinition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(286);
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
		enterRule(_localctx, 24, RULE_stateVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			typeName(0);
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (T__90 - 91)) | (1L << (ConstantKeyword - 91)) | (1L << (InternalKeyword - 91)) | (1L << (PrivateKeyword - 91)) | (1L << (PublicKeyword - 91)))) != 0)) {
				{
				setState(295);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PublicKeyword:
					{
					setState(290);
					match(PublicKeyword);
					}
					break;
				case InternalKeyword:
					{
					setState(291);
					match(InternalKeyword);
					}
					break;
				case PrivateKeyword:
					{
					setState(292);
					match(PrivateKeyword);
					}
					break;
				case ConstantKeyword:
					{
					setState(293);
					match(ConstantKeyword);
					}
					break;
				case T__90:
					{
					setState(294);
					overrideSpecifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(300);
			identifier();
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(301);
				match(T__8);
				setState(302);
				expression(0);
				}
			}

			setState(305);
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
		enterRule(_localctx, 26, RULE_usingForDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(T__22);
			setState(308);
			identifier();
			setState(309);
			match(T__23);
			setState(312);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				{
				setState(310);
				match(T__11);
				}
				break;
			case T__12:
			case T__27:
			case T__33:
			case T__35:
			case T__39:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case Identifier:
				{
				setState(311);
				typeName(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(314);
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
		enterRule(_localctx, 28, RULE_structDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(T__24);
			setState(317);
			identifier();
			setState(318);
			match(T__13);
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__27) | (1L << T__33) | (1L << T__35) | (1L << T__39) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51))) != 0) || ((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & ((1L << (Int - 94)) | (1L << (Uint - 94)) | (1L << (Byte - 94)) | (1L << (Fixed - 94)) | (1L << (Ufixed - 94)) | (1L << (Identifier - 94)))) != 0)) {
				{
				setState(319);
				variableDeclaration();
				setState(320);
				match(T__1);
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__27) | (1L << T__33) | (1L << T__35) | (1L << T__39) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51))) != 0) || ((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & ((1L << (Int - 94)) | (1L << (Uint - 94)) | (1L << (Byte - 94)) | (1L << (Fixed - 94)) | (1L << (Ufixed - 94)) | (1L << (Identifier - 94)))) != 0)) {
					{
					{
					setState(321);
					variableDeclaration();
					setState(322);
					match(T__1);
					}
					}
					setState(328);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(331);
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
		enterRule(_localctx, 30, RULE_constructorDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(T__25);
			setState(334);
			parameterList();
			setState(335);
			modifierList();
			setState(336);
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
		enterRule(_localctx, 32, RULE_modifierDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(T__26);
			setState(339);
			identifier();
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(340);
				parameterList();
				}
			}

			setState(343);
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
		enterRule(_localctx, 34, RULE_modifierInvocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			identifier();
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(346);
				match(T__20);
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__12) | (1L << T__20) | (1L << T__31) | (1L << T__33) | (1L << T__39) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59))) != 0) || ((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & ((1L << (Int - 94)) | (1L << (Uint - 94)) | (1L << (Byte - 94)) | (1L << (Fixed - 94)) | (1L << (Ufixed - 94)) | (1L << (BooleanLiteral - 94)) | (1L << (DecimalNumber - 94)) | (1L << (HexNumber - 94)) | (1L << (HexLiteral - 94)) | (1L << (TypeKeyword - 94)) | (1L << (Identifier - 94)) | (1L << (StringLiteral - 94)))) != 0)) {
					{
					setState(347);
					expressionList();
					}
				}

				setState(350);
				match(T__21);
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
		enterRule(_localctx, 36, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NatSpecSingleLine || _la==NatSpecMultiLine) {
				{
				setState(353);
				natSpec();
				}
			}

			setState(356);
			match(T__27);
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12 || _la==T__39 || _la==Identifier) {
				{
				setState(357);
				identifier();
				}
			}

			setState(360);
			parameterList();
			setState(361);
			modifierList();
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__28) {
				{
				setState(362);
				returnParameters();
				}
			}

			setState(367);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(365);
				match(T__1);
				}
				break;
			case T__13:
				{
				setState(366);
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
		enterRule(_localctx, 38, RULE_returnParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(T__28);
			setState(370);
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
		enterRule(_localctx, 40, RULE_modifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12 || _la==T__39 || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (ConstantKeyword - 108)) | (1L << (ExternalKeyword - 108)) | (1L << (InternalKeyword - 108)) | (1L << (PayableKeyword - 108)) | (1L << (PrivateKeyword - 108)) | (1L << (PublicKeyword - 108)) | (1L << (PureKeyword - 108)) | (1L << (ViewKeyword - 108)) | (1L << (Identifier - 108)))) != 0)) {
				{
				setState(378);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__12:
				case T__39:
				case Identifier:
					{
					setState(372);
					modifierInvocation();
					}
					break;
				case ConstantKeyword:
				case PayableKeyword:
				case PureKeyword:
				case ViewKeyword:
					{
					setState(373);
					stateMutability();
					}
					break;
				case ExternalKeyword:
					{
					setState(374);
					match(ExternalKeyword);
					}
					break;
				case PublicKeyword:
					{
					setState(375);
					match(PublicKeyword);
					}
					break;
				case InternalKeyword:
					{
					setState(376);
					match(InternalKeyword);
					}
					break;
				case PrivateKeyword:
					{
					setState(377);
					match(PrivateKeyword);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(382);
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
		enterRule(_localctx, 42, RULE_eventDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NatSpecSingleLine || _la==NatSpecMultiLine) {
				{
				setState(383);
				natSpec();
				}
			}

			setState(386);
			match(T__29);
			setState(387);
			identifier();
			setState(388);
			eventParameterList();
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AnonymousKeyword) {
				{
				setState(389);
				match(AnonymousKeyword);
				}
			}

			setState(392);
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
		enterRule(_localctx, 44, RULE_enumValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
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
		enterRule(_localctx, 46, RULE_enumDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(T__30);
			setState(397);
			identifier();
			setState(398);
			match(T__13);
			setState(400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12 || _la==T__39 || _la==Identifier) {
				{
				setState(399);
				enumValue();
				}
			}

			setState(406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(402);
				match(T__14);
				setState(403);
				enumValue();
				}
				}
				setState(408);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(409);
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
		enterRule(_localctx, 48, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			match(T__20);
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__27) | (1L << T__33) | (1L << T__35) | (1L << T__39) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51))) != 0) || ((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & ((1L << (Int - 94)) | (1L << (Uint - 94)) | (1L << (Byte - 94)) | (1L << (Fixed - 94)) | (1L << (Ufixed - 94)) | (1L << (Identifier - 94)))) != 0)) {
				{
				setState(412);
				parameter();
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(413);
					match(T__14);
					setState(414);
					parameter();
					}
					}
					setState(419);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(422);
			match(T__21);
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
		enterRule(_localctx, 50, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			typeName(0);
			setState(426);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(425);
				storageLocation();
				}
				break;
			}
			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12 || _la==T__39 || _la==Identifier) {
				{
				setState(428);
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
		enterRule(_localctx, 52, RULE_eventParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			match(T__20);
			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__27) | (1L << T__33) | (1L << T__35) | (1L << T__39) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51))) != 0) || ((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & ((1L << (Int - 94)) | (1L << (Uint - 94)) | (1L << (Byte - 94)) | (1L << (Fixed - 94)) | (1L << (Ufixed - 94)) | (1L << (Identifier - 94)))) != 0)) {
				{
				setState(432);
				eventParameter();
				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(433);
					match(T__14);
					setState(434);
					eventParameter();
					}
					}
					setState(439);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(442);
			match(T__21);
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
		enterRule(_localctx, 54, RULE_eventParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			typeName(0);
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IndexedKeyword) {
				{
				setState(445);
				match(IndexedKeyword);
				}
			}

			setState(449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12 || _la==T__39 || _la==Identifier) {
				{
				setState(448);
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
		enterRule(_localctx, 56, RULE_functionTypeParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(T__20);
			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__27) | (1L << T__33) | (1L << T__35) | (1L << T__39) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51))) != 0) || ((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & ((1L << (Int - 94)) | (1L << (Uint - 94)) | (1L << (Byte - 94)) | (1L << (Fixed - 94)) | (1L << (Ufixed - 94)) | (1L << (Identifier - 94)))) != 0)) {
				{
				setState(452);
				functionTypeParameter();
				setState(457);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(453);
					match(T__14);
					setState(454);
					functionTypeParameter();
					}
					}
					setState(459);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(462);
			match(T__21);
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
		enterRule(_localctx, 58, RULE_functionTypeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			typeName(0);
			setState(466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__37) | (1L << T__38) | (1L << T__39))) != 0)) {
				{
				setState(465);
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
		enterRule(_localctx, 60, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			typeName(0);
			setState(470);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(469);
				storageLocation();
				}
				break;
			}
			setState(472);
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
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_typeName, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(475);
				elementaryTypeName();
				}
				break;
			case 2:
				{
				setState(476);
				userDefinedTypeName();
				}
				break;
			case 3:
				{
				setState(477);
				mapping();
				}
				break;
			case 4:
				{
				setState(478);
				functionTypeName();
				}
				break;
			case 5:
				{
				setState(479);
				match(T__33);
				setState(480);
				match(PayableKeyword);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(491);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeName);
					setState(483);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(484);
					match(T__31);
					setState(486);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__12) | (1L << T__20) | (1L << T__31) | (1L << T__33) | (1L << T__39) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59))) != 0) || ((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & ((1L << (Int - 94)) | (1L << (Uint - 94)) | (1L << (Byte - 94)) | (1L << (Fixed - 94)) | (1L << (Ufixed - 94)) | (1L << (BooleanLiteral - 94)) | (1L << (DecimalNumber - 94)) | (1L << (HexNumber - 94)) | (1L << (HexLiteral - 94)) | (1L << (TypeKeyword - 94)) | (1L << (Identifier - 94)) | (1L << (StringLiteral - 94)))) != 0)) {
						{
						setState(485);
						expression(0);
						}
					}

					setState(488);
					match(T__32);
					}
					} 
				}
				setState(493);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
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
		enterRule(_localctx, 64, RULE_userDefinedTypeName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			identifier();
			setState(499);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(495);
					match(T__34);
					setState(496);
					identifier();
					}
					} 
				}
				setState(501);
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
		enterRule(_localctx, 66, RULE_mapping);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			match(T__35);
			setState(503);
			match(T__20);
			setState(504);
			elementaryTypeName();
			setState(505);
			match(T__36);
			setState(506);
			typeName(0);
			setState(507);
			match(T__21);
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
		enterRule(_localctx, 68, RULE_functionTypeName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			match(T__27);
			setState(510);
			functionTypeParameterList();
			setState(516);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(514);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case InternalKeyword:
						{
						setState(511);
						match(InternalKeyword);
						}
						break;
					case ExternalKeyword:
						{
						setState(512);
						match(ExternalKeyword);
						}
						break;
					case ConstantKeyword:
					case PayableKeyword:
					case PureKeyword:
					case ViewKeyword:
						{
						setState(513);
						stateMutability();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(518);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			}
			setState(521);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(519);
				match(T__28);
				setState(520);
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
		enterRule(_localctx, 70, RULE_storageLocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__37) | (1L << T__38) | (1L << T__39))) != 0)) ) {
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
		enterRule(_localctx, 72, RULE_stateMutability);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			_la = _input.LA(1);
			if ( !(((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (ConstantKeyword - 108)) | (1L << (PayableKeyword - 108)) | (1L << (PureKeyword - 108)) | (1L << (ViewKeyword - 108)))) != 0)) ) {
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
		enterRule(_localctx, 74, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			match(T__13);
			setState(531);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__12) | (1L << T__13) | (1L << T__20) | (1L << T__23) | (1L << T__27) | (1L << T__31) | (1L << T__33) | (1L << T__35) | (1L << T__39) | (1L << T__40) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59))) != 0) || ((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & ((1L << (Int - 94)) | (1L << (Uint - 94)) | (1L << (Byte - 94)) | (1L << (Fixed - 94)) | (1L << (Ufixed - 94)) | (1L << (BooleanLiteral - 94)) | (1L << (DecimalNumber - 94)) | (1L << (HexNumber - 94)) | (1L << (HexLiteral - 94)) | (1L << (BreakKeyword - 94)) | (1L << (ContinueKeyword - 94)) | (1L << (TypeKeyword - 94)) | (1L << (Identifier - 94)) | (1L << (StringLiteral - 94)))) != 0)) {
				{
				{
				setState(528);
				statement();
				}
				}
				setState(533);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(534);
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

	public static class StatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
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
		enterRule(_localctx, 76, RULE_statement);
		try {
			setState(548);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__40:
				enterOuterAlt(_localctx, 1);
				{
				setState(536);
				ifStatement();
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 2);
				{
				setState(537);
				whileStatement();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 3);
				{
				setState(538);
				forStatement();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 4);
				{
				setState(539);
				block();
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 5);
				{
				setState(540);
				inlineAssemblyStatement();
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 6);
				{
				setState(541);
				doWhileStatement();
				}
				break;
			case ContinueKeyword:
				enterOuterAlt(_localctx, 7);
				{
				setState(542);
				continueStatement();
				}
				break;
			case BreakKeyword:
				enterOuterAlt(_localctx, 8);
				{
				setState(543);
				breakStatement();
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 9);
				{
				setState(544);
				returnStatement();
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 10);
				{
				setState(545);
				throwStatement();
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 11);
				{
				setState(546);
				emitStatement();
				}
				break;
			case T__3:
			case T__12:
			case T__20:
			case T__27:
			case T__31:
			case T__33:
			case T__35:
			case T__39:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
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
				enterOuterAlt(_localctx, 12);
				{
				setState(547);
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
		enterRule(_localctx, 78, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			expression(0);
			setState(551);
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
		enterRule(_localctx, 80, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			match(T__40);
			setState(554);
			match(T__20);
			setState(555);
			expression(0);
			setState(556);
			match(T__21);
			setState(557);
			statement();
			setState(560);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(558);
				match(T__41);
				setState(559);
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
		enterRule(_localctx, 82, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			match(T__42);
			setState(563);
			match(T__20);
			setState(564);
			expression(0);
			setState(565);
			match(T__21);
			setState(566);
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
		enterRule(_localctx, 84, RULE_simpleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(568);
				variableDeclarationStatement();
				}
				break;
			case 2:
				{
				setState(569);
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
		enterRule(_localctx, 86, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			match(T__23);
			setState(573);
			match(T__20);
			setState(576);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__12:
			case T__20:
			case T__27:
			case T__31:
			case T__33:
			case T__35:
			case T__39:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
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
				setState(574);
				simpleStatement();
				}
				break;
			case T__1:
				{
				setState(575);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(580);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__12:
			case T__20:
			case T__31:
			case T__33:
			case T__39:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
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
				setState(578);
				expressionStatement();
				}
				break;
			case T__1:
				{
				setState(579);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(583);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__12) | (1L << T__20) | (1L << T__31) | (1L << T__33) | (1L << T__39) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59))) != 0) || ((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & ((1L << (Int - 94)) | (1L << (Uint - 94)) | (1L << (Byte - 94)) | (1L << (Fixed - 94)) | (1L << (Ufixed - 94)) | (1L << (BooleanLiteral - 94)) | (1L << (DecimalNumber - 94)) | (1L << (HexNumber - 94)) | (1L << (HexLiteral - 94)) | (1L << (TypeKeyword - 94)) | (1L << (Identifier - 94)) | (1L << (StringLiteral - 94)))) != 0)) {
				{
				setState(582);
				expression(0);
				}
			}

			setState(585);
			match(T__21);
			setState(586);
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
		enterRule(_localctx, 88, RULE_inlineAssemblyStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			match(T__43);
			setState(590);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==StringLiteral) {
				{
				setState(589);
				match(StringLiteral);
				}
			}

			setState(592);
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
		enterRule(_localctx, 90, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			match(T__44);
			setState(595);
			statement();
			setState(596);
			match(T__42);
			setState(597);
			match(T__20);
			setState(598);
			expression(0);
			setState(599);
			match(T__21);
			setState(600);
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
		enterRule(_localctx, 92, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			match(ContinueKeyword);
			setState(603);
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
		enterRule(_localctx, 94, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
			match(BreakKeyword);
			setState(606);
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
		enterRule(_localctx, 96, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(608);
			match(T__45);
			setState(610);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__12) | (1L << T__20) | (1L << T__31) | (1L << T__33) | (1L << T__39) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59))) != 0) || ((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & ((1L << (Int - 94)) | (1L << (Uint - 94)) | (1L << (Byte - 94)) | (1L << (Fixed - 94)) | (1L << (Ufixed - 94)) | (1L << (BooleanLiteral - 94)) | (1L << (DecimalNumber - 94)) | (1L << (HexNumber - 94)) | (1L << (HexLiteral - 94)) | (1L << (TypeKeyword - 94)) | (1L << (Identifier - 94)) | (1L << (StringLiteral - 94)))) != 0)) {
				{
				setState(609);
				expression(0);
				}
			}

			setState(612);
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
		enterRule(_localctx, 98, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
			match(T__46);
			setState(615);
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
		enterRule(_localctx, 100, RULE_emitStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			match(T__47);
			setState(618);
			functionCall();
			setState(619);
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
		enterRule(_localctx, 102, RULE_variableDeclarationStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(621);
				match(T__48);
				setState(622);
				identifierList();
				}
				break;
			case 2:
				{
				setState(623);
				variableDeclaration();
				}
				break;
			case 3:
				{
				setState(624);
				match(T__20);
				setState(625);
				variableDeclarationList();
				setState(626);
				match(T__21);
				}
				break;
			}
			setState(632);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(630);
				match(T__8);
				setState(631);
				expression(0);
				}
			}

			setState(634);
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
		enterRule(_localctx, 104, RULE_variableDeclarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__27) | (1L << T__33) | (1L << T__35) | (1L << T__39) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51))) != 0) || ((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & ((1L << (Int - 94)) | (1L << (Uint - 94)) | (1L << (Byte - 94)) | (1L << (Fixed - 94)) | (1L << (Ufixed - 94)) | (1L << (Identifier - 94)))) != 0)) {
				{
				setState(636);
				variableDeclaration();
				}
			}

			setState(645);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(639);
				match(T__14);
				setState(641);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__27) | (1L << T__33) | (1L << T__35) | (1L << T__39) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51))) != 0) || ((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & ((1L << (Int - 94)) | (1L << (Uint - 94)) | (1L << (Byte - 94)) | (1L << (Fixed - 94)) | (1L << (Ufixed - 94)) | (1L << (Identifier - 94)))) != 0)) {
					{
					setState(640);
					variableDeclaration();
					}
				}

				}
				}
				setState(647);
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
		enterRule(_localctx, 106, RULE_identifierList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
			match(T__20);
			setState(655);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(650);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__12 || _la==T__39 || _la==Identifier) {
						{
						setState(649);
						identifier();
						}
					}

					setState(652);
					match(T__14);
					}
					} 
				}
				setState(657);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			}
			setState(659);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12 || _la==T__39 || _la==Identifier) {
				{
				setState(658);
				identifier();
				}
			}

			setState(661);
			match(T__21);
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
		enterRule(_localctx, 108, RULE_elementaryTypeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__33) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51))) != 0) || ((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & ((1L << (Int - 94)) | (1L << (Uint - 94)) | (1L << (Byte - 94)) | (1L << (Fixed - 94)) | (1L << (Ufixed - 94)))) != 0)) ) {
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
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
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
		public FunctionCallArgumentsContext functionCallArguments() {
			return getRuleContext(FunctionCallArgumentsContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
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
		int _startState = 110;
		enterRecursionRule(_localctx, 110, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(666);
				match(T__54);
				setState(667);
				typeName(0);
				}
				break;
			case 2:
				{
				setState(668);
				match(T__20);
				setState(669);
				expression(0);
				setState(670);
				match(T__21);
				}
				break;
			case 3:
				{
				setState(672);
				_la = _input.LA(1);
				if ( !(_la==T__52 || _la==T__53) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(673);
				expression(19);
				}
				break;
			case 4:
				{
				setState(674);
				_la = _input.LA(1);
				if ( !(_la==T__55 || _la==T__56) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(675);
				expression(18);
				}
				break;
			case 5:
				{
				setState(676);
				_la = _input.LA(1);
				if ( !(_la==T__57 || _la==T__58) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(677);
				expression(17);
				}
				break;
			case 6:
				{
				setState(678);
				match(T__59);
				setState(679);
				expression(16);
				}
				break;
			case 7:
				{
				setState(680);
				match(T__3);
				setState(681);
				expression(15);
				}
				break;
			case 8:
				{
				setState(682);
				primaryExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(744);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(742);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(685);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(686);
						match(T__60);
						setState(687);
						expression(15);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(688);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(689);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__61) | (1L << T__62))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(690);
						expression(14);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(691);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(692);
						_la = _input.LA(1);
						if ( !(_la==T__55 || _la==T__56) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(693);
						expression(13);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(694);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(695);
						_la = _input.LA(1);
						if ( !(_la==T__63 || _la==T__64) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(696);
						expression(12);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(697);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(698);
						match(T__65);
						setState(699);
						expression(11);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(700);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(701);
						match(T__2);
						setState(702);
						expression(10);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(703);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(704);
						match(T__66);
						setState(705);
						expression(9);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(706);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(707);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(708);
						expression(8);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(709);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(710);
						_la = _input.LA(1);
						if ( !(_la==T__67 || _la==T__68) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(711);
						expression(7);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(712);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(713);
						match(T__69);
						setState(714);
						expression(6);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(715);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(716);
						match(T__70);
						setState(717);
						expression(5);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(718);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(719);
						match(T__71);
						setState(720);
						expression(0);
						setState(721);
						match(T__72);
						setState(722);
						expression(4);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(724);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(725);
						_la = _input.LA(1);
						if ( !(_la==T__8 || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (T__73 - 74)) | (1L << (T__74 - 74)) | (1L << (T__75 - 74)) | (1L << (T__76 - 74)) | (1L << (T__77 - 74)) | (1L << (T__78 - 74)) | (1L << (T__79 - 74)) | (1L << (T__80 - 74)) | (1L << (T__81 - 74)) | (1L << (T__82 - 74)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(726);
						expression(3);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(727);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(728);
						_la = _input.LA(1);
						if ( !(_la==T__52 || _la==T__53) ) {
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
						setState(729);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(730);
						match(T__31);
						setState(731);
						expression(0);
						setState(732);
						match(T__32);
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(734);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(735);
						match(T__20);
						setState(736);
						functionCallArguments();
						setState(737);
						match(T__21);
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(739);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(740);
						match(T__34);
						setState(741);
						identifier();
						}
						break;
					}
					} 
				}
				setState(746);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
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
		enterRule(_localctx, 112, RULE_primaryExpression);
		try {
			setState(763);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(747);
				match(BooleanLiteral);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(748);
				numberLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(749);
				match(HexLiteral);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(750);
				match(StringLiteral);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(751);
				identifier();
				setState(754);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(752);
					match(T__31);
					setState(753);
					match(T__32);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(756);
				match(TypeKeyword);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(757);
				tupleExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(758);
				typeNameExpression();
				setState(761);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
				case 1:
					{
					setState(759);
					match(T__31);
					setState(760);
					match(T__32);
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
		enterRule(_localctx, 114, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
			expression(0);
			setState(770);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(766);
				match(T__14);
				setState(767);
				expression(0);
				}
				}
				setState(772);
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
			setState(773);
			nameValue();
			setState(778);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(774);
					match(T__14);
					setState(775);
					nameValue();
					}
					} 
				}
				setState(780);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			}
			setState(782);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(781);
				match(T__14);
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
			setState(784);
			identifier();
			setState(785);
			match(T__72);
			setState(786);
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
			setState(796);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(788);
				match(T__13);
				setState(790);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12 || _la==T__39 || _la==Identifier) {
					{
					setState(789);
					nameValueList();
					}
				}

				setState(792);
				match(T__15);
				}
				break;
			case T__3:
			case T__12:
			case T__20:
			case T__21:
			case T__31:
			case T__33:
			case T__39:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
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
				setState(794);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__12) | (1L << T__20) | (1L << T__31) | (1L << T__33) | (1L << T__39) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59))) != 0) || ((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & ((1L << (Int - 94)) | (1L << (Uint - 94)) | (1L << (Byte - 94)) | (1L << (Fixed - 94)) | (1L << (Ufixed - 94)) | (1L << (BooleanLiteral - 94)) | (1L << (DecimalNumber - 94)) | (1L << (HexNumber - 94)) | (1L << (HexLiteral - 94)) | (1L << (TypeKeyword - 94)) | (1L << (Identifier - 94)) | (1L << (StringLiteral - 94)))) != 0)) {
					{
					setState(793);
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
			setState(798);
			expression(0);
			setState(799);
			match(T__20);
			setState(800);
			functionCallArguments();
			setState(801);
			match(T__21);
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
			setState(803);
			match(T__13);
			setState(807);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__20) | (1L << T__23) | (1L << T__27) | (1L << T__33) | (1L << T__39) | (1L << T__40) | (1L << T__43) | (1L << T__45) | (1L << T__51))) != 0) || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (T__83 - 84)) | (1L << (T__85 - 84)) | (1L << (T__86 - 84)) | (1L << (DecimalNumber - 84)) | (1L << (HexNumber - 84)) | (1L << (HexLiteral - 84)) | (1L << (BreakKeyword - 84)) | (1L << (ContinueKeyword - 84)) | (1L << (LeaveKeyword - 84)) | (1L << (Identifier - 84)) | (1L << (StringLiteral - 84)))) != 0)) {
				{
				{
				setState(804);
				assemblyItem();
				}
				}
				setState(809);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(810);
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
			setState(830);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(812);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(813);
				assemblyBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(814);
				assemblyExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(815);
				assemblyLocalDefinition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(816);
				assemblyAssignment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(817);
				assemblyStackAssignment();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(818);
				labelDefinition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(819);
				assemblySwitch();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(820);
				assemblyFunctionDefinition();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(821);
				assemblyFor();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(822);
				assemblyIf();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(823);
				match(BreakKeyword);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(824);
				match(ContinueKeyword);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(825);
				match(LeaveKeyword);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(826);
				subAssembly();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(827);
				numberLiteral();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(828);
				match(StringLiteral);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(829);
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
			setState(834);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case T__33:
			case T__39:
			case T__45:
			case T__51:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(832);
				assemblyCall();
				}
				break;
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(833);
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
			setState(840);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__45:
				{
				setState(836);
				match(T__45);
				}
				break;
			case T__33:
				{
				setState(837);
				match(T__33);
				}
				break;
			case T__51:
				{
				setState(838);
				match(T__51);
				}
				break;
			case T__12:
			case T__39:
			case Identifier:
				{
				setState(839);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(854);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(842);
				match(T__20);
				setState(844);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__33) | (1L << T__39) | (1L << T__45) | (1L << T__51))) != 0) || ((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (DecimalNumber - 101)) | (1L << (HexNumber - 101)) | (1L << (HexLiteral - 101)) | (1L << (Identifier - 101)) | (1L << (StringLiteral - 101)))) != 0)) {
					{
					setState(843);
					assemblyExpression();
					}
				}

				setState(850);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(846);
					match(T__14);
					setState(847);
					assemblyExpression();
					}
					}
					setState(852);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(853);
				match(T__21);
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
			setState(856);
			match(T__83);
			setState(857);
			assemblyIdentifierOrList();
			setState(860);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__84) {
				{
				setState(858);
				match(T__84);
				setState(859);
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
			setState(862);
			assemblyIdentifierOrList();
			setState(863);
			match(T__84);
			setState(864);
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
			setState(871);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case T__39:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(866);
				identifier();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(867);
				match(T__20);
				setState(868);
				assemblyIdentifierList();
				setState(869);
				match(T__21);
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
			setState(873);
			identifier();
			setState(878);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(874);
				match(T__14);
				setState(875);
				identifier();
				}
				}
				setState(880);
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
			setState(881);
			match(T__85);
			setState(882);
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
			setState(884);
			identifier();
			setState(885);
			match(T__72);
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
			setState(887);
			match(T__86);
			setState(888);
			assemblyExpression();
			setState(892);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__87 || _la==T__88) {
				{
				{
				setState(889);
				assemblyCase();
				}
				}
				setState(894);
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
			setState(901);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__87:
				enterOuterAlt(_localctx, 1);
				{
				setState(895);
				match(T__87);
				setState(896);
				assemblyLiteral();
				setState(897);
				assemblyBlock();
				}
				break;
			case T__88:
				enterOuterAlt(_localctx, 2);
				{
				setState(899);
				match(T__88);
				setState(900);
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
			setState(903);
			match(T__27);
			setState(904);
			identifier();
			setState(905);
			match(T__20);
			setState(907);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12 || _la==T__39 || _la==Identifier) {
				{
				setState(906);
				assemblyIdentifierList();
				}
			}

			setState(909);
			match(T__21);
			setState(911);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__89) {
				{
				setState(910);
				assemblyFunctionReturns();
				}
			}

			setState(913);
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
			setState(915);
			match(T__89);
			setState(916);
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
			setState(918);
			match(T__23);
			setState(921);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				{
				setState(919);
				assemblyBlock();
				}
				break;
			case T__12:
			case T__33:
			case T__39:
			case T__45:
			case T__51:
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case Identifier:
			case StringLiteral:
				{
				setState(920);
				assemblyExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(923);
			assemblyExpression();
			setState(926);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				{
				setState(924);
				assemblyBlock();
				}
				break;
			case T__12:
			case T__33:
			case T__39:
			case T__45:
			case T__51:
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case Identifier:
			case StringLiteral:
				{
				setState(925);
				assemblyExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(928);
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
			setState(930);
			match(T__40);
			setState(931);
			assemblyExpression();
			setState(932);
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
			setState(934);
			_la = _input.LA(1);
			if ( !(((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (DecimalNumber - 101)) | (1L << (HexNumber - 101)) | (1L << (HexLiteral - 101)) | (1L << (StringLiteral - 101)))) != 0)) ) {
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
			setState(936);
			match(T__43);
			setState(937);
			identifier();
			setState(938);
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
			setState(966);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(940);
				match(T__20);
				{
				setState(942);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__12) | (1L << T__20) | (1L << T__31) | (1L << T__33) | (1L << T__39) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59))) != 0) || ((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & ((1L << (Int - 94)) | (1L << (Uint - 94)) | (1L << (Byte - 94)) | (1L << (Fixed - 94)) | (1L << (Ufixed - 94)) | (1L << (BooleanLiteral - 94)) | (1L << (DecimalNumber - 94)) | (1L << (HexNumber - 94)) | (1L << (HexLiteral - 94)) | (1L << (TypeKeyword - 94)) | (1L << (Identifier - 94)) | (1L << (StringLiteral - 94)))) != 0)) {
					{
					setState(941);
					expression(0);
					}
				}

				setState(950);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(944);
					match(T__14);
					setState(946);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__12) | (1L << T__20) | (1L << T__31) | (1L << T__33) | (1L << T__39) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59))) != 0) || ((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & ((1L << (Int - 94)) | (1L << (Uint - 94)) | (1L << (Byte - 94)) | (1L << (Fixed - 94)) | (1L << (Ufixed - 94)) | (1L << (BooleanLiteral - 94)) | (1L << (DecimalNumber - 94)) | (1L << (HexNumber - 94)) | (1L << (HexLiteral - 94)) | (1L << (TypeKeyword - 94)) | (1L << (Identifier - 94)) | (1L << (StringLiteral - 94)))) != 0)) {
						{
						setState(945);
						expression(0);
						}
					}

					}
					}
					setState(952);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(953);
				match(T__21);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				setState(954);
				match(T__31);
				setState(963);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__12) | (1L << T__20) | (1L << T__31) | (1L << T__33) | (1L << T__39) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59))) != 0) || ((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & ((1L << (Int - 94)) | (1L << (Uint - 94)) | (1L << (Byte - 94)) | (1L << (Fixed - 94)) | (1L << (Ufixed - 94)) | (1L << (BooleanLiteral - 94)) | (1L << (DecimalNumber - 94)) | (1L << (HexNumber - 94)) | (1L << (HexLiteral - 94)) | (1L << (TypeKeyword - 94)) | (1L << (Identifier - 94)) | (1L << (StringLiteral - 94)))) != 0)) {
					{
					setState(955);
					expression(0);
					setState(960);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__14) {
						{
						{
						setState(956);
						match(T__14);
						setState(957);
						expression(0);
						}
						}
						setState(962);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(965);
				match(T__32);
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
			setState(970);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
				enterOuterAlt(_localctx, 1);
				{
				setState(968);
				elementaryTypeName();
				}
				break;
			case T__12:
			case T__39:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(969);
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
			setState(972);
			_la = _input.LA(1);
			if ( !(_la==DecimalNumber || _la==HexNumber) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(974);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(973);
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
			setState(976);
			_la = _input.LA(1);
			if ( !(_la==T__12 || _la==T__39 || _la==Identifier) ) {
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
			setState(978);
			match(T__90);
			setState(990);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(979);
				match(T__20);
				setState(980);
				userDefinedTypeName();
				setState(985);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(981);
					match(T__14);
					setState(982);
					userDefinedTypeName();
					}
					}
					setState(987);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(988);
				match(T__21);
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
		case 31:
			return typeName_sempred((TypeNameContext)_localctx, predIndex);
		case 55:
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
			return precpred(_ctx, 25);
		case 15:
			return precpred(_ctx, 23);
		case 16:
			return precpred(_ctx, 22);
		case 17:
			return precpred(_ctx, 21);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3~\u03e3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\3\2\3\2\3\2\7\2\u00b0\n\2\f\2\16\2\u00b3\13\2\3\2\3\2\3\3"+
		"\3\3\3\3\7\3\u00ba\n\3\f\3\16\3\u00bd\13\3\3\3\3\3\3\4\3\4\3\5\3\5\5\5"+
		"\u00c5\n\5\3\6\3\6\3\7\5\7\u00ca\n\7\3\7\3\7\3\b\3\b\3\b\5\b\u00d1\n\b"+
		"\3\t\3\t\3\t\3\t\5\t\u00d7\n\t\3\t\3\t\3\t\3\t\5\t\u00dd\n\t\3\t\3\t\5"+
		"\t\u00e1\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00eb\n\t\f\t\16\t\u00ee"+
		"\13\t\3\t\3\t\3\t\3\t\3\t\5\t\u00f5\n\t\3\n\3\n\3\13\5\13\u00fa\n\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\7\13\u0102\n\13\f\13\16\13\u0105\13\13\5"+
		"\13\u0107\n\13\3\13\3\13\7\13\u010b\n\13\f\13\16\13\u010e\13\13\3\13\3"+
		"\13\3\f\3\f\3\f\5\f\u0115\n\f\3\f\5\f\u0118\n\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\5\r\u0122\n\r\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u012a\n\16"+
		"\f\16\16\16\u012d\13\16\3\16\3\16\3\16\5\16\u0132\n\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\5\17\u013b\n\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\7\20\u0147\n\20\f\20\16\20\u014a\13\20\5\20\u014c\n\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\5\22\u0158\n\22\3\22"+
		"\3\22\3\23\3\23\3\23\5\23\u015f\n\23\3\23\5\23\u0162\n\23\3\24\5\24\u0165"+
		"\n\24\3\24\3\24\5\24\u0169\n\24\3\24\3\24\3\24\5\24\u016e\n\24\3\24\3"+
		"\24\5\24\u0172\n\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\7\26"+
		"\u017d\n\26\f\26\16\26\u0180\13\26\3\27\5\27\u0183\n\27\3\27\3\27\3\27"+
		"\3\27\5\27\u0189\n\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\5\31\u0193"+
		"\n\31\3\31\3\31\7\31\u0197\n\31\f\31\16\31\u019a\13\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\7\32\u01a2\n\32\f\32\16\32\u01a5\13\32\5\32\u01a7\n\32"+
		"\3\32\3\32\3\33\3\33\5\33\u01ad\n\33\3\33\5\33\u01b0\n\33\3\34\3\34\3"+
		"\34\3\34\7\34\u01b6\n\34\f\34\16\34\u01b9\13\34\5\34\u01bb\n\34\3\34\3"+
		"\34\3\35\3\35\5\35\u01c1\n\35\3\35\5\35\u01c4\n\35\3\36\3\36\3\36\3\36"+
		"\7\36\u01ca\n\36\f\36\16\36\u01cd\13\36\5\36\u01cf\n\36\3\36\3\36\3\37"+
		"\3\37\5\37\u01d5\n\37\3 \3 \5 \u01d9\n \3 \3 \3!\3!\3!\3!\3!\3!\3!\5!"+
		"\u01e4\n!\3!\3!\3!\5!\u01e9\n!\3!\7!\u01ec\n!\f!\16!\u01ef\13!\3\"\3\""+
		"\3\"\7\"\u01f4\n\"\f\"\16\"\u01f7\13\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3"+
		"$\3$\7$\u0205\n$\f$\16$\u0208\13$\3$\3$\5$\u020c\n$\3%\3%\3&\3&\3\'\3"+
		"\'\7\'\u0214\n\'\f\'\16\'\u0217\13\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\5(\u0227\n(\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\5*\u0233\n*\3+\3"+
		"+\3+\3+\3+\3+\3,\3,\5,\u023d\n,\3-\3-\3-\3-\5-\u0243\n-\3-\3-\5-\u0247"+
		"\n-\3-\5-\u024a\n-\3-\3-\3-\3.\3.\5.\u0251\n.\3.\3.\3/\3/\3/\3/\3/\3/"+
		"\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\5\62\u0265\n\62\3\62\3"+
		"\62\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3"+
		"\65\5\65\u0277\n\65\3\65\3\65\5\65\u027b\n\65\3\65\3\65\3\66\5\66\u0280"+
		"\n\66\3\66\3\66\5\66\u0284\n\66\7\66\u0286\n\66\f\66\16\66\u0289\13\66"+
		"\3\67\3\67\5\67\u028d\n\67\3\67\7\67\u0290\n\67\f\67\16\67\u0293\13\67"+
		"\3\67\5\67\u0296\n\67\3\67\3\67\38\38\39\39\39\39\39\39\39\39\39\39\3"+
		"9\39\39\39\39\39\39\39\59\u02ae\n9\39\39\39\39\39\39\39\39\39\39\39\3"+
		"9\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\3"+
		"9\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\7"+
		"9\u02e9\n9\f9\169\u02ec\139\3:\3:\3:\3:\3:\3:\3:\5:\u02f5\n:\3:\3:\3:"+
		"\3:\3:\5:\u02fc\n:\5:\u02fe\n:\3;\3;\3;\7;\u0303\n;\f;\16;\u0306\13;\3"+
		"<\3<\3<\7<\u030b\n<\f<\16<\u030e\13<\3<\5<\u0311\n<\3=\3=\3=\3=\3>\3>"+
		"\5>\u0319\n>\3>\3>\5>\u031d\n>\5>\u031f\n>\3?\3?\3?\3?\3?\3@\3@\7@\u0328"+
		"\n@\f@\16@\u032b\13@\3@\3@\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3"+
		"A\3A\3A\3A\5A\u0341\nA\3B\3B\5B\u0345\nB\3C\3C\3C\3C\5C\u034b\nC\3C\3"+
		"C\5C\u034f\nC\3C\3C\7C\u0353\nC\fC\16C\u0356\13C\3C\5C\u0359\nC\3D\3D"+
		"\3D\3D\5D\u035f\nD\3E\3E\3E\3E\3F\3F\3F\3F\3F\5F\u036a\nF\3G\3G\3G\7G"+
		"\u036f\nG\fG\16G\u0372\13G\3H\3H\3H\3I\3I\3I\3J\3J\3J\7J\u037d\nJ\fJ\16"+
		"J\u0380\13J\3K\3K\3K\3K\3K\3K\5K\u0388\nK\3L\3L\3L\3L\5L\u038e\nL\3L\3"+
		"L\5L\u0392\nL\3L\3L\3M\3M\3M\3N\3N\3N\5N\u039c\nN\3N\3N\3N\5N\u03a1\n"+
		"N\3N\3N\3O\3O\3O\3O\3P\3P\3Q\3Q\3Q\3Q\3R\3R\5R\u03b1\nR\3R\3R\5R\u03b5"+
		"\nR\7R\u03b7\nR\fR\16R\u03ba\13R\3R\3R\3R\3R\3R\7R\u03c1\nR\fR\16R\u03c4"+
		"\13R\5R\u03c6\nR\3R\5R\u03c9\nR\3S\3S\5S\u03cd\nS\3T\3T\5T\u03d1\nT\3"+
		"U\3U\3V\3V\3V\3V\3V\7V\u03da\nV\fV\16V\u03dd\13V\3V\3V\5V\u03e1\nV\3V"+
		"\3\u00bb\4@pW\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0"+
		"\u00a2\u00a4\u00a6\u00a8\u00aa\2\23\3\2\5\13\3\2^_\3\2\23\25\3\2(*\6\2"+
		"nnttwwyy\5\2$$\63\66`d\3\2\678\3\2:;\3\2<=\4\2\16\16@A\3\2BC\3\2\7\n\3"+
		"\2FG\4\2\13\13LU\5\2ghjj{{\3\2gh\5\2\17\17**zz\2\u0447\2\u00b1\3\2\2\2"+
		"\4\u00b6\3\2\2\2\6\u00c0\3\2\2\2\b\u00c2\3\2\2\2\n\u00c6\3\2\2\2\f\u00c9"+
		"\3\2\2\2\16\u00cd\3\2\2\2\20\u00f4\3\2\2\2\22\u00f6\3\2\2\2\24\u00f9\3"+
		"\2\2\2\26\u0111\3\2\2\2\30\u0121\3\2\2\2\32\u0123\3\2\2\2\34\u0135\3\2"+
		"\2\2\36\u013e\3\2\2\2 \u014f\3\2\2\2\"\u0154\3\2\2\2$\u015b\3\2\2\2&\u0164"+
		"\3\2\2\2(\u0173\3\2\2\2*\u017e\3\2\2\2,\u0182\3\2\2\2.\u018c\3\2\2\2\60"+
		"\u018e\3\2\2\2\62\u019d\3\2\2\2\64\u01aa\3\2\2\2\66\u01b1\3\2\2\28\u01be"+
		"\3\2\2\2:\u01c5\3\2\2\2<\u01d2\3\2\2\2>\u01d6\3\2\2\2@\u01e3\3\2\2\2B"+
		"\u01f0\3\2\2\2D\u01f8\3\2\2\2F\u01ff\3\2\2\2H\u020d\3\2\2\2J\u020f\3\2"+
		"\2\2L\u0211\3\2\2\2N\u0226\3\2\2\2P\u0228\3\2\2\2R\u022b\3\2\2\2T\u0234"+
		"\3\2\2\2V\u023c\3\2\2\2X\u023e\3\2\2\2Z\u024e\3\2\2\2\\\u0254\3\2\2\2"+
		"^\u025c\3\2\2\2`\u025f\3\2\2\2b\u0262\3\2\2\2d\u0268\3\2\2\2f\u026b\3"+
		"\2\2\2h\u0276\3\2\2\2j\u027f\3\2\2\2l\u028a\3\2\2\2n\u0299\3\2\2\2p\u02ad"+
		"\3\2\2\2r\u02fd\3\2\2\2t\u02ff\3\2\2\2v\u0307\3\2\2\2x\u0312\3\2\2\2z"+
		"\u031e\3\2\2\2|\u0320\3\2\2\2~\u0325\3\2\2\2\u0080\u0340\3\2\2\2\u0082"+
		"\u0344\3\2\2\2\u0084\u034a\3\2\2\2\u0086\u035a\3\2\2\2\u0088\u0360\3\2"+
		"\2\2\u008a\u0369\3\2\2\2\u008c\u036b\3\2\2\2\u008e\u0373\3\2\2\2\u0090"+
		"\u0376\3\2\2\2\u0092\u0379\3\2\2\2\u0094\u0387\3\2\2\2\u0096\u0389\3\2"+
		"\2\2\u0098\u0395\3\2\2\2\u009a\u0398\3\2\2\2\u009c\u03a4\3\2\2\2\u009e"+
		"\u03a8\3\2\2\2\u00a0\u03aa\3\2\2\2\u00a2\u03c8\3\2\2\2\u00a4\u03cc\3\2"+
		"\2\2\u00a6\u03ce\3\2\2\2\u00a8\u03d2\3\2\2\2\u00aa\u03d4\3\2\2\2\u00ac"+
		"\u00b0\5\4\3\2\u00ad\u00b0\5\20\t\2\u00ae\u00b0\5\24\13\2\u00af\u00ac"+
		"\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00ae\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b1\3\2"+
		"\2\2\u00b4\u00b5\7\2\2\3\u00b5\3\3\2\2\2\u00b6\u00b7\7\3\2\2\u00b7\u00bb"+
		"\5\6\4\2\u00b8\u00ba\13\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bd\3\2\2\2"+
		"\u00bb\u00bc\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd\u00bb"+
		"\3\2\2\2\u00be\u00bf\7\4\2\2\u00bf\5\3\2\2\2\u00c0\u00c1\7z\2\2\u00c1"+
		"\7\3\2\2\2\u00c2\u00c4\5\f\7\2\u00c3\u00c5\5\f\7\2\u00c4\u00c3\3\2\2\2"+
		"\u00c4\u00c5\3\2\2\2\u00c5\t\3\2\2\2\u00c6\u00c7\t\2\2\2\u00c7\13\3\2"+
		"\2\2\u00c8\u00ca\5\n\6\2\u00c9\u00c8\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb\u00cc\7e\2\2\u00cc\r\3\2\2\2\u00cd\u00d0\5\u00a8"+
		"U\2\u00ce\u00cf\7\f\2\2\u00cf\u00d1\5\u00a8U\2\u00d0\u00ce\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\17\3\2\2\2\u00d2\u00d3\7\r\2\2\u00d3\u00d6\7{\2\2"+
		"\u00d4\u00d5\7\f\2\2\u00d5\u00d7\5\u00a8U\2\u00d6\u00d4\3\2\2\2\u00d6"+
		"\u00d7\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00f5\7\4\2\2\u00d9\u00dc\7\r"+
		"\2\2\u00da\u00dd\7\16\2\2\u00db\u00dd\5\u00a8U\2\u00dc\u00da\3\2\2\2\u00dc"+
		"\u00db\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00df\7\f\2\2\u00df\u00e1\5\u00a8"+
		"U\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2"+
		"\u00e3\7\17\2\2\u00e3\u00e4\7{\2\2\u00e4\u00f5\7\4\2\2\u00e5\u00e6\7\r"+
		"\2\2\u00e6\u00e7\7\20\2\2\u00e7\u00ec\5\16\b\2\u00e8\u00e9\7\21\2\2\u00e9"+
		"\u00eb\5\16\b\2\u00ea\u00e8\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3"+
		"\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef"+
		"\u00f0\7\22\2\2\u00f0\u00f1\7\17\2\2\u00f1\u00f2\7{\2\2\u00f2\u00f3\7"+
		"\4\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00d2\3\2\2\2\u00f4\u00d9\3\2\2\2\u00f4"+
		"\u00e5\3\2\2\2\u00f5\21\3\2\2\2\u00f6\u00f7\t\3\2\2\u00f7\23\3\2\2\2\u00f8"+
		"\u00fa\5\22\n\2\u00f9\u00f8\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\3"+
		"\2\2\2\u00fb\u00fc\t\4\2\2\u00fc\u0106\5\u00a8U\2\u00fd\u00fe\7\26\2\2"+
		"\u00fe\u0103\5\26\f\2\u00ff\u0100\7\21\2\2\u0100\u0102\5\26\f\2\u0101"+
		"\u00ff\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2"+
		"\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u00fd\3\2\2\2\u0106"+
		"\u0107\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010c\7\20\2\2\u0109\u010b\5"+
		"\30\r\2\u010a\u0109\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c"+
		"\u010d\3\2\2\2\u010d\u010f\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0110\7\22"+
		"\2\2\u0110\25\3\2\2\2\u0111\u0117\5B\"\2\u0112\u0114\7\27\2\2\u0113\u0115"+
		"\5t;\2\u0114\u0113\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116\3\2\2\2\u0116"+
		"\u0118\7\30\2\2\u0117\u0112\3\2\2\2\u0117\u0118\3\2\2\2\u0118\27\3\2\2"+
		"\2\u0119\u0122\5\32\16\2\u011a\u0122\5\34\17\2\u011b\u0122\5\36\20\2\u011c"+
		"\u0122\5 \21\2\u011d\u0122\5\"\22\2\u011e\u0122\5&\24\2\u011f\u0122\5"+
		",\27\2\u0120\u0122\5\60\31\2\u0121\u0119\3\2\2\2\u0121\u011a\3\2\2\2\u0121"+
		"\u011b\3\2\2\2\u0121\u011c\3\2\2\2\u0121\u011d\3\2\2\2\u0121\u011e\3\2"+
		"\2\2\u0121\u011f\3\2\2\2\u0121\u0120\3\2\2\2\u0122\31\3\2\2\2\u0123\u012b"+
		"\5@!\2\u0124\u012a\7v\2\2\u0125\u012a\7s\2\2\u0126\u012a\7u\2\2\u0127"+
		"\u012a\7n\2\2\u0128\u012a\5\u00aaV\2\u0129\u0124\3\2\2\2\u0129\u0125\3"+
		"\2\2\2\u0129\u0126\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u0128\3\2\2\2\u012a"+
		"\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012e\3\2"+
		"\2\2\u012d\u012b\3\2\2\2\u012e\u0131\5\u00a8U\2\u012f\u0130\7\13\2\2\u0130"+
		"\u0132\5p9\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133\3\2\2"+
		"\2\u0133\u0134\7\4\2\2\u0134\33\3\2\2\2\u0135\u0136\7\31\2\2\u0136\u0137"+
		"\5\u00a8U\2\u0137\u013a\7\32\2\2\u0138\u013b\7\16\2\2\u0139\u013b\5@!"+
		"\2\u013a\u0138\3\2\2\2\u013a\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d"+
		"\7\4\2\2\u013d\35\3\2\2\2\u013e\u013f\7\33\2\2\u013f\u0140\5\u00a8U\2"+
		"\u0140\u014b\7\20\2\2\u0141\u0142\5> \2\u0142\u0148\7\4\2\2\u0143\u0144"+
		"\5> \2\u0144\u0145\7\4\2\2\u0145\u0147\3\2\2\2\u0146\u0143\3\2\2\2\u0147"+
		"\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014c\3\2"+
		"\2\2\u014a\u0148\3\2\2\2\u014b\u0141\3\2\2\2\u014b\u014c\3\2\2\2\u014c"+
		"\u014d\3\2\2\2\u014d\u014e\7\22\2\2\u014e\37\3\2\2\2\u014f\u0150\7\34"+
		"\2\2\u0150\u0151\5\62\32\2\u0151\u0152\5*\26\2\u0152\u0153\5L\'\2\u0153"+
		"!\3\2\2\2\u0154\u0155\7\35\2\2\u0155\u0157\5\u00a8U\2\u0156\u0158\5\62"+
		"\32\2\u0157\u0156\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0159\3\2\2\2\u0159"+
		"\u015a\5L\'\2\u015a#\3\2\2\2\u015b\u0161\5\u00a8U\2\u015c\u015e\7\27\2"+
		"\2\u015d\u015f\5t;\2\u015e\u015d\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0160"+
		"\3\2\2\2\u0160\u0162\7\30\2\2\u0161\u015c\3\2\2\2\u0161\u0162\3\2\2\2"+
		"\u0162%\3\2\2\2\u0163\u0165\5\22\n\2\u0164\u0163\3\2\2\2\u0164\u0165\3"+
		"\2\2\2\u0165\u0166\3\2\2\2\u0166\u0168\7\36\2\2\u0167\u0169\5\u00a8U\2"+
		"\u0168\u0167\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016b"+
		"\5\62\32\2\u016b\u016d\5*\26\2\u016c\u016e\5(\25\2\u016d\u016c\3\2\2\2"+
		"\u016d\u016e\3\2\2\2\u016e\u0171\3\2\2\2\u016f\u0172\7\4\2\2\u0170\u0172"+
		"\5L\'\2\u0171\u016f\3\2\2\2\u0171\u0170\3\2\2\2\u0172\'\3\2\2\2\u0173"+
		"\u0174\7\37\2\2\u0174\u0175\5\62\32\2\u0175)\3\2\2\2\u0176\u017d\5$\23"+
		"\2\u0177\u017d\5J&\2\u0178\u017d\7q\2\2\u0179\u017d\7v\2\2\u017a\u017d"+
		"\7s\2\2\u017b\u017d\7u\2\2\u017c\u0176\3\2\2\2\u017c\u0177\3\2\2\2\u017c"+
		"\u0178\3\2\2\2\u017c\u0179\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017b\3\2"+
		"\2\2\u017d\u0180\3\2\2\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f"+
		"+\3\2\2\2\u0180\u017e\3\2\2\2\u0181\u0183\5\22\n\2\u0182\u0181\3\2\2\2"+
		"\u0182\u0183\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0185\7 \2\2\u0185\u0186"+
		"\5\u00a8U\2\u0186\u0188\5\66\34\2\u0187\u0189\7l\2\2\u0188\u0187\3\2\2"+
		"\2\u0188\u0189\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b\7\4\2\2\u018b-"+
		"\3\2\2\2\u018c\u018d\5\u00a8U\2\u018d/\3\2\2\2\u018e\u018f\7!\2\2\u018f"+
		"\u0190\5\u00a8U\2\u0190\u0192\7\20\2\2\u0191\u0193\5.\30\2\u0192\u0191"+
		"\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0198\3\2\2\2\u0194\u0195\7\21\2\2"+
		"\u0195\u0197\5.\30\2\u0196\u0194\3\2\2\2\u0197\u019a\3\2\2\2\u0198\u0196"+
		"\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019b\3\2\2\2\u019a\u0198\3\2\2\2\u019b"+
		"\u019c\7\22\2\2\u019c\61\3\2\2\2\u019d\u01a6\7\27\2\2\u019e\u01a3\5\64"+
		"\33\2\u019f\u01a0\7\21\2\2\u01a0\u01a2\5\64\33\2\u01a1\u019f\3\2\2\2\u01a2"+
		"\u01a5\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a7\3\2"+
		"\2\2\u01a5\u01a3\3\2\2\2\u01a6\u019e\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7"+
		"\u01a8\3\2\2\2\u01a8\u01a9\7\30\2\2\u01a9\63\3\2\2\2\u01aa\u01ac\5@!\2"+
		"\u01ab\u01ad\5H%\2\u01ac\u01ab\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01af"+
		"\3\2\2\2\u01ae\u01b0\5\u00a8U\2\u01af\u01ae\3\2\2\2\u01af\u01b0\3\2\2"+
		"\2\u01b0\65\3\2\2\2\u01b1\u01ba\7\27\2\2\u01b2\u01b7\58\35\2\u01b3\u01b4"+
		"\7\21\2\2\u01b4\u01b6\58\35\2\u01b5\u01b3\3\2\2\2\u01b6\u01b9\3\2\2\2"+
		"\u01b7\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01bb\3\2\2\2\u01b9\u01b7"+
		"\3\2\2\2\u01ba\u01b2\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc"+
		"\u01bd\7\30\2\2\u01bd\67\3\2\2\2\u01be\u01c0\5@!\2\u01bf\u01c1\7r\2\2"+
		"\u01c0\u01bf\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c3\3\2\2\2\u01c2\u01c4"+
		"\5\u00a8U\2\u01c3\u01c2\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c49\3\2\2\2\u01c5"+
		"\u01ce\7\27\2\2\u01c6\u01cb\5<\37\2\u01c7\u01c8\7\21\2\2\u01c8\u01ca\5"+
		"<\37\2\u01c9\u01c7\3\2\2\2\u01ca\u01cd\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cb"+
		"\u01cc\3\2\2\2\u01cc\u01cf\3\2\2\2\u01cd\u01cb\3\2\2\2\u01ce\u01c6\3\2"+
		"\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d1\7\30\2\2\u01d1"+
		";\3\2\2\2\u01d2\u01d4\5@!\2\u01d3\u01d5\5H%\2\u01d4\u01d3\3\2\2\2\u01d4"+
		"\u01d5\3\2\2\2\u01d5=\3\2\2\2\u01d6\u01d8\5@!\2\u01d7\u01d9\5H%\2\u01d8"+
		"\u01d7\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01db\5\u00a8"+
		"U\2\u01db?\3\2\2\2\u01dc\u01dd\b!\1\2\u01dd\u01e4\5n8\2\u01de\u01e4\5"+
		"B\"\2\u01df\u01e4\5D#\2\u01e0\u01e4\5F$\2\u01e1\u01e2\7$\2\2\u01e2\u01e4"+
		"\7t\2\2\u01e3\u01dc\3\2\2\2\u01e3\u01de\3\2\2\2\u01e3\u01df\3\2\2\2\u01e3"+
		"\u01e0\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e4\u01ed\3\2\2\2\u01e5\u01e6\f\5"+
		"\2\2\u01e6\u01e8\7\"\2\2\u01e7\u01e9\5p9\2\u01e8\u01e7\3\2\2\2\u01e8\u01e9"+
		"\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01ec\7#\2\2\u01eb\u01e5\3\2\2\2\u01ec"+
		"\u01ef\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ed\u01ee\3\2\2\2\u01eeA\3\2\2\2"+
		"\u01ef\u01ed\3\2\2\2\u01f0\u01f5\5\u00a8U\2\u01f1\u01f2\7%\2\2\u01f2\u01f4"+
		"\5\u00a8U\2\u01f3\u01f1\3\2\2\2\u01f4\u01f7\3\2\2\2\u01f5\u01f3\3\2\2"+
		"\2\u01f5\u01f6\3\2\2\2\u01f6C\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f8\u01f9"+
		"\7&\2\2\u01f9\u01fa\7\27\2\2\u01fa\u01fb\5n8\2\u01fb\u01fc\7\'\2\2\u01fc"+
		"\u01fd\5@!\2\u01fd\u01fe\7\30\2\2\u01feE\3\2\2\2\u01ff\u0200\7\36\2\2"+
		"\u0200\u0206\5:\36\2\u0201\u0205\7s\2\2\u0202\u0205\7q\2\2\u0203\u0205"+
		"\5J&\2\u0204\u0201\3\2\2\2\u0204\u0202\3\2\2\2\u0204\u0203\3\2\2\2\u0205"+
		"\u0208\3\2\2\2\u0206\u0204\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u020b\3\2"+
		"\2\2\u0208\u0206\3\2\2\2\u0209\u020a\7\37\2\2\u020a\u020c\5:\36\2\u020b"+
		"\u0209\3\2\2\2\u020b\u020c\3\2\2\2\u020cG\3\2\2\2\u020d\u020e\t\5\2\2"+
		"\u020eI\3\2\2\2\u020f\u0210\t\6\2\2\u0210K\3\2\2\2\u0211\u0215\7\20\2"+
		"\2\u0212\u0214\5N(\2\u0213\u0212\3\2\2\2\u0214\u0217\3\2\2\2\u0215\u0213"+
		"\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0218\3\2\2\2\u0217\u0215\3\2\2\2\u0218"+
		"\u0219\7\22\2\2\u0219M\3\2\2\2\u021a\u0227\5R*\2\u021b\u0227\5T+\2\u021c"+
		"\u0227\5X-\2\u021d\u0227\5L\'\2\u021e\u0227\5Z.\2\u021f\u0227\5\\/\2\u0220"+
		"\u0227\5^\60\2\u0221\u0227\5`\61\2\u0222\u0227\5b\62\2\u0223\u0227\5d"+
		"\63\2\u0224\u0227\5f\64\2\u0225\u0227\5V,\2\u0226\u021a\3\2\2\2\u0226"+
		"\u021b\3\2\2\2\u0226\u021c\3\2\2\2\u0226\u021d\3\2\2\2\u0226\u021e\3\2"+
		"\2\2\u0226\u021f\3\2\2\2\u0226\u0220\3\2\2\2\u0226\u0221\3\2\2\2\u0226"+
		"\u0222\3\2\2\2\u0226\u0223\3\2\2\2\u0226\u0224\3\2\2\2\u0226\u0225\3\2"+
		"\2\2\u0227O\3\2\2\2\u0228\u0229\5p9\2\u0229\u022a\7\4\2\2\u022aQ\3\2\2"+
		"\2\u022b\u022c\7+\2\2\u022c\u022d\7\27\2\2\u022d\u022e\5p9\2\u022e\u022f"+
		"\7\30\2\2\u022f\u0232\5N(\2\u0230\u0231\7,\2\2\u0231\u0233\5N(\2\u0232"+
		"\u0230\3\2\2\2\u0232\u0233\3\2\2\2\u0233S\3\2\2\2\u0234\u0235\7-\2\2\u0235"+
		"\u0236\7\27\2\2\u0236\u0237\5p9\2\u0237\u0238\7\30\2\2\u0238\u0239\5N"+
		"(\2\u0239U\3\2\2\2\u023a\u023d\5h\65\2\u023b\u023d\5P)\2\u023c\u023a\3"+
		"\2\2\2\u023c\u023b\3\2\2\2\u023dW\3\2\2\2\u023e\u023f\7\32\2\2\u023f\u0242"+
		"\7\27\2\2\u0240\u0243\5V,\2\u0241\u0243\7\4\2\2\u0242\u0240\3\2\2\2\u0242"+
		"\u0241\3\2\2\2\u0243\u0246\3\2\2\2\u0244\u0247\5P)\2\u0245\u0247\7\4\2"+
		"\2\u0246\u0244\3\2\2\2\u0246\u0245\3\2\2\2\u0247\u0249\3\2\2\2\u0248\u024a"+
		"\5p9\2\u0249\u0248\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u024b\3\2\2\2\u024b"+
		"\u024c\7\30\2\2\u024c\u024d\5N(\2\u024dY\3\2\2\2\u024e\u0250\7.\2\2\u024f"+
		"\u0251\7{\2\2\u0250\u024f\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0252\3\2"+
		"\2\2\u0252\u0253\5~@\2\u0253[\3\2\2\2\u0254\u0255\7/\2\2\u0255\u0256\5"+
		"N(\2\u0256\u0257\7-\2\2\u0257\u0258\7\27\2\2\u0258\u0259\5p9\2\u0259\u025a"+
		"\7\30\2\2\u025a\u025b\7\4\2\2\u025b]\3\2\2\2\u025c\u025d\7o\2\2\u025d"+
		"\u025e\7\4\2\2\u025e_\3\2\2\2\u025f\u0260\7m\2\2\u0260\u0261\7\4\2\2\u0261"+
		"a\3\2\2\2\u0262\u0264\7\60\2\2\u0263\u0265\5p9\2\u0264\u0263\3\2\2\2\u0264"+
		"\u0265\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u0267\7\4\2\2\u0267c\3\2\2\2"+
		"\u0268\u0269\7\61\2\2\u0269\u026a\7\4\2\2\u026ae\3\2\2\2\u026b\u026c\7"+
		"\62\2\2\u026c\u026d\5|?\2\u026d\u026e\7\4\2\2\u026eg\3\2\2\2\u026f\u0270"+
		"\7\63\2\2\u0270\u0277\5l\67\2\u0271\u0277\5> \2\u0272\u0273\7\27\2\2\u0273"+
		"\u0274\5j\66\2\u0274\u0275\7\30\2\2\u0275\u0277\3\2\2\2\u0276\u026f\3"+
		"\2\2\2\u0276\u0271\3\2\2\2\u0276\u0272\3\2\2\2\u0277\u027a\3\2\2\2\u0278"+
		"\u0279\7\13\2\2\u0279\u027b\5p9\2\u027a\u0278\3\2\2\2\u027a\u027b\3\2"+
		"\2\2\u027b\u027c\3\2\2\2\u027c\u027d\7\4\2\2\u027di\3\2\2\2\u027e\u0280"+
		"\5> \2\u027f\u027e\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0287\3\2\2\2\u0281"+
		"\u0283\7\21\2\2\u0282\u0284\5> \2\u0283\u0282\3\2\2\2\u0283\u0284\3\2"+
		"\2\2\u0284\u0286\3\2\2\2\u0285\u0281\3\2\2\2\u0286\u0289\3\2\2\2\u0287"+
		"\u0285\3\2\2\2\u0287\u0288\3\2\2\2\u0288k\3\2\2\2\u0289\u0287\3\2\2\2"+
		"\u028a\u0291\7\27\2\2\u028b\u028d\5\u00a8U\2\u028c\u028b\3\2\2\2\u028c"+
		"\u028d\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u0290\7\21\2\2\u028f\u028c\3"+
		"\2\2\2\u0290\u0293\3\2\2\2\u0291\u028f\3\2\2\2\u0291\u0292\3\2\2\2\u0292"+
		"\u0295\3\2\2\2\u0293\u0291\3\2\2\2\u0294\u0296\5\u00a8U\2\u0295\u0294"+
		"\3\2\2\2\u0295\u0296\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u0298\7\30\2\2"+
		"\u0298m\3\2\2\2\u0299\u029a\t\7\2\2\u029ao\3\2\2\2\u029b\u029c\b9\1\2"+
		"\u029c\u029d\79\2\2\u029d\u02ae\5@!\2\u029e\u029f\7\27\2\2\u029f\u02a0"+
		"\5p9\2\u02a0\u02a1\7\30\2\2\u02a1\u02ae\3\2\2\2\u02a2\u02a3\t\b\2\2\u02a3"+
		"\u02ae\5p9\25\u02a4\u02a5\t\t\2\2\u02a5\u02ae\5p9\24\u02a6\u02a7\t\n\2"+
		"\2\u02a7\u02ae\5p9\23\u02a8\u02a9\7>\2\2\u02a9\u02ae\5p9\22\u02aa\u02ab"+
		"\7\6\2\2\u02ab\u02ae\5p9\21\u02ac\u02ae\5r:\2\u02ad\u029b\3\2\2\2\u02ad"+
		"\u029e\3\2\2\2\u02ad\u02a2\3\2\2\2\u02ad\u02a4\3\2\2\2\u02ad\u02a6\3\2"+
		"\2\2\u02ad\u02a8\3\2\2\2\u02ad\u02aa\3\2\2\2\u02ad\u02ac\3\2\2\2\u02ae"+
		"\u02ea\3\2\2\2\u02af\u02b0\f\20\2\2\u02b0\u02b1\7?\2\2\u02b1\u02e9\5p"+
		"9\21\u02b2\u02b3\f\17\2\2\u02b3\u02b4\t\13\2\2\u02b4\u02e9\5p9\20\u02b5"+
		"\u02b6\f\16\2\2\u02b6\u02b7\t\t\2\2\u02b7\u02e9\5p9\17\u02b8\u02b9\f\r"+
		"\2\2\u02b9\u02ba\t\f\2\2\u02ba\u02e9\5p9\16\u02bb\u02bc\f\f\2\2\u02bc"+
		"\u02bd\7D\2\2\u02bd\u02e9\5p9\r\u02be\u02bf\f\13\2\2\u02bf\u02c0\7\5\2"+
		"\2\u02c0\u02e9\5p9\f\u02c1\u02c2\f\n\2\2\u02c2\u02c3\7E\2\2\u02c3\u02e9"+
		"\5p9\13\u02c4\u02c5\f\t\2\2\u02c5\u02c6\t\r\2\2\u02c6\u02e9\5p9\n\u02c7"+
		"\u02c8\f\b\2\2\u02c8\u02c9\t\16\2\2\u02c9\u02e9\5p9\t\u02ca\u02cb\f\7"+
		"\2\2\u02cb\u02cc\7H\2\2\u02cc\u02e9\5p9\b\u02cd\u02ce\f\6\2\2\u02ce\u02cf"+
		"\7I\2\2\u02cf\u02e9\5p9\7\u02d0\u02d1\f\5\2\2\u02d1\u02d2\7J\2\2\u02d2"+
		"\u02d3\5p9\2\u02d3\u02d4\7K\2\2\u02d4\u02d5\5p9\6\u02d5\u02e9\3\2\2\2"+
		"\u02d6\u02d7\f\4\2\2\u02d7\u02d8\t\17\2\2\u02d8\u02e9\5p9\5\u02d9\u02da"+
		"\f\33\2\2\u02da\u02e9\t\b\2\2\u02db\u02dc\f\31\2\2\u02dc\u02dd\7\"\2\2"+
		"\u02dd\u02de\5p9\2\u02de\u02df\7#\2\2\u02df\u02e9\3\2\2\2\u02e0\u02e1"+
		"\f\30\2\2\u02e1\u02e2\7\27\2\2\u02e2\u02e3\5z>\2\u02e3\u02e4\7\30\2\2"+
		"\u02e4\u02e9\3\2\2\2\u02e5\u02e6\f\27\2\2\u02e6\u02e7\7%\2\2\u02e7\u02e9"+
		"\5\u00a8U\2\u02e8\u02af\3\2\2\2\u02e8\u02b2\3\2\2\2\u02e8\u02b5\3\2\2"+
		"\2\u02e8\u02b8\3\2\2\2\u02e8\u02bb\3\2\2\2\u02e8\u02be\3\2\2\2\u02e8\u02c1"+
		"\3\2\2\2\u02e8\u02c4\3\2\2\2\u02e8\u02c7\3\2\2\2\u02e8\u02ca\3\2\2\2\u02e8"+
		"\u02cd\3\2\2\2\u02e8\u02d0\3\2\2\2\u02e8\u02d6\3\2\2\2\u02e8\u02d9\3\2"+
		"\2\2\u02e8\u02db\3\2\2\2\u02e8\u02e0\3\2\2\2\u02e8\u02e5\3\2\2\2\u02e9"+
		"\u02ec\3\2\2\2\u02ea\u02e8\3\2\2\2\u02ea\u02eb\3\2\2\2\u02ebq\3\2\2\2"+
		"\u02ec\u02ea\3\2\2\2\u02ed\u02fe\7f\2\2\u02ee\u02fe\5\u00a6T\2\u02ef\u02fe"+
		"\7j\2\2\u02f0\u02fe\7{\2\2\u02f1\u02f4\5\u00a8U\2\u02f2\u02f3\7\"\2\2"+
		"\u02f3\u02f5\7#\2\2\u02f4\u02f2\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5\u02fe"+
		"\3\2\2\2\u02f6\u02fe\7x\2\2\u02f7\u02fe\5\u00a2R\2\u02f8\u02fb\5\u00a4"+
		"S\2\u02f9\u02fa\7\"\2\2\u02fa\u02fc\7#\2\2\u02fb\u02f9\3\2\2\2\u02fb\u02fc"+
		"\3\2\2\2\u02fc\u02fe\3\2\2\2\u02fd\u02ed\3\2\2\2\u02fd\u02ee\3\2\2\2\u02fd"+
		"\u02ef\3\2\2\2\u02fd\u02f0\3\2\2\2\u02fd\u02f1\3\2\2\2\u02fd\u02f6\3\2"+
		"\2\2\u02fd\u02f7\3\2\2\2\u02fd\u02f8\3\2\2\2\u02fes\3\2\2\2\u02ff\u0304"+
		"\5p9\2\u0300\u0301\7\21\2\2\u0301\u0303\5p9\2\u0302\u0300\3\2\2\2\u0303"+
		"\u0306\3\2\2\2\u0304\u0302\3\2\2\2\u0304\u0305\3\2\2\2\u0305u\3\2\2\2"+
		"\u0306\u0304\3\2\2\2\u0307\u030c\5x=\2\u0308\u0309\7\21\2\2\u0309\u030b"+
		"\5x=\2\u030a\u0308\3\2\2\2\u030b\u030e\3\2\2\2\u030c\u030a\3\2\2\2\u030c"+
		"\u030d\3\2\2\2\u030d\u0310\3\2\2\2\u030e\u030c\3\2\2\2\u030f\u0311\7\21"+
		"\2\2\u0310\u030f\3\2\2\2\u0310\u0311\3\2\2\2\u0311w\3\2\2\2\u0312\u0313"+
		"\5\u00a8U\2\u0313\u0314\7K\2\2\u0314\u0315\5p9\2\u0315y\3\2\2\2\u0316"+
		"\u0318\7\20\2\2\u0317\u0319\5v<\2\u0318\u0317\3\2\2\2\u0318\u0319\3\2"+
		"\2\2\u0319\u031a\3\2\2\2\u031a\u031f\7\22\2\2\u031b\u031d\5t;\2\u031c"+
		"\u031b\3\2\2\2\u031c\u031d\3\2\2\2\u031d\u031f\3\2\2\2\u031e\u0316\3\2"+
		"\2\2\u031e\u031c\3\2\2\2\u031f{\3\2\2\2\u0320\u0321\5p9\2\u0321\u0322"+
		"\7\27\2\2\u0322\u0323\5z>\2\u0323\u0324\7\30\2\2\u0324}\3\2\2\2\u0325"+
		"\u0329\7\20\2\2\u0326\u0328\5\u0080A\2\u0327\u0326\3\2\2\2\u0328\u032b"+
		"\3\2\2\2\u0329\u0327\3\2\2\2\u0329\u032a\3\2\2\2\u032a\u032c\3\2\2\2\u032b"+
		"\u0329\3\2\2\2\u032c\u032d\7\22\2\2\u032d\177\3\2\2\2\u032e\u0341\5\u00a8"+
		"U\2\u032f\u0341\5~@\2\u0330\u0341\5\u0082B\2\u0331\u0341\5\u0086D\2\u0332"+
		"\u0341\5\u0088E\2\u0333\u0341\5\u008eH\2\u0334\u0341\5\u0090I\2\u0335"+
		"\u0341\5\u0092J\2\u0336\u0341\5\u0096L\2\u0337\u0341\5\u009aN\2\u0338"+
		"\u0341\5\u009cO\2\u0339\u0341\7m\2\2\u033a\u0341\7o\2\2\u033b\u0341\7"+
		"p\2\2\u033c\u0341\5\u00a0Q\2\u033d\u0341\5\u00a6T\2\u033e\u0341\7{\2\2"+
		"\u033f\u0341\7j\2\2\u0340\u032e\3\2\2\2\u0340\u032f\3\2\2\2\u0340\u0330"+
		"\3\2\2\2\u0340\u0331\3\2\2\2\u0340\u0332\3\2\2\2\u0340\u0333\3\2\2\2\u0340"+
		"\u0334\3\2\2\2\u0340\u0335\3\2\2\2\u0340\u0336\3\2\2\2\u0340\u0337\3\2"+
		"\2\2\u0340\u0338\3\2\2\2\u0340\u0339\3\2\2\2\u0340\u033a\3\2\2\2\u0340"+
		"\u033b\3\2\2\2\u0340\u033c\3\2\2\2\u0340\u033d\3\2\2\2\u0340\u033e\3\2"+
		"\2\2\u0340\u033f\3\2\2\2\u0341\u0081\3\2\2\2\u0342\u0345\5\u0084C\2\u0343"+
		"\u0345\5\u009eP\2\u0344\u0342\3\2\2\2\u0344\u0343\3\2\2\2\u0345\u0083"+
		"\3\2\2\2\u0346\u034b\7\60\2\2\u0347\u034b\7$\2\2\u0348\u034b\7\66\2\2"+
		"\u0349\u034b\5\u00a8U\2\u034a\u0346\3\2\2\2\u034a\u0347\3\2\2\2\u034a"+
		"\u0348\3\2\2\2\u034a\u0349\3\2\2\2\u034b\u0358\3\2\2\2\u034c\u034e\7\27"+
		"\2\2\u034d\u034f\5\u0082B\2\u034e\u034d\3\2\2\2\u034e\u034f\3\2\2\2\u034f"+
		"\u0354\3\2\2\2\u0350\u0351\7\21\2\2\u0351\u0353\5\u0082B\2\u0352\u0350"+
		"\3\2\2\2\u0353\u0356\3\2\2\2\u0354\u0352\3\2\2\2\u0354\u0355\3\2\2\2\u0355"+
		"\u0357\3\2\2\2\u0356\u0354\3\2\2\2\u0357\u0359\7\30\2\2\u0358\u034c\3"+
		"\2\2\2\u0358\u0359\3\2\2\2\u0359\u0085\3\2\2\2\u035a\u035b\7V\2\2\u035b"+
		"\u035e\5\u008aF\2\u035c\u035d\7W\2\2\u035d\u035f\5\u0082B\2\u035e\u035c"+
		"\3\2\2\2\u035e\u035f\3\2\2\2\u035f\u0087\3\2\2\2\u0360\u0361\5\u008aF"+
		"\2\u0361\u0362\7W\2\2\u0362\u0363\5\u0082B\2\u0363\u0089\3\2\2\2\u0364"+
		"\u036a\5\u00a8U\2\u0365\u0366\7\27\2\2\u0366\u0367\5\u008cG\2\u0367\u0368"+
		"\7\30\2\2\u0368\u036a\3\2\2\2\u0369\u0364\3\2\2\2\u0369\u0365\3\2\2\2"+
		"\u036a\u008b\3\2\2\2\u036b\u0370\5\u00a8U\2\u036c\u036d\7\21\2\2\u036d"+
		"\u036f\5\u00a8U\2\u036e\u036c\3\2\2\2\u036f\u0372\3\2\2\2\u0370\u036e"+
		"\3\2\2\2\u0370\u0371\3\2\2\2\u0371\u008d\3\2\2\2\u0372\u0370\3\2\2\2\u0373"+
		"\u0374\7X\2\2\u0374\u0375\5\u00a8U\2\u0375\u008f\3\2\2\2\u0376\u0377\5"+
		"\u00a8U\2\u0377\u0378\7K\2\2\u0378\u0091\3\2\2\2\u0379\u037a\7Y\2\2\u037a"+
		"\u037e\5\u0082B\2\u037b\u037d\5\u0094K\2\u037c\u037b\3\2\2\2\u037d\u0380"+
		"\3\2\2\2\u037e\u037c\3\2\2\2\u037e\u037f\3\2\2\2\u037f\u0093\3\2\2\2\u0380"+
		"\u037e\3\2\2\2\u0381\u0382\7Z\2\2\u0382\u0383\5\u009eP\2\u0383\u0384\5"+
		"~@\2\u0384\u0388\3\2\2\2\u0385\u0386\7[\2\2\u0386\u0388\5~@\2\u0387\u0381"+
		"\3\2\2\2\u0387\u0385\3\2\2\2\u0388\u0095\3\2\2\2\u0389\u038a\7\36\2\2"+
		"\u038a\u038b\5\u00a8U\2\u038b\u038d\7\27\2\2\u038c\u038e\5\u008cG\2\u038d"+
		"\u038c\3\2\2\2\u038d\u038e\3\2\2\2\u038e\u038f\3\2\2\2\u038f\u0391\7\30"+
		"\2\2\u0390\u0392\5\u0098M\2\u0391\u0390\3\2\2\2\u0391\u0392\3\2\2\2\u0392"+
		"\u0393\3\2\2\2\u0393\u0394\5~@\2\u0394\u0097\3\2\2\2\u0395\u0396\7\\\2"+
		"\2\u0396\u0397\5\u008cG\2\u0397\u0099\3\2\2\2\u0398\u039b\7\32\2\2\u0399"+
		"\u039c\5~@\2\u039a\u039c\5\u0082B\2\u039b\u0399\3\2\2\2\u039b\u039a\3"+
		"\2\2\2\u039c\u039d\3\2\2\2\u039d\u03a0\5\u0082B\2\u039e\u03a1\5~@\2\u039f"+
		"\u03a1\5\u0082B\2\u03a0\u039e\3\2\2\2\u03a0\u039f\3\2\2\2\u03a1\u03a2"+
		"\3\2\2\2\u03a2\u03a3\5~@\2\u03a3\u009b\3\2\2\2\u03a4\u03a5\7+\2\2\u03a5"+
		"\u03a6\5\u0082B\2\u03a6\u03a7\5~@\2\u03a7\u009d\3\2\2\2\u03a8\u03a9\t"+
		"\20\2\2\u03a9\u009f\3\2\2\2\u03aa\u03ab\7.\2\2\u03ab\u03ac\5\u00a8U\2"+
		"\u03ac\u03ad\5~@\2\u03ad\u00a1\3\2\2\2\u03ae\u03b0\7\27\2\2\u03af\u03b1"+
		"\5p9\2\u03b0\u03af\3\2\2\2\u03b0\u03b1\3\2\2\2\u03b1\u03b8\3\2\2\2\u03b2"+
		"\u03b4\7\21\2\2\u03b3\u03b5\5p9\2\u03b4\u03b3\3\2\2\2\u03b4\u03b5\3\2"+
		"\2\2\u03b5\u03b7\3\2\2\2\u03b6\u03b2\3\2\2\2\u03b7\u03ba\3\2\2\2\u03b8"+
		"\u03b6\3\2\2\2\u03b8\u03b9\3\2\2\2\u03b9\u03bb\3\2\2\2\u03ba\u03b8\3\2"+
		"\2\2\u03bb\u03c9\7\30\2\2\u03bc\u03c5\7\"\2\2\u03bd\u03c2\5p9\2\u03be"+
		"\u03bf\7\21\2\2\u03bf\u03c1\5p9\2\u03c0\u03be\3\2\2\2\u03c1\u03c4\3\2"+
		"\2\2\u03c2\u03c0\3\2\2\2\u03c2\u03c3\3\2\2\2\u03c3\u03c6\3\2\2\2\u03c4"+
		"\u03c2\3\2\2\2\u03c5\u03bd\3\2\2\2\u03c5\u03c6\3\2\2\2\u03c6\u03c7\3\2"+
		"\2\2\u03c7\u03c9\7#\2\2\u03c8\u03ae\3\2\2\2\u03c8\u03bc\3\2\2\2\u03c9"+
		"\u00a3\3\2\2\2\u03ca\u03cd\5n8\2\u03cb\u03cd\5B\"\2\u03cc\u03ca\3\2\2"+
		"\2\u03cc\u03cb\3\2\2\2\u03cd\u00a5\3\2\2\2\u03ce\u03d0\t\21\2\2\u03cf"+
		"\u03d1\7i\2\2\u03d0\u03cf\3\2\2\2\u03d0\u03d1\3\2\2\2\u03d1\u00a7\3\2"+
		"\2\2\u03d2\u03d3\t\22\2\2\u03d3\u00a9\3\2\2\2\u03d4\u03e0\7]\2\2\u03d5"+
		"\u03d6\7\27\2\2\u03d6\u03db\5B\"\2\u03d7\u03d8\7\21\2\2\u03d8\u03da\5"+
		"B\"\2\u03d9\u03d7\3\2\2\2\u03da\u03dd\3\2\2\2\u03db\u03d9\3\2\2\2\u03db"+
		"\u03dc\3\2\2\2\u03dc\u03de\3\2\2\2\u03dd\u03db\3\2\2\2\u03de\u03df\7\30"+
		"\2\2\u03df\u03e1\3\2\2\2\u03e0\u03d5\3\2\2\2\u03e0\u03e1\3\2\2\2\u03e1"+
		"\u00ab\3\2\2\2q\u00af\u00b1\u00bb\u00c4\u00c9\u00d0\u00d6\u00dc\u00e0"+
		"\u00ec\u00f4\u00f9\u0103\u0106\u010c\u0114\u0117\u0121\u0129\u012b\u0131"+
		"\u013a\u0148\u014b\u0157\u015e\u0161\u0164\u0168\u016d\u0171\u017c\u017e"+
		"\u0182\u0188\u0192\u0198\u01a3\u01a6\u01ac\u01af\u01b7\u01ba\u01c0\u01c3"+
		"\u01cb\u01ce\u01d4\u01d8\u01e3\u01e8\u01ed\u01f5\u0204\u0206\u020b\u0215"+
		"\u0226\u0232\u023c\u0242\u0246\u0249\u0250\u0264\u0276\u027a\u027f\u0283"+
		"\u0287\u028c\u0291\u0295\u02ad\u02e8\u02ea\u02f4\u02fb\u02fd\u0304\u030c"+
		"\u0310\u0318\u031c\u031e\u0329\u0340\u0344\u034a\u034e\u0354\u0358\u035e"+
		"\u0369\u0370\u037e\u0387\u038d\u0391\u039b\u03a0\u03b0\u03b4\u03b8\u03c2"+
		"\u03c5\u03c8\u03cc\u03d0\u03db\u03e0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}