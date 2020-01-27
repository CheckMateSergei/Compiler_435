package packages;
import packages.*;

public class CompType
{
	Type type;

	public CompType(Type type)
	{
		this.type = type;
	}

	public Object accept(Visitor v)
	{
		return v.visit(this);
	}
}
