package visitor;

import ast.*;
import irep.*;

public class IrepVisitor extends IRVisitor
{
	public FunctionSymbolTable funcs = new FunctionSymbolTable();
	public TempSymbolTable temps = new TempSymbolTable();
	public TempFactory factory;

	public AtomicType getType(String type)
	{
		if(type.equals("int"))
		{
			return new AtomicType("I");
		}
		else if(type.equals("float"))
		{
			return new AtomicType("F");
		}
		else if(type.equals("string"))
		{
			return  new AtomicType("U");
		}
		else if(type.equals("boolean"))
		{
			return  new AtomicType("Z");
		}
		else if(type.equals("void"))
		{
			return  new AtomicType("V");
		}
		else if(type.equals("char"))
		{
			return  new AtomicType("C");
		}
	}

	public Temp visit(Identifier i){return null;}

	public Temp visit(ast.Program p)
	{
		irep.Program prog = new irep.Program(p.name);
		irep.Function irf;
		
		// loop through the function list
		for(ast.Function f : p.functions)
		{
			factory = new TempFactory();
			// add to the symbol table
			funcs.add(f.decl.id.id, f.decl); 

			// get the method type
			for(FormalParam fp : f.decl.parameters)
			{
				fp.accept(this);
			}

		}
		return null;
	}

	public Temp visit(VarDecl decl){return null;}

	public Temp visit(CompType comp)
	{
		return factory.get(getType(comp.type));
	}

	public Temp visit(FunctionDecl decl){return null;}
	public Temp visit(Statement stmt){return null;}

	public Temp visit(FormalParam fp)
	{
		return fp.type.accept(this);
	}

	public Temp visit(ast.Function f){return null;}
	public Temp visit(FunctionBod fb){return null;}
	public Temp visit(ArrayAssignStmt aas){return null;}

	public Temp visit(ArrayDecl arrayDecl)
	{
		return factory.get(new AtomicType("U"+getType(arrayDecl.type)));
	}	

	public Temp visit(Block b){return null;}
	public Temp visit(Literal l){return null;}
	public Temp visit(IntegerLiteral il){return null;}
	public Temp visit(StringLiteral sl){return null;}
	public Temp visit(FloatLiteral fl){return null;}
	public Temp visit(CharLiteral cl){return null;}
	public Temp visit(BooleanLiteral bl){return null;}
	public Temp visit(Expression e){return null;}
	public Temp visit(ExColonStmt ec){return null;}
	public Temp visit(IdAssignStmt idas){return null;}
	public Temp visit(IfElseStmt ifel){return null;}
	public Temp visit(IfStmt is){return null;}
	public Temp visit(PrintlnStmt pl){return null;}
	public Temp visit(PrintStmt ps){return null;}
	public Temp visit(ReturnStmt ret){return null;}
	public Temp visit(SemiStatement sem){return null;}
	public Temp visit(WhileStmt wh){return null;}
	public Temp visit(ArrayRef ar){return null;}
	public Temp visit(CompareExpr ce){return null;}
	public Temp visit(FunctionCall fc){return null;}
	public Temp visit(LessExpr le){return null;}
	public Temp visit(PlmiExpr pm){return null;}


	public Temp visit(MultExpr me)
	{
		AtomicType typ = new AtomicType("I");
		Temp t = new Temp(typ, 1);
		System.out.println(t.toString());
		return t;
	}
	
	
	public Temp visit(ParenExpr pe)
	{
		AtomicType typ = new AtomicType("I");
		Temp t = new Temp(typ, 1);
		System.out.println(t.toString());
		return t;
	}



}
