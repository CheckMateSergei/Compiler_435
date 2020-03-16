package visitor;
import ast.*;

public interface Visitor<V>
{
	public V visit(Identifier i);
	public V visit(IntegerLiteral il);
	public V visit(Program p);
	public V visit(VarDecl decl);
	public V visit(CompType comp);
	public V visit(FunctionDecl decl);
	public V visit(Statement stmt);
	public V visit(FormalParam fp);
	public V visit(Function f);
	public V visit(FunctionBod fb);
	public V visit(ArrayAssignStmt aas);
	public V visit(ArrayDecl arrayDecl);
	public V visit(Block b);
	public V visit(Literal l);
	public V visit(StringLiteral sl);
	public V visit(FloatLiteral fl);
	public V visit(CharLiteral cl);
	public V visit(BooleanLiteral bl);
	public V visit(Expression e);
	public V visit(ExColonStmt ec);
	public V visit(IdAssignStmt idas);
	public V visit(IfElseStmt ifel);
	public V visit(IfStmt is);
	public V visit(PrintlnStmt pl);
	public V visit(PrintStmt ps);
	public V visit(ReturnStmt ret);
	public V visit(SemiStatement sem);
	public V visit(WhileStmt wh);
	public V visit(ArrayRef ar);
	public V visit(CompareExpr ce);
	public V visit(FunctionCall fc);
	public V visit(LessExpr le);
	public V visit(PlmiExpr pm);
	public V visit(MultExpr me);
	public V visit(ParenExpr pe);
}
