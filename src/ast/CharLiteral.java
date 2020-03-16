package ast;
import visitor.*;

public class CharLiteral extends Literal
{
	public char value;
	public int line;
	public int offset;


	public CharLiteral(char value)
	{
		this.value = value;
	}

	public char getValue()
	{
		return this.value;
	}

	public <V> V accept(Visitor<V> v) throws SemanticException
	{
		return v.visit(this);
	}
}
