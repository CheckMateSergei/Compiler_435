// $ANTLR null /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g 2020-01-28 05:06:54

import packages.*;


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
		"invalidRule", "varDecl", "block", "synpred10_ulNoActions", "synpred28_ulNoActions", 
		"floatconstant", "function", "synpred22_ulNoActions", "synpred19_ulNoActions", 
		"literal", "functionCall", "synpred1_ulNoActions", "moreFormals", "arrayRef", 
		"synpred11_ulNoActions", "printStmt", "synpred15_ulNoActions", "atom", 
		"returnStmt", "semiColon", "synpred21_ulNoActions", "synpred26_ulNoActions", 
		"synpred25_ulNoActions", "formalParameters", "synpred24_ulNoActions", 
		"compoundType", "whileBlock", "synpred5_ulNoActions", "synpred8_ulNoActions", 
		"synpred30_ulNoActions", "synpred4_ulNoActions", "synpred14_ulNoActions", 
		"arrayDecl", "multExpr", "synpred18_ulNoActions", "characterconstant", 
		"synpred27_ulNoActions", "bool", "synpred12_ulNoActions", "arrayAssign", 
		"synpred6_ulNoActions", "synpred23_ulNoActions", "synpred31_ulNoActions", 
		"stringconstant", "exprList", "synpred2_ulNoActions", "statement", "compareExpr", 
		"ifBlock", "plmiExpr", "exprMore", "functionDecl", "printlnStmt", "idAssign", 
		"synpred7_ulNoActions", "synpred9_ulNoActions", "synpred13_ulNoActions", 
		"parenExpr", "ifElseBlock", "expr", "functionBody", "synpred17_ulNoActions", 
		"program", "integerconstant", "synpred3_ulNoActions", "lessExpr", "synpred16_ulNoActions", 
		"synpred29_ulNoActions", "identifier", "exprColon", "synpred20_ulNoActions"
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
		FunctionBod fb =null;

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
			fb=functionBody();
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


		CompType ct =null;
		Identifier id =null;
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
			ct=compoundType();
			state._fsp--;
			if (state.failed) return fd;dbg.location(71,25);
			pushFollow(FOLLOW_identifier_in_functionDecl138);
			id=identifier();
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
					if (state.failed) return fd;dbg.location(73,30);
					if ( state.backtracking==0 ) { fd.addFormal(fp); }
					}
					break;

			}
			} finally {dbg.exitSubRule(2);}
			dbg.location(73,55);
			match(input,20,FOLLOW_20_in_functionDecl160); if (state.failed) return fd;
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


		CompType ct =null;
		Identifier id =null;
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
			pushFollow(FOLLOW_compoundType_in_formalParameters182);
			ct=compoundType();
			state._fsp--;
			if (state.failed) return fp;dbg.location(78,25);
			pushFollow(FOLLOW_identifier_in_formalParameters188);
			id=identifier();
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
					pushFollow(FOLLOW_moreFormals_in_formalParameters203);
					mf=moreFormals();
					state._fsp--;
					if (state.failed) return fp;dbg.location(80,23);
					if ( state.backtracking==0 ) { fp = mf; }
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


		CompType ct =null;
		Identifier id =null;

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
			match(input,23,FOLLOW_23_in_moreFormals223); if (state.failed) return mf;dbg.location(84,11);
			pushFollow(FOLLOW_compoundType_in_moreFormals229);
			ct=compoundType();
			state._fsp--;
			if (state.failed) return mf;dbg.location(84,29);
			pushFollow(FOLLOW_identifier_in_moreFormals235);
			id=identifier();
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
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:90:1: functionBody returns [FunctionBod fb] : '{' (vd= varDecl )* (s= statement )* '}' ;
	public final FunctionBod functionBody() throws RecognitionException {
		FunctionBod fb = null;


		VarDecl vd =null;
		Statement s =null;


			// create the new function body object and then add the 
			// statements and variable declarations
			fb = new FunctionBod();

		try { dbg.enterRule(getGrammarFileName(), "functionBody");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(90, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:101:2: ( '{' (vd= varDecl )* (s= statement )* '}' )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:101:4: '{' (vd= varDecl )* (s= statement )* '}'
			{
			dbg.location(101,4);
			match(input,31,FOLLOW_31_in_functionBody270); if (state.failed) return fb;dbg.location(101,8);
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:101:8: (vd= varDecl )*
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

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:101:10: vd= varDecl
					{
					dbg.location(101,13);
					pushFollow(FOLLOW_varDecl_in_functionBody278);
					vd=varDecl();
					state._fsp--;
					if (state.failed) return fb;dbg.location(101,23);
					if ( state.backtracking==0 ) { fb.addVarDecl(vd); }
					}
					break;

				default :
					break loop4;
				}
			}
			} finally {dbg.exitSubRule(4);}
			dbg.location(102,8);
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:102:8: (s= statement )*
			try { dbg.enterSubRule(5);

			loop5:
			while (true) {
				int alt5=2;
				try { dbg.enterDecision(5, decisionCanBacktrack[5]);

				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= BOOL && LA5_0 <= CHARACTERCONSTANT)||(LA5_0 >= FLOATCONSTANT && LA5_0 <= STRINGCONSTANT)||LA5_0==WHILE||LA5_0==25) ) {
					alt5=1;
				}

				} finally {dbg.exitDecision(5);}

				switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:102:10: s= statement
					{
					dbg.location(102,12);
					pushFollow(FOLLOW_statement_in_functionBody299);
					s=statement();
					state._fsp--;
					if (state.failed) return fb;dbg.location(102,24);
					if ( state.backtracking==0 ) { fb.addStatement(s); }
					}
					break;

				default :
					break loop5;
				}
			}
			} finally {dbg.exitSubRule(5);}
			dbg.location(102,50);
			match(input,32,FOLLOW_32_in_functionBody305); if (state.failed) return fb;
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
		dbg.location(103, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "functionBody");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return fb;
	}
	// $ANTLR end "functionBody"



	// $ANTLR start "varDecl"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:105:1: varDecl returns [VarDecl vd] : ct= compoundType id= identifier ';' ;
	public final VarDecl varDecl() throws RecognitionException {
		VarDecl vd = null;


		CompType ct =null;
		Identifier id =null;

		try { dbg.enterRule(getGrammarFileName(), "varDecl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(105, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:107:2: (ct= compoundType id= identifier ';' )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:107:4: ct= compoundType id= identifier ';'
			{
			dbg.location(107,7);
			pushFollow(FOLLOW_compoundType_in_varDecl326);
			ct=compoundType();
			state._fsp--;
			if (state.failed) return vd;dbg.location(107,25);
			pushFollow(FOLLOW_identifier_in_varDecl332);
			id=identifier();
			state._fsp--;
			if (state.failed) return vd;dbg.location(107,38);
			match(input,25,FOLLOW_25_in_varDecl334); if (state.failed) return vd;dbg.location(107,42);
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
		dbg.location(108, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "varDecl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return vd;
	}
	// $ANTLR end "varDecl"



	// $ANTLR start "compoundType"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:111:1: compoundType returns [CompType ct] : (ad= arrayDecl |t= TYPE );
	public final CompType compoundType() throws RecognitionException {
		CompType ct = null;


		Token t=null;
		ArrayDecl ad =null;

		try { dbg.enterRule(getGrammarFileName(), "compoundType");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(111, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:113:2: (ad= arrayDecl |t= TYPE )
			int alt6=2;
			try { dbg.enterDecision(6, decisionCanBacktrack[6]);

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
						dbg.recognitionException(nvae);
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
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(6);}

			switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:113:5: ad= arrayDecl
					{
					dbg.location(113,8);
					pushFollow(FOLLOW_arrayDecl_in_compoundType359);
					ad=arrayDecl();
					state._fsp--;
					if (state.failed) return ct;dbg.location(113,20);
					if ( state.backtracking==0 ) { ct = ad; }
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:115:4: t= TYPE
					{
					dbg.location(115,6);
					t=(Token)match(input,TYPE,FOLLOW_TYPE_in_compoundType372); if (state.failed) return ct;dbg.location(115,13);
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
		dbg.location(116, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "compoundType");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return ct;
	}
	// $ANTLR end "compoundType"



	// $ANTLR start "arrayDecl"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:119:1: arrayDecl returns [ArrayDecl ad] : t= TYPE '[' il= integerconstant ']' ;
	public final ArrayDecl arrayDecl() throws RecognitionException {
		ArrayDecl ad = null;


		Token t=null;
		IntegerLiteral il =null;

		try { dbg.enterRule(getGrammarFileName(), "arrayDecl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(119, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:120:2: (t= TYPE '[' il= integerconstant ']' )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:120:4: t= TYPE '[' il= integerconstant ']'
			{
			dbg.location(120,6);
			t=(Token)match(input,TYPE,FOLLOW_TYPE_in_arrayDecl394); if (state.failed) return ad;dbg.location(120,13);
			match(input,29,FOLLOW_29_in_arrayDecl396); if (state.failed) return ad;dbg.location(120,19);
			pushFollow(FOLLOW_integerconstant_in_arrayDecl401);
			il=integerconstant();
			state._fsp--;
			if (state.failed) return ad;dbg.location(120,36);
			match(input,30,FOLLOW_30_in_arrayDecl402); if (state.failed) return ad;dbg.location(122,2);
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
		dbg.location(123, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "arrayDecl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return ad;
	}
	// $ANTLR end "arrayDecl"



	// $ANTLR start "identifier"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:126:1: identifier returns [Identifier i] : id= ID ;
	public final Identifier identifier() throws RecognitionException {
		Identifier i = null;


		Token id=null;

		try { dbg.enterRule(getGrammarFileName(), "identifier");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(126, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:127:2: (id= ID )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:127:4: id= ID
			{
			dbg.location(127,7);
			id=(Token)match(input,ID,FOLLOW_ID_in_identifier427); if (state.failed) return i;dbg.location(127,12);
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
		dbg.location(128, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "identifier");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return i;
	}
	// $ANTLR end "identifier"



	// $ANTLR start "statement"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:132:1: statement returns [Statement s] : (st= semiColon |ec= exprColon |aas= arrayAssign |idas= idAssign |ie= ifElseBlock |is= ifBlock |wh= whileBlock |pl= printlnStmt |p= printStmt |ret= returnStmt );
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
		PrintStmt p =null;
		ReturnStmt ret =null;

		try { dbg.enterRule(getGrammarFileName(), "statement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(132, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:133:2: (st= semiColon |ec= exprColon |aas= arrayAssign |idas= idAssign |ie= ifElseBlock |is= ifBlock |wh= whileBlock |pl= printlnStmt |p= printStmt |ret= returnStmt )
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
				{
				alt7=2;
				}
				break;
			case ID:
				{
				int LA7_7 = input.LA(2);
				if ( (synpred9_ulNoActions()) ) {
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
				int LA7_8 = input.LA(2);
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
							new NoViableAltException("", 7, 8, input);
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
				if (state.backtracking>0) {state.failed=true; return s;}
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(7);}

			switch (alt7) {
				case 1 :
					dbg.enterAlt(1);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:133:4: st= semiColon
					{
					dbg.location(133,7);
					pushFollow(FOLLOW_semiColon_in_statement450);
					st=semiColon();
					state._fsp--;
					if (state.failed) return s;dbg.location(133,19);
					if ( state.backtracking==0 ) { s = st;  }
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:134:4: ec= exprColon
					{
					dbg.location(134,7);
					pushFollow(FOLLOW_exprColon_in_statement461);
					ec=exprColon();
					state._fsp--;
					if (state.failed) return s;dbg.location(134,19);
					if ( state.backtracking==0 ) { s = ec;  }
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:135:4: aas= arrayAssign
					{
					dbg.location(135,8);
					pushFollow(FOLLOW_arrayAssign_in_statement472);
					aas=arrayAssign();
					state._fsp--;
					if (state.failed) return s;dbg.location(135,22);
					if ( state.backtracking==0 ) { s = aas; }
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:136:4: idas= idAssign
					{
					dbg.location(136,9);
					pushFollow(FOLLOW_idAssign_in_statement483);
					idas=idAssign();
					state._fsp--;
					if (state.failed) return s;dbg.location(136,20);
					if ( state.backtracking==0 ) { s = idas; }
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:137:4: ie= ifElseBlock
					{
					dbg.location(137,7);
					pushFollow(FOLLOW_ifElseBlock_in_statement494);
					ie=ifElseBlock();
					state._fsp--;
					if (state.failed) return s;dbg.location(137,21);
					if ( state.backtracking==0 ) { s = ie; }
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:138:4: is= ifBlock
					{
					dbg.location(138,7);
					pushFollow(FOLLOW_ifBlock_in_statement505);
					is=ifBlock();
					state._fsp--;
					if (state.failed) return s;dbg.location(138,17);
					if ( state.backtracking==0 ) { s = is; }
					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:139:4: wh= whileBlock
					{
					dbg.location(139,7);
					pushFollow(FOLLOW_whileBlock_in_statement516);
					wh=whileBlock();
					state._fsp--;
					if (state.failed) return s;dbg.location(139,20);
					if ( state.backtracking==0 ) { s = wh; }
					}
					break;
				case 8 :
					dbg.enterAlt(8);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:140:4: pl= printlnStmt
					{
					dbg.location(140,7);
					pushFollow(FOLLOW_printlnStmt_in_statement527);
					pl=printlnStmt();
					state._fsp--;
					if (state.failed) return s;dbg.location(140,21);
					if ( state.backtracking==0 ) { s = pl; }
					}
					break;
				case 9 :
					dbg.enterAlt(9);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:141:4: p= printStmt
					{
					dbg.location(141,6);
					pushFollow(FOLLOW_printStmt_in_statement538);
					p=printStmt();
					state._fsp--;
					if (state.failed) return s;dbg.location(141,18);
					if ( state.backtracking==0 ) { s = p; }
					}
					break;
				case 10 :
					dbg.enterAlt(10);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:142:4: ret= returnStmt
					{
					dbg.location(142,8);
					pushFollow(FOLLOW_returnStmt_in_statement549);
					ret=returnStmt();
					state._fsp--;
					if (state.failed) return s;dbg.location(142,21);
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
		dbg.location(143, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "statement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return s;
	}
	// $ANTLR end "statement"



	// $ANTLR start "whileBlock"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:146:1: whileBlock returns [WhileStmt wh] : WHILE '(' e= expr ')' b= block ;
	public final WhileStmt whileBlock() throws RecognitionException {
		WhileStmt wh = null;


		Expression e =null;
		Block b =null;

		try { dbg.enterRule(getGrammarFileName(), "whileBlock");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(146, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:147:2: ( WHILE '(' e= expr ')' b= block )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:147:4: WHILE '(' e= expr ')' b= block
			{
			dbg.location(147,4);
			match(input,WHILE,FOLLOW_WHILE_in_whileBlock567); if (state.failed) return wh;dbg.location(147,9);
			match(input,19,FOLLOW_19_in_whileBlock568); if (state.failed) return wh;dbg.location(147,15);
			pushFollow(FOLLOW_expr_in_whileBlock574);
			e=expr();
			state._fsp--;
			if (state.failed) return wh;dbg.location(147,21);
			match(input,20,FOLLOW_20_in_whileBlock575); if (state.failed) return wh;dbg.location(147,27);
			pushFollow(FOLLOW_block_in_whileBlock581);
			b=block();
			state._fsp--;
			if (state.failed) return wh;dbg.location(147,35);
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
		dbg.location(148, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "whileBlock");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return wh;
	}
	// $ANTLR end "whileBlock"



	// $ANTLR start "printlnStmt"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:151:1: printlnStmt returns [PrintlnStmt pl] : PRINTLN e= expr ';' ;
	public final PrintlnStmt printlnStmt() throws RecognitionException {
		PrintlnStmt pl = null;


		Expression e =null;

		try { dbg.enterRule(getGrammarFileName(), "printlnStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(151, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:152:2: ( PRINTLN e= expr ';' )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:152:4: PRINTLN e= expr ';'
			{
			dbg.location(152,4);
			match(input,PRINTLN,FOLLOW_PRINTLN_in_printlnStmt599); if (state.failed) return pl;dbg.location(152,14);
			pushFollow(FOLLOW_expr_in_printlnStmt605);
			e=expr();
			state._fsp--;
			if (state.failed) return pl;dbg.location(152,21);
			match(input,25,FOLLOW_25_in_printlnStmt607); if (state.failed) return pl;dbg.location(152,25);
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
		dbg.location(153, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "printlnStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return pl;
	}
	// $ANTLR end "printlnStmt"



	// $ANTLR start "printStmt"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:156:1: printStmt returns [PrintStmt p] : PRINT e= expr ';' ;
	public final PrintStmt printStmt() throws RecognitionException {
		PrintStmt p = null;


		Expression e =null;

		try { dbg.enterRule(getGrammarFileName(), "printStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(156, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:157:2: ( PRINT e= expr ';' )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:157:4: PRINT e= expr ';'
			{
			dbg.location(157,4);
			match(input,PRINT,FOLLOW_PRINT_in_printStmt625); if (state.failed) return p;dbg.location(157,12);
			pushFollow(FOLLOW_expr_in_printStmt631);
			e=expr();
			state._fsp--;
			if (state.failed) return p;dbg.location(157,19);
			match(input,25,FOLLOW_25_in_printStmt633); if (state.failed) return p;dbg.location(157,23);
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
		dbg.location(158, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "printStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return p;
	}
	// $ANTLR end "printStmt"



	// $ANTLR start "returnStmt"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:161:1: returnStmt returns [ReturnStmt ret] : RETURN (e= expr )? ';' ;
	public final ReturnStmt returnStmt() throws RecognitionException {
		ReturnStmt ret = null;


		Expression e =null;


			// create the return statement with no expression field
			ret = new ReturnStmt();

		try { dbg.enterRule(getGrammarFileName(), "returnStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(161, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:169:2: ( RETURN (e= expr )? ';' )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:169:4: RETURN (e= expr )? ';'
			{
			dbg.location(169,4);
			match(input,RETURN,FOLLOW_RETURN_in_returnStmt662); if (state.failed) return ret;dbg.location(169,11);
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:169:11: (e= expr )?
			int alt8=2;
			try { dbg.enterSubRule(8);
			try { dbg.enterDecision(8, decisionCanBacktrack[8]);

			int LA8_0 = input.LA(1);
			if ( ((LA8_0 >= BOOL && LA8_0 <= CHARACTERCONSTANT)||LA8_0==FLOATCONSTANT||LA8_0==INTEGERCONSTANT||LA8_0==STRINGCONSTANT) ) {
				alt8=1;
			}
			} finally {dbg.exitDecision(8);}

			switch (alt8) {
				case 1 :
					dbg.enterAlt(1);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:169:12: e= expr
					{
					dbg.location(169,14);
					pushFollow(FOLLOW_expr_in_returnStmt669);
					e=expr();
					state._fsp--;
					if (state.failed) return ret;dbg.location(169,21);
					if ( state.backtracking==0 ) { ret.setExpr(e); }
					}
					break;

			}
			} finally {dbg.exitSubRule(8);}
			dbg.location(169,43);
			match(input,25,FOLLOW_25_in_returnStmt675); if (state.failed) return ret;
			}

			if ( state.backtracking==0 ) {}
		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
		dbg.location(170, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "returnStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return ret;
	}
	// $ANTLR end "returnStmt"



	// $ANTLR start "semiColon"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:173:1: semiColon returns [SemiStatement st] : ';' ;
	public final SemiStatement semiColon() throws RecognitionException {
		SemiStatement st = null;


		try { dbg.enterRule(getGrammarFileName(), "semiColon");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(173, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:174:2: ( ';' )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:174:4: ';'
			{
			dbg.location(174,4);
			match(input,25,FOLLOW_25_in_semiColon691); if (state.failed) return st;dbg.location(174,8);
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
		dbg.location(175, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "semiColon");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return st;
	}
	// $ANTLR end "semiColon"



	// $ANTLR start "exprColon"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:178:1: exprColon returns [ExColonStmt ec] : e= expr ';' ;
	public final ExColonStmt exprColon() throws RecognitionException {
		ExColonStmt ec = null;


		Expression e =null;

		try { dbg.enterRule(getGrammarFileName(), "exprColon");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(178, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:179:2: (e= expr ';' )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:179:4: e= expr ';'
			{
			dbg.location(179,6);
			pushFollow(FOLLOW_expr_in_exprColon713);
			e=expr();
			state._fsp--;
			if (state.failed) return ec;dbg.location(179,13);
			match(input,25,FOLLOW_25_in_exprColon715); if (state.failed) return ec;dbg.location(179,17);
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
		dbg.location(180, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "exprColon");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return ec;
	}
	// $ANTLR end "exprColon"



	// $ANTLR start "arrayAssign"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:183:1: arrayAssign returns [ArrayAssignStmt aas] : id= identifier '[' e1= expr ']' '=' e2= expr ';' ;
	public final ArrayAssignStmt arrayAssign() throws RecognitionException {
		ArrayAssignStmt aas = null;


		Identifier id =null;
		Expression e1 =null;
		Expression e2 =null;

		try { dbg.enterRule(getGrammarFileName(), "arrayAssign");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(183, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:185:2: (id= identifier '[' e1= expr ']' '=' e2= expr ';' )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:185:4: id= identifier '[' e1= expr ']' '=' e2= expr ';'
			{
			dbg.location(185,7);
			pushFollow(FOLLOW_identifier_in_arrayAssign739);
			id=identifier();
			state._fsp--;
			if (state.failed) return aas;dbg.location(185,20);
			match(input,29,FOLLOW_29_in_arrayAssign741); if (state.failed) return aas;dbg.location(185,27);
			pushFollow(FOLLOW_expr_in_arrayAssign747);
			e1=expr();
			state._fsp--;
			if (state.failed) return aas;dbg.location(185,33);
			match(input,30,FOLLOW_30_in_arrayAssign748); if (state.failed) return aas;dbg.location(185,37);
			match(input,27,FOLLOW_27_in_arrayAssign750); if (state.failed) return aas;dbg.location(185,44);
			pushFollow(FOLLOW_expr_in_arrayAssign756);
			e2=expr();
			state._fsp--;
			if (state.failed) return aas;dbg.location(185,51);
			match(input,25,FOLLOW_25_in_arrayAssign758); if (state.failed) return aas;dbg.location(186,4);
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
		dbg.location(187, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "arrayAssign");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return aas;
	}
	// $ANTLR end "arrayAssign"



	// $ANTLR start "idAssign"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:190:1: idAssign returns [IdAssignStmt idas] : id= identifier '=' e= expr ';' ;
	public final IdAssignStmt idAssign() throws RecognitionException {
		IdAssignStmt idas = null;


		Identifier id =null;
		Expression e =null;

		try { dbg.enterRule(getGrammarFileName(), "idAssign");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(190, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:191:2: (id= identifier '=' e= expr ';' )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:191:4: id= identifier '=' e= expr ';'
			{
			dbg.location(191,7);
			pushFollow(FOLLOW_identifier_in_idAssign783);
			id=identifier();
			state._fsp--;
			if (state.failed) return idas;dbg.location(191,20);
			match(input,27,FOLLOW_27_in_idAssign785); if (state.failed) return idas;dbg.location(191,26);
			pushFollow(FOLLOW_expr_in_idAssign791);
			e=expr();
			state._fsp--;
			if (state.failed) return idas;dbg.location(191,33);
			match(input,25,FOLLOW_25_in_idAssign793); if (state.failed) return idas;dbg.location(191,37);
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
		dbg.location(192, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "idAssign");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return idas;
	}
	// $ANTLR end "idAssign"



	// $ANTLR start "ifElseBlock"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:195:1: ifElseBlock returns [IfElseStmt ie] : IF '(' e= expr ')' b1= block ELSE b2= block ;
	public final IfElseStmt ifElseBlock() throws RecognitionException {
		IfElseStmt ie = null;


		Expression e =null;
		Block b1 =null;
		Block b2 =null;

		try { dbg.enterRule(getGrammarFileName(), "ifElseBlock");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(195, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:196:2: ( IF '(' e= expr ')' b1= block ELSE b2= block )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:196:4: IF '(' e= expr ')' b1= block ELSE b2= block
			{
			dbg.location(196,4);
			match(input,IF,FOLLOW_IF_in_ifElseBlock811); if (state.failed) return ie;dbg.location(196,6);
			match(input,19,FOLLOW_19_in_ifElseBlock812); if (state.failed) return ie;dbg.location(196,11);
			pushFollow(FOLLOW_expr_in_ifElseBlock817);
			e=expr();
			state._fsp--;
			if (state.failed) return ie;dbg.location(196,17);
			match(input,20,FOLLOW_20_in_ifElseBlock818); if (state.failed) return ie;dbg.location(196,24);
			pushFollow(FOLLOW_block_in_ifElseBlock824);
			b1=block();
			state._fsp--;
			if (state.failed) return ie;dbg.location(196,32);
			match(input,ELSE,FOLLOW_ELSE_in_ifElseBlock826); if (state.failed) return ie;dbg.location(196,40);
			pushFollow(FOLLOW_block_in_ifElseBlock832);
			b2=block();
			state._fsp--;
			if (state.failed) return ie;dbg.location(197,4);
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
		dbg.location(198, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ifElseBlock");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return ie;
	}
	// $ANTLR end "ifElseBlock"



	// $ANTLR start "ifBlock"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:201:1: ifBlock returns [IfStmt is] : IF '(' e= expr ')' b= block ;
	public final IfStmt ifBlock() throws RecognitionException {
		IfStmt is = null;


		Expression e =null;
		Block b =null;

		try { dbg.enterRule(getGrammarFileName(), "ifBlock");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(201, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:202:2: ( IF '(' e= expr ')' b= block )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:202:4: IF '(' e= expr ')' b= block
			{
			dbg.location(202,4);
			match(input,IF,FOLLOW_IF_in_ifBlock853); if (state.failed) return is;dbg.location(202,6);
			match(input,19,FOLLOW_19_in_ifBlock854); if (state.failed) return is;dbg.location(202,11);
			pushFollow(FOLLOW_expr_in_ifBlock859);
			e=expr();
			state._fsp--;
			if (state.failed) return is;dbg.location(202,17);
			match(input,20,FOLLOW_20_in_ifBlock860); if (state.failed) return is;dbg.location(202,23);
			pushFollow(FOLLOW_block_in_ifBlock866);
			b=block();
			state._fsp--;
			if (state.failed) return is;dbg.location(202,31);
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
		dbg.location(203, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ifBlock");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return is;
	}
	// $ANTLR end "ifBlock"



	// $ANTLR start "block"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:206:1: block returns [Block blok] : '{' (s= statement )* '}' ;
	public final Block block() throws RecognitionException {
		Block blok = null;


		Statement s =null;


			// create a new block object with empty stmt list
			blok = new Block();

		try { dbg.enterRule(getGrammarFileName(), "block");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(206, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:214:2: ( '{' (s= statement )* '}' )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:214:4: '{' (s= statement )* '}'
			{
			dbg.location(214,4);
			match(input,31,FOLLOW_31_in_block895); if (state.failed) return blok;dbg.location(214,8);
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:214:8: (s= statement )*
			try { dbg.enterSubRule(9);

			loop9:
			while (true) {
				int alt9=2;
				try { dbg.enterDecision(9, decisionCanBacktrack[9]);

				int LA9_0 = input.LA(1);
				if ( ((LA9_0 >= BOOL && LA9_0 <= CHARACTERCONSTANT)||(LA9_0 >= FLOATCONSTANT && LA9_0 <= STRINGCONSTANT)||LA9_0==WHILE||LA9_0==25) ) {
					alt9=1;
				}

				} finally {dbg.exitDecision(9);}

				switch (alt9) {
				case 1 :
					dbg.enterAlt(1);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:214:10: s= statement
					{
					dbg.location(214,12);
					pushFollow(FOLLOW_statement_in_block903);
					s=statement();
					state._fsp--;
					if (state.failed) return blok;dbg.location(214,24);
					if ( state.backtracking==0 ) { blok.addToBlock(s); }
					}
					break;

				default :
					break loop9;
				}
			}
			} finally {dbg.exitSubRule(9);}
			dbg.location(214,51);
			match(input,32,FOLLOW_32_in_block910); if (state.failed) return blok;
			}

			if ( state.backtracking==0 ) {}
		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
		dbg.location(215, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "block");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return blok;
	}
	// $ANTLR end "block"



	// $ANTLR start "expr"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:217:1: expr returns [Expression e] : l= literal ;
	public final Expression expr() throws RecognitionException {
		Expression e = null;


		Literal l =null;

		try { dbg.enterRule(getGrammarFileName(), "expr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(217, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:218:2: (l= literal )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:218:4: l= literal
			{
			dbg.location(218,6);
			pushFollow(FOLLOW_literal_in_expr929);
			l=literal();
			state._fsp--;
			if (state.failed) return e;dbg.location(218,16);
			if ( state.backtracking==0 ) { e = l; }
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
		dbg.location(219, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return e;
	}
	// $ANTLR end "expr"



	// $ANTLR start "compareExpr"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:221:1: compareExpr : lessExpr ( '==' lessExpr )* ;
	public final void compareExpr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "compareExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(221, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:221:12: ( lessExpr ( '==' lessExpr )* )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:221:14: lessExpr ( '==' lessExpr )*
			{
			dbg.location(221,14);
			pushFollow(FOLLOW_lessExpr_in_compareExpr941);
			lessExpr();
			state._fsp--;
			if (state.failed) return;dbg.location(221,23);
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:221:23: ( '==' lessExpr )*
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

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:221:24: '==' lessExpr
					{
					dbg.location(221,24);
					match(input,28,FOLLOW_28_in_compareExpr944); if (state.failed) return;dbg.location(221,29);
					pushFollow(FOLLOW_lessExpr_in_compareExpr946);
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
		dbg.location(222, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "compareExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "compareExpr"



	// $ANTLR start "lessExpr"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:224:1: lessExpr : plmiExpr ( '<' plmiExpr )* ;
	public final void lessExpr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "lessExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(224, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:224:9: ( plmiExpr ( '<' plmiExpr )* )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:224:11: plmiExpr ( '<' plmiExpr )*
			{
			dbg.location(224,11);
			pushFollow(FOLLOW_plmiExpr_in_lessExpr957);
			plmiExpr();
			state._fsp--;
			if (state.failed) return;dbg.location(224,20);
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:224:20: ( '<' plmiExpr )*
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

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:224:21: '<' plmiExpr
					{
					dbg.location(224,21);
					match(input,26,FOLLOW_26_in_lessExpr960); if (state.failed) return;dbg.location(224,25);
					pushFollow(FOLLOW_plmiExpr_in_lessExpr962);
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
		dbg.location(225, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "lessExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "lessExpr"



	// $ANTLR start "plmiExpr"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:227:1: plmiExpr : multExpr ( ( '+' | '-' ) multExpr )* ;
	public final void plmiExpr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "plmiExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(227, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:227:9: ( multExpr ( ( '+' | '-' ) multExpr )* )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:227:11: multExpr ( ( '+' | '-' ) multExpr )*
			{
			dbg.location(227,11);
			pushFollow(FOLLOW_multExpr_in_plmiExpr973);
			multExpr();
			state._fsp--;
			if (state.failed) return;dbg.location(227,20);
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:227:20: ( ( '+' | '-' ) multExpr )*
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

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:227:21: ( '+' | '-' ) multExpr
					{
					dbg.location(227,21);
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
					}dbg.location(227,31);
					pushFollow(FOLLOW_multExpr_in_plmiExpr982);
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
		dbg.location(228, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "plmiExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "plmiExpr"



	// $ANTLR start "multExpr"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:230:1: multExpr : atom ( '*' atom )* ;
	public final void multExpr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "multExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(230, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:230:9: ( atom ( '*' atom )* )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:230:11: atom ( '*' atom )*
			{
			dbg.location(230,11);
			pushFollow(FOLLOW_atom_in_multExpr993);
			atom();
			state._fsp--;
			if (state.failed) return;dbg.location(230,16);
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:230:16: ( '*' atom )*
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

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:230:17: '*' atom
					{
					dbg.location(230,17);
					match(input,21,FOLLOW_21_in_multExpr996); if (state.failed) return;dbg.location(230,21);
					pushFollow(FOLLOW_atom_in_multExpr998);
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
		dbg.location(231, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "multExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "multExpr"



	// $ANTLR start "atom"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:233:1: atom : ( literal | identifier | functionCall | arrayRef | parenExpr );
	public final void atom() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "atom");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(233, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:233:5: ( literal | identifier | functionCall | arrayRef | parenExpr )
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
				case 21:
				case 22:
				case 24:
				case 26:
				case 28:
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

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:233:7: literal
					{
					dbg.location(233,7);
					pushFollow(FOLLOW_literal_in_atom1009);
					literal();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:234:4: identifier
					{
					dbg.location(234,4);
					pushFollow(FOLLOW_identifier_in_atom1015);
					identifier();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:235:4: functionCall
					{
					dbg.location(235,4);
					pushFollow(FOLLOW_functionCall_in_atom1021);
					functionCall();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:236:4: arrayRef
					{
					dbg.location(236,4);
					pushFollow(FOLLOW_arrayRef_in_atom1027);
					arrayRef();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:237:4: parenExpr
					{
					dbg.location(237,4);
					pushFollow(FOLLOW_parenExpr_in_atom1033);
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
		dbg.location(238, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "atom");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "atom"



	// $ANTLR start "functionCall"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:240:1: functionCall : identifier '(' exprList ')' ;
	public final void functionCall() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "functionCall");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(240, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:240:13: ( identifier '(' exprList ')' )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:240:15: identifier '(' exprList ')'
			{
			dbg.location(240,15);
			pushFollow(FOLLOW_identifier_in_functionCall1042);
			identifier();
			state._fsp--;
			if (state.failed) return;dbg.location(240,25);
			match(input,19,FOLLOW_19_in_functionCall1043); if (state.failed) return;dbg.location(240,29);
			pushFollow(FOLLOW_exprList_in_functionCall1045);
			exprList();
			state._fsp--;
			if (state.failed) return;dbg.location(240,38);
			match(input,20,FOLLOW_20_in_functionCall1047); if (state.failed) return;
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
		dbg.location(241, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "functionCall");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "functionCall"



	// $ANTLR start "arrayRef"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:243:1: arrayRef : identifier '[' expr ']' ;
	public final void arrayRef() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "arrayRef");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(243, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:243:9: ( identifier '[' expr ']' )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:243:11: identifier '[' expr ']'
			{
			dbg.location(243,11);
			pushFollow(FOLLOW_identifier_in_arrayRef1056);
			identifier();
			state._fsp--;
			if (state.failed) return;dbg.location(243,21);
			match(input,29,FOLLOW_29_in_arrayRef1057); if (state.failed) return;dbg.location(243,24);
			pushFollow(FOLLOW_expr_in_arrayRef1058);
			expr();
			state._fsp--;
			if (state.failed) return;dbg.location(243,28);
			match(input,30,FOLLOW_30_in_arrayRef1059); if (state.failed) return;
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
		dbg.location(244, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "arrayRef");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "arrayRef"



	// $ANTLR start "parenExpr"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:246:1: parenExpr : '(' expr ')' ;
	public final void parenExpr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "parenExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(246, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:246:10: ( '(' expr ')' )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:246:12: '(' expr ')'
			{
			dbg.location(246,12);
			match(input,19,FOLLOW_19_in_parenExpr1069); if (state.failed) return;dbg.location(246,16);
			pushFollow(FOLLOW_expr_in_parenExpr1071);
			expr();
			state._fsp--;
			if (state.failed) return;dbg.location(246,21);
			match(input,20,FOLLOW_20_in_parenExpr1073); if (state.failed) return;
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
		dbg.location(247, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "parenExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "parenExpr"



	// $ANTLR start "exprList"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:249:1: exprList : expr ( exprMore )* ;
	public final void exprList() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "exprList");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(249, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:249:9: ( expr ( exprMore )* )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:249:11: expr ( exprMore )*
			{
			dbg.location(249,11);
			pushFollow(FOLLOW_expr_in_exprList1082);
			expr();
			state._fsp--;
			if (state.failed) return;dbg.location(249,16);
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:249:16: ( exprMore )*
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

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:249:16: exprMore
					{
					dbg.location(249,16);
					pushFollow(FOLLOW_exprMore_in_exprList1084);
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
		dbg.location(250, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "exprList");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "exprList"



	// $ANTLR start "exprMore"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:252:1: exprMore : ',' expr ;
	public final void exprMore() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "exprMore");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(252, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:252:9: ( ',' expr )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:252:11: ',' expr
			{
			dbg.location(252,11);
			match(input,23,FOLLOW_23_in_exprMore1094); if (state.failed) return;dbg.location(252,15);
			pushFollow(FOLLOW_expr_in_exprMore1096);
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
		dbg.location(253, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "exprMore");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "exprMore"



	// $ANTLR start "literal"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:256:1: literal returns [Literal l] : (il= integerconstant |fl= floatconstant |bl= bool |sl= stringconstant |cl= characterconstant );
	public final Literal literal() throws RecognitionException {
		Literal l = null;


		IntegerLiteral il =null;
		FloatLiteral fl =null;
		BooleanLiteral bl =null;
		StringLiteral sl =null;
		CharLiteral cl =null;

		try { dbg.enterRule(getGrammarFileName(), "literal");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(256, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:257:2: (il= integerconstant |fl= floatconstant |bl= bool |sl= stringconstant |cl= characterconstant )
			int alt16=5;
			try { dbg.enterDecision(16, decisionCanBacktrack[16]);

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
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(16);}

			switch (alt16) {
				case 1 :
					dbg.enterAlt(1);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:257:4: il= integerconstant
					{
					dbg.location(257,7);
					pushFollow(FOLLOW_integerconstant_in_literal1117);
					il=integerconstant();
					state._fsp--;
					if (state.failed) return l;dbg.location(257,25);
					if ( state.backtracking==0 ) { l = il; }
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:258:4: fl= floatconstant
					{
					dbg.location(258,7);
					pushFollow(FOLLOW_floatconstant_in_literal1128);
					fl=floatconstant();
					state._fsp--;
					if (state.failed) return l;dbg.location(258,23);
					if ( state.backtracking==0 ) { l = fl; }
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:259:4: bl= bool
					{
					dbg.location(259,7);
					pushFollow(FOLLOW_bool_in_literal1139);
					bl=bool();
					state._fsp--;
					if (state.failed) return l;dbg.location(259,14);
					if ( state.backtracking==0 ) { l = bl; }
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:260:4: sl= stringconstant
					{
					dbg.location(260,7);
					pushFollow(FOLLOW_stringconstant_in_literal1150);
					sl=stringconstant();
					state._fsp--;
					if (state.failed) return l;dbg.location(260,24);
					if ( state.backtracking==0 ) { l = sl;}
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:261:4: cl= characterconstant
					{
					dbg.location(261,7);
					pushFollow(FOLLOW_characterconstant_in_literal1161);
					cl=characterconstant();
					state._fsp--;
					if (state.failed) return l;dbg.location(261,27);
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
		dbg.location(262, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "literal");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return l;
	}
	// $ANTLR end "literal"



	// $ANTLR start "stringconstant"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:265:1: stringconstant returns [StringLiteral sl] : s= STRINGCONSTANT ;
	public final StringLiteral stringconstant() throws RecognitionException {
		StringLiteral sl = null;


		Token s=null;

		try { dbg.enterRule(getGrammarFileName(), "stringconstant");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(265, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:267:2: (s= STRINGCONSTANT )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:267:4: s= STRINGCONSTANT
			{
			dbg.location(267,6);
			s=(Token)match(input,STRINGCONSTANT,FOLLOW_STRINGCONSTANT_in_stringconstant1185); if (state.failed) return sl;dbg.location(267,23);
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
		dbg.location(268, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "stringconstant");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return sl;
	}
	// $ANTLR end "stringconstant"



	// $ANTLR start "floatconstant"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:271:1: floatconstant returns [FloatLiteral fl] : f= FLOATCONSTANT ;
	public final FloatLiteral floatconstant() throws RecognitionException {
		FloatLiteral fl = null;


		Token f=null;

		try { dbg.enterRule(getGrammarFileName(), "floatconstant");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(271, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:273:2: (f= FLOATCONSTANT )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:273:4: f= FLOATCONSTANT
			{
			dbg.location(273,6);
			f=(Token)match(input,FLOATCONSTANT,FOLLOW_FLOATCONSTANT_in_floatconstant1209); if (state.failed) return fl;dbg.location(273,22);
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
		dbg.location(274, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "floatconstant");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return fl;
	}
	// $ANTLR end "floatconstant"



	// $ANTLR start "characterconstant"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:277:1: characterconstant returns [CharLiteral cl] : c= CHARACTERCONSTANT ;
	public final CharLiteral characterconstant() throws RecognitionException {
		CharLiteral cl = null;


		Token c=null;

		try { dbg.enterRule(getGrammarFileName(), "characterconstant");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(277, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:279:2: (c= CHARACTERCONSTANT )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:279:4: c= CHARACTERCONSTANT
			{
			dbg.location(279,6);
			c=(Token)match(input,CHARACTERCONSTANT,FOLLOW_CHARACTERCONSTANT_in_characterconstant1233); if (state.failed) return cl;dbg.location(279,26);
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
		dbg.location(280, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "characterconstant");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return cl;
	}
	// $ANTLR end "characterconstant"



	// $ANTLR start "integerconstant"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:283:1: integerconstant returns [IntegerLiteral il] : i= INTEGERCONSTANT ;
	public final IntegerLiteral integerconstant() throws RecognitionException {
		IntegerLiteral il = null;


		Token i=null;

		try { dbg.enterRule(getGrammarFileName(), "integerconstant");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(283, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:285:2: (i= INTEGERCONSTANT )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:285:4: i= INTEGERCONSTANT
			{
			dbg.location(285,6);
			i=(Token)match(input,INTEGERCONSTANT,FOLLOW_INTEGERCONSTANT_in_integerconstant1257); if (state.failed) return il;dbg.location(285,24);
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
		dbg.location(286, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "integerconstant");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return il;
	}
	// $ANTLR end "integerconstant"



	// $ANTLR start "bool"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:289:1: bool returns [BooleanLiteral bl] : b= BOOL ;
	public final BooleanLiteral bool() throws RecognitionException {
		BooleanLiteral bl = null;


		Token b=null;

		try { dbg.enterRule(getGrammarFileName(), "bool");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(289, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:291:2: (b= BOOL )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:291:4: b= BOOL
			{
			dbg.location(291,6);
			b=(Token)match(input,BOOL,FOLLOW_BOOL_in_bool1281); if (state.failed) return bl;dbg.location(291,13);
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
		dbg.location(292, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "bool");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return bl;
	}
	// $ANTLR end "bool"

	// $ANTLR start synpred9_ulNoActions
	public final void synpred9_ulNoActions_fragment() throws RecognitionException {
		ArrayAssignStmt aas =null;

		// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:135:4: (aas= arrayAssign )
		dbg.enterAlt(1);

		// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:135:4: aas= arrayAssign
		{
		dbg.location(135,8);
		pushFollow(FOLLOW_arrayAssign_in_synpred9_ulNoActions472);
		aas=arrayAssign();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred9_ulNoActions

	// $ANTLR start synpred10_ulNoActions
	public final void synpred10_ulNoActions_fragment() throws RecognitionException {
		IdAssignStmt idas =null;

		// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:136:4: (idas= idAssign )
		dbg.enterAlt(1);

		// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:136:4: idas= idAssign
		{
		dbg.location(136,9);
		pushFollow(FOLLOW_idAssign_in_synpred10_ulNoActions483);
		idas=idAssign();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred10_ulNoActions

	// $ANTLR start synpred11_ulNoActions
	public final void synpred11_ulNoActions_fragment() throws RecognitionException {
		IfElseStmt ie =null;

		// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:137:4: (ie= ifElseBlock )
		dbg.enterAlt(1);

		// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:137:4: ie= ifElseBlock
		{
		dbg.location(137,7);
		pushFollow(FOLLOW_ifElseBlock_in_synpred11_ulNoActions494);
		ie=ifElseBlock();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred11_ulNoActions

	// $ANTLR start synpred12_ulNoActions
	public final void synpred12_ulNoActions_fragment() throws RecognitionException {
		IfStmt is =null;

		// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:138:4: (is= ifBlock )
		dbg.enterAlt(1);

		// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:138:4: is= ifBlock
		{
		dbg.location(138,7);
		pushFollow(FOLLOW_ifBlock_in_synpred12_ulNoActions505);
		is=ifBlock();
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
	public static final BitSet FOLLOW_20_in_functionDecl160 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compoundType_in_formalParameters182 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_identifier_in_formalParameters188 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_moreFormals_in_formalParameters203 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_23_in_moreFormals223 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_compoundType_in_moreFormals229 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_identifier_in_moreFormals235 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_functionBody270 = new BitSet(new long[]{0x000000010203FF30L});
	public static final BitSet FOLLOW_varDecl_in_functionBody278 = new BitSet(new long[]{0x000000010203FF30L});
	public static final BitSet FOLLOW_statement_in_functionBody299 = new BitSet(new long[]{0x000000010202FF30L});
	public static final BitSet FOLLOW_32_in_functionBody305 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compoundType_in_varDecl326 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_identifier_in_varDecl332 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_varDecl334 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayDecl_in_compoundType359 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_in_compoundType372 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_in_arrayDecl394 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_arrayDecl396 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_integerconstant_in_arrayDecl401 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_arrayDecl402 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_identifier427 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_semiColon_in_statement450 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprColon_in_statement461 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayAssign_in_statement472 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_idAssign_in_statement483 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifElseBlock_in_statement494 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifBlock_in_statement505 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileBlock_in_statement516 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_printlnStmt_in_statement527 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_printStmt_in_statement538 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_returnStmt_in_statement549 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_whileBlock567 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_whileBlock568 = new BitSet(new long[]{0x0000000000008930L});
	public static final BitSet FOLLOW_expr_in_whileBlock574 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_whileBlock575 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_block_in_whileBlock581 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINTLN_in_printlnStmt599 = new BitSet(new long[]{0x0000000000008930L});
	public static final BitSet FOLLOW_expr_in_printlnStmt605 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_printlnStmt607 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_printStmt625 = new BitSet(new long[]{0x0000000000008930L});
	public static final BitSet FOLLOW_expr_in_printStmt631 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_printStmt633 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURN_in_returnStmt662 = new BitSet(new long[]{0x0000000002008930L});
	public static final BitSet FOLLOW_expr_in_returnStmt669 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_returnStmt675 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_semiColon691 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_exprColon713 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_exprColon715 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_arrayAssign739 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_arrayAssign741 = new BitSet(new long[]{0x0000000000008930L});
	public static final BitSet FOLLOW_expr_in_arrayAssign747 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_arrayAssign748 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_arrayAssign750 = new BitSet(new long[]{0x0000000000008930L});
	public static final BitSet FOLLOW_expr_in_arrayAssign756 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_arrayAssign758 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_idAssign783 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_idAssign785 = new BitSet(new long[]{0x0000000000008930L});
	public static final BitSet FOLLOW_expr_in_idAssign791 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_idAssign793 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifElseBlock811 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_ifElseBlock812 = new BitSet(new long[]{0x0000000000008930L});
	public static final BitSet FOLLOW_expr_in_ifElseBlock817 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_ifElseBlock818 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_block_in_ifElseBlock824 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ELSE_in_ifElseBlock826 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_block_in_ifElseBlock832 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifBlock853 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_ifBlock854 = new BitSet(new long[]{0x0000000000008930L});
	public static final BitSet FOLLOW_expr_in_ifBlock859 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_ifBlock860 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_block_in_ifBlock866 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_block895 = new BitSet(new long[]{0x000000010202FF30L});
	public static final BitSet FOLLOW_statement_in_block903 = new BitSet(new long[]{0x000000010202FF30L});
	public static final BitSet FOLLOW_32_in_block910 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_literal_in_expr929 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lessExpr_in_compareExpr941 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_28_in_compareExpr944 = new BitSet(new long[]{0x0000000000088B30L});
	public static final BitSet FOLLOW_lessExpr_in_compareExpr946 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_plmiExpr_in_lessExpr957 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_26_in_lessExpr960 = new BitSet(new long[]{0x0000000000088B30L});
	public static final BitSet FOLLOW_plmiExpr_in_lessExpr962 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_multExpr_in_plmiExpr973 = new BitSet(new long[]{0x0000000001400002L});
	public static final BitSet FOLLOW_set_in_plmiExpr976 = new BitSet(new long[]{0x0000000000088B30L});
	public static final BitSet FOLLOW_multExpr_in_plmiExpr982 = new BitSet(new long[]{0x0000000001400002L});
	public static final BitSet FOLLOW_atom_in_multExpr993 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_21_in_multExpr996 = new BitSet(new long[]{0x0000000000088B30L});
	public static final BitSet FOLLOW_atom_in_multExpr998 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_literal_in_atom1009 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_atom1015 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_atom1021 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayRef_in_atom1027 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parenExpr_in_atom1033 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_functionCall1042 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_functionCall1043 = new BitSet(new long[]{0x0000000000008930L});
	public static final BitSet FOLLOW_exprList_in_functionCall1045 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_functionCall1047 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_arrayRef1056 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_arrayRef1057 = new BitSet(new long[]{0x0000000000008930L});
	public static final BitSet FOLLOW_expr_in_arrayRef1058 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_arrayRef1059 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_parenExpr1069 = new BitSet(new long[]{0x0000000000008930L});
	public static final BitSet FOLLOW_expr_in_parenExpr1071 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_parenExpr1073 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_exprList1082 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_exprMore_in_exprList1084 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_23_in_exprMore1094 = new BitSet(new long[]{0x0000000000008930L});
	public static final BitSet FOLLOW_expr_in_exprMore1096 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_integerconstant_in_literal1117 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_floatconstant_in_literal1128 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bool_in_literal1139 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stringconstant_in_literal1150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_characterconstant_in_literal1161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRINGCONSTANT_in_stringconstant1185 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOATCONSTANT_in_floatconstant1209 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTERCONSTANT_in_characterconstant1233 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGERCONSTANT_in_integerconstant1257 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOL_in_bool1281 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayAssign_in_synpred9_ulNoActions472 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_idAssign_in_synpred10_ulNoActions483 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifElseBlock_in_synpred11_ulNoActions494 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifBlock_in_synpred12_ulNoActions505 = new BitSet(new long[]{0x0000000000000002L});
}
