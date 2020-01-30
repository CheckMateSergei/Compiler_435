package packages;

public class ReturnStmt extends Statement
{
	Expression e;
	
	public ReturnStmt()
	{
		this.e = null;
	}

	public void setExpr(Expression e)
	{
		this.e = e;
	}

	public Object accept(Visitor v)
	{
		return v.visit(this);
	}
}
