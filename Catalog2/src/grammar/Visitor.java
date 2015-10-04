package grammar;
import java.util.Hashtable;
import java.util.Set;

import controller.CatalogTable;
import controller.CatalogType;

public class Visitor extends Catalog2BaseVisitor<CatalogType>{
    
    CatalogTable memory = new CatalogTable();

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
	CatalogType value = visit(ctx.expression());	
	return memory.put(id, value);
    }

    public CatalogType visitIfCondition(Catalog2Parser.IfConditionContext ctx) {
	
	return null;
    }

    public CatalogType visitForCycle(Catalog2Parser.ForCycleContext ctx) {

	return null;
    }

    public CatalogType visitNegation(Catalog2Parser.NegationContext ctx) {
	CatalogType ctl = visit(ctx.expression());
	return null;
    }

    public CatalogType visitPlusMinus(Catalog2Parser.PlusMinusContext ctx) {
		
	CatalogType exp1 = memory.get(ctx.expression(0).getText());
	CatalogType exp2 = memory.get(ctx.expression(1).getText());

	
	if(ctx.VAR.getType() == Catalog2Parser.PLUS)
	    return exp1.add(exp2);
    	else
	    return exp1.subtract(exp2);
    }

    public CatalogType visitComparison(Catalog2Parser.ComparisonContext ctx) {
	return null;
    }

    public CatalogType visitMultDivMod(Catalog2Parser.MultDivModContext ctx) {
	
	CatalogType exp1 = memory.get(ctx.expression(0).getText());
	CatalogType exp2 = memory.get(ctx.expression(1).getText());

	if(ctx.VAR.getType() == Catalog2Parser.MULT)
	    return exp1.multiply(exp2);
	else
	    return exp1.divide(exp2);
    }

    public CatalogType visitStringDotId(Catalog2Parser.StringDotIdContext ctx) {
	return null;
    }

    public CatalogType visitParenExpression(Catalog2Parser.ParenExpressionContext ctx) {
	return visit(ctx.expression());
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
	return new CatalogType(ctx.getText());
    }

    public CatalogType visitTrueFalse(Catalog2Parser.TrueFalseContext ctx) {
	return null;
    }

    public CatalogType visitInsertVariable(Catalog2Parser.InsertVariableContext ctx) {
	return new CatalogType(ctx.ID().getText());
    }

    public CatalogType visitIdDotWord(Catalog2Parser.IdDotWordContext ctx) {
	return null;
    }


    

}
