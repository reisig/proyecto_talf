package controller;


import model.CatalogLexer;
import model.CatalogParser;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import model.Visitor;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JPanel;
 
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