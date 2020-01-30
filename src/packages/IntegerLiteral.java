package packages;

public class IntegerLiteral extends Literal
{
	int value;

	public IntegerLiteral(int value)
	{
		this.value = value;
	}

	public int getValue()
	{
		return this.value;
	}

	public Object accept(Visitor v)
	{
		return v.visit(this);
	}
}
