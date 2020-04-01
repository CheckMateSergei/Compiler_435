package irep;
import codegen.JasminVisitor;

public class Jump extends Inst
{
	public Label l;

	public Jump(Label l)
	{
		this.l = l;
	}

	public String toString()
	{
		return "GOTO L"+l.num;
	}

	public String accept(JasminVisitor j)
	{
		return j.visit(this);
	}


}
