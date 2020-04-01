package irep;
import codegen.JasminVisitor;

public class Cha extends Constant
{
	public char c;

	public Cha(char c)
	{
		this.c = c;
	}

	public String toString()
	{
		return "'"+Character.toString(c)+"'";
	}
}
