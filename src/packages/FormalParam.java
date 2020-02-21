package packages;

public class FormalParam
{
	public CompType type;
	public Identifier id;
	public int line;
	public int offset;


	public FormalParam(CompType type, Identifier id)
	{
		this.type = type;
		this.id = id;
	}

	public CompType accept(TypeVisitor v) throws SemanticException
	{
		return v.visit(this);
	}
}
