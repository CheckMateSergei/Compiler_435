package ast;
import visitor.*;

public class CompType
{
	public String type;
	public int line;
	public int offset;


	public CompType(String type)
	{
		this.type = type;
	}

	public String getType()
	{
		return this.type;
	}

	public <V> V accept(Visitor<V> v) throws SemanticException
	{
		return v.visit(this);
	}
}
