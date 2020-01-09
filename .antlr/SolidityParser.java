// Generated from /Users/gnsps/solidity-antlr4/Solidity.g4 by ANTLR 4.7.1
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
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

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
		T__87=88, T__88=89, T__89=90, T__90=91, T__91=92, T__92=93, NatSpecSingleLine=94, 
		NatSpecMultiLine=95, Int=96, Uint=97, Byte=98, Fixed=99, Ufixed=100, BooleanLiteral=101, 
		DecimalNumber=102, HexNumber=103, NumberUnit=104, HexLiteral=105, ReservedKeyword=106, 
		AnonymousKeyword=107, BreakKeyword=108, ConstantKeyword=109, ContinueKeyword=110, 
		LeaveKeyword=111, ExternalKeyword=112, IndexedKeyword=113, InternalKeyword=114, 
		PayableKeyword=115, PrivateKeyword=116, PublicKeyword=117, PureKeyword=118, 
		TypeKeyword=119, ViewKeyword=120, Identifier=121, StringLiteral=122, WS=123, 
		COMMENT=124, LINE_COMMENT=125;
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
	public static final String[] ruleNames = {
		"sourceUnit", "pragmaDirective", "pragmaName", "importDeclaration", "importDirective", 
		"natSpec", "contractDefinition", "inheritanceSpecifier", "contractPart", 
		"stateVariableDeclaration", "usingForDeclaration", "structDefinition", 
		"constructorDefinition", "modifierDefinition", "modifierInvocation", "functionDefinition", 
		"returnParameters", "modifierList", "eventDefinition", "enumValue", "enumDefinition", 
		"parameterList", "parameter", "eventParameterList", "eventParameter", 
		"functionTypeParameterList", "functionTypeParameter", "variableDeclaration", 
		"typeName", "userDefinedTypeName", "mapping", "functionTypeName", "storageLocation", 
		"stateMutability", "block", "statement", "expressionStatement", "ifStatement", 
		"tryStatement", "catchClause", "whileStatement", "simpleStatement", "forStatement", 
		"inlineAssemblyStatement", "doWhileStatement", "continueStatement", "breakStatement", 
		"returnStatement", "throwStatement", "emitStatement", "variableDeclarationStatement", 
		"variableDeclarationList", "identifierList", "elementaryTypeName", "expression", 
		"primaryExpression", "expressionList", "newExpression", "nameValueList", 
		"nameValue", "functionCallArguments", "functionCall", "assemblyBlock", 
		"assemblyItem", "assemblyExpression", "assemblyCall", "assemblyLocalDefinition", 
		"assemblyAssignment", "assemblyIdentifierOrList", "assemblyIdentifierList", 
		"assemblyStackAssignment", "labelDefinition", "assemblySwitch", "assemblyCase", 
		"assemblyFunctionDefinition", "assemblyFunctionReturns", "assemblyFor", 
		"assemblyIf", "assemblyLiteral", "subAssembly", "tupleExpression", "typeNameExpression", 
		"numberLiteral", "identifier", "overrideSpecifier"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'pragma'", "';'", "'as'", "'import'", "'*'", "'from'", "'{'", "','", 
		"'}'", "'contract'", "'interface'", "'library'", "'is'", "'('", "')'", 
		"'='", "'using'", "'for'", "'struct'", "'constructor'", "'modifier'", 
		"'function'", "'returns'", "'event'", "'enum'", "'['", "']'", "'address'", 
		"'.'", "'mapping'", "'=>'", "'memory'", "'storage'", "'calldata'", "'if'", 
		"'else'", "'try'", "'catch'", "'while'", "'assembly'", "'do'", "'return'", 
		"'throw'", "'emit'", "'var'", "'bool'", "'string'", "'byte'", "'++'", 
		"'--'", "':'", "'+'", "'-'", "'after'", "'delete'", "'!'", "'~'", "'**'", 
		"'/'", "'%'", "'<<'", "'>>'", "'&'", "'^'", "'|'", "'<'", "'>'", "'<='", 
		"'>='", "'=='", "'!='", "'&&'", "'||'", "'?'", "'|='", "'^='", "'&='", 
		"'<<='", "'>>='", "'+='", "'-='", "'*='", "'/='", "'%='", "'new'", "'let'", 
		"':='", "'=:'", "'switch'", "'case'", "'default'", "'->'", "'override'", 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "'anonymous'", "'break'", "'constant'", "'continue'", "'leave'", 
		"'external'", "'indexed'", "'internal'", "'payable'", "'private'", "'public'", 
		"'pure'", "'type'", "'view'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "NatSpecSingleLine", 
		"NatSpecMultiLine", "Int", "Uint", "Byte", "Fixed", "Ufixed", "BooleanLiteral", 
		"DecimalNumber", "HexNumber", "NumberUnit", "HexLiteral", "ReservedKeyword", 
		"AnonymousKeyword", "BreakKeyword", "ConstantKeyword", "ContinueKeyword", 
		"LeaveKeyword", "ExternalKeyword", "IndexedKeyword", "InternalKeyword", 
		"PayableKeyword", "PrivateKeyword", "PublicKeyword", "PureKeyword", "TypeKeyword", 
		"ViewKeyword", "Identifier", "StringLiteral", "WS", "COMMENT", "LINE_COMMENT"
	};
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0) || _la==NatSpecSingleLine || _la==NatSpecMultiLine) {
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
				case T__33:
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

			setState(238);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(239);
			identifier();
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(240);
				match(T__12);
				setState(241);
				inheritanceSpecifier();
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(242);
					match(T__7);
					setState(243);
					inheritanceSpecifier();
					}
					}
					setState(248);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(251);
			match(T__6);
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__27) | (1L << T__29) | (1L << T__33) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47))) != 0) || ((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & ((1L << (NatSpecSingleLine - 94)) | (1L << (NatSpecMultiLine - 94)) | (1L << (Int - 94)) | (1L << (Uint - 94)) | (1L << (Byte - 94)) | (1L << (Fixed - 94)) | (1L << (Ufixed - 94)) | (1L << (Identifier - 94)))) != 0)) {
				{
				{
				setState(252);
				contractPart();
				}
				}
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(258);
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
	}

	public final InheritanceSpecifierContext inheritanceSpecifier() throws RecognitionException {
		InheritanceSpecifierContext _localctx = new InheritanceSpecifierContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_inheritanceSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			userDefinedTypeName();
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(261);
				match(T__13);
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__13) | (1L << T__25) | (1L << T__27) | (1L << T__33) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56))) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (T__84 - 85)) | (1L << (Int - 85)) | (1L << (Uint - 85)) | (1L << (Byte - 85)) | (1L << (Fixed - 85)) | (1L << (Ufixed - 85)) | (1L << (BooleanLiteral - 85)) | (1L << (DecimalNumber - 85)) | (1L << (HexNumber - 85)) | (1L << (HexLiteral - 85)) | (1L << (TypeKeyword - 85)) | (1L << (Identifier - 85)) | (1L << (StringLiteral - 85)))) != 0)) {
					{
					setState(262);
					expressionList();
					}
				}

				setState(265);
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
	}

	public final ContractPartContext contractPart() throws RecognitionException {
		ContractPartContext _localctx = new ContractPartContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_contractPart);
		try {
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				stateVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				usingForDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(270);
				structDefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(271);
				constructorDefinition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(272);
				modifierDefinition();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(273);
				functionDefinition();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(274);
				eventDefinition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(275);
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
	}

	public final StateVariableDeclarationContext stateVariableDeclaration() throws RecognitionException {
		StateVariableDeclarationContext _localctx = new StateVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_stateVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			typeName(0);
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (T__92 - 93)) | (1L << (ConstantKeyword - 93)) | (1L << (InternalKeyword - 93)) | (1L << (PrivateKeyword - 93)) | (1L << (PublicKeyword - 93)))) != 0)) {
				{
				setState(284);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PublicKeyword:
					{
					setState(279);
					match(PublicKeyword);
					}
					break;
				case InternalKeyword:
					{
					setState(280);
					match(InternalKeyword);
					}
					break;
				case PrivateKeyword:
					{
					setState(281);
					match(PrivateKeyword);
					}
					break;
				case ConstantKeyword:
					{
					setState(282);
					match(ConstantKeyword);
					}
					break;
				case T__92:
					{
					setState(283);
					overrideSpecifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(289);
			identifier();
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(290);
				match(T__15);
				setState(291);
				expression(0);
				}
			}

			setState(294);
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
	}

	public final UsingForDeclarationContext usingForDeclaration() throws RecognitionException {
		UsingForDeclarationContext _localctx = new UsingForDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_usingForDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(T__16);
			setState(297);
			identifier();
			setState(298);
			match(T__17);
			setState(301);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				{
				setState(299);
				match(T__4);
				}
				break;
			case T__5:
			case T__21:
			case T__27:
			case T__29:
			case T__33:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case Identifier:
				{
				setState(300);
				typeName(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(303);
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
	}

	public final StructDefinitionContext structDefinition() throws RecognitionException {
		StructDefinitionContext _localctx = new StructDefinitionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_structDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(T__18);
			setState(306);
			identifier();
			setState(307);
			match(T__6);
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__21) | (1L << T__27) | (1L << T__29) | (1L << T__33) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (Int - 96)) | (1L << (Uint - 96)) | (1L << (Byte - 96)) | (1L << (Fixed - 96)) | (1L << (Ufixed - 96)) | (1L << (Identifier - 96)))) != 0)) {
				{
				setState(308);
				variableDeclaration();
				setState(309);
				match(T__1);
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__21) | (1L << T__27) | (1L << T__29) | (1L << T__33) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (Int - 96)) | (1L << (Uint - 96)) | (1L << (Byte - 96)) | (1L << (Fixed - 96)) | (1L << (Ufixed - 96)) | (1L << (Identifier - 96)))) != 0)) {
					{
					{
					setState(310);
					variableDeclaration();
					setState(311);
					match(T__1);
					}
					}
					setState(317);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(320);
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
	}

	public final ConstructorDefinitionContext constructorDefinition() throws RecognitionException {
		ConstructorDefinitionContext _localctx = new ConstructorDefinitionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_constructorDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(T__19);
			setState(323);
			parameterList();
			setState(324);
			modifierList();
			setState(325);
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
	}

	public final ModifierDefinitionContext modifierDefinition() throws RecognitionException {
		ModifierDefinitionContext _localctx = new ModifierDefinitionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_modifierDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(T__20);
			setState(328);
			identifier();
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(329);
				parameterList();
				}
			}

			setState(332);
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
	}

	public final ModifierInvocationContext modifierInvocation() throws RecognitionException {
		ModifierInvocationContext _localctx = new ModifierInvocationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_modifierInvocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			identifier();
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(335);
				match(T__13);
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__13) | (1L << T__25) | (1L << T__27) | (1L << T__33) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56))) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (T__84 - 85)) | (1L << (Int - 85)) | (1L << (Uint - 85)) | (1L << (Byte - 85)) | (1L << (Fixed - 85)) | (1L << (Ufixed - 85)) | (1L << (BooleanLiteral - 85)) | (1L << (DecimalNumber - 85)) | (1L << (HexNumber - 85)) | (1L << (HexLiteral - 85)) | (1L << (TypeKeyword - 85)) | (1L << (Identifier - 85)) | (1L << (StringLiteral - 85)))) != 0)) {
					{
					setState(336);
					expressionList();
					}
				}

				setState(339);
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
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NatSpecSingleLine || _la==NatSpecMultiLine) {
				{
				setState(342);
				natSpec();
				}
			}

			setState(345);
			match(T__21);
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5 || _la==T__33 || _la==Identifier) {
				{
				setState(346);
				identifier();
				}
			}

			setState(349);
			parameterList();
			setState(350);
			modifierList();
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(351);
				returnParameters();
				}
			}

			setState(356);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(354);
				match(T__1);
				}
				break;
			case T__6:
				{
				setState(355);
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
	}

	public final ReturnParametersContext returnParameters() throws RecognitionException {
		ReturnParametersContext _localctx = new ReturnParametersContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_returnParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(T__22);
			setState(359);
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
	}

	public final ModifierListContext modifierList() throws RecognitionException {
		ModifierListContext _localctx = new ModifierListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_modifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5 || _la==T__33 || ((((_la - 109)) & ~0x3f) == 0 && ((1L << (_la - 109)) & ((1L << (ConstantKeyword - 109)) | (1L << (ExternalKeyword - 109)) | (1L << (InternalKeyword - 109)) | (1L << (PayableKeyword - 109)) | (1L << (PrivateKeyword - 109)) | (1L << (PublicKeyword - 109)) | (1L << (PureKeyword - 109)) | (1L << (ViewKeyword - 109)) | (1L << (Identifier - 109)))) != 0)) {
				{
				setState(367);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__5:
				case T__33:
				case Identifier:
					{
					setState(361);
					modifierInvocation();
					}
					break;
				case ConstantKeyword:
				case PayableKeyword:
				case PureKeyword:
				case ViewKeyword:
					{
					setState(362);
					stateMutability();
					}
					break;
				case ExternalKeyword:
					{
					setState(363);
					match(ExternalKeyword);
					}
					break;
				case PublicKeyword:
					{
					setState(364);
					match(PublicKeyword);
					}
					break;
				case InternalKeyword:
					{
					setState(365);
					match(InternalKeyword);
					}
					break;
				case PrivateKeyword:
					{
					setState(366);
					match(PrivateKeyword);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(371);
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
	}

	public final EventDefinitionContext eventDefinition() throws RecognitionException {
		EventDefinitionContext _localctx = new EventDefinitionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_eventDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NatSpecSingleLine || _la==NatSpecMultiLine) {
				{
				setState(372);
				natSpec();
				}
			}

			setState(375);
			match(T__23);
			setState(376);
			identifier();
			setState(377);
			eventParameterList();
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AnonymousKeyword) {
				{
				setState(378);
				match(AnonymousKeyword);
				}
			}

			setState(381);
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
	}

	public final EnumValueContext enumValue() throws RecognitionException {
		EnumValueContext _localctx = new EnumValueContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_enumValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
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
	}

	public final EnumDefinitionContext enumDefinition() throws RecognitionException {
		EnumDefinitionContext _localctx = new EnumDefinitionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_enumDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			match(T__24);
			setState(386);
			identifier();
			setState(387);
			match(T__6);
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5 || _la==T__33 || _la==Identifier) {
				{
				setState(388);
				enumValue();
				}
			}

			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(391);
				match(T__7);
				setState(392);
				enumValue();
				}
				}
				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(398);
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
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			match(T__13);
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__21) | (1L << T__27) | (1L << T__29) | (1L << T__33) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (Int - 96)) | (1L << (Uint - 96)) | (1L << (Byte - 96)) | (1L << (Fixed - 96)) | (1L << (Ufixed - 96)) | (1L << (Identifier - 96)))) != 0)) {
				{
				setState(401);
				parameter();
				setState(406);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(402);
					match(T__7);
					setState(403);
					parameter();
					}
					}
					setState(408);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(411);
			match(T__14);
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
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			typeName(0);
			setState(415);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(414);
				storageLocation();
				}
				break;
			}
			setState(418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5 || _la==T__33 || _la==Identifier) {
				{
				setState(417);
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
	}

	public final EventParameterListContext eventParameterList() throws RecognitionException {
		EventParameterListContext _localctx = new EventParameterListContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_eventParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			match(T__13);
			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__21) | (1L << T__27) | (1L << T__29) | (1L << T__33) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (Int - 96)) | (1L << (Uint - 96)) | (1L << (Byte - 96)) | (1L << (Fixed - 96)) | (1L << (Ufixed - 96)) | (1L << (Identifier - 96)))) != 0)) {
				{
				setState(421);
				eventParameter();
				setState(426);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(422);
					match(T__7);
					setState(423);
					eventParameter();
					}
					}
					setState(428);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(431);
			match(T__14);
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
	}

	public final EventParameterContext eventParameter() throws RecognitionException {
		EventParameterContext _localctx = new EventParameterContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_eventParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			typeName(0);
			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IndexedKeyword) {
				{
				setState(434);
				match(IndexedKeyword);
				}
			}

			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5 || _la==T__33 || _la==Identifier) {
				{
				setState(437);
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
	}

	public final FunctionTypeParameterListContext functionTypeParameterList() throws RecognitionException {
		FunctionTypeParameterListContext _localctx = new FunctionTypeParameterListContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_functionTypeParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			match(T__13);
			setState(449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__21) | (1L << T__27) | (1L << T__29) | (1L << T__33) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (Int - 96)) | (1L << (Uint - 96)) | (1L << (Byte - 96)) | (1L << (Fixed - 96)) | (1L << (Ufixed - 96)) | (1L << (Identifier - 96)))) != 0)) {
				{
				setState(441);
				functionTypeParameter();
				setState(446);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(442);
					match(T__7);
					setState(443);
					functionTypeParameter();
					}
					}
					setState(448);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(451);
			match(T__14);
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
	}

	public final FunctionTypeParameterContext functionTypeParameter() throws RecognitionException {
		FunctionTypeParameterContext _localctx = new FunctionTypeParameterContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_functionTypeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			typeName(0);
			setState(455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__31) | (1L << T__32) | (1L << T__33))) != 0)) {
				{
				setState(454);
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
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			typeName(0);
			setState(459);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(458);
				storageLocation();
				}
				break;
			}
			setState(461);
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
			setState(470);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(464);
				elementaryTypeName();
				}
				break;
			case 2:
				{
				setState(465);
				userDefinedTypeName();
				}
				break;
			case 3:
				{
				setState(466);
				mapping();
				}
				break;
			case 4:
				{
				setState(467);
				functionTypeName();
				}
				break;
			case 5:
				{
				setState(468);
				match(T__27);
				setState(469);
				match(PayableKeyword);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(480);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeName);
					setState(472);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(473);
					match(T__25);
					setState(475);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__13) | (1L << T__25) | (1L << T__27) | (1L << T__33) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56))) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (T__84 - 85)) | (1L << (Int - 85)) | (1L << (Uint - 85)) | (1L << (Byte - 85)) | (1L << (Fixed - 85)) | (1L << (Ufixed - 85)) | (1L << (BooleanLiteral - 85)) | (1L << (DecimalNumber - 85)) | (1L << (HexNumber - 85)) | (1L << (HexLiteral - 85)) | (1L << (TypeKeyword - 85)) | (1L << (Identifier - 85)) | (1L << (StringLiteral - 85)))) != 0)) {
						{
						setState(474);
						expression(0);
						}
					}

					setState(477);
					match(T__26);
					}
					} 
				}
				setState(482);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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
	}

	public final UserDefinedTypeNameContext userDefinedTypeName() throws RecognitionException {
		UserDefinedTypeNameContext _localctx = new UserDefinedTypeNameContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_userDefinedTypeName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			identifier();
			setState(488);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(484);
					match(T__28);
					setState(485);
					identifier();
					}
					} 
				}
				setState(490);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
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
	}

	public final MappingContext mapping() throws RecognitionException {
		MappingContext _localctx = new MappingContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_mapping);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			match(T__29);
			setState(492);
			match(T__13);
			setState(493);
			elementaryTypeName();
			setState(494);
			match(T__30);
			setState(495);
			typeName(0);
			setState(496);
			match(T__14);
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
	}

	public final FunctionTypeNameContext functionTypeName() throws RecognitionException {
		FunctionTypeNameContext _localctx = new FunctionTypeNameContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_functionTypeName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			match(T__21);
			setState(499);
			functionTypeParameterList();
			setState(505);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(503);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case InternalKeyword:
						{
						setState(500);
						match(InternalKeyword);
						}
						break;
					case ExternalKeyword:
						{
						setState(501);
						match(ExternalKeyword);
						}
						break;
					case ConstantKeyword:
					case PayableKeyword:
					case PureKeyword:
					case ViewKeyword:
						{
						setState(502);
						stateMutability();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(507);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			}
			setState(510);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(508);
				match(T__22);
				setState(509);
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
	}

	public final StorageLocationContext storageLocation() throws RecognitionException {
		StorageLocationContext _localctx = new StorageLocationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_storageLocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__31) | (1L << T__32) | (1L << T__33))) != 0)) ) {
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
	}

	public final StateMutabilityContext stateMutability() throws RecognitionException {
		StateMutabilityContext _localctx = new StateMutabilityContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_stateMutability);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			_la = _input.LA(1);
			if ( !(((((_la - 109)) & ~0x3f) == 0 && ((1L << (_la - 109)) & ((1L << (ConstantKeyword - 109)) | (1L << (PayableKeyword - 109)) | (1L << (PureKeyword - 109)) | (1L << (ViewKeyword - 109)))) != 0)) ) {
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
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			match(T__6);
			setState(520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__13) | (1L << T__17) | (1L << T__21) | (1L << T__25) | (1L << T__27) | (1L << T__29) | (1L << T__33) | (1L << T__34) | (1L << T__36) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56))) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (T__84 - 85)) | (1L << (Int - 85)) | (1L << (Uint - 85)) | (1L << (Byte - 85)) | (1L << (Fixed - 85)) | (1L << (Ufixed - 85)) | (1L << (BooleanLiteral - 85)) | (1L << (DecimalNumber - 85)) | (1L << (HexNumber - 85)) | (1L << (HexLiteral - 85)) | (1L << (BreakKeyword - 85)) | (1L << (ContinueKeyword - 85)) | (1L << (TypeKeyword - 85)) | (1L << (Identifier - 85)) | (1L << (StringLiteral - 85)))) != 0)) {
				{
				{
				setState(517);
				statement();
				}
				}
				setState(522);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(523);
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
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_statement);
		try {
			setState(538);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				setState(525);
				ifStatement();
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 2);
				{
				setState(526);
				tryStatement();
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 3);
				{
				setState(527);
				whileStatement();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 4);
				{
				setState(528);
				forStatement();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 5);
				{
				setState(529);
				block();
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 6);
				{
				setState(530);
				inlineAssemblyStatement();
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 7);
				{
				setState(531);
				doWhileStatement();
				}
				break;
			case ContinueKeyword:
				enterOuterAlt(_localctx, 8);
				{
				setState(532);
				continueStatement();
				}
				break;
			case BreakKeyword:
				enterOuterAlt(_localctx, 9);
				{
				setState(533);
				breakStatement();
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 10);
				{
				setState(534);
				returnStatement();
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 11);
				{
				setState(535);
				throwStatement();
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 12);
				{
				setState(536);
				emitStatement();
				}
				break;
			case T__5:
			case T__13:
			case T__21:
			case T__25:
			case T__27:
			case T__29:
			case T__33:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__84:
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
				setState(537);
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
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			expression(0);
			setState(541);
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
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			match(T__34);
			setState(544);
			match(T__13);
			setState(545);
			expression(0);
			setState(546);
			match(T__14);
			setState(547);
			statement();
			setState(550);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(548);
				match(T__35);
				setState(549);
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
	}

	public final TryStatementContext tryStatement() throws RecognitionException {
		TryStatementContext _localctx = new TryStatementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_tryStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			match(T__36);
			setState(553);
			expression(0);
			setState(556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(554);
				match(T__22);
				setState(555);
				parameterList();
				}
			}

			setState(558);
			block();
			setState(560); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(559);
				catchClause();
				}
				}
				setState(562); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__37 );
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
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_catchClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			match(T__37);
			setState(566);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5 || _la==T__33 || _la==Identifier) {
				{
				setState(565);
				identifier();
				}
			}

			setState(568);
			parameterList();
			setState(569);
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
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			match(T__38);
			setState(572);
			match(T__13);
			setState(573);
			expression(0);
			setState(574);
			match(T__14);
			setState(575);
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
	}

	public final SimpleStatementContext simpleStatement() throws RecognitionException {
		SimpleStatementContext _localctx = new SimpleStatementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_simpleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(577);
				variableDeclarationStatement();
				}
				break;
			case 2:
				{
				setState(578);
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
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			match(T__17);
			setState(582);
			match(T__13);
			setState(585);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__13:
			case T__21:
			case T__25:
			case T__27:
			case T__29:
			case T__33:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__84:
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
				setState(583);
				simpleStatement();
				}
				break;
			case T__1:
				{
				setState(584);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(589);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__13:
			case T__25:
			case T__27:
			case T__33:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__84:
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
				setState(587);
				expressionStatement();
				}
				break;
			case T__1:
				{
				setState(588);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(592);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__13) | (1L << T__25) | (1L << T__27) | (1L << T__33) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56))) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (T__84 - 85)) | (1L << (Int - 85)) | (1L << (Uint - 85)) | (1L << (Byte - 85)) | (1L << (Fixed - 85)) | (1L << (Ufixed - 85)) | (1L << (BooleanLiteral - 85)) | (1L << (DecimalNumber - 85)) | (1L << (HexNumber - 85)) | (1L << (HexLiteral - 85)) | (1L << (TypeKeyword - 85)) | (1L << (Identifier - 85)) | (1L << (StringLiteral - 85)))) != 0)) {
				{
				setState(591);
				expression(0);
				}
			}

			setState(594);
			match(T__14);
			setState(595);
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
	}

	public final InlineAssemblyStatementContext inlineAssemblyStatement() throws RecognitionException {
		InlineAssemblyStatementContext _localctx = new InlineAssemblyStatementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_inlineAssemblyStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			match(T__39);
			setState(599);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==StringLiteral) {
				{
				setState(598);
				match(StringLiteral);
				}
			}

			setState(601);
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
	}

	public final DoWhileStatementContext doWhileStatement() throws RecognitionException {
		DoWhileStatementContext _localctx = new DoWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
			match(T__40);
			setState(604);
			statement();
			setState(605);
			match(T__38);
			setState(606);
			match(T__13);
			setState(607);
			expression(0);
			setState(608);
			match(T__14);
			setState(609);
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
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			match(ContinueKeyword);
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

	public static class BreakStatementContext extends ParserRuleContext {
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
			match(BreakKeyword);
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			match(T__41);
			setState(619);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__13) | (1L << T__25) | (1L << T__27) | (1L << T__33) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56))) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (T__84 - 85)) | (1L << (Int - 85)) | (1L << (Uint - 85)) | (1L << (Byte - 85)) | (1L << (Fixed - 85)) | (1L << (Ufixed - 85)) | (1L << (BooleanLiteral - 85)) | (1L << (DecimalNumber - 85)) | (1L << (HexNumber - 85)) | (1L << (HexLiteral - 85)) | (1L << (TypeKeyword - 85)) | (1L << (Identifier - 85)) | (1L << (StringLiteral - 85)))) != 0)) {
				{
				setState(618);
				expression(0);
				}
			}

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

	public static class ThrowStatementContext extends ParserRuleContext {
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			match(T__42);
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

	public static class EmitStatementContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public EmitStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emitStatement; }
	}

	public final EmitStatementContext emitStatement() throws RecognitionException {
		EmitStatementContext _localctx = new EmitStatementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_emitStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			match(T__43);
			setState(627);
			functionCall();
			setState(628);
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
	}

	public final VariableDeclarationStatementContext variableDeclarationStatement() throws RecognitionException {
		VariableDeclarationStatementContext _localctx = new VariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_variableDeclarationStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(630);
				match(T__44);
				setState(631);
				identifierList();
				}
				break;
			case 2:
				{
				setState(632);
				variableDeclaration();
				}
				break;
			case 3:
				{
				setState(633);
				match(T__13);
				setState(634);
				variableDeclarationList();
				setState(635);
				match(T__14);
				}
				break;
			}
			setState(641);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(639);
				match(T__15);
				setState(640);
				expression(0);
				}
			}

			setState(643);
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
	}

	public final VariableDeclarationListContext variableDeclarationList() throws RecognitionException {
		VariableDeclarationListContext _localctx = new VariableDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_variableDeclarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(646);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__21) | (1L << T__27) | (1L << T__29) | (1L << T__33) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (Int - 96)) | (1L << (Uint - 96)) | (1L << (Byte - 96)) | (1L << (Fixed - 96)) | (1L << (Ufixed - 96)) | (1L << (Identifier - 96)))) != 0)) {
				{
				setState(645);
				variableDeclaration();
				}
			}

			setState(654);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(648);
				match(T__7);
				setState(650);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__21) | (1L << T__27) | (1L << T__29) | (1L << T__33) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (Int - 96)) | (1L << (Uint - 96)) | (1L << (Byte - 96)) | (1L << (Fixed - 96)) | (1L << (Ufixed - 96)) | (1L << (Identifier - 96)))) != 0)) {
					{
					setState(649);
					variableDeclaration();
					}
				}

				}
				}
				setState(656);
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
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_identifierList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(657);
			match(T__13);
			setState(664);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(659);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__5 || _la==T__33 || _la==Identifier) {
						{
						setState(658);
						identifier();
						}
					}

					setState(661);
					match(T__7);
					}
					} 
				}
				setState(666);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			}
			setState(668);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5 || _la==T__33 || _la==Identifier) {
				{
				setState(667);
				identifier();
				}
			}

			setState(670);
			match(T__14);
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
	}

	public final ElementaryTypeNameContext elementaryTypeName() throws RecognitionException {
		ElementaryTypeNameContext _localctx = new ElementaryTypeNameContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_elementaryTypeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(672);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__27) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47))) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (Int - 96)) | (1L << (Uint - 96)) | (1L << (Byte - 96)) | (1L << (Fixed - 96)) | (1L << (Ufixed - 96)))) != 0)) ) {
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
			setState(691);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(675);
				newExpression();
				}
				break;
			case 2:
				{
				setState(676);
				match(T__13);
				setState(677);
				expression(0);
				setState(678);
				match(T__14);
				}
				break;
			case 3:
				{
				setState(680);
				_la = _input.LA(1);
				if ( !(_la==T__48 || _la==T__49) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(681);
				expression(19);
				}
				break;
			case 4:
				{
				setState(682);
				_la = _input.LA(1);
				if ( !(_la==T__51 || _la==T__52) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(683);
				expression(18);
				}
				break;
			case 5:
				{
				setState(684);
				_la = _input.LA(1);
				if ( !(_la==T__53 || _la==T__54) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(685);
				expression(17);
				}
				break;
			case 6:
				{
				setState(686);
				match(T__55);
				setState(687);
				expression(16);
				}
				break;
			case 7:
				{
				setState(688);
				match(T__56);
				setState(689);
				expression(15);
				}
				break;
			case 8:
				{
				setState(690);
				primaryExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(763);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(761);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(693);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(694);
						match(T__57);
						setState(695);
						expression(15);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(696);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(697);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__58) | (1L << T__59))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(698);
						expression(14);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(699);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(700);
						_la = _input.LA(1);
						if ( !(_la==T__51 || _la==T__52) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(701);
						expression(13);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(702);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(703);
						_la = _input.LA(1);
						if ( !(_la==T__60 || _la==T__61) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(704);
						expression(12);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(705);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(706);
						match(T__62);
						setState(707);
						expression(11);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(708);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(709);
						match(T__63);
						setState(710);
						expression(10);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(711);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(712);
						match(T__64);
						setState(713);
						expression(9);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(714);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(715);
						_la = _input.LA(1);
						if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__65 - 66)) | (1L << (T__66 - 66)) | (1L << (T__67 - 66)) | (1L << (T__68 - 66)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(716);
						expression(8);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(717);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(718);
						_la = _input.LA(1);
						if ( !(_la==T__69 || _la==T__70) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(719);
						expression(7);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(720);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(721);
						match(T__71);
						setState(722);
						expression(6);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(723);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(724);
						match(T__72);
						setState(725);
						expression(5);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(726);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(727);
						match(T__73);
						setState(728);
						expression(0);
						setState(729);
						match(T__50);
						setState(730);
						expression(4);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(732);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(733);
						_la = _input.LA(1);
						if ( !(_la==T__15 || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (T__74 - 75)) | (1L << (T__75 - 75)) | (1L << (T__76 - 75)) | (1L << (T__77 - 75)) | (1L << (T__78 - 75)) | (1L << (T__79 - 75)) | (1L << (T__80 - 75)) | (1L << (T__81 - 75)) | (1L << (T__82 - 75)) | (1L << (T__83 - 75)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(734);
						expression(3);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(735);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(736);
						_la = _input.LA(1);
						if ( !(_la==T__48 || _la==T__49) ) {
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
						setState(737);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(738);
						match(T__25);
						setState(740);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__13) | (1L << T__25) | (1L << T__27) | (1L << T__33) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56))) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (T__84 - 85)) | (1L << (Int - 85)) | (1L << (Uint - 85)) | (1L << (Byte - 85)) | (1L << (Fixed - 85)) | (1L << (Ufixed - 85)) | (1L << (BooleanLiteral - 85)) | (1L << (DecimalNumber - 85)) | (1L << (HexNumber - 85)) | (1L << (HexLiteral - 85)) | (1L << (TypeKeyword - 85)) | (1L << (Identifier - 85)) | (1L << (StringLiteral - 85)))) != 0)) {
							{
							setState(739);
							expression(0);
							}
						}

						setState(742);
						match(T__26);
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(743);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(744);
						match(T__25);
						setState(746);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__13) | (1L << T__25) | (1L << T__27) | (1L << T__33) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56))) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (T__84 - 85)) | (1L << (Int - 85)) | (1L << (Uint - 85)) | (1L << (Byte - 85)) | (1L << (Fixed - 85)) | (1L << (Ufixed - 85)) | (1L << (BooleanLiteral - 85)) | (1L << (DecimalNumber - 85)) | (1L << (HexNumber - 85)) | (1L << (HexLiteral - 85)) | (1L << (TypeKeyword - 85)) | (1L << (Identifier - 85)) | (1L << (StringLiteral - 85)))) != 0)) {
							{
							setState(745);
							expression(0);
							}
						}

						setState(748);
						match(T__50);
						setState(750);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__13) | (1L << T__25) | (1L << T__27) | (1L << T__33) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56))) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (T__84 - 85)) | (1L << (Int - 85)) | (1L << (Uint - 85)) | (1L << (Byte - 85)) | (1L << (Fixed - 85)) | (1L << (Ufixed - 85)) | (1L << (BooleanLiteral - 85)) | (1L << (DecimalNumber - 85)) | (1L << (HexNumber - 85)) | (1L << (HexLiteral - 85)) | (1L << (TypeKeyword - 85)) | (1L << (Identifier - 85)) | (1L << (StringLiteral - 85)))) != 0)) {
							{
							setState(749);
							expression(0);
							}
						}

						setState(752);
						match(T__26);
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(753);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(754);
						match(T__28);
						setState(755);
						identifier();
						}
						break;
					case 18:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(756);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(757);
						match(T__13);
						setState(758);
						functionCallArguments();
						setState(759);
						match(T__14);
						}
						break;
					}
					} 
				}
				setState(765);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
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
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_primaryExpression);
		try {
			setState(782);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(766);
				match(BooleanLiteral);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(767);
				numberLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(768);
				match(HexLiteral);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(769);
				match(StringLiteral);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(770);
				identifier();
				setState(773);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
				case 1:
					{
					setState(771);
					match(T__25);
					setState(772);
					match(T__26);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(775);
				match(TypeKeyword);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(776);
				tupleExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(777);
				typeNameExpression();
				setState(780);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
				case 1:
					{
					setState(778);
					match(T__25);
					setState(779);
					match(T__26);
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
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(784);
			expression(0);
			setState(789);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(785);
				match(T__7);
				setState(786);
				expression(0);
				}
				}
				setState(791);
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
	}

	public final NewExpressionContext newExpression() throws RecognitionException {
		NewExpressionContext _localctx = new NewExpressionContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_newExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(792);
			match(T__84);
			setState(793);
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
	}

	public final NameValueListContext nameValueList() throws RecognitionException {
		NameValueListContext _localctx = new NameValueListContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_nameValueList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
			nameValue();
			setState(800);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(796);
					match(T__7);
					setState(797);
					nameValue();
					}
					} 
				}
				setState(802);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			}
			setState(804);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(803);
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
	}

	public final NameValueContext nameValue() throws RecognitionException {
		NameValueContext _localctx = new NameValueContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_nameValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(806);
			identifier();
			setState(807);
			match(T__50);
			setState(808);
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
	}

	public final FunctionCallArgumentsContext functionCallArguments() throws RecognitionException {
		FunctionCallArgumentsContext _localctx = new FunctionCallArgumentsContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_functionCallArguments);
		int _la;
		try {
			setState(818);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(810);
				match(T__6);
				setState(812);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5 || _la==T__33 || _la==Identifier) {
					{
					setState(811);
					nameValueList();
					}
				}

				setState(814);
				match(T__8);
				}
				break;
			case T__5:
			case T__13:
			case T__14:
			case T__25:
			case T__27:
			case T__33:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__84:
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
				setState(816);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__13) | (1L << T__25) | (1L << T__27) | (1L << T__33) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56))) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (T__84 - 85)) | (1L << (Int - 85)) | (1L << (Uint - 85)) | (1L << (Byte - 85)) | (1L << (Fixed - 85)) | (1L << (Ufixed - 85)) | (1L << (BooleanLiteral - 85)) | (1L << (DecimalNumber - 85)) | (1L << (HexNumber - 85)) | (1L << (HexLiteral - 85)) | (1L << (TypeKeyword - 85)) | (1L << (Identifier - 85)) | (1L << (StringLiteral - 85)))) != 0)) {
					{
					setState(815);
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
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(820);
			expression(0);
			setState(821);
			match(T__13);
			setState(822);
			functionCallArguments();
			setState(823);
			match(T__14);
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
	}

	public final AssemblyBlockContext assemblyBlock() throws RecognitionException {
		AssemblyBlockContext _localctx = new AssemblyBlockContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_assemblyBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(825);
			match(T__6);
			setState(829);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__13) | (1L << T__17) | (1L << T__21) | (1L << T__27) | (1L << T__33) | (1L << T__34) | (1L << T__39) | (1L << T__41) | (1L << T__47))) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (T__85 - 86)) | (1L << (T__87 - 86)) | (1L << (T__88 - 86)) | (1L << (DecimalNumber - 86)) | (1L << (HexNumber - 86)) | (1L << (HexLiteral - 86)) | (1L << (BreakKeyword - 86)) | (1L << (ContinueKeyword - 86)) | (1L << (LeaveKeyword - 86)) | (1L << (Identifier - 86)) | (1L << (StringLiteral - 86)))) != 0)) {
				{
				{
				setState(826);
				assemblyItem();
				}
				}
				setState(831);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(832);
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
	}

	public final AssemblyItemContext assemblyItem() throws RecognitionException {
		AssemblyItemContext _localctx = new AssemblyItemContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_assemblyItem);
		try {
			setState(852);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(834);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(835);
				assemblyBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(836);
				assemblyExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(837);
				assemblyLocalDefinition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(838);
				assemblyAssignment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(839);
				assemblyStackAssignment();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(840);
				labelDefinition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(841);
				assemblySwitch();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(842);
				assemblyFunctionDefinition();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(843);
				assemblyFor();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(844);
				assemblyIf();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(845);
				match(BreakKeyword);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(846);
				match(ContinueKeyword);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(847);
				match(LeaveKeyword);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(848);
				subAssembly();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(849);
				numberLiteral();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(850);
				match(StringLiteral);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(851);
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
	}

	public final AssemblyExpressionContext assemblyExpression() throws RecognitionException {
		AssemblyExpressionContext _localctx = new AssemblyExpressionContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_assemblyExpression);
		try {
			setState(856);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__27:
			case T__33:
			case T__41:
			case T__47:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(854);
				assemblyCall();
				}
				break;
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(855);
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
	}

	public final AssemblyCallContext assemblyCall() throws RecognitionException {
		AssemblyCallContext _localctx = new AssemblyCallContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_assemblyCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(862);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__41:
				{
				setState(858);
				match(T__41);
				}
				break;
			case T__27:
				{
				setState(859);
				match(T__27);
				}
				break;
			case T__47:
				{
				setState(860);
				match(T__47);
				}
				break;
			case T__5:
			case T__33:
			case Identifier:
				{
				setState(861);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(876);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				{
				setState(864);
				match(T__13);
				setState(866);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__27) | (1L << T__33) | (1L << T__41) | (1L << T__47))) != 0) || ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (DecimalNumber - 102)) | (1L << (HexNumber - 102)) | (1L << (HexLiteral - 102)) | (1L << (Identifier - 102)) | (1L << (StringLiteral - 102)))) != 0)) {
					{
					setState(865);
					assemblyExpression();
					}
				}

				setState(872);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(868);
					match(T__7);
					setState(869);
					assemblyExpression();
					}
					}
					setState(874);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(875);
				match(T__14);
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
	}

	public final AssemblyLocalDefinitionContext assemblyLocalDefinition() throws RecognitionException {
		AssemblyLocalDefinitionContext _localctx = new AssemblyLocalDefinitionContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_assemblyLocalDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(878);
			match(T__85);
			setState(879);
			assemblyIdentifierOrList();
			setState(882);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__86) {
				{
				setState(880);
				match(T__86);
				setState(881);
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
	}

	public final AssemblyAssignmentContext assemblyAssignment() throws RecognitionException {
		AssemblyAssignmentContext _localctx = new AssemblyAssignmentContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_assemblyAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(884);
			assemblyIdentifierOrList();
			setState(885);
			match(T__86);
			setState(886);
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
	}

	public final AssemblyIdentifierOrListContext assemblyIdentifierOrList() throws RecognitionException {
		AssemblyIdentifierOrListContext _localctx = new AssemblyIdentifierOrListContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_assemblyIdentifierOrList);
		try {
			setState(893);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__33:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(888);
				identifier();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(889);
				match(T__13);
				setState(890);
				assemblyIdentifierList();
				setState(891);
				match(T__14);
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
	}

	public final AssemblyIdentifierListContext assemblyIdentifierList() throws RecognitionException {
		AssemblyIdentifierListContext _localctx = new AssemblyIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_assemblyIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(895);
			identifier();
			setState(900);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(896);
				match(T__7);
				setState(897);
				identifier();
				}
				}
				setState(902);
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
	}

	public final AssemblyStackAssignmentContext assemblyStackAssignment() throws RecognitionException {
		AssemblyStackAssignmentContext _localctx = new AssemblyStackAssignmentContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_assemblyStackAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(903);
			match(T__87);
			setState(904);
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
	}

	public final LabelDefinitionContext labelDefinition() throws RecognitionException {
		LabelDefinitionContext _localctx = new LabelDefinitionContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_labelDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(906);
			identifier();
			setState(907);
			match(T__50);
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
	}

	public final AssemblySwitchContext assemblySwitch() throws RecognitionException {
		AssemblySwitchContext _localctx = new AssemblySwitchContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_assemblySwitch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(909);
			match(T__88);
			setState(910);
			assemblyExpression();
			setState(914);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__89 || _la==T__90) {
				{
				{
				setState(911);
				assemblyCase();
				}
				}
				setState(916);
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
	}

	public final AssemblyCaseContext assemblyCase() throws RecognitionException {
		AssemblyCaseContext _localctx = new AssemblyCaseContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_assemblyCase);
		try {
			setState(923);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__89:
				enterOuterAlt(_localctx, 1);
				{
				setState(917);
				match(T__89);
				setState(918);
				assemblyLiteral();
				setState(919);
				assemblyBlock();
				}
				break;
			case T__90:
				enterOuterAlt(_localctx, 2);
				{
				setState(921);
				match(T__90);
				setState(922);
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
	}

	public final AssemblyFunctionDefinitionContext assemblyFunctionDefinition() throws RecognitionException {
		AssemblyFunctionDefinitionContext _localctx = new AssemblyFunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_assemblyFunctionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(925);
			match(T__21);
			setState(926);
			identifier();
			setState(927);
			match(T__13);
			setState(929);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5 || _la==T__33 || _la==Identifier) {
				{
				setState(928);
				assemblyIdentifierList();
				}
			}

			setState(931);
			match(T__14);
			setState(933);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__91) {
				{
				setState(932);
				assemblyFunctionReturns();
				}
			}

			setState(935);
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
	}

	public final AssemblyFunctionReturnsContext assemblyFunctionReturns() throws RecognitionException {
		AssemblyFunctionReturnsContext _localctx = new AssemblyFunctionReturnsContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_assemblyFunctionReturns);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(937);
			match(T__91);
			setState(938);
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
	}

	public final AssemblyForContext assemblyFor() throws RecognitionException {
		AssemblyForContext _localctx = new AssemblyForContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_assemblyFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(940);
			match(T__17);
			setState(943);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				{
				setState(941);
				assemblyBlock();
				}
				break;
			case T__5:
			case T__27:
			case T__33:
			case T__41:
			case T__47:
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case Identifier:
			case StringLiteral:
				{
				setState(942);
				assemblyExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(945);
			assemblyExpression();
			setState(948);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				{
				setState(946);
				assemblyBlock();
				}
				break;
			case T__5:
			case T__27:
			case T__33:
			case T__41:
			case T__47:
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case Identifier:
			case StringLiteral:
				{
				setState(947);
				assemblyExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(950);
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
	}

	public final AssemblyIfContext assemblyIf() throws RecognitionException {
		AssemblyIfContext _localctx = new AssemblyIfContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_assemblyIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(952);
			match(T__34);
			setState(953);
			assemblyExpression();
			setState(954);
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
	}

	public final AssemblyLiteralContext assemblyLiteral() throws RecognitionException {
		AssemblyLiteralContext _localctx = new AssemblyLiteralContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_assemblyLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(956);
			_la = _input.LA(1);
			if ( !(((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (DecimalNumber - 102)) | (1L << (HexNumber - 102)) | (1L << (HexLiteral - 102)) | (1L << (StringLiteral - 102)))) != 0)) ) {
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
	}

	public final SubAssemblyContext subAssembly() throws RecognitionException {
		SubAssemblyContext _localctx = new SubAssemblyContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_subAssembly);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(958);
			match(T__39);
			setState(959);
			identifier();
			setState(960);
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
	}

	public final TupleExpressionContext tupleExpression() throws RecognitionException {
		TupleExpressionContext _localctx = new TupleExpressionContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_tupleExpression);
		int _la;
		try {
			setState(988);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(962);
				match(T__13);
				{
				setState(964);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__13) | (1L << T__25) | (1L << T__27) | (1L << T__33) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56))) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (T__84 - 85)) | (1L << (Int - 85)) | (1L << (Uint - 85)) | (1L << (Byte - 85)) | (1L << (Fixed - 85)) | (1L << (Ufixed - 85)) | (1L << (BooleanLiteral - 85)) | (1L << (DecimalNumber - 85)) | (1L << (HexNumber - 85)) | (1L << (HexLiteral - 85)) | (1L << (TypeKeyword - 85)) | (1L << (Identifier - 85)) | (1L << (StringLiteral - 85)))) != 0)) {
					{
					setState(963);
					expression(0);
					}
				}

				setState(972);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(966);
					match(T__7);
					setState(968);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__13) | (1L << T__25) | (1L << T__27) | (1L << T__33) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56))) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (T__84 - 85)) | (1L << (Int - 85)) | (1L << (Uint - 85)) | (1L << (Byte - 85)) | (1L << (Fixed - 85)) | (1L << (Ufixed - 85)) | (1L << (BooleanLiteral - 85)) | (1L << (DecimalNumber - 85)) | (1L << (HexNumber - 85)) | (1L << (HexLiteral - 85)) | (1L << (TypeKeyword - 85)) | (1L << (Identifier - 85)) | (1L << (StringLiteral - 85)))) != 0)) {
						{
						setState(967);
						expression(0);
						}
					}

					}
					}
					setState(974);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(975);
				match(T__14);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(976);
				match(T__25);
				setState(985);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__13) | (1L << T__25) | (1L << T__27) | (1L << T__33) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56))) != 0) || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (T__84 - 85)) | (1L << (Int - 85)) | (1L << (Uint - 85)) | (1L << (Byte - 85)) | (1L << (Fixed - 85)) | (1L << (Ufixed - 85)) | (1L << (BooleanLiteral - 85)) | (1L << (DecimalNumber - 85)) | (1L << (HexNumber - 85)) | (1L << (HexLiteral - 85)) | (1L << (TypeKeyword - 85)) | (1L << (Identifier - 85)) | (1L << (StringLiteral - 85)))) != 0)) {
					{
					setState(977);
					expression(0);
					setState(982);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__7) {
						{
						{
						setState(978);
						match(T__7);
						setState(979);
						expression(0);
						}
						}
						setState(984);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(987);
				match(T__26);
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
	}

	public final TypeNameExpressionContext typeNameExpression() throws RecognitionException {
		TypeNameExpressionContext _localctx = new TypeNameExpressionContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_typeNameExpression);
		try {
			setState(992);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
				enterOuterAlt(_localctx, 1);
				{
				setState(990);
				elementaryTypeName();
				}
				break;
			case T__5:
			case T__33:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(991);
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
	}

	public final NumberLiteralContext numberLiteral() throws RecognitionException {
		NumberLiteralContext _localctx = new NumberLiteralContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_numberLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(994);
			_la = _input.LA(1);
			if ( !(_la==DecimalNumber || _la==HexNumber) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(996);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				{
				setState(995);
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
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(998);
			_la = _input.LA(1);
			if ( !(_la==T__5 || _la==T__33 || _la==Identifier) ) {
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
	}

	public final OverrideSpecifierContext overrideSpecifier() throws RecognitionException {
		OverrideSpecifierContext _localctx = new OverrideSpecifierContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_overrideSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1000);
			match(T__92);
			setState(1012);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(1001);
				match(T__13);
				setState(1002);
				userDefinedTypeName();
				setState(1007);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(1003);
					match(T__7);
					setState(1004);
					userDefinedTypeName();
					}
					}
					setState(1009);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1010);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\177\u03f9\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
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
		"\b\u00ef\n\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00f7\n\b\f\b\16\b\u00fa\13\b"+
		"\5\b\u00fc\n\b\3\b\3\b\7\b\u0100\n\b\f\b\16\b\u0103\13\b\3\b\3\b\3\t\3"+
		"\t\3\t\5\t\u010a\n\t\3\t\5\t\u010d\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\5\n\u0117\n\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u011f\n\13\f\13\16\13"+
		"\u0122\13\13\3\13\3\13\3\13\5\13\u0127\n\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\5\f\u0130\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u013c\n"+
		"\r\f\r\16\r\u013f\13\r\5\r\u0141\n\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\5\17\u014d\n\17\3\17\3\17\3\20\3\20\3\20\5\20\u0154\n"+
		"\20\3\20\5\20\u0157\n\20\3\21\5\21\u015a\n\21\3\21\3\21\5\21\u015e\n\21"+
		"\3\21\3\21\3\21\5\21\u0163\n\21\3\21\3\21\5\21\u0167\n\21\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0172\n\23\f\23\16\23\u0175\13"+
		"\23\3\24\5\24\u0178\n\24\3\24\3\24\3\24\3\24\5\24\u017e\n\24\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u0188\n\26\3\26\3\26\7\26\u018c\n"+
		"\26\f\26\16\26\u018f\13\26\3\26\3\26\3\27\3\27\3\27\3\27\7\27\u0197\n"+
		"\27\f\27\16\27\u019a\13\27\5\27\u019c\n\27\3\27\3\27\3\30\3\30\5\30\u01a2"+
		"\n\30\3\30\5\30\u01a5\n\30\3\31\3\31\3\31\3\31\7\31\u01ab\n\31\f\31\16"+
		"\31\u01ae\13\31\5\31\u01b0\n\31\3\31\3\31\3\32\3\32\5\32\u01b6\n\32\3"+
		"\32\5\32\u01b9\n\32\3\33\3\33\3\33\3\33\7\33\u01bf\n\33\f\33\16\33\u01c2"+
		"\13\33\5\33\u01c4\n\33\3\33\3\33\3\34\3\34\5\34\u01ca\n\34\3\35\3\35\5"+
		"\35\u01ce\n\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u01d9"+
		"\n\36\3\36\3\36\3\36\5\36\u01de\n\36\3\36\7\36\u01e1\n\36\f\36\16\36\u01e4"+
		"\13\36\3\37\3\37\3\37\7\37\u01e9\n\37\f\37\16\37\u01ec\13\37\3 \3 \3 "+
		"\3 \3 \3 \3 \3!\3!\3!\3!\3!\7!\u01fa\n!\f!\16!\u01fd\13!\3!\3!\5!\u0201"+
		"\n!\3\"\3\"\3#\3#\3$\3$\7$\u0209\n$\f$\16$\u020c\13$\3$\3$\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u021d\n%\3&\3&\3&\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\5\'\u0229\n\'\3(\3(\3(\3(\5(\u022f\n(\3(\3(\6(\u0233\n(\r(\16"+
		"(\u0234\3)\3)\5)\u0239\n)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\5+\u0246\n"+
		"+\3,\3,\3,\3,\5,\u024c\n,\3,\3,\5,\u0250\n,\3,\5,\u0253\n,\3,\3,\3,\3"+
		"-\3-\5-\u025a\n-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60"+
		"\3\61\3\61\5\61\u026e\n\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\63"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u0280\n\64\3\64\3\64\5\64\u0284"+
		"\n\64\3\64\3\64\3\65\5\65\u0289\n\65\3\65\3\65\5\65\u028d\n\65\7\65\u028f"+
		"\n\65\f\65\16\65\u0292\13\65\3\66\3\66\5\66\u0296\n\66\3\66\7\66\u0299"+
		"\n\66\f\66\16\66\u029c\13\66\3\66\5\66\u029f\n\66\3\66\3\66\3\67\3\67"+
		"\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\58\u02b6\n8\38\38"+
		"\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38"+
		"\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\58"+
		"\u02e7\n8\38\38\38\38\58\u02ed\n8\38\38\58\u02f1\n8\38\38\38\38\38\38"+
		"\38\38\38\78\u02fc\n8\f8\168\u02ff\138\39\39\39\39\39\39\39\59\u0308\n"+
		"9\39\39\39\39\39\59\u030f\n9\59\u0311\n9\3:\3:\3:\7:\u0316\n:\f:\16:\u0319"+
		"\13:\3;\3;\3;\3<\3<\3<\7<\u0321\n<\f<\16<\u0324\13<\3<\5<\u0327\n<\3="+
		"\3=\3=\3=\3>\3>\5>\u032f\n>\3>\3>\5>\u0333\n>\5>\u0335\n>\3?\3?\3?\3?"+
		"\3?\3@\3@\7@\u033e\n@\f@\16@\u0341\13@\3@\3@\3A\3A\3A\3A\3A\3A\3A\3A\3"+
		"A\3A\3A\3A\3A\3A\3A\3A\3A\3A\5A\u0357\nA\3B\3B\5B\u035b\nB\3C\3C\3C\3"+
		"C\5C\u0361\nC\3C\3C\5C\u0365\nC\3C\3C\7C\u0369\nC\fC\16C\u036c\13C\3C"+
		"\5C\u036f\nC\3D\3D\3D\3D\5D\u0375\nD\3E\3E\3E\3E\3F\3F\3F\3F\3F\5F\u0380"+
		"\nF\3G\3G\3G\7G\u0385\nG\fG\16G\u0388\13G\3H\3H\3H\3I\3I\3I\3J\3J\3J\7"+
		"J\u0393\nJ\fJ\16J\u0396\13J\3K\3K\3K\3K\3K\3K\5K\u039e\nK\3L\3L\3L\3L"+
		"\5L\u03a4\nL\3L\3L\5L\u03a8\nL\3L\3L\3M\3M\3M\3N\3N\3N\5N\u03b2\nN\3N"+
		"\3N\3N\5N\u03b7\nN\3N\3N\3O\3O\3O\3O\3P\3P\3Q\3Q\3Q\3Q\3R\3R\5R\u03c7"+
		"\nR\3R\3R\5R\u03cb\nR\7R\u03cd\nR\fR\16R\u03d0\13R\3R\3R\3R\3R\3R\7R\u03d7"+
		"\nR\fR\16R\u03da\13R\5R\u03dc\nR\3R\5R\u03df\nR\3S\3S\5S\u03e3\nS\3T\3"+
		"T\5T\u03e7\nT\3U\3U\3V\3V\3V\3V\3V\7V\u03f0\nV\fV\16V\u03f3\13V\3V\3V"+
		"\5V\u03f7\nV\3V\3\u00bb\4:nW\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\2\22\3\2`a\3\2\f\16\3\2\"$"+
		"\6\2oouuxxzz\5\2\36\36/\62bf\3\2\63\64\3\2\66\67\3\289\4\2\7\7=>\3\2?"+
		"@\3\2DG\3\2HI\4\2\22\22MV\5\2hikk||\3\2hi\5\2\b\b$${{\2\u0463\2\u00b1"+
		"\3\2\2\2\4\u00b6\3\2\2\2\6\u00c0\3\2\2\2\b\u00c2\3\2\2\2\n\u00e9\3\2\2"+
		"\2\f\u00eb\3\2\2\2\16\u00ee\3\2\2\2\20\u0106\3\2\2\2\22\u0116\3\2\2\2"+
		"\24\u0118\3\2\2\2\26\u012a\3\2\2\2\30\u0133\3\2\2\2\32\u0144\3\2\2\2\34"+
		"\u0149\3\2\2\2\36\u0150\3\2\2\2 \u0159\3\2\2\2\"\u0168\3\2\2\2$\u0173"+
		"\3\2\2\2&\u0177\3\2\2\2(\u0181\3\2\2\2*\u0183\3\2\2\2,\u0192\3\2\2\2."+
		"\u019f\3\2\2\2\60\u01a6\3\2\2\2\62\u01b3\3\2\2\2\64\u01ba\3\2\2\2\66\u01c7"+
		"\3\2\2\28\u01cb\3\2\2\2:\u01d8\3\2\2\2<\u01e5\3\2\2\2>\u01ed\3\2\2\2@"+
		"\u01f4\3\2\2\2B\u0202\3\2\2\2D\u0204\3\2\2\2F\u0206\3\2\2\2H\u021c\3\2"+
		"\2\2J\u021e\3\2\2\2L\u0221\3\2\2\2N\u022a\3\2\2\2P\u0236\3\2\2\2R\u023d"+
		"\3\2\2\2T\u0245\3\2\2\2V\u0247\3\2\2\2X\u0257\3\2\2\2Z\u025d\3\2\2\2\\"+
		"\u0265\3\2\2\2^\u0268\3\2\2\2`\u026b\3\2\2\2b\u0271\3\2\2\2d\u0274\3\2"+
		"\2\2f\u027f\3\2\2\2h\u0288\3\2\2\2j\u0293\3\2\2\2l\u02a2\3\2\2\2n\u02b5"+
		"\3\2\2\2p\u0310\3\2\2\2r\u0312\3\2\2\2t\u031a\3\2\2\2v\u031d\3\2\2\2x"+
		"\u0328\3\2\2\2z\u0334\3\2\2\2|\u0336\3\2\2\2~\u033b\3\2\2\2\u0080\u0356"+
		"\3\2\2\2\u0082\u035a\3\2\2\2\u0084\u0360\3\2\2\2\u0086\u0370\3\2\2\2\u0088"+
		"\u0376\3\2\2\2\u008a\u037f\3\2\2\2\u008c\u0381\3\2\2\2\u008e\u0389\3\2"+
		"\2\2\u0090\u038c\3\2\2\2\u0092\u038f\3\2\2\2\u0094\u039d\3\2\2\2\u0096"+
		"\u039f\3\2\2\2\u0098\u03ab\3\2\2\2\u009a\u03ae\3\2\2\2\u009c\u03ba\3\2"+
		"\2\2\u009e\u03be\3\2\2\2\u00a0\u03c0\3\2\2\2\u00a2\u03de\3\2\2\2\u00a4"+
		"\u03e2\3\2\2\2\u00a6\u03e4\3\2\2\2\u00a8\u03e8\3\2\2\2\u00aa\u03ea\3\2"+
		"\2\2\u00ac\u00b0\5\4\3\2\u00ad\u00b0\5\n\6\2\u00ae\u00b0\5\16\b\2\u00af"+
		"\u00ac\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00ae\3\2\2\2\u00b0\u00b3\3\2"+
		"\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3"+
		"\u00b1\3\2\2\2\u00b4\u00b5\7\2\2\3\u00b5\3\3\2\2\2\u00b6\u00b7\7\3\2\2"+
		"\u00b7\u00bb\5\6\4\2\u00b8\u00ba\13\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bd"+
		"\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd"+
		"\u00bb\3\2\2\2\u00be\u00bf\7\4\2\2\u00bf\5\3\2\2\2\u00c0\u00c1\7{\2\2"+
		"\u00c1\7\3\2\2\2\u00c2\u00c5\5\u00a8U\2\u00c3\u00c4\7\5\2\2\u00c4\u00c6"+
		"\5\u00a8U\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\t\3\2\2\2\u00c7"+
		"\u00c8\7\6\2\2\u00c8\u00cb\7|\2\2\u00c9\u00ca\7\5\2\2\u00ca\u00cc\5\u00a8"+
		"U\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\u00ea\7\4\2\2\u00ce\u00d1\7\6\2\2\u00cf\u00d2\7\7\2\2\u00d0\u00d2\5\u00a8"+
		"U\2\u00d1\u00cf\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3"+
		"\u00d4\7\5\2\2\u00d4\u00d6\5\u00a8U\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6"+
		"\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\7\b\2\2\u00d8\u00d9\7|\2\2\u00d9"+
		"\u00ea\7\4\2\2\u00da\u00db\7\6\2\2\u00db\u00dc\7\t\2\2\u00dc\u00e1\5\b"+
		"\5\2\u00dd\u00de\7\n\2\2\u00de\u00e0\5\b\5\2\u00df\u00dd\3\2\2\2\u00e0"+
		"\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e4\3\2"+
		"\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e5\7\13\2\2\u00e5\u00e6\7\b\2\2\u00e6"+
		"\u00e7\7|\2\2\u00e7\u00e8\7\4\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00c7\3\2"+
		"\2\2\u00e9\u00ce\3\2\2\2\u00e9\u00da\3\2\2\2\u00ea\13\3\2\2\2\u00eb\u00ec"+
		"\t\2\2\2\u00ec\r\3\2\2\2\u00ed\u00ef\5\f\7\2\u00ee\u00ed\3\2\2\2\u00ee"+
		"\u00ef\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\t\3\2\2\u00f1\u00fb\5\u00a8"+
		"U\2\u00f2\u00f3\7\17\2\2\u00f3\u00f8\5\20\t\2\u00f4\u00f5\7\n\2\2\u00f5"+
		"\u00f7\5\20\t\2\u00f6\u00f4\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3"+
		"\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb"+
		"\u00f2\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u0101\7\t"+
		"\2\2\u00fe\u0100\5\22\n\2\u00ff\u00fe\3\2\2\2\u0100\u0103\3\2\2\2\u0101"+
		"\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0104\3\2\2\2\u0103\u0101\3\2"+
		"\2\2\u0104\u0105\7\13\2\2\u0105\17\3\2\2\2\u0106\u010c\5<\37\2\u0107\u0109"+
		"\7\20\2\2\u0108\u010a\5r:\2\u0109\u0108\3\2\2\2\u0109\u010a\3\2\2\2\u010a"+
		"\u010b\3\2\2\2\u010b\u010d\7\21\2\2\u010c\u0107\3\2\2\2\u010c\u010d\3"+
		"\2\2\2\u010d\21\3\2\2\2\u010e\u0117\5\24\13\2\u010f\u0117\5\26\f\2\u0110"+
		"\u0117\5\30\r\2\u0111\u0117\5\32\16\2\u0112\u0117\5\34\17\2\u0113\u0117"+
		"\5 \21\2\u0114\u0117\5&\24\2\u0115\u0117\5*\26\2\u0116\u010e\3\2\2\2\u0116"+
		"\u010f\3\2\2\2\u0116\u0110\3\2\2\2\u0116\u0111\3\2\2\2\u0116\u0112\3\2"+
		"\2\2\u0116\u0113\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0115\3\2\2\2\u0117"+
		"\23\3\2\2\2\u0118\u0120\5:\36\2\u0119\u011f\7w\2\2\u011a\u011f\7t\2\2"+
		"\u011b\u011f\7v\2\2\u011c\u011f\7o\2\2\u011d\u011f\5\u00aaV\2\u011e\u0119"+
		"\3\2\2\2\u011e\u011a\3\2\2\2\u011e\u011b\3\2\2\2\u011e\u011c\3\2\2\2\u011e"+
		"\u011d\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2"+
		"\2\2\u0121\u0123\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0126\5\u00a8U\2\u0124"+
		"\u0125\7\22\2\2\u0125\u0127\5n8\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2"+
		"\2\2\u0127\u0128\3\2\2\2\u0128\u0129\7\4\2\2\u0129\25\3\2\2\2\u012a\u012b"+
		"\7\23\2\2\u012b\u012c\5\u00a8U\2\u012c\u012f\7\24\2\2\u012d\u0130\7\7"+
		"\2\2\u012e\u0130\5:\36\2\u012f\u012d\3\2\2\2\u012f\u012e\3\2\2\2\u0130"+
		"\u0131\3\2\2\2\u0131\u0132\7\4\2\2\u0132\27\3\2\2\2\u0133\u0134\7\25\2"+
		"\2\u0134\u0135\5\u00a8U\2\u0135\u0140\7\t\2\2\u0136\u0137\58\35\2\u0137"+
		"\u013d\7\4\2\2\u0138\u0139\58\35\2\u0139\u013a\7\4\2\2\u013a\u013c\3\2"+
		"\2\2\u013b\u0138\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d"+
		"\u013e\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0136\3\2"+
		"\2\2\u0140\u0141\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0143\7\13\2\2\u0143"+
		"\31\3\2\2\2\u0144\u0145\7\26\2\2\u0145\u0146\5,\27\2\u0146\u0147\5$\23"+
		"\2\u0147\u0148\5F$\2\u0148\33\3\2\2\2\u0149\u014a\7\27\2\2\u014a\u014c"+
		"\5\u00a8U\2\u014b\u014d\5,\27\2\u014c\u014b\3\2\2\2\u014c\u014d\3\2\2"+
		"\2\u014d\u014e\3\2\2\2\u014e\u014f\5F$\2\u014f\35\3\2\2\2\u0150\u0156"+
		"\5\u00a8U\2\u0151\u0153\7\20\2\2\u0152\u0154\5r:\2\u0153\u0152\3\2\2\2"+
		"\u0153\u0154\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0157\7\21\2\2\u0156\u0151"+
		"\3\2\2\2\u0156\u0157\3\2\2\2\u0157\37\3\2\2\2\u0158\u015a\5\f\7\2\u0159"+
		"\u0158\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015d\7\30"+
		"\2\2\u015c\u015e\5\u00a8U\2\u015d\u015c\3\2\2\2\u015d\u015e\3\2\2\2\u015e"+
		"\u015f\3\2\2\2\u015f\u0160\5,\27\2\u0160\u0162\5$\23\2\u0161\u0163\5\""+
		"\22\2\u0162\u0161\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0166\3\2\2\2\u0164"+
		"\u0167\7\4\2\2\u0165\u0167\5F$\2\u0166\u0164\3\2\2\2\u0166\u0165\3\2\2"+
		"\2\u0167!\3\2\2\2\u0168\u0169\7\31\2\2\u0169\u016a\5,\27\2\u016a#\3\2"+
		"\2\2\u016b\u0172\5\36\20\2\u016c\u0172\5D#\2\u016d\u0172\7r\2\2\u016e"+
		"\u0172\7w\2\2\u016f\u0172\7t\2\2\u0170\u0172\7v\2\2\u0171\u016b\3\2\2"+
		"\2\u0171\u016c\3\2\2\2\u0171\u016d\3\2\2\2\u0171\u016e\3\2\2\2\u0171\u016f"+
		"\3\2\2\2\u0171\u0170\3\2\2\2\u0172\u0175\3\2\2\2\u0173\u0171\3\2\2\2\u0173"+
		"\u0174\3\2\2\2\u0174%\3\2\2\2\u0175\u0173\3\2\2\2\u0176\u0178\5\f\7\2"+
		"\u0177\u0176\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017a"+
		"\7\32\2\2\u017a\u017b\5\u00a8U\2\u017b\u017d\5\60\31\2\u017c\u017e\7m"+
		"\2\2\u017d\u017c\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u017f\3\2\2\2\u017f"+
		"\u0180\7\4\2\2\u0180\'\3\2\2\2\u0181\u0182\5\u00a8U\2\u0182)\3\2\2\2\u0183"+
		"\u0184\7\33\2\2\u0184\u0185\5\u00a8U\2\u0185\u0187\7\t\2\2\u0186\u0188"+
		"\5(\25\2\u0187\u0186\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u018d\3\2\2\2\u0189"+
		"\u018a\7\n\2\2\u018a\u018c\5(\25\2\u018b\u0189\3\2\2\2\u018c\u018f\3\2"+
		"\2\2\u018d\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u0190\3\2\2\2\u018f"+
		"\u018d\3\2\2\2\u0190\u0191\7\13\2\2\u0191+\3\2\2\2\u0192\u019b\7\20\2"+
		"\2\u0193\u0198\5.\30\2\u0194\u0195\7\n\2\2\u0195\u0197\5.\30\2\u0196\u0194"+
		"\3\2\2\2\u0197\u019a\3\2\2\2\u0198\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199"+
		"\u019c\3\2\2\2\u019a\u0198\3\2\2\2\u019b\u0193\3\2\2\2\u019b\u019c\3\2"+
		"\2\2\u019c\u019d\3\2\2\2\u019d\u019e\7\21\2\2\u019e-\3\2\2\2\u019f\u01a1"+
		"\5:\36\2\u01a0\u01a2\5B\"\2\u01a1\u01a0\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2"+
		"\u01a4\3\2\2\2\u01a3\u01a5\5\u00a8U\2\u01a4\u01a3\3\2\2\2\u01a4\u01a5"+
		"\3\2\2\2\u01a5/\3\2\2\2\u01a6\u01af\7\20\2\2\u01a7\u01ac\5\62\32\2\u01a8"+
		"\u01a9\7\n\2\2\u01a9\u01ab\5\62\32\2\u01aa\u01a8\3\2\2\2\u01ab\u01ae\3"+
		"\2\2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01b0\3\2\2\2\u01ae"+
		"\u01ac\3\2\2\2\u01af\u01a7\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b1\3\2"+
		"\2\2\u01b1\u01b2\7\21\2\2\u01b2\61\3\2\2\2\u01b3\u01b5\5:\36\2\u01b4\u01b6"+
		"\7s\2\2\u01b5\u01b4\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b8\3\2\2\2\u01b7"+
		"\u01b9\5\u00a8U\2\u01b8\u01b7\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\63\3\2"+
		"\2\2\u01ba\u01c3\7\20\2\2\u01bb\u01c0\5\66\34\2\u01bc\u01bd\7\n\2\2\u01bd"+
		"\u01bf\5\66\34\2\u01be\u01bc\3\2\2\2\u01bf\u01c2\3\2\2\2\u01c0\u01be\3"+
		"\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c4\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c3"+
		"\u01bb\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c6\7\21"+
		"\2\2\u01c6\65\3\2\2\2\u01c7\u01c9\5:\36\2\u01c8\u01ca\5B\"\2\u01c9\u01c8"+
		"\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\67\3\2\2\2\u01cb\u01cd\5:\36\2\u01cc"+
		"\u01ce\5B\"\2\u01cd\u01cc\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01cf\3\2"+
		"\2\2\u01cf\u01d0\5\u00a8U\2\u01d09\3\2\2\2\u01d1\u01d2\b\36\1\2\u01d2"+
		"\u01d9\5l\67\2\u01d3\u01d9\5<\37\2\u01d4\u01d9\5> \2\u01d5\u01d9\5@!\2"+
		"\u01d6\u01d7\7\36\2\2\u01d7\u01d9\7u\2\2\u01d8\u01d1\3\2\2\2\u01d8\u01d3"+
		"\3\2\2\2\u01d8\u01d4\3\2\2\2\u01d8\u01d5\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d9"+
		"\u01e2\3\2\2\2\u01da\u01db\f\5\2\2\u01db\u01dd\7\34\2\2\u01dc\u01de\5"+
		"n8\2\u01dd\u01dc\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01df\3\2\2\2\u01df"+
		"\u01e1\7\35\2\2\u01e0\u01da\3\2\2\2\u01e1\u01e4\3\2\2\2\u01e2\u01e0\3"+
		"\2\2\2\u01e2\u01e3\3\2\2\2\u01e3;\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e5\u01ea"+
		"\5\u00a8U\2\u01e6\u01e7\7\37\2\2\u01e7\u01e9\5\u00a8U\2\u01e8\u01e6\3"+
		"\2\2\2\u01e9\u01ec\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb"+
		"=\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ed\u01ee\7 \2\2\u01ee\u01ef\7\20\2\2"+
		"\u01ef\u01f0\5l\67\2\u01f0\u01f1\7!\2\2\u01f1\u01f2\5:\36\2\u01f2\u01f3"+
		"\7\21\2\2\u01f3?\3\2\2\2\u01f4\u01f5\7\30\2\2\u01f5\u01fb\5\64\33\2\u01f6"+
		"\u01fa\7t\2\2\u01f7\u01fa\7r\2\2\u01f8\u01fa\5D#\2\u01f9\u01f6\3\2\2\2"+
		"\u01f9\u01f7\3\2\2\2\u01f9\u01f8\3\2\2\2\u01fa\u01fd\3\2\2\2\u01fb\u01f9"+
		"\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u0200\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fe"+
		"\u01ff\7\31\2\2\u01ff\u0201\5\64\33\2\u0200\u01fe\3\2\2\2\u0200\u0201"+
		"\3\2\2\2\u0201A\3\2\2\2\u0202\u0203\t\4\2\2\u0203C\3\2\2\2\u0204\u0205"+
		"\t\5\2\2\u0205E\3\2\2\2\u0206\u020a\7\t\2\2\u0207\u0209\5H%\2\u0208\u0207"+
		"\3\2\2\2\u0209\u020c\3\2\2\2\u020a\u0208\3\2\2\2\u020a\u020b\3\2\2\2\u020b"+
		"\u020d\3\2\2\2\u020c\u020a\3\2\2\2\u020d\u020e\7\13\2\2\u020eG\3\2\2\2"+
		"\u020f\u021d\5L\'\2\u0210\u021d\5N(\2\u0211\u021d\5R*\2\u0212\u021d\5"+
		"V,\2\u0213\u021d\5F$\2\u0214\u021d\5X-\2\u0215\u021d\5Z.\2\u0216\u021d"+
		"\5\\/\2\u0217\u021d\5^\60\2\u0218\u021d\5`\61\2\u0219\u021d\5b\62\2\u021a"+
		"\u021d\5d\63\2\u021b\u021d\5T+\2\u021c\u020f\3\2\2\2\u021c\u0210\3\2\2"+
		"\2\u021c\u0211\3\2\2\2\u021c\u0212\3\2\2\2\u021c\u0213\3\2\2\2\u021c\u0214"+
		"\3\2\2\2\u021c\u0215\3\2\2\2\u021c\u0216\3\2\2\2\u021c\u0217\3\2\2\2\u021c"+
		"\u0218\3\2\2\2\u021c\u0219\3\2\2\2\u021c\u021a\3\2\2\2\u021c\u021b\3\2"+
		"\2\2\u021dI\3\2\2\2\u021e\u021f\5n8\2\u021f\u0220\7\4\2\2\u0220K\3\2\2"+
		"\2\u0221\u0222\7%\2\2\u0222\u0223\7\20\2\2\u0223\u0224\5n8\2\u0224\u0225"+
		"\7\21\2\2\u0225\u0228\5H%\2\u0226\u0227\7&\2\2\u0227\u0229\5H%\2\u0228"+
		"\u0226\3\2\2\2\u0228\u0229\3\2\2\2\u0229M\3\2\2\2\u022a\u022b\7\'\2\2"+
		"\u022b\u022e\5n8\2\u022c\u022d\7\31\2\2\u022d\u022f\5,\27\2\u022e\u022c"+
		"\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0232\5F$\2\u0231"+
		"\u0233\5P)\2\u0232\u0231\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u0232\3\2\2"+
		"\2\u0234\u0235\3\2\2\2\u0235O\3\2\2\2\u0236\u0238\7(\2\2\u0237\u0239\5"+
		"\u00a8U\2\u0238\u0237\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u023a\3\2\2\2"+
		"\u023a\u023b\5,\27\2\u023b\u023c\5F$\2\u023cQ\3\2\2\2\u023d\u023e\7)\2"+
		"\2\u023e\u023f\7\20\2\2\u023f\u0240\5n8\2\u0240\u0241\7\21\2\2\u0241\u0242"+
		"\5H%\2\u0242S\3\2\2\2\u0243\u0246\5f\64\2\u0244\u0246\5J&\2\u0245\u0243"+
		"\3\2\2\2\u0245\u0244\3\2\2\2\u0246U\3\2\2\2\u0247\u0248\7\24\2\2\u0248"+
		"\u024b\7\20\2\2\u0249\u024c\5T+\2\u024a\u024c\7\4\2\2\u024b\u0249\3\2"+
		"\2\2\u024b\u024a\3\2\2\2\u024c\u024f\3\2\2\2\u024d\u0250\5J&\2\u024e\u0250"+
		"\7\4\2\2\u024f\u024d\3\2\2\2\u024f\u024e\3\2\2\2\u0250\u0252\3\2\2\2\u0251"+
		"\u0253\5n8\2\u0252\u0251\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0254\3\2\2"+
		"\2\u0254\u0255\7\21\2\2\u0255\u0256\5H%\2\u0256W\3\2\2\2\u0257\u0259\7"+
		"*\2\2\u0258\u025a\7|\2\2\u0259\u0258\3\2\2\2\u0259\u025a\3\2\2\2\u025a"+
		"\u025b\3\2\2\2\u025b\u025c\5~@\2\u025cY\3\2\2\2\u025d\u025e\7+\2\2\u025e"+
		"\u025f\5H%\2\u025f\u0260\7)\2\2\u0260\u0261\7\20\2\2\u0261\u0262\5n8\2"+
		"\u0262\u0263\7\21\2\2\u0263\u0264\7\4\2\2\u0264[\3\2\2\2\u0265\u0266\7"+
		"p\2\2\u0266\u0267\7\4\2\2\u0267]\3\2\2\2\u0268\u0269\7n\2\2\u0269\u026a"+
		"\7\4\2\2\u026a_\3\2\2\2\u026b\u026d\7,\2\2\u026c\u026e\5n8\2\u026d\u026c"+
		"\3\2\2\2\u026d\u026e\3\2\2\2\u026e\u026f\3\2\2\2\u026f\u0270\7\4\2\2\u0270"+
		"a\3\2\2\2\u0271\u0272\7-\2\2\u0272\u0273\7\4\2\2\u0273c\3\2\2\2\u0274"+
		"\u0275\7.\2\2\u0275\u0276\5|?\2\u0276\u0277\7\4\2\2\u0277e\3\2\2\2\u0278"+
		"\u0279\7/\2\2\u0279\u0280\5j\66\2\u027a\u0280\58\35\2\u027b\u027c\7\20"+
		"\2\2\u027c\u027d\5h\65\2\u027d\u027e\7\21\2\2\u027e\u0280\3\2\2\2\u027f"+
		"\u0278\3\2\2\2\u027f\u027a\3\2\2\2\u027f\u027b\3\2\2\2\u0280\u0283\3\2"+
		"\2\2\u0281\u0282\7\22\2\2\u0282\u0284\5n8\2\u0283\u0281\3\2\2\2\u0283"+
		"\u0284\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0286\7\4\2\2\u0286g\3\2\2\2"+
		"\u0287\u0289\58\35\2\u0288\u0287\3\2\2\2\u0288\u0289\3\2\2\2\u0289\u0290"+
		"\3\2\2\2\u028a\u028c\7\n\2\2\u028b\u028d\58\35\2\u028c\u028b\3\2\2\2\u028c"+
		"\u028d\3\2\2\2\u028d\u028f\3\2\2\2\u028e\u028a\3\2\2\2\u028f\u0292\3\2"+
		"\2\2\u0290\u028e\3\2\2\2\u0290\u0291\3\2\2\2\u0291i\3\2\2\2\u0292\u0290"+
		"\3\2\2\2\u0293\u029a\7\20\2\2\u0294\u0296\5\u00a8U\2\u0295\u0294\3\2\2"+
		"\2\u0295\u0296\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u0299\7\n\2\2\u0298\u0295"+
		"\3\2\2\2\u0299\u029c\3\2\2\2\u029a\u0298\3\2\2\2\u029a\u029b\3\2\2\2\u029b"+
		"\u029e\3\2\2\2\u029c\u029a\3\2\2\2\u029d\u029f\5\u00a8U\2\u029e\u029d"+
		"\3\2\2\2\u029e\u029f\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u02a1\7\21\2\2"+
		"\u02a1k\3\2\2\2\u02a2\u02a3\t\6\2\2\u02a3m\3\2\2\2\u02a4\u02a5\b8\1\2"+
		"\u02a5\u02b6\5t;\2\u02a6\u02a7\7\20\2\2\u02a7\u02a8\5n8\2\u02a8\u02a9"+
		"\7\21\2\2\u02a9\u02b6\3\2\2\2\u02aa\u02ab\t\7\2\2\u02ab\u02b6\5n8\25\u02ac"+
		"\u02ad\t\b\2\2\u02ad\u02b6\5n8\24\u02ae\u02af\t\t\2\2\u02af\u02b6\5n8"+
		"\23\u02b0\u02b1\7:\2\2\u02b1\u02b6\5n8\22\u02b2\u02b3\7;\2\2\u02b3\u02b6"+
		"\5n8\21\u02b4\u02b6\5p9\2\u02b5\u02a4\3\2\2\2\u02b5\u02a6\3\2\2\2\u02b5"+
		"\u02aa\3\2\2\2\u02b5\u02ac\3\2\2\2\u02b5\u02ae\3\2\2\2\u02b5\u02b0\3\2"+
		"\2\2\u02b5\u02b2\3\2\2\2\u02b5\u02b4\3\2\2\2\u02b6\u02fd\3\2\2\2\u02b7"+
		"\u02b8\f\20\2\2\u02b8\u02b9\7<\2\2\u02b9\u02fc\5n8\21\u02ba\u02bb\f\17"+
		"\2\2\u02bb\u02bc\t\n\2\2\u02bc\u02fc\5n8\20\u02bd\u02be\f\16\2\2\u02be"+
		"\u02bf\t\b\2\2\u02bf\u02fc\5n8\17\u02c0\u02c1\f\r\2\2\u02c1\u02c2\t\13"+
		"\2\2\u02c2\u02fc\5n8\16\u02c3\u02c4\f\f\2\2\u02c4\u02c5\7A\2\2\u02c5\u02fc"+
		"\5n8\r\u02c6\u02c7\f\13\2\2\u02c7\u02c8\7B\2\2\u02c8\u02fc\5n8\f\u02c9"+
		"\u02ca\f\n\2\2\u02ca\u02cb\7C\2\2\u02cb\u02fc\5n8\13\u02cc\u02cd\f\t\2"+
		"\2\u02cd\u02ce\t\f\2\2\u02ce\u02fc\5n8\n\u02cf\u02d0\f\b\2\2\u02d0\u02d1"+
		"\t\r\2\2\u02d1\u02fc\5n8\t\u02d2\u02d3\f\7\2\2\u02d3\u02d4\7J\2\2\u02d4"+
		"\u02fc\5n8\b\u02d5\u02d6\f\6\2\2\u02d6\u02d7\7K\2\2\u02d7\u02fc\5n8\7"+
		"\u02d8\u02d9\f\5\2\2\u02d9\u02da\7L\2\2\u02da\u02db\5n8\2\u02db\u02dc"+
		"\7\65\2\2\u02dc\u02dd\5n8\6\u02dd\u02fc\3\2\2\2\u02de\u02df\f\4\2\2\u02df"+
		"\u02e0\t\16\2\2\u02e0\u02fc\5n8\5\u02e1\u02e2\f\34\2\2\u02e2\u02fc\t\7"+
		"\2\2\u02e3\u02e4\f\32\2\2\u02e4\u02e6\7\34\2\2\u02e5\u02e7\5n8\2\u02e6"+
		"\u02e5\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8\u02fc\7\35"+
		"\2\2\u02e9\u02ea\f\31\2\2\u02ea\u02ec\7\34\2\2\u02eb\u02ed\5n8\2\u02ec"+
		"\u02eb\3\2\2\2\u02ec\u02ed\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\u02f0\7\65"+
		"\2\2\u02ef\u02f1\5n8\2\u02f0\u02ef\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1\u02f2"+
		"\3\2\2\2\u02f2\u02fc\7\35\2\2\u02f3\u02f4\f\30\2\2\u02f4\u02f5\7\37\2"+
		"\2\u02f5\u02fc\5\u00a8U\2\u02f6\u02f7\f\27\2\2\u02f7\u02f8\7\20\2\2\u02f8"+
		"\u02f9\5z>\2\u02f9\u02fa\7\21\2\2\u02fa\u02fc\3\2\2\2\u02fb\u02b7\3\2"+
		"\2\2\u02fb\u02ba\3\2\2\2\u02fb\u02bd\3\2\2\2\u02fb\u02c0\3\2\2\2\u02fb"+
		"\u02c3\3\2\2\2\u02fb\u02c6\3\2\2\2\u02fb\u02c9\3\2\2\2\u02fb\u02cc\3\2"+
		"\2\2\u02fb\u02cf\3\2\2\2\u02fb\u02d2\3\2\2\2\u02fb\u02d5\3\2\2\2\u02fb"+
		"\u02d8\3\2\2\2\u02fb\u02de\3\2\2\2\u02fb\u02e1\3\2\2\2\u02fb\u02e3\3\2"+
		"\2\2\u02fb\u02e9\3\2\2\2\u02fb\u02f3\3\2\2\2\u02fb\u02f6\3\2\2\2\u02fc"+
		"\u02ff\3\2\2\2\u02fd\u02fb\3\2\2\2\u02fd\u02fe\3\2\2\2\u02feo\3\2\2\2"+
		"\u02ff\u02fd\3\2\2\2\u0300\u0311\7g\2\2\u0301\u0311\5\u00a6T\2\u0302\u0311"+
		"\7k\2\2\u0303\u0311\7|\2\2\u0304\u0307\5\u00a8U\2\u0305\u0306\7\34\2\2"+
		"\u0306\u0308\7\35\2\2\u0307\u0305\3\2\2\2\u0307\u0308\3\2\2\2\u0308\u0311"+
		"\3\2\2\2\u0309\u0311\7y\2\2\u030a\u0311\5\u00a2R\2\u030b\u030e\5\u00a4"+
		"S\2\u030c\u030d\7\34\2\2\u030d\u030f\7\35\2\2\u030e\u030c\3\2\2\2\u030e"+
		"\u030f\3\2\2\2\u030f\u0311\3\2\2\2\u0310\u0300\3\2\2\2\u0310\u0301\3\2"+
		"\2\2\u0310\u0302\3\2\2\2\u0310\u0303\3\2\2\2\u0310\u0304\3\2\2\2\u0310"+
		"\u0309\3\2\2\2\u0310\u030a\3\2\2\2\u0310\u030b\3\2\2\2\u0311q\3\2\2\2"+
		"\u0312\u0317\5n8\2\u0313\u0314\7\n\2\2\u0314\u0316\5n8\2\u0315\u0313\3"+
		"\2\2\2\u0316\u0319\3\2\2\2\u0317\u0315\3\2\2\2\u0317\u0318\3\2\2\2\u0318"+
		"s\3\2\2\2\u0319\u0317\3\2\2\2\u031a\u031b\7W\2\2\u031b\u031c\5:\36\2\u031c"+
		"u\3\2\2\2\u031d\u0322\5x=\2\u031e\u031f\7\n\2\2\u031f\u0321\5x=\2\u0320"+
		"\u031e\3\2\2\2\u0321\u0324\3\2\2\2\u0322\u0320\3\2\2\2\u0322\u0323\3\2"+
		"\2\2\u0323\u0326\3\2\2\2\u0324\u0322\3\2\2\2\u0325\u0327\7\n\2\2\u0326"+
		"\u0325\3\2\2\2\u0326\u0327\3\2\2\2\u0327w\3\2\2\2\u0328\u0329\5\u00a8"+
		"U\2\u0329\u032a\7\65\2\2\u032a\u032b\5n8\2\u032by\3\2\2\2\u032c\u032e"+
		"\7\t\2\2\u032d\u032f\5v<\2\u032e\u032d\3\2\2\2\u032e\u032f\3\2\2\2\u032f"+
		"\u0330\3\2\2\2\u0330\u0335\7\13\2\2\u0331\u0333\5r:\2\u0332\u0331\3\2"+
		"\2\2\u0332\u0333\3\2\2\2\u0333\u0335\3\2\2\2\u0334\u032c\3\2\2\2\u0334"+
		"\u0332\3\2\2\2\u0335{\3\2\2\2\u0336\u0337\5n8\2\u0337\u0338\7\20\2\2\u0338"+
		"\u0339\5z>\2\u0339\u033a\7\21\2\2\u033a}\3\2\2\2\u033b\u033f\7\t\2\2\u033c"+
		"\u033e\5\u0080A\2\u033d\u033c\3\2\2\2\u033e\u0341\3\2\2\2\u033f\u033d"+
		"\3\2\2\2\u033f\u0340\3\2\2\2\u0340\u0342\3\2\2\2\u0341\u033f\3\2\2\2\u0342"+
		"\u0343\7\13\2\2\u0343\177\3\2\2\2\u0344\u0357\5\u00a8U\2\u0345\u0357\5"+
		"~@\2\u0346\u0357\5\u0082B\2\u0347\u0357\5\u0086D\2\u0348\u0357\5\u0088"+
		"E\2\u0349\u0357\5\u008eH\2\u034a\u0357\5\u0090I\2\u034b\u0357\5\u0092"+
		"J\2\u034c\u0357\5\u0096L\2\u034d\u0357\5\u009aN\2\u034e\u0357\5\u009c"+
		"O\2\u034f\u0357\7n\2\2\u0350\u0357\7p\2\2\u0351\u0357\7q\2\2\u0352\u0357"+
		"\5\u00a0Q\2\u0353\u0357\5\u00a6T\2\u0354\u0357\7|\2\2\u0355\u0357\7k\2"+
		"\2\u0356\u0344\3\2\2\2\u0356\u0345\3\2\2\2\u0356\u0346\3\2\2\2\u0356\u0347"+
		"\3\2\2\2\u0356\u0348\3\2\2\2\u0356\u0349\3\2\2\2\u0356\u034a\3\2\2\2\u0356"+
		"\u034b\3\2\2\2\u0356\u034c\3\2\2\2\u0356\u034d\3\2\2\2\u0356\u034e\3\2"+
		"\2\2\u0356\u034f\3\2\2\2\u0356\u0350\3\2\2\2\u0356\u0351\3\2\2\2\u0356"+
		"\u0352\3\2\2\2\u0356\u0353\3\2\2\2\u0356\u0354\3\2\2\2\u0356\u0355\3\2"+
		"\2\2\u0357\u0081\3\2\2\2\u0358\u035b\5\u0084C\2\u0359\u035b\5\u009eP\2"+
		"\u035a\u0358\3\2\2\2\u035a\u0359\3\2\2\2\u035b\u0083\3\2\2\2\u035c\u0361"+
		"\7,\2\2\u035d\u0361\7\36\2\2\u035e\u0361\7\62\2\2\u035f\u0361\5\u00a8"+
		"U\2\u0360\u035c\3\2\2\2\u0360\u035d\3\2\2\2\u0360\u035e\3\2\2\2\u0360"+
		"\u035f\3\2\2\2\u0361\u036e\3\2\2\2\u0362\u0364\7\20\2\2\u0363\u0365\5"+
		"\u0082B\2\u0364\u0363\3\2\2\2\u0364\u0365\3\2\2\2\u0365\u036a\3\2\2\2"+
		"\u0366\u0367\7\n\2\2\u0367\u0369\5\u0082B\2\u0368\u0366\3\2\2\2\u0369"+
		"\u036c\3\2\2\2\u036a\u0368\3\2\2\2\u036a\u036b\3\2\2\2\u036b\u036d\3\2"+
		"\2\2\u036c\u036a\3\2\2\2\u036d\u036f\7\21\2\2\u036e\u0362\3\2\2\2\u036e"+
		"\u036f\3\2\2\2\u036f\u0085\3\2\2\2\u0370\u0371\7X\2\2\u0371\u0374\5\u008a"+
		"F\2\u0372\u0373\7Y\2\2\u0373\u0375\5\u0082B\2\u0374\u0372\3\2\2\2\u0374"+
		"\u0375\3\2\2\2\u0375\u0087\3\2\2\2\u0376\u0377\5\u008aF\2\u0377\u0378"+
		"\7Y\2\2\u0378\u0379\5\u0082B\2\u0379\u0089\3\2\2\2\u037a\u0380\5\u00a8"+
		"U\2\u037b\u037c\7\20\2\2\u037c\u037d\5\u008cG\2\u037d\u037e\7\21\2\2\u037e"+
		"\u0380\3\2\2\2\u037f\u037a\3\2\2\2\u037f\u037b\3\2\2\2\u0380\u008b\3\2"+
		"\2\2\u0381\u0386\5\u00a8U\2\u0382\u0383\7\n\2\2\u0383\u0385\5\u00a8U\2"+
		"\u0384\u0382\3\2\2\2\u0385\u0388\3\2\2\2\u0386\u0384\3\2\2\2\u0386\u0387"+
		"\3\2\2\2\u0387\u008d\3\2\2\2\u0388\u0386\3\2\2\2\u0389\u038a\7Z\2\2\u038a"+
		"\u038b\5\u00a8U\2\u038b\u008f\3\2\2\2\u038c\u038d\5\u00a8U\2\u038d\u038e"+
		"\7\65\2\2\u038e\u0091\3\2\2\2\u038f\u0390\7[\2\2\u0390\u0394\5\u0082B"+
		"\2\u0391\u0393\5\u0094K\2\u0392\u0391\3\2\2\2\u0393\u0396\3\2\2\2\u0394"+
		"\u0392\3\2\2\2\u0394\u0395\3\2\2\2\u0395\u0093\3\2\2\2\u0396\u0394\3\2"+
		"\2\2\u0397\u0398\7\\\2\2\u0398\u0399\5\u009eP\2\u0399\u039a\5~@\2\u039a"+
		"\u039e\3\2\2\2\u039b\u039c\7]\2\2\u039c\u039e\5~@\2\u039d\u0397\3\2\2"+
		"\2\u039d\u039b\3\2\2\2\u039e\u0095\3\2\2\2\u039f\u03a0\7\30\2\2\u03a0"+
		"\u03a1\5\u00a8U\2\u03a1\u03a3\7\20\2\2\u03a2\u03a4\5\u008cG\2\u03a3\u03a2"+
		"\3\2\2\2\u03a3\u03a4\3\2\2\2\u03a4\u03a5\3\2\2\2\u03a5\u03a7\7\21\2\2"+
		"\u03a6\u03a8\5\u0098M\2\u03a7\u03a6\3\2\2\2\u03a7\u03a8\3\2\2\2\u03a8"+
		"\u03a9\3\2\2\2\u03a9\u03aa\5~@\2\u03aa\u0097\3\2\2\2\u03ab\u03ac\7^\2"+
		"\2\u03ac\u03ad\5\u008cG\2\u03ad\u0099\3\2\2\2\u03ae\u03b1\7\24\2\2\u03af"+
		"\u03b2\5~@\2\u03b0\u03b2\5\u0082B\2\u03b1\u03af\3\2\2\2\u03b1\u03b0\3"+
		"\2\2\2\u03b2\u03b3\3\2\2\2\u03b3\u03b6\5\u0082B\2\u03b4\u03b7\5~@\2\u03b5"+
		"\u03b7\5\u0082B\2\u03b6\u03b4\3\2\2\2\u03b6\u03b5\3\2\2\2\u03b7\u03b8"+
		"\3\2\2\2\u03b8\u03b9\5~@\2\u03b9\u009b\3\2\2\2\u03ba\u03bb\7%\2\2\u03bb"+
		"\u03bc\5\u0082B\2\u03bc\u03bd\5~@\2\u03bd\u009d\3\2\2\2\u03be\u03bf\t"+
		"\17\2\2\u03bf\u009f\3\2\2\2\u03c0\u03c1\7*\2\2\u03c1\u03c2\5\u00a8U\2"+
		"\u03c2\u03c3\5~@\2\u03c3\u00a1\3\2\2\2\u03c4\u03c6\7\20\2\2\u03c5\u03c7"+
		"\5n8\2\u03c6\u03c5\3\2\2\2\u03c6\u03c7\3\2\2\2\u03c7\u03ce\3\2\2\2\u03c8"+
		"\u03ca\7\n\2\2\u03c9\u03cb\5n8\2\u03ca\u03c9\3\2\2\2\u03ca\u03cb\3\2\2"+
		"\2\u03cb\u03cd\3\2\2\2\u03cc\u03c8\3\2\2\2\u03cd\u03d0\3\2\2\2\u03ce\u03cc"+
		"\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cf\u03d1\3\2\2\2\u03d0\u03ce\3\2\2\2\u03d1"+
		"\u03df\7\21\2\2\u03d2\u03db\7\34\2\2\u03d3\u03d8\5n8\2\u03d4\u03d5\7\n"+
		"\2\2\u03d5\u03d7\5n8\2\u03d6\u03d4\3\2\2\2\u03d7\u03da\3\2\2\2\u03d8\u03d6"+
		"\3\2\2\2\u03d8\u03d9\3\2\2\2\u03d9\u03dc\3\2\2\2\u03da\u03d8\3\2\2\2\u03db"+
		"\u03d3\3\2\2\2\u03db\u03dc\3\2\2\2\u03dc\u03dd\3\2\2\2\u03dd\u03df\7\35"+
		"\2\2\u03de\u03c4\3\2\2\2\u03de\u03d2\3\2\2\2\u03df\u00a3\3\2\2\2\u03e0"+
		"\u03e3\5l\67\2\u03e1\u03e3\5<\37\2\u03e2\u03e0\3\2\2\2\u03e2\u03e1\3\2"+
		"\2\2\u03e3\u00a5\3\2\2\2\u03e4\u03e6\t\20\2\2\u03e5\u03e7\7j\2\2\u03e6"+
		"\u03e5\3\2\2\2\u03e6\u03e7\3\2\2\2\u03e7\u00a7\3\2\2\2\u03e8\u03e9\t\21"+
		"\2\2\u03e9\u00a9\3\2\2\2\u03ea\u03f6\7_\2\2\u03eb\u03ec\7\20\2\2\u03ec"+
		"\u03f1\5<\37\2\u03ed\u03ee\7\n\2\2\u03ee\u03f0\5<\37\2\u03ef\u03ed\3\2"+
		"\2\2\u03f0\u03f3\3\2\2\2\u03f1\u03ef\3\2\2\2\u03f1\u03f2\3\2\2\2\u03f2"+
		"\u03f4\3\2\2\2\u03f3\u03f1\3\2\2\2\u03f4\u03f5\7\21\2\2\u03f5\u03f7\3"+
		"\2\2\2\u03f6\u03eb\3\2\2\2\u03f6\u03f7\3\2\2\2\u03f7\u00ab\3\2\2\2u\u00af"+
		"\u00b1\u00bb\u00c5\u00cb\u00d1\u00d5\u00e1\u00e9\u00ee\u00f8\u00fb\u0101"+
		"\u0109\u010c\u0116\u011e\u0120\u0126\u012f\u013d\u0140\u014c\u0153\u0156"+
		"\u0159\u015d\u0162\u0166\u0171\u0173\u0177\u017d\u0187\u018d\u0198\u019b"+
		"\u01a1\u01a4\u01ac\u01af\u01b5\u01b8\u01c0\u01c3\u01c9\u01cd\u01d8\u01dd"+
		"\u01e2\u01ea\u01f9\u01fb\u0200\u020a\u021c\u0228\u022e\u0234\u0238\u0245"+
		"\u024b\u024f\u0252\u0259\u026d\u027f\u0283\u0288\u028c\u0290\u0295\u029a"+
		"\u029e\u02b5\u02e6\u02ec\u02f0\u02fb\u02fd\u0307\u030e\u0310\u0317\u0322"+
		"\u0326\u032e\u0332\u0334\u033f\u0356\u035a\u0360\u0364\u036a\u036e\u0374"+
		"\u037f\u0386\u0394\u039d\u03a3\u03a7\u03b1\u03b6\u03c6\u03ca\u03ce\u03d8"+
		"\u03db\u03de\u03e2\u03e6\u03f1\u03f6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}