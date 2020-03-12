package irep;

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
}
