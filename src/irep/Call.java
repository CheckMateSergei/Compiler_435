package irep;
import java.util.ArrayList;

public class Call extends Inst
{
	public String name;
	public ArrayList<Type> params;

	public Call(String name)
	{
		this.name = name;
		params = new ArrayList<Type>();
	}

	public void addParam(Temp t)
	{
		params.add(t.type);
	}

	public String toString()
	{
		String s = "CALL "+name+"(";

		for(Type t : params)
		{
			s += t.toString();
		}

		return s + ")";
	}


}
