package packages;

public class PrintStmt extends Statement
{
	Expression e;
	
	public PrintStmt(Expression e)
	{
		this.e = e;
	}

	public Object accept(Visitor v)
	{
		return v.visit(this);
	}
}
