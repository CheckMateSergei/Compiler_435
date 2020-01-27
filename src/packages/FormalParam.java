package packages;
import packages.*;

public class FormalParam
{
	CompType type;
	Identifier id;

	public FormalParam(CompType type, Identifier id)
	{
		this.type = type;
		this.id = id;
	}

	public Object accept(Visitor v)
	{
		return v.visit(this);
	}
}
