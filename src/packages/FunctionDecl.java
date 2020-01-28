package packages;
import packages.*;
import java.util.Vector;

public class FunctionDecl
{
	CompType type;
	Identifier id;
	Vector<FormalParam> parameters;

	public FunctionDecl(CompType type, Identifier id){
		this.type = type;
		this.id = id;
		this.parameters = new Vector<FormalParam>();
	}

	public void addFormal(FormalParam fp)
	{
		parameters.add(fp);
	}

	public Object accept(Visitor v)
	{
		return v.visit(this);
	}
	
}
