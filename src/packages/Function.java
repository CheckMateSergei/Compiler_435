package packages;

public class Function
{
	FunctionDecl decl;
	FunctionBod bod;
	public int line;
	public int offset;


	public Function(FunctionDecl decl, FunctionBod bod)
	{
		this.decl = decl;
		this.bod = bod;
	}

	public Object accept(Visitor v)
	{
		return v.visit(this);
	}
}
