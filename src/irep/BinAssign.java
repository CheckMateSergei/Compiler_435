package irep;

public class BinAssign extends Assignment
{
	public Temp res, op1, op2;
	public Operator o;

	public BinAssign(Temp res, Temp op1, Temp op2, Operator o)
	{
		this.res = res;
		this.op1 = op1;
		this.op2 = op2;
		this.o = o;
	}

	public String toString()
	{
		return res.toString()+" := "+op1.toString()+o.toString()+op2.toString();
	}
}
