package packages;

public class ArrayDecl extends CompType
{
	public int size;
	public int line;
	public int offset;

	public ArrayDecl(String type, int size)
	{
		super(type);
		this.size = size;
	}

	public int getSize()
	{
		return this.size;
	}

	public String getType()
	{
		return this.type;
	}

	public CompType accept(TypeVisitor v) throws SemanticException
	{
		return v.visit(this);
	}
}
