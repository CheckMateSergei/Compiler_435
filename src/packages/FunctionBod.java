package packages;
import packages.*;
import java.util.Vector;

public class FunctionBod
{
	Vector<VarDecl> varDecls;
	Vector<Statement> statements;

	public FunctionBod()
	{
		varDecls = new Vector<VarDecl>();
		statements = new Vector<Statement>();
	}

	public void addVarDecl(VarDecl varDecl)
	{
		varDecls.add(varDecl);
	}

	public void addStatement(Statement stmt)
	{
		statements.add(stmt);
	}

	public Object accept(Visitor v)
	{
		return v.visit(this);
	}
}
