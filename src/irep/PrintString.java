package irep;
import codegen.JasminVisitor;

public class PrintString extends Print
{
	public PrintString(Temp t)
	{
		super(t);
	}

	public String toString()
	{
		return "PRINTU "+t.toString();
	}

	public String accept(JasminVisitor j)
	{
		return j.visit(this);
	}

}
