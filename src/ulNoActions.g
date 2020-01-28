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

// returns a regular type for a declaration or an array type declaration
compoundType returns [CompType ct]
	// if it is just a normal type create a comp type object
	: t = TYPE { ct = new CompType(t.getText()); }
	// if it is an array decl
	| ad = arrayDecl { ct = ad; }
	;

// passes an array declaration back up to compoundType to pass to varDecl
arrayDecl returns [ArrayDecl ad]
	: t = TYPE '['il = integerconstant']'
	// create a new array with type t and size i 
	{ ad = new ArrayDecl(t.getText(), il.getValue()); }
	;

// identifier match and object creation
identifier returns [Identifier i]
	: id = ID { i = new Identifier(id.getText()); }
	;

// different kinds of statements, as all are subclasses of Statement we
// just assign s to whichever new object gets created on rule match
statement returns [Statement s]
	: st = semiColon { s = st;  }
	| ec = exprColon { s = ec;  }
	| idas = idAssign { s = idas; }
	| aas = arrayAssign { s = aas; }
	| ie = ifElseBlock { s = ie; }
	| is = ifBlock { s = is; }
	| wh = whileBlock { s = wh; }
	| pl = printlnStmt { s = pl; }
	| p = printStmt { s = p; }
	| ret = returnStmt { s = ret; }
	;

// while statement and block rule
whileBlock returns [WhileStmt wh]
	: WHILE'(' e = expr')' b = block { wh = new WhileStmt(e, b); }
	;

// print statement with new line
printlnStmt returns [PrintlnStmt pl]
	: PRINTLN e = expr ';' { pl = new PrintlnStmt(e); }
	;

// normal print statement
printStmt returns [PrintStmt p]
	: PRINT e = expr ';' { p = new PrintStmt(e); }
	;

// returns one or none expressions
returnStmt returns [ReturnStmt ret]
@init
{
	// create the return statement with no expression field
	ret = new ReturnStmt();
}
@after{}
	// sets the expression field to e if expression exists
	: RETURN (e = expr { ret.setExpr(e); })? ';'
	;

// statment with just a semicolon
semiColon returns [SemiStatement st]
	: ';' { st = new SemiStatement(); }
	;

// statement with just an expression and a semi colon
exprColon returns [ExColonStmt ec]
	: e = expr ';' { ec = new ExColonStmt(e); }
	;

// id assignment statement
idAssign returns [IdAssignStmt idas]
	: id = identifier '=' e = expr ';' { idas = new IdAssignStmt(id, e); }
	;

// assignment of an array cell to an expression
arrayAssign returns [ArrayAssignStmt aas]
	: id = identifier '[' e1 = expr']' '=' e2 = expr ';'
	  { aas = new ArrayAssignStmt(id, e1, e2); }
	;

// if else statement, must go before if statement
ifElseBlock returns [IfElseStmt ie]
	: IF'('e = expr')' b1 = block ELSE b2 = block
	  { ie = new IfElseStmt(e, b1, b2); }
	;

// if statement without else
ifBlock returns [IfStmt is]
	: IF'('e = expr')' b = block { is = new IfStmt(e, b); }
	;

// code blocks filled with statements
block returns [Block blok]
@init
{
	// create a new block object with empty stmt list
	blok = new Block();
}
@after{}
	// add new statments to the blocks list
	: '{' ( s = statement { blok.addToBlock(s); } )* '}'
	;

expr returns [Expression e]
	: l = literal { e = l; } //compareExpr
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
	
// return a matched literal object
literal returns [Literal l]
	: sl = stringconstant { l = sl;}
	| il = integerconstant { l = il; }
	| cl = characterconstant { l = cl; }
	| fl = floatconstant { l = fl; }
	| bl = bool { l = bl; }
	;

// returns a string literal
stringconstant returns [StringLiteral sl]
	// sets the value of the new string literal to the matched string
	: s = STRINGCONSTANT { sl = new StringLiteral(s.getText()); }
	;

// returns a float literal
floatconstant returns [FloatLiteral fl]
	// sets the value of the float to matched float value
	: f = FLOATCONSTANT { fl = new FloatLiteral(Float.parseFloat(f.getText())); }
	;

// returns a character literal
characterconstant returns [CharLiteral cl]
	// sets value of the new char lit to the matched character
	: c = CHARACTERCONSTANT { cl = new CharLiteral(c.getText().charAt(0)); }
	;

// returns an integer literal
integerconstant returns [IntegerLiteral il]
	// sets the value of the new int literal to the matched value
	: i = INTEGERCONSTANT { il = new IntegerLiteral(Integer.parseInt(i.getText())); }
	;

// returns a true or false boolean
bool returns [BooleanLiteral bl]
	// set value of the boolean literal
	: b = BOOL { bl = new BooleanLiteral(Boolean.parseBoolean(b.getText())); }
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
