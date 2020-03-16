package ast;
import visitor.*;
import java.util.Vector;

// program class holds all statements and variable declarations
public class Program
{
	public Vector<Function> functions;
	public String name;
	
	public Program()
	{
		functions = new Vector<Function>();
	}
	
	public void addFunction(Function f)
	{	
		functions.add(f);
	}

	public Function getFunction(int index)
	{
		return functions.elementAt(index);
	}
	
	public int getFunctionCount()
	{
		return functions.size();
	}

	public <V> V accept(Visitor<V> v) throws SemanticException
	{
		return v.visit(this);
	}
}
