// Generated from Solidity.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SolidityParser}.
 */
public interface SolidityListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SolidityParser#sourceUnit}.
	 * @param ctx the parse tree
	 */
	void enterSourceUnit(SolidityParser.SourceUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#sourceUnit}.
	 * @param ctx the parse tree
	 */
	void exitSourceUnit(SolidityParser.SourceUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#pragmaDirective}.
	 * @param ctx the parse tree
	 */
	void enterPragmaDirective(SolidityParser.PragmaDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#pragmaDirective}.
	 * @param ctx the parse tree
	 */
	void exitPragmaDirective(SolidityParser.PragmaDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#pragmaName}.
	 * @param ctx the parse tree
	 */
	void enterPragmaName(SolidityParser.PragmaNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#pragmaName}.
	 * @param ctx the parse tree
	 */
	void exitPragmaName(SolidityParser.PragmaNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(SolidityParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(SolidityParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#importDirective}.
	 * @param ctx the parse tree
	 */
	void enterImportDirective(SolidityParser.ImportDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#importDirective}.
	 * @param ctx the parse tree
	 */
	void exitImportDirective(SolidityParser.ImportDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#natSpec}.
	 * @param ctx the parse tree
	 */
	void enterNatSpec(SolidityParser.NatSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#natSpec}.
	 * @param ctx the parse tree
	 */
	void exitNatSpec(SolidityParser.NatSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#contractDefinition}.
	 * @param ctx the parse tree
	 */
	void enterContractDefinition(SolidityParser.ContractDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#contractDefinition}.
	 * @param ctx the parse tree
	 */
	void exitContractDefinition(SolidityParser.ContractDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#inheritanceSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterInheritanceSpecifier(SolidityParser.InheritanceSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#inheritanceSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitInheritanceSpecifier(SolidityParser.InheritanceSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#contractPart}.
	 * @param ctx the parse tree
	 */
	void enterContractPart(SolidityParser.ContractPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#contractPart}.
	 * @param ctx the parse tree
	 */
	void exitContractPart(SolidityParser.ContractPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#stateVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStateVariableDeclaration(SolidityParser.StateVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#stateVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStateVariableDeclaration(SolidityParser.StateVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#usingForDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterUsingForDeclaration(SolidityParser.UsingForDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#usingForDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitUsingForDeclaration(SolidityParser.UsingForDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#structDefinition}.
	 * @param ctx the parse tree
	 */
	void enterStructDefinition(SolidityParser.StructDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#structDefinition}.
	 * @param ctx the parse tree
	 */
	void exitStructDefinition(SolidityParser.StructDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#constructorDefinition}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDefinition(SolidityParser.ConstructorDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#constructorDefinition}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDefinition(SolidityParser.ConstructorDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#modifierDefinition}.
	 * @param ctx the parse tree
	 */
	void enterModifierDefinition(SolidityParser.ModifierDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#modifierDefinition}.
	 * @param ctx the parse tree
	 */
	void exitModifierDefinition(SolidityParser.ModifierDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#modifierInvocation}.
	 * @param ctx the parse tree
	 */
	void enterModifierInvocation(SolidityParser.ModifierInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#modifierInvocation}.
	 * @param ctx the parse tree
	 */
	void exitModifierInvocation(SolidityParser.ModifierInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(SolidityParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(SolidityParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#returnParameters}.
	 * @param ctx the parse tree
	 */
	void enterReturnParameters(SolidityParser.ReturnParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#returnParameters}.
	 * @param ctx the parse tree
	 */
	void exitReturnParameters(SolidityParser.ReturnParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#modifierList}.
	 * @param ctx the parse tree
	 */
	void enterModifierList(SolidityParser.ModifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#modifierList}.
	 * @param ctx the parse tree
	 */
	void exitModifierList(SolidityParser.ModifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#eventDefinition}.
	 * @param ctx the parse tree
	 */
	void enterEventDefinition(SolidityParser.EventDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#eventDefinition}.
	 * @param ctx the parse tree
	 */
	void exitEventDefinition(SolidityParser.EventDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#enumValue}.
	 * @param ctx the parse tree
	 */
	void enterEnumValue(SolidityParser.EnumValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#enumValue}.
	 * @param ctx the parse tree
	 */
	void exitEnumValue(SolidityParser.EnumValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#enumDefinition}.
	 * @param ctx the parse tree
	 */
	void enterEnumDefinition(SolidityParser.EnumDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#enumDefinition}.
	 * @param ctx the parse tree
	 */
	void exitEnumDefinition(SolidityParser.EnumDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(SolidityParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(SolidityParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(SolidityParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(SolidityParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#eventParameterList}.
	 * @param ctx the parse tree
	 */
	void enterEventParameterList(SolidityParser.EventParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#eventParameterList}.
	 * @param ctx the parse tree
	 */
	void exitEventParameterList(SolidityParser.EventParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#eventParameter}.
	 * @param ctx the parse tree
	 */
	void enterEventParameter(SolidityParser.EventParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#eventParameter}.
	 * @param ctx the parse tree
	 */
	void exitEventParameter(SolidityParser.EventParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#functionTypeParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTypeParameterList(SolidityParser.FunctionTypeParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#functionTypeParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTypeParameterList(SolidityParser.FunctionTypeParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#functionTypeParameter}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTypeParameter(SolidityParser.FunctionTypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#functionTypeParameter}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTypeParameter(SolidityParser.FunctionTypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(SolidityParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(SolidityParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(SolidityParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(SolidityParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#userDefinedTypeName}.
	 * @param ctx the parse tree
	 */
	void enterUserDefinedTypeName(SolidityParser.UserDefinedTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#userDefinedTypeName}.
	 * @param ctx the parse tree
	 */
	void exitUserDefinedTypeName(SolidityParser.UserDefinedTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#mapping}.
	 * @param ctx the parse tree
	 */
	void enterMapping(SolidityParser.MappingContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#mapping}.
	 * @param ctx the parse tree
	 */
	void exitMapping(SolidityParser.MappingContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#functionTypeName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTypeName(SolidityParser.FunctionTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#functionTypeName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTypeName(SolidityParser.FunctionTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#storageLocation}.
	 * @param ctx the parse tree
	 */
	void enterStorageLocation(SolidityParser.StorageLocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#storageLocation}.
	 * @param ctx the parse tree
	 */
	void exitStorageLocation(SolidityParser.StorageLocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#stateMutability}.
	 * @param ctx the parse tree
	 */
	void enterStateMutability(SolidityParser.StateMutabilityContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#stateMutability}.
	 * @param ctx the parse tree
	 */
	void exitStateMutability(SolidityParser.StateMutabilityContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SolidityParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SolidityParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SolidityParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SolidityParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(SolidityParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(SolidityParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(SolidityParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(SolidityParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryStatement(SolidityParser.TryStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryStatement(SolidityParser.TryStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(SolidityParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(SolidityParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(SolidityParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(SolidityParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStatement(SolidityParser.SimpleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStatement(SolidityParser.SimpleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(SolidityParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(SolidityParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#inlineAssemblyStatement}.
	 * @param ctx the parse tree
	 */
	void enterInlineAssemblyStatement(SolidityParser.InlineAssemblyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#inlineAssemblyStatement}.
	 * @param ctx the parse tree
	 */
	void exitInlineAssemblyStatement(SolidityParser.InlineAssemblyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatement(SolidityParser.DoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatement(SolidityParser.DoWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(SolidityParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(SolidityParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(SolidityParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(SolidityParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(SolidityParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(SolidityParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(SolidityParser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(SolidityParser.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#emitStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmitStatement(SolidityParser.EmitStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#emitStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmitStatement(SolidityParser.EmitStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#variableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationStatement(SolidityParser.VariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#variableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationStatement(SolidityParser.VariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#variableDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationList(SolidityParser.VariableDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#variableDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationList(SolidityParser.VariableDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(SolidityParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(SolidityParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#elementaryTypeName}.
	 * @param ctx the parse tree
	 */
	void enterElementaryTypeName(SolidityParser.ElementaryTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#elementaryTypeName}.
	 * @param ctx the parse tree
	 */
	void exitElementaryTypeName(SolidityParser.ElementaryTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SolidityParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SolidityParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(SolidityParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(SolidityParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(SolidityParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(SolidityParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#newExpression}.
	 * @param ctx the parse tree
	 */
	void enterNewExpression(SolidityParser.NewExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#newExpression}.
	 * @param ctx the parse tree
	 */
	void exitNewExpression(SolidityParser.NewExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#nameValueList}.
	 * @param ctx the parse tree
	 */
	void enterNameValueList(SolidityParser.NameValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#nameValueList}.
	 * @param ctx the parse tree
	 */
	void exitNameValueList(SolidityParser.NameValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#nameValue}.
	 * @param ctx the parse tree
	 */
	void enterNameValue(SolidityParser.NameValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#nameValue}.
	 * @param ctx the parse tree
	 */
	void exitNameValue(SolidityParser.NameValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#functionCallArguments}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallArguments(SolidityParser.FunctionCallArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#functionCallArguments}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallArguments(SolidityParser.FunctionCallArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(SolidityParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(SolidityParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#assemblyBlock}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyBlock(SolidityParser.AssemblyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#assemblyBlock}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyBlock(SolidityParser.AssemblyBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#assemblyItem}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyItem(SolidityParser.AssemblyItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#assemblyItem}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyItem(SolidityParser.AssemblyItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#assemblyExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyExpression(SolidityParser.AssemblyExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#assemblyExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyExpression(SolidityParser.AssemblyExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#assemblyCall}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyCall(SolidityParser.AssemblyCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#assemblyCall}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyCall(SolidityParser.AssemblyCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#assemblyLocalDefinition}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyLocalDefinition(SolidityParser.AssemblyLocalDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#assemblyLocalDefinition}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyLocalDefinition(SolidityParser.AssemblyLocalDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#assemblyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyAssignment(SolidityParser.AssemblyAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#assemblyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyAssignment(SolidityParser.AssemblyAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#assemblyIdentifierOrList}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyIdentifierOrList(SolidityParser.AssemblyIdentifierOrListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#assemblyIdentifierOrList}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyIdentifierOrList(SolidityParser.AssemblyIdentifierOrListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#assemblyIdentifierList}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyIdentifierList(SolidityParser.AssemblyIdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#assemblyIdentifierList}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyIdentifierList(SolidityParser.AssemblyIdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#assemblyStackAssignment}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyStackAssignment(SolidityParser.AssemblyStackAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#assemblyStackAssignment}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyStackAssignment(SolidityParser.AssemblyStackAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#labelDefinition}.
	 * @param ctx the parse tree
	 */
	void enterLabelDefinition(SolidityParser.LabelDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#labelDefinition}.
	 * @param ctx the parse tree
	 */
	void exitLabelDefinition(SolidityParser.LabelDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#assemblySwitch}.
	 * @param ctx the parse tree
	 */
	void enterAssemblySwitch(SolidityParser.AssemblySwitchContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#assemblySwitch}.
	 * @param ctx the parse tree
	 */
	void exitAssemblySwitch(SolidityParser.AssemblySwitchContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#assemblyCase}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyCase(SolidityParser.AssemblyCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#assemblyCase}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyCase(SolidityParser.AssemblyCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#assemblyFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyFunctionDefinition(SolidityParser.AssemblyFunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#assemblyFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyFunctionDefinition(SolidityParser.AssemblyFunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#assemblyFunctionReturns}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyFunctionReturns(SolidityParser.AssemblyFunctionReturnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#assemblyFunctionReturns}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyFunctionReturns(SolidityParser.AssemblyFunctionReturnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#assemblyFor}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyFor(SolidityParser.AssemblyForContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#assemblyFor}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyFor(SolidityParser.AssemblyForContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#assemblyIf}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyIf(SolidityParser.AssemblyIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#assemblyIf}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyIf(SolidityParser.AssemblyIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#assemblyLiteral}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyLiteral(SolidityParser.AssemblyLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#assemblyLiteral}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyLiteral(SolidityParser.AssemblyLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#subAssembly}.
	 * @param ctx the parse tree
	 */
	void enterSubAssembly(SolidityParser.SubAssemblyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#subAssembly}.
	 * @param ctx the parse tree
	 */
	void exitSubAssembly(SolidityParser.SubAssemblyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#tupleExpression}.
	 * @param ctx the parse tree
	 */
	void enterTupleExpression(SolidityParser.TupleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#tupleExpression}.
	 * @param ctx the parse tree
	 */
	void exitTupleExpression(SolidityParser.TupleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#typeNameExpression}.
	 * @param ctx the parse tree
	 */
	void enterTypeNameExpression(SolidityParser.TypeNameExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#typeNameExpression}.
	 * @param ctx the parse tree
	 */
	void exitTypeNameExpression(SolidityParser.TypeNameExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#numberLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNumberLiteral(SolidityParser.NumberLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#numberLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNumberLiteral(SolidityParser.NumberLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(SolidityParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(SolidityParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolidityParser#overrideSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterOverrideSpecifier(SolidityParser.OverrideSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolidityParser#overrideSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitOverrideSpecifier(SolidityParser.OverrideSpecifierContext ctx);
}