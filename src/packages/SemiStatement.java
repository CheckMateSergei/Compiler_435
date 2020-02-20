package packages;

public class SemiStatement extends Statement
{
	final char c = ';';
	public int line;
	public int offset;

	
	public SemiStatement(){}

	public Object accept(Visitor v)
	{
		return v.visit(this);
	}
}
