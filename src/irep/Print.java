package irep;
import codegen.JasminVisitor;

public class Print extends Inst
{
	public Temp t;

	public Print(Temp t)
	{
		this.t = t;
	}

	public String toString()
	{
		return "PRINT"+t.type.type+" "+t.toString();
	}

	public String accept(JasminVisitor j)
	{
		return j.visit(this);
	}

}
