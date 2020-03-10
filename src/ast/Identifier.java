package ast;

import visitor.*;

public class Identifier extends Expression
{
	public String id;
	public int line;
	public int offset;


	public Identifier(String id)
	{
		this.id = id;
	}

	public CompType accept(TypeVisitor v) throws SemanticException
	{
		return v.visit(this);
	}
}
