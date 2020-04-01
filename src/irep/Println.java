package irep;
import codegen.JasminVisitor;

public class Println extends Inst
{
	public Temp t;

	public Println(Temp t)
	{
		this.t = t;
	}

	public String toString()
	{
		return "PRINTLN"+t.type.type+" "+t.toString();
	}

	public String accept(JasminVisitor j)
	{
		return j.visit(this);
	}

}
