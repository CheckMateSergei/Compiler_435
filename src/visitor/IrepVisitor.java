package visitor;

import ast.*;
import irep.*;

public class IrepVisitor extends IRVisitor
{

	public Temp visit(Identifier i){return;}
	public Temp visit(IntegerLiteral il){return;}
	public Temp visit(Program p){return;}
	public Temp visit(VarDecl decl){return;}
	public Temp visit(CompType comp){return;}
	public Temp visit(FunctionDecl decl){return;}
	public Temp visit(Statement stmt){return;}
	public Temp visit(FormalParam fp){return;}
	public Temp visit(Function f){return;}
	public Temp visit(FunctionBod fb){return;}
	public Temp visit(ArrayAssignStmt aas){return;}
	public Temp visit(ArrayDecl arrayDecl){return;}
	public Temp visit(Block b){return;}
	public Temp visit(Literal l){return;}
	public Temp visit(StringLiteral sl){return;}
	public Temp visit(FloatLiteral fl){return;}
	public Temp visit(CharLiteral cl){return;}
	public Temp visit(BooleanLiteral bl){return;}
	public Temp visit(Expression e){return;}
	public Temp visit(ExColonStmt ec){return;}
	public Temp visit(IdAssignStmt idas){return;}
	public Temp visit(IfElseStmt ifel){return;}
	public Temp visit(IfStmt is){return;}
	public Temp visit(PrintlnStmt pl){return;}
	public Temp visit(PrintStmt ps){return;}
	public Temp visit(ReturnStmt ret){return;}
	public Temp visit(SemiStatement sem){return;}
	public Temp visit(WhileStmt wh){return;}
	public Temp visit(ArrayRef ar){return;}
	public Temp visit(CompareExpr ce){return;}
	public Temp visit(FunctionCall fc){return;}
	public Temp visit(LessExpr le){return;}
	public Temp visit(PlmiExpr pm){return;}
	public Temp visit(MultExpr me){return;}
	public Temp visit(ParenExpr pe){return;}

}
