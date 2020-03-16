package ast;

import visitor.*;

public class VarDecl
{
	public CompType type;
	public Identifier id;
	public int line;
	public int offset;


	public VarDecl(CompType type, Identifier id)
	{
		this.type = type;
		this.id = id;
	}

	public <V> V accept(Visitor<V> v) throws SemanticException
	{
		return v.visit(this);
	}
}
