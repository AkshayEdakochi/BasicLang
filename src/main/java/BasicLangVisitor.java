// Generated from /home/akshay/IdeaProjects/BasicLang/BasicLang.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BasicLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BasicLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BasicLangParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(BasicLangParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicLangParser#statemets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatemets(BasicLangParser.StatemetsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicLangParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(BasicLangParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicLangParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(BasicLangParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicLangParser#kadakkuPurath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKadakkuPurath(BasicLangParser.KadakkuPurathContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicLangParser#samkhyaFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSamkhyaFunction(BasicLangParser.SamkhyaFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code directSamkhyaCall}
	 * labeled alternative in {@link BasicLangParser#samkhyaExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectSamkhyaCall(BasicLangParser.DirectSamkhyaCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SamkhyaSweekarikkuka}
	 * labeled alternative in {@link BasicLangParser#samkhyaExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSamkhyaSweekarikkuka(BasicLangParser.SamkhyaSweekarikkukaContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicLangParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(BasicLangParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicLangParser#variableAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAssignment(BasicLangParser.VariableAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicLangParser#shreniInitialisation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShreniInitialisation(BasicLangParser.ShreniInitialisationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicLangParser#elementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementList(BasicLangParser.ElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicLangParser#shreniElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShreniElements(BasicLangParser.ShreniElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicLangParser#shreniElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShreniElement(BasicLangParser.ShreniElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicLangParser#if_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stat(BasicLangParser.If_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicLangParser#athavaBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAthavaBlock(BasicLangParser.AthavaBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicLangParser#allenkilBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllenkilBlock(BasicLangParser.AllenkilBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicLangParser#while_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stat(BasicLangParser.While_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicLangParser#log}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLog(BasicLangParser.LogContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicLangParser#sweekarikkukaStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSweekarikkukaStatement(BasicLangParser.SweekarikkukaStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicLangParser#sweekarikkukaExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSweekarikkukaExpr(BasicLangParser.SweekarikkukaExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link BasicLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(BasicLangParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link BasicLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMinusExpr(BasicLangParser.UnaryMinusExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code samkhyaFunctionExpr}
	 * labeled alternative in {@link BasicLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSamkhyaFunctionExpr(BasicLangParser.SamkhyaFunctionExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link BasicLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationExpr(BasicLangParser.MultiplicationExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link BasicLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExpr(BasicLangParser.AtomExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link BasicLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(BasicLangParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code shreniMultipleIndexedExpr}
	 * labeled alternative in {@link BasicLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShreniMultipleIndexedExpr(BasicLangParser.ShreniMultipleIndexedExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link BasicLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpr(BasicLangParser.AdditiveExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code shreniIndexedExpr}
	 * labeled alternative in {@link BasicLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShreniIndexedExpr(BasicLangParser.ShreniIndexedExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link BasicLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpr(BasicLangParser.RelationalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link BasicLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpr(BasicLangParser.EqualityExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link BasicLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(BasicLangParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicLangParser#shreniIndexed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShreniIndexed(BasicLangParser.ShreniIndexedContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicLangParser#shreniMultipleIndexed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShreniMultipleIndexed(BasicLangParser.ShreniMultipleIndexedContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicLangParser#indexingExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexingExpr(BasicLangParser.IndexingExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicLangParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(BasicLangParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicLangParser#parathesisedExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParathesisedExpr(BasicLangParser.ParathesisedExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicLangParser#integerAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerAtom(BasicLangParser.IntegerAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicLangParser#floatAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatAtom(BasicLangParser.FloatAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicLangParser#booleanAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanAtom(BasicLangParser.BooleanAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicLangParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(BasicLangParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicLangParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(BasicLangParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link BasicLangParser#nil}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNil(BasicLangParser.NilContext ctx);
}