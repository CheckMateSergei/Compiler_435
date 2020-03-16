package ast;

import visitor.*;

public class MultExpr extends Expression
{
	public Expression le;
	public Expression ri;
	public int line;
	public int offset;


	public MultExpr(Expression le, Expression ri)
	{
		this.le = le;
		this.ri = ri;
	}

	public Expression getLeftOperand()
	{
		return this.le;
	}

	public Expression getRightOperand()
	{
		return this.ri;
	}

	public <V> V accept(Visitor<V> v) throws SemanticException
	{
		return v.visit(this);
	}
}
