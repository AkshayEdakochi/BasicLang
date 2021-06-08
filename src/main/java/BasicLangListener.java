// Generated from /home/akshay/IdeaProjects/BasicLang/BasicLang.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BasicLangParser}.
 */
public interface BasicLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BasicLangParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(BasicLangParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicLangParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(BasicLangParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicLangParser#statemets}.
	 * @param ctx the parse tree
	 */
	void enterStatemets(BasicLangParser.StatemetsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicLangParser#statemets}.
	 * @param ctx the parse tree
	 */
	void exitStatemets(BasicLangParser.StatemetsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(BasicLangParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(BasicLangParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicLangParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(BasicLangParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicLangParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(BasicLangParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicLangParser#kadakkuPurath}.
	 * @param ctx the parse tree
	 */
	void enterKadakkuPurath(BasicLangParser.KadakkuPurathContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicLangParser#kadakkuPurath}.
	 * @param ctx the parse tree
	 */
	void exitKadakkuPurath(BasicLangParser.KadakkuPurathContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicLangParser#samkhyaFunction}.
	 * @param ctx the parse tree
	 */
	void enterSamkhyaFunction(BasicLangParser.SamkhyaFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicLangParser#samkhyaFunction}.
	 * @param ctx the parse tree
	 */
	void exitSamkhyaFunction(BasicLangParser.SamkhyaFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code directSamkhyaCall}
	 * labeled alternative in {@link BasicLangParser#samkhyaExpr}.
	 * @param ctx the parse tree
	 */
	void enterDirectSamkhyaCall(BasicLangParser.DirectSamkhyaCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code directSamkhyaCall}
	 * labeled alternative in {@link BasicLangParser#samkhyaExpr}.
	 * @param ctx the parse tree
	 */
	void exitDirectSamkhyaCall(BasicLangParser.DirectSamkhyaCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SamkhyaSweekarikkuka}
	 * labeled alternative in {@link BasicLangParser#samkhyaExpr}.
	 * @param ctx the parse tree
	 */
	void enterSamkhyaSweekarikkuka(BasicLangParser.SamkhyaSweekarikkukaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SamkhyaSweekarikkuka}
	 * labeled alternative in {@link BasicLangParser#samkhyaExpr}.
	 * @param ctx the parse tree
	 */
	void exitSamkhyaSweekarikkuka(BasicLangParser.SamkhyaSweekarikkukaContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicLangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(BasicLangParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicLangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(BasicLangParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicLangParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssignment(BasicLangParser.VariableAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicLangParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssignment(BasicLangParser.VariableAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicLangParser#shreniInitialisation}.
	 * @param ctx the parse tree
	 */
	void enterShreniInitialisation(BasicLangParser.ShreniInitialisationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicLangParser#shreniInitialisation}.
	 * @param ctx the parse tree
	 */
	void exitShreniInitialisation(BasicLangParser.ShreniInitialisationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicLangParser#elementList}.
	 * @param ctx the parse tree
	 */
	void enterElementList(BasicLangParser.ElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicLangParser#elementList}.
	 * @param ctx the parse tree
	 */
	void exitElementList(BasicLangParser.ElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicLangParser#shreniElements}.
	 * @param ctx the parse tree
	 */
	void enterShreniElements(BasicLangParser.ShreniElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicLangParser#shreniElements}.
	 * @param ctx the parse tree
	 */
	void exitShreniElements(BasicLangParser.ShreniElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicLangParser#shreniElement}.
	 * @param ctx the parse tree
	 */
	void enterShreniElement(BasicLangParser.ShreniElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicLangParser#shreniElement}.
	 * @param ctx the parse tree
	 */
	void exitShreniElement(BasicLangParser.ShreniElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicLangParser#shreniElementAssignment}.
	 * @param ctx the parse tree
	 */
	void enterShreniElementAssignment(BasicLangParser.ShreniElementAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicLangParser#shreniElementAssignment}.
	 * @param ctx the parse tree
	 */
	void exitShreniElementAssignment(BasicLangParser.ShreniElementAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicLangParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void enterIf_stat(BasicLangParser.If_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicLangParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void exitIf_stat(BasicLangParser.If_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicLangParser#athavaBlock}.
	 * @param ctx the parse tree
	 */
	void enterAthavaBlock(BasicLangParser.AthavaBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicLangParser#athavaBlock}.
	 * @param ctx the parse tree
	 */
	void exitAthavaBlock(BasicLangParser.AthavaBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicLangParser#allenkilBlock}.
	 * @param ctx the parse tree
	 */
	void enterAllenkilBlock(BasicLangParser.AllenkilBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicLangParser#allenkilBlock}.
	 * @param ctx the parse tree
	 */
	void exitAllenkilBlock(BasicLangParser.AllenkilBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicLangParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stat(BasicLangParser.While_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicLangParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stat(BasicLangParser.While_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicLangParser#log}.
	 * @param ctx the parse tree
	 */
	void enterLog(BasicLangParser.LogContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicLangParser#log}.
	 * @param ctx the parse tree
	 */
	void exitLog(BasicLangParser.LogContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicLangParser#sweekarikkukaStatement}.
	 * @param ctx the parse tree
	 */
	void enterSweekarikkukaStatement(BasicLangParser.SweekarikkukaStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicLangParser#sweekarikkukaStatement}.
	 * @param ctx the parse tree
	 */
	void exitSweekarikkukaStatement(BasicLangParser.SweekarikkukaStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicLangParser#sweekarikkukaExpr}.
	 * @param ctx the parse tree
	 */
	void enterSweekarikkukaExpr(BasicLangParser.SweekarikkukaExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicLangParser#sweekarikkukaExpr}.
	 * @param ctx the parse tree
	 */
	void exitSweekarikkukaExpr(BasicLangParser.SweekarikkukaExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link BasicLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(BasicLangParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link BasicLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(BasicLangParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link BasicLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinusExpr(BasicLangParser.UnaryMinusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link BasicLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinusExpr(BasicLangParser.UnaryMinusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code samkhyaFunctionExpr}
	 * labeled alternative in {@link BasicLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSamkhyaFunctionExpr(BasicLangParser.SamkhyaFunctionExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code samkhyaFunctionExpr}
	 * labeled alternative in {@link BasicLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSamkhyaFunctionExpr(BasicLangParser.SamkhyaFunctionExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link BasicLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationExpr(BasicLangParser.MultiplicationExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link BasicLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationExpr(BasicLangParser.MultiplicationExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link BasicLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(BasicLangParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link BasicLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(BasicLangParser.AtomExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link BasicLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(BasicLangParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link BasicLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(BasicLangParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code shreniMultipleIndexedExpr}
	 * labeled alternative in {@link BasicLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterShreniMultipleIndexedExpr(BasicLangParser.ShreniMultipleIndexedExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code shreniMultipleIndexedExpr}
	 * labeled alternative in {@link BasicLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitShreniMultipleIndexedExpr(BasicLangParser.ShreniMultipleIndexedExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link BasicLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpr(BasicLangParser.AdditiveExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link BasicLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpr(BasicLangParser.AdditiveExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code shreniIndexedExpr}
	 * labeled alternative in {@link BasicLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterShreniIndexedExpr(BasicLangParser.ShreniIndexedExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code shreniIndexedExpr}
	 * labeled alternative in {@link BasicLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitShreniIndexedExpr(BasicLangParser.ShreniIndexedExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link BasicLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpr(BasicLangParser.RelationalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link BasicLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpr(BasicLangParser.RelationalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link BasicLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(BasicLangParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link BasicLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(BasicLangParser.EqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link BasicLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(BasicLangParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link BasicLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(BasicLangParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicLangParser#shreniIndexed}.
	 * @param ctx the parse tree
	 */
	void enterShreniIndexed(BasicLangParser.ShreniIndexedContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicLangParser#shreniIndexed}.
	 * @param ctx the parse tree
	 */
	void exitShreniIndexed(BasicLangParser.ShreniIndexedContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicLangParser#shreniMultipleIndexed}.
	 * @param ctx the parse tree
	 */
	void enterShreniMultipleIndexed(BasicLangParser.ShreniMultipleIndexedContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicLangParser#shreniMultipleIndexed}.
	 * @param ctx the parse tree
	 */
	void exitShreniMultipleIndexed(BasicLangParser.ShreniMultipleIndexedContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicLangParser#indexingExpr}.
	 * @param ctx the parse tree
	 */
	void enterIndexingExpr(BasicLangParser.IndexingExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicLangParser#indexingExpr}.
	 * @param ctx the parse tree
	 */
	void exitIndexingExpr(BasicLangParser.IndexingExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicLangParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(BasicLangParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicLangParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(BasicLangParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicLangParser#parathesisedExpr}.
	 * @param ctx the parse tree
	 */
	void enterParathesisedExpr(BasicLangParser.ParathesisedExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicLangParser#parathesisedExpr}.
	 * @param ctx the parse tree
	 */
	void exitParathesisedExpr(BasicLangParser.ParathesisedExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicLangParser#integerAtom}.
	 * @param ctx the parse tree
	 */
	void enterIntegerAtom(BasicLangParser.IntegerAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicLangParser#integerAtom}.
	 * @param ctx the parse tree
	 */
	void exitIntegerAtom(BasicLangParser.IntegerAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicLangParser#floatAtom}.
	 * @param ctx the parse tree
	 */
	void enterFloatAtom(BasicLangParser.FloatAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicLangParser#floatAtom}.
	 * @param ctx the parse tree
	 */
	void exitFloatAtom(BasicLangParser.FloatAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicLangParser#booleanAtom}.
	 * @param ctx the parse tree
	 */
	void enterBooleanAtom(BasicLangParser.BooleanAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicLangParser#booleanAtom}.
	 * @param ctx the parse tree
	 */
	void exitBooleanAtom(BasicLangParser.BooleanAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicLangParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(BasicLangParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicLangParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(BasicLangParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicLangParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(BasicLangParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicLangParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(BasicLangParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicLangParser#nil}.
	 * @param ctx the parse tree
	 */
	void enterNil(BasicLangParser.NilContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicLangParser#nil}.
	 * @param ctx the parse tree
	 */
	void exitNil(BasicLangParser.NilContext ctx);
}