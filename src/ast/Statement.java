package ast;

import visitor.*;
public abstract class Statement
{
	public abstract <V> V accept(Visitor<V> v) throws SemanticException;
}
