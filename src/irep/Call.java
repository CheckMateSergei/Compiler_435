package irep;
import java.util.ArrayList;

public class Call extends Inst
{
	public String name;
	public ArrayList<Temp> params;

	public Call(String name)
	{
		this.name = name;
		params = new ArrayList<Temp>();
	}

	public void addParam(Temp t)
	{
		params.add(t);
	}

	public String toString()
	{
		String s = "CALL "+name+"(";

		for(Temp t : params)
		{
			s += t.toString();
		}

		return s + ")";
	}


}
