package packages;

public class WhileStmt extends Statement
{
	public Expression e;
	public Block b;
	public int line;
	public int offset;

	
	public WhileStmt(Expression boolExpr, Block b)
	{
		this.e = boolExpr;
		this.b = b;
	}

	public CompType accept(TypeVisitor v) throws SemanticException
	{
		return v.visit(this);
	}
}
