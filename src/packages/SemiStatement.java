package packages;

public class SemiStatement extends Statement
{
	final char c = ';';
	public int line;
	public int offset;

	
	public SemiStatement(){}

	public CompType accept(TypeVisitor v) throws SemanticException
	{
		return v.visit(this);
	}
}
