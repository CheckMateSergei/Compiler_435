package packages;

public class ArrayRef extends Expression
{
	Identifier id;
	Expression index;
	public int line;
	public int offset;



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
