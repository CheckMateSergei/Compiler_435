package irep;
import codegen.JasminVisitor;

public class IfJump extends Jump
{
	public Temp t;

	public IfJump(Label l, Temp t)
	{
		super(l);
		this.t = t;
	}

	public String toString()
	{
		return "IF "+t.toString()+" "+super.toString();
	}

	public String accept(JasminVisitor j)
	{
		return j.visit(this);
	}

}
