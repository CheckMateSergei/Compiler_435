package packages;
public abstract class Visitor
{
	public abstract Object visit(Identifier i);
	public abstract Object visit(IntegerLiteral il);
	public abstract Object visit(Program p);
	public abstract Object visit(VarDecl decl);
	public abstract Object visit(CompType comp);
	public abstract Object visit(FunctionDecl decl);
	public abstract Object visit(Statement stmt);
	public abstract Object visit(FormalParam fp);
	public abstract Object visit(Function f);
	public abstract Object visit(FunctionBod fb);
}
