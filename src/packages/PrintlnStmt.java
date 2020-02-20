package packages;

public class PrintlnStmt extends Statement
{
	Expression e;
	public int line;
	public int offset;

	
	public PrintlnStmt(Expression e)
	{
		this.e = e;
	}

	public Object accept(Visitor v)
	{
		return v.visit(this);
	}
}
