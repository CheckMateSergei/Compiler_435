package packages;

public class SemanticException extends Exception{

	String message;
	String line;
	String offset;

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
