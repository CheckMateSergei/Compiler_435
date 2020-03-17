package irep;

public class Print extends Inst
{
	public Temp t;

	public Print(Temp t)
	{
		this.t = t;
	}

	public String toString()
	{
		return "PRINT"+t.type.type+" "+t.toString();
	}
}
