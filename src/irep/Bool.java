package irep;

public class Bool extends Constant
{
	public boolean b;

	public Bool(boolean b)
	{
		this.b = b;
	}

	public String toString()
	{
		return Boolean.toString(b);
	}

}
