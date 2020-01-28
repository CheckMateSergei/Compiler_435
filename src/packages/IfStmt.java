package packages;
import packages.*;

public class IfStmt extends Statement
{
	Expression boolExpr;
	Block ifBlock;
	
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
