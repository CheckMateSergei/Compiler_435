package packages;
import packages.*;

public class ParenExpr extends Expression
{
	Expression e;

	public ParenExpr(Expression e)
	{
		this.e = e;
	}

	public Object accept(Visitor v)
	{
		return v.visit(this);
	}
}
