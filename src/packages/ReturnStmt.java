package packages;
import packages.*;

public class ReturnStmt extends Statement
{
	Expression e;
	
	public ReturnStmt(){}

	public void setExpr(Expression e)
	{
		this.e = e;
	}

	public Object accept(Visitor v)
	{
		return v.visit(this);
	}
}
