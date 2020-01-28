package packages;
import packages.*;

public class ArrayAssignStmt extends Statement
{
	Identifier id;
	Expression index;
	Expression value;
	
	public ArrayAssignStmt(Identifier id, Expression index, Expression value)
	{
		this.id = id;
		this.index = index;
		this.value = value;
	}

	public Object accept(Visitor v)
	{
		return v.visit(this);
	}
}