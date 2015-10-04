// Generated from Catalog.g4 by ANTLR 4.5.1
 package model; 
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CatalogParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CatalogVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CatalogParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(CatalogParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CatalogParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(CatalogParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CatalogParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(CatalogParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link CatalogParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(CatalogParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CatalogParser#if_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stat(CatalogParser.If_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link CatalogParser#while_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stat(CatalogParser.While_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link CatalogParser#foreach_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeach_stat(CatalogParser.Foreach_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link CatalogParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(CatalogParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link CatalogParser#copy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy(CatalogParser.CopyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CatalogParser#move}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMove(CatalogParser.MoveContext ctx);
	/**
	 * Visit a parse tree produced by {@link CatalogParser#delete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete(CatalogParser.DeleteContext ctx);
	/**
	 * Visit a parse tree produced by {@link CatalogParser#create}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate(CatalogParser.CreateContext ctx);
	/**
	 * Visit a parse tree produced by {@link CatalogParser#condition_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_block(CatalogParser.Condition_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CatalogParser#stat_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_block(CatalogParser.Stat_blockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dotExpr}
	 * labeled alternative in {@link CatalogParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotExpr(CatalogParser.DotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link CatalogParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(CatalogParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link CatalogParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMinusExpr(CatalogParser.UnaryMinusExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link CatalogParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationExpr(CatalogParser.MultiplicationExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link CatalogParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExpr(CatalogParser.AtomExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link CatalogParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(CatalogParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link CatalogParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpr(CatalogParser.AdditiveExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link CatalogParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowExpr(CatalogParser.PowExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link CatalogParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpr(CatalogParser.RelationalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link CatalogParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpr(CatalogParser.EqualityExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link CatalogParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(CatalogParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link CatalogParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpr(CatalogParser.ParExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link CatalogParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberAtom(CatalogParser.NumberAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link CatalogParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanAtom(CatalogParser.BooleanAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link CatalogParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdAtom(CatalogParser.IdAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link CatalogParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAtom(CatalogParser.StringAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link CatalogParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNilAtom(CatalogParser.NilAtomContext ctx);
}