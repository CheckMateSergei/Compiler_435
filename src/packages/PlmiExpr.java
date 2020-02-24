package packages;

public class PlmiExpr extends Expression
{
	public Expression le;
	public Expression ri;
	public char symbol;
	public int line;
	public int offset;


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

	public CompType accept(TypeVisitor v) throws SemanticException
	{
		return v.visit(this);
	}
}
