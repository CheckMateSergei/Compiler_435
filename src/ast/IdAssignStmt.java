package ast;

import visitor.*;

public class IdAssignStmt extends Statement
{

	public Identifier id;
	public Expression e;
	public int line;
	public int offset;

	
	public IdAssignStmt(Identifier id, Expression e)
	{
		this.id = id;
		this.e = e;
	}

	public Identifier getId()
	{
		return this.id;
	}

	public Expression getExpr()
	{
		return this.e;
	}

	public <V> V accept(Visitor<V> v) throws SemanticException
	{
		return v.visit(this);
	}
}
