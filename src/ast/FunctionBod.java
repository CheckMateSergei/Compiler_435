package ast;

import visitor.*;
import java.util.ArrayList;

public class FunctionBod
{
	public ArrayList<VarDecl> varDecls;
	public ArrayList<Statement> statements;
	public int line;
	public int offset;


	public FunctionBod()
	{
		varDecls = new ArrayList<VarDecl>();
		statements = new ArrayList<Statement>();
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
		return statements.get(index);
	}

	public int getStatementCount()
	{
		return statements.size();
	}

	public VarDecl getVarDecl(int index)
	{
		return varDecls.get(index);
	}

	public int getVarDeclCount()
	{
		return varDecls.size();
	}

	public <V> V accept(Visitor<V> v) throws SemanticException
	{
		return v.visit(this);
	}
}
