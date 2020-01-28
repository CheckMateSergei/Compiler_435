/*
 * Grammar for CSC 435 Compiler Assignment #1
 * Author: Braydon Horcoff V00917594
 */
grammar ulNoActions;

options{
backtrack=true;
}

@header
{
import packages.*;
}

				
@members
{
protected void mismatch (IntStream input, int ttype, BitSet follow)
        throws RecognitionException
{
        throw new MismatchedTokenException(ttype, input);
}
public Object recoverFromMismatchedSet (IntStream input,
                                      RecognitionException e,
                                      BitSet follow)
        throws RecognitionException
{
        reportError(e);
        throw e;
}
}

@rulecatch {
        catch (RecognitionException ex) {
                reportError(ex);
                throw ex;
        }
}

/*
 * This is a subset of the ulGrammar to show you how
 * to make new production rules.
 * You will need to:
 *  - change type to be compoundType and include appropriate productions
 *  - introduce optional formalParameters
 *  - change functionBody to include variable declarations and statements 
 */

program returns [Program p]
@init 
{
	p = new Program();
}
@after
{
}
	:
	// adds any newly created functions to the programs
	// function vector array
	( f = function { p.addFunction(f); } )+ EOF
	;

function returns [Function f]
	// creates a new function with a matched function decl and body
	: fd = functionDecl fb = functionBody { f = new Function(fd, fb); }
	;

functionDecl returns [FunctionDecl fd]
	// creates the new function decl object
	: ct = compoundType id = identifier { fd = new FunctionDecl(ct, id); }
	// adds the new formal parameter to the vector for fd
	'(' ( fp = formalParameters )? ')' { fd.addFormal(fp); }
	;

formalParameters returns [FormalParam fp]
	// creates a new formal parameter and passes it up to its function
	: ct = compoundType id = identifier { fp = new FormalParam(ct, id); }
	// matches to add more to the parameter list if applicable
	  ( mf = moreFormals )*	
	;

moreFormals returns [FormalParam mf]
	: ',' ct = compoundType id = identifier
	// if comma is matched create another formal param and pass up 
	// to the formal parameter rule to add to the functions parameter list
	{ mf = new FormalParam(ct, id); }
	;

functionBody returns [FunctionBod fb]
@init
{
	// create the new function body object and then add the 
	// statements and variable declarations
	fb = new FunctionBod();
}
@after
{
}	// add the variable declarations and statements to
	// the appropriate vectors in the new function body object
	: '{' ( vd = varDecl { fb.addVarDecl(vd); })*  
	      ( s = statement { fb.addStatement(s); })* '}'
	;

varDecl returns [VarDecl vd]
	// creates a new variable declaration
	: ct = compoundType id = identifier ';' { vd = new VarDecl(ct, id); }
	;

compoundType returns [CompType ct]
	// if it is just a normal type create a comp type object
	: t = TYPE { ct = new CompType(t.getText()); }
	// if it is an array decl
	| ad = arrayDecl { ct = ad; }
//CAN EITHER KEEP THIS HERE AND MAKE CompType INTO A REGULAR VARIABLE DECL AND THEN
//HAVE arrayDecl TAKE CARE OF ARRAY DEC'S (WOULD NEED TO CHANGE: CompType.java
//TO INHERIT VarDecl AND ABOVE METHOD AND MAYBE SOMETHING ELSE TOO BUT GTG)
	;

arrayDecl returns [ArrayDecl ad]
	: t = TYPE '['il = integerconstant']'
	// create a new array with type t and size i 
	{ ad = new ArrayDecl(t.getText(), il.getValue()); }
	;

identifier returns [Identifier i]
	: id = ID { i = new Identifier(id.getText()); }
	;

/* *** Might not need this ***
 * type: TYPE
 *	;
 */

statement returns [Statement s]
	: st = semiColon { s = st;  }
//	| exprColon 
//	| idAssign 
//	| arrayAssign 
//	| ifElseBlock 
//	| ifBlock 
//	| whileBlock 
//	| printlnStmt 
//	| printStmt 
//	| returnStmt
	;

whileBlock: WHILE'(' expr')' block
	;

printlnStmt: PRINTLN expr ';'
	;

printStmt: PRINT expr ';'
	;

returnStmt: RETURN expr? ';'
	;

semiColon returns [SemiStatement st]
	: ';' { st = new SemiStatement(); }
	;

exprColon: expr ';'
	;

idAssign: identifier '=' expr ';'
	;

arrayAssign: identifier '[' expr']' '=' expr ';'
	;

ifElseBlock: IF'('expr')' block ELSE block
	;

ifBlock: IF'('expr')' block
	;

block: '{' statement* '}'
	;

expr: compareExpr
	;

compareExpr: lessExpr ('==' lessExpr)*
	;

lessExpr: plmiExpr ('<' plmiExpr)*
	;

plmiExpr: multExpr (('+'|'-') multExpr)*
	;

multExpr: atom ('*' atom)*
	;

atom: literal 
	| identifier 
	| functionCall 
	| arrayRef 
	| parenExpr
	;

functionCall: identifier'(' exprList ')'
	;

arrayRef: identifier'['expr']' 
	;

parenExpr: '(' expr ')'
	;

exprList: expr exprMore*
	;

exprMore: ',' expr
	;
	
literal: stringconstant 
	| integerconstant 
	| characterconstant 
	| floatconstant 
	| bool
	;

stringconstant: STRINGCONSTANT
	;

floatconstant: FLOATCONSTANT
	;

characterconstant: CHARACTERCONSTANT
	;

integerconstant returns [IntegerLiteral il]
	: i = INTEGERCONSTANT { il = new IntegerLiteral(Integer.parseInt(i.getText())); }
	;

bool: BOOL
	;

/* Lexer */
	 
IF	: 'if'
	;

ELSE	: 'else'
	;

WHILE	: 'while'
	;

PRINT	: 'print'
	;

PRINTLN	: 'println'
	;

RETURN	: 'return'
	;

BOOL	: 'true'
	 |'false'
	;

TYPE	: 'int' 
	  | 'float' 
	  | 'string' 
	  | 'char' 
	  | 'boolean' 
	  | 'void'
	;

ID	: ('a'..'z'|'A'..'Z'|'_')('0'..'9'|'a'..'z'|'A'..'Z'|'_')*
	;

STRINGCONSTANT	: '"'(('a'..'z')|('A'..'Z')|('0'..'9')|'!'|','|'.'|':'|'_'|'{'|'}'|' ')*'"'
	;

INTEGERCONSTANT	: ('0'..'9')+
	;

FLOATCONSTANT	: ('0'..'9')+'.'('0'..'9')+
	;

CHARACTERCONSTANT : '\''('a'..'z'|'A'..'Z'|'0'..'9'|'!'|','|'.'|':'|'_'|'{'|'}')'\''
	;

/* These two lines match whitespace and comments 
 * and ignore them.
 * You want to leave these as last in the file.  
 * Add new lexical rules above 
 */
WS      : ( '\t' | ' ' | ('\r' | '\n') )+ { $channel = HIDDEN;}
        ;

COMMENT : '//' ~('\r' | '\n')* ('\r' | '\n') { $channel = HIDDEN;}
        ;
