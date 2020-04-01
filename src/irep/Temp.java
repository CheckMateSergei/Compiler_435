package irep;
import codegen.JasminVisitor;

public class Temp
{
	public Type type;
	public int num;

	public Temp(Type type, int num)
	{
		this.type = type;
		this.num = num;
	}

	public String toString()
	{
		return "T"+num;
	}

	public String accept(JasminVisitor j)
	{
		return j.visit(this);
	}
}
