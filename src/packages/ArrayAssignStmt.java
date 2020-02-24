package packages;

public class ArrayAssignStmt extends Statement
{
	public Identifier id;
	public Expression index;
	public Expression value;
	public int line;
	public int offset;
	
	public ArrayAssignStmt(Identifier id, Expression index, Expression value)
	{
		this.id = id;
		this.index = index;
		this.value = value;
	}

	public CompType accept(TypeVisitor v) throws SemanticException
	{
		return v.visit(this);
	}
}
