package irep;

public class Label
{
	public int num;

	public Label(int num)
	{
		this.num = num;
	}

	public String toString()
	{
		return "L"+Integer.toString(num);
	}
}