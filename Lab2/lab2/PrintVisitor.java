public class PrintVisitor extends Visitor
{
	public	Object	visit(AssignmentStatement a)
	{
		a.i.accept(this);
		System.out.print(" = ");
		a.e.accept(this);
		System.out.println(";");
		return null;
	}
	
	public  Object  visit(Identifier i)
	{
		System.out.print(i.name);
		return null;
	}
		
	public  Object  visit(IdentifierValue v)
	{
		System.out.print(v.id.name);
		return null;
	}
	
	public  Object  visit(IntegerLiteral i)
	{
		System.out.print(i.value);
		return null;
	}
	
	public  Object	visit(MultExpression m)
	{
		m.e1.accept(this);
		System.out.print (" * ");
		m.e2.accept(this);
		return null;
	}
	
	public	Object	visit(OutputStatement o)
	{
		System.out.print("output ");
		o.i.accept(this);
		System.out.println(" ;");
		return null;
	}
	
	public	Object	visit(PlusExpression p)
	{
		p.e1.accept(this);
		System.out.print (" + ");
		p.e2.accept(this);
		return null;
	}
	
	public	Object	visit(Program p)
	{
		int statementCount = p.getStatementCount();
		
		for (int i=0;i<statementCount;i++)
		{
			Statement s = p.getStatement(i);
			s.accept(this);
		}
		
		return null;
	}
}
