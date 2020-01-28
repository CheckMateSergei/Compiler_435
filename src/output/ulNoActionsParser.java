// $ANTLR null /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g 2020-01-28 02:23:05

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
		"invalidRule", "semiColon", "synpred12_ulNoActions", "synpred13_ulNoActions", 
		"atom", "whileBlock", "synpred10_ulNoActions", "synpred9_ulNoActions", 
		"arrayAssign", "functionBody", "exprColon", "synpred16_ulNoActions", "varDecl", 
		"bool", "synpred14_ulNoActions", "synpred31_ulNoActions", "stringconstant", 
		"literal", "integerconstant", "multExpr", "arrayRef", "synpred18_ulNoActions", 
		"function", "lessExpr", "moreFormals", "synpred3_ulNoActions", "printStmt", 
		"synpred29_ulNoActions", "parenExpr", "synpred24_ulNoActions", "synpred26_ulNoActions", 
		"plmiExpr", "synpred20_ulNoActions", "synpred28_ulNoActions", "compoundType", 
		"synpred30_ulNoActions", "formalParameters", "synpred21_ulNoActions", 
		"block", "synpred4_ulNoActions", "synpred5_ulNoActions", "idAssign", "printlnStmt", 
		"synpred15_ulNoActions", "synpred6_ulNoActions", "expr", "synpred23_ulNoActions", 
		"program", "returnStmt", "exprList", "synpred8_ulNoActions", "identifier", 
		"floatconstant", "synpred17_ulNoActions", "functionDecl", "synpred25_ulNoActions", 
		"arrayDecl", "compareExpr", "synpred19_ulNoActions", "exprMore", "ifBlock", 
		"synpred27_ulNoActions", "synpred1_ulNoActions", "synpred11_ulNoActions", 
		"statement", "ifElseBlock", "functionCall", "synpred2_ulNoActions", "characterconstant", 
		"synpred22_ulNoActions", "synpred7_ulNoActions"
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
			pushFollow(FOLLOW_compoundType_in_formalParameters181);
			ct=compoundType();
			state._fsp--;
			if (state.failed) return fp;dbg.location(78,25);
			pushFollow(FOLLOW_identifier_in_formalParameters187);
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
			match(input,23,FOLLOW_23_in_moreFormals221); if (state.failed) return mf;dbg.location(84,11);
			pushFollow(FOLLOW_compoundType_in_moreFormals227);
			ct=compoundType();
			state._fsp--;
			if (state.failed) return mf;dbg.location(84,29);
			pushFollow(FOLLOW_identifier_in_moreFormals233);
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
			match(input,31,FOLLOW_31_in_functionBody268); if (state.failed) return fb;dbg.location(101,8);
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
					pushFollow(FOLLOW_varDecl_in_functionBody276);
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
					pushFollow(FOLLOW_statement_in_functionBody297);
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
			match(input,32,FOLLOW_32_in_functionBody303); if (state.failed) return fb;
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
			pushFollow(FOLLOW_compoundType_in_varDecl324);
			ct=compoundType();
			state._fsp--;
			if (state.failed) return vd;dbg.location(107,25);
			pushFollow(FOLLOW_identifier_in_varDecl330);
			id=identifier();
			state._fsp--;
			if (state.failed) return vd;dbg.location(107,38);
			match(input,25,FOLLOW_25_in_varDecl332); if (state.failed) return vd;dbg.location(107,42);
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
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:111:1: compoundType returns [CompType ct] : (t= TYPE |ad= arrayDecl );
	public final CompType compoundType() throws RecognitionException {
		CompType ct = null;


		Token t=null;
		ArrayDecl ad =null;

		try { dbg.enterRule(getGrammarFileName(), "compoundType");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(111, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:113:2: (t= TYPE |ad= arrayDecl )
			int alt6=2;
			try { dbg.enterDecision(6, decisionCanBacktrack[6]);

			int LA6_0 = input.LA(1);
			if ( (LA6_0==TYPE) ) {
				int LA6_1 = input.LA(2);
				if ( (LA6_1==29) ) {
					alt6=2;
				}
				else if ( (LA6_1==ID) ) {
					alt6=1;
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

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:113:4: t= TYPE
					{
					dbg.location(113,6);
					t=(Token)match(input,TYPE,FOLLOW_TYPE_in_compoundType356); if (state.failed) return ct;dbg.location(113,13);
					if ( state.backtracking==0 ) { ct = new CompType(t.getText()); }
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:115:4: ad= arrayDecl
					{
					dbg.location(115,7);
					pushFollow(FOLLOW_arrayDecl_in_compoundType369);
					ad=arrayDecl();
					state._fsp--;
					if (state.failed) return ct;dbg.location(115,19);
					if ( state.backtracking==0 ) { ct = ad; }
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
			t=(Token)match(input,TYPE,FOLLOW_TYPE_in_arrayDecl391); if (state.failed) return ad;dbg.location(120,13);
			match(input,29,FOLLOW_29_in_arrayDecl393); if (state.failed) return ad;dbg.location(120,19);
			pushFollow(FOLLOW_integerconstant_in_arrayDecl398);
			il=integerconstant();
			state._fsp--;
			if (state.failed) return ad;dbg.location(120,36);
			match(input,30,FOLLOW_30_in_arrayDecl399); if (state.failed) return ad;dbg.location(122,2);
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
			id=(Token)match(input,ID,FOLLOW_ID_in_identifier424); if (state.failed) return i;dbg.location(127,12);
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
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:132:1: statement returns [Statement s] : (st= semiColon |ec= exprColon |idas= idAssign |aas= arrayAssign |ie= ifElseBlock |is= ifBlock |wh= whileBlock |pl= printlnStmt |p= printStmt |ret= returnStmt );
	public final Statement statement() throws RecognitionException {
		Statement s = null;


		SemiStatement st =null;
		ExColonStmt ec =null;
		IdAssignStmt idas =null;
		ArrayAssignStmt aas =null;
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
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:133:2: (st= semiColon |ec= exprColon |idas= idAssign |aas= arrayAssign |ie= ifElseBlock |is= ifBlock |wh= whileBlock |pl= printlnStmt |p= printStmt |ret= returnStmt )
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
					pushFollow(FOLLOW_semiColon_in_statement447);
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
					pushFollow(FOLLOW_exprColon_in_statement458);
					ec=exprColon();
					state._fsp--;
					if (state.failed) return s;dbg.location(134,19);
					if ( state.backtracking==0 ) { s = ec;  }
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:135:4: idas= idAssign
					{
					dbg.location(135,9);
					pushFollow(FOLLOW_idAssign_in_statement469);
					idas=idAssign();
					state._fsp--;
					if (state.failed) return s;dbg.location(135,20);
					if ( state.backtracking==0 ) { s = idas; }
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:136:4: aas= arrayAssign
					{
					dbg.location(136,8);
					pushFollow(FOLLOW_arrayAssign_in_statement480);
					aas=arrayAssign();
					state._fsp--;
					if (state.failed) return s;dbg.location(136,22);
					if ( state.backtracking==0 ) { s = aas; }
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:137:4: ie= ifElseBlock
					{
					dbg.location(137,7);
					pushFollow(FOLLOW_ifElseBlock_in_statement491);
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
					pushFollow(FOLLOW_ifBlock_in_statement502);
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
					pushFollow(FOLLOW_whileBlock_in_statement513);
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
					pushFollow(FOLLOW_printlnStmt_in_statement524);
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
					pushFollow(FOLLOW_printStmt_in_statement535);
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
					pushFollow(FOLLOW_returnStmt_in_statement546);
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
			match(input,WHILE,FOLLOW_WHILE_in_whileBlock564); if (state.failed) return wh;dbg.location(147,9);
			match(input,19,FOLLOW_19_in_whileBlock565); if (state.failed) return wh;dbg.location(147,15);
			pushFollow(FOLLOW_expr_in_whileBlock571);
			e=expr();
			state._fsp--;
			if (state.failed) return wh;dbg.location(147,21);
			match(input,20,FOLLOW_20_in_whileBlock572); if (state.failed) return wh;dbg.location(147,27);
			pushFollow(FOLLOW_block_in_whileBlock578);
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
			match(input,PRINTLN,FOLLOW_PRINTLN_in_printlnStmt596); if (state.failed) return pl;dbg.location(152,14);
			pushFollow(FOLLOW_expr_in_printlnStmt602);
			e=expr();
			state._fsp--;
			if (state.failed) return pl;dbg.location(152,21);
			match(input,25,FOLLOW_25_in_printlnStmt604); if (state.failed) return pl;dbg.location(152,25);
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
			match(input,PRINT,FOLLOW_PRINT_in_printStmt622); if (state.failed) return p;dbg.location(157,12);
			pushFollow(FOLLOW_expr_in_printStmt628);
			e=expr();
			state._fsp--;
			if (state.failed) return p;dbg.location(157,19);
			match(input,25,FOLLOW_25_in_printStmt630); if (state.failed) return p;dbg.location(157,23);
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
			match(input,RETURN,FOLLOW_RETURN_in_returnStmt659); if (state.failed) return ret;dbg.location(169,11);
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
					pushFollow(FOLLOW_expr_in_returnStmt666);
					e=expr();
					state._fsp--;
					if (state.failed) return ret;dbg.location(169,21);
					if ( state.backtracking==0 ) { ret.setExpr(e); }
					}
					break;

			}
			} finally {dbg.exitSubRule(8);}
			dbg.location(169,43);
			match(input,25,FOLLOW_25_in_returnStmt672); if (state.failed) return ret;
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
			match(input,25,FOLLOW_25_in_semiColon688); if (state.failed) return st;dbg.location(174,8);
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
			pushFollow(FOLLOW_expr_in_exprColon710);
			e=expr();
			state._fsp--;
			if (state.failed) return ec;dbg.location(179,13);
			match(input,25,FOLLOW_25_in_exprColon712); if (state.failed) return ec;dbg.location(179,17);
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



	// $ANTLR start "idAssign"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:183:1: idAssign returns [IdAssignStmt idas] : id= identifier '=' e= expr ';' ;
	public final IdAssignStmt idAssign() throws RecognitionException {
		IdAssignStmt idas = null;


		Identifier id =null;
		Expression e =null;

		try { dbg.enterRule(getGrammarFileName(), "idAssign");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(183, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:184:2: (id= identifier '=' e= expr ';' )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:184:4: id= identifier '=' e= expr ';'
			{
			dbg.location(184,7);
			pushFollow(FOLLOW_identifier_in_idAssign734);
			id=identifier();
			state._fsp--;
			if (state.failed) return idas;dbg.location(184,20);
			match(input,27,FOLLOW_27_in_idAssign736); if (state.failed) return idas;dbg.location(184,26);
			pushFollow(FOLLOW_expr_in_idAssign742);
			e=expr();
			state._fsp--;
			if (state.failed) return idas;dbg.location(184,33);
			match(input,25,FOLLOW_25_in_idAssign744); if (state.failed) return idas;dbg.location(184,37);
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
		dbg.location(185, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "idAssign");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return idas;
	}
	// $ANTLR end "idAssign"



	// $ANTLR start "arrayAssign"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:188:1: arrayAssign returns [ArrayAssignStmt aas] : id= identifier '[' e1= expr ']' '=' e2= expr ';' ;
	public final ArrayAssignStmt arrayAssign() throws RecognitionException {
		ArrayAssignStmt aas = null;


		Identifier id =null;
		Expression e1 =null;
		Expression e2 =null;

		try { dbg.enterRule(getGrammarFileName(), "arrayAssign");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(188, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:189:2: (id= identifier '[' e1= expr ']' '=' e2= expr ';' )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:189:4: id= identifier '[' e1= expr ']' '=' e2= expr ';'
			{
			dbg.location(189,7);
			pushFollow(FOLLOW_identifier_in_arrayAssign766);
			id=identifier();
			state._fsp--;
			if (state.failed) return aas;dbg.location(189,20);
			match(input,29,FOLLOW_29_in_arrayAssign768); if (state.failed) return aas;dbg.location(189,27);
			pushFollow(FOLLOW_expr_in_arrayAssign774);
			e1=expr();
			state._fsp--;
			if (state.failed) return aas;dbg.location(189,33);
			match(input,30,FOLLOW_30_in_arrayAssign775); if (state.failed) return aas;dbg.location(189,37);
			match(input,27,FOLLOW_27_in_arrayAssign777); if (state.failed) return aas;dbg.location(189,44);
			pushFollow(FOLLOW_expr_in_arrayAssign783);
			e2=expr();
			state._fsp--;
			if (state.failed) return aas;dbg.location(189,51);
			match(input,25,FOLLOW_25_in_arrayAssign785); if (state.failed) return aas;dbg.location(190,4);
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
		dbg.location(191, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "arrayAssign");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return aas;
	}
	// $ANTLR end "arrayAssign"



	// $ANTLR start "ifElseBlock"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:194:1: ifElseBlock returns [IfElseStmt ie] : IF '(' e= expr ')' b1= block ELSE b2= block ;
	public final IfElseStmt ifElseBlock() throws RecognitionException {
		IfElseStmt ie = null;


		Expression e =null;
		Block b1 =null;
		Block b2 =null;

		try { dbg.enterRule(getGrammarFileName(), "ifElseBlock");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(194, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:195:2: ( IF '(' e= expr ')' b1= block ELSE b2= block )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:195:4: IF '(' e= expr ')' b1= block ELSE b2= block
			{
			dbg.location(195,4);
			match(input,IF,FOLLOW_IF_in_ifElseBlock806); if (state.failed) return ie;dbg.location(195,6);
			match(input,19,FOLLOW_19_in_ifElseBlock807); if (state.failed) return ie;dbg.location(195,11);
			pushFollow(FOLLOW_expr_in_ifElseBlock812);
			e=expr();
			state._fsp--;
			if (state.failed) return ie;dbg.location(195,17);
			match(input,20,FOLLOW_20_in_ifElseBlock813); if (state.failed) return ie;dbg.location(195,24);
			pushFollow(FOLLOW_block_in_ifElseBlock819);
			b1=block();
			state._fsp--;
			if (state.failed) return ie;dbg.location(195,32);
			match(input,ELSE,FOLLOW_ELSE_in_ifElseBlock821); if (state.failed) return ie;dbg.location(195,40);
			pushFollow(FOLLOW_block_in_ifElseBlock827);
			b2=block();
			state._fsp--;
			if (state.failed) return ie;dbg.location(196,4);
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
		dbg.location(197, 1);

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
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:200:1: ifBlock returns [IfStmt is] : IF '(' e= expr ')' b= block ;
	public final IfStmt ifBlock() throws RecognitionException {
		IfStmt is = null;


		Expression e =null;
		Block b =null;

		try { dbg.enterRule(getGrammarFileName(), "ifBlock");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(200, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:201:2: ( IF '(' e= expr ')' b= block )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:201:4: IF '(' e= expr ')' b= block
			{
			dbg.location(201,4);
			match(input,IF,FOLLOW_IF_in_ifBlock848); if (state.failed) return is;dbg.location(201,6);
			match(input,19,FOLLOW_19_in_ifBlock849); if (state.failed) return is;dbg.location(201,11);
			pushFollow(FOLLOW_expr_in_ifBlock854);
			e=expr();
			state._fsp--;
			if (state.failed) return is;dbg.location(201,17);
			match(input,20,FOLLOW_20_in_ifBlock855); if (state.failed) return is;dbg.location(201,23);
			pushFollow(FOLLOW_block_in_ifBlock861);
			b=block();
			state._fsp--;
			if (state.failed) return is;dbg.location(201,31);
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
		dbg.location(202, 1);

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
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:205:1: block returns [Block blok] : '{' (s= statement )* '}' ;
	public final Block block() throws RecognitionException {
		Block blok = null;


		Statement s =null;


			// create a new block object with empty stmt list
			blok = new Block();

		try { dbg.enterRule(getGrammarFileName(), "block");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(205, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:213:2: ( '{' (s= statement )* '}' )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:213:4: '{' (s= statement )* '}'
			{
			dbg.location(213,4);
			match(input,31,FOLLOW_31_in_block890); if (state.failed) return blok;dbg.location(213,8);
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:213:8: (s= statement )*
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

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:213:10: s= statement
					{
					dbg.location(213,12);
					pushFollow(FOLLOW_statement_in_block898);
					s=statement();
					state._fsp--;
					if (state.failed) return blok;dbg.location(213,24);
					if ( state.backtracking==0 ) { blok.addToBlock(s); }
					}
					break;

				default :
					break loop9;
				}
			}
			} finally {dbg.exitSubRule(9);}
			dbg.location(213,51);
			match(input,32,FOLLOW_32_in_block905); if (state.failed) return blok;
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
		dbg.location(214, 1);

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
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:216:1: expr returns [Expression e] : l= literal ;
	public final Expression expr() throws RecognitionException {
		Expression e = null;


		Literal l =null;

		try { dbg.enterRule(getGrammarFileName(), "expr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(216, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:217:2: (l= literal )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:217:4: l= literal
			{
			dbg.location(217,6);
			pushFollow(FOLLOW_literal_in_expr924);
			l=literal();
			state._fsp--;
			if (state.failed) return e;dbg.location(217,16);
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
		dbg.location(218, 1);

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
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:220:1: compareExpr : lessExpr ( '==' lessExpr )* ;
	public final void compareExpr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "compareExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(220, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:220:12: ( lessExpr ( '==' lessExpr )* )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:220:14: lessExpr ( '==' lessExpr )*
			{
			dbg.location(220,14);
			pushFollow(FOLLOW_lessExpr_in_compareExpr936);
			lessExpr();
			state._fsp--;
			if (state.failed) return;dbg.location(220,23);
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:220:23: ( '==' lessExpr )*
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

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:220:24: '==' lessExpr
					{
					dbg.location(220,24);
					match(input,28,FOLLOW_28_in_compareExpr939); if (state.failed) return;dbg.location(220,29);
					pushFollow(FOLLOW_lessExpr_in_compareExpr941);
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
		dbg.location(221, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "compareExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "compareExpr"



	// $ANTLR start "lessExpr"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:223:1: lessExpr : plmiExpr ( '<' plmiExpr )* ;
	public final void lessExpr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "lessExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(223, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:223:9: ( plmiExpr ( '<' plmiExpr )* )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:223:11: plmiExpr ( '<' plmiExpr )*
			{
			dbg.location(223,11);
			pushFollow(FOLLOW_plmiExpr_in_lessExpr952);
			plmiExpr();
			state._fsp--;
			if (state.failed) return;dbg.location(223,20);
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:223:20: ( '<' plmiExpr )*
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

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:223:21: '<' plmiExpr
					{
					dbg.location(223,21);
					match(input,26,FOLLOW_26_in_lessExpr955); if (state.failed) return;dbg.location(223,25);
					pushFollow(FOLLOW_plmiExpr_in_lessExpr957);
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
		dbg.location(224, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "lessExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "lessExpr"



	// $ANTLR start "plmiExpr"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:226:1: plmiExpr : multExpr ( ( '+' | '-' ) multExpr )* ;
	public final void plmiExpr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "plmiExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(226, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:226:9: ( multExpr ( ( '+' | '-' ) multExpr )* )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:226:11: multExpr ( ( '+' | '-' ) multExpr )*
			{
			dbg.location(226,11);
			pushFollow(FOLLOW_multExpr_in_plmiExpr968);
			multExpr();
			state._fsp--;
			if (state.failed) return;dbg.location(226,20);
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:226:20: ( ( '+' | '-' ) multExpr )*
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

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:226:21: ( '+' | '-' ) multExpr
					{
					dbg.location(226,21);
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
					}dbg.location(226,31);
					pushFollow(FOLLOW_multExpr_in_plmiExpr977);
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
		dbg.location(227, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "plmiExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "plmiExpr"



	// $ANTLR start "multExpr"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:229:1: multExpr : atom ( '*' atom )* ;
	public final void multExpr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "multExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(229, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:229:9: ( atom ( '*' atom )* )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:229:11: atom ( '*' atom )*
			{
			dbg.location(229,11);
			pushFollow(FOLLOW_atom_in_multExpr988);
			atom();
			state._fsp--;
			if (state.failed) return;dbg.location(229,16);
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:229:16: ( '*' atom )*
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

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:229:17: '*' atom
					{
					dbg.location(229,17);
					match(input,21,FOLLOW_21_in_multExpr991); if (state.failed) return;dbg.location(229,21);
					pushFollow(FOLLOW_atom_in_multExpr993);
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
		dbg.location(230, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "multExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "multExpr"



	// $ANTLR start "atom"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:232:1: atom : ( literal | identifier | functionCall | arrayRef | parenExpr );
	public final void atom() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "atom");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(232, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:232:5: ( literal | identifier | functionCall | arrayRef | parenExpr )
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

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:232:7: literal
					{
					dbg.location(232,7);
					pushFollow(FOLLOW_literal_in_atom1004);
					literal();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:233:4: identifier
					{
					dbg.location(233,4);
					pushFollow(FOLLOW_identifier_in_atom1010);
					identifier();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:234:4: functionCall
					{
					dbg.location(234,4);
					pushFollow(FOLLOW_functionCall_in_atom1016);
					functionCall();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:235:4: arrayRef
					{
					dbg.location(235,4);
					pushFollow(FOLLOW_arrayRef_in_atom1022);
					arrayRef();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:236:4: parenExpr
					{
					dbg.location(236,4);
					pushFollow(FOLLOW_parenExpr_in_atom1028);
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
		dbg.location(237, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "atom");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "atom"



	// $ANTLR start "functionCall"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:239:1: functionCall : identifier '(' exprList ')' ;
	public final void functionCall() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "functionCall");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(239, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:239:13: ( identifier '(' exprList ')' )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:239:15: identifier '(' exprList ')'
			{
			dbg.location(239,15);
			pushFollow(FOLLOW_identifier_in_functionCall1037);
			identifier();
			state._fsp--;
			if (state.failed) return;dbg.location(239,25);
			match(input,19,FOLLOW_19_in_functionCall1038); if (state.failed) return;dbg.location(239,29);
			pushFollow(FOLLOW_exprList_in_functionCall1040);
			exprList();
			state._fsp--;
			if (state.failed) return;dbg.location(239,38);
			match(input,20,FOLLOW_20_in_functionCall1042); if (state.failed) return;
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
		dbg.location(240, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "functionCall");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "functionCall"



	// $ANTLR start "arrayRef"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:242:1: arrayRef : identifier '[' expr ']' ;
	public final void arrayRef() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "arrayRef");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(242, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:242:9: ( identifier '[' expr ']' )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:242:11: identifier '[' expr ']'
			{
			dbg.location(242,11);
			pushFollow(FOLLOW_identifier_in_arrayRef1051);
			identifier();
			state._fsp--;
			if (state.failed) return;dbg.location(242,21);
			match(input,29,FOLLOW_29_in_arrayRef1052); if (state.failed) return;dbg.location(242,24);
			pushFollow(FOLLOW_expr_in_arrayRef1053);
			expr();
			state._fsp--;
			if (state.failed) return;dbg.location(242,28);
			match(input,30,FOLLOW_30_in_arrayRef1054); if (state.failed) return;
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
		dbg.location(243, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "arrayRef");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "arrayRef"



	// $ANTLR start "parenExpr"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:245:1: parenExpr : '(' expr ')' ;
	public final void parenExpr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "parenExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(245, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:245:10: ( '(' expr ')' )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:245:12: '(' expr ')'
			{
			dbg.location(245,12);
			match(input,19,FOLLOW_19_in_parenExpr1064); if (state.failed) return;dbg.location(245,16);
			pushFollow(FOLLOW_expr_in_parenExpr1066);
			expr();
			state._fsp--;
			if (state.failed) return;dbg.location(245,21);
			match(input,20,FOLLOW_20_in_parenExpr1068); if (state.failed) return;
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
		dbg.location(246, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "parenExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "parenExpr"



	// $ANTLR start "exprList"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:248:1: exprList : expr ( exprMore )* ;
	public final void exprList() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "exprList");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(248, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:248:9: ( expr ( exprMore )* )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:248:11: expr ( exprMore )*
			{
			dbg.location(248,11);
			pushFollow(FOLLOW_expr_in_exprList1077);
			expr();
			state._fsp--;
			if (state.failed) return;dbg.location(248,16);
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:248:16: ( exprMore )*
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

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:248:16: exprMore
					{
					dbg.location(248,16);
					pushFollow(FOLLOW_exprMore_in_exprList1079);
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
		dbg.location(249, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "exprList");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "exprList"



	// $ANTLR start "exprMore"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:251:1: exprMore : ',' expr ;
	public final void exprMore() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "exprMore");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(251, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:251:9: ( ',' expr )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:251:11: ',' expr
			{
			dbg.location(251,11);
			match(input,23,FOLLOW_23_in_exprMore1089); if (state.failed) return;dbg.location(251,15);
			pushFollow(FOLLOW_expr_in_exprMore1091);
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
		dbg.location(252, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "exprMore");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "exprMore"



	// $ANTLR start "literal"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:255:1: literal returns [Literal l] : (sl= stringconstant |il= integerconstant |cl= characterconstant |fl= floatconstant |bl= bool );
	public final Literal literal() throws RecognitionException {
		Literal l = null;


		StringLiteral sl =null;
		IntegerLiteral il =null;
		CharLiteral cl =null;
		FloatLiteral fl =null;
		BooleanLiteral bl =null;

		try { dbg.enterRule(getGrammarFileName(), "literal");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(255, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:256:2: (sl= stringconstant |il= integerconstant |cl= characterconstant |fl= floatconstant |bl= bool )
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

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:256:4: sl= stringconstant
					{
					dbg.location(256,7);
					pushFollow(FOLLOW_stringconstant_in_literal1112);
					sl=stringconstant();
					state._fsp--;
					if (state.failed) return l;dbg.location(256,24);
					if ( state.backtracking==0 ) { l = sl;}
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:257:4: il= integerconstant
					{
					dbg.location(257,7);
					pushFollow(FOLLOW_integerconstant_in_literal1123);
					il=integerconstant();
					state._fsp--;
					if (state.failed) return l;dbg.location(257,25);
					if ( state.backtracking==0 ) { l = il; }
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:258:4: cl= characterconstant
					{
					dbg.location(258,7);
					pushFollow(FOLLOW_characterconstant_in_literal1134);
					cl=characterconstant();
					state._fsp--;
					if (state.failed) return l;dbg.location(258,27);
					if ( state.backtracking==0 ) { l = cl; }
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:259:4: fl= floatconstant
					{
					dbg.location(259,7);
					pushFollow(FOLLOW_floatconstant_in_literal1145);
					fl=floatconstant();
					state._fsp--;
					if (state.failed) return l;dbg.location(259,23);
					if ( state.backtracking==0 ) { l = fl; }
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:260:4: bl= bool
					{
					dbg.location(260,7);
					pushFollow(FOLLOW_bool_in_literal1156);
					bl=bool();
					state._fsp--;
					if (state.failed) return l;dbg.location(260,14);
					if ( state.backtracking==0 ) { l = bl; }
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
		dbg.location(261, 1);

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
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:264:1: stringconstant returns [StringLiteral sl] : s= STRINGCONSTANT ;
	public final StringLiteral stringconstant() throws RecognitionException {
		StringLiteral sl = null;


		Token s=null;

		try { dbg.enterRule(getGrammarFileName(), "stringconstant");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(264, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:266:2: (s= STRINGCONSTANT )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:266:4: s= STRINGCONSTANT
			{
			dbg.location(266,6);
			s=(Token)match(input,STRINGCONSTANT,FOLLOW_STRINGCONSTANT_in_stringconstant1180); if (state.failed) return sl;dbg.location(266,23);
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
		dbg.location(267, 1);

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
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:270:1: floatconstant returns [FloatLiteral fl] : f= FLOATCONSTANT ;
	public final FloatLiteral floatconstant() throws RecognitionException {
		FloatLiteral fl = null;


		Token f=null;

		try { dbg.enterRule(getGrammarFileName(), "floatconstant");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(270, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:272:2: (f= FLOATCONSTANT )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:272:4: f= FLOATCONSTANT
			{
			dbg.location(272,6);
			f=(Token)match(input,FLOATCONSTANT,FOLLOW_FLOATCONSTANT_in_floatconstant1204); if (state.failed) return fl;dbg.location(272,22);
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
		dbg.location(273, 1);

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
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:276:1: characterconstant returns [CharLiteral cl] : c= CHARACTERCONSTANT ;
	public final CharLiteral characterconstant() throws RecognitionException {
		CharLiteral cl = null;


		Token c=null;

		try { dbg.enterRule(getGrammarFileName(), "characterconstant");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(276, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:278:2: (c= CHARACTERCONSTANT )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:278:4: c= CHARACTERCONSTANT
			{
			dbg.location(278,6);
			c=(Token)match(input,CHARACTERCONSTANT,FOLLOW_CHARACTERCONSTANT_in_characterconstant1228); if (state.failed) return cl;dbg.location(278,26);
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
		dbg.location(279, 1);

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
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:282:1: integerconstant returns [IntegerLiteral il] : i= INTEGERCONSTANT ;
	public final IntegerLiteral integerconstant() throws RecognitionException {
		IntegerLiteral il = null;


		Token i=null;

		try { dbg.enterRule(getGrammarFileName(), "integerconstant");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(282, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:284:2: (i= INTEGERCONSTANT )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:284:4: i= INTEGERCONSTANT
			{
			dbg.location(284,6);
			i=(Token)match(input,INTEGERCONSTANT,FOLLOW_INTEGERCONSTANT_in_integerconstant1252); if (state.failed) return il;dbg.location(284,24);
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
		dbg.location(285, 1);

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
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:288:1: bool returns [BooleanLiteral bl] : b= BOOL ;
	public final BooleanLiteral bool() throws RecognitionException {
		BooleanLiteral bl = null;


		Token b=null;

		try { dbg.enterRule(getGrammarFileName(), "bool");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(288, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:290:2: (b= BOOL )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:290:4: b= BOOL
			{
			dbg.location(290,6);
			b=(Token)match(input,BOOL,FOLLOW_BOOL_in_bool1276); if (state.failed) return bl;dbg.location(290,13);
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
		dbg.location(291, 1);

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
		IdAssignStmt idas =null;

		// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:135:4: (idas= idAssign )
		dbg.enterAlt(1);

		// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:135:4: idas= idAssign
		{
		dbg.location(135,9);
		pushFollow(FOLLOW_idAssign_in_synpred9_ulNoActions469);
		idas=idAssign();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred9_ulNoActions

	// $ANTLR start synpred10_ulNoActions
	public final void synpred10_ulNoActions_fragment() throws RecognitionException {
		ArrayAssignStmt aas =null;

		// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:136:4: (aas= arrayAssign )
		dbg.enterAlt(1);

		// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:136:4: aas= arrayAssign
		{
		dbg.location(136,8);
		pushFollow(FOLLOW_arrayAssign_in_synpred10_ulNoActions480);
		aas=arrayAssign();
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
		pushFollow(FOLLOW_ifElseBlock_in_synpred11_ulNoActions491);
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
		pushFollow(FOLLOW_ifBlock_in_synpred12_ulNoActions502);
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
	public static final BitSet FOLLOW_20_in_functionDecl158 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compoundType_in_formalParameters181 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_identifier_in_formalParameters187 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_moreFormals_in_formalParameters202 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_23_in_moreFormals221 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_compoundType_in_moreFormals227 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_identifier_in_moreFormals233 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_functionBody268 = new BitSet(new long[]{0x000000010203FF30L});
	public static final BitSet FOLLOW_varDecl_in_functionBody276 = new BitSet(new long[]{0x000000010203FF30L});
	public static final BitSet FOLLOW_statement_in_functionBody297 = new BitSet(new long[]{0x000000010202FF30L});
	public static final BitSet FOLLOW_32_in_functionBody303 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compoundType_in_varDecl324 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_identifier_in_varDecl330 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_varDecl332 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_in_compoundType356 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayDecl_in_compoundType369 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_in_arrayDecl391 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_arrayDecl393 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_integerconstant_in_arrayDecl398 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_arrayDecl399 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_identifier424 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_semiColon_in_statement447 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprColon_in_statement458 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_idAssign_in_statement469 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayAssign_in_statement480 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifElseBlock_in_statement491 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifBlock_in_statement502 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileBlock_in_statement513 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_printlnStmt_in_statement524 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_printStmt_in_statement535 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_returnStmt_in_statement546 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_whileBlock564 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_whileBlock565 = new BitSet(new long[]{0x0000000000008930L});
	public static final BitSet FOLLOW_expr_in_whileBlock571 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_whileBlock572 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_block_in_whileBlock578 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINTLN_in_printlnStmt596 = new BitSet(new long[]{0x0000000000008930L});
	public static final BitSet FOLLOW_expr_in_printlnStmt602 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_printlnStmt604 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_printStmt622 = new BitSet(new long[]{0x0000000000008930L});
	public static final BitSet FOLLOW_expr_in_printStmt628 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_printStmt630 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURN_in_returnStmt659 = new BitSet(new long[]{0x0000000002008930L});
	public static final BitSet FOLLOW_expr_in_returnStmt666 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_returnStmt672 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_semiColon688 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_exprColon710 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_exprColon712 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_idAssign734 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_idAssign736 = new BitSet(new long[]{0x0000000000008930L});
	public static final BitSet FOLLOW_expr_in_idAssign742 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_idAssign744 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_arrayAssign766 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_arrayAssign768 = new BitSet(new long[]{0x0000000000008930L});
	public static final BitSet FOLLOW_expr_in_arrayAssign774 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_arrayAssign775 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_arrayAssign777 = new BitSet(new long[]{0x0000000000008930L});
	public static final BitSet FOLLOW_expr_in_arrayAssign783 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_arrayAssign785 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifElseBlock806 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_ifElseBlock807 = new BitSet(new long[]{0x0000000000008930L});
	public static final BitSet FOLLOW_expr_in_ifElseBlock812 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_ifElseBlock813 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_block_in_ifElseBlock819 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ELSE_in_ifElseBlock821 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_block_in_ifElseBlock827 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifBlock848 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_ifBlock849 = new BitSet(new long[]{0x0000000000008930L});
	public static final BitSet FOLLOW_expr_in_ifBlock854 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_ifBlock855 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_block_in_ifBlock861 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_block890 = new BitSet(new long[]{0x000000010202FF30L});
	public static final BitSet FOLLOW_statement_in_block898 = new BitSet(new long[]{0x000000010202FF30L});
	public static final BitSet FOLLOW_32_in_block905 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_literal_in_expr924 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lessExpr_in_compareExpr936 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_28_in_compareExpr939 = new BitSet(new long[]{0x0000000000088B30L});
	public static final BitSet FOLLOW_lessExpr_in_compareExpr941 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_plmiExpr_in_lessExpr952 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_26_in_lessExpr955 = new BitSet(new long[]{0x0000000000088B30L});
	public static final BitSet FOLLOW_plmiExpr_in_lessExpr957 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_multExpr_in_plmiExpr968 = new BitSet(new long[]{0x0000000001400002L});
	public static final BitSet FOLLOW_set_in_plmiExpr971 = new BitSet(new long[]{0x0000000000088B30L});
	public static final BitSet FOLLOW_multExpr_in_plmiExpr977 = new BitSet(new long[]{0x0000000001400002L});
	public static final BitSet FOLLOW_atom_in_multExpr988 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_21_in_multExpr991 = new BitSet(new long[]{0x0000000000088B30L});
	public static final BitSet FOLLOW_atom_in_multExpr993 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_literal_in_atom1004 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_atom1010 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_atom1016 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayRef_in_atom1022 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parenExpr_in_atom1028 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_functionCall1037 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_functionCall1038 = new BitSet(new long[]{0x0000000000008930L});
	public static final BitSet FOLLOW_exprList_in_functionCall1040 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_functionCall1042 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_arrayRef1051 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_arrayRef1052 = new BitSet(new long[]{0x0000000000008930L});
	public static final BitSet FOLLOW_expr_in_arrayRef1053 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_arrayRef1054 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_parenExpr1064 = new BitSet(new long[]{0x0000000000008930L});
	public static final BitSet FOLLOW_expr_in_parenExpr1066 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_parenExpr1068 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_exprList1077 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_exprMore_in_exprList1079 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_23_in_exprMore1089 = new BitSet(new long[]{0x0000000000008930L});
	public static final BitSet FOLLOW_expr_in_exprMore1091 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stringconstant_in_literal1112 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_integerconstant_in_literal1123 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_characterconstant_in_literal1134 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_floatconstant_in_literal1145 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bool_in_literal1156 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRINGCONSTANT_in_stringconstant1180 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOATCONSTANT_in_floatconstant1204 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTERCONSTANT_in_characterconstant1228 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGERCONSTANT_in_integerconstant1252 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOL_in_bool1276 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_idAssign_in_synpred9_ulNoActions469 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayAssign_in_synpred10_ulNoActions480 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifElseBlock_in_synpred11_ulNoActions491 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifBlock_in_synpred12_ulNoActions502 = new BitSet(new long[]{0x0000000000000002L});
}
