package irep;
import codegen.JasminVisitor;

public class LabelInst extends Label
{
	public LabelInst(int num)
	{
		super(num);
	}

	public String toString()
	{
		return super.toString()+":";
	}

	public String accept(JasminVisitor j)
	{
		return j.visit(this);
	}

}
