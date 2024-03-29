/*
 * Compiler.java
 *
 * A starting place for the unnamed language compiler for CSC 435/535
 *
 */

import org.antlr.runtime.*;
import java.io.*;
import ast.*;
import visitor.*;
import codegen.JasminVisitor;

public class Compiler {
	public static void main (String[] args) throws Exception {
		ANTLRInputStream input;
		String filename;

		if (args.length == 0 ) {
			System.out.println("Usage: Compiler filename.ul");
			return;
		}
		else {
			input = new ANTLRInputStream(new FileInputStream(args[0]));
			filename = args[0].substring(args[0].lastIndexOf('/')+1, args[0].lastIndexOf('.'));
		}

		// The name of the grammar here is "ulNoActions",
		// so ANTLR generates ulNoActionsLexer and ulNoActionsParser
		ulNoActionsLexer lexer = new ulNoActionsLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		ulNoActionsParser parser = new ulNoActionsParser(tokens);

		try {
			Program p = parser.program();
			p.name = filename;
		//	PrettyPrintVisitor prettyBoy = new PrettyPrintVisitor();
			// prettyBoy.visit(p);
			
			SemanticVisitor sv = new SemanticVisitor();
			sv.visit(p);

			IrepVisitor ir = new IrepVisitor();
			ir.visit(p);

			JasminVisitor jas = new JasminVisitor();
			jas.visit(ir.output_program);



		}
		catch (RecognitionException e )	{
			// A lexical or parsing error occured.
			// ANTLR will have already printed information on the
			// console due to code added to the grammar.  So there is
			// nothing to do here.
		}
		catch (Exception e) {
			//System.out.println(e);
			e.printStackTrace();
		}
	}
}
