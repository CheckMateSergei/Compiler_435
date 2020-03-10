package ast;

import visitor.*;

public abstract class Literal extends Expression
{
	public abstract CompType accept(TypeVisitor v) throws SemanticException;
}
