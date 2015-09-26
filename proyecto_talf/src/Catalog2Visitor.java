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
	 * Visit a parse tree produced by {@link Catalog2Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(Catalog2Parser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Catalog2Parser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(Catalog2Parser.AssignmentContext ctx);
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
	 * Visit a parse tree produced by {@link Catalog2Parser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(Catalog2Parser.ExpresionContext ctx);
}