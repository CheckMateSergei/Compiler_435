package irep;

public class RetnType extends Type
{

	public RetnType(Type t)
	{
		this.type = t.toString();
	}

	public String toString()
	{
		return this.type;
	}
}
