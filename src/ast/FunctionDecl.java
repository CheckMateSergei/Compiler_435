package ast;

import visitor.*;
import java.util.ArrayList;

public class FunctionDecl
{
	public CompType type;
	public Identifier id;
	public ArrayList<FormalParam> parameters;
	public int line;
	public int offset;


	public FunctionDecl(CompType type, Identifier id){
		this.type = type;
		this.id = id;
		this.parameters = new ArrayList<FormalParam>();
	}

	public void addFormal(FormalParam fp)
	{
		parameters.add(fp);
	}

	public <V> V accept(Visitor<V> v) throws SemanticException
	{
		return v.visit(this);
	}
	
}
