package packages;
import packages.*;

public class CompType
{
	String type;

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
