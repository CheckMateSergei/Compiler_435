public class Identifier
{
	String	name;
	
	public Identifier (String name)
	{
		this.name = name;
	}
	
	public Object accept(Visitor v)
	{
		return v.visit(this);
	}
}
