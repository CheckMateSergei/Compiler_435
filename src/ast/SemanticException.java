package ast;

import visitor.*;

public class SemanticException extends Exception{

	public String message;
	public String line;
	public String offset;

	public SemanticException(String message, int line, int offset){
        	this.message = message;
		this.line = String.valueOf(line);
		this.offset = String.valueOf(offset);
	}

	public String toString(){
		// return concatenated error message
		return message + " at line: " + line + " and offset: " + offset;
	}
}
