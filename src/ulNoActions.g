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

program : function+ EOF
	;

function: functionDecl functionBody
	;

functionDecl: compoundType identifier '(' formalParameters? ')'
	;

formalParameters: compoundType identifier moreFormals*
	;

moreFormals: ',' compoundType identifier
	;

functionBody: '{' varDecl*  statement* '}'
	;

varDecl: compoundType identifier ';'
	;

compoundType: type |
	  arrayDecl
	;

arrayDecl: type'['integerconstant']'
	;

identifier : ID
	;

type: TYPE
	;

statement: semiColon |
	exprColon |
	idAssign |
	arrayAssign |
	ifElseBlock |
	ifBlock |
	whileBlock |
	printlnStmt |
	printStmt |
	returnStmt
	;

whileBlock: WHILE'(' expr')' block
	;

printlnStmt: PRINTLN expr ';'
	;

printStmt: PRINT expr ';'
	;

returnStmt: RETURN expr? ';'
	;

semiColon: ';'
	;

exprColon: expr ';'
	;

idAssign: identifier '=' expr ';'
	;

arrayAssign: identifier '[' expr']' '=' expr ';'
	;

ifBlock: IF'('expr')' block
	;

ifElseBlock: IF'('expr')' block ELSE block
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

atom: literal |
	identifier |
	functionCall |
	arrayRef |	
	parenExpr
	;

functionCall: identifier'(' expr ')'
	;

arrayRef: identifier'['exprList']' 
	;

parenExpr: '(' expr ')'
	;

exprList: expr exprMore*
	;

exprMore: ',' expr
	;
	
literal: stringconstant |
	integerconstant |
	characterconstant |
	floatconstant |
	bool
	;

stringconstant: STRINGCONSTANT
	;

floatconstant: FLOATCONSTANT
	;

characterconstant: CHARACTERCONSTANT
	;

integerconstant: INTEGERCONSTANT
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

BOOL	: 'true'|
	 'false'
	;

TYPE	: 'int' |
	  'float' |
	  'string' |
	  'char' |
	  'boolean' |
	  'void'
	;

ID	: ('a'..'z'|'A'..'Z'|'_')('0'..'9'|'a'..'z'|'A'..'Z'|'_')*
	;

STRINGCONSTANT	: '\"'(('a'..'z')|('A'..'Z')|('0'..'9')|'!'|','|'.'|':'|'_'|'{'|'}'|' ')*'\"'
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
