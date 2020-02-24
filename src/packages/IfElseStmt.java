package packages;

public class IfElseStmt extends Statement
{
	public Expression boolExpr;
	public Block ifBlock;
	public Block elseBlock;
	public int line;
	public int offset;

	
	public IfElseStmt(Expression boolExpr, Block ifBlock, Block elseBlock)
	{
		this.boolExpr = boolExpr;
		this.ifBlock = ifBlock;
		this.elseBlock = elseBlock;
	}

	public CompType accept(TypeVisitor v) throws SemanticException
	{
		return v.visit(this);
	}
}
