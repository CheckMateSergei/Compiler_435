package packages;

public class ParenExpr extends Expression
{
	public Expression e;
	public int line;
	public int offset;


	public ParenExpr(Expression e)
	{
		this.e = e;
	}

	public CompType accept(TypeVisitor v) throws SemanticException
	{
		return v.visit(this);
	}
}
