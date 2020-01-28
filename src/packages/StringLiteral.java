package packages;
import packages.*;

public class StringLiteral extends Literal
{
	String value;

	public StringLiteral(String value)
	{
		this.value = value;
	}

	public String getValue()
	{
		return this.value;
	}

	public Object accept(Visitor v)
	{
		return v.visit(this);
	}
}
