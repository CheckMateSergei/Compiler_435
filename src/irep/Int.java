package irep;
import codegen.JasminVisitor;

public class Int extends Constant
{
	public int val;

	public Int(int val)
	{
		this.val = val;
	}

	public String toString()
	{
		return Integer.toString(val);
	}

}
