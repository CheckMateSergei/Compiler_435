package irep;
import codegen.JasminVisitor;

public class IRConst extends Inst
{
	public Constant c;
	public Temp temp;

	public IRConst(Temp temp, Constant c)
	{
		this.temp = temp;
		this.c = c;
	}

	public String toString()
	{
		return "T"+temp.num+" := "+c.toString();
	}

	public String accept(JasminVisitor j)
	{
		return j.visit(this);
	}

}
