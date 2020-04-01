package irep;
import codegen.JasminVisitor;

public class OpReturn extends Return
{
	public Temp t;

	public OpReturn(Temp t)
	{
		this.t = t;
	}

	public String toString()
	{
		return super.toString()+" "+t.toString();
	}

	public String accept(JasminVisitor j)
	{
		return j.visit(this);
	}

}
