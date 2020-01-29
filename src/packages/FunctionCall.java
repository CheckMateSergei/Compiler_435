package packages;
import packages.*;
import java.util.Vector;

public class FunctionCall extends Expression
{
	Vector<Expression> exprList;
	Identifier id;

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

	public Object accept(Visitor v)
	{
		return v.visit(this);
	}
}
