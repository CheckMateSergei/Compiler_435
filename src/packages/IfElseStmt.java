package packages;

public class IfElseStmt extends Statement
{
	Expression boolExpr;
	Block ifBlock;
	Block elseBlock;
	
	public IfElseStmt(Expression boolExpr, Block ifBlock, Block elseBlock)
	{
		this.boolExpr = boolExpr;
		this.ifBlock = ifBlock;
		this.elseBlock = elseBlock;
	}

	public Object accept(Visitor v)
	{
		return v.visit(this);
	}
}
