package irep;

public class LabelInst extends Label
{
	public LabelInst(int num)
	{
		super(num);
	}

	public String toString()
	{
		return super.toString()+":";
	}
}
