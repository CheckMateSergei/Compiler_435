package ast;

import visitor.*;

public class SemanticException extends RuntimeException{

	public String message;
	public String line;
	public String offset;

	public SemanticException(String message, int line, int offset)
	{
        	super(message + " at line: " + line + " and offset: " + offset);
	}

	/*
	public String toString()
	{
		// return concatenated error message
		return message + " at line: " + line + " and offset: " + offset;
	}
	*/
}
