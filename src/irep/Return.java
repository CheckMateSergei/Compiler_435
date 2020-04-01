package irep;
import codegen.JasminVisitor;

public class Return extends Inst
{

	public Return()
	{
	}

	public String toString()
	{
		return "RETURN";
	}

	public String accept(JasminVisitor j)
	{
		return j.visit(this);
	}

}
