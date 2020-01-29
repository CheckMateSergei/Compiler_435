package packages;
import packages.*;

public class ArrayRef extends Expression
{
	Identifier id;
	Expression index;

	public ArrayRef(Identifier id, Expression index)
	{
		this.id = id;
		this.index = index;
	}

	public Object accept(Visitor v)
	{
		return v.visit(this);
	}
}
