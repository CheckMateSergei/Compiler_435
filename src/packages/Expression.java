package packages;

public abstract class Expression
{
	public abstract CompType accept(TypeVisitor v) throws SemanticException;
}
