package packages;

public class CharLiteral extends Literal
{
	char value;
	public int line;
	public int offset;


	public CharLiteral(char value)
	{
		this.value = value;
	}

	public char getValue()
	{
		return this.value;
	}

	public Object accept(Visitor v)
	{
		return v.visit(this);
	}
}
