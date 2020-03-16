package ast;

import visitor.*;

public class SemiStatement extends Statement
{
	public final char c = ';';
	public int line;
	public int offset;

	
	public SemiStatement(){}

	public <V> V accept(Visitor<V> v) throws SemanticException
	{
		return v.visit(this);
	}
}
