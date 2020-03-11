package irep;

public class RefType extends Type
{
	public RefType(String type)
	{
		this.type = type;
	}

	public String toString()
	{
		if(type.equals("U"))
		{
			return "U";
		}
		return "A"+type;
	}

}
