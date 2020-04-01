package irep;
import java.util.ArrayList;
import codegen.JasminVisitor;

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

	public String accept(JasminVisitor j)
	{
		return j.visit(this);
	}


}
