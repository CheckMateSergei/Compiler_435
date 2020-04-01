package codegen;
import irep.*;
import java.util.ArrayList;

public class JasminVisitor
{
	public IrepST st = new IrepST();
	int label = 0;

	public String visit(irep.Program p)
	{ 
		st.beginScope();
		String s = ".source "+p.classname+"\n.class public "+p.classname+"\n.super     java/lang/Object\n\n";
   
                 for(Function f : p.funcList)
		 {
			 st.add(f.name, f.type);
                         s += f.accept(this);
                         s += "\n";
                 }

		return s;
	}

	public String visit(irep.Function f)
	{

		String s = "method public static __"+f.name+f.type.toString()+"\n";
                 s += ".limit locals "+f.temps.size()+"\n";

		 int l = label++;
		 label++;
 
                 for(Temp t : f.temps)
                 {
                         s += ".var "+t.num+" is T"+t.num+"  "+t.accept(this)+" from     L_0 to L_1\n";
                 }
                 s += ".limit stack 16\n";
                 s += "L_"+l+":\n";
 
                 for(Temp t : f.temps)
                 {
			 if(t.accept(this).equals("A"))
			 {
				 s += "ldc 0\nastore "+t.num+"\n";
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
 
                 return s + "L_"+(l+1)+".end method\n";
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

			s += "iload "+t.num+"\n";
		}

		s += "invokestatic "+c.name+"/"+c.name+st.lookup(c.name).toString();
		return s;
	}

	public String visit(Return r)
	{
		return "return";
	}

	public String visit(IRConst ir)
	{	
		String s = "ldc "+ir.c.toString()+"\n";
		s += "istore "+ir.temp.num;
		return s;
	}

	public String visit(Println pl)
	{
		String s = "getstatic java/lang/System/out Ljava/io/PrintStream\n";
		s += "iload "+pl.t.num+"\n";
		s += "invokevirtual java/io/PrintStream/println("+pl.t.type.toString()+")V";
		return s;
	}

	public String visit(Print p)
	{
	
		String s = "getstatic java/lang/System/out Ljava/io/PrintStream\n";
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


		return null;
	}

	public String visit(IdCall id)
	{

		return null;
	}

	public String visit(OpReturn or)
	{

		return null;
	}

	public String visit(PrintlnString ps)
	{
		String s = "getstatic java/lang/System/out Ljava/io/PrintStream\n";
		s += "aload "+ps.t.num+"\n";
		s += "invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V";
		return s;
	}

	public String visit(PrintString ps)
	{
		String s = "getstatic java/lang/System/out Ljava/io/PrintStream" ;
		s += "aload "+ps.t.num+"\n";
		s += "invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V";
		return s;
	}

	public String visit(LabelInst li)
	{

		return null;
	}

	public String visit(UnAssign un)
	{

		return null;
	}

	public String visit(ArrAssign arr)
	{

		return null;
	}

	public String visit(BinAssign bin)
	{
		String s;

		return null;
	}

	public String visit(NewArrAss na)
	{

		return null;
	}

	public String visit(IdArrAssign id)
	{

		return null;
	}

	public String visit(OpAssign op)
	{


		return null;
	}

	public String visit(IdAssign id)
	{

		return null;
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

}
