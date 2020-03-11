package irep;

public class Flot extends Constant
{
	public float value;

	public Flot(float value)
	{
		this.value = value;
	}

	public String toString()
	{
		return Float.toString(value);
	}
}
