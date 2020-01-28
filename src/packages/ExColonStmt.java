package packages;
import packages.*;

public class ExColonStmt extends Statement
{
	Expression e;
	
	public ExColonStmt(Expression e)
	{
		this.e = e;
	}

	public Object accept(Visitor v)
	{
		return v.visit(this);
	}
}
