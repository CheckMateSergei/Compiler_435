package ast;
import visitor.*;
import java.util.ArrayList;

public class Block extends Statement
{
	public ArrayList<Statement> stmtList;
	public int line;
	public int offset;



	public Block()
	{
		stmtList = new ArrayList<Statement>();
	}

	public void addToBlock(Statement s)
	{
		stmtList.add(s);
	}

	public Statement getStmt(int index)
	{
		return stmtList.get(index);
	}

	public int getSize()
	{
		return stmtList.size();
	}

	public <V> V accept(Visitor<V> v) throws SemanticException
	{
		return v.visit(this);
	}
}
