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

	public CompType accept(TypeVisitor v) throws SemanticException
	{
		return v.visit(this);
	}
}
