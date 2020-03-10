package ast;

import visitor.*;

public class LessExpr extends Expression
{
	public Expression le;
	public Expression ri;
	public int line;
	public int offset;


	public LessExpr(Expression le, Expression ri)
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

	public CompType accept(TypeVisitor v) throws SemanticException
	{
		return v.visit(this);
	}
}
