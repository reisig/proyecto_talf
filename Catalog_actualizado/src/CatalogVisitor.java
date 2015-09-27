// Generated from Catalog.g4 by ANTLR 4.5.1
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
	 * Visit a parse tree produced by {@link CatalogParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(CatalogParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link CatalogParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(CatalogParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CatalogParser#or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(CatalogParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by {@link CatalogParser#and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(CatalogParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by {@link CatalogParser#eqneq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqneq(CatalogParser.EqneqContext ctx);
	/**
	 * Visit a parse tree produced by {@link CatalogParser#comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp(CatalogParser.CompContext ctx);
	/**
	 * Visit a parse tree produced by {@link CatalogParser#addsub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddsub(CatalogParser.AddsubContext ctx);
	/**
	 * Visit a parse tree produced by {@link CatalogParser#multdiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultdiv(CatalogParser.MultdivContext ctx);
	/**
	 * Visit a parse tree produced by {@link CatalogParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern(CatalogParser.PatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link CatalogParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(CatalogParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CatalogParser#basic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasic(CatalogParser.BasicContext ctx);
	/**
	 * Visit a parse tree produced by {@link CatalogParser#foreach}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeach(CatalogParser.ForeachContext ctx);
	/**
	 * Visit a parse tree produced by {@link CatalogParser#sort}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSort(CatalogParser.SortContext ctx);
	/**
	 * Visit a parse tree produced by {@link CatalogParser#filelist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilelist(CatalogParser.FilelistContext ctx);
}