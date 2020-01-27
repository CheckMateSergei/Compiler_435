public class IntegerLiteral extends Expression
{
	Integer	value;
	public IntegerLiteral (Integer value)
	{
		this.value = value;
	}
	
	public Object accept(Visitor v)
	{
		return v.visit(this);
	}
}
