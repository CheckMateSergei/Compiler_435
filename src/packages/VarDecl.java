package packages;

public class VarDecl
{
	public CompType type;
	public Identifier id;
	public int line;
	public int offset;


	public VarDecl(CompType type, Identifier id)
	{
		this.type = type;
		this.id = id;
	}

	public CompType accept(TypeVisitor v) throws SemanticException
	{
		return v.visit(this);
	}
}
