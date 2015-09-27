import java.util.Hashtable;


public class Visitor extends CatalogBaseVisitor<CatalogType> {
   
    CatalogFiles files = new CatalogFiles();
    Hashtable<Integer, Object> table = new Hashtable<Integer, Object>();
    
    public CatalogType visitFile(CatalogParser.FileContext ctx) {
	
	System.out.println("visit file");
	
	
	return null;
    }

    public CatalogType visitStmt(CatalogParser.StmtContext ctx) {
	
	System.out.println("visit stmt");
	
	return null;
    }

    public CatalogType visitOr(CatalogParser.OrContext ctx) {
	
	return null;
    }

    public CatalogType visitAnd(CatalogParser.AndContext ctx) {
	
	return null;
    }

    public CatalogType visitEqneq(CatalogParser.EqneqContext ctx) {
	
	return null;
    }

    public CatalogType visitComp(CatalogParser.CompContext ctx) {
	
	return null;
    }

    public CatalogType visitAddsub(CatalogParser.AddsubContext ctx) {
	
	return null;
    }

    public CatalogType visitMultdiv(CatalogParser.MultdivContext ctx) {
	
	return null;
    }

    public CatalogType visitPattern(CatalogParser.PatternContext ctx) {
	return null;
    }

    public CatalogType visitProperty(CatalogParser.PropertyContext ctx) {
	return null;
    }

    public CatalogType visitBasic(CatalogParser.BasicContext ctx) {
	return null;
    }

    public CatalogType visitForeach(CatalogParser.ForeachContext ctx) {
	return null;
    }

    public CatalogType visitSort(CatalogParser.SortContext ctx) {
	return null;
    }

    public CatalogType visitFilelist(CatalogParser.FilelistContext ctx) {
	return null;
    }

    public CatalogType visitPrintStmt(CatalogParser.PrintStmtContext ctx) {
	
	
	
	return super.visitPrintStmt(ctx);
    }

    public CatalogType visitIfStmt(CatalogParser.IfStmtContext ctx) {
	// TODO Auto-generated method stub
	return super.visitIfStmt(ctx);
    }

    public CatalogType visitCopyStmt(CatalogParser.CopyStmtContext ctx) {
	// TODO Auto-generated method stub
	return super.visitCopyStmt(ctx);
    }

    public CatalogType visitMoveStmt(CatalogParser.MoveStmtContext ctx) {
	// TODO Auto-generated method stub
	return super.visitMoveStmt(ctx);
    }

    public CatalogType visitDeleteStmt(CatalogParser.DeleteStmtContext ctx) {
	// TODO Auto-generated method stub
	return super.visitDeleteStmt(ctx);
    }

    public CatalogType visitForStmt(CatalogParser.ForStmtContext ctx) {
	// TODO Auto-generated method stub
	return super.visitForStmt(ctx);
    }

    public CatalogType visitAssignStmt(CatalogParser.AssignStmtContext ctx) {
	CatalogType old = visit(ctx.VAR());
	CatalogType neu = visit(ctx.stmt());
	System.out.println("visit assign");
	System.out.println(old.getStrValue());
	System.out.println(neu.getStrValue());

	
	return super.visitAssignStmt(ctx);
    }

    public CatalogType visitOrStmt(CatalogParser.OrStmtContext ctx) {
	// TODO Auto-generated method stub
	return super.visitOrStmt(ctx);
    }
    
    

}
