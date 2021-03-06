import java.io.*;

import antlr.*;
import antlr.debug.misc.*;

public class Catalog {
	
	private static boolean _DEBUG = false;

	public static void main(String[] args) {

		String filename = "test.ctl";		
		try
		{
			FileInputStream file = new FileInputStream(filename);
			DataInputStream input = new DataInputStream(file);
			
			CatalogLexer lexer = new CatalogLexer(input);
			CatalogParser parser = new CatalogParser(lexer);
			parser.file();

			CommonAST ASTTree = (CommonAST)parser.getAST();
			if (_DEBUG) {
				System.out.println(ASTTree.toStringList());
				ASTFrame frame = new ASTFrame("AST Tree", ASTTree);
				frame.setVisible(true);
			}
			CatalogWalker walker = new CatalogWalker();
			walker.file(ASTTree); // execute the program
		}
		catch (FileNotFoundException e) {
			System.err.println(String.format("File %s was not found", filename));
			if (_DEBUG) { e.printStackTrace(); }
		}
		catch (TokenStreamException e) {
			System.err.println(e);
			if (_DEBUG) { e.printStackTrace(); }
		}
		catch (RecognitionException e) {
			System.err.println(e);
			if (_DEBUG) { e.printStackTrace(); }
		}
	}
}
