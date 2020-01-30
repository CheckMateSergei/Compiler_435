package packages;

public class SemiStatement extends Statement
{
	final char c = ';';
	
	public SemiStatement(){}

	public Object accept(Visitor v)
	{
		return v.visit(this);
	}
}
