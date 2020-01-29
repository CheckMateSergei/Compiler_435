// $ANTLR 3.5.2 ./src/ulNoActions.g 2020-01-28 20:05:19

import packages.*;


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
			// ./src/ulNoActions.g:55:2: ( (f= function )+ EOF )
			// ./src/ulNoActions.g:58:2: (f= function )+ EOF
			{
			// ./src/ulNoActions.g:58:2: (f= function )+
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
					// ./src/ulNoActions.g:58:4: f= function
					{
					pushFollow(FOLLOW_function_in_program70);
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

			match(input,EOF,FOLLOW_EOF_in_program77); if (state.failed) return p;
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
	// ./src/ulNoActions.g:61:1: function returns [Function f] : fd= functionDecl fb= functionBody ;
	public final Function function() throws RecognitionException {
		Function f = null;


		FunctionDecl fd =null;
		FunctionBod fb =null;

		try {
			// ./src/ulNoActions.g:63:2: (fd= functionDecl fb= functionBody )
			// ./src/ulNoActions.g:63:4: fd= functionDecl fb= functionBody
			{
			pushFollow(FOLLOW_functionDecl_in_function98);
			fd=functionDecl();
			state._fsp--;
			if (state.failed) return f;
			pushFollow(FOLLOW_functionBody_in_function104);
			fb=functionBody();
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
	// ./src/ulNoActions.g:66:1: functionDecl returns [FunctionDecl fd] : ct= compoundType id= identifier '(' (fp= formalParameters )? ')' ;
	public final FunctionDecl functionDecl() throws RecognitionException {
		FunctionDecl fd = null;


		CompType ct =null;
		Identifier id =null;
		FormalParam fp =null;

		try {
			// ./src/ulNoActions.g:68:2: (ct= compoundType id= identifier '(' (fp= formalParameters )? ')' )
			// ./src/ulNoActions.g:68:4: ct= compoundType id= identifier '(' (fp= formalParameters )? ')'
			{
			pushFollow(FOLLOW_compoundType_in_functionDecl127);
			ct=compoundType();
			state._fsp--;
			if (state.failed) return fd;
			pushFollow(FOLLOW_identifier_in_functionDecl133);
			id=identifier();
			state._fsp--;
			if (state.failed) return fd;
			if ( state.backtracking==0 ) { fd = new FunctionDecl(ct, id); }
			match(input,19,FOLLOW_19_in_functionDecl140); if (state.failed) return fd;
			// ./src/ulNoActions.g:70:6: (fp= formalParameters )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==TYPE) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// ./src/ulNoActions.g:70:8: fp= formalParameters
					{
					pushFollow(FOLLOW_formalParameters_in_functionDecl148);
					fp=formalParameters();
					state._fsp--;
					if (state.failed) return fd;
					if ( state.backtracking==0 ) { fd.addFormal(fp); }
					}
					break;

			}

			match(input,20,FOLLOW_20_in_functionDecl155); if (state.failed) return fd;
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
	// ./src/ulNoActions.g:73:1: formalParameters returns [FormalParam fp] : ct= compoundType id= identifier (mf= moreFormals )* ;
	public final FormalParam formalParameters() throws RecognitionException {
		FormalParam fp = null;


		CompType ct =null;
		Identifier id =null;
		FormalParam mf =null;

		try {
			// ./src/ulNoActions.g:75:2: (ct= compoundType id= identifier (mf= moreFormals )* )
			// ./src/ulNoActions.g:75:4: ct= compoundType id= identifier (mf= moreFormals )*
			{
			pushFollow(FOLLOW_compoundType_in_formalParameters177);
			ct=compoundType();
			state._fsp--;
			if (state.failed) return fp;
			pushFollow(FOLLOW_identifier_in_formalParameters183);
			id=identifier();
			state._fsp--;
			if (state.failed) return fp;
			if ( state.backtracking==0 ) { fp = new FormalParam(ct, id); }
			// ./src/ulNoActions.g:77:4: (mf= moreFormals )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==23) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// ./src/ulNoActions.g:77:6: mf= moreFormals
					{
					pushFollow(FOLLOW_moreFormals_in_formalParameters198);
					mf=moreFormals();
					state._fsp--;
					if (state.failed) return fp;
					if ( state.backtracking==0 ) { fp = mf; }
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
	// ./src/ulNoActions.g:80:1: moreFormals returns [FormalParam mf] : ',' ct= compoundType id= identifier ;
	public final FormalParam moreFormals() throws RecognitionException {
		FormalParam mf = null;


		CompType ct =null;
		Identifier id =null;

		try {
			// ./src/ulNoActions.g:81:2: ( ',' ct= compoundType id= identifier )
			// ./src/ulNoActions.g:81:4: ',' ct= compoundType id= identifier
			{
			match(input,23,FOLLOW_23_in_moreFormals218); if (state.failed) return mf;
			pushFollow(FOLLOW_compoundType_in_moreFormals224);
			ct=compoundType();
			state._fsp--;
			if (state.failed) return mf;
			pushFollow(FOLLOW_identifier_in_moreFormals230);
			id=identifier();
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
	// ./src/ulNoActions.g:87:1: functionBody returns [FunctionBod fb] : '{' (vd= varDecl )* (s= statement )* '}' ;
	public final FunctionBod functionBody() throws RecognitionException {
		FunctionBod fb = null;


		VarDecl vd =null;
		Statement s =null;


			// create the new function body object and then add the 
			// statements and variable declarations
			fb = new FunctionBod();

		try {
			// ./src/ulNoActions.g:95:2: ( '{' (vd= varDecl )* (s= statement )* '}' )
			// ./src/ulNoActions.g:95:4: '{' (vd= varDecl )* (s= statement )* '}'
			{
			match(input,31,FOLLOW_31_in_functionBody259); if (state.failed) return fb;
			// ./src/ulNoActions.g:95:8: (vd= varDecl )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==TYPE) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// ./src/ulNoActions.g:95:10: vd= varDecl
					{
					pushFollow(FOLLOW_varDecl_in_functionBody267);
					vd=varDecl();
					state._fsp--;
					if (state.failed) return fb;
					if ( state.backtracking==0 ) { fb.addVarDecl(vd); }
					}
					break;

				default :
					break loop4;
				}
			}

			// ./src/ulNoActions.g:96:8: (s= statement )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= BOOL && LA5_0 <= CHARACTERCONSTANT)||(LA5_0 >= FLOATCONSTANT && LA5_0 <= STRINGCONSTANT)||LA5_0==WHILE||LA5_0==19||LA5_0==25) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// ./src/ulNoActions.g:96:10: s= statement
					{
					pushFollow(FOLLOW_statement_in_functionBody288);
					s=statement();
					state._fsp--;
					if (state.failed) return fb;
					if ( state.backtracking==0 ) { fb.addStatement(s); }
					}
					break;

				default :
					break loop5;
				}
			}

			match(input,32,FOLLOW_32_in_functionBody294); if (state.failed) return fb;
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
		return fb;
	}
	// $ANTLR end "functionBody"



	// $ANTLR start "varDecl"
	// ./src/ulNoActions.g:99:1: varDecl returns [VarDecl vd] : ct= compoundType id= identifier ';' ;
	public final VarDecl varDecl() throws RecognitionException {
		VarDecl vd = null;


		CompType ct =null;
		Identifier id =null;

		try {
			// ./src/ulNoActions.g:101:2: (ct= compoundType id= identifier ';' )
			// ./src/ulNoActions.g:101:4: ct= compoundType id= identifier ';'
			{
			pushFollow(FOLLOW_compoundType_in_varDecl315);
			ct=compoundType();
			state._fsp--;
			if (state.failed) return vd;
			pushFollow(FOLLOW_identifier_in_varDecl321);
			id=identifier();
			state._fsp--;
			if (state.failed) return vd;
			match(input,25,FOLLOW_25_in_varDecl323); if (state.failed) return vd;
			if ( state.backtracking==0 ) { vd = new VarDecl(ct, id); }
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
		return vd;
	}
	// $ANTLR end "varDecl"



	// $ANTLR start "compoundType"
	// ./src/ulNoActions.g:105:1: compoundType returns [CompType ct] : (ad= arrayDecl |t= TYPE );
	public final CompType compoundType() throws RecognitionException {
		CompType ct = null;


		Token t=null;
		ArrayDecl ad =null;

		try {
			// ./src/ulNoActions.g:107:2: (ad= arrayDecl |t= TYPE )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==TYPE) ) {
				int LA6_1 = input.LA(2);
				if ( (LA6_1==29) ) {
					alt6=1;
				}
				else if ( (LA6_1==ID) ) {
					alt6=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return ct;}
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
				if (state.backtracking>0) {state.failed=true; return ct;}
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// ./src/ulNoActions.g:107:5: ad= arrayDecl
					{
					pushFollow(FOLLOW_arrayDecl_in_compoundType348);
					ad=arrayDecl();
					state._fsp--;
					if (state.failed) return ct;
					if ( state.backtracking==0 ) { ct = ad; }
					}
					break;
				case 2 :
					// ./src/ulNoActions.g:109:4: t= TYPE
					{
					t=(Token)match(input,TYPE,FOLLOW_TYPE_in_compoundType361); if (state.failed) return ct;
					if ( state.backtracking==0 ) { ct = new CompType(t.getText()); }
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
		return ct;
	}
	// $ANTLR end "compoundType"



	// $ANTLR start "arrayDecl"
	// ./src/ulNoActions.g:113:1: arrayDecl returns [ArrayDecl ad] : t= TYPE '[' il= integerconstant ']' ;
	public final ArrayDecl arrayDecl() throws RecognitionException {
		ArrayDecl ad = null;


		Token t=null;
		IntegerLiteral il =null;

		try {
			// ./src/ulNoActions.g:114:2: (t= TYPE '[' il= integerconstant ']' )
			// ./src/ulNoActions.g:114:4: t= TYPE '[' il= integerconstant ']'
			{
			t=(Token)match(input,TYPE,FOLLOW_TYPE_in_arrayDecl383); if (state.failed) return ad;
			match(input,29,FOLLOW_29_in_arrayDecl385); if (state.failed) return ad;
			pushFollow(FOLLOW_integerconstant_in_arrayDecl391);
			il=integerconstant();
			state._fsp--;
			if (state.failed) return ad;
			match(input,30,FOLLOW_30_in_arrayDecl393); if (state.failed) return ad;
			if ( state.backtracking==0 ) { ad = new ArrayDecl(t.getText(), il.getValue()); }
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
		return ad;
	}
	// $ANTLR end "arrayDecl"



	// $ANTLR start "identifier"
	// ./src/ulNoActions.g:120:1: identifier returns [Identifier i] : id= ID ;
	public final Identifier identifier() throws RecognitionException {
		Identifier i = null;


		Token id=null;

		try {
			// ./src/ulNoActions.g:121:2: (id= ID )
			// ./src/ulNoActions.g:121:4: id= ID
			{
			id=(Token)match(input,ID,FOLLOW_ID_in_identifier418); if (state.failed) return i;
			if ( state.backtracking==0 ) { i = new Identifier(id.getText()); }
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
		return i;
	}
	// $ANTLR end "identifier"



	// $ANTLR start "statement"
	// ./src/ulNoActions.g:126:1: statement returns [Statement s] : (st= semiColon |ec= exprColon |aas= arrayAssign |idas= idAssign |ie= ifElseBlock |is= ifBlock |wh= whileBlock |pl= printlnStmt |ps= printStmt |ret= returnStmt );
	public final Statement statement() throws RecognitionException {
		Statement s = null;


		SemiStatement st =null;
		ExColonStmt ec =null;
		ArrayAssignStmt aas =null;
		IdAssignStmt idas =null;
		IfElseStmt ie =null;
		IfStmt is =null;
		WhileStmt wh =null;
		PrintlnStmt pl =null;
		PrintStmt ps =null;
		ReturnStmt ret =null;

		try {
			// ./src/ulNoActions.g:127:2: (st= semiColon |ec= exprColon |aas= arrayAssign |idas= idAssign |ie= ifElseBlock |is= ifBlock |wh= whileBlock |pl= printlnStmt |ps= printStmt |ret= returnStmt )
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
					if (state.backtracking>0) {state.failed=true; return s;}
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
					if (state.backtracking>0) {state.failed=true; return s;}
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
				if (state.backtracking>0) {state.failed=true; return s;}
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// ./src/ulNoActions.g:127:4: st= semiColon
					{
					pushFollow(FOLLOW_semiColon_in_statement441);
					st=semiColon();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) { s = st;  }
					}
					break;
				case 2 :
					// ./src/ulNoActions.g:128:4: ec= exprColon
					{
					pushFollow(FOLLOW_exprColon_in_statement452);
					ec=exprColon();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) { s = ec;  }
					}
					break;
				case 3 :
					// ./src/ulNoActions.g:129:4: aas= arrayAssign
					{
					pushFollow(FOLLOW_arrayAssign_in_statement463);
					aas=arrayAssign();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) { s = aas; }
					}
					break;
				case 4 :
					// ./src/ulNoActions.g:130:4: idas= idAssign
					{
					pushFollow(FOLLOW_idAssign_in_statement474);
					idas=idAssign();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) { s = idas; }
					}
					break;
				case 5 :
					// ./src/ulNoActions.g:131:4: ie= ifElseBlock
					{
					pushFollow(FOLLOW_ifElseBlock_in_statement485);
					ie=ifElseBlock();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) { s = ie; }
					}
					break;
				case 6 :
					// ./src/ulNoActions.g:132:4: is= ifBlock
					{
					pushFollow(FOLLOW_ifBlock_in_statement496);
					is=ifBlock();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) { s = is; }
					}
					break;
				case 7 :
					// ./src/ulNoActions.g:133:4: wh= whileBlock
					{
					pushFollow(FOLLOW_whileBlock_in_statement507);
					wh=whileBlock();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) { s = wh; }
					}
					break;
				case 8 :
					// ./src/ulNoActions.g:134:4: pl= printlnStmt
					{
					pushFollow(FOLLOW_printlnStmt_in_statement518);
					pl=printlnStmt();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) { s = pl; }
					}
					break;
				case 9 :
					// ./src/ulNoActions.g:135:4: ps= printStmt
					{
					pushFollow(FOLLOW_printStmt_in_statement529);
					ps=printStmt();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) { s = ps; }
					}
					break;
				case 10 :
					// ./src/ulNoActions.g:136:4: ret= returnStmt
					{
					pushFollow(FOLLOW_returnStmt_in_statement540);
					ret=returnStmt();
					state._fsp--;
					if (state.failed) return s;
					if ( state.backtracking==0 ) { s = ret; }
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
		return s;
	}
	// $ANTLR end "statement"



	// $ANTLR start "whileBlock"
	// ./src/ulNoActions.g:140:1: whileBlock returns [WhileStmt wh] : WHILE '(' e= expr ')' b= block ;
	public final WhileStmt whileBlock() throws RecognitionException {
		WhileStmt wh = null;


		Expression e =null;
		Block b =null;

		try {
			// ./src/ulNoActions.g:141:2: ( WHILE '(' e= expr ')' b= block )
			// ./src/ulNoActions.g:141:4: WHILE '(' e= expr ')' b= block
			{
			match(input,WHILE,FOLLOW_WHILE_in_whileBlock558); if (state.failed) return wh;
			match(input,19,FOLLOW_19_in_whileBlock559); if (state.failed) return wh;
			pushFollow(FOLLOW_expr_in_whileBlock565);
			e=expr();
			state._fsp--;
			if (state.failed) return wh;
			match(input,20,FOLLOW_20_in_whileBlock566); if (state.failed) return wh;
			pushFollow(FOLLOW_block_in_whileBlock572);
			b=block();
			state._fsp--;
			if (state.failed) return wh;
			if ( state.backtracking==0 ) { wh = new WhileStmt(e, b); }
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
		return wh;
	}
	// $ANTLR end "whileBlock"



	// $ANTLR start "printlnStmt"
	// ./src/ulNoActions.g:145:1: printlnStmt returns [PrintlnStmt pl] : PRINTLN e= expr ';' ;
	public final PrintlnStmt printlnStmt() throws RecognitionException {
		PrintlnStmt pl = null;


		Expression e =null;

		try {
			// ./src/ulNoActions.g:146:2: ( PRINTLN e= expr ';' )
			// ./src/ulNoActions.g:146:4: PRINTLN e= expr ';'
			{
			match(input,PRINTLN,FOLLOW_PRINTLN_in_printlnStmt590); if (state.failed) return pl;
			pushFollow(FOLLOW_expr_in_printlnStmt596);
			e=expr();
			state._fsp--;
			if (state.failed) return pl;
			match(input,25,FOLLOW_25_in_printlnStmt598); if (state.failed) return pl;
			if ( state.backtracking==0 ) { pl = new PrintlnStmt(e); }
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
		return pl;
	}
	// $ANTLR end "printlnStmt"



	// $ANTLR start "printStmt"
	// ./src/ulNoActions.g:150:1: printStmt returns [PrintStmt p] : PRINT e= expr ';' ;
	public final PrintStmt printStmt() throws RecognitionException {
		PrintStmt p = null;


		Expression e =null;

		try {
			// ./src/ulNoActions.g:151:2: ( PRINT e= expr ';' )
			// ./src/ulNoActions.g:151:4: PRINT e= expr ';'
			{
			match(input,PRINT,FOLLOW_PRINT_in_printStmt616); if (state.failed) return p;
			pushFollow(FOLLOW_expr_in_printStmt622);
			e=expr();
			state._fsp--;
			if (state.failed) return p;
			match(input,25,FOLLOW_25_in_printStmt624); if (state.failed) return p;
			if ( state.backtracking==0 ) { p = new PrintStmt(e); }
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
	// $ANTLR end "printStmt"



	// $ANTLR start "returnStmt"
	// ./src/ulNoActions.g:155:1: returnStmt returns [ReturnStmt ret] : RETURN (e= expr )? ';' ;
	public final ReturnStmt returnStmt() throws RecognitionException {
		ReturnStmt ret = null;


		Expression e =null;


			// create the return statement with no expression field
			ret = new ReturnStmt();

		try {
			// ./src/ulNoActions.g:162:2: ( RETURN (e= expr )? ';' )
			// ./src/ulNoActions.g:162:4: RETURN (e= expr )? ';'
			{
			match(input,RETURN,FOLLOW_RETURN_in_returnStmt649); if (state.failed) return ret;
			// ./src/ulNoActions.g:162:11: (e= expr )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( ((LA8_0 >= BOOL && LA8_0 <= CHARACTERCONSTANT)||(LA8_0 >= FLOATCONSTANT && LA8_0 <= ID)||LA8_0==INTEGERCONSTANT||LA8_0==STRINGCONSTANT||LA8_0==19) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// ./src/ulNoActions.g:162:12: e= expr
					{
					pushFollow(FOLLOW_expr_in_returnStmt656);
					e=expr();
					state._fsp--;
					if (state.failed) return ret;
					if ( state.backtracking==0 ) { ret.setExpr(e); }
					}
					break;

			}

			match(input,25,FOLLOW_25_in_returnStmt662); if (state.failed) return ret;
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
		return ret;
	}
	// $ANTLR end "returnStmt"



	// $ANTLR start "semiColon"
	// ./src/ulNoActions.g:166:1: semiColon returns [SemiStatement st] : ';' ;
	public final SemiStatement semiColon() throws RecognitionException {
		SemiStatement st = null;


		try {
			// ./src/ulNoActions.g:167:2: ( ';' )
			// ./src/ulNoActions.g:167:4: ';'
			{
			match(input,25,FOLLOW_25_in_semiColon678); if (state.failed) return st;
			if ( state.backtracking==0 ) { st = new SemiStatement(); }
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
		return st;
	}
	// $ANTLR end "semiColon"



	// $ANTLR start "exprColon"
	// ./src/ulNoActions.g:171:1: exprColon returns [ExColonStmt ec] : e= expr ';' ;
	public final ExColonStmt exprColon() throws RecognitionException {
		ExColonStmt ec = null;


		Expression e =null;

		try {
			// ./src/ulNoActions.g:172:2: (e= expr ';' )
			// ./src/ulNoActions.g:172:4: e= expr ';'
			{
			pushFollow(FOLLOW_expr_in_exprColon700);
			e=expr();
			state._fsp--;
			if (state.failed) return ec;
			match(input,25,FOLLOW_25_in_exprColon702); if (state.failed) return ec;
			if ( state.backtracking==0 ) { ec = new ExColonStmt(e); }
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
		return ec;
	}
	// $ANTLR end "exprColon"



	// $ANTLR start "arrayAssign"
	// ./src/ulNoActions.g:176:1: arrayAssign returns [ArrayAssignStmt aas] : id= identifier '[' e1= expr ']' '=' e2= expr ';' ;
	public final ArrayAssignStmt arrayAssign() throws RecognitionException {
		ArrayAssignStmt aas = null;


		Identifier id =null;
		Expression e1 =null;
		Expression e2 =null;

		try {
			// ./src/ulNoActions.g:178:2: (id= identifier '[' e1= expr ']' '=' e2= expr ';' )
			// ./src/ulNoActions.g:178:4: id= identifier '[' e1= expr ']' '=' e2= expr ';'
			{
			pushFollow(FOLLOW_identifier_in_arrayAssign726);
			id=identifier();
			state._fsp--;
			if (state.failed) return aas;
			match(input,29,FOLLOW_29_in_arrayAssign728); if (state.failed) return aas;
			pushFollow(FOLLOW_expr_in_arrayAssign734);
			e1=expr();
			state._fsp--;
			if (state.failed) return aas;
			match(input,30,FOLLOW_30_in_arrayAssign736); if (state.failed) return aas;
			match(input,27,FOLLOW_27_in_arrayAssign738); if (state.failed) return aas;
			pushFollow(FOLLOW_expr_in_arrayAssign744);
			e2=expr();
			state._fsp--;
			if (state.failed) return aas;
			match(input,25,FOLLOW_25_in_arrayAssign746); if (state.failed) return aas;
			if ( state.backtracking==0 ) { aas = new ArrayAssignStmt(id, e1, e2); }
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
		return aas;
	}
	// $ANTLR end "arrayAssign"



	// $ANTLR start "idAssign"
	// ./src/ulNoActions.g:183:1: idAssign returns [IdAssignStmt idas] : id= identifier '=' e= expr ';' ;
	public final IdAssignStmt idAssign() throws RecognitionException {
		IdAssignStmt idas = null;


		Identifier id =null;
		Expression e =null;

		try {
			// ./src/ulNoActions.g:184:2: (id= identifier '=' e= expr ';' )
			// ./src/ulNoActions.g:184:4: id= identifier '=' e= expr ';'
			{
			pushFollow(FOLLOW_identifier_in_idAssign771);
			id=identifier();
			state._fsp--;
			if (state.failed) return idas;
			match(input,27,FOLLOW_27_in_idAssign773); if (state.failed) return idas;
			pushFollow(FOLLOW_expr_in_idAssign779);
			e=expr();
			state._fsp--;
			if (state.failed) return idas;
			match(input,25,FOLLOW_25_in_idAssign781); if (state.failed) return idas;
			if ( state.backtracking==0 ) { idas = new IdAssignStmt(id, e); }
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
		return idas;
	}
	// $ANTLR end "idAssign"



	// $ANTLR start "ifElseBlock"
	// ./src/ulNoActions.g:188:1: ifElseBlock returns [IfElseStmt ie] : IF '(' e= expr ')' b1= block ELSE b2= block ;
	public final IfElseStmt ifElseBlock() throws RecognitionException {
		IfElseStmt ie = null;


		Expression e =null;
		Block b1 =null;
		Block b2 =null;

		try {
			// ./src/ulNoActions.g:189:2: ( IF '(' e= expr ')' b1= block ELSE b2= block )
			// ./src/ulNoActions.g:189:4: IF '(' e= expr ')' b1= block ELSE b2= block
			{
			match(input,IF,FOLLOW_IF_in_ifElseBlock799); if (state.failed) return ie;
			match(input,19,FOLLOW_19_in_ifElseBlock800); if (state.failed) return ie;
			pushFollow(FOLLOW_expr_in_ifElseBlock805);
			e=expr();
			state._fsp--;
			if (state.failed) return ie;
			match(input,20,FOLLOW_20_in_ifElseBlock806); if (state.failed) return ie;
			pushFollow(FOLLOW_block_in_ifElseBlock812);
			b1=block();
			state._fsp--;
			if (state.failed) return ie;
			match(input,ELSE,FOLLOW_ELSE_in_ifElseBlock814); if (state.failed) return ie;
			pushFollow(FOLLOW_block_in_ifElseBlock820);
			b2=block();
			state._fsp--;
			if (state.failed) return ie;
			if ( state.backtracking==0 ) { ie = new IfElseStmt(e, b1, b2); }
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
		return ie;
	}
	// $ANTLR end "ifElseBlock"



	// $ANTLR start "ifBlock"
	// ./src/ulNoActions.g:194:1: ifBlock returns [IfStmt is] : IF '(' e= expr ')' b= block ;
	public final IfStmt ifBlock() throws RecognitionException {
		IfStmt is = null;


		Expression e =null;
		Block b =null;

		try {
			// ./src/ulNoActions.g:195:2: ( IF '(' e= expr ')' b= block )
			// ./src/ulNoActions.g:195:4: IF '(' e= expr ')' b= block
			{
			match(input,IF,FOLLOW_IF_in_ifBlock841); if (state.failed) return is;
			match(input,19,FOLLOW_19_in_ifBlock842); if (state.failed) return is;
			pushFollow(FOLLOW_expr_in_ifBlock847);
			e=expr();
			state._fsp--;
			if (state.failed) return is;
			match(input,20,FOLLOW_20_in_ifBlock848); if (state.failed) return is;
			pushFollow(FOLLOW_block_in_ifBlock854);
			b=block();
			state._fsp--;
			if (state.failed) return is;
			if ( state.backtracking==0 ) { is = new IfStmt(e, b); }
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
		return is;
	}
	// $ANTLR end "ifBlock"



	// $ANTLR start "block"
	// ./src/ulNoActions.g:199:1: block returns [Block blok] : '{' (s= statement )* '}' ;
	public final Block block() throws RecognitionException {
		Block blok = null;


		Statement s =null;


			// create a new block object with empty stmt list
			blok = new Block();

		try {
			// ./src/ulNoActions.g:206:2: ( '{' (s= statement )* '}' )
			// ./src/ulNoActions.g:206:4: '{' (s= statement )* '}'
			{
			match(input,31,FOLLOW_31_in_block879); if (state.failed) return blok;
			// ./src/ulNoActions.g:206:8: (s= statement )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( ((LA9_0 >= BOOL && LA9_0 <= CHARACTERCONSTANT)||(LA9_0 >= FLOATCONSTANT && LA9_0 <= STRINGCONSTANT)||LA9_0==WHILE||LA9_0==19||LA9_0==25) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// ./src/ulNoActions.g:206:10: s= statement
					{
					pushFollow(FOLLOW_statement_in_block887);
					s=statement();
					state._fsp--;
					if (state.failed) return blok;
					if ( state.backtracking==0 ) { blok.addToBlock(s); }
					}
					break;

				default :
					break loop9;
				}
			}

			match(input,32,FOLLOW_32_in_block894); if (state.failed) return blok;
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
		return blok;
	}
	// $ANTLR end "block"



	// $ANTLR start "expr"
	// ./src/ulNoActions.g:210:1: expr returns [Expression e] : it= compareExpr ;
	public final Expression expr() throws RecognitionException {
		Expression e = null;


		Expression it =null;

		try {
			// ./src/ulNoActions.g:212:2: (it= compareExpr )
			// ./src/ulNoActions.g:212:4: it= compareExpr
			{
			pushFollow(FOLLOW_compareExpr_in_expr916);
			it=compareExpr();
			state._fsp--;
			if (state.failed) return e;
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
		return e;
	}
	// $ANTLR end "expr"



	// $ANTLR start "compareExpr"
	// ./src/ulNoActions.g:216:1: compareExpr returns [Expression e] : le= lessExpr ( '==' ri= lessExpr )* ;
	public final Expression compareExpr() throws RecognitionException {
		Expression e = null;


		Expression le =null;
		Expression ri =null;


			// create a null compare expression
			Expression it = null;

		try {
			// ./src/ulNoActions.g:228:2: (le= lessExpr ( '==' ri= lessExpr )* )
			// ./src/ulNoActions.g:228:4: le= lessExpr ( '==' ri= lessExpr )*
			{
			pushFollow(FOLLOW_lessExpr_in_compareExpr948);
			le=lessExpr();
			state._fsp--;
			if (state.failed) return e;
			if ( state.backtracking==0 ) { it = le; }
			// ./src/ulNoActions.g:228:31: ( '==' ri= lessExpr )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==28) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// ./src/ulNoActions.g:228:32: '==' ri= lessExpr
					{
					match(input,28,FOLLOW_28_in_compareExpr953); if (state.failed) return e;
					pushFollow(FOLLOW_lessExpr_in_compareExpr959);
					ri=lessExpr();
					state._fsp--;
					if (state.failed) return e;
					if ( state.backtracking==0 ) { it = new CompareExpr(it, ri); }
					}
					break;

				default :
					break loop10;
				}
			}

			}

			if ( state.backtracking==0 ) {
				// sets e to it if nothing else is matched
				e = it;
			}
		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
		return e;
	}
	// $ANTLR end "compareExpr"



	// $ANTLR start "lessExpr"
	// ./src/ulNoActions.g:231:1: lessExpr returns [Expression e] : le= plmiExpr ( '<' ri= plmiExpr )* ;
	public final Expression lessExpr() throws RecognitionException {
		Expression e = null;


		Expression le =null;
		Expression ri =null;


			// create a null compare expression
			Expression it = null;

		try {
			// ./src/ulNoActions.g:243:2: (le= plmiExpr ( '<' ri= plmiExpr )* )
			// ./src/ulNoActions.g:243:4: le= plmiExpr ( '<' ri= plmiExpr )*
			{
			pushFollow(FOLLOW_plmiExpr_in_lessExpr994);
			le=plmiExpr();
			state._fsp--;
			if (state.failed) return e;
			if ( state.backtracking==0 ) { it = le; }
			// ./src/ulNoActions.g:243:31: ( '<' ri= plmiExpr )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==26) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// ./src/ulNoActions.g:243:32: '<' ri= plmiExpr
					{
					match(input,26,FOLLOW_26_in_lessExpr999); if (state.failed) return e;
					pushFollow(FOLLOW_plmiExpr_in_lessExpr1006);
					ri=plmiExpr();
					state._fsp--;
					if (state.failed) return e;
					if ( state.backtracking==0 ) { it = new LessExpr(it, ri); }
					}
					break;

				default :
					break loop11;
				}
			}

			}

			if ( state.backtracking==0 ) {
				// sets e to it if nothing else is matched
				e = it;
			}
		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
		return e;
	}
	// $ANTLR end "lessExpr"



	// $ANTLR start "plmiExpr"
	// ./src/ulNoActions.g:247:1: plmiExpr returns [Expression e] : le= multExpr ( (symbol= '+' ri= multExpr ) | (symbol= '-' ri= multExpr ) )* ;
	public final Expression plmiExpr() throws RecognitionException {
		Expression e = null;


		Token symbol=null;
		Expression le =null;
		Expression ri =null;


			// create a null compare expression
			Expression it = null;

		try {
			// ./src/ulNoActions.g:265:2: (le= multExpr ( (symbol= '+' ri= multExpr ) | (symbol= '-' ri= multExpr ) )* )
			// ./src/ulNoActions.g:265:4: le= multExpr ( (symbol= '+' ri= multExpr ) | (symbol= '-' ri= multExpr ) )*
			{
			pushFollow(FOLLOW_multExpr_in_plmiExpr1045);
			le=multExpr();
			state._fsp--;
			if (state.failed) return e;
			if ( state.backtracking==0 ) { it = le; }
			// ./src/ulNoActions.g:266:2: ( (symbol= '+' ri= multExpr ) | (symbol= '-' ri= multExpr ) )*
			loop12:
			while (true) {
				int alt12=3;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==22) ) {
					alt12=1;
				}
				else if ( (LA12_0==24) ) {
					alt12=2;
				}

				switch (alt12) {
				case 1 :
					// ./src/ulNoActions.g:266:3: (symbol= '+' ri= multExpr )
					{
					// ./src/ulNoActions.g:266:3: (symbol= '+' ri= multExpr )
					// ./src/ulNoActions.g:266:5: symbol= '+' ri= multExpr
					{
					symbol=(Token)match(input,22,FOLLOW_22_in_plmiExpr1058); if (state.failed) return e;
					pushFollow(FOLLOW_multExpr_in_plmiExpr1064);
					ri=multExpr();
					state._fsp--;
					if (state.failed) return e;
					if ( state.backtracking==0 ) { it = new PlmiExpr(it, ri, symbol.getText().charAt(0)); }
					}

					}
					break;
				case 2 :
					// ./src/ulNoActions.g:268:4: (symbol= '-' ri= multExpr )
					{
					// ./src/ulNoActions.g:268:4: (symbol= '-' ri= multExpr )
					// ./src/ulNoActions.g:268:6: symbol= '-' ri= multExpr
					{
					symbol=(Token)match(input,24,FOLLOW_24_in_plmiExpr1082); if (state.failed) return e;
					pushFollow(FOLLOW_multExpr_in_plmiExpr1088);
					ri=multExpr();
					state._fsp--;
					if (state.failed) return e;
					if ( state.backtracking==0 ) { it = new PlmiExpr(it, ri, symbol.getText().charAt(0)); }
					}

					}
					break;

				default :
					break loop12;
				}
			}

			}

			if ( state.backtracking==0 ) {
				// sets e to it if nothing else is matched
				e = it;
			}
		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
		return e;
	}
	// $ANTLR end "plmiExpr"



	// $ANTLR start "multExpr"
	// ./src/ulNoActions.g:273:1: multExpr returns [Expression e] : le= atom ( '*' ri= atom )* ;
	public final Expression multExpr() throws RecognitionException {
		Expression e = null;


		Expression le =null;
		Expression ri =null;


			// create a null compare expression
			Expression it = null;

		try {
			// ./src/ulNoActions.g:284:2: (le= atom ( '*' ri= atom )* )
			// ./src/ulNoActions.g:284:4: le= atom ( '*' ri= atom )*
			{
			pushFollow(FOLLOW_atom_in_multExpr1127);
			le=atom();
			state._fsp--;
			if (state.failed) return e;
			if ( state.backtracking==0 ) { it = le; }
			// ./src/ulNoActions.g:284:27: ( '*' ri= atom )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==21) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// ./src/ulNoActions.g:284:28: '*' ri= atom
					{
					match(input,21,FOLLOW_21_in_multExpr1132); if (state.failed) return e;
					pushFollow(FOLLOW_atom_in_multExpr1138);
					ri=atom();
					state._fsp--;
					if (state.failed) return e;
					if ( state.backtracking==0 ) { it = new MultExpr(it, ri); }
					}
					break;

				default :
					break loop13;
				}
			}

			}

			if ( state.backtracking==0 ) {
				// sets e to it if nothing else is matched
				e = it;
			}
		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
		return e;
	}
	// $ANTLR end "multExpr"



	// $ANTLR start "atom"
	// ./src/ulNoActions.g:288:1: atom returns [Expression e] : (l= literal |id= identifier |fc= functionCall |ar= arrayRef |pe= parenExpr );
	public final Expression atom() throws RecognitionException {
		Expression e = null;


		Literal l =null;
		Identifier id =null;
		FunctionCall fc =null;
		Expression ar =null;
		Expression pe =null;

		try {
			// ./src/ulNoActions.g:289:2: (l= literal |id= identifier |fc= functionCall |ar= arrayRef |pe= parenExpr )
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
					if (state.backtracking>0) {state.failed=true; return e;}
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
				if (state.backtracking>0) {state.failed=true; return e;}
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}
			switch (alt14) {
				case 1 :
					// ./src/ulNoActions.g:289:4: l= literal
					{
					pushFollow(FOLLOW_literal_in_atom1162);
					l=literal();
					state._fsp--;
					if (state.failed) return e;
					if ( state.backtracking==0 ) { e = l; }
					}
					break;
				case 2 :
					// ./src/ulNoActions.g:290:4: id= identifier
					{
					pushFollow(FOLLOW_identifier_in_atom1173);
					id=identifier();
					state._fsp--;
					if (state.failed) return e;
					if ( state.backtracking==0 ) { e = id; }
					}
					break;
				case 3 :
					// ./src/ulNoActions.g:291:4: fc= functionCall
					{
					pushFollow(FOLLOW_functionCall_in_atom1184);
					fc=functionCall();
					state._fsp--;
					if (state.failed) return e;
					if ( state.backtracking==0 ) { e = fc; }
					}
					break;
				case 4 :
					// ./src/ulNoActions.g:292:4: ar= arrayRef
					{
					pushFollow(FOLLOW_arrayRef_in_atom1195);
					ar=arrayRef();
					state._fsp--;
					if (state.failed) return e;
					if ( state.backtracking==0 ) { e = ar; }
					}
					break;
				case 5 :
					// ./src/ulNoActions.g:293:4: pe= parenExpr
					{
					pushFollow(FOLLOW_parenExpr_in_atom1206);
					pe=parenExpr();
					state._fsp--;
					if (state.failed) return e;
					if ( state.backtracking==0 ) { e = pe; }
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
		return e;
	}
	// $ANTLR end "atom"



	// $ANTLR start "functionCall"
	// ./src/ulNoActions.g:296:1: functionCall returns [FunctionCall fc] : id= identifier '(' e1= expr ( ',' e2= expr )* ')' ;
	public final FunctionCall functionCall() throws RecognitionException {
		FunctionCall fc = null;


		Identifier id =null;
		Expression e1 =null;
		Expression e2 =null;


			fc = new FunctionCall();

		try {
			// ./src/ulNoActions.g:302:2: (id= identifier '(' e1= expr ( ',' e2= expr )* ')' )
			// ./src/ulNoActions.g:302:4: id= identifier '(' e1= expr ( ',' e2= expr )* ')'
			{
			pushFollow(FOLLOW_identifier_in_functionCall1234);
			id=identifier();
			state._fsp--;
			if (state.failed) return fc;
			match(input,19,FOLLOW_19_in_functionCall1235); if (state.failed) return fc;
			pushFollow(FOLLOW_expr_in_functionCall1241);
			e1=expr();
			state._fsp--;
			if (state.failed) return fc;
			if ( state.backtracking==0 ) { fc.setId(id);
								 fc.addExpr(e1); }
			// ./src/ulNoActions.g:306:4: ( ',' e2= expr )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==23) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// ./src/ulNoActions.g:306:5: ',' e2= expr
					{
					match(input,23,FOLLOW_23_in_functionCall1253); if (state.failed) return fc;
					pushFollow(FOLLOW_expr_in_functionCall1259);
					e2=expr();
					state._fsp--;
					if (state.failed) return fc;
					if ( state.backtracking==0 ) { fc.addExpr(e2); }
					}
					break;

				default :
					break loop15;
				}
			}

			match(input,20,FOLLOW_20_in_functionCall1266); if (state.failed) return fc;
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
		return fc;
	}
	// $ANTLR end "functionCall"



	// $ANTLR start "arrayRef"
	// ./src/ulNoActions.g:309:1: arrayRef returns [Expression e] : id= identifier '[' e1= expr ']' ;
	public final Expression arrayRef() throws RecognitionException {
		Expression e = null;


		Identifier id =null;
		Expression e1 =null;

		try {
			// ./src/ulNoActions.g:310:2: (id= identifier '[' e1= expr ']' )
			// ./src/ulNoActions.g:310:4: id= identifier '[' e1= expr ']'
			{
			pushFollow(FOLLOW_identifier_in_arrayRef1285);
			id=identifier();
			state._fsp--;
			if (state.failed) return e;
			match(input,29,FOLLOW_29_in_arrayRef1286); if (state.failed) return e;
			pushFollow(FOLLOW_expr_in_arrayRef1292);
			e1=expr();
			state._fsp--;
			if (state.failed) return e;
			match(input,30,FOLLOW_30_in_arrayRef1294); if (state.failed) return e;
			if ( state.backtracking==0 ) { e = new ArrayRef(id, e1); }
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
		return e;
	}
	// $ANTLR end "arrayRef"



	// $ANTLR start "parenExpr"
	// ./src/ulNoActions.g:313:1: parenExpr returns [Expression e] : '(' e1= expr ')' ;
	public final Expression parenExpr() throws RecognitionException {
		Expression e = null;


		Expression e1 =null;

		try {
			// ./src/ulNoActions.g:314:2: ( '(' e1= expr ')' )
			// ./src/ulNoActions.g:314:4: '(' e1= expr ')'
			{
			match(input,19,FOLLOW_19_in_parenExpr1312); if (state.failed) return e;
			pushFollow(FOLLOW_expr_in_parenExpr1318);
			e1=expr();
			state._fsp--;
			if (state.failed) return e;
			match(input,20,FOLLOW_20_in_parenExpr1320); if (state.failed) return e;
			if ( state.backtracking==0 ) { e = new ParenExpr(e1); }
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
		return e;
	}
	// $ANTLR end "parenExpr"



	// $ANTLR start "literal"
	// ./src/ulNoActions.g:324:1: literal returns [Literal l] : (il= integerconstant |fl= floatconstant |bl= bool |sl= stringconstant |cl= characterconstant );
	public final Literal literal() throws RecognitionException {
		Literal l = null;


		IntegerLiteral il =null;
		FloatLiteral fl =null;
		BooleanLiteral bl =null;
		StringLiteral sl =null;
		CharLiteral cl =null;

		try {
			// ./src/ulNoActions.g:325:2: (il= integerconstant |fl= floatconstant |bl= bool |sl= stringconstant |cl= characterconstant )
			int alt16=5;
			switch ( input.LA(1) ) {
			case INTEGERCONSTANT:
				{
				alt16=1;
				}
				break;
			case FLOATCONSTANT:
				{
				alt16=2;
				}
				break;
			case BOOL:
				{
				alt16=3;
				}
				break;
			case STRINGCONSTANT:
				{
				alt16=4;
				}
				break;
			case CHARACTERCONSTANT:
				{
				alt16=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return l;}
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}
			switch (alt16) {
				case 1 :
					// ./src/ulNoActions.g:325:4: il= integerconstant
					{
					pushFollow(FOLLOW_integerconstant_in_literal1349);
					il=integerconstant();
					state._fsp--;
					if (state.failed) return l;
					if ( state.backtracking==0 ) { l = il; }
					}
					break;
				case 2 :
					// ./src/ulNoActions.g:326:4: fl= floatconstant
					{
					pushFollow(FOLLOW_floatconstant_in_literal1360);
					fl=floatconstant();
					state._fsp--;
					if (state.failed) return l;
					if ( state.backtracking==0 ) { l = fl; }
					}
					break;
				case 3 :
					// ./src/ulNoActions.g:327:4: bl= bool
					{
					pushFollow(FOLLOW_bool_in_literal1371);
					bl=bool();
					state._fsp--;
					if (state.failed) return l;
					if ( state.backtracking==0 ) { l = bl; }
					}
					break;
				case 4 :
					// ./src/ulNoActions.g:328:4: sl= stringconstant
					{
					pushFollow(FOLLOW_stringconstant_in_literal1382);
					sl=stringconstant();
					state._fsp--;
					if (state.failed) return l;
					if ( state.backtracking==0 ) { l = sl;}
					}
					break;
				case 5 :
					// ./src/ulNoActions.g:329:4: cl= characterconstant
					{
					pushFollow(FOLLOW_characterconstant_in_literal1393);
					cl=characterconstant();
					state._fsp--;
					if (state.failed) return l;
					if ( state.backtracking==0 ) { l = cl; }
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
		return l;
	}
	// $ANTLR end "literal"



	// $ANTLR start "stringconstant"
	// ./src/ulNoActions.g:333:1: stringconstant returns [StringLiteral sl] : s= STRINGCONSTANT ;
	public final StringLiteral stringconstant() throws RecognitionException {
		StringLiteral sl = null;


		Token s=null;

		try {
			// ./src/ulNoActions.g:335:2: (s= STRINGCONSTANT )
			// ./src/ulNoActions.g:335:4: s= STRINGCONSTANT
			{
			s=(Token)match(input,STRINGCONSTANT,FOLLOW_STRINGCONSTANT_in_stringconstant1417); if (state.failed) return sl;
			if ( state.backtracking==0 ) { sl = new StringLiteral(s.getText()); }
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
		return sl;
	}
	// $ANTLR end "stringconstant"



	// $ANTLR start "floatconstant"
	// ./src/ulNoActions.g:339:1: floatconstant returns [FloatLiteral fl] : f= FLOATCONSTANT ;
	public final FloatLiteral floatconstant() throws RecognitionException {
		FloatLiteral fl = null;


		Token f=null;

		try {
			// ./src/ulNoActions.g:341:2: (f= FLOATCONSTANT )
			// ./src/ulNoActions.g:341:4: f= FLOATCONSTANT
			{
			f=(Token)match(input,FLOATCONSTANT,FOLLOW_FLOATCONSTANT_in_floatconstant1441); if (state.failed) return fl;
			if ( state.backtracking==0 ) { fl = new FloatLiteral(Float.parseFloat(f.getText())); }
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
		return fl;
	}
	// $ANTLR end "floatconstant"



	// $ANTLR start "characterconstant"
	// ./src/ulNoActions.g:345:1: characterconstant returns [CharLiteral cl] : c= CHARACTERCONSTANT ;
	public final CharLiteral characterconstant() throws RecognitionException {
		CharLiteral cl = null;


		Token c=null;

		try {
			// ./src/ulNoActions.g:347:2: (c= CHARACTERCONSTANT )
			// ./src/ulNoActions.g:347:4: c= CHARACTERCONSTANT
			{
			c=(Token)match(input,CHARACTERCONSTANT,FOLLOW_CHARACTERCONSTANT_in_characterconstant1465); if (state.failed) return cl;
			if ( state.backtracking==0 ) { cl = new CharLiteral(c.getText().charAt(0)); }
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
		return cl;
	}
	// $ANTLR end "characterconstant"



	// $ANTLR start "integerconstant"
	// ./src/ulNoActions.g:351:1: integerconstant returns [IntegerLiteral il] : i= INTEGERCONSTANT ;
	public final IntegerLiteral integerconstant() throws RecognitionException {
		IntegerLiteral il = null;


		Token i=null;

		try {
			// ./src/ulNoActions.g:353:2: (i= INTEGERCONSTANT )
			// ./src/ulNoActions.g:353:4: i= INTEGERCONSTANT
			{
			i=(Token)match(input,INTEGERCONSTANT,FOLLOW_INTEGERCONSTANT_in_integerconstant1489); if (state.failed) return il;
			if ( state.backtracking==0 ) { il = new IntegerLiteral(Integer.parseInt(i.getText())); }
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
		return il;
	}
	// $ANTLR end "integerconstant"



	// $ANTLR start "bool"
	// ./src/ulNoActions.g:357:1: bool returns [BooleanLiteral bl] : b= BOOL ;
	public final BooleanLiteral bool() throws RecognitionException {
		BooleanLiteral bl = null;


		Token b=null;

		try {
			// ./src/ulNoActions.g:359:2: (b= BOOL )
			// ./src/ulNoActions.g:359:4: b= BOOL
			{
			b=(Token)match(input,BOOL,FOLLOW_BOOL_in_bool1513); if (state.failed) return bl;
			if ( state.backtracking==0 ) { bl = new BooleanLiteral(Boolean.parseBoolean(b.getText())); }
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
		return bl;
	}
	// $ANTLR end "bool"

	// $ANTLR start synpred8_ulNoActions
	public final void synpred8_ulNoActions_fragment() throws RecognitionException {
		ExColonStmt ec =null;

		// ./src/ulNoActions.g:128:4: (ec= exprColon )
		// ./src/ulNoActions.g:128:4: ec= exprColon
		{
		pushFollow(FOLLOW_exprColon_in_synpred8_ulNoActions452);
		ec=exprColon();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred8_ulNoActions

	// $ANTLR start synpred9_ulNoActions
	public final void synpred9_ulNoActions_fragment() throws RecognitionException {
		ArrayAssignStmt aas =null;

		// ./src/ulNoActions.g:129:4: (aas= arrayAssign )
		// ./src/ulNoActions.g:129:4: aas= arrayAssign
		{
		pushFollow(FOLLOW_arrayAssign_in_synpred9_ulNoActions463);
		aas=arrayAssign();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred9_ulNoActions

	// $ANTLR start synpred10_ulNoActions
	public final void synpred10_ulNoActions_fragment() throws RecognitionException {
		IdAssignStmt idas =null;

		// ./src/ulNoActions.g:130:4: (idas= idAssign )
		// ./src/ulNoActions.g:130:4: idas= idAssign
		{
		pushFollow(FOLLOW_idAssign_in_synpred10_ulNoActions474);
		idas=idAssign();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred10_ulNoActions

	// $ANTLR start synpred11_ulNoActions
	public final void synpred11_ulNoActions_fragment() throws RecognitionException {
		IfElseStmt ie =null;

		// ./src/ulNoActions.g:131:4: (ie= ifElseBlock )
		// ./src/ulNoActions.g:131:4: ie= ifElseBlock
		{
		pushFollow(FOLLOW_ifElseBlock_in_synpred11_ulNoActions485);
		ie=ifElseBlock();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred11_ulNoActions

	// $ANTLR start synpred12_ulNoActions
	public final void synpred12_ulNoActions_fragment() throws RecognitionException {
		IfStmt is =null;

		// ./src/ulNoActions.g:132:4: (is= ifBlock )
		// ./src/ulNoActions.g:132:4: is= ifBlock
		{
		pushFollow(FOLLOW_ifBlock_in_synpred12_ulNoActions496);
		is=ifBlock();
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



	public static final BitSet FOLLOW_function_in_program70 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_EOF_in_program77 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionDecl_in_function98 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_functionBody_in_function104 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compoundType_in_functionDecl127 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_identifier_in_functionDecl133 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_functionDecl140 = new BitSet(new long[]{0x0000000000110000L});
	public static final BitSet FOLLOW_formalParameters_in_functionDecl148 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_functionDecl155 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compoundType_in_formalParameters177 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_identifier_in_formalParameters183 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_moreFormals_in_formalParameters198 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_23_in_moreFormals218 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_compoundType_in_moreFormals224 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_identifier_in_moreFormals230 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_functionBody259 = new BitSet(new long[]{0x00000001020BFF30L});
	public static final BitSet FOLLOW_varDecl_in_functionBody267 = new BitSet(new long[]{0x00000001020BFF30L});
	public static final BitSet FOLLOW_statement_in_functionBody288 = new BitSet(new long[]{0x00000001020AFF30L});
	public static final BitSet FOLLOW_32_in_functionBody294 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compoundType_in_varDecl315 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_identifier_in_varDecl321 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_varDecl323 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayDecl_in_compoundType348 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_in_compoundType361 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_in_arrayDecl383 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_arrayDecl385 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_integerconstant_in_arrayDecl391 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_arrayDecl393 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_identifier418 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_semiColon_in_statement441 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprColon_in_statement452 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayAssign_in_statement463 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_idAssign_in_statement474 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifElseBlock_in_statement485 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifBlock_in_statement496 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileBlock_in_statement507 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_printlnStmt_in_statement518 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_printStmt_in_statement529 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_returnStmt_in_statement540 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_whileBlock558 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_whileBlock559 = new BitSet(new long[]{0x0000000000088B30L});
	public static final BitSet FOLLOW_expr_in_whileBlock565 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_whileBlock566 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_block_in_whileBlock572 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINTLN_in_printlnStmt590 = new BitSet(new long[]{0x0000000000088B30L});
	public static final BitSet FOLLOW_expr_in_printlnStmt596 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_printlnStmt598 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_printStmt616 = new BitSet(new long[]{0x0000000000088B30L});
	public static final BitSet FOLLOW_expr_in_printStmt622 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_printStmt624 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURN_in_returnStmt649 = new BitSet(new long[]{0x0000000002088B30L});
	public static final BitSet FOLLOW_expr_in_returnStmt656 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_returnStmt662 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_semiColon678 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_exprColon700 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_exprColon702 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_arrayAssign726 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_arrayAssign728 = new BitSet(new long[]{0x0000000000088B30L});
	public static final BitSet FOLLOW_expr_in_arrayAssign734 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_arrayAssign736 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_arrayAssign738 = new BitSet(new long[]{0x0000000000088B30L});
	public static final BitSet FOLLOW_expr_in_arrayAssign744 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_arrayAssign746 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_idAssign771 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_idAssign773 = new BitSet(new long[]{0x0000000000088B30L});
	public static final BitSet FOLLOW_expr_in_idAssign779 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_idAssign781 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifElseBlock799 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_ifElseBlock800 = new BitSet(new long[]{0x0000000000088B30L});
	public static final BitSet FOLLOW_expr_in_ifElseBlock805 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_ifElseBlock806 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_block_in_ifElseBlock812 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ELSE_in_ifElseBlock814 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_block_in_ifElseBlock820 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifBlock841 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_ifBlock842 = new BitSet(new long[]{0x0000000000088B30L});
	public static final BitSet FOLLOW_expr_in_ifBlock847 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_ifBlock848 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_block_in_ifBlock854 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_block879 = new BitSet(new long[]{0x00000001020AFF30L});
	public static final BitSet FOLLOW_statement_in_block887 = new BitSet(new long[]{0x00000001020AFF30L});
	public static final BitSet FOLLOW_32_in_block894 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compareExpr_in_expr916 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lessExpr_in_compareExpr948 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_28_in_compareExpr953 = new BitSet(new long[]{0x0000000000088B30L});
	public static final BitSet FOLLOW_lessExpr_in_compareExpr959 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_plmiExpr_in_lessExpr994 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_26_in_lessExpr999 = new BitSet(new long[]{0x0000000000088B30L});
	public static final BitSet FOLLOW_plmiExpr_in_lessExpr1006 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_multExpr_in_plmiExpr1045 = new BitSet(new long[]{0x0000000001400002L});
	public static final BitSet FOLLOW_22_in_plmiExpr1058 = new BitSet(new long[]{0x0000000000088B30L});
	public static final BitSet FOLLOW_multExpr_in_plmiExpr1064 = new BitSet(new long[]{0x0000000001400002L});
	public static final BitSet FOLLOW_24_in_plmiExpr1082 = new BitSet(new long[]{0x0000000000088B30L});
	public static final BitSet FOLLOW_multExpr_in_plmiExpr1088 = new BitSet(new long[]{0x0000000001400002L});
	public static final BitSet FOLLOW_atom_in_multExpr1127 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_21_in_multExpr1132 = new BitSet(new long[]{0x0000000000088B30L});
	public static final BitSet FOLLOW_atom_in_multExpr1138 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_literal_in_atom1162 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_atom1173 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_atom1184 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayRef_in_atom1195 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parenExpr_in_atom1206 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_functionCall1234 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_functionCall1235 = new BitSet(new long[]{0x0000000000088B30L});
	public static final BitSet FOLLOW_expr_in_functionCall1241 = new BitSet(new long[]{0x0000000000900000L});
	public static final BitSet FOLLOW_23_in_functionCall1253 = new BitSet(new long[]{0x0000000000088B30L});
	public static final BitSet FOLLOW_expr_in_functionCall1259 = new BitSet(new long[]{0x0000000000900000L});
	public static final BitSet FOLLOW_20_in_functionCall1266 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_arrayRef1285 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_arrayRef1286 = new BitSet(new long[]{0x0000000000088B30L});
	public static final BitSet FOLLOW_expr_in_arrayRef1292 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_arrayRef1294 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_parenExpr1312 = new BitSet(new long[]{0x0000000000088B30L});
	public static final BitSet FOLLOW_expr_in_parenExpr1318 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_parenExpr1320 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_integerconstant_in_literal1349 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_floatconstant_in_literal1360 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bool_in_literal1371 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stringconstant_in_literal1382 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_characterconstant_in_literal1393 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRINGCONSTANT_in_stringconstant1417 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOATCONSTANT_in_floatconstant1441 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTERCONSTANT_in_characterconstant1465 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGERCONSTANT_in_integerconstant1489 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOL_in_bool1513 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprColon_in_synpred8_ulNoActions452 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayAssign_in_synpred9_ulNoActions463 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_idAssign_in_synpred10_ulNoActions474 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifElseBlock_in_synpred11_ulNoActions485 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifBlock_in_synpred12_ulNoActions496 = new BitSet(new long[]{0x0000000000000002L});
}
