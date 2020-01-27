import org.antlr.runtime.*;
import java.io.*;

public class Calculator 
{
	public static void main (String[] args) throws Exception
	{
		ANTLRInputStream input;

		// If you provide a filename on the command line
		// we'll use that as input, otherwise use
		// stdin
		
		if (args.length == 0 )
		{
			input = new ANTLRInputStream(System.in);
		}
		else
		{
			input = new ANTLRInputStream(new FileInputStream(args[0]));
		}

		simpleLexer lexer = new simpleLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		simpleParser parser = new simpleParser(tokens);

		// program is the starting production in this grammer
		// so we invoke that method on the parser object
		Program p = parser.program();
		
		PrintVisitor pv = new PrintVisitor();
		p.accept(pv);
		System.out.println("The result is:");
		
		EvalVisitor ev = new EvalVisitor();
		p.accept(ev);
		
	}
}

		
