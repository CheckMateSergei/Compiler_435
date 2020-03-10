package ast;

import visitor.*;
import java.util.Vector;

public class FunctionCall extends Expression
{
	public Vector<Expression> exprList;
	public Identifier id;
	public int line;
	public int offset;


	public FunctionCall()
	{
		this.exprList = new Vector<Expression>();
	}

	public void setId(Identifier id)
	{
		this.id = id;
	}

	public Expression getExpr(int index)
	{
		return exprList.elementAt(index);
	}

	public void addExpr(Expression e)
	{
		this.exprList.add(e);
	}

	public CompType accept(TypeVisitor v) throws SemanticException
	{
		return v.visit(this);
	}
}
