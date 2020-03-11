package irep;
import java.util.ArrayList;

public class MethType extends Type
{
	public ArrayList<Type> params;
	public RetnType ret;

	public MethType(RetnType ret)
	{
		this.params = new ArrayList<Type>();
		this.ret = ret;
	}

	public void add(Type t)
	{
		params.add(t);
		return;
	}

	public String toString()
	{
		String s;

		for(Type t : params)
		{
			s += t.type;
		}

		return "("+s+")"+ret.toString();
	}
}
