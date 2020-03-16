package ast;

import visitor.*;

public class Function
{
	public FunctionDecl decl;
	public FunctionBod bod;
	public int line;
	public int offset;


	public Function(FunctionDecl decl, FunctionBod bod)
	{
		this.decl = decl;
		this.bod = bod;
	}

	public <V> V accept(Visitor<V> v) throws SemanticException
	{
		return v.visit(this);
	}
}
