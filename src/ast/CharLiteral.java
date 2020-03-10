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

	public CompType accept(TypeVisitor v) throws SemanticException
	{
		return v.visit(this);
	}
}
