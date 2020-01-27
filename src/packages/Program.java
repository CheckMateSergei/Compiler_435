package packages;
import java.util.Vector;

// program class holds all statements and variable declarations
public class Program
{
	Vector<Function> functions;
	
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

	public Object accept(Visitor v)
	{
		return v.visit(this);
	}
}
