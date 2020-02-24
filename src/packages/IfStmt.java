package packages;

public class IfStmt extends Statement
{
	public Expression boolExpr;
	public Block ifBlock;
	public int line;
	public int offset;

	
	public IfStmt(Expression boolExpr, Block ifBlock)
	{
		this.boolExpr = boolExpr;
		this.ifBlock = ifBlock;
	}

	public CompType accept(TypeVisitor v) throws SemanticException
	{
		return v.visit(this);
	}
}
