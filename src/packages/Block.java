package packages;
import java.util.Vector;

public class Block extends Statement
{
	Vector<Statement> stmtList;

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

	public Object accept(Visitor v){
		return v.visit(this);
	}
}
