package irep;
import codegen.JasminVisitor;

public class ArrRef extends Temp
{
	public Temp id, ex;

	public ArrRef(Temp id, Temp ex)
	{
		super(id.type, id.num);
		this.id = id;
		this.ex = ex;
	}

	public String toString()
	{
		return id.toString()+"["+ex.toString()+"]";
	}

}
