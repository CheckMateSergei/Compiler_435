// $ANTLR null /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g 2020-01-27 10:09:03

import src.packages.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings("all")
public class ulNoActionsParser extends DebugParser {
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


	public static final String[] ruleNames = new String[] {
		"invalidRule", "statement", "synpred20_ulNoActions", "exprList", "floatconstant", 
		"synpred14_ulNoActions", "synpred7_ulNoActions", "synpred16_ulNoActions", 
		"semiColon", "synpred8_ulNoActions", "arrayAssign", "varDecl", "synpred1_ulNoActions", 
		"synpred12_ulNoActions", "synpred24_ulNoActions", "lessExpr", "whileBlock", 
		"synpred6_ulNoActions", "synpred2_ulNoActions", "type", "synpred27_ulNoActions", 
		"synpred18_ulNoActions", "returnStmt", "ifBlock", "functionCall", "synpred23_ulNoActions", 
		"literal", "synpred28_ulNoActions", "functionDecl", "ifElseBlock", "compareExpr", 
		"arrayRef", "identifier", "synpred26_ulNoActions", "arrayDecl", "printStmt", 
		"synpred30_ulNoActions", "synpred11_ulNoActions", "synpred15_ulNoActions", 
		"synpred4_ulNoActions", "atom", "integerconstant", "synpred3_ulNoActions", 
		"moreFormals", "synpred5_ulNoActions", "multExpr", "synpred25_ulNoActions", 
		"printlnStmt", "synpred19_ulNoActions", "exprMore", "exprColon", "synpred17_ulNoActions", 
		"idAssign", "program", "synpred31_ulNoActions", "plmiExpr", "formalParameters", 
		"synpred21_ulNoActions", "synpred10_ulNoActions", "stringconstant", "synpred29_ulNoActions", 
		"expr", "synpred9_ulNoActions", "block", "bool", "synpred13_ulNoActions", 
		"functionBody", "parenExpr", "characterconstant", "function", "synpred22_ulNoActions", 
		"compoundType"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, true, false, false, false, false, 
		    false, false, false, false, false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public ulNoActionsParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public ulNoActionsParser(TokenStream input, int port, RecognizerSharedState state) {
		super(input, state);
		DebugEventSocketProxy proxy =
			new DebugEventSocketProxy(this, port, null);

		setDebugListener(proxy);
		try {
			proxy.handshake();
		}
		catch (IOException ioe) {
			reportError(ioe);
		}
	}

	public ulNoActionsParser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg, new RecognizerSharedState());
	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

	@Override public String[] getTokenNames() { return ulNoActionsParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g"; }


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
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:50:1: program returns [Program p] : (f= function )+ EOF ;
	public final Program program() throws RecognitionException {
		Program p = null;


		Function f =null;


			p = new Program();

		try { dbg.enterRule(getGrammarFileName(), "program");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(50, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:58:2: ( (f= function )+ EOF )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:61:2: (f= function )+ EOF
			{
			dbg.location(61,2);
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:61:2: (f= function )+
			int cnt1=0;
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( (LA1_0==TYPE) ) {
					alt1=1;
				}

				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:61:4: f= function
					{
					dbg.location(61,6);
					pushFollow(FOLLOW_function_in_program75);
					f=function();
					state._fsp--;
					if (state.failed) return p;dbg.location(61,17);
					if ( state.backtracking==0 ) { p.addFunction(f); }
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					if (state.backtracking>0) {state.failed=true; return p;}
					EarlyExitException eee = new EarlyExitException(1, input);
					dbg.recognitionException(eee);

					throw eee;
				}
				cnt1++;
			}
			} finally {dbg.exitSubRule(1);}
			dbg.location(61,42);
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
		dbg.location(62, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "program");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return p;
	}
	// $ANTLR end "program"



	// $ANTLR start "function"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:64:1: function returns [Function f] : fd= functionDecl fb= functionBody ;
	public final Function function() throws RecognitionException {
		Function f = null;


		FunctionDecl fd =null;

		try { dbg.enterRule(getGrammarFileName(), "function");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(64, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:66:2: (fd= functionDecl fb= functionBody )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:66:4: fd= functionDecl fb= functionBody
			{
			dbg.location(66,7);
			pushFollow(FOLLOW_functionDecl_in_function103);
			fd=functionDecl();
			state._fsp--;
			if (state.failed) return f;dbg.location(66,25);
			pushFollow(FOLLOW_functionBody_in_function109);
			functionBody();
			state._fsp--;
			if (state.failed) return f;dbg.location(66,40);
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
		dbg.location(67, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "function");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return f;
	}
	// $ANTLR end "function"



	// $ANTLR start "functionDecl"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:69:1: functionDecl returns [FunctionDecl fd] : ct= compoundType id= identifier '(' (fp= formalParameters )? ')' ;
	public final FunctionDecl functionDecl() throws RecognitionException {
		FunctionDecl fd = null;


		FormalParam fp =null;

		try { dbg.enterRule(getGrammarFileName(), "functionDecl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(69, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:71:2: (ct= compoundType id= identifier '(' (fp= formalParameters )? ')' )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:71:4: ct= compoundType id= identifier '(' (fp= formalParameters )? ')'
			{
			dbg.location(71,7);
			pushFollow(FOLLOW_compoundType_in_functionDecl132);
			compoundType();
			state._fsp--;
			if (state.failed) return fd;dbg.location(71,25);
			pushFollow(FOLLOW_identifier_in_functionDecl138);
			identifier();
			state._fsp--;
			if (state.failed) return fd;dbg.location(71,38);
			if ( state.backtracking==0 ) { fd = new FunctionDecl(ct, id); }dbg.location(73,2);
			match(input,19,FOLLOW_19_in_functionDecl145); if (state.failed) return fd;dbg.location(73,6);
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:73:6: (fp= formalParameters )?
			int alt2=2;
			try { dbg.enterSubRule(2);
			try { dbg.enterDecision(2, decisionCanBacktrack[2]);

			int LA2_0 = input.LA(1);
			if ( (LA2_0==TYPE) ) {
				alt2=1;
			}
			} finally {dbg.exitDecision(2);}

			switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:73:8: fp= formalParameters
					{
					dbg.location(73,11);
					pushFollow(FOLLOW_formalParameters_in_functionDecl153);
					fp=formalParameters();
					state._fsp--;
					if (state.failed) return fd;
					}
					break;

			}
			} finally {dbg.exitSubRule(2);}
			dbg.location(73,33);
			match(input,20,FOLLOW_20_in_functionDecl158); if (state.failed) return fd;dbg.location(73,37);
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
		dbg.location(74, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "functionDecl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return fd;
	}
	// $ANTLR end "functionDecl"



	// $ANTLR start "formalParameters"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:76:1: formalParameters returns [FormalParam fp] : ct= compoundType id= identifier (mf= moreFormals )* ;
	public final FormalParam formalParameters() throws RecognitionException {
		FormalParam fp = null;


		FormalParam mf =null;

		try { dbg.enterRule(getGrammarFileName(), "formalParameters");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(76, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:78:2: (ct= compoundType id= identifier (mf= moreFormals )* )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:78:4: ct= compoundType id= identifier (mf= moreFormals )*
			{
			dbg.location(78,7);
			pushFollow(FOLLOW_compoundType_in_formalParameters181);
			compoundType();
			state._fsp--;
			if (state.failed) return fp;dbg.location(78,25);
			pushFollow(FOLLOW_identifier_in_formalParameters187);
			identifier();
			state._fsp--;
			if (state.failed) return fp;dbg.location(78,38);
			if ( state.backtracking==0 ) { fp = new FormalParam(ct, id); }dbg.location(80,4);
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:80:4: (mf= moreFormals )*
			try { dbg.enterSubRule(3);

			loop3:
			while (true) {
				int alt3=2;
				try { dbg.enterDecision(3, decisionCanBacktrack[3]);

				int LA3_0 = input.LA(1);
				if ( (LA3_0==23) ) {
					alt3=1;
				}

				} finally {dbg.exitDecision(3);}

				switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:80:6: mf= moreFormals
					{
					dbg.location(80,9);
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
			} finally {dbg.exitSubRule(3);}

			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
		dbg.location(81, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "formalParameters");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return fp;
	}
	// $ANTLR end "formalParameters"



	// $ANTLR start "moreFormals"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:83:1: moreFormals returns [FormalParam mf] : ',' ct= compoundType id= identifier ;
	public final FormalParam moreFormals() throws RecognitionException {
		FormalParam mf = null;


		try { dbg.enterRule(getGrammarFileName(), "moreFormals");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(83, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:84:2: ( ',' ct= compoundType id= identifier )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:84:4: ',' ct= compoundType id= identifier
			{
			dbg.location(84,4);
			match(input,23,FOLLOW_23_in_moreFormals221); if (state.failed) return mf;dbg.location(84,11);
			pushFollow(FOLLOW_compoundType_in_moreFormals227);
			compoundType();
			state._fsp--;
			if (state.failed) return mf;dbg.location(84,29);
			pushFollow(FOLLOW_identifier_in_moreFormals233);
			identifier();
			state._fsp--;
			if (state.failed) return mf;dbg.location(87,2);
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
		dbg.location(88, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "moreFormals");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return mf;
	}
	// $ANTLR end "moreFormals"



	// $ANTLR start "functionBody"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:90:1: functionBody : '{' ( varDecl )* ( statement )* '}' ;
	public final void functionBody() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "functionBody");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(90, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:90:13: ( '{' ( varDecl )* ( statement )* '}' )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:90:15: '{' ( varDecl )* ( statement )* '}'
			{
			dbg.location(90,15);
			match(input,31,FOLLOW_31_in_functionBody249); if (state.failed) return;dbg.location(90,19);
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:90:19: ( varDecl )*
			try { dbg.enterSubRule(4);

			loop4:
			while (true) {
				int alt4=2;
				try { dbg.enterDecision(4, decisionCanBacktrack[4]);

				int LA4_0 = input.LA(1);
				if ( (LA4_0==TYPE) ) {
					alt4=1;
				}

				} finally {dbg.exitDecision(4);}

				switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:90:19: varDecl
					{
					dbg.location(90,19);
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
			} finally {dbg.exitSubRule(4);}
			dbg.location(90,29);
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:90:29: ( statement )*
			try { dbg.enterSubRule(5);

			loop5:
			while (true) {
				int alt5=2;
				try { dbg.enterDecision(5, decisionCanBacktrack[5]);

				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= BOOL && LA5_0 <= CHARACTERCONSTANT)||(LA5_0 >= FLOATCONSTANT && LA5_0 <= STRINGCONSTANT)||LA5_0==WHILE||LA5_0==19||LA5_0==25) ) {
					alt5=1;
				}

				} finally {dbg.exitDecision(5);}

				switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:90:29: statement
					{
					dbg.location(90,29);
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
			} finally {dbg.exitSubRule(5);}
			dbg.location(90,40);
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
		dbg.location(91, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "functionBody");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "functionBody"



	// $ANTLR start "varDecl"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:93:1: varDecl : compoundType identifier ';' ;
	public final void varDecl() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "varDecl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(93, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:93:8: ( compoundType identifier ';' )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:93:10: compoundType identifier ';'
			{
			dbg.location(93,10);
			pushFollow(FOLLOW_compoundType_in_varDecl267);
			compoundType();
			state._fsp--;
			if (state.failed) return;dbg.location(93,23);
			pushFollow(FOLLOW_identifier_in_varDecl269);
			identifier();
			state._fsp--;
			if (state.failed) return;dbg.location(93,34);
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
		dbg.location(94, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "varDecl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "varDecl"



	// $ANTLR start "compoundType"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:96:1: compoundType : ( type | arrayDecl );
	public final void compoundType() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "compoundType");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(96, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:96:13: ( type | arrayDecl )
			int alt6=2;
			try { dbg.enterDecision(6, decisionCanBacktrack[6]);

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
						dbg.recognitionException(nvae);
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
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(6);}

			switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:96:15: type
					{
					dbg.location(96,15);
					pushFollow(FOLLOW_type_in_compoundType280);
					type();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:97:4: arrayDecl
					{
					dbg.location(97,4);
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
		dbg.location(98, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "compoundType");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "compoundType"



	// $ANTLR start "arrayDecl"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:100:1: arrayDecl : type '[' integerconstant ']' ;
	public final void arrayDecl() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "arrayDecl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(100, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:100:10: ( type '[' integerconstant ']' )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:100:12: type '[' integerconstant ']'
			{
			dbg.location(100,12);
			pushFollow(FOLLOW_type_in_arrayDecl296);
			type();
			state._fsp--;
			if (state.failed) return;dbg.location(100,16);
			match(input,29,FOLLOW_29_in_arrayDecl297); if (state.failed) return;dbg.location(100,19);
			pushFollow(FOLLOW_integerconstant_in_arrayDecl298);
			integerconstant();
			state._fsp--;
			if (state.failed) return;dbg.location(100,34);
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
		dbg.location(101, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "arrayDecl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "arrayDecl"



	// $ANTLR start "identifier"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:103:1: identifier : ID ;
	public final void identifier() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "identifier");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(103, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:103:12: ( ID )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:103:14: ID
			{
			dbg.location(103,14);
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
		dbg.location(104, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "identifier");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "identifier"



	// $ANTLR start "type"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:106:1: type : TYPE ;
	public final void type() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "type");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(106, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:106:5: ( TYPE )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:106:7: TYPE
			{
			dbg.location(106,7);
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
		dbg.location(107, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "type");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "type"



	// $ANTLR start "statement"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:109:1: statement : ( semiColon | exprColon | idAssign | arrayAssign | ifElseBlock | ifBlock | whileBlock | printlnStmt | printStmt | returnStmt );
	public final void statement() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "statement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(109, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:109:10: ( semiColon | exprColon | idAssign | arrayAssign | ifElseBlock | ifBlock | whileBlock | printlnStmt | printStmt | returnStmt )
			int alt7=10;
			try { dbg.enterDecision(7, decisionCanBacktrack[7]);

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
						dbg.recognitionException(nvae);
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
						dbg.recognitionException(nvae);
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
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(7);}

			switch (alt7) {
				case 1 :
					dbg.enterAlt(1);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:109:12: semiColon
					{
					dbg.location(109,12);
					pushFollow(FOLLOW_semiColon_in_statement327);
					semiColon();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:110:2: exprColon
					{
					dbg.location(110,2);
					pushFollow(FOLLOW_exprColon_in_statement332);
					exprColon();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:111:2: idAssign
					{
					dbg.location(111,2);
					pushFollow(FOLLOW_idAssign_in_statement337);
					idAssign();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:112:2: arrayAssign
					{
					dbg.location(112,2);
					pushFollow(FOLLOW_arrayAssign_in_statement342);
					arrayAssign();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:113:2: ifElseBlock
					{
					dbg.location(113,2);
					pushFollow(FOLLOW_ifElseBlock_in_statement347);
					ifElseBlock();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:114:2: ifBlock
					{
					dbg.location(114,2);
					pushFollow(FOLLOW_ifBlock_in_statement352);
					ifBlock();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:115:2: whileBlock
					{
					dbg.location(115,2);
					pushFollow(FOLLOW_whileBlock_in_statement357);
					whileBlock();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 8 :
					dbg.enterAlt(8);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:116:2: printlnStmt
					{
					dbg.location(116,2);
					pushFollow(FOLLOW_printlnStmt_in_statement362);
					printlnStmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 9 :
					dbg.enterAlt(9);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:117:2: printStmt
					{
					dbg.location(117,2);
					pushFollow(FOLLOW_printStmt_in_statement367);
					printStmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 10 :
					dbg.enterAlt(10);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:118:2: returnStmt
					{
					dbg.location(118,2);
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
		dbg.location(119, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "statement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "statement"



	// $ANTLR start "whileBlock"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:121:1: whileBlock : WHILE '(' expr ')' block ;
	public final void whileBlock() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "whileBlock");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(121, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:121:11: ( WHILE '(' expr ')' block )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:121:13: WHILE '(' expr ')' block
			{
			dbg.location(121,13);
			match(input,WHILE,FOLLOW_WHILE_in_whileBlock381); if (state.failed) return;dbg.location(121,18);
			match(input,19,FOLLOW_19_in_whileBlock382); if (state.failed) return;dbg.location(121,22);
			pushFollow(FOLLOW_expr_in_whileBlock384);
			expr();
			state._fsp--;
			if (state.failed) return;dbg.location(121,26);
			match(input,20,FOLLOW_20_in_whileBlock385); if (state.failed) return;dbg.location(121,30);
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
		dbg.location(122, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "whileBlock");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "whileBlock"



	// $ANTLR start "printlnStmt"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:124:1: printlnStmt : PRINTLN expr ';' ;
	public final void printlnStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "printlnStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(124, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:124:12: ( PRINTLN expr ';' )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:124:14: PRINTLN expr ';'
			{
			dbg.location(124,14);
			match(input,PRINTLN,FOLLOW_PRINTLN_in_printlnStmt396); if (state.failed) return;dbg.location(124,22);
			pushFollow(FOLLOW_expr_in_printlnStmt398);
			expr();
			state._fsp--;
			if (state.failed) return;dbg.location(124,27);
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
		dbg.location(125, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "printlnStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "printlnStmt"



	// $ANTLR start "printStmt"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:127:1: printStmt : PRINT expr ';' ;
	public final void printStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "printStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(127, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:127:10: ( PRINT expr ';' )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:127:12: PRINT expr ';'
			{
			dbg.location(127,12);
			match(input,PRINT,FOLLOW_PRINT_in_printStmt409); if (state.failed) return;dbg.location(127,18);
			pushFollow(FOLLOW_expr_in_printStmt411);
			expr();
			state._fsp--;
			if (state.failed) return;dbg.location(127,23);
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
		dbg.location(128, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "printStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "printStmt"



	// $ANTLR start "returnStmt"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:130:1: returnStmt : RETURN ( expr )? ';' ;
	public final void returnStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "returnStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(130, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:130:11: ( RETURN ( expr )? ';' )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:130:13: RETURN ( expr )? ';'
			{
			dbg.location(130,13);
			match(input,RETURN,FOLLOW_RETURN_in_returnStmt422); if (state.failed) return;dbg.location(130,20);
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:130:20: ( expr )?
			int alt8=2;
			try { dbg.enterSubRule(8);
			try { dbg.enterDecision(8, decisionCanBacktrack[8]);

			int LA8_0 = input.LA(1);
			if ( ((LA8_0 >= BOOL && LA8_0 <= CHARACTERCONSTANT)||(LA8_0 >= FLOATCONSTANT && LA8_0 <= ID)||LA8_0==INTEGERCONSTANT||LA8_0==STRINGCONSTANT||LA8_0==19) ) {
				alt8=1;
			}
			} finally {dbg.exitDecision(8);}

			switch (alt8) {
				case 1 :
					dbg.enterAlt(1);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:130:20: expr
					{
					dbg.location(130,20);
					pushFollow(FOLLOW_expr_in_returnStmt424);
					expr();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(8);}
			dbg.location(130,26);
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
		dbg.location(131, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "returnStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "returnStmt"



	// $ANTLR start "semiColon"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:133:1: semiColon : ';' ;
	public final void semiColon() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "semiColon");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(133, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:133:10: ( ';' )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:133:12: ';'
			{
			dbg.location(133,12);
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
		dbg.location(134, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "semiColon");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "semiColon"



	// $ANTLR start "exprColon"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:136:1: exprColon : expr ';' ;
	public final void exprColon() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "exprColon");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(136, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:136:10: ( expr ';' )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:136:12: expr ';'
			{
			dbg.location(136,12);
			pushFollow(FOLLOW_expr_in_exprColon445);
			expr();
			state._fsp--;
			if (state.failed) return;dbg.location(136,17);
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
		dbg.location(137, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "exprColon");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "exprColon"



	// $ANTLR start "idAssign"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:139:1: idAssign : identifier '=' expr ';' ;
	public final void idAssign() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "idAssign");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(139, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:139:9: ( identifier '=' expr ';' )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:139:11: identifier '=' expr ';'
			{
			dbg.location(139,11);
			pushFollow(FOLLOW_identifier_in_idAssign456);
			identifier();
			state._fsp--;
			if (state.failed) return;dbg.location(139,22);
			match(input,27,FOLLOW_27_in_idAssign458); if (state.failed) return;dbg.location(139,26);
			pushFollow(FOLLOW_expr_in_idAssign460);
			expr();
			state._fsp--;
			if (state.failed) return;dbg.location(139,31);
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
		dbg.location(140, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "idAssign");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "idAssign"



	// $ANTLR start "arrayAssign"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:142:1: arrayAssign : identifier '[' expr ']' '=' expr ';' ;
	public final void arrayAssign() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "arrayAssign");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(142, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:142:12: ( identifier '[' expr ']' '=' expr ';' )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:142:14: identifier '[' expr ']' '=' expr ';'
			{
			dbg.location(142,14);
			pushFollow(FOLLOW_identifier_in_arrayAssign471);
			identifier();
			state._fsp--;
			if (state.failed) return;dbg.location(142,25);
			match(input,29,FOLLOW_29_in_arrayAssign473); if (state.failed) return;dbg.location(142,29);
			pushFollow(FOLLOW_expr_in_arrayAssign475);
			expr();
			state._fsp--;
			if (state.failed) return;dbg.location(142,33);
			match(input,30,FOLLOW_30_in_arrayAssign476); if (state.failed) return;dbg.location(142,37);
			match(input,27,FOLLOW_27_in_arrayAssign478); if (state.failed) return;dbg.location(142,41);
			pushFollow(FOLLOW_expr_in_arrayAssign480);
			expr();
			state._fsp--;
			if (state.failed) return;dbg.location(142,46);
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
		dbg.location(143, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "arrayAssign");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "arrayAssign"



	// $ANTLR start "ifElseBlock"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:145:1: ifElseBlock : IF '(' expr ')' block ELSE block ;
	public final void ifElseBlock() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ifElseBlock");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(145, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:145:12: ( IF '(' expr ')' block ELSE block )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:145:14: IF '(' expr ')' block ELSE block
			{
			dbg.location(145,14);
			match(input,IF,FOLLOW_IF_in_ifElseBlock491); if (state.failed) return;dbg.location(145,16);
			match(input,19,FOLLOW_19_in_ifElseBlock492); if (state.failed) return;dbg.location(145,19);
			pushFollow(FOLLOW_expr_in_ifElseBlock493);
			expr();
			state._fsp--;
			if (state.failed) return;dbg.location(145,23);
			match(input,20,FOLLOW_20_in_ifElseBlock494); if (state.failed) return;dbg.location(145,27);
			pushFollow(FOLLOW_block_in_ifElseBlock496);
			block();
			state._fsp--;
			if (state.failed) return;dbg.location(145,33);
			match(input,ELSE,FOLLOW_ELSE_in_ifElseBlock498); if (state.failed) return;dbg.location(145,38);
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
		dbg.location(146, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ifElseBlock");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ifElseBlock"



	// $ANTLR start "ifBlock"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:148:1: ifBlock : IF '(' expr ')' block ;
	public final void ifBlock() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ifBlock");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(148, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:148:8: ( IF '(' expr ')' block )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:148:10: IF '(' expr ')' block
			{
			dbg.location(148,10);
			match(input,IF,FOLLOW_IF_in_ifBlock509); if (state.failed) return;dbg.location(148,12);
			match(input,19,FOLLOW_19_in_ifBlock510); if (state.failed) return;dbg.location(148,15);
			pushFollow(FOLLOW_expr_in_ifBlock511);
			expr();
			state._fsp--;
			if (state.failed) return;dbg.location(148,19);
			match(input,20,FOLLOW_20_in_ifBlock512); if (state.failed) return;dbg.location(148,23);
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
		dbg.location(149, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ifBlock");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ifBlock"



	// $ANTLR start "block"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:151:1: block : '{' ( statement )* '}' ;
	public final void block() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "block");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(151, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:151:6: ( '{' ( statement )* '}' )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:151:8: '{' ( statement )* '}'
			{
			dbg.location(151,8);
			match(input,31,FOLLOW_31_in_block523); if (state.failed) return;dbg.location(151,12);
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:151:12: ( statement )*
			try { dbg.enterSubRule(9);

			loop9:
			while (true) {
				int alt9=2;
				try { dbg.enterDecision(9, decisionCanBacktrack[9]);

				int LA9_0 = input.LA(1);
				if ( ((LA9_0 >= BOOL && LA9_0 <= CHARACTERCONSTANT)||(LA9_0 >= FLOATCONSTANT && LA9_0 <= STRINGCONSTANT)||LA9_0==WHILE||LA9_0==19||LA9_0==25) ) {
					alt9=1;
				}

				} finally {dbg.exitDecision(9);}

				switch (alt9) {
				case 1 :
					dbg.enterAlt(1);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:151:12: statement
					{
					dbg.location(151,12);
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
			} finally {dbg.exitSubRule(9);}
			dbg.location(151,23);
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
		dbg.location(152, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "block");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "block"



	// $ANTLR start "expr"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:154:1: expr : compareExpr ;
	public final void expr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "expr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(154, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:154:5: ( compareExpr )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:154:7: compareExpr
			{
			dbg.location(154,7);
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
		dbg.location(155, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "expr"



	// $ANTLR start "compareExpr"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:157:1: compareExpr : lessExpr ( '==' lessExpr )* ;
	public final void compareExpr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "compareExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(157, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:157:12: ( lessExpr ( '==' lessExpr )* )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:157:14: lessExpr ( '==' lessExpr )*
			{
			dbg.location(157,14);
			pushFollow(FOLLOW_lessExpr_in_compareExpr546);
			lessExpr();
			state._fsp--;
			if (state.failed) return;dbg.location(157,23);
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:157:23: ( '==' lessExpr )*
			try { dbg.enterSubRule(10);

			loop10:
			while (true) {
				int alt10=2;
				try { dbg.enterDecision(10, decisionCanBacktrack[10]);

				int LA10_0 = input.LA(1);
				if ( (LA10_0==28) ) {
					alt10=1;
				}

				} finally {dbg.exitDecision(10);}

				switch (alt10) {
				case 1 :
					dbg.enterAlt(1);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:157:24: '==' lessExpr
					{
					dbg.location(157,24);
					match(input,28,FOLLOW_28_in_compareExpr549); if (state.failed) return;dbg.location(157,29);
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
			} finally {dbg.exitSubRule(10);}

			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
		dbg.location(158, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "compareExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "compareExpr"



	// $ANTLR start "lessExpr"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:160:1: lessExpr : plmiExpr ( '<' plmiExpr )* ;
	public final void lessExpr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "lessExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(160, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:160:9: ( plmiExpr ( '<' plmiExpr )* )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:160:11: plmiExpr ( '<' plmiExpr )*
			{
			dbg.location(160,11);
			pushFollow(FOLLOW_plmiExpr_in_lessExpr562);
			plmiExpr();
			state._fsp--;
			if (state.failed) return;dbg.location(160,20);
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:160:20: ( '<' plmiExpr )*
			try { dbg.enterSubRule(11);

			loop11:
			while (true) {
				int alt11=2;
				try { dbg.enterDecision(11, decisionCanBacktrack[11]);

				int LA11_0 = input.LA(1);
				if ( (LA11_0==26) ) {
					alt11=1;
				}

				} finally {dbg.exitDecision(11);}

				switch (alt11) {
				case 1 :
					dbg.enterAlt(1);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:160:21: '<' plmiExpr
					{
					dbg.location(160,21);
					match(input,26,FOLLOW_26_in_lessExpr565); if (state.failed) return;dbg.location(160,25);
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
			} finally {dbg.exitSubRule(11);}

			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
		dbg.location(161, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "lessExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "lessExpr"



	// $ANTLR start "plmiExpr"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:163:1: plmiExpr : multExpr ( ( '+' | '-' ) multExpr )* ;
	public final void plmiExpr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "plmiExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(163, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:163:9: ( multExpr ( ( '+' | '-' ) multExpr )* )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:163:11: multExpr ( ( '+' | '-' ) multExpr )*
			{
			dbg.location(163,11);
			pushFollow(FOLLOW_multExpr_in_plmiExpr578);
			multExpr();
			state._fsp--;
			if (state.failed) return;dbg.location(163,20);
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:163:20: ( ( '+' | '-' ) multExpr )*
			try { dbg.enterSubRule(12);

			loop12:
			while (true) {
				int alt12=2;
				try { dbg.enterDecision(12, decisionCanBacktrack[12]);

				int LA12_0 = input.LA(1);
				if ( (LA12_0==22||LA12_0==24) ) {
					alt12=1;
				}

				} finally {dbg.exitDecision(12);}

				switch (alt12) {
				case 1 :
					dbg.enterAlt(1);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:163:21: ( '+' | '-' ) multExpr
					{
					dbg.location(163,21);
					if ( input.LA(1)==22||input.LA(1)==24 ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}dbg.location(163,31);
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
			} finally {dbg.exitSubRule(12);}

			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
		dbg.location(164, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "plmiExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "plmiExpr"



	// $ANTLR start "multExpr"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:166:1: multExpr : atom ( '*' atom )* ;
	public final void multExpr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "multExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(166, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:166:9: ( atom ( '*' atom )* )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:166:11: atom ( '*' atom )*
			{
			dbg.location(166,11);
			pushFollow(FOLLOW_atom_in_multExpr598);
			atom();
			state._fsp--;
			if (state.failed) return;dbg.location(166,16);
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:166:16: ( '*' atom )*
			try { dbg.enterSubRule(13);

			loop13:
			while (true) {
				int alt13=2;
				try { dbg.enterDecision(13, decisionCanBacktrack[13]);

				int LA13_0 = input.LA(1);
				if ( (LA13_0==21) ) {
					alt13=1;
				}

				} finally {dbg.exitDecision(13);}

				switch (alt13) {
				case 1 :
					dbg.enterAlt(1);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:166:17: '*' atom
					{
					dbg.location(166,17);
					match(input,21,FOLLOW_21_in_multExpr601); if (state.failed) return;dbg.location(166,21);
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
			} finally {dbg.exitSubRule(13);}

			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
		dbg.location(167, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "multExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "multExpr"



	// $ANTLR start "atom"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:169:1: atom : ( literal | identifier | functionCall | arrayRef | parenExpr );
	public final void atom() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "atom");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(169, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:169:5: ( literal | identifier | functionCall | arrayRef | parenExpr )
			int alt14=5;
			try { dbg.enterDecision(14, decisionCanBacktrack[14]);

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
						dbg.recognitionException(nvae);
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
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(14);}

			switch (alt14) {
				case 1 :
					dbg.enterAlt(1);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:169:7: literal
					{
					dbg.location(169,7);
					pushFollow(FOLLOW_literal_in_atom614);
					literal();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:170:2: identifier
					{
					dbg.location(170,2);
					pushFollow(FOLLOW_identifier_in_atom619);
					identifier();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:171:2: functionCall
					{
					dbg.location(171,2);
					pushFollow(FOLLOW_functionCall_in_atom624);
					functionCall();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:172:2: arrayRef
					{
					dbg.location(172,2);
					pushFollow(FOLLOW_arrayRef_in_atom629);
					arrayRef();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:173:2: parenExpr
					{
					dbg.location(173,2);
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
		dbg.location(174, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "atom");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "atom"



	// $ANTLR start "functionCall"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:176:1: functionCall : identifier '(' exprList ')' ;
	public final void functionCall() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "functionCall");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(176, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:176:13: ( identifier '(' exprList ')' )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:176:15: identifier '(' exprList ')'
			{
			dbg.location(176,15);
			pushFollow(FOLLOW_identifier_in_functionCall644);
			identifier();
			state._fsp--;
			if (state.failed) return;dbg.location(176,25);
			match(input,19,FOLLOW_19_in_functionCall645); if (state.failed) return;dbg.location(176,29);
			pushFollow(FOLLOW_exprList_in_functionCall647);
			exprList();
			state._fsp--;
			if (state.failed) return;dbg.location(176,38);
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
		dbg.location(177, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "functionCall");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "functionCall"



	// $ANTLR start "arrayRef"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:179:1: arrayRef : identifier '[' expr ']' ;
	public final void arrayRef() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "arrayRef");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(179, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:179:9: ( identifier '[' expr ']' )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:179:11: identifier '[' expr ']'
			{
			dbg.location(179,11);
			pushFollow(FOLLOW_identifier_in_arrayRef658);
			identifier();
			state._fsp--;
			if (state.failed) return;dbg.location(179,21);
			match(input,29,FOLLOW_29_in_arrayRef659); if (state.failed) return;dbg.location(179,24);
			pushFollow(FOLLOW_expr_in_arrayRef660);
			expr();
			state._fsp--;
			if (state.failed) return;dbg.location(179,28);
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
		dbg.location(180, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "arrayRef");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "arrayRef"



	// $ANTLR start "parenExpr"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:182:1: parenExpr : '(' expr ')' ;
	public final void parenExpr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "parenExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(182, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:182:10: ( '(' expr ')' )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:182:12: '(' expr ')'
			{
			dbg.location(182,12);
			match(input,19,FOLLOW_19_in_parenExpr671); if (state.failed) return;dbg.location(182,16);
			pushFollow(FOLLOW_expr_in_parenExpr673);
			expr();
			state._fsp--;
			if (state.failed) return;dbg.location(182,21);
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
		dbg.location(183, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "parenExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "parenExpr"



	// $ANTLR start "exprList"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:185:1: exprList : expr ( exprMore )* ;
	public final void exprList() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "exprList");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(185, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:185:9: ( expr ( exprMore )* )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:185:11: expr ( exprMore )*
			{
			dbg.location(185,11);
			pushFollow(FOLLOW_expr_in_exprList684);
			expr();
			state._fsp--;
			if (state.failed) return;dbg.location(185,16);
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:185:16: ( exprMore )*
			try { dbg.enterSubRule(15);

			loop15:
			while (true) {
				int alt15=2;
				try { dbg.enterDecision(15, decisionCanBacktrack[15]);

				int LA15_0 = input.LA(1);
				if ( (LA15_0==23) ) {
					alt15=1;
				}

				} finally {dbg.exitDecision(15);}

				switch (alt15) {
				case 1 :
					dbg.enterAlt(1);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:185:16: exprMore
					{
					dbg.location(185,16);
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
			} finally {dbg.exitSubRule(15);}

			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
		dbg.location(186, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "exprList");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "exprList"



	// $ANTLR start "exprMore"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:188:1: exprMore : ',' expr ;
	public final void exprMore() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "exprMore");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(188, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:188:9: ( ',' expr )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:188:11: ',' expr
			{
			dbg.location(188,11);
			match(input,23,FOLLOW_23_in_exprMore696); if (state.failed) return;dbg.location(188,15);
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
		dbg.location(189, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "exprMore");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "exprMore"



	// $ANTLR start "literal"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:191:1: literal : ( stringconstant | integerconstant | characterconstant | floatconstant | bool );
	public final void literal() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "literal");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(191, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:191:8: ( stringconstant | integerconstant | characterconstant | floatconstant | bool )
			int alt16=5;
			try { dbg.enterDecision(16, decisionCanBacktrack[16]);

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
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(16);}

			switch (alt16) {
				case 1 :
					dbg.enterAlt(1);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:191:10: stringconstant
					{
					dbg.location(191,10);
					pushFollow(FOLLOW_stringconstant_in_literal708);
					stringconstant();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:192:2: integerconstant
					{
					dbg.location(192,2);
					pushFollow(FOLLOW_integerconstant_in_literal713);
					integerconstant();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:193:2: characterconstant
					{
					dbg.location(193,2);
					pushFollow(FOLLOW_characterconstant_in_literal718);
					characterconstant();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:194:2: floatconstant
					{
					dbg.location(194,2);
					pushFollow(FOLLOW_floatconstant_in_literal723);
					floatconstant();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:195:2: bool
					{
					dbg.location(195,2);
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
		dbg.location(196, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "literal");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "literal"



	// $ANTLR start "stringconstant"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:198:1: stringconstant : STRINGCONSTANT ;
	public final void stringconstant() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "stringconstant");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(198, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:198:15: ( STRINGCONSTANT )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:198:17: STRINGCONSTANT
			{
			dbg.location(198,17);
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
		dbg.location(199, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "stringconstant");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "stringconstant"



	// $ANTLR start "floatconstant"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:201:1: floatconstant : FLOATCONSTANT ;
	public final void floatconstant() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "floatconstant");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(201, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:201:14: ( FLOATCONSTANT )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:201:16: FLOATCONSTANT
			{
			dbg.location(201,16);
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
		dbg.location(202, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "floatconstant");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "floatconstant"



	// $ANTLR start "characterconstant"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:204:1: characterconstant : CHARACTERCONSTANT ;
	public final void characterconstant() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "characterconstant");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(204, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:204:18: ( CHARACTERCONSTANT )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:204:20: CHARACTERCONSTANT
			{
			dbg.location(204,20);
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
		dbg.location(205, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "characterconstant");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "characterconstant"



	// $ANTLR start "integerconstant"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:207:1: integerconstant : INTEGERCONSTANT ;
	public final void integerconstant() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "integerconstant");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(207, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:207:16: ( INTEGERCONSTANT )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:207:18: INTEGERCONSTANT
			{
			dbg.location(207,18);
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
		dbg.location(208, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "integerconstant");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "integerconstant"



	// $ANTLR start "bool"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:210:1: bool : BOOL ;
	public final void bool() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "bool");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(210, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:210:5: ( BOOL )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:210:7: BOOL
			{
			dbg.location(210,7);
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
		dbg.location(211, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "bool");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "bool"

	// $ANTLR start synpred8_ulNoActions
	public final void synpred8_ulNoActions_fragment() throws RecognitionException {
		// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:110:2: ( exprColon )
		dbg.enterAlt(1);

		// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:110:2: exprColon
		{
		dbg.location(110,2);
		pushFollow(FOLLOW_exprColon_in_synpred8_ulNoActions332);
		exprColon();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred8_ulNoActions

	// $ANTLR start synpred9_ulNoActions
	public final void synpred9_ulNoActions_fragment() throws RecognitionException {
		// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:111:2: ( idAssign )
		dbg.enterAlt(1);

		// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:111:2: idAssign
		{
		dbg.location(111,2);
		pushFollow(FOLLOW_idAssign_in_synpred9_ulNoActions337);
		idAssign();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred9_ulNoActions

	// $ANTLR start synpred10_ulNoActions
	public final void synpred10_ulNoActions_fragment() throws RecognitionException {
		// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:112:2: ( arrayAssign )
		dbg.enterAlt(1);

		// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:112:2: arrayAssign
		{
		dbg.location(112,2);
		pushFollow(FOLLOW_arrayAssign_in_synpred10_ulNoActions342);
		arrayAssign();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred10_ulNoActions

	// $ANTLR start synpred11_ulNoActions
	public final void synpred11_ulNoActions_fragment() throws RecognitionException {
		// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:113:2: ( ifElseBlock )
		dbg.enterAlt(1);

		// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:113:2: ifElseBlock
		{
		dbg.location(113,2);
		pushFollow(FOLLOW_ifElseBlock_in_synpred11_ulNoActions347);
		ifElseBlock();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred11_ulNoActions

	// $ANTLR start synpred12_ulNoActions
	public final void synpred12_ulNoActions_fragment() throws RecognitionException {
		// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:114:2: ( ifBlock )
		dbg.enterAlt(1);

		// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:114:2: ifBlock
		{
		dbg.location(114,2);
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
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred11_ulNoActions_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred10_ulNoActions() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred10_ulNoActions_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred12_ulNoActions() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred12_ulNoActions_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred8_ulNoActions() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred8_ulNoActions_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred9_ulNoActions() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred9_ulNoActions_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
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
