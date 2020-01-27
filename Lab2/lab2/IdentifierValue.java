public class IdentifierValue extends Expression
{
	Identifier	id;
	public IdentifierValue (Identifier id)
	{
		this.id = id;
	}
	
	public Object accept(Visitor v)
	{
		return v.visit(this);
	}
}
