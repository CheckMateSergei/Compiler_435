package ast;

import visitor.*;
public abstract class Statement
{
	public abstract CompType accept(TypeVisitor v) throws SemanticException;
}
