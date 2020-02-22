package packages;

public class IntegerLiteral extends Literal
{
	public int value;
	public int line;
	public int offset;


	public IntegerLiteral(int value)
	{
		this.value = value;
	}

	public int getValue()
	{
		return this.value;
	}

	public CompType accept(TypeVisitor v) throws SemanticException
	{
		return v.visit(this);
	}
}
