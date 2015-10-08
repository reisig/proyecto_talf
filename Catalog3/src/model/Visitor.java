package model;

import java.io.File;
import java.util.List;

import model.CatalogParser.AssignmentContext;
import model.CatalogParser.CopyContext;
import model.CatalogParser.CreateExprContext;
import model.CatalogParser.DeleteContext;
import model.CatalogParser.DotExprContext;
import model.CatalogParser.Foreach_statContext;
import model.CatalogParser.IdAtomContext;
import model.CatalogParser.If_statContext;
import model.CatalogParser.MoveContext;
import model.CatalogParser.PrintContext;

import org.antlr.v4.runtime.misc.NotNull;

import controller.CatalogFiles;
import controller.CatalogTable;
import controller.CatalogType;


public class Visitor extends CatalogBaseVisitor<CatalogType>{
    
    private CatalogTable memory = new CatalogTable();
    private CatalogFiles files = new CatalogFiles();
    
    public static final double SMALL_VALUE = 0.00000000001;


    public CatalogType visitAssignment(AssignmentContext ctx) {
	 String id = ctx.ID().getText();
	 CatalogType value = visit(ctx.expr());
	 return memory.put(id, value);
    }

    public CatalogType visitIf_stat(If_statContext ctx) {
        List<CatalogParser.Condition_blockContext> conditions =  ctx.condition_block();

        boolean evaluatedBlock = false;

        for(CatalogParser.Condition_blockContext condition : conditions) {

            CatalogType evaluated = this.visit(condition.expr());

            if(evaluated.getBoolValue()) {
                evaluatedBlock = true;
                // evaluate this block whose expr==true
                this.visit(condition.stat_block());
                break;
            }
        }

        if(!evaluatedBlock && ctx.stat_block() != null) {
            // evaluate the else-stat_block (if present == not null)
            this.visit(ctx.stat_block());
        }
        return CatalogType.VOID;
    }
    
    public CatalogType visitIdAtom(IdAtomContext ctx) {
	String id = ctx.getText();
	CatalogType value = memory.get(id);
        if(value == null) {
            throw new RuntimeException("No existe la variable: " + id);
        }
        return value == null ? CatalogType.VOID : value;
    }
    
    @Override
    public CatalogType visitNumberAtom(CatalogParser.NumberAtomContext ctx) {
        return new CatalogType(Double.valueOf(ctx.getText()));
    }

    @Override
    public CatalogType visitBooleanAtom(CatalogParser.BooleanAtomContext ctx) {
        return new CatalogType(Boolean.valueOf(ctx.getText()));
    }

    @Override
    public CatalogType visitNilAtom(CatalogParser.NilAtomContext ctx) {
        return new CatalogType(null);
    }

    // expr overrides
    @Override
    public CatalogType visitParExpr(CatalogParser.ParExprContext ctx) {
        return this.visit(ctx.expr());
    }

    @Override
    public CatalogType visitPowExpr(CatalogParser.PowExprContext ctx) {
        CatalogType left = this.visit(ctx.expr(0));
        CatalogType right = this.visit(ctx.expr(1));
        return new CatalogType(Math.pow(left.getDoubleValue(), right.getDoubleValue()));
    }

    @Override
    public CatalogType visitUnaryMinusExpr(CatalogParser.UnaryMinusExprContext ctx) {
        CatalogType value = this.visit(ctx.expr());
        return new CatalogType(-value.getDoubleValue());
    }

    @Override
    public CatalogType visitNotExpr(CatalogParser.NotExprContext ctx) {
        CatalogType value = this.visit(ctx.expr());
        return new CatalogType(!value.getBoolValue());
    }

    @Override
    public CatalogType visitMultiplicationExpr(@NotNull CatalogParser.MultiplicationExprContext ctx) {

        CatalogType left = this.visit(ctx.expr(0));
        CatalogType right = this.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case CatalogParser.MULT:
                return new CatalogType(left.getDoubleValue() * right.getDoubleValue());
            case CatalogParser.DIV:
                return new CatalogType(left.getDoubleValue() / right.getDoubleValue());
            case CatalogParser.MOD:
                return new CatalogType(left.getDoubleValue() % right.getDoubleValue());
            default:
                throw new RuntimeException("Operador desconocido: " + CatalogParser.tokenNames[ctx.op.getType()]);
        }
    }

    @Override
    public CatalogType visitAdditiveExpr(@NotNull CatalogParser.AdditiveExprContext ctx) {

        CatalogType left = this.visit(ctx.expr(0));
        CatalogType right = this.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case CatalogParser.PLUS:
                if( left.isDouble() && right.isDouble() ) 
                    return new CatalogType(left.getDoubleValue() + right.getDoubleValue());
                else 
                    return new CatalogType(left.getStrValue() + right.getStrValue());
            case CatalogParser.MINUS:
                return new CatalogType(left.getDoubleValue() - right.getDoubleValue());
            default:
                throw new RuntimeException("Operador desconocido: " + CatalogParser.tokenNames[ctx.op.getType()]);
        }
    }

    @Override
    public CatalogType visitRelationalExpr(@NotNull CatalogParser.RelationalExprContext ctx) {

        CatalogType left = this.visit(ctx.expr(0));
        CatalogType right = this.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case CatalogParser.LT:
                return new CatalogType(left.getDoubleValue() < right.getDoubleValue());
            case CatalogParser.LTE:
                return new CatalogType(left.getDoubleValue() <= right.getDoubleValue());
            case CatalogParser.GT:
                return new CatalogType(left.getDoubleValue() > right.getDoubleValue());
            case CatalogParser.GTE:
                return new CatalogType(left.getDoubleValue() >= right.getDoubleValue());
            default:
                throw new RuntimeException("Operador desconocido: " + CatalogParser.tokenNames[ctx.op.getType()]);
        }
    }

    @Override
    public CatalogType visitEqualityExpr(@NotNull CatalogParser.EqualityExprContext ctx) {

        CatalogType left = this.visit(ctx.expr(0));
        CatalogType right = this.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case CatalogParser.EQ:
                return left.isDouble() && right.isDouble() ?
                        new CatalogType(Math.abs(left.getDoubleValue() - right.getDoubleValue()) < SMALL_VALUE) :
                        new CatalogType(left.equals(right));
            case CatalogParser.NEQ:
                return left.isDouble() && right.isDouble() ?
                        new CatalogType(Math.abs(left.getDoubleValue() - right.getDoubleValue()) >= SMALL_VALUE) :
                        new CatalogType(left.notEquals(right));
            default:
                throw new RuntimeException("Operador desconocido: " + CatalogParser.tokenNames[ctx.op.getType()]);
        }
    }

    @Override
    public CatalogType visitAndExpr(CatalogParser.AndExprContext ctx) {
        CatalogType left = this.visit(ctx.expr(0));
        CatalogType right = this.visit(ctx.expr(1));
        return new CatalogType(left.getBoolValue() && right.getBoolValue());
    }

    @Override
    public CatalogType visitOrExpr(CatalogParser.OrExprContext ctx) {
        CatalogType left = this.visit(ctx.expr(0));
        CatalogType right = this.visit(ctx.expr(1));
        return new CatalogType(left.getBoolValue() || right.getBoolValue());
    }



    // while override
    @Override
    public CatalogType visitWhile_stat(CatalogParser.While_statContext ctx) {

        CatalogType value = visit(ctx.expr());

        while(value.getBoolValue()) {

            // evaluate the code block
            this.visit(ctx.stat_block());

            // evaluate the expression
            value = this.visit(ctx.expr());
        }

        return CatalogType.VOID;
    }
    
    @Override
    public CatalogType visitStringAtom(CatalogParser.StringAtomContext ctx) {
        String str = ctx.getText();
        // strip quotes
        str = str.substring(1, str.length() - 1).replace("\"\"", "\"");
        return new CatalogType(str);
    }

    public CatalogType visitPrint(PrintContext ctx) {
	CatalogType value = visit(ctx.expr());
	if(value != null){
		System.out.println(value);
	}
	return value == null ? CatalogType.VOID : value;
    }

    public CatalogType visitCopy(CopyContext ctx) {
	CatalogType from = new CatalogType(memory.get(ctx.expr(0).getText()));
	CatalogType to = new CatalogType (memory.get(ctx.expr(1).getText()));
	files.copyFile(from, to);
	return CatalogType.VOID;
    }

    public CatalogType visitMove(MoveContext ctx) {
	CatalogType from = new CatalogType(memory.get(ctx.expr(0).getText()));
	CatalogType to = new CatalogType (memory.get(ctx.expr(1).getText()));
	files.moveFile(from, to);
	return CatalogType.VOID;
    }

    public CatalogType visitDelete(DeleteContext ctx) {
	CatalogType path = new CatalogType(memory.get(ctx.expr().getText()));
	files.deleteFile(path);
	return CatalogType.VOID;
    }


    public CatalogType visitDotExpr(DotExprContext ctx) {
	String dot = ctx.expr(1).getText();	
	CatalogType ct = visit(ctx.expr(0));
	String metadata = ct.getProperty(dot).getStrValue();
	if (metadata.equals("0")){
	    metadata = "No Metadata";
	}
	return new CatalogType(metadata);
    }

    public CatalogType visitForeach_stat(Foreach_statContext ctx) {
	String id = ctx.expr(0).getText();
	if(!memory.containsKey(id)){
	    CatalogType dir = visit(ctx.expr(1));
	    dir = new CatalogType(dir.getStrValue(), true);
	    String flag = null;
	    if (dir.isFile()){
		flag = ctx.op.getText(); 
		List<CatalogType> list = files.getFiles(dir, flag);		    
		for (CatalogType ct : list) {
		    memory.put(id, ct);
		    visit(ctx.stat_block());
		    dir = visit(ctx.expr(1));
		    dir = new CatalogType(dir.getStrValue(), true);
		}
	    }else{
		throw new RuntimeException("La expresion en foreach debe ser un directorio valido.");
	    }	    
	}else{
	    throw new RuntimeException("La variable "+id+" ya se encuentra asignada.");
	}	
        return CatalogType.VOID;
    }

    public CatalogType visitCreateExpr(CreateExprContext ctx) {
	CatalogType name = visit(ctx.expr(0));
	CatalogType path = visit(ctx.expr(1));
    	String dirName = name.getStrValue().replace("/", "_").replace(":", "_").replace(" ", "_");
	File f = new File (path+"\\"+dirName);
	if(!f.exists()){
	    files.createFolder(new CatalogType(dirName), path);	
	}
	return new CatalogType(f.getAbsolutePath());
    }






}
