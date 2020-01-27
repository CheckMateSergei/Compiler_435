package packages;
import packages.*;

public class Type
{
	String type;

	public Type(String type)
	{
		this.type = type;
	}

	public Object accept(Visitor v)
	{
		return v.visit(this);
	}
}
