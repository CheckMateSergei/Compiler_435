package packages;

public class Identifier extends Expression
{
	String id;

	public Identifier(String id)
	{
		this.id = id;
	}

	public Object accept(Visitor v)
	{
		return v.visit(this);
	}
}
