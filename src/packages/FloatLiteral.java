package packages;

public class FloatLiteral extends Literal
{
	float value;
	public int line;
	public	int offset;


	public FloatLiteral(float value)
	{
		this.value = value;
	}

	public float getValue()
	{
		return this.value;
	}

	public CompType accept(TypeVisitor v) throws SemanticException 
	{
		return v.visit(this);
	}
}
