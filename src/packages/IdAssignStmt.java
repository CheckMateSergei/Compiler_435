package packages;
import packages.*;

public class IdAssignStmt extends Statement
{

	Identifier id;
	Expression e;
	
	public IdAssignStmt(Identifier id, Expression e)
	{
		this.id = id;
		this.e = e;
	}

	public Object accept(Visitor v)
	{
		return v.visit(this);
	}
}
