package ast;
import visitor.*;


public class FloatLiteral extends Literal
{
	public float value;
	public int line;
	public	int offset;


	public FloatLiteral(float value)
	{
		this.value = value;
	}

	public float getValue()
	{
		return this.value;
	}

	public CompType accept(TypeVisitor v) throws SemanticException 
	{
		return v.visit(this);
	}
}
