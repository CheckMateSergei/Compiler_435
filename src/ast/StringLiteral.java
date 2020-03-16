package ast;

import visitor.*;

public class StringLiteral extends Literal
{
	public String value;
	public int line;
	public int offset;


	public StringLiteral(String value)
	{
		this.value = value;
	}

	public String getValue()
	{
		return this.value;
	}

	public <V> V accept(Visitor<V> v) throws SemanticException
	{
		return v.visit(this);
	}
}
