package irep;
import codegen.JasminVisitor;

public class PrintlnString extends Println
{
	public PrintlnString(Temp t)
	{
		super(t);
	}

	public String toString()
	{
		return "PRINTLNU "+t.toString();
	}

	public String accept(JasminVisitor j)
	{
		return j.visit(this);
	}

}
