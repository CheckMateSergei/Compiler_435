// PrettyPrintVisitor for Assignment 1
package packages;

public class PrettyPrintVisitor extends Visitor
{
	int indent = 0;

	public PrettyPrintVisitor(){}

	public Object visit(Program p)
	{
		// store the number of functions in the program
		int funcCount = p.getFunctionCount();

		// loop and accept all functions
		for(int i = 0; i < funcCount; i++)
		{
			// get the ith function
			Function f = p.getFunction(i);
			// accept the function 
			f.accept(this);
		}	
		return null;
	}

	public Object visit(Function f)
	{
		// accept the function delaration
		f.decl.accept(this);
		System.out.println("{");
		f.bod.accept(this);
		System.out.printf("}\n");
		

		return null;
	}

	public Object visit(FunctionBod bod)
	{
		// increase current indent level
		indent = 1;
		int vars = bod.varDecls.size();
		int states = bod.statements.size();

		// loop through the variable declarations
		for(int x = 0; x < vars; x++)
		{
			//prints the indentation
			for(int i = 0; i < indent; i++)
			{
				System.out.printf("    ");
			}
			// print the varDecl
			bod.varDecls.elementAt(x).accept(this);
		}
		// only print if there actually are varDecls
		if(vars != 0)
		{
			System.out.printf("\n");
		}

		// loop through statements
		for(int x = 0; x < states; x++)
		{
			//prints the indentation
			for(int i = 0; i < indent; i++)
			{
				System.out.printf("    ");
			}
			// print the statements
			bod.statements.elementAt(x).accept(this);
		}

		return null;
	}

	public Object visit(VarDecl decl)
	{
		// print the type
		decl.type.accept(this);
		// print the id
		System.out.printf(" ");
		decl.id.accept(this);
		System.out.println(";");
		return null;
	}

	public Object visit(FunctionDecl decl)
	{
		int pCount = decl.parameters.size();
		// accept the type
		decl.type.accept(this);
		// print space before id
		System.out.print(" ");
		decl.id.accept(this); // prints id
		// print the parameters
		System.out.print(" (");

		// prints the parameters
		for(int i = 0; i < pCount; i++)
		{
			// print formal parameter
			decl.parameters.elementAt(i).accept(this);

			// dont print if last parameter
			if(i == pCount - 1){continue;}

			// print comma and space before next parameter
			System.out.print(", ");
		}

		System.out.println(")");
		return null;
	}

	public Object visit(FormalParam fp)
	{
		// accept the parameters type
		fp.type.accept(this);
		// accept the parameters id
		System.out.print(" ");
		fp.id.accept(this);
		return null;
	}

	public Object visit(CompType t)
	{
		//print the type
		System.out.print(t.type);
		return null;
	}

	public Object visit(ArrayDecl decl)
	{
		// print the type
		System.out.print(decl.type);
		// print the brackets w/ size in it
		System.out.printf("[%d]", decl.size);
		return null;	
	}

	public Object visit(Identifier i)
	{
		// print the id
		System.out.print(i.id);
		return null;
	}

	public Object visit(Block b) 
	{
		for(int i = 0; i < indent; i++)
		{
			System.out.printf("    ");
		}
		//increase indent level in block
		indent += 1;
		System.out.printf("{\n");
		//loop through blocks statement vector
		for(int i = 0; i < b.stmtList.size(); i++)
		{
			for(int x = 0; x < indent; x++)
			{
				System.out.printf("    ");
			}
			b.stmtList.elementAt(i).accept(this);
		}
		//decrease indent level before closing brace
		indent -= 1;
		for(int x = 0; x < indent; x++)
		{
			System.out.printf("    ");
		}
		System.out.printf("}\n");

		return null;
	}



	/*********ALL THE LITERALS**********/

	public Object visit(Literal l) 
	{
		l.accept(this);
		return null;
	}

	public Object visit(IntegerLiteral il) 
	{
		System.out.printf("%d", il.value);
		return null;
	}

	public Object visit(StringLiteral sl) 
	{
		System.out.printf("%s", sl.value);
		return null;
	}
	public Object visit(FloatLiteral fl) 
	{
		System.out.printf("%s", fl.value);
		return null;
	}
	public Object visit(CharLiteral cl) 
	{
		System.out.printf("\'%s\'", cl.getValue());
		return null;
	}
	public Object visit(BooleanLiteral bl) 
	{
		System.out.printf("%s", bl.value);
		return null;
	}
	


	/*********ALL THE STATEMENTS**********/

	public Object visit(Statement stmt) 
	{
		for(int i = 0; i < indent; i++)
		{
			System.out.printf("    ");
		}
		// heavy lifting is done in the subclasses
		stmt.accept(this);
		return null;
	}

	public Object visit(ArrayAssignStmt aas) 
	{
		//print the id
		aas.id.accept(this);
		//print the index expression
		System.out.printf("%s", '[');
		aas.index.accept(this);
		System.out.printf("%s=", ']');
		//print the actual expression being assigned
		aas.value.accept(this);
		System.out.printf("%s\n", ';');

		return null;
	}

	public Object visit(IdAssignStmt idas) 
	{
		//print the identifier
		idas.id.accept(this);
		System.out.printf("=");
		//print the expression
		idas.e.accept(this);
		System.out.printf(";\n");
		return null;
	}

	public Object visit(IfElseStmt ifel) 
	{
		System.out.printf("if (");
		ifel.boolExpr.accept(this);
		System.out.printf(")\n");
		ifel.ifBlock.accept(this);

		for(int i = 0; i < indent; i++)
		{
			System.out.printf("    ");
		}

		System.out.printf("else\n");
		ifel.elseBlock.accept(this);
		return null;
	}

	public Object visit(IfStmt is) 
	{
		System.out.printf("if (");
		is.boolExpr.accept(this);
		System.out.printf(")\n");
		is.ifBlock.accept(this);
		return null;
	}
	public Object visit(PrintlnStmt pl) 
	{
		System.out.printf("println ");
		pl.e.accept(this);
		System.out.printf(";\n");
		return null;
	}

	public Object visit(PrintStmt ps) 
	{
		System.out.printf("print ");
		ps.e.accept(this);
		System.out.print(";\n");
		return null;
	}
	public Object visit(ReturnStmt ret) 
	{
		//check if there is something to return
		if(ret.e != null)
		{
			System.out.printf("return ");
			ret.e.accept(this);
			System.out.printf(";\n");
		}
		else
		{
			System.out.printf("return;\n");
		}

		return null;
	}
	public Object visit(SemiStatement sem) 
	{
		System.out.printf(";\n");
		return null;
	}

	public Object visit(WhileStmt wh) 
	{
		System.out.printf("while (");
		wh.boolExpr.accept(this);
		System.out.printf(")\n");
		//the block of the while statement
		wh.b.accept(this);
		return null;
	}

	public Object visit(ExColonStmt ec) 
	{
		ec.e.accept(this);
		System.out.printf(";\n");
		return null;
	}



	/********ALL THE EXPRESSIONS*********/

	public Object visit(Expression e) 
	{
		//heavy lifting done in subclasses
		e.accept(this);
		return null;
	}

	public Object visit(ParenExpr pe) 
	{
		System.out.printf("(");
		pe.e.accept(this);
		System.out.printf(")");
		return null;
	}

	public Object visit(MultExpr me) 
	{
		me.le.accept(this);
		System.out.printf("*");
		me.ri.accept(this);
		return null;
	}

	public Object visit(PlmiExpr pm) 
	{
		pm.le.accept(this);
		System.out.printf("%s", pm.symbol);
		pm.ri.accept(this);
		return null;
	}

	public Object visit(CompareExpr ce) 
	{
		ce.le.accept(this);
		System.out.printf("==");
		ce.ri.accept(this);
		return null;
	}

	public Object visit(LessExpr les) 
	{	
		les.le.accept(this);
		System.out.printf("<");
		les.ri.accept(this);
		return null;
	}

	public Object visit(FunctionCall fc) 
	{
		fc.id.accept(this);
		System.out.printf("(");
		//loop through the expression list
		for(int i = 0; i < fc.exprList.size(); i++)
		{
			fc.exprList.elementAt(i).accept(this);
			//print comma space if there is more
			if(i == fc.exprList.size() - 1){continue;}
			System.out.printf(", ");
		}
		System.out.printf(")");
		
		return null;
	}

	public Object visit(ArrayRef ar) 
	{
		ar.id.accept(this);
		System.out.printf("[");
		ar.index.accept(this);
		System.out.printf("]");
		return null;
	}

}
