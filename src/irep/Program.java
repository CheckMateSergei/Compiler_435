package irep;
import java.util.ArrayList;

public class Program
{
	public String classname;
	public ArrayList<Function> funcList;

	public Program(String classname)
	{
		this.classname = classname;
		funcList = new ArrayList<Function>();
	}

	public void add(Function f)
	{
		funcList.add(f);
	}

	public String toString()
	{
		String s = "PROG " + classname + "\n";

		for(Function fu : funcList)
		{
			s = s + fu.toString(); 
		}

		return s+"}\n";
	}

}
