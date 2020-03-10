package visitor;
import ast.*;

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
	public abstract Object visit(ArrayAssignStmt aas);
	public abstract Object visit(ArrayDecl arrayDecl);
	public abstract Object visit(Block b);
	public abstract Object visit(Literal l);
	public abstract Object visit(StringLiteral sl);
	public abstract Object visit(FloatLiteral fl);
	public abstract Object visit(CharLiteral cl);
	public abstract Object visit(BooleanLiteral bl);
	public abstract Object visit(Expression e);
	public abstract Object visit(ExColonStmt ec);
	public abstract Object visit(IdAssignStmt idas);
	public abstract Object visit(IfElseStmt ifel);
	public abstract Object visit(IfStmt is);
	public abstract Object visit(PrintlnStmt pl);
	public abstract Object visit(PrintStmt ps);
	public abstract Object visit(ReturnStmt ret);
	public abstract Object visit(SemiStatement sem);
	public abstract Object visit(WhileStmt wh);
	public abstract Object visit(ArrayRef ar);
	public abstract Object visit(CompareExpr ce);
	public abstract Object visit(FunctionCall fc);
	public abstract Object visit(LessExpr le);
	public abstract Object visit(PlmiExpr pm);
	public abstract Object visit(MultExpr me);
	public abstract Object visit(ParenExpr pe);
}
