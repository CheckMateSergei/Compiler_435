package packages;

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

	public CompType accept(TypeVisitor v) throws SemanticException
	{
		return v.visit(this);
	}
}
