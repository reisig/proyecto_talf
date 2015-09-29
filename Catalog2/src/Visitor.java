import java.util.Hashtable;
import java.util.Set;

public class Visitor extends Catalog2BaseVisitor<CatalogType>{
    
    Hashtable<String, CatalogType> memory = new Hashtable<String, CatalogType>();

    public CatalogType visitPrintStatement(Catalog2Parser.PrintStatementContext ctx) {
	Set<String> keys = memory.keySet();
	
	for (String string : keys) {
	    if (string.equals(ctx.VAR.getText())){
		System.out.println(memory.get(string).getStrValue());
	    }
	}	
	return null;
    }

    public CatalogType visitCopyStatement(Catalog2Parser.CopyStatementContext ctx) {
	
	return null;
    }

    public CatalogType visitMoveStatement(Catalog2Parser.MoveStatementContext ctx) {
	
	return null;
    }

    public CatalogType visitDeleteStatement(Catalog2Parser.DeleteStatementContext ctx) {
	
	return null;
    }

    public CatalogType visitAssign(Catalog2Parser.AssignContext ctx) {
	String id = ctx.ID().getText();
	CatalogType value = new CatalogType(ctx.expression().getText());	
	memory.put(id, value);
	
	return null;
    }

    public CatalogType visitIfCondition(Catalog2Parser.IfConditionContext ctx) {
	
	return null;
    }

    public CatalogType visitForCycle(Catalog2Parser.ForCycleContext ctx) {
	
	return null;
    }

    public CatalogType visitNegation(Catalog2Parser.NegationContext ctx) {
	
	return null;
    }

    public CatalogType visitPlusMinus(Catalog2Parser.PlusMinusContext ctx) {
	return null;
    }

    public CatalogType visitComparison(Catalog2Parser.ComparisonContext ctx) {
	return null;
    }

    public CatalogType visitMultDivMod(Catalog2Parser.MultDivModContext ctx) {
	return null;
    }

    public CatalogType visitStringDotId(Catalog2Parser.StringDotIdContext ctx) {
	return null;
    }

    public CatalogType visitParenExpression(Catalog2Parser.ParenExpressionContext ctx) {
	return null;
    }

    public CatalogType visitAndOperator(Catalog2Parser.AndOperatorContext ctx) {
	return null;
    }

    public CatalogType visitOrOperator(Catalog2Parser.OrOperatorContext ctx) {
	return null;
    }

    public CatalogType visitStringExpression(Catalog2Parser.StringExpressionContext ctx) {
	return null;
    }

    public CatalogType visitInsertNumber(Catalog2Parser.InsertNumberContext ctx) {
	return null;
    }

    public CatalogType visitTrueFalse(Catalog2Parser.TrueFalseContext ctx) {
	return null;
    }

    public CatalogType visitInsertVariable(Catalog2Parser.InsertVariableContext ctx) {
	return null;
    }

    public CatalogType visitIdDotWord(Catalog2Parser.IdDotWordContext ctx) {
	return null;
    }


    

}
