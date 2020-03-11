package irep;
import java.util.ArrayList;

public class Function
{
	public String name;
	public String type;
	public ArrayList<Temp> temps;
	public ArrayList<Inst> insts;

	public Function(String name, String type)
	{
		this.name = name;
		this.type = type;
		temps = new ArrayList<Temp>();
		insts = new ArrayList<Inst>();
	}

	public void addTemp(Temp t)
	{
		temps.add(t);
		return;
	}

	public void addInst(Inst i)
	{
		insts.add(i);
		return;
	}

	public String toString()
	{
		String s;
		s = "FUNC ";

		return s;
	}

}
