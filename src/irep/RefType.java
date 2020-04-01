package irep;
import codegen.JasminVisitor;

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
