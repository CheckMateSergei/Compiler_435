package packages;

public class PrintStmt extends Statement
{
	Expression e;
	public int line;
	public int offset;

	
	public PrintStmt(Expression e)
	{
		this.e = e;
	}

	public CompType accept(TypeVisitor v) throws SemanticException
	{
		return v.visit(this);
	}
}
