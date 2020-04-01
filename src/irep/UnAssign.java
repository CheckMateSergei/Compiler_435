package irep;
import codegen.JasminVisitor;

public class UnAssign extends Assignment
{
	public Temp res, op;
	public Operator o;

	public UnAssign(Temp res, Temp op, Operator o)
	{
		this.res = res;
		this.op = op;
		this.o = o;
	}

	public String toString()
	{
		return res.toString()+" := "+o.toString()+op.toString();
	}

	public String accept(JasminVisitor j)
	{
		return j.visit(this);
	}

}
