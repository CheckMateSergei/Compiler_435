package ast;

import visitor.*;

public class FormalParam
{
	public CompType type;
	public Identifier id;
	public int line;
	public int offset;


	public FormalParam(CompType type, Identifier id)
	{
		this.type = type;
		this.id = id;
	}

	public <V> V accept(Visitor<V> v) throws SemanticException
	{
		return v.visit(this);
	}
}
