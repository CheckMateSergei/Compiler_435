public class OutputStatement extends Statement
{
	Identifier i;
	
	public OutputStatement(Identifier i)
	{
		this.i = i;
	}
	
	public Object accept(Visitor v)
	{
		return v.visit(this);
	}
}
