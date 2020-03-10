package visitor;
import ast.*;

import java.lang.*;

public abstract class TypeVisitor{

	public abstract CompType visit(ArrayAssignStmt a) throws SemanticException;
	public abstract CompType visit(ArrayDecl a) throws SemanticException;
	public abstract CompType visit(ArrayRef a) throws SemanticException;
	public abstract CompType visit(Block b) throws SemanticException;
	public abstract CompType visit(BooleanLiteral bool) throws SemanticException;
	public abstract CompType visit(CharLiteral c) throws SemanticException;
	public abstract CompType visit(CompType c) throws SemanticException;
	public abstract CompType visit(CompareExpr e) throws SemanticException;
	public abstract CompType visit(ExColonStmt e) throws SemanticException;
	public abstract CompType visit(FloatLiteral f) throws SemanticException;
	public abstract CompType visit(FormalParam fp) throws SemanticException;
	public abstract CompType visit(FunctionBod fb) throws SemanticException;
	public abstract CompType visit(FunctionCall fc) throws SemanticException;
	public abstract CompType visit(FunctionDecl fd) throws SemanticException;
	public abstract CompType visit(Function f) throws SemanticException;
	public abstract CompType visit(IdAssignStmt s) throws SemanticException;
	public abstract CompType visit(Identifier i) throws SemanticException;
	public abstract CompType visit(IfElseStmt ie) throws SemanticException;
	public abstract CompType visit(IfStmt s) throws SemanticException;
	public abstract CompType visit(IntegerLiteral i) throws SemanticException;
	public abstract CompType visit(LessExpr e) throws SemanticException;
	public abstract CompType visit(MultExpr e) throws SemanticException;
	public abstract CompType visit(ParenExpr e) throws SemanticException;
	public abstract CompType visit(PlmiExpr e) throws SemanticException;
	public abstract CompType visit(PrintlnStmt s) throws SemanticException;
	public abstract CompType visit(PrintStmt s) throws SemanticException;
	public abstract CompType visit(Program p) throws SemanticException;
	public abstract CompType visit(ReturnStmt s) throws SemanticException;
	public abstract CompType visit(SemiStatement s) throws SemanticException;
	public abstract CompType visit(Statement s) throws SemanticException;
	public abstract CompType visit(StringLiteral s) throws SemanticException;
	public abstract CompType visit(VarDecl v) throws SemanticException;
	public abstract CompType visit(WhileStmt s) throws SemanticException;
	public abstract CompType visit(Expression e) throws SemanticException;
}
