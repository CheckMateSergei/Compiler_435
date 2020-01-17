/*
 * Grammar for CSC 435 Compiler Assignment #1
 * Author: Braydon Horcoff V00917594
 */
grammar ulNoActions;

options{
backtrack=true;
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

program : function+ //EOF
	;

function: functionDecl functionBody
	;

functionDecl: compoundType identifier '(' formalParameters? ')'
	;

formalParameters: compoundType identifier moreFormals*
	;

moreFormals: ',' compoundType identifier
	;

functionBody: '{' (varDecl | statement)* '}'
	;

varDecl: compoundType identifier ';'
	;

compoundType: type | type '[' INTEGERCONSTANT ']' 
	;

identifier : ID
	;

type: TYPE
	;

statement:( expr )? ';' |
	identifier '=' expr ';' |
	identifier'['expr']' '=' expr ';'
	;

block: '{' statement* '}'
	;


expr: plmiExpr
	;

//compareExpr: 
//	;

//lessExpr:
//	;

plmiExpr: multExpr (('+'|'-') multExpr)*
	;

multExpr: atom ('*' atom)*
	;

atom: INTEGERCONSTANT |
	identifier |
	identifier'('expr')' |
	identifier'['exprList']' |
	'('expr')'
	;

exprList: expr exprMore*
	;

exprMore: ',' expr
	;
	
	
	

literal: stringconstant |
	INTEGERCONSTANT |
	CHARACTERCONSTANT |
	floatconstant |
	BOOL
	;

stringconstant: '"' CHARACTERCONSTANT* '"'
	;

floatconstant: INTEGERCONSTANT'.'INTEGERCONSTANT
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

BOOL	: 'true'|
	 'false'
	;

OP	: '*' |
	  '+' |
	  '-' |
	  '<' |
	  '=='
	;

TYPE	: 'int'|
	 'float'|
	 'char'|
	 'string'|
	 'boolean'|
	 'void'
	;

INTEGERCONSTANT	: ('0'..'9')+
	;

CHARACTERCONSTANT : '\'' 'a'..'z'|'A'..'Z' '\''
	;

 
ID	: ('a'..'z'|'A'..'Z'|'_')('0'..'9'|'a'..'z'|'A'..'Z'|'_')*
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
