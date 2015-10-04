/***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
***/


import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.InputStream;
 
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
        ParseTree tree = parser.file();  
        Visitor visitor = new Visitor();
        System.out.println(visitor.visit(tree));
    }
}