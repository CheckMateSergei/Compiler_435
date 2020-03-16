package ast;

import visitor.*;

public class ReturnStmt extends Statement
{
	public Expression e;
	public int line;
	public int offset;

	
	public ReturnStmt()
	{
		this.e = null;
	}

	public void setExpr(Expression e)
	{
		this.e = e;
	}

	public <V> V accept(Visitor<V> v) throws SemanticException
	{
		return v.visit(this);
	}
}
