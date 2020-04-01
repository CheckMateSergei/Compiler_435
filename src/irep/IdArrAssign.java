package irep;
import codegen.JasminVisitor;

public class IdArrAssign extends Assignment
{
	public Temp id, aId, index;

	public IdArrAssign(Temp id, Temp aId, Temp index)
	{
		this.id = id;
		this.aId = aId;
		this.index = index;
	}

	public String toString()
	{
		return id.toString()+" := "+aId.toString()+"["+index.toString()+"]";
	}

	public String accept(JasminVisitor j)
	{
		return j.visit(this);
	}

}
