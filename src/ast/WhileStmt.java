package ast;

import visitor.*;

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

	public <V> V accept(Visitor<V> v) throws SemanticException
	{
		return v.visit(this);
	}
}
