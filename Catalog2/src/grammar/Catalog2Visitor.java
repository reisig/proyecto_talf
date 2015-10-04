package grammar;
// Generated from Catalog2.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Catalog2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Catalog2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Catalog2Parser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(Catalog2Parser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printStatement}
	 * labeled alternative in {@link Catalog2Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(Catalog2Parser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code copyStatement}
	 * labeled alternative in {@link Catalog2Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopyStatement(Catalog2Parser.CopyStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code moveStatement}
	 * labeled alternative in {@link Catalog2Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoveStatement(Catalog2Parser.MoveStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code deleteStatement}
	 * labeled alternative in {@link Catalog2Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteStatement(Catalog2Parser.DeleteStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link Catalog2Parser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(Catalog2Parser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifCondition}
	 * labeled alternative in {@link Catalog2Parser#control_flow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfCondition(Catalog2Parser.IfConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forCycle}
	 * labeled alternative in {@link Catalog2Parser#control_flow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForCycle(Catalog2Parser.ForCycleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negation}
	 * labeled alternative in {@link Catalog2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegation(Catalog2Parser.NegationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plusMinus}
	 * labeled alternative in {@link Catalog2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusMinus(Catalog2Parser.PlusMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link Catalog2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(Catalog2Parser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multDivMod}
	 * labeled alternative in {@link Catalog2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultDivMod(Catalog2Parser.MultDivModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringDotId}
	 * labeled alternative in {@link Catalog2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringDotId(Catalog2Parser.StringDotIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link Catalog2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpression(Catalog2Parser.ParenExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andOperator}
	 * labeled alternative in {@link Catalog2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndOperator(Catalog2Parser.AndOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orOperator}
	 * labeled alternative in {@link Catalog2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrOperator(Catalog2Parser.OrOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link Catalog2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpression(Catalog2Parser.StringExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code insertNumber}
	 * labeled alternative in {@link Catalog2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertNumber(Catalog2Parser.InsertNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code trueFalse}
	 * labeled alternative in {@link Catalog2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueFalse(Catalog2Parser.TrueFalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code insertVariable}
	 * labeled alternative in {@link Catalog2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertVariable(Catalog2Parser.InsertVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idDotWord}
	 * labeled alternative in {@link Catalog2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdDotWord(Catalog2Parser.IdDotWordContext ctx);
}