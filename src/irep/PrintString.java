package irep;

public class PrintString extends Print
{
	public PrintString(Temp t)
	{
		super(t);
	}

	public String toString()
	{
		return "PRINTU "+t.toString();
	}
}
