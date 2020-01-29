package packages;
import packages.*;

public class PlmiExpr extends Expression
{
	Expression le;
	Expression ri;
	char symbol;

	public PlmiExpr(Expression le, Expression ri, char symbol)
	{
		this.le = le;
		this.ri = ri;
		this.symbol = symbol;
	}

	public Expression getLeftOperand()
	{
		return this.le;
	}

	public Expression getRightOperand()
	{
		return this.ri;
	}

	public char getOperator()
	{
		return this.symbol;
	}

	public Object accept(Visitor v)
	{
		return v.visit(this);
	}
}
