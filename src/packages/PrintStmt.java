package packages;

public class PrintStmt extends Statement
{
	Expression e;
	public int line;
	public int offset;

	
	public PrintStmt(Expression e)
	{
		this.e = e;
	}

	public Object accept(Visitor v)
	{
		return v.visit(this);
	}
}
