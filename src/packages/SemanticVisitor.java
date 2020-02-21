package packages;
import java.lang.*;
import java.util.*;

public class SemanticVisitor extends TypeVisitor{

	// symbol tables for functions and variables
	FunctionSymbolTable func = new FunctionSymbolTable();
	VarSymbolTable vars = new VarSymbolTable();
	


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


	public CompType visit(ArrayRef a) throws SemanticException{return null;};


	public CompType visit(StringLiteral s) throws SemanticException{return null;};



	// ***** FUNCTION RELATED ***** //
	

	public CompType visit(Program p) throws SemanticException
	{
		//check if the function list is empty
		if(p.getFunctionCount() == 0)
		{
			throw new SemanticException("Error: Function 'main' not found", 0, 0);
		}
		// begin function scope
		func.beginScope();
		
		// loop through all functions and add to function list
		for(int i = 0; i < p.getFunctionCount(); i++)
		{
			Function temp = p.getFunction(i);
			// check if function name is already in scope
			if(! func.inCurrentScope(temp.decl.id.id))
			{
				// add function to st
				String id = temp.decl.id.id;
				func.add(id, temp.decl);
			}
			else
			{
				// throw error as function name duplicated
				String msg = "Error: Function identifier: '" + temp.decl.id.id + "' already in use  ";
				throw new SemanticException(msg, temp.line, temp.offset);
			}
		}

		// loop through the functions and actually visit this time
		for(int i = 0; i < p.getFunctionCount(); i++)
		{
			// visit the function brotha
			p.getFunction(i).accept(this);	
		}

		// CHECK IF THERE IS A MAIN FUNCTION AND OTHER CHECKS HERE
		if(func.lookup("main") == null)
		{
			throw new SemanticException("Error: Function 'main' not found", 0, 0);
		}
	
		// check if mains return type is void
		if(func.lookup("main").type.type != "void"){
			int x = func.lookup("main").type.line;
			int y = func.lookup("main").type.offset;
			String ty = func.lookup("main").type.type;
			// throw exception baby
			throw new SemanticException("Error: Function 'main' must be of type 'void' but is of type '"+ty+"'", x, y);
		}
		
		// end the function scope
		func.endScope();	
		return null;
	}


	public CompType visit(FormalParam fp) throws SemanticException
	{
		// check to see if fp has type void
		if(fp.type.type == "void")
		{
			String msg = "Error: Function parameter with return type 'void' ";
			throw new SemanticException(msg, fp.type.line, fp.type.offset);
		}
		
		return null;
	}


	public CompType visit(FunctionBod fb) throws SemanticException{return null;};


	public CompType visit(FunctionDecl fd) throws SemanticException
	{
		// add parameters to hashset to see if duplicates exist
		HashSet<String> dupCheck = new HashSet<String>();

		// for each formal parameter in parameter list for this function
		for(FormalParam fp : fd.parameters)
		{
			// checks for duplicate elements 
			// add returns false if id already in set
			if(! dupCheck.add(fp.id.id))
			{
				String msg = "Error: parameter name: '"+fp.id.id+"' already in use ";
				throw new SemanticException(msg, fp.line, fp.offset);
			}
			
			// visit the parameter individually
			fp.accept(this);
		}

		return null;
	}


	public CompType visit(Function f) throws SemanticException
	{
		// initialize the current scope
		vars.beginScope();
		// visit the decl and body
		f.decl.accept(this);
		f.bod.accept(this);
		// end the current scope
		vars.endScope();
		
		return null;
	}


	public CompType visit(FunctionCall fc) throws SemanticException{return null;};



	// ***** STATEMENTS ***** //


	public CompType visit(CompType c)throws SemanticException
	{
		// check if instanceof ArrayDecl
		if(c instanceof ArrayDecl)
		{
			// call visit on array declaration and return
			return c.accept(this);
		}



		return null;
	}


	public CompType visit(ArrayDecl a) throws SemanticException
	{
		// check if array decl is of type void
		if(a.type == "void")
		{
			String msg = "Error: variable or parameter declaration with type 'void'";
			throw new SemanticException(msg, a.line, a.offset);
		}

		// check array size isnt 0
		if(a.size == 0)
		{
			String msg = "Error: Cannot have an array of length 0";
			throw new SemanticException(msg, a.line, a.offset);
		}





		return null;
	}


	public CompType visit(VarDecl v) throws SemanticException
	{
		// if v is not already in
		// if(! )

		


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
