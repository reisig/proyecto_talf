package controller;


import java.io.FileInputStream;
import java.io.InputStream;

import model.CatalogLexer;
import model.CatalogParser;
import model.Visitor;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
 
public class Catalog {
    public static void main(String[] args) throws Exception {       
        String inputFile = "test.ctl";
        if ( args.length>0 )
            inputFile = args[0];
        InputStream is = System.in;
        if ( inputFile!=null ) is = new FileInputStream(inputFile);
        ANTLRInputStream input = new ANTLRInputStream(is);
        CatalogLexer lexer = new CatalogLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CatalogParser parser = new CatalogParser(tokens);
        ParseTree tree = parser.parse();  
        Visitor visitor = new Visitor();
        visitor.visit(tree);

    }
}