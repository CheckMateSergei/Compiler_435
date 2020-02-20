package packages;

public class ParenExpr extends Expression
{
	Expression e;
	public int line;
	public int offset;


	public ParenExpr(Expression e)
	{
		this.e = e;
	}

	public Object accept(Visitor v)
	{
		return v.visit(this);
	}
}
