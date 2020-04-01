package irep;
import codegen.JasminVisitor;

public abstract class Inst
{
	public abstract String toString();
	public abstract String accept(JasminVisitor j);
}
