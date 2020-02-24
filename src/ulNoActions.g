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
	:
	// adds any newly created functions to the programs
	// function vector array
	( f = function { p.addFunction(f); } )+ EOF
	;

function returns [Function f]
	// creates a new function with a matched function decl and body
	: fd = functionDecl fb = functionBody { f = new Function(fd, fb); 
						f.line = f.decl.line;
						f.offset = f.decl.offset; }
	;

functionDecl returns [FunctionDecl fd]
	// creates the new function decl object
	: ct = compoundType id = identifier { fd = new FunctionDecl(ct, id); 
						fd.line = fd.id.line;
						fd.offset = fd.id.offset; }
	// adds the new formal parameter to the vector for fd
	'(' ( fp = formalParameters { fd.addFormal(fp); } )? 
	// adds more formals if there are some
	  ( mf = moreFormals { fd.addFormal(mf); } )* ')'	
	;

formalParameters returns [FormalParam fp]
	// creates a new formal parameter and passes it up to its function
	: ct = compoundType id = identifier { fp = new FormalParam(ct, id); 
						fp.line = fp.id.line;
						fp.offset = fp.id.offset; }
	// matches to add more to the parameter list if applicable
	// broken stupid mistake ( mf = moreFormals { fp = mf; })*	
	;

moreFormals returns [FormalParam mf]
	: ',' ct = compoundType id = identifier
	// if comma is matched create another formal param and pass up 
	// to the formal parameter rule to add to the functions parameter list
	{ mf = new FormalParam(ct, id); 
	  mf.line = mf.id.line;
	  mf.offset = mf.id.offset; }
	;

functionBody returns [FunctionBod fb]
@init
{
	// create the new function body object and then add the 
	// statements and variable declarations
	fb = new FunctionBod();
}
	// the appropriate vectors in the new function body object
	: '{' ( vd = varDecl { fb.addVarDecl(vd); })*  
	      ( s = statement { fb.addStatement(s); })* '}'
	;

varDecl returns [VarDecl vd]
	// creates a new variable declaration
	: ct = compoundType id = identifier ';' { vd = new VarDecl(ct, id); 
						  vd.line = vd.id.line;
						  vd.offset = vd.id.offset; }
	;

// returns a regular type for a declaration or an array type declaration
compoundType returns [CompType ct]
	// if it is just a normal type create a comp type object
	:  ad = arrayDecl { ct = ad; 
			    ct.line = ad.line;
			    ct.offset = ad.offset; }
	// if it is an array decl
	| t = TYPE { ct = new CompType(t.getText()); 
			ct.line = t.getLine();
			ct.offset = t.getCharPositionInLine(); }
	;

// passes an array declaration back up to compoundType to pass to varDecl
arrayDecl returns [ArrayDecl ad]
	: t = TYPE '[' il = integerconstant ']'
	// create a new array with type t and size i 
	{ ad = new ArrayDecl(t.getText(), il.getValue()); 
		ad.line = t.getLine();
		ad.offset = t.getCharPositionInLine(); }
	;

// identifier match and object creation
identifier returns [Identifier i]
	: id = ID { i = new Identifier(id.getText()); 
			i.line = id.getLine() ;
			i.offset = id.getCharPositionInLine() ; }
	;

// different kinds of statements, as all are subclasses of Statement we
// just assign s to whichever new object gets created on rule match
statement returns [Statement s]
	: st = semiColon { s = st;  }
	| ec = exprColon { s = ec;  }
	| aas = arrayAssign { s = aas; }
	| idas = idAssign { s = idas; }
	| ie = ifElseBlock { s = ie; }
	| is = ifBlock { s = is; }
	| wh = whileBlock { s = wh; }
	| pl = printlnStmt { s = pl; }
	| ps = printStmt { s = ps; }
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

// assignment of an array cell to an expression
arrayAssign returns [ArrayAssignStmt aas]
	// creates a new array assignment 
	: id = identifier '[' e1 = expr ']' '=' e2 = expr ';'
	  { aas = new ArrayAssignStmt(id, e1, e2); 
		aas.line = id.line;
		aas.offset = id.offset;}
	;

// id assignment statement
idAssign returns [IdAssignStmt idas]
	: id = identifier '=' e = expr ';' { idas = new IdAssignStmt(id, e);
						idas.line = id.line;
						idas.offset = id.offset; }
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
	// add new statments to the blocks list
	: '{' ( s = statement { blok.addToBlock(s); } )* '}'
	;

// enter the expression matrix try not to get lost
expr returns [Expression e]
	// set match a compareExpr
	: it = compareExpr { e = it;
				e.line = it.line;
				e.offset = it.offset; }
	;

// try to match a compare expression 
compareExpr returns [Expression e]
@init
{
	// create a null compare expression
	Expression it = null;
}
@after
{
	// sets e to it if nothing else is matched
	e = it;
}
	// if the expression is matched here instantiate a new CompareExpr
	: le = lessExpr { it = le; 
			it.line = le.line;
			it.offset = le.offset; }
	 ('==' ri = lessExpr { it = new CompareExpr(it, ri);
					it.line = le.line;
					it.offset = le.offset; })*
	;

lessExpr returns [Expression e]
@init
{
	// create a null compare expression
	Expression it = null;
}
@after
{
	// sets e to it if nothing else is matched
	e = it;
}
	// if the expression is matched here instantiate a LessExpr
	: le = plmiExpr { it = le; 
			it.line = le.line;
			it.offset = le.offset; } 
	('<'  ri = plmiExpr { it = new LessExpr(it, ri);
					it.line = le.line;
					it.offset = le.offset;  })*
	;

// try to match a plus minus expression
plmiExpr returns [Expression e]
@init
{
	// create a null compare expression
	Expression it = null;
}
@after
{
	// sets e to it if nothing else is matched
	e = it;
}
	: le = multExpr { it = le;
			it.line = le.line;
			it.offset = le.offset; } 
	(( symbol = '+' ri = multExpr 
	  { it = new PlmiExpr(it, ri, symbol.getText().charAt(0));
 		it.line = le.line;
		it.offset = le.offset; })
	| ( symbol = '-' ri = multExpr 
	  { it = new PlmiExpr(it, ri, symbol.getText().charAt(0));
		it.line = le.line;
		it.offset = le.offset;  }))*
	;

// try to match a mult expression
multExpr returns [Expression e]
@init
{
	// create a null compare expression
	Expression it = null;
}
@after
{
	// sets e to it if nothing else is matched
	e = it;
}
	: le = atom { it = le; 
			it.line = le.line;
			it.offset = le.offset; }
	 ('*' ri = atom { it = new MultExpr(it, ri);
			it.line = le.line;
			it.offset = le.offset; })*
	;

// all my super cool atoms
atom returns [Expression e]
	: l = literal { e = l; 
			e.line = l.line;
			e.offset = l.offset; }
	| id = identifier { e = id; 
				e.line = id.line;
				e.offset = id.offset; }
	| fc = functionCall { e = fc; 
				e.line = fc.id.line;
				e.offset = fc.id.offset; }
	| ar = arrayRef { e = ar; 
				e.line = ar.line;
				e.offset = ar.offset; }
	| pe = parenExpr { e = pe; 
			e.line = pe.line;
			e.offset = pe.offset; }
	;

functionCall returns [FunctionCall fc]
@init
{
	fc = new FunctionCall();
}
	// removes the need for exprList and exprMore
	: id = identifier'(' {  fc.setId(id);
				fc.line = id.line;
				fc.offset = id.offset; } ( e1 = expr { fc.addExpr(e1); } )?
	// if there is more expressions following a comma then add them 
	// to the function calls expression list
	  (',' e2 = expr { fc.addExpr(e2); } )* ')'
	;

arrayRef returns [Expression e]
	: id = identifier'[' e1 = expr ']' { e = new ArrayRef(id, e1); 
						e.line = id.line;
						e.offset = id.offset; } 
	;

parenExpr returns [Expression e]
	: '(' e1 = expr ')' { e = new ParenExpr(e1); 
				e.line = e1.line;
				e.offset = e1.offset; }
	;

// return a matched literal object
literal returns [Literal l]
	: il = integerconstant { l = il;
				l.line = il.line;
				l.offset = il.offset; }
	| fl = floatconstant { l = fl; 
				l.line = fl.line;
				l.offset = fl.offset; }
	| bl = bool { l = bl;
			l.line = bl.line;
			l.offset = bl.offset;  }
	| sl = stringconstant { l = sl;
				l.line = sl.line;
				l.offset = sl.offset; }
	| cl = characterconstant { l = cl; 
					l.line = cl.line;
					l.offset = cl.offset; }
	;

// returns a string literal
stringconstant returns [StringLiteral sl]
	// sets the value of the new string literal to the matched string
	: s = STRINGCONSTANT { sl = new StringLiteral(s.getText());
				sl.line = s.getLine();
				sl.offset = s.getCharPositionInLine(); }
	;

// returns a float literal
floatconstant returns [FloatLiteral fl]
	// sets the value of the float to matched float value
	: f = FLOATCONSTANT { fl = new FloatLiteral(Float.parseFloat(f.getText())); 
				fl.line = f.getLine();
				fl.offset = f.getCharPositionInLine(); }
	;

// returns a character literal
characterconstant returns [CharLiteral cl]
	// sets value of the new char lit to the matched character
	: c = CHARACTERCONSTANT { cl = new CharLiteral(c.getText().charAt(1)); 
				cl.line = c.getLine();
				cl.offset = c.getCharPositionInLine(); }
	;

// returns an integer literal
integerconstant returns [IntegerLiteral il]
	// sets the value of the new int literal to the matched value
	: i = INTEGERCONSTANT { il = new IntegerLiteral(Integer.parseInt(i.getText())); 
				il.line = i.getLine();
				il.offset = i.getCharPositionInLine(); }
	;

// returns a true or false boolean
bool returns [BooleanLiteral bl]
	// set value of the boolean literal
	: b = BOOL { bl = new BooleanLiteral(Boolean.parseBoolean(b.getText())); 
				bl.line = b.getLine();
				bl.offset = b.getCharPositionInLine(); }
	 
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
