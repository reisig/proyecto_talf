
public class Visitor extends CatalogBaseVisitor<CatalogType> {
    
    CatalogTable table = new CatalogTable();
    CatalogFiles files = new CatalogFiles();
    
    public CatalogType visitFile(CatalogParser.FileContext ctx) {
	
	
	return null;
    }

    public CatalogType visitStmt(CatalogParser.StmtContext ctx) {
	
	
	
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
    
    

}
