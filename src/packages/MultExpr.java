package packages;
import packages.*;

public class MultExpr extends Expression
{
	Expression le;
	Expression ri;

	public MultExpr(Expression le, Expression ri)
	{
		this.le = le;
		this.ri = ri;
	}

	public Expression getLeftOperand()
	{
		return this.le;
	}

	public Expression getRightOperand()
	{
		return this.ri;
	}

	public Object accept(Visitor v)
	{
		return v.visit(this);
	}
}
