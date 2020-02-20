package packages;

public class ExColonStmt extends Statement
{
	Expression e;
	public int line;
	public int offset;

	
	public ExColonStmt(Expression e)
	{
		this.e = e;
	}

	public Object accept(Visitor v)
	{
		return v.visit(this);
	}
}
