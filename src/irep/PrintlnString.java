package irep;

public class PrintlnString extends Println
{
	public PrintlnString(Temp t)
	{
		super(t);
	}

	public String toString()
	{
		return "PRINTLNU "+t.toString();
	}
}
