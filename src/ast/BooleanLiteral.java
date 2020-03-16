package ast;
import visitor.*;

public class BooleanLiteral extends Literal
{
	public boolean value;
	public int line;
	public int offset;


	public BooleanLiteral(boolean value)
	{
		this.value = value;
	}

	public boolean getValue()
	{
		return this.value;
	}

	public <V> V accept(Visitor<V> v) throws SemanticException
	{
		return v.visit(this);
	}
}
