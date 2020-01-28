grammar simple;

@options{
output=AST
}

program returns [Program p]
@init
{
	// executed before the method starts
	p = new Program();
}
@after
{
	// excuted after the method is finished
}
	:
	( s=statement {p.addStatement(s);})* EOF
	;
	
statement returns [Statement s]
	:
	i1=id '=' e1=expr { s = new AssignmentStatement(i1,e1);} ';'
	| 'output' i2=id { s = new OutputStatement(i2);}';'
	;

expr returns [Expression e]
	:
	m1=multExpr {e = m1;} ( '+' m2=multExpr {e = new PlusExpression(m1,m2);})?
	;
	
multExpr returns [Expression e]
	:
	a1=atom {e = a1;} ( '*' a2=atom {e = new MultExpression(e,a2);})?
	;
	
atom returns [ Expression e ]	
	:
	  i=id {e = new IdentifierValue(i);} 
	| i2=intliteral {e = i2;}
	;
	
id returns [Identifier id]	
	: 
	i =ID { id = new Identifier(i.getText());}
	;

intliteral returns [IntegerLiteral il]: 
	i=INT { il = new IntegerLiteral(Integer.parseInt(i.getText()));}
	;
	

ID	: ('a'..'z')+
	;
	
INT	: ('0'..'9')+
	;

WS	: ( '\t' | ' ' | ('\r' | '\n') )+ { $channel = HIDDEN;}
	;
	
