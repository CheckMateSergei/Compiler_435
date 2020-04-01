package visitor;
import java.io.*;
import java.util.ArrayList;
import ast.*;
import irep.*;

public class IrepVisitor implements Visitor<Temp>
{
	public FunctionSymbolTable funcs = new FunctionSymbolTable();
	public TempSymbolTable temps = new TempSymbolTable();
	public ArrayList<Inst> insts;
	public TempFactory factory;
	public LabelFactory labels;
	public CompType returnType;
	public irep.Program output_program;

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
		return null;
	}

	public Temp visit(ast.Program p)
	{
		irep.Program prog = new irep.Program(p.name);
		irep.Function irf;
		RetnType ret;

		funcs.beginScope();

		for(ast.Function f : p.functions)
		{
			funcs.add(f.decl.id.id, f.decl);
		}

		// loop through the function list
		for(ast.Function f : p.functions)
		{
			// begin temp scope and start a new instruction list
			insts = new ArrayList<Inst>();
			temps.beginScope();
			factory = new TempFactory();
			returnType = f.decl.type;
			labels = new LabelFactory();

			// create return type object
			if(f.decl.type instanceof ArrayDecl)
			{
				ret = new RetnType(new RefType(getType(f.decl.type.type).toString()));
			}
			else
			{
				ret = new RetnType(getType(f.decl.type.type));
			}

			// get temps for the parameters
			for(FormalParam fp : f.decl.parameters)
			{
				fp.accept(this);
			}

			// create a MethType object
			MethType sig = new MethType(ret);
			int x = 0;
			// store the types into the method signature
			for(FormalParam fp : f.decl.parameters)
			{
				sig.add(factory.temps.get(x).type);
				temps.add(fp.id.id, factory.temps.get(x++));
			}

			// finally create the function and add to program func list
			irf = new irep.Function(f.decl.id.id, sig);

			// start adding needed temp variables
			for(VarDecl v : f.bod.varDecls)
			{
				temps.add(v.id.id, v.accept(this));
				// irf.addTemp(temps.lookup(v.id.id));
			}

			// start adding to the instruction list
			for(Statement s : f.bod.statements)
			{
				s.accept(this);
			}

			// add instructions to functions list
			for(Inst i : insts)
			{
				irf.addInst(i);
			}
		
			// add temps to irf temp list
			for(Temp t : factory.temps)
			{
				irf.addTemp(t);
			}

			if(f.decl.type.type.equals("void"))
			{
				irf.addInst(new Return());
			}

			prog.add(irf);
			temps.endScope();
		}

		output_program = prog;

		try 
		{
     			File file = new File(prog.classname+".ir");
     			file.createNewFile();
		}
		catch (IOException e) 
		{
      			System.out.println("An error occurred.");
      			e.printStackTrace();
    		}

		try 
		{
		      FileWriter writer = new FileWriter(prog.classname+".ir");
		      writer.write(prog.toString());
		      writer.close();
		} 
		catch (IOException e) 
		{
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		}


		funcs.endScope();

		return null;
	}

	public Temp visit(VarDecl decl)
	{
		// new array declaration
		if(decl.type instanceof ArrayDecl)
		{
			// creates a new array
			ArrayDecl ad = (ArrayDecl)decl.type;
			Temp t = ad.accept(this);
			insts.add(new NewArrAss(ad.size, t.type, t));
			return t;
		}
		else
		{
			return decl.type.accept(this);
		}
	}

	public Temp visit(CompType comp)
	{
		return factory.get(getType(comp.type));
	}

	public Temp visit(FormalParam fp)
	{
		return fp.type.accept(this);
	}

	public Temp visit(ArrayDecl arrayDecl)
	{
		return factory.get(new RefType(getType(arrayDecl.type).toString()));
	}	

	public Temp visit(IntegerLiteral il)
	{
		Inst i;
		Temp t = factory.get(new AtomicType("I"));
		Int val = new Int(il.value);
		i = new IRConst(t, val);
		insts.add(i);
		return t;
	}

	public Temp visit(StringLiteral sl)
	{
		Inst i;
		Temp t = factory.get(new AtomicType("U"));
		Strin val = new Strin(sl.value);
		i = new IRConst(t, val);
		insts.add(i);
		return t;
	}

	public Temp visit(FloatLiteral fl)
	{
		Inst i;
		Temp t = factory.get(new AtomicType("F"));
		Flot val = new Flot(fl.value);
		i = new IRConst(t, val);
		insts.add(i);
		return t;
	}

	public Temp visit(CharLiteral cl)
	{
		Inst i;
		Temp t = factory.get(new AtomicType("C"));
		Cha val = new Cha(cl.value);
		i = new IRConst(t, val);
		insts.add(i);
		return t;
	}

	public Temp visit(BooleanLiteral bl)
	{
		Inst i;
		Temp t = factory.get(new AtomicType("Z"));
		Bool val = new Bool(bl.value);
		i = new IRConst(t, val);
		insts.add(i);
		return t;
	}

	public Temp visit(ArrayAssignStmt aas)
	{
		// assigns a value to an index in an array
		Temp t1, t2, t3;
	       	t1 = temps.lookup(aas.id.id);
		t2 = aas.index.accept(this);
		t3 = aas.value.accept(this);
		ArrAssign aa = new ArrAssign(t1, t2, t3);
		insts.add(aa);
		return null;
	}

	public Temp visit(ArrayRef ar)
	{
		Temp t1 = temps.lookup(ar.id.id);
		Temp t2 = ar.index.accept(this);
		Temp t = factory.get(new AtomicType(t1.type.type));
		IdArrAssign ida = new IdArrAssign(t, t1, t2);
		insts.add(ida);

		return t;
	}

	public Temp visit(IfStmt is)
	{
		Label l = labels.get();
		Temp t = is.boolExpr.accept(this);
		insts.add(new IfJump(l, t));
		Label l2 = labels.get();
		insts.add(new Jump(l2));
		insts.add(l);
		is.ifBlock.accept(this);
		insts.add(l2);
		return null;
	}

	public Temp visit(IfElseStmt ifel)
	{
		Label l = labels.get();
		Label l2 = labels.get();
		Label l3 = labels.get();

		Temp t = ifel.boolExpr.accept(this);
		IfJump ij = new IfJump(l, t);
		insts.add(ij);
		insts.add(new Jump(l2));
		insts.add(l);
		ifel.ifBlock.accept(this);
		insts.add(new Jump(l3));
		insts.add(l2);
		ifel.elseBlock.accept(this);
		insts.add(l3);
		return null;
	}

	public Temp visit(FunctionCall fc)
	{
		Call c;
		Temp t = null;
		
		// if the type is void just call
		if(funcs.lookup(fc.id.id).type.type.equals("void"))
		{
			c = new Call(fc.id.id);
		}
		else
		{
			t = factory.get(funcs.lookup(fc.id.id).type.accept(this).type);
			c = new IdCall(t, fc.id.id);
		}

		//add param types
		for(Expression e : fc.exprList)
		{
			c.addParam(e.accept(this));
		}
		
		//add instruction to list
		insts.add(c);
		return t;
	}

	public Temp visit(WhileStmt wh)
	{
		Label l1, l2, l3;
		l1 = labels.get();
		l2 = labels.get();
		l3 = labels.get();

		insts.add(l1);
		Temp t = wh.e.accept(this);
		insts.add(new IfJump(l2, t));
		insts.add(new Jump(l3));
		insts.add(l2);
		wh.b.accept(this);
		insts.add(new Jump(l1));
		insts.add(l3);

		return null;
	}

	public Temp visit(Block b)
	{
		for(Statement s : b.stmtList)
		{
			s.accept(this);
		}
		return null;
	}

	public Temp visit(ReturnStmt ret)
	{
		Return r;

		if(returnType.type.equals("void"))
		{
			r = new Return();
		}
		else
		{
			Temp t = ret.e.accept(this);
			r = new OpReturn(t);
		}

		insts.add(r);
		return null;
	}

	public Temp visit(PrintStmt pr)
	{
		Print p;
		Temp t = pr.e.accept(this);

		if(t.type.type.equals("U"))
		{
			p = new PrintString(t);
		}
		else
		{
			p = new Print(t);
		}
	
		insts.add(p);

		return null;
	}

	public Temp visit(PrintlnStmt pl)
	{
		Println p;
		Temp t = pl.e.accept(this);

		if(t.type.type.equals("U"))
		{
			p = new PrintlnString(t);
		}
		else
		{
			p = new Println(t);
		}
		insts.add(p);

		return null;
	}

	public Temp visit(IdAssignStmt idas)
	{
		// assigns a constant to an operand
		Temp t1 = temps.lookup(idas.id.id);
		Temp t2 = idas.e.accept(this);
		Inst i = new IdAssign(t1, t2);
		insts.add(i);
		return null;
	}

	public Temp visit(MultExpr me)
	{
		Temp t1, t2, t3;
		t1 = me.le.accept(this);
		t2 = me.ri.accept(this);
		Operator op = new Operator("*", t1.type);
		t3 = factory.get(t1.type);
		Inst i = new BinAssign(t3, t1, t2, op);
		insts.add(i);
		return t3;
	}

	public Temp visit(CompareExpr ce)
	{
		Temp t1, t2, t3;
		t1 = ce.le.accept(this);
		t2 = ce.ri.accept(this);
		Operator op = new Operator("==", t1.type);
		t3 = factory.get(new AtomicType("Z"));
		Inst i = new BinAssign(t3, t1, t2, op);
		insts.add(i);
		return t3;
	}

	public Temp visit(LessExpr le)
	{
		Temp t1, t2, t3;
		t1 = le.le.accept(this);
		t2 = le.ri.accept(this);
		Operator op = new Operator("<", t1.type);
		t3 = factory.get(new AtomicType("Z"));
		Inst i = new BinAssign(t3, t1, t2, op);
		insts.add(i);
		return t3;
	}

	public Temp visit(PlmiExpr pm)
	{
		Temp t1, t2, t3;
		t1 = pm.le.accept(this);
		t2 = pm.ri.accept(this);
		Operator op = new Operator(Character.toString(pm.symbol), t1.type);
		t3 = factory.get(t1.type);
		Inst i = new BinAssign(t3, t1, t2, op);
		insts.add(i);
		return t3;
	}

	public Temp visit(ParenExpr pe)
	{
		return pe.e.accept(this);
	}

	public Temp visit(Identifier i)
	{
		return temps.lookup(i.id);
	}

	public Temp visit(ExColonStmt ec)
	{
		return ec.e.accept(this);
	}

	public Temp visit(Expression e){return e.accept(this);}
	public Temp visit(ast.Function f){return null;}
	public Temp visit(FunctionBod fb){return null;}
	public Temp visit(FunctionDecl decl){return null;}
	public Temp visit(Statement stmt){return null;}
	public Temp visit(Literal l){return l.accept(this);}
	public Temp visit(SemiStatement sem){return null;}
}
