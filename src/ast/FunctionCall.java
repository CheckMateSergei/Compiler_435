package ast;

import visitor.*;
import java.util.ArrayList;

public class FunctionCall extends Expression
{
	public ArrayList<Expression> exprList;
	public Identifier id;
	public int line;
	public int offset;


	public FunctionCall()
	{
		this.exprList = new ArrayList<Expression>();
	}

	public void setId(Identifier id)
	{
		this.id = id;
	}

	public Expression getExpr(int index)
	{
		return exprList.get(index);
	}

	public void addExpr(Expression e)
	{
		this.exprList.add(e);
	}

	public <V> V accept(Visitor<V> v) throws SemanticException
	{
		return v.visit(this);
	}
}
