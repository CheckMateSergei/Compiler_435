package irep;

import java.util.ArrayList;

public class TempFactory
{
	final int MAXTEMPS = 65536;
	public ArrayList<Temp> temps;
	public int next;

	public TempFactory()
	{
		temps = new ArrayList<Temp>();
		next = 0;
	}

	public Temp get(Type t)
	{
		Temp temp = new Temp(t, next++);
		temps.add(temp);
		return temp;
	}

}
