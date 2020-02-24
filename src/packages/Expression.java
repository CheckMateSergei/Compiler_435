package packages;

public abstract class Expression
{
	public CompType type;
	public int line;
	public int offset;
	public abstract CompType accept(TypeVisitor v) throws SemanticException;
}
