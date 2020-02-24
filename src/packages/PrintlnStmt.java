package packages;

public class PrintlnStmt extends Statement
{
	public Expression e;
	public int line;
	public int offset;

	
	public PrintlnStmt(Expression e)
	{
		this.e = e;
	}

	public CompType accept(TypeVisitor v) throws SemanticException
	{
		return v.visit(this);
	}
}
