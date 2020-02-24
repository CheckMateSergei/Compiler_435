package packages;

public class ExColonStmt extends Statement
{
	public Expression e;
	public int line;
	public int offset;

	
	public ExColonStmt(Expression e)
	{
		this.e = e;
	}

	public CompType accept(TypeVisitor v) throws SemanticException
	{
		return v.visit(this);
	}
}
