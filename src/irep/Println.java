package irep;

public class Println extends Inst
{
	public Temp t;

	public Println(Temp t)
	{
		this.t = t;
	}

	public String toString()
	{
		return "PRINTLN"+t.type.type+" "+t.toString();
	}
}
