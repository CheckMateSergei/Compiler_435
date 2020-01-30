package packages;

public class FloatLiteral extends Literal
{
	float value;

	public FloatLiteral(float value)
	{
		this.value = value;
	}

	public float getValue()
	{
		return this.value;
	}

	public Object accept(Visitor v)
	{
		return v.visit(this);
	}
}
