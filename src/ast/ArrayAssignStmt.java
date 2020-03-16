package ast;
import visitor.*;

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

	public <V> V accept(Visitor<V> v) throws SemanticException
	{
		return v.visit(this);
	}
}
