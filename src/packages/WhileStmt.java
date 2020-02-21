package packages;

public class WhileStmt extends Statement
{
	Expression boolExpr;
	Block b;
	public int line;
	public int offset;

	
	public WhileStmt(Expression boolExpr, Block b)
	{
		this.boolExpr = boolExpr;
		this.b = b;
	}

	public CompType accept(TypeVisitor v) throws SemanticException
	{
		return v.visit(this);
	}
}
