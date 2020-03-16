package ast;
import visitor.*;

public abstract class Expression
{
	public CompType type;
	public int line;
	public int offset;
	public abstract <V> V accept(Visitor<V> v) throws SemanticException;
}
