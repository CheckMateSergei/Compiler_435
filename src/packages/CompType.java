package packages;

public class CompType
{
	String type;
	public int line;
	public int offset;


	public CompType(String type)
	{
		this.type = type;
	}

	public String getType()
	{
		return this.type;
	}

	public Object accept(Visitor v)
	{
		return v.visit(this);
	}
}
