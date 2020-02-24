package packages;

public class ArrayRef extends Expression
{
	public Identifier id;
	public Expression index;
	public int line;
	public int offset;



	public ArrayRef(Identifier id, Expression index)
	{
		this.id = id;
		this.index = index;
	}

	public CompType accept(TypeVisitor v) throws SemanticException
	{
		return v.visit(this);
	}
}
