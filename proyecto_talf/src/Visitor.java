

public class Visitor extends Catalog2BaseVisitor<CatalogType>{

    public CatalogType visitProg(Catalog2Parser.ProgContext ctx) {
	CatalogType ct = new CatalogType(ctx);
	System.out.println(ct.getStrValue());
	return super.visitProg(ctx);
    }

    public CatalogType visitStatement(Catalog2Parser.StatementContext ctx) {
	// TODO Auto-generated method stub
	return super.visitStatement(ctx);
    }

    public CatalogType visitAssignment(Catalog2Parser.AssignmentContext ctx) {
	// TODO Auto-generated method stub
	return super.visitAssignment(ctx);
    }

    public CatalogType visitIfCondition(Catalog2Parser.IfConditionContext ctx) {
	// TODO Auto-generated method stub
	return super.visitIfCondition(ctx);
    }

    public CatalogType visitForCycle(Catalog2Parser.ForCycleContext ctx) {
	// TODO Auto-generated method stub
	return super.visitForCycle(ctx);
    }

    public CatalogType visitExpresion(Catalog2Parser.ExpresionContext ctx) {
	// TODO Auto-generated method stub
	return super.visitExpresion(ctx);
    }
    
    
    

}
