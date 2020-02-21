package packages;
import java.util.Vector;

public class FunctionBod
{
	Vector<VarDecl> varDecls;
	Vector<Statement> statements;
	public int line;
	public int offset;


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

	public Statement getStatement(int index)
	{
		return statements.elementAt(index);
	}

	public int getStatementCount()
	{
		return statements.size();
	}

	public VarDecl getVarDecl(int index)
	{
		return varDecls.elementAt(index);
	}

	public int getVarDeclCount()
	{
		return varDecls.size();
	}

	public CompType accept(TypeVisitor v) throws SemanticException
	{
		return v.visit(this);
	}
}
