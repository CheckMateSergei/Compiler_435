package packages;

public abstract class Literal extends Expression
{
	public abstract Object accept(Visitor v);
}
