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
	 * Enter a parse tree produced by {@link BasicLangParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void enterCondition_block(BasicLangParser.Condition_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicLangParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void exitCondition_block(BasicLangParser.Condition_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicLangParser#stat_block_if}.
	 * @param ctx the parse tree
	 */
	void enterStat_block_if(BasicLangParser.Stat_block_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicLangParser#stat_block_if}.
	 * @param ctx the parse tree
	 */
	void exitStat_block_if(BasicLangParser.Stat_block_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link BasicLangParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void enterStat_block(BasicLangParser.Stat_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link BasicLangParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void exitStat_block(BasicLangParser.Stat_blockContext ctx);
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
	 * Enter a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link BasicLangParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterParExpr(BasicLangParser.ParExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link BasicLangParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitParExpr(BasicLangParser.ParExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntAtom}
	 * labeled alternative in {@link BasicLangParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterIntAtom(BasicLangParser.IntAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntAtom}
	 * labeled alternative in {@link BasicLangParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitIntAtom(BasicLangParser.IntAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FloatAtom}
	 * labeled alternative in {@link BasicLangParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterFloatAtom(BasicLangParser.FloatAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FloatAtom}
	 * labeled alternative in {@link BasicLangParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitFloatAtom(BasicLangParser.FloatAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link BasicLangParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterBooleanAtom(BasicLangParser.BooleanAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link BasicLangParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitBooleanAtom(BasicLangParser.BooleanAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link BasicLangParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterIdAtom(BasicLangParser.IdAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link BasicLangParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitIdAtom(BasicLangParser.IdAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link BasicLangParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterStringAtom(BasicLangParser.StringAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link BasicLangParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitStringAtom(BasicLangParser.StringAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link BasicLangParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNilAtom(BasicLangParser.NilAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link BasicLangParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNilAtom(BasicLangParser.NilAtomContext ctx);
}