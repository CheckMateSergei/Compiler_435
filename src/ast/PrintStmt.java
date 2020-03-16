package ast;

import visitor.*;

public class PrintStmt extends Statement
{
	public Expression e;
	public int line;
	public int offset;

	
	public PrintStmt(Expression e)
	{
		this.e = e;
	}

	public <V> V accept(Visitor<V> v) throws SemanticException
	{
		return v.visit(this);
	}
}
