package packages;
import java.util.Vector;

public class FunctionDecl
{
	public CompType type;
	public Identifier id;
	public Vector<FormalParam> parameters;
	public int line;
	public int offset;


	public FunctionDecl(CompType type, Identifier id){
		this.type = type;
		this.id = id;
		this.parameters = new Vector<FormalParam>();
	}

	public void addFormal(FormalParam fp)
	{
		parameters.add(fp);
	}

	public CompType accept(TypeVisitor v) throws SemanticException
	{
		return v.visit(this);
	}
	
}
