package visitor;
import irep.Temp;
import ast.*;

public abstract class IRVisitor
{
	public abstract Temp visit(Identifier i);
	public abstract Temp visit(IntegerLiteral il);
	public abstract Temp visit(Program p);
	public abstract Temp visit(VarDecl decl);
	public abstract Temp visit(CompType comp);
	public abstract Temp visit(FunctionDecl decl);
	public abstract Temp visit(Statement stmt);
	public abstract Temp visit(FormalParam fp);
	public abstract Temp visit(Function f);
	public abstract Temp visit(FunctionBod fb);
	public abstract Temp visit(ArrayAssignStmt aas);
	public abstract Temp visit(ArrayDecl arrayDecl);
	public abstract Temp visit(Block b);
	public abstract Temp visit(Literal l);
	public abstract Temp visit(StringLiteral sl);
	public abstract Temp visit(FloatLiteral fl);
	public abstract Temp visit(CharLiteral cl);
	public abstract Temp visit(BooleanLiteral bl);
	public abstract Temp visit(Expression e);
	public abstract Temp visit(ExColonStmt ec);
	public abstract Temp visit(IdAssignStmt idas);
	public abstract Temp visit(IfElseStmt ifel);
	public abstract Temp visit(IfStmt is);
	public abstract Temp visit(PrintlnStmt pl);
	public abstract Temp visit(PrintStmt ps);
	public abstract Temp visit(ReturnStmt ret);
	public abstract Temp visit(SemiStatement sem);
	public abstract Temp visit(WhileStmt wh);
	public abstract Temp visit(ArrayRef ar);
	public abstract Temp visit(CompareExpr ce);
	public abstract Temp visit(FunctionCall fc);
	public abstract Temp visit(LessExpr le);
	public abstract Temp visit(PlmiExpr pm);
	public abstract Temp visit(MultExpr me);
	public abstract Temp visit(ParenExpr pe);
}
