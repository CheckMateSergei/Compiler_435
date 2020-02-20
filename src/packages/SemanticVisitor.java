package packages;
import java.lang.*;

public class SemanticVisitor implements TypeVisitor{

	// symbol tables for functions and variables
	SymbolTable func = new SymbolTable();
	SymbolTable vars = new SymbolTable();
	


	// ***** EXPRESSIONS ***** //


	public CompType visit(LessExpr e) throws SemanticException{return null;};


	public CompType visit(MultExpr e) throws SemanticException{return null;};


	public CompType visit(ParenExpr e) throws SemanticException{return null;};


	public CompType visit(PlmiExpr e) throws SemanticException{return null;};


	public CompType visit(Expression e) throws SemanticException{return null;};


	public CompType visit(CompareExpr e) throws SemanticException{return null;};



	// ***** ATOMS ***** //
	

	public CompType visit(CharLiteral c) throws SemanticException{return null;};


	public CompType visit(BooleanLiteral bool) throws SemanticException{return null;};


	public CompType visit(FloatLiteral f) throws SemanticException{return null;};


	public CompType visit(IntegerLiteral i) throws SemanticException{return null;};


	public CompType visit(Identifier i) throws SemanticException{return null;};


	public CompType visit(ArrayAssignStmt a) throws SemanticException{return null;};


	public CompType visit(ArrayDecl a) throws SemanticException{return null;};


	public CompType visit(ArrayRef a) throws SemanticException{return null;};


	public CompType visit(StringLiteral s) throws SemanticException{return null;};



	// ***** FUNCTION RELATED ***** //


	public CompType visit(FormalParam fp) throws SemanticException{return null;};


	public CompType visit(FunctionBod fb) throws SemanticException{return null;};


	public CompType visit(FunctionCall fc) throws SemanticException{return null;};


	public CompType visit(FunctionDecl fd) throws SemanticException{return null;};


	public CompType visit(Function f) throws SemanticException{return null;};


	// ***** STATEMENTS ***** //
	

	public CompType visit(VarDecl v) throws SemanticException
	{
		// begin new scope to declare variables
		vars.beginScope();

		


		return null;
	}


	public CompType visit(Statement s) throws SemanticException{return null;};


	public CompType visit(IdAssignStmt s) throws SemanticException{return null;};


	public CompType visit(Block b) throws SemanticException{return null;};


	public CompType visit(ExColonStmt e) throws SemanticException{return null;};


	public CompType visit(IfElseStmt ie) throws SemanticException{return null;};


	public CompType visit(IfStmt s) throws SemanticException{return null;};


	public CompType visit(PrintlnStmt s) throws SemanticException{return null;};


	public CompType visit(PrintStmt s) throws SemanticException{return null;};


	public CompType visit(ReturnStmt s) throws SemanticException{return null;};


	public CompType visit(SemiStatement s) throws SemanticException{return null;};


	public CompType visit(WhileStmt s) throws SemanticException{return null;};

}
