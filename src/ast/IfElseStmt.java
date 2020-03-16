package ast;

import visitor.*;

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

	public <V> V accept(Visitor<V> v) throws SemanticException
	{
		return v.visit(this);
	}
}
