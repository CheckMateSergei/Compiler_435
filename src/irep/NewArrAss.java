package irep;
import codegen.JasminVisitor;

public class NewArrAss extends Assignment
{
	public int size;
	public Type type;
	public Temp temp;

	public NewArrAss(int size, Type type, Temp temp)
	{
		this.size = size;
		this.type = type;
		this.temp = temp;
	}

	public String toString()
	{
		return temp.toString()+" := NEWARRAY "+type.type+" "+Integer.toString(size);
	}

	public String accept(JasminVisitor j)
	{
		return j.visit(this);
	}

}
