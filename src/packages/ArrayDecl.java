package packages;
import packages.*;

public class ArrayDecl extends CompType
{
	int size;

	public ArrayDecl(String type, int size)
	{
		super(type);
		this.size = size;
	}

	public int getSize()
	{
		return this.size;
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
