package packages;

public class IfStmt extends Statement
{
	Expression boolExpr;
	Block ifBlock;
	public int line;
	public int offset;

	
	public IfStmt(Expression boolExpr, Block ifBlock)
	{
		this.boolExpr = boolExpr;
		this.ifBlock = ifBlock;
	}

	public Object accept(Visitor v)
	{
		return v.visit(this);
	}
}
