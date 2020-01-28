package packages;
import packages.*;

public class VarDecl
{
	CompType type;
	Identifier id;

	public VarDecl(CompType type, Identifier id)
	{
		this.type = type;
		this.id = id;
	}

	public Object accept(Visitor v)
	{
		return v.visit(this);
	}
}
