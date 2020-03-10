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

	public CompType accept(TypeVisitor v) throws SemanticException
	{
		return v.visit(this);
	}
}
