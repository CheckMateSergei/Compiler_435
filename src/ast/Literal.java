package ast;

import visitor.*;

public abstract class Literal extends Expression
{
	public abstract <V> V accept(Visitor<V> v) throws SemanticException;
}
