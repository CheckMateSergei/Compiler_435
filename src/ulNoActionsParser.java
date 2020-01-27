// $ANTLR 3.5.2 ./src/ulNoActions.g 2020-01-27 10:08:50

import src.packages.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class ulNoActionsParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "BOOL", "CHARACTERCONSTANT", "COMMENT", 
		"ELSE", "FLOATCONSTANT", "ID", "IF", "INTEGERCONSTANT", "PRINT", "PRINTLN", 
		"RETURN", "STRINGCONSTANT", "TYPE", "WHILE", "WS", "'('", "')'", "'*'", 
		"'+'", "','", "'-'", "';'", "'<'", "'='", "'=='", "'['", "']'", "'{'", 
		"'}'"
	};
	public static final int EOF=-1;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int BOOL=4;
	public static final int CHARACTERCONSTANT=5;
	public static final int COMMENT=6;
	public static final int ELSE=7;
	public static final int FLOATCONSTANT=8;
	public static final int ID=9;
	public static final int IF=10;
	public static final int INTEGERCONSTANT=11;
	public static final int PRINT=12;
	public static final int PRINTLN=13;
	public static final int RETURN=14;
	public static final int STRINGCONSTANT=15;
	public static final int TYPE=16;
	public static final int WHILE=17;
	public static final int WS=18;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public ulNoActionsParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public ulNoActionsParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return ulNoActionsParser.tokenNames; }
	@Override public String getGrammarFileName() { return "./src/ulNoActions.g"; }


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



	// $ANTLR start "program"
	// ./src/ulNoActions.g:50:1: program returns [Program p] : (f= function )+ EOF ;
	public final Program program() throws RecognitionException {
		Program p = null;


		Function f =null;


			p = new Program();

		try {
			// ./src/ulNoActions.g:58:2: ( (f= function )+ EOF )
			// ./src/ulNoActions.g:61:2: (f= function )+ EOF
			{
			// ./src/ulNoActions.g:61:2: (f= function )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==TYPE) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// ./src/ulNoActions.g:61:4: f= function
					{
					pushFollow(FOLLOW_function_in_program75);
					f=function();
					state._fsp--;
					if (state.failed) return p;
					if ( state.backtracking==0 ) { p.addFunction(f); }
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					if (state.backtracking>0) {state.failed=true; return p;}
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			match(input,EOF,FOLLOW_EOF_in_program82); if (state.failed) return p;
			}

			if ( state.backtracking==0 ) {
			}
		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
		return p;
	}
	// $ANTLR end "program"



	// $ANTLR start "function"
	// ./src/ulNoActions.g:64:1: function returns [Function f] : fd= functionDecl fb= functionBody ;
	public final Function function() throws RecognitionException {
		Function f = null;


		FunctionDecl fd =null;

		try {
			// ./src/ulNoActions.g:66:2: (fd= functionDecl fb= functionBody )
			// ./src/ulNoActions.g:66:4: fd= functionDecl fb= functionBody
			{
			pushFollow(FOLLOW_functionDecl_in_function103);
			fd=functionDecl();
			state._fsp--;
			if (state.failed) return f;
			pushFollow(FOLLOW_functionBody_in_function109);
			functionBody();
			state._fsp--;
			if (state.failed) return f;
			if ( state.backtracking==0 ) { f = new Function(fd, fb); }
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
		return f;
	}
	// $ANTLR end "function"



	// $ANTLR start "functionDecl"
	// ./src/ulNoActions.g:69:1: functionDecl returns [FunctionDecl fd] : ct= compoundType id= identifier '(' (fp= formalParameters )? ')' ;
	public final FunctionDecl functionDecl() throws RecognitionException {
		FunctionDecl fd = null;


		FormalParam fp =null;

		try {
			// ./src/ulNoActions.g:71:2: (ct= compoundType id= identifier '(' (fp= formalParameters )? ')' )
			// ./src/ulNoActions.g:71:4: ct= compoundType id= identifier '(' (fp= formalParameters )? ')'
			{
			pushFollow(FOLLOW_compoundType_in_functionDecl132);
			compoundType();
			state._fsp--;
			if (state.failed) return fd;
			pushFollow(FOLLOW_identifier_in_functionDecl138);
			identifier();
			state._fsp--;
			if (state.failed) return fd;
			if ( state.backtracking==0 ) { fd = new FunctionDecl(ct, id); }
			match(input,19,FOLLOW_19_in_functionDecl145); if (state.failed) return fd;
			// ./src/ulNoActions.g:73:6: (fp= formalParameters )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==TYPE) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// ./src/ulNoActions.g:73:8: fp= formalParameters
					{
					pushFollow(FOLLOW_formalParameters_in_functionDecl153);
					fp=formalParameters();
					state._fsp--;
					if (state.failed) return fd;
					}
					break;

			}

			match(input,20,FOLLOW_20_in_functionDecl158); if (state.failed) return fd;
			if ( state.backtracking==0 ) { fd.addFormal(fp); }
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
		return fd;
	}
	// $ANTLR end "functionDecl"



	// $ANTLR start "formalParameters"
	// ./src/ulNoActions.g:76:1: formalParameters returns [FormalParam fp] : ct= compoundType id= identifier (mf= moreFormals )* ;
	public final FormalParam formalParameters() throws RecognitionException {
		FormalParam fp = null;


		FormalParam mf =null;

		try {
			// ./src/ulNoActions.g:78:2: (ct= compoundType id= identifier (mf= moreFormals )* )
			// ./src/ulNoActions.g:78:4: ct= compoundType id= identifier (mf= moreFormals )*
			{
			pushFollow(FOLLOW_compoundType_in_formalParameters181);
			compoundType();
			state._fsp--;
			if (state.failed) return fp;
			pushFollow(FOLLOW_identifier_in_formalParameters187);
			identifier();
			state._fsp--;
			if (state.failed) return fp;
			if ( state.backtracking==0 ) { fp = new FormalParam(ct, id); }
			// ./src/ulNoActions.g:80:4: (mf= moreFormals )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==23) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// ./src/ulNoActions.g:80:6: mf= moreFormals
					{
					pushFollow(FOLLOW_moreFormals_in_formalParameters202);
					mf=moreFormals();
					state._fsp--;
					if (state.failed) return fp;
					}
					break;

				default :
					break loop3;
				}
			}

			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
		return fp;
	}
	// $ANTLR end "formalParameters"



	// $ANTLR start "moreFormals"
	// ./src/ulNoActions.g:83:1: moreFormals returns [FormalParam mf] : ',' ct= compoundType id= identifier ;
	public final FormalParam moreFormals() throws RecognitionException {
		FormalParam mf = null;


		try {
			// ./src/ulNoActions.g:84:2: ( ',' ct= compoundType id= identifier )
			// ./src/ulNoActions.g:84:4: ',' ct= compoundType id= identifier
			{
			match(input,23,FOLLOW_23_in_moreFormals221); if (state.failed) return mf;
			pushFollow(FOLLOW_compoundType_in_moreFormals227);
			compoundType();
			state._fsp--;
			if (state.failed) return mf;
			pushFollow(FOLLOW_identifier_in_moreFormals233);
			identifier();
			state._fsp--;
			if (state.failed) return mf;
			if ( state.backtracking==0 ) { mf = new FormalParam(ct, id); }
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
		return mf;
	}
	// $ANTLR end "moreFormals"



	// $ANTLR start "functionBody"
	// ./src/ulNoActions.g:90:1: functionBody : '{' ( varDecl )* ( statement )* '}' ;
	public final void functionBody() throws RecognitionException {
		try {
			// ./src/ulNoActions.g:90:13: ( '{' ( varDecl )* ( statement )* '}' )
			// ./src/ulNoActions.g:90:15: '{' ( varDecl )* ( statement )* '}'
			{
			match(input,31,FOLLOW_31_in_functionBody249); if (state.failed) return;
			// ./src/ulNoActions.g:90:19: ( varDecl )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==TYPE) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// ./src/ulNoActions.g:90:19: varDecl
					{
					pushFollow(FOLLOW_varDecl_in_functionBody251);
					varDecl();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop4;
				}
			}

			// ./src/ulNoActions.g:90:29: ( statement )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= BOOL && LA5_0 <= CHARACTERCONSTANT)||(LA5_0 >= FLOATCONSTANT && LA5_0 <= STRINGCONSTANT)||LA5_0==WHILE||LA5_0==19||LA5_0==25) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// ./src/ulNoActions.g:90:29: statement
					{
					pushFollow(FOLLOW_statement_in_functionBody255);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop5;
				}
			}

			match(input,32,FOLLOW_32_in_functionBody258); if (state.failed) return;
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "functionBody"



	// $ANTLR start "varDecl"
	// ./src/ulNoActions.g:93:1: varDecl : compoundType identifier ';' ;
	public final void varDecl() throws RecognitionException {
		try {
			// ./src/ulNoActions.g:93:8: ( compoundType identifier ';' )
			// ./src/ulNoActions.g:93:10: compoundType identifier ';'
			{
			pushFollow(FOLLOW_compoundType_in_varDecl267);
			compoundType();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_identifier_in_varDecl269);
			identifier();
			state._fsp--;
			if (state.failed) return;
			match(input,25,FOLLOW_25_in_varDecl271); if (state.failed) return;
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "varDecl"



	// $ANTLR start "compoundType"
	// ./src/ulNoActions.g:96:1: compoundType : ( type | arrayDecl );
	public final void compoundType() throws RecognitionException {
		try {
			// ./src/ulNoActions.g:96:13: ( type | arrayDecl )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==TYPE) ) {
				int LA6_1 = input.LA(2);
				if ( (LA6_1==ID) ) {
					alt6=1;
				}
				else if ( (LA6_1==29) ) {
					alt6=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// ./src/ulNoActions.g:96:15: type
					{
					pushFollow(FOLLOW_type_in_compoundType280);
					type();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// ./src/ulNoActions.g:97:4: arrayDecl
					{
					pushFollow(FOLLOW_arrayDecl_in_compoundType287);
					arrayDecl();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "compoundType"



	// $ANTLR start "arrayDecl"
	// ./src/ulNoActions.g:100:1: arrayDecl : type '[' integerconstant ']' ;
	public final void arrayDecl() throws RecognitionException {
		try {
			// ./src/ulNoActions.g:100:10: ( type '[' integerconstant ']' )
			// ./src/ulNoActions.g:100:12: type '[' integerconstant ']'
			{
			pushFollow(FOLLOW_type_in_arrayDecl296);
			type();
			state._fsp--;
			if (state.failed) return;
			match(input,29,FOLLOW_29_in_arrayDecl297); if (state.failed) return;
			pushFollow(FOLLOW_integerconstant_in_arrayDecl298);
			integerconstant();
			state._fsp--;
			if (state.failed) return;
			match(input,30,FOLLOW_30_in_arrayDecl299); if (state.failed) return;
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "arrayDecl"



	// $ANTLR start "identifier"
	// ./src/ulNoActions.g:103:1: identifier : ID ;
	public final void identifier() throws RecognitionException {
		try {
			// ./src/ulNoActions.g:103:12: ( ID )
			// ./src/ulNoActions.g:103:14: ID
			{
			match(input,ID,FOLLOW_ID_in_identifier309); if (state.failed) return;
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "identifier"



	// $ANTLR start "type"
	// ./src/ulNoActions.g:106:1: type : TYPE ;
	public final void type() throws RecognitionException {
		try {
			// ./src/ulNoActions.g:106:5: ( TYPE )
			// ./src/ulNoActions.g:106:7: TYPE
			{
			match(input,TYPE,FOLLOW_TYPE_in_type318); if (state.failed) return;
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "type"



	// $ANTLR start "statement"
	// ./src/ulNoActions.g:109:1: statement : ( semiColon | exprColon | idAssign | arrayAssign | ifElseBlock | ifBlock | whileBlock | printlnStmt | printStmt | returnStmt );
	public final void statement() throws RecognitionException {
		try {
			// ./src/ulNoActions.g:109:10: ( semiColon | exprColon | idAssign | arrayAssign | ifElseBlock | ifBlock | whileBlock | printlnStmt | printStmt | returnStmt )
			int alt7=10;
			switch ( input.LA(1) ) {
			case 25:
				{
				alt7=1;
				}
				break;
			case BOOL:
			case CHARACTERCONSTANT:
			case FLOATCONSTANT:
			case INTEGERCONSTANT:
			case STRINGCONSTANT:
			case 19:
				{
				alt7=2;
				}
				break;
			case ID:
				{
				int LA7_7 = input.LA(2);
				if ( (synpred8_ulNoActions()) ) {
					alt7=2;
				}
				else if ( (synpred9_ulNoActions()) ) {
					alt7=3;
				}
				else if ( (synpred10_ulNoActions()) ) {
					alt7=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 7, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case IF:
				{
				int LA7_9 = input.LA(2);
				if ( (synpred11_ulNoActions()) ) {
					alt7=5;
				}
				else if ( (synpred12_ulNoActions()) ) {
					alt7=6;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 7, 9, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case WHILE:
				{
				alt7=7;
				}
				break;
			case PRINTLN:
				{
				alt7=8;
				}
				break;
			case PRINT:
				{
				alt7=9;
				}
				break;
			case RETURN:
				{
				alt7=10;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// ./src/ulNoActions.g:109:12: semiColon
					{
					pushFollow(FOLLOW_semiColon_in_statement327);
					semiColon();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// ./src/ulNoActions.g:110:2: exprColon
					{
					pushFollow(FOLLOW_exprColon_in_statement332);
					exprColon();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// ./src/ulNoActions.g:111:2: idAssign
					{
					pushFollow(FOLLOW_idAssign_in_statement337);
					idAssign();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// ./src/ulNoActions.g:112:2: arrayAssign
					{
					pushFollow(FOLLOW_arrayAssign_in_statement342);
					arrayAssign();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					// ./src/ulNoActions.g:113:2: ifElseBlock
					{
					pushFollow(FOLLOW_ifElseBlock_in_statement347);
					ifElseBlock();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					// ./src/ulNoActions.g:114:2: ifBlock
					{
					pushFollow(FOLLOW_ifBlock_in_statement352);
					ifBlock();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 7 :
					// ./src/ulNoActions.g:115:2: whileBlock
					{
					pushFollow(FOLLOW_whileBlock_in_statement357);
					whileBlock();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 8 :
					// ./src/ulNoActions.g:116:2: printlnStmt
					{
					pushFollow(FOLLOW_printlnStmt_in_statement362);
					printlnStmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 9 :
					// ./src/ulNoActions.g:117:2: printStmt
					{
					pushFollow(FOLLOW_printStmt_in_statement367);
					printStmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 10 :
					// ./src/ulNoActions.g:118:2: returnStmt
					{
					pushFollow(FOLLOW_returnStmt_in_statement372);
					returnStmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "statement"



	// $ANTLR start "whileBlock"
	// ./src/ulNoActions.g:121:1: whileBlock : WHILE '(' expr ')' block ;
	public final void whileBlock() throws RecognitionException {
		try {
			// ./src/ulNoActions.g:121:11: ( WHILE '(' expr ')' block )
			// ./src/ulNoActions.g:121:13: WHILE '(' expr ')' block
			{
			match(input,WHILE,FOLLOW_WHILE_in_whileBlock381); if (state.failed) return;
			match(input,19,FOLLOW_19_in_whileBlock382); if (state.failed) return;
			pushFollow(FOLLOW_expr_in_whileBlock384);
			expr();
			state._fsp--;
			if (state.failed) return;
			match(input,20,FOLLOW_20_in_whileBlock385); if (state.failed) return;
			pushFollow(FOLLOW_block_in_whileBlock387);
			block();
			state._fsp--;
			if (state.failed) return;
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "whileBlock"



	// $ANTLR start "printlnStmt"
	// ./src/ulNoActions.g:124:1: printlnStmt : PRINTLN expr ';' ;
	public final void printlnStmt() throws RecognitionException {
		try {
			// ./src/ulNoActions.g:124:12: ( PRINTLN expr ';' )
			// ./src/ulNoActions.g:124:14: PRINTLN expr ';'
			{
			match(input,PRINTLN,FOLLOW_PRINTLN_in_printlnStmt396); if (state.failed) return;
			pushFollow(FOLLOW_expr_in_printlnStmt398);
			expr();
			state._fsp--;
			if (state.failed) return;
			match(input,25,FOLLOW_25_in_printlnStmt400); if (state.failed) return;
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "printlnStmt"



	// $ANTLR start "printStmt"
	// ./src/ulNoActions.g:127:1: printStmt : PRINT expr ';' ;
	public final void printStmt() throws RecognitionException {
		try {
			// ./src/ulNoActions.g:127:10: ( PRINT expr ';' )
			// ./src/ulNoActions.g:127:12: PRINT expr ';'
			{
			match(input,PRINT,FOLLOW_PRINT_in_printStmt409); if (state.failed) return;
			pushFollow(FOLLOW_expr_in_printStmt411);
			expr();
			state._fsp--;
			if (state.failed) return;
			match(input,25,FOLLOW_25_in_printStmt413); if (state.failed) return;
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "printStmt"



	// $ANTLR start "returnStmt"
	// ./src/ulNoActions.g:130:1: returnStmt : RETURN ( expr )? ';' ;
	public final void returnStmt() throws RecognitionException {
		try {
			// ./src/ulNoActions.g:130:11: ( RETURN ( expr )? ';' )
			// ./src/ulNoActions.g:130:13: RETURN ( expr )? ';'
			{
			match(input,RETURN,FOLLOW_RETURN_in_returnStmt422); if (state.failed) return;
			// ./src/ulNoActions.g:130:20: ( expr )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( ((LA8_0 >= BOOL && LA8_0 <= CHARACTERCONSTANT)||(LA8_0 >= FLOATCONSTANT && LA8_0 <= ID)||LA8_0==INTEGERCONSTANT||LA8_0==STRINGCONSTANT||LA8_0==19) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// ./src/ulNoActions.g:130:20: expr
					{
					pushFollow(FOLLOW_expr_in_returnStmt424);
					expr();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,25,FOLLOW_25_in_returnStmt427); if (state.failed) return;
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "returnStmt"



	// $ANTLR start "semiColon"
	// ./src/ulNoActions.g:133:1: semiColon : ';' ;
	public final void semiColon() throws RecognitionException {
		try {
			// ./src/ulNoActions.g:133:10: ( ';' )
			// ./src/ulNoActions.g:133:12: ';'
			{
			match(input,25,FOLLOW_25_in_semiColon436); if (state.failed) return;
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "semiColon"



	// $ANTLR start "exprColon"
	// ./src/ulNoActions.g:136:1: exprColon : expr ';' ;
	public final void exprColon() throws RecognitionException {
		try {
			// ./src/ulNoActions.g:136:10: ( expr ';' )
			// ./src/ulNoActions.g:136:12: expr ';'
			{
			pushFollow(FOLLOW_expr_in_exprColon445);
			expr();
			state._fsp--;
			if (state.failed) return;
			match(input,25,FOLLOW_25_in_exprColon447); if (state.failed) return;
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "exprColon"



	// $ANTLR start "idAssign"
	// ./src/ulNoActions.g:139:1: idAssign : identifier '=' expr ';' ;
	public final void idAssign() throws RecognitionException {
		try {
			// ./src/ulNoActions.g:139:9: ( identifier '=' expr ';' )
			// ./src/ulNoActions.g:139:11: identifier '=' expr ';'
			{
			pushFollow(FOLLOW_identifier_in_idAssign456);
			identifier();
			state._fsp--;
			if (state.failed) return;
			match(input,27,FOLLOW_27_in_idAssign458); if (state.failed) return;
			pushFollow(FOLLOW_expr_in_idAssign460);
			expr();
			state._fsp--;
			if (state.failed) return;
			match(input,25,FOLLOW_25_in_idAssign462); if (state.failed) return;
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "idAssign"



	// $ANTLR start "arrayAssign"
	// ./src/ulNoActions.g:142:1: arrayAssign : identifier '[' expr ']' '=' expr ';' ;
	public final void arrayAssign() throws RecognitionException {
		try {
			// ./src/ulNoActions.g:142:12: ( identifier '[' expr ']' '=' expr ';' )
			// ./src/ulNoActions.g:142:14: identifier '[' expr ']' '=' expr ';'
			{
			pushFollow(FOLLOW_identifier_in_arrayAssign471);
			identifier();
			state._fsp--;
			if (state.failed) return;
			match(input,29,FOLLOW_29_in_arrayAssign473); if (state.failed) return;
			pushFollow(FOLLOW_expr_in_arrayAssign475);
			expr();
			state._fsp--;
			if (state.failed) return;
			match(input,30,FOLLOW_30_in_arrayAssign476); if (state.failed) return;
			match(input,27,FOLLOW_27_in_arrayAssign478); if (state.failed) return;
			pushFollow(FOLLOW_expr_in_arrayAssign480);
			expr();
			state._fsp--;
			if (state.failed) return;
			match(input,25,FOLLOW_25_in_arrayAssign482); if (state.failed) return;
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "arrayAssign"



	// $ANTLR start "ifElseBlock"
	// ./src/ulNoActions.g:145:1: ifElseBlock : IF '(' expr ')' block ELSE block ;
	public final void ifElseBlock() throws RecognitionException {
		try {
			// ./src/ulNoActions.g:145:12: ( IF '(' expr ')' block ELSE block )
			// ./src/ulNoActions.g:145:14: IF '(' expr ')' block ELSE block
			{
			match(input,IF,FOLLOW_IF_in_ifElseBlock491); if (state.failed) return;
			match(input,19,FOLLOW_19_in_ifElseBlock492); if (state.failed) return;
			pushFollow(FOLLOW_expr_in_ifElseBlock493);
			expr();
			state._fsp--;
			if (state.failed) return;
			match(input,20,FOLLOW_20_in_ifElseBlock494); if (state.failed) return;
			pushFollow(FOLLOW_block_in_ifElseBlock496);
			block();
			state._fsp--;
			if (state.failed) return;
			match(input,ELSE,FOLLOW_ELSE_in_ifElseBlock498); if (state.failed) return;
			pushFollow(FOLLOW_block_in_ifElseBlock500);
			block();
			state._fsp--;
			if (state.failed) return;
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ifElseBlock"



	// $ANTLR start "ifBlock"
	// ./src/ulNoActions.g:148:1: ifBlock : IF '(' expr ')' block ;
	public final void ifBlock() throws RecognitionException {
		try {
			// ./src/ulNoActions.g:148:8: ( IF '(' expr ')' block )
			// ./src/ulNoActions.g:148:10: IF '(' expr ')' block
			{
			match(input,IF,FOLLOW_IF_in_ifBlock509); if (state.failed) return;
			match(input,19,FOLLOW_19_in_ifBlock510); if (state.failed) return;
			pushFollow(FOLLOW_expr_in_ifBlock511);
			expr();
			state._fsp--;
			if (state.failed) return;
			match(input,20,FOLLOW_20_in_ifBlock512); if (state.failed) return;
			pushFollow(FOLLOW_block_in_ifBlock514);
			block();
			state._fsp--;
			if (state.failed) return;
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ifBlock"



	// $ANTLR start "block"
	// ./src/ulNoActions.g:151:1: block : '{' ( statement )* '}' ;
	public final void block() throws RecognitionException {
		try {
			// ./src/ulNoActions.g:151:6: ( '{' ( statement )* '}' )
			// ./src/ulNoActions.g:151:8: '{' ( statement )* '}'
			{
			match(input,31,FOLLOW_31_in_block523); if (state.failed) return;
			// ./src/ulNoActions.g:151:12: ( statement )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( ((LA9_0 >= BOOL && LA9_0 <= CHARACTERCONSTANT)||(LA9_0 >= FLOATCONSTANT && LA9_0 <= STRINGCONSTANT)||LA9_0==WHILE||LA9_0==19||LA9_0==25) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// ./src/ulNoActions.g:151:12: statement
					{
					pushFollow(FOLLOW_statement_in_block525);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop9;
				}
			}

			match(input,32,FOLLOW_32_in_block528); if (state.failed) return;
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "block"



	// $ANTLR start "expr"
	// ./src/ulNoActions.g:154:1: expr : compareExpr ;
	public final void expr() throws RecognitionException {
		try {
			// ./src/ulNoActions.g:154:5: ( compareExpr )
			// ./src/ulNoActions.g:154:7: compareExpr
			{
			pushFollow(FOLLOW_compareExpr_in_expr537);
			compareExpr();
			state._fsp--;
			if (state.failed) return;
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "expr"



	// $ANTLR start "compareExpr"
	// ./src/ulNoActions.g:157:1: compareExpr : lessExpr ( '==' lessExpr )* ;
	public final void compareExpr() throws RecognitionException {
		try {
			// ./src/ulNoActions.g:157:12: ( lessExpr ( '==' lessExpr )* )
			// ./src/ulNoActions.g:157:14: lessExpr ( '==' lessExpr )*
			{
			pushFollow(FOLLOW_lessExpr_in_compareExpr546);
			lessExpr();
			state._fsp--;
			if (state.failed) return;
			// ./src/ulNoActions.g:157:23: ( '==' lessExpr )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==28) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// ./src/ulNoActions.g:157:24: '==' lessExpr
					{
					match(input,28,FOLLOW_28_in_compareExpr549); if (state.failed) return;
					pushFollow(FOLLOW_lessExpr_in_compareExpr551);
					lessExpr();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop10;
				}
			}

			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "compareExpr"



	// $ANTLR start "lessExpr"
	// ./src/ulNoActions.g:160:1: lessExpr : plmiExpr ( '<' plmiExpr )* ;
	public final void lessExpr() throws RecognitionException {
		try {
			// ./src/ulNoActions.g:160:9: ( plmiExpr ( '<' plmiExpr )* )
			// ./src/ulNoActions.g:160:11: plmiExpr ( '<' plmiExpr )*
			{
			pushFollow(FOLLOW_plmiExpr_in_lessExpr562);
			plmiExpr();
			state._fsp--;
			if (state.failed) return;
			// ./src/ulNoActions.g:160:20: ( '<' plmiExpr )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==26) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// ./src/ulNoActions.g:160:21: '<' plmiExpr
					{
					match(input,26,FOLLOW_26_in_lessExpr565); if (state.failed) return;
					pushFollow(FOLLOW_plmiExpr_in_lessExpr567);
					plmiExpr();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop11;
				}
			}

			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "lessExpr"



	// $ANTLR start "plmiExpr"
	// ./src/ulNoActions.g:163:1: plmiExpr : multExpr ( ( '+' | '-' ) multExpr )* ;
	public final void plmiExpr() throws RecognitionException {
		try {
			// ./src/ulNoActions.g:163:9: ( multExpr ( ( '+' | '-' ) multExpr )* )
			// ./src/ulNoActions.g:163:11: multExpr ( ( '+' | '-' ) multExpr )*
			{
			pushFollow(FOLLOW_multExpr_in_plmiExpr578);
			multExpr();
			state._fsp--;
			if (state.failed) return;
			// ./src/ulNoActions.g:163:20: ( ( '+' | '-' ) multExpr )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==22||LA12_0==24) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// ./src/ulNoActions.g:163:21: ( '+' | '-' ) multExpr
					{
					if ( input.LA(1)==22||input.LA(1)==24 ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_multExpr_in_plmiExpr587);
					multExpr();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop12;
				}
			}

			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "plmiExpr"



	// $ANTLR start "multExpr"
	// ./src/ulNoActions.g:166:1: multExpr : atom ( '*' atom )* ;
	public final void multExpr() throws RecognitionException {
		try {
			// ./src/ulNoActions.g:166:9: ( atom ( '*' atom )* )
			// ./src/ulNoActions.g:166:11: atom ( '*' atom )*
			{
			pushFollow(FOLLOW_atom_in_multExpr598);
			atom();
			state._fsp--;
			if (state.failed) return;
			// ./src/ulNoActions.g:166:16: ( '*' atom )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==21) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// ./src/ulNoActions.g:166:17: '*' atom
					{
					match(input,21,FOLLOW_21_in_multExpr601); if (state.failed) return;
					pushFollow(FOLLOW_atom_in_multExpr603);
					atom();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop13;
				}
			}

			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "multExpr"



	// $ANTLR start "atom"
	// ./src/ulNoActions.g:169:1: atom : ( literal | identifier | functionCall | arrayRef | parenExpr );
	public final void atom() throws RecognitionException {
		try {
			// ./src/ulNoActions.g:169:5: ( literal | identifier | functionCall | arrayRef | parenExpr )
			int alt14=5;
			switch ( input.LA(1) ) {
			case BOOL:
			case CHARACTERCONSTANT:
			case FLOATCONSTANT:
			case INTEGERCONSTANT:
			case STRINGCONSTANT:
				{
				alt14=1;
				}
				break;
			case ID:
				{
				switch ( input.LA(2) ) {
				case EOF:
				case 20:
				case 21:
				case 22:
				case 23:
				case 24:
				case 25:
				case 26:
				case 28:
				case 30:
					{
					alt14=2;
					}
					break;
				case 19:
					{
					alt14=3;
					}
					break;
				case 29:
					{
					alt14=4;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 14, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 19:
				{
				alt14=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}
			switch (alt14) {
				case 1 :
					// ./src/ulNoActions.g:169:7: literal
					{
					pushFollow(FOLLOW_literal_in_atom614);
					literal();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// ./src/ulNoActions.g:170:2: identifier
					{
					pushFollow(FOLLOW_identifier_in_atom619);
					identifier();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// ./src/ulNoActions.g:171:2: functionCall
					{
					pushFollow(FOLLOW_functionCall_in_atom624);
					functionCall();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// ./src/ulNoActions.g:172:2: arrayRef
					{
					pushFollow(FOLLOW_arrayRef_in_atom629);
					arrayRef();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					// ./src/ulNoActions.g:173:2: parenExpr
					{
					pushFollow(FOLLOW_parenExpr_in_atom635);
					parenExpr();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "atom"



	// $ANTLR start "functionCall"
	// ./src/ulNoActions.g:176:1: functionCall : identifier '(' exprList ')' ;
	public final void functionCall() throws RecognitionException {
		try {
			// ./src/ulNoActions.g:176:13: ( identifier '(' exprList ')' )
			// ./src/ulNoActions.g:176:15: identifier '(' exprList ')'
			{
			pushFollow(FOLLOW_identifier_in_functionCall644);
			identifier();
			state._fsp--;
			if (state.failed) return;
			match(input,19,FOLLOW_19_in_functionCall645); if (state.failed) return;
			pushFollow(FOLLOW_exprList_in_functionCall647);
			exprList();
			state._fsp--;
			if (state.failed) return;
			match(input,20,FOLLOW_20_in_functionCall649); if (state.failed) return;
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "functionCall"



	// $ANTLR start "arrayRef"
	// ./src/ulNoActions.g:179:1: arrayRef : identifier '[' expr ']' ;
	public final void arrayRef() throws RecognitionException {
		try {
			// ./src/ulNoActions.g:179:9: ( identifier '[' expr ']' )
			// ./src/ulNoActions.g:179:11: identifier '[' expr ']'
			{
			pushFollow(FOLLOW_identifier_in_arrayRef658);
			identifier();
			state._fsp--;
			if (state.failed) return;
			match(input,29,FOLLOW_29_in_arrayRef659); if (state.failed) return;
			pushFollow(FOLLOW_expr_in_arrayRef660);
			expr();
			state._fsp--;
			if (state.failed) return;
			match(input,30,FOLLOW_30_in_arrayRef661); if (state.failed) return;
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "arrayRef"



	// $ANTLR start "parenExpr"
	// ./src/ulNoActions.g:182:1: parenExpr : '(' expr ')' ;
	public final void parenExpr() throws RecognitionException {
		try {
			// ./src/ulNoActions.g:182:10: ( '(' expr ')' )
			// ./src/ulNoActions.g:182:12: '(' expr ')'
			{
			match(input,19,FOLLOW_19_in_parenExpr671); if (state.failed) return;
			pushFollow(FOLLOW_expr_in_parenExpr673);
			expr();
			state._fsp--;
			if (state.failed) return;
			match(input,20,FOLLOW_20_in_parenExpr675); if (state.failed) return;
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "parenExpr"



	// $ANTLR start "exprList"
	// ./src/ulNoActions.g:185:1: exprList : expr ( exprMore )* ;
	public final void exprList() throws RecognitionException {
		try {
			// ./src/ulNoActions.g:185:9: ( expr ( exprMore )* )
			// ./src/ulNoActions.g:185:11: expr ( exprMore )*
			{
			pushFollow(FOLLOW_expr_in_exprList684);
			expr();
			state._fsp--;
			if (state.failed) return;
			// ./src/ulNoActions.g:185:16: ( exprMore )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==23) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// ./src/ulNoActions.g:185:16: exprMore
					{
					pushFollow(FOLLOW_exprMore_in_exprList686);
					exprMore();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop15;
				}
			}

			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "exprList"



	// $ANTLR start "exprMore"
	// ./src/ulNoActions.g:188:1: exprMore : ',' expr ;
	public final void exprMore() throws RecognitionException {
		try {
			// ./src/ulNoActions.g:188:9: ( ',' expr )
			// ./src/ulNoActions.g:188:11: ',' expr
			{
			match(input,23,FOLLOW_23_in_exprMore696); if (state.failed) return;
			pushFollow(FOLLOW_expr_in_exprMore698);
			expr();
			state._fsp--;
			if (state.failed) return;
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "exprMore"



	// $ANTLR start "literal"
	// ./src/ulNoActions.g:191:1: literal : ( stringconstant | integerconstant | characterconstant | floatconstant | bool );
	public final void literal() throws RecognitionException {
		try {
			// ./src/ulNoActions.g:191:8: ( stringconstant | integerconstant | characterconstant | floatconstant | bool )
			int alt16=5;
			switch ( input.LA(1) ) {
			case STRINGCONSTANT:
				{
				alt16=1;
				}
				break;
			case INTEGERCONSTANT:
				{
				alt16=2;
				}
				break;
			case CHARACTERCONSTANT:
				{
				alt16=3;
				}
				break;
			case FLOATCONSTANT:
				{
				alt16=4;
				}
				break;
			case BOOL:
				{
				alt16=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}
			switch (alt16) {
				case 1 :
					// ./src/ulNoActions.g:191:10: stringconstant
					{
					pushFollow(FOLLOW_stringconstant_in_literal708);
					stringconstant();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// ./src/ulNoActions.g:192:2: integerconstant
					{
					pushFollow(FOLLOW_integerconstant_in_literal713);
					integerconstant();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// ./src/ulNoActions.g:193:2: characterconstant
					{
					pushFollow(FOLLOW_characterconstant_in_literal718);
					characterconstant();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// ./src/ulNoActions.g:194:2: floatconstant
					{
					pushFollow(FOLLOW_floatconstant_in_literal723);
					floatconstant();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					// ./src/ulNoActions.g:195:2: bool
					{
					pushFollow(FOLLOW_bool_in_literal728);
					bool();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "literal"



	// $ANTLR start "stringconstant"
	// ./src/ulNoActions.g:198:1: stringconstant : STRINGCONSTANT ;
	public final void stringconstant() throws RecognitionException {
		try {
			// ./src/ulNoActions.g:198:15: ( STRINGCONSTANT )
			// ./src/ulNoActions.g:198:17: STRINGCONSTANT
			{
			match(input,STRINGCONSTANT,FOLLOW_STRINGCONSTANT_in_stringconstant737); if (state.failed) return;
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "stringconstant"



	// $ANTLR start "floatconstant"
	// ./src/ulNoActions.g:201:1: floatconstant : FLOATCONSTANT ;
	public final void floatconstant() throws RecognitionException {
		try {
			// ./src/ulNoActions.g:201:14: ( FLOATCONSTANT )
			// ./src/ulNoActions.g:201:16: FLOATCONSTANT
			{
			match(input,FLOATCONSTANT,FOLLOW_FLOATCONSTANT_in_floatconstant746); if (state.failed) return;
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "floatconstant"



	// $ANTLR start "characterconstant"
	// ./src/ulNoActions.g:204:1: characterconstant : CHARACTERCONSTANT ;
	public final void characterconstant() throws RecognitionException {
		try {
			// ./src/ulNoActions.g:204:18: ( CHARACTERCONSTANT )
			// ./src/ulNoActions.g:204:20: CHARACTERCONSTANT
			{
			match(input,CHARACTERCONSTANT,FOLLOW_CHARACTERCONSTANT_in_characterconstant755); if (state.failed) return;
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "characterconstant"



	// $ANTLR start "integerconstant"
	// ./src/ulNoActions.g:207:1: integerconstant : INTEGERCONSTANT ;
	public final void integerconstant() throws RecognitionException {
		try {
			// ./src/ulNoActions.g:207:16: ( INTEGERCONSTANT )
			// ./src/ulNoActions.g:207:18: INTEGERCONSTANT
			{
			match(input,INTEGERCONSTANT,FOLLOW_INTEGERCONSTANT_in_integerconstant764); if (state.failed) return;
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "integerconstant"



	// $ANTLR start "bool"
	// ./src/ulNoActions.g:210:1: bool : BOOL ;
	public final void bool() throws RecognitionException {
		try {
			// ./src/ulNoActions.g:210:5: ( BOOL )
			// ./src/ulNoActions.g:210:7: BOOL
			{
			match(input,BOOL,FOLLOW_BOOL_in_bool773); if (state.failed) return;
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "bool"

	// $ANTLR start synpred8_ulNoActions
	public final void synpred8_ulNoActions_fragment() throws RecognitionException {
		// ./src/ulNoActions.g:110:2: ( exprColon )
		// ./src/ulNoActions.g:110:2: exprColon
		{
		pushFollow(FOLLOW_exprColon_in_synpred8_ulNoActions332);
		exprColon();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred8_ulNoActions

	// $ANTLR start synpred9_ulNoActions
	public final void synpred9_ulNoActions_fragment() throws RecognitionException {
		// ./src/ulNoActions.g:111:2: ( idAssign )
		// ./src/ulNoActions.g:111:2: idAssign
		{
		pushFollow(FOLLOW_idAssign_in_synpred9_ulNoActions337);
		idAssign();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred9_ulNoActions

	// $ANTLR start synpred10_ulNoActions
	public final void synpred10_ulNoActions_fragment() throws RecognitionException {
		// ./src/ulNoActions.g:112:2: ( arrayAssign )
		// ./src/ulNoActions.g:112:2: arrayAssign
		{
		pushFollow(FOLLOW_arrayAssign_in_synpred10_ulNoActions342);
		arrayAssign();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred10_ulNoActions

	// $ANTLR start synpred11_ulNoActions
	public final void synpred11_ulNoActions_fragment() throws RecognitionException {
		// ./src/ulNoActions.g:113:2: ( ifElseBlock )
		// ./src/ulNoActions.g:113:2: ifElseBlock
		{
		pushFollow(FOLLOW_ifElseBlock_in_synpred11_ulNoActions347);
		ifElseBlock();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred11_ulNoActions

	// $ANTLR start synpred12_ulNoActions
	public final void synpred12_ulNoActions_fragment() throws RecognitionException {
		// ./src/ulNoActions.g:114:2: ( ifBlock )
		// ./src/ulNoActions.g:114:2: ifBlock
		{
		pushFollow(FOLLOW_ifBlock_in_synpred12_ulNoActions352);
		ifBlock();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred12_ulNoActions

	// Delegated rules

	public final boolean synpred11_ulNoActions() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred11_ulNoActions_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred10_ulNoActions() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred10_ulNoActions_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred12_ulNoActions() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred12_ulNoActions_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred8_ulNoActions() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred8_ulNoActions_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred9_ulNoActions() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred9_ulNoActions_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_function_in_program75 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_EOF_in_program82 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionDecl_in_function103 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_functionBody_in_function109 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compoundType_in_functionDecl132 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_identifier_in_functionDecl138 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_functionDecl145 = new BitSet(new long[]{0x0000000000110000L});
	public static final BitSet FOLLOW_formalParameters_in_functionDecl153 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_functionDecl158 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compoundType_in_formalParameters181 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_identifier_in_formalParameters187 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_moreFormals_in_formalParameters202 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_23_in_moreFormals221 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_compoundType_in_moreFormals227 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_identifier_in_moreFormals233 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_functionBody249 = new BitSet(new long[]{0x00000001020BFF30L});
	public static final BitSet FOLLOW_varDecl_in_functionBody251 = new BitSet(new long[]{0x00000001020BFF30L});
	public static final BitSet FOLLOW_statement_in_functionBody255 = new BitSet(new long[]{0x00000001020AFF30L});
	public static final BitSet FOLLOW_32_in_functionBody258 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compoundType_in_varDecl267 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_identifier_in_varDecl269 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_varDecl271 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_compoundType280 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayDecl_in_compoundType287 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_arrayDecl296 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_arrayDecl297 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_integerconstant_in_arrayDecl298 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_arrayDecl299 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_identifier309 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_in_type318 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_semiColon_in_statement327 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprColon_in_statement332 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_idAssign_in_statement337 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayAssign_in_statement342 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifElseBlock_in_statement347 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifBlock_in_statement352 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileBlock_in_statement357 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_printlnStmt_in_statement362 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_printStmt_in_statement367 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_returnStmt_in_statement372 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_whileBlock381 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_whileBlock382 = new BitSet(new long[]{0x0000000000088B30L});
	public static final BitSet FOLLOW_expr_in_whileBlock384 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_whileBlock385 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_block_in_whileBlock387 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINTLN_in_printlnStmt396 = new BitSet(new long[]{0x0000000000088B30L});
	public static final BitSet FOLLOW_expr_in_printlnStmt398 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_printlnStmt400 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_printStmt409 = new BitSet(new long[]{0x0000000000088B30L});
	public static final BitSet FOLLOW_expr_in_printStmt411 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_printStmt413 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURN_in_returnStmt422 = new BitSet(new long[]{0x0000000002088B30L});
	public static final BitSet FOLLOW_expr_in_returnStmt424 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_returnStmt427 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_semiColon436 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_exprColon445 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_exprColon447 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_idAssign456 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_idAssign458 = new BitSet(new long[]{0x0000000000088B30L});
	public static final BitSet FOLLOW_expr_in_idAssign460 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_idAssign462 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_arrayAssign471 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_arrayAssign473 = new BitSet(new long[]{0x0000000000088B30L});
	public static final BitSet FOLLOW_expr_in_arrayAssign475 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_arrayAssign476 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_arrayAssign478 = new BitSet(new long[]{0x0000000000088B30L});
	public static final BitSet FOLLOW_expr_in_arrayAssign480 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_arrayAssign482 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifElseBlock491 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_ifElseBlock492 = new BitSet(new long[]{0x0000000000088B30L});
	public static final BitSet FOLLOW_expr_in_ifElseBlock493 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_ifElseBlock494 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_block_in_ifElseBlock496 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ELSE_in_ifElseBlock498 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_block_in_ifElseBlock500 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifBlock509 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_ifBlock510 = new BitSet(new long[]{0x0000000000088B30L});
	public static final BitSet FOLLOW_expr_in_ifBlock511 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_ifBlock512 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_block_in_ifBlock514 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_block523 = new BitSet(new long[]{0x00000001020AFF30L});
	public static final BitSet FOLLOW_statement_in_block525 = new BitSet(new long[]{0x00000001020AFF30L});
	public static final BitSet FOLLOW_32_in_block528 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compareExpr_in_expr537 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lessExpr_in_compareExpr546 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_28_in_compareExpr549 = new BitSet(new long[]{0x0000000000088B30L});
	public static final BitSet FOLLOW_lessExpr_in_compareExpr551 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_plmiExpr_in_lessExpr562 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_26_in_lessExpr565 = new BitSet(new long[]{0x0000000000088B30L});
	public static final BitSet FOLLOW_plmiExpr_in_lessExpr567 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_multExpr_in_plmiExpr578 = new BitSet(new long[]{0x0000000001400002L});
	public static final BitSet FOLLOW_set_in_plmiExpr581 = new BitSet(new long[]{0x0000000000088B30L});
	public static final BitSet FOLLOW_multExpr_in_plmiExpr587 = new BitSet(new long[]{0x0000000001400002L});
	public static final BitSet FOLLOW_atom_in_multExpr598 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_21_in_multExpr601 = new BitSet(new long[]{0x0000000000088B30L});
	public static final BitSet FOLLOW_atom_in_multExpr603 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_literal_in_atom614 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_atom619 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_atom624 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayRef_in_atom629 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parenExpr_in_atom635 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_functionCall644 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_functionCall645 = new BitSet(new long[]{0x0000000000088B30L});
	public static final BitSet FOLLOW_exprList_in_functionCall647 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_functionCall649 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_arrayRef658 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_arrayRef659 = new BitSet(new long[]{0x0000000000088B30L});
	public static final BitSet FOLLOW_expr_in_arrayRef660 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_arrayRef661 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_parenExpr671 = new BitSet(new long[]{0x0000000000088B30L});
	public static final BitSet FOLLOW_expr_in_parenExpr673 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_parenExpr675 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_exprList684 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_exprMore_in_exprList686 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_23_in_exprMore696 = new BitSet(new long[]{0x0000000000088B30L});
	public static final BitSet FOLLOW_expr_in_exprMore698 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stringconstant_in_literal708 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_integerconstant_in_literal713 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_characterconstant_in_literal718 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_floatconstant_in_literal723 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bool_in_literal728 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRINGCONSTANT_in_stringconstant737 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOATCONSTANT_in_floatconstant746 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTERCONSTANT_in_characterconstant755 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGERCONSTANT_in_integerconstant764 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOL_in_bool773 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprColon_in_synpred8_ulNoActions332 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_idAssign_in_synpred9_ulNoActions337 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayAssign_in_synpred10_ulNoActions342 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifElseBlock_in_synpred11_ulNoActions347 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifBlock_in_synpred12_ulNoActions352 = new BitSet(new long[]{0x0000000000000002L});
}
