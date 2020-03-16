package ast;

import visitor.*;

public class ParenExpr extends Expression
{
	public Expression e;
	public int line;
	public int offset;


	public ParenExpr(Expression e)
	{
		this.e = e;
	}

	public <V> V accept(Visitor<V> v) throws SemanticException
	{
		return v.visit(this);
	}
}
