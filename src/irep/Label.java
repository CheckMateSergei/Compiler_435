package irep;
import codegen.JasminVisitor;

public class Label extends Inst
{
	public int num;

	public Label(int num)
	{
		this.num = num;
	}

	public String toString()
	{
		return "L"+Integer.toString(num)+":";
	}

	public String accept(JasminVisitor j)
	{
		return j.visit(this);
	}

}
