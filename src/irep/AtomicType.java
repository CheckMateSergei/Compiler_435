package irep;
import codegen.JasminVisitor;

public class AtomicType extends Type
{
	public AtomicType(String type)
	{
		this.type = type;
	}

	public String toString()
	{
		return this.type;
	}


}
