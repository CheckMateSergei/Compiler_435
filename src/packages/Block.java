package packages;
import java.util.Vector;

public class Block extends Statement
{
	Vector<Statement> stmtList;
	public int line;
	public int offset;



	public Block()
	{
		stmtList = new Vector<Statement>();
	}

	public void addToBlock(Statement s)
	{
		stmtList.add(s);
	}

	public Statement getStmt(int index)
	{
		return stmtList.elementAt(index);
	}

	public int getSize()
	{
		return stmtList.size();
	}

	public CompType accept(TypeVisitor v) throws SemanticException
	{
		return v.visit(this);
	}
}
