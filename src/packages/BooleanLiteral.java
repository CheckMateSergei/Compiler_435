package packages;

public class BooleanLiteral extends Literal
{
	boolean value;
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

	public Object accept(Visitor v)
	{
		return v.visit(this);
	}
}
