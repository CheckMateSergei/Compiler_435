public class AssignmentStatement extends Statement
{
	Identifier	i;
	Expression	e;
	
	public AssignmentStatement(Identifier i, Expression e)
	{
		this.i = i;
		this.e = e;
	}
	
	public Object accept (Visitor v)
	{
		return v.visit(this);
	}
}
