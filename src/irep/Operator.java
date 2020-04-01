package irep;
import codegen.JasminVisitor;

public class Operator
{
	public String op;
	public Type type;

	public Operator(String op, Type type)
	{
		this.op = op;
		this.type = type;
	}

	public String toString()
	{
		return type.toString()+op;
	}

}
