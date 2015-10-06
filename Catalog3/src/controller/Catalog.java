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
        String inputFile = "testing\test.ctl";
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
//        //show AST in GUI
//        JFrame frame = new JFrame("Antlr AST");
//        JPanel panel = new JPanel();
//        TreeViewer viewr = new TreeViewer(Arrays.asList(
//                parser.getRuleNames()),tree);
//        viewr.setScale(1.5);//scale a little
//        panel.add(viewr);
//        frame.add(panel);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(200,200);
//        frame.setVisible(true);
        visitor.visit(tree);

    }
}