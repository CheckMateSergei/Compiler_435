package codegen;
import irep.*;
import java.util.ArrayList;
import java.io.*;

public class JasminVisitor
{
	public IrepST st = new IrepST();
	public int label = 0;
	public String classname;

	public String visit(irep.Program p)
	{ 
		classname = p.classname;
		st.beginScope();
		String s = ".source "+p.classname+"\n.class public "+p.classname+"\n.super java/lang/Object\n\n";
   
                 for(Function f : p.funcList)
		 {
			 st.add(f.name, f.type);
                         s += f.accept(this);
                         s += "\n";
                 }
	
		// BOILERPLATE CODE
		s += ".method public static main([Ljava/lang/String;)V\n";
		s += ".limit locals 1\n";
		s += ".limit stack 4\n";
		s += "invokestatic "+p.classname+"/__main()V\n";
		s += "return\n";
		s += ".end method\n";

		s += ".method public <init>()V\n";
		s += "aload_0\n";
		s += "invokenonvirtual java/lang/Object/<init>()V\n";
		s += "return\n";
		s += ".end method";

		try 
		{
     			File file = new File(p.classname+".j");
     			file.createNewFile();
		}
		catch (IOException e) 
		{
      			System.out.println("An error occurred.");
      			e.printStackTrace();
    		}

		try 
		{
		      FileWriter writer = new FileWriter(p.classname+".j");
		      writer.write(s);
		      writer.close();
		} 
		catch (IOException e) 
		{
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		}


		return s;
	}

	public String visit(irep.Function f)
	{

		String s = ".method public static __"+f.name+f.type.toString()+"\n";
                 s += ".limit locals "+f.temps.size()+"\n";

		 int l = label++;
		 label++;
 
                 for(Temp t : f.temps)
                 {
                         s += ".var "+t.num+" is T"+t.num+"  "+t.accept(this)+" from L_"+l+" to L_"+(l+1)+"\n";
                 }
                 s += ".limit stack 16\n";
                 s += "L_"+l+":\n";
 
                 for(Temp t : f.temps)
                 {
			 if(t.type.toString().startsWith("A") || t.type.toString().equals("U"))
			 {
				 s += "aconst_null\nldc 0\nastore "+t.num+"\n";
			 }
			 else
			 {
                         	s += "ldc 0\nistore "+t.num+"\n";
			 }
                 }
 
                 for(Inst i : f.insts)
                 {
                         s += i.accept(this)+"\n";
                 }
 
                 return s + "L_"+(l+1)+":\n.end method\n";
	}

	public String visit(Jump j)
	{
		return "goto "+j.l.toString();
	}

	public String visit(Call c)
	{
		String s = "";

		for(Temp t : c.params)
		{
			if(t.type.toString().startsWith("A") || t.type.toString().equals("U"))
			{
				s += "aload "+t.num+"\n";
				continue;
			}

			s += "iload "+t.num+"\n";
		}

		s += "invokestatic "+classname+"/__"+c.name+st.lookup(c.name).toString();
		return s;
	}

	public String visit(Return r)
	{
		return "return";
	}

	public String visit(IRConst ir)
	{	
		String s = "ldc "+ir.c.toString()+"\n";
		if(ir.temp.type.toString().startsWith("A") || ir.temp.type.toString().equals("U"))
		{
			s += "astore "+ir.temp.num;
			return s;
		}
		s += "istore "+ir.temp.num;
		return s;
	}

	public String visit(Println pl)
	{
		String s = "getstatic java/lang/System/out Ljava/io/PrintStream;\n";
		s += "iload "+pl.t.num+"\n";
		s += "invokevirtual java/io/PrintStream/println("+pl.t.type.toString()+")V";
		return s;
	}

	public String visit(Print p)
	{
	
		String s = "getstatic java/lang/System/out Ljava/io/PrintStream;\n";
		s += "iload "+p.t.num+"\n";
		s += "invokevirtual java/io/PrintStream/print("+p.t.type.toString()+")V";
		return s;
	}

	public String visit(Label l)
	{
		return l.toString();
	}

	public String visit(IfJump ij)
	{
		String ty = ij.t.type.toString();
		String s = "";
		if(ty.equals("U") || ty.startsWith("A"))
		{
			s += "aload "+ij.t.num+"\n";
			s += "goto L"+ij.l.num;
			return s;
		}

		s += "iload "+ij.t.num+"\n";
		s += "goto L"+ij.l.num;
		return s;
	}

	public String visit(IdCall id)
	{
		String s = "";

		for(Temp t : id.params)
		{
			if(t.type.toString().startsWith("A") || t.type.toString().equals("U"))
			{
				s += "aload "+t.num+"\n";
				continue;
			}

			s += "iload "+t.num+"\n";
		}

		s += "invokestatic "+classname+"/__"+id.name+st.lookup(id.name).toString()+"\n";
		
		if(id.id.type.toString().startsWith("A") || id.id.type.toString().equals("U"))
		{
			s += "astore "+id.id.num+"\n";
			return s;
		}
		s += "istore "+id.id.num+"\n";
		return s;
	}

	public String visit(OpReturn or)
	{
		String s = "";

		if(or.t.type.toString().equals("I") || or.t.type.toString().equals("Z"))
		{
			s += "iload "+or.t.num+"\n";
			s += "ireturn";
		}
		else if(or.t.type.toString().equals("F"))
		{
			s += "fload "+or.t.num+"\n";
			s += "freturn";
		}
		else
		{
			s += "aload "+or.t.num+"\n";
			s += "areturn";
		}

		return s;
	}

	public String visit(PrintlnString ps)
	{
		String s = "getstatic java/lang/System/out Ljava/io/PrintStream;\n";
		s += "aload "+ps.t.num+"\n";
		s += "invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V";
		return s;
	}

	public String visit(PrintString ps)
	{
		String s = "getstatic java/lang/System/out Ljava/io/PrintStream;\n";
		s += "aload "+ps.t.num+"\n";
		s += "invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V";
		return s;
	}

	public String visit(LabelInst li)
	{
		return "L"+li.num+":";
	}

	public String visit(ArrAssign arr)
	{
		// ONLY WORKS WITH INTEGER ARRAYS
		String s = "aload "+arr.aTemp.num+"\n";
		s += "iload "+arr.iTemp.num+"\n";
		if(arr.vTemp.type.toString().startsWith("A") || arr.vTemp.type.toString().equals("U"))
		{
			s += "aload "+arr.vTemp.num+"\n";
		}
		else
		{
			s += "iload "+arr.vTemp.num+"\n";
		}
		s += "iastore";
		return s;
	}

	public String visit(BinAssign bin)
	{
		String s = "", op = bin.o.op;

		if(op.equals("<") || op.equals("=="))
		{
			if(bin.op1.type.toString().equals("I"))
			{
				s += "iload "+bin.op1.num+"\n";
				s += "iload "+bin.op2.num+"\n";
				s += "isub\n";
				int n = label++;
				s += "ifeq L_"+n+"\n";
				s += "ldc 0\n";
				s += "goto L_"+(n+1)+"\n";
				s += "L_"+n+":\n";
				label++;
				s += "ldc 1\n";
				s += "L_"+(n+1)+":\n";
				s += "istore "+bin.res.num;
				return s;
			}
			else if(bin.op1.type.toString().equals("F"))
			{
				s += "fload "+bin.op1.num+"\n";
				s += "fload "+bin.op2.num+"\n";
				s += "fsub\n";
				int n = label++;
				s += "ifeq L_"+n+"\n";
				s += "ldc 0\n";
				s += "goto L_"+(n+1)+"\n";
				s += "L_"+n+":\n";
				label++;
				s += "ldc 1\n";
				s += "L_"+(n+1)+":\n";
				s += "istore "+bin.res.num;
				return s;
			}
			else
			{
				s += "aload "+bin.op1.num+"\n";
				s += "aload "+bin.op2.num+"\n";
				s += "asub\n";
				int n = label++;
				s += "ifeq L_"+n+"\n";
				s += "ldc 0\n";
				s += "goto L_"+(n+1)+"\n";
				s += "L_"+n+":\n";
				label++;
				s += "ldc 1\n";
				s += "L_"+(n+1)+":\n";
				s += "istore "+bin.res.num;
				return s;
			}
		}

		if(op.equals("+"))
		{
			if(bin.op1.type.toString().equals("I"))
			{
				s += "iload "+bin.op1.num+"\n";
				s += "iload "+bin.op2.num+"\n";
				s += "iadd\n";
				s += "istore "+bin.res.num;
				return s;
			}
			else if(bin.op1.type.toString().equals("F"))
			{
				s += "fload "+bin.op1.num+"\n";
				s += "fload "+bin.op2.num+"\n";
				s += "fadd\n";
				s += "fstore "+bin.res.num;
				return s;
			}
			else
			{
				s += "aload "+bin.op1.num+"\n";
				s += "aload "+bin.op2.num+"\n";
				s += "aadd\n";
				s += "astore "+bin.res.num;
				return s;
			}
		}

		if(op.equals("-"))
		{
			if(bin.op1.type.toString().equals("I"))
			{
				s += "iload "+bin.op1.num+"\n";
				s += "iload "+bin.op2.num+"\n";
				s += "isub\n";
				s += "istore "+bin.res.num;
				return s;
			}
			else if(bin.op1.type.toString().equals("F"))
			{
				s += "fload "+bin.op1.num+"\n";
				s += "fload "+bin.op2.num+"\n";
				s += "fsub\n";
				s += "fstore "+bin.res.num;
				return s;
			}
			else
			{
				s += "aload "+bin.op1.num+"\n";
				s += "aload "+bin.op2.num+"\n";
				s += "asub\n";
				s += "astore "+bin.res.num;
				return s;
			}
		}

		if(op.equals("*"))
		{
			if(bin.op1.type.toString().equals("I"))
			{
				s += "iload "+bin.op1.num+"\n";
				s += "iload "+bin.op2.num+"\n";
				s += "imul\n";
				s += "istore "+bin.res.num;
				return s;
			}
			else if(bin.op1.type.toString().equals("F"))
			{
				s += "fload "+bin.op1.num+"\n";
				s += "fload "+bin.op2.num+"\n";
				s += "fmul\n";
				s += "fstore "+bin.res.num;
				return s;
			}
			else
			{
				s += "aload "+bin.op1.num+"\n";
				s += "aload "+bin.op2.num+"\n";
				s += "amul\n";
				s += "astore "+bin.res.num;
				return s;
			}
		}
		return s;
	}

	public String visit(NewArrAss na)
	{
		String s = "ldc "+na.size+"\n";

		String t = na.type.toString();

		if(t.equals("I"))
		{
			s += "newarray int\n";
		}
		if(t.equals("F"))
		{
			s += "newarray float\n";
		}
		if(t.equals("U"))
		{
			s += "newarray Ljava/lang/String\n";
		}
		if(t.equals("Z"))
		{
			s += "newarray boolean\n";
		}
		if(t.equals("C"))
		{
			s += "newarray char\n";
		}

		return s + "astore "+na.temp.num;
	}

	public String visit(IdArrAssign id)
	{
		String s = "aload "+id.aId.num+"\n";
		s += "iload "+id.index.num+"\n";
		
		if(id.id.type.toString().equals("I"))
		{
			s += "iaload\n";
			s += "istore "+id.id.num;
		}
		if(id.id.type.toString().equals("F"))
		{
			s += "faload\n";
			s += "fstore "+id.id.num;
		}
		if(id.id.type.toString().equals("C"))
		{
			s += "caload\n";
			s += "cstore"+id.id.num;
		}

		return s;
	}

	public String visit(OpAssign op)
	{
		String s = "";

		if(op.temp1.type.toString().equals("I"))
		{
			s += "iload "+op.temp2.num+"\n";
			s += "istore "+op.temp1.num;
		}
		if(op.temp1.type.toString().equals("F"))
		{
			s += "fload "+op.temp2.num+"\n";
			s += "fstore "+op.temp1.num;
		}
		if(op.temp1.type.toString().equals("C"))
		{
			s += "cload "+op.temp2.num+"\n";
			s += "cstore"+op.temp1.num;
		}
		return s;
	}

	public String visit(IdAssign id)
	{
		String s = "";

		if(id.temp1.type.toString().equals("I"))
		{
			s += "iload "+id.temp2.num+"\n";
			s += "istore "+id.temp1.num;
		}
		if(id.temp1.type.toString().equals("F"))
		{
			s += "fload "+id.temp2.num+"\n";
			s += "fstore "+id.temp1.num;
		}
		if(id.temp1.type.toString().equals("C"))
		{
			s += "cload "+id.temp2.num+"\n";
			s += "cstore"+id.temp1.num;
		}
		return s;
	}

	public String visit(Temp t)
	{
		if(t.type.toString().equals("I"))
		{
			return "I";
		}
		if(t.type.toString().equals("F"))
		{
			return "F";
		}
		if(t.type.toString().equals("Z"))
		{
			return "Z";
		}
		if(t.type.toString().equals("U"))
		{
			return "Ljava/lang/String;";
		}
		if(t.type.toString().startsWith("A"))
		{
			return "A";
		}
		return null;
	}

	public String visit(Assignment a)
	{
		return null;
	}

	public String visit(Inst i)
	{
		return null;
	}

	public String visit(UnAssign un)
	{

		return null;
	}


}
