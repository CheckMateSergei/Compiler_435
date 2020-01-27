import java.util.Vector;

public class Program
{
	Vector<Statement>	statements;
	
	public Program()
	{
		statements = new Vector<Statement>();
	}
	
	public void addStatement(Statement s)
	{	
		statements.add(s);
	}
	
	public Statement getStatement(int index)
	{
		return statements.elementAt(index);
	}
	
	public int getStatementCount()
	{
		return statements.size();
	}
	
	public Object accept(Visitor v)
	{
		return v.visit(this);
	}
}
