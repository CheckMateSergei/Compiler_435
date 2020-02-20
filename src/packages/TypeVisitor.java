package packages;

import java.lang.*;

public interface TypeVisitor{

	public CompType visit(ArrayAssignStmt a) throws SemanticException;
	public CompType visit(ArrayDecl a) throws SemanticException;
	public CompType visit(ArrayRef a) throws SemanticException;
	public CompType visit(Block b) throws SemanticException;
	public CompType visit(BooleanLiteral bool) throws SemanticException;
	public CompType visit(CharLiteral c) throws SemanticException;
	public CompType visit(CompareExpr e) throws SemanticException;
	public CompType visit(ExColonStmt e) throws SemanticException;
	public CompType visit(FloatLiteral f) throws SemanticException;
	public CompType visit(FormalParam fp) throws SemanticException;
	public CompType visit(FunctionBod fb) throws SemanticException;
	public CompType visit(FunctionCall fc) throws SemanticException;
	public CompType visit(FunctionDecl fd) throws SemanticException;
	public CompType visit(Function f) throws SemanticException;
	public CompType visit(IdAssignStmt s) throws SemanticException;
	public CompType visit(Identifier i) throws SemanticException;
	public CompType visit(IfElseStmt ie) throws SemanticException;
	public CompType visit(IfStmt s) throws SemanticException;
	public CompType visit(IntegerLiteral i) throws SemanticException;
	public CompType visit(LessExpr e) throws SemanticException;
	public CompType visit(MultExpr e) throws SemanticException;
	public CompType visit(ParenExpr e) throws SemanticException;
	public CompType visit(PlmiExpr e) throws SemanticException;
	public CompType visit(PrintlnStmt s) throws SemanticException;
	public CompType visit(PrintStmt s) throws SemanticException;
	public CompType visit(ReturnStmt s) throws SemanticException;
	public CompType visit(SemiStatement s) throws SemanticException;
	public CompType visit(Statement s) throws SemanticException;
	public CompType visit(StringLiteral s) throws SemanticException;
	public CompType visit(VarDecl v) throws SemanticException;
	public CompType visit(WhileStmt s) throws SemanticException;
	public CompType visit(Expression e) throws SemanticException;
}
