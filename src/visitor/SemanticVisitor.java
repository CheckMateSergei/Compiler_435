package visitor;
import ast.*;
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
		return e.accept(this);
	}


	public CompType visit(LessExpr e) throws SemanticException
	{
		String s, t;
		// let s be the left op's type
		s = e.getLeftOperand().accept(this).type;
		// let t be the right op's type
		t = e.getRightOperand().accept(this).type;

		// check the types match
		if(! s.equals(t))
		{
			String msg = "Error: left and right operands of different type";
			throw new SemanticException(msg, e.le.line, e.le.offset);
		}

		// must return boolean type
		CompType ct = new CompType("boolean");
		ct.line = e.line;
		ct.offset = e.offset;
		return ct;
	}


	public CompType visit(MultExpr e) throws SemanticException
	{
		String s, t;
		// let s be the left op's type
		s = e.getLeftOperand().accept(this).type;
		// let t be the right op's type
		t = e.getRightOperand().accept(this).type;

		// cannot multiply strings or chars
		if(s.equals("string") || s.equals("char") || t.equals("string") 
				|| t.equals("char"))
		{
			String msg = "Error: incompatible data type for '*'";
			throw new SemanticException(msg, e.le.line, e.le.offset);
		}

		// check the types match
		if(! s.equals(t))
		{
			String msg = "Error: left and right operands of different type";
			throw new SemanticException(msg, e.le.line, e.le.offset);
		}

		return e.getLeftOperand().accept(this);
	}


	public CompType visit(ParenExpr e) throws SemanticException
	{
		return e.e.accept(this);
	}


	public CompType visit(PlmiExpr e) throws SemanticException
	{	
		String s, t;
		// let s be the left op's type
		s = e.getLeftOperand().accept(this).type;
		// let t be the right op's type
		t = e.getRightOperand().accept(this).type;

		// check the types match
		if(! s.equals(t))
		{
			String msg = "Error: left and right operands of different type";
			throw new SemanticException(msg, e.getLeftOperand().line, 
							 e.getLeftOperand().offset);
		}

		return e.getLeftOperand().accept(this);

	}


	public CompType visit(CompareExpr e) throws SemanticException
	{
		String s, t;
		// let s be the left op's type
		s = e.getLeftOperand().accept(this).type;
		// let t be the right op's type
		t = e.getRightOperand().accept(this).type;

		// check the types match
		if(! s.equals(t))
		{
			String msg = "Error: left and right operands of different type";
			throw new SemanticException(msg, e.le.line, e.le.offset);
		}

		// must return boolean type
		CompType ct = new CompType("boolean");
		ct.line = e.line;
		ct.offset = e.offset;
		return ct;
	}


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
		CompType ct = new CompType("boolean");
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


	public CompType visit(ArrayRef a) throws SemanticException
	{
		// check if a.id is initialized
		if(! vars.inCurrentScope(a.id.id))
		{
			String msg = "Error: array variable '"+a.id.id+"' not intialized";
			throw new SemanticException(msg, a.id.line, a.id.offset);
		}

		// check if a.index is integer
		if(! a.index.accept(this).type.equals("int"))
		{
			String msg = "Error: array index must be of type 'int'";
			throw new SemanticException(msg, a.index.line, a.index.offset);
		}

		// return the type from a.id's declaration
		String t = vars.lookup(a.id.id).type;
		CompType ct = new CompType(t);
		ct.line = a.id.line;
		ct.offset = a.id.offset;
		return ct;
	}


	public CompType visit(FunctionCall fc) throws SemanticException
	{
		// check to see if function is defined
		if(! func.inCurrentScope(fc.id.id))
		{
			String msg = "Error: tried to reference undefined function '"+fc.id.id+"'";
			throw new SemanticException(msg, fc.id.line, fc.id.offset);
		}

		
		// temporary decl to get parameters list
		FunctionDecl temp = func.lookup(fc.id.id);
		// check if exprList and paramList differ
		if(! (temp.parameters.size() == fc.exprList.size()))
		{
			String msg = "Error: parameter and argument list differ in length, function call: '"+fc.id.id+"'";
			throw new SemanticException(msg, fc.id.line, fc.id.offset);
		}

		int x = 0;
		// check if types differ in any position
		for(FormalParam f : temp.parameters)
		{
			// check if all parameter and types match
			if(! f.type.type.equals(fc.getExpr(x).accept(this).type))
			{
				String msg = "Error: parameter and argument types do not match";
				throw new SemanticException(msg, fc.getExpr(x).accept(this).line, 
								fc.getExpr(x).accept(this).offset);
			}

			x++;
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

		// check if main has parameters
		if(! (func.lookup("main").parameters.size() == 0))
		{
			String msg = "Error: function 'main' must not accept parameters";
			throw new SemanticException(msg, func.lookup("main").line, 
							func.lookup("main").offset);
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

		
		return fp.type;
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

		return fd.type;
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

		return c;
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

		return a;
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
		return v.type;
	}


	public CompType visit(Statement s) throws SemanticException
	{
		return s.accept(this);
	}


	public CompType visit(IdAssignStmt s) throws SemanticException
	{
		// check that type of id and type of expr match
		if(! s.id.accept(this).type.equals(s.e.accept(this).type))
		{
			String msg = "Error: identifier '"+s.id.id+"' is of type '"+vars.lookup(s.id.id).type+"'";
			throw new SemanticException(msg, s.id.line, s.id.offset);

		}
		return s.e.accept(this);
	}


	public CompType visit(ArrayAssignStmt a) throws SemanticException
	{
		// check that index is an int
		if(! a.index.accept(this).type.equals("int"))
		{
			String msg = "Error: array index must be of type 'int'";
			throw new SemanticException(msg, a.index.line, a.index.offset);
		}
		// check that types match
		if(! a.value.accept(this).type.equals(a.id.accept(this).type))
		{
			String msg = "Error: type mismatch, array is of type '"+a.id.accept(this).type+"'";
			throw new SemanticException(msg, a.id.line, a.id.offset);
		}
		return a.id.accept(this);
	}


	public CompType visit(Block b) throws SemanticException
	{
		// visit each statment in b's statement list
		for(Statement s : b.stmtList)
		{
			s.accept(this);
		}
		return null;
	}


	public CompType visit(WhileStmt s) throws SemanticException
	{
		// check to make sure expression is boolean
		if(! s.e.accept(this).type.equals("boolean"))
		{
			String msg = "Error: expression must be of type 'boolean'";
			throw new SemanticException(msg, s.e.line, s.e.offset);
		}

		return null;
	}


	public CompType visit(IfElseStmt ie) throws SemanticException
	{
		// check that boolExpr is boolean
		if(! ie.boolExpr.accept(this).type.equals("boolean"))
		{
			String msg = "Error: expression must be of type 'boolean'";
			throw new SemanticException(msg, ie.boolExpr.line, ie.boolExpr.offset);
		}

		// visit blocks in order
		ie.ifBlock.accept(this);
		ie.elseBlock.accept(this);
		
		return null;
	}


	public CompType visit(IfStmt s) throws SemanticException
	{
		// check that boolExpr is boolean
		if(! s.boolExpr.accept(this).type.equals("boolean"))
		{
			String msg = "Error: expression must be of type 'boolean'";
			throw new SemanticException(msg, s.boolExpr.line, s.boolExpr.offset);
		}

		// visit blocks in order
		s.ifBlock.accept(this);

		return null;
	}


	public CompType visit(PrintlnStmt s) throws SemanticException
	{
		HashSet<String> types = new HashSet<String>();
		types.add("string");
		types.add("char");
		types.add("float");
		types.add("int");
		types.add("boolean");

		// make sure the expression is of type string
		if(! types.contains(s.e.accept(this).type))
		{
			String msg = "Error: cannot print data type";
			throw new SemanticException(msg, s.e.line, s.e.offset);
		}
		
		return s.e.accept(this);
	}


	public CompType visit(PrintStmt s) throws SemanticException
	{
		HashSet<String> types = new HashSet<String>();
		types.add("string");
		types.add("char");
		types.add("float");
		types.add("int");
		types.add("boolean");

		// make sure the expression is of type string
		if(! types.contains(s.e.accept(this).type))
		{
			String msg = "Error: cannot print data type";
			throw new SemanticException(msg, s.e.line, s.e.offset);
		}
		
		return s.e.accept(this);
	}


	public CompType visit(ReturnStmt s) throws SemanticException
	{
		// make sure the current return statement type matches s.e
		if(! s.e.accept(this).type.equals(returnType.type))
		{
			String msg = "Error: function must return type '"+returnType.type+"'";
			throw new SemanticException(msg, s.e.line, s.e.offset);
		}

		return s.e.type;
	}


	public CompType visit(SemiStatement s) throws SemanticException
	{
		return null;
	}

	public CompType visit(ExColonStmt e) throws SemanticException
	{
		return e.e.accept(this);
	}



}
