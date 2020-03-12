package irep;

import java.util.ArrayList;

public class IdCall extends Call
{
	public Temp id;

	public IdCall(Temp id, String name)
	{
		super(name);
		this.id = id;
	}

	public String toString()
	{
		String s = id.toString()+" := ";
		s += super.toString();
		return s;
	}
}
