public abstract class Visitor
{
	public	abstract Object	visit(AssignmentStatement a);
	public	abstract Object visit(Identifier i);
	public  abstract Object visit(IdentifierValue v);
	public  abstract Object visit(IntegerLiteral i);
	public	abstract Object	visit(MultExpression m);
	public	abstract Object	visit(OutputStatement o);
	public	abstract Object	visit(PlusExpression p);
	public	abstract Object	visit(Program p);
}
