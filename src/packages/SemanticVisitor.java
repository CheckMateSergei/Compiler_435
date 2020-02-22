package packages;
import java.lang.*;
import java.util.*;

public class SemanticVisitor extends TypeVisitor{

	// symbol tables for functions and variables
	public FunctionSymbolTable func = new FunctionSymbolTable();
	public VarSymbolTable vars = new VarSymbolTable();
	public CompType returnType;
	


	// ***** EXPRESSIONS ***** //


	public CompType visit(Expression e) throws SemanticException
	{
		System.out.println("YOU DO ENTER EXPRESSION");
		return e.accept(this);
	}


	public CompType visit(LessExpr e) throws SemanticException{return null;};


	public CompType visit(MultExpr e) throws SemanticException{return null;};


	public CompType visit(ParenExpr e) throws SemanticException{return null;};


	public CompType visit(PlmiExpr e) throws SemanticException{return null;};


	public CompType visit(CompareExpr e) throws SemanticException{return null;};



	// ***** ATOMS ***** //
	

	public CompType visit(CharLiteral c) throws SemanticException
	{
		CompType ct = new CompType("char");
		ct.line = c.line;
		ct.offset = c.offset;
		return ct;
	}


	public CompType visit(BooleanLiteral bool) throws SemanticException
	{
		CompType ct = new CompType("bool");
		ct.line = bool.line;
		ct.offset = bool.offset;
		return ct;
	}



	public CompType visit(FloatLiteral f) throws SemanticException
	{
		CompType ct = new CompType("float");
		ct.line = f.line;
		ct.offset = f.offset;
		return ct;

	}


	public CompType visit(IntegerLiteral i) throws SemanticException
	{
		CompType ct = new CompType("int");
		ct.line = i.line;
		ct.offset = i.offset;
		return ct;
	}

	public CompType visit(StringLiteral s) throws SemanticException
	{
		CompType ct = new CompType("string");
		ct.line = s.line;
		ct.offset = s.offset;
		return ct;
	}


	public CompType visit(Identifier i) throws SemanticException
	{
		// check if id is initialized
		if(! vars.inCurrentScope(i.id))
		{
			String msg = "Error: variable '"+i.id+"' not intialized";
			throw new SemanticException(msg, i.line, i.offset);
		}
		
		// return the type from i's declaration
		String t = vars.lookup(i.id).type;
		CompType ct = new CompType(t);
		ct.line = i.line;
		ct.offset = i.offset;
		return ct;
	}


	public CompType visit(ArrayRef a) throws SemanticException{return null;};


	public CompType visit(FunctionCall fc) throws SemanticException
	{
		System.out.println("IN FUNC CALL");
		// check to see if function is defined
		if(! func.inCurrentScope(fc.id.id))
		{
			String msg = "Error: tried to reference undefined function '"+fc.id.id+"'";
			throw new SemanticException(msg, fc.id.line, fc.id.offset);
		}
		
		// temporary decl to get parameters list
		FunctionDecl temp = func.lookup(fc.id.id);
		// check if exprList and paramList differ
		if(temp.parameters.size() == fc.exprList.size())
		{
			String msg = "Error: parameter and argument list differ in length, function call: '"+fc.id.id+"'";
			throw new SemanticException(msg, fc.id.line, fc.id.offset);
		}

		return func.lookup(fc.id.id).type;
	}


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
		if(!func.lookup("main").type.type.equals("void")){
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
		// visit the type (array or primitive)
		fp.type.accept(this);
		// add the parameter to the variable symbol table
		vars.add(fp.id.id, fp.type);

		
		return null;
	}


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

		// set the return type to the current functions return type
		returnType = fd.type;

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


	public CompType visit(FunctionBod fb) throws SemanticException
	{
		// loop through variable declarations and visit each
		for(VarDecl vd : fb.varDecls)
		{
			vd.accept(this);
		}

		// loop through all the statements and visit each
		for(Statement s : fb.statements)
		{
			s.accept(this);
		}


		return null;
	}




	// ***** STATEMENTS ***** //


	public CompType visit(CompType c)throws SemanticException
	{
		// check if instanceof ArrayDecl
		if(c instanceof ArrayDecl)
		{
			// call visit on array declaration and return
			return c.accept(this);
		}

		// check to see if fp has type void
		if(c.getType().equals("void"))
		{
			String msg = "Error: variable or parameter declaration with type 'void'";
			throw new SemanticException(msg, c.line, c.offset);
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
		// if v is already in symbol table
		if(vars.inCurrentScope(v.id.id))
		{
			String msg = "Error: Variable id '"+v.id.id+"' already in use";
			throw new SemanticException(msg, v.id.line, v.id.offset);
		}

		// visit the variable declarations type
		v.type.accept(this);
		// add as no exceptions thrown
		vars.add(v.id.id, v.type); 

		//System.out.println(vars.st.peek().keySet());
		return null;
	}


	public CompType visit(Statement s) throws SemanticException
	{

		System.out.println("YOU DO ENTER STATEMENT");	
		return null;
	}


	public CompType visit(IdAssignStmt s) throws SemanticException
	{
	//	// check that type of id and type of expr match
	//	CompType idt = vars.lookup(s.id.id).type;
	//	if(idt.type.type.equals())
	//	{

	//	}
		return null;
	}


	public CompType visit(ArrayAssignStmt a) throws SemanticException{return null;};


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
