// $ANTLR null /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g 2020-01-20 12:54:56

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
		"invalidRule", "atom", "synpred25_ulNoActions", "literal", "synpred21_ulNoActions", 
		"compareExpr", "synpred5_ulNoActions", "synpred7_ulNoActions", "synpred10_ulNoActions", 
		"synpred11_ulNoActions", "ifElseBlock", "varDecl", "semiColon", "characterconstant", 
		"synpred6_ulNoActions", "idAssign", "synpred26_ulNoActions", "synpred29_ulNoActions", 
		"block", "synpred19_ulNoActions", "program", "multExpr", "expr", "function", 
		"compoundType", "arrayDecl", "synpred30_ulNoActions", "whileBlock", "synpred13_ulNoActions", 
		"arrayAssign", "synpred14_ulNoActions", "lessExpr", "parenExpr", "type", 
		"exprList", "exprMore", "stringconstant", "bool", "printlnStmt", "synpred16_ulNoActions", 
		"synpred9_ulNoActions", "synpred31_ulNoActions", "synpred22_ulNoActions", 
		"ifBlock", "functionCall", "returnStmt", "exprColon", "synpred18_ulNoActions", 
		"synpred8_ulNoActions", "synpred23_ulNoActions", "plmiExpr", "synpred28_ulNoActions", 
		"arrayRef", "floatconstant", "synpred20_ulNoActions", "integerconstant", 
		"synpred4_ulNoActions", "moreFormals", "synpred1_ulNoActions", "functionDecl", 
		"synpred2_ulNoActions", "identifier", "formalParameters", "statement", 
		"functionBody", "synpred12_ulNoActions", "synpred27_ulNoActions", "synpred17_ulNoActions", 
		"synpred3_ulNoActions", "printStmt", "synpred15_ulNoActions", "synpred24_ulNoActions"
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
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:45:1: program : ( function )+ EOF ;
	public final void program() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "program");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(45, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:45:9: ( ( function )+ EOF )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:45:11: ( function )+ EOF
			{
			dbg.location(45,11);
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:45:11: ( function )+
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

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:45:11: function
					{
					dbg.location(45,11);
					pushFollow(FOLLOW_function_in_program42);
					function();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(1, input);
					dbg.recognitionException(eee);

					throw eee;
				}
				cnt1++;
			}
			} finally {dbg.exitSubRule(1);}
			dbg.location(45,21);
			match(input,EOF,FOLLOW_EOF_in_program45); if (state.failed) return;
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
		dbg.location(46, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "program");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "program"



	// $ANTLR start "function"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:48:1: function : functionDecl functionBody ;
	public final void function() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "function");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(48, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:48:9: ( functionDecl functionBody )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:48:11: functionDecl functionBody
			{
			dbg.location(48,11);
			pushFollow(FOLLOW_functionDecl_in_function54);
			functionDecl();
			state._fsp--;
			if (state.failed) return;dbg.location(48,24);
			pushFollow(FOLLOW_functionBody_in_function56);
			functionBody();
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
		dbg.location(49, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "function");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "function"



	// $ANTLR start "functionDecl"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:51:1: functionDecl : compoundType identifier '(' ( formalParameters )? ')' ;
	public final void functionDecl() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "functionDecl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(51, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:51:13: ( compoundType identifier '(' ( formalParameters )? ')' )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:51:15: compoundType identifier '(' ( formalParameters )? ')'
			{
			dbg.location(51,15);
			pushFollow(FOLLOW_compoundType_in_functionDecl65);
			compoundType();
			state._fsp--;
			if (state.failed) return;dbg.location(51,28);
			pushFollow(FOLLOW_identifier_in_functionDecl67);
			identifier();
			state._fsp--;
			if (state.failed) return;dbg.location(51,39);
			match(input,19,FOLLOW_19_in_functionDecl69); if (state.failed) return;dbg.location(51,43);
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:51:43: ( formalParameters )?
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

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:51:43: formalParameters
					{
					dbg.location(51,43);
					pushFollow(FOLLOW_formalParameters_in_functionDecl71);
					formalParameters();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(2);}
			dbg.location(51,61);
			match(input,20,FOLLOW_20_in_functionDecl74); if (state.failed) return;
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
		dbg.location(52, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "functionDecl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "functionDecl"



	// $ANTLR start "formalParameters"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:54:1: formalParameters : compoundType identifier ( moreFormals )* ;
	public final void formalParameters() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "formalParameters");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(54, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:54:17: ( compoundType identifier ( moreFormals )* )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:54:19: compoundType identifier ( moreFormals )*
			{
			dbg.location(54,19);
			pushFollow(FOLLOW_compoundType_in_formalParameters83);
			compoundType();
			state._fsp--;
			if (state.failed) return;dbg.location(54,32);
			pushFollow(FOLLOW_identifier_in_formalParameters85);
			identifier();
			state._fsp--;
			if (state.failed) return;dbg.location(54,43);
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:54:43: ( moreFormals )*
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

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:54:43: moreFormals
					{
					dbg.location(54,43);
					pushFollow(FOLLOW_moreFormals_in_formalParameters87);
					moreFormals();
					state._fsp--;
					if (state.failed) return;
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
		dbg.location(55, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "formalParameters");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "formalParameters"



	// $ANTLR start "moreFormals"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:57:1: moreFormals : ',' compoundType identifier ;
	public final void moreFormals() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "moreFormals");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(57, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:57:12: ( ',' compoundType identifier )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:57:14: ',' compoundType identifier
			{
			dbg.location(57,14);
			match(input,23,FOLLOW_23_in_moreFormals97); if (state.failed) return;dbg.location(57,18);
			pushFollow(FOLLOW_compoundType_in_moreFormals99);
			compoundType();
			state._fsp--;
			if (state.failed) return;dbg.location(57,31);
			pushFollow(FOLLOW_identifier_in_moreFormals101);
			identifier();
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
		dbg.location(58, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "moreFormals");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "moreFormals"



	// $ANTLR start "functionBody"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:60:1: functionBody : '{' ( varDecl )* ( statement )* '}' ;
	public final void functionBody() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "functionBody");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(60, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:60:13: ( '{' ( varDecl )* ( statement )* '}' )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:60:15: '{' ( varDecl )* ( statement )* '}'
			{
			dbg.location(60,15);
			match(input,31,FOLLOW_31_in_functionBody110); if (state.failed) return;dbg.location(60,19);
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:60:19: ( varDecl )*
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

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:60:19: varDecl
					{
					dbg.location(60,19);
					pushFollow(FOLLOW_varDecl_in_functionBody112);
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
			dbg.location(60,29);
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:60:29: ( statement )*
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

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:60:29: statement
					{
					dbg.location(60,29);
					pushFollow(FOLLOW_statement_in_functionBody116);
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
			dbg.location(60,40);
			match(input,32,FOLLOW_32_in_functionBody119); if (state.failed) return;
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
		dbg.location(61, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "functionBody");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "functionBody"



	// $ANTLR start "varDecl"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:63:1: varDecl : compoundType identifier ';' ;
	public final void varDecl() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "varDecl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(63, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:63:8: ( compoundType identifier ';' )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:63:10: compoundType identifier ';'
			{
			dbg.location(63,10);
			pushFollow(FOLLOW_compoundType_in_varDecl128);
			compoundType();
			state._fsp--;
			if (state.failed) return;dbg.location(63,23);
			pushFollow(FOLLOW_identifier_in_varDecl130);
			identifier();
			state._fsp--;
			if (state.failed) return;dbg.location(63,34);
			match(input,25,FOLLOW_25_in_varDecl132); if (state.failed) return;
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
		dbg.location(64, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "varDecl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "varDecl"



	// $ANTLR start "compoundType"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:66:1: compoundType : ( type | arrayDecl );
	public final void compoundType() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "compoundType");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(66, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:66:13: ( type | arrayDecl )
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

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:66:15: type
					{
					dbg.location(66,15);
					pushFollow(FOLLOW_type_in_compoundType141);
					type();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:67:4: arrayDecl
					{
					dbg.location(67,4);
					pushFollow(FOLLOW_arrayDecl_in_compoundType148);
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
		dbg.location(68, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "compoundType");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "compoundType"



	// $ANTLR start "arrayDecl"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:70:1: arrayDecl : type '[' integerconstant ']' ;
	public final void arrayDecl() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "arrayDecl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(70, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:70:10: ( type '[' integerconstant ']' )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:70:12: type '[' integerconstant ']'
			{
			dbg.location(70,12);
			pushFollow(FOLLOW_type_in_arrayDecl157);
			type();
			state._fsp--;
			if (state.failed) return;dbg.location(70,16);
			match(input,29,FOLLOW_29_in_arrayDecl158); if (state.failed) return;dbg.location(70,19);
			pushFollow(FOLLOW_integerconstant_in_arrayDecl159);
			integerconstant();
			state._fsp--;
			if (state.failed) return;dbg.location(70,34);
			match(input,30,FOLLOW_30_in_arrayDecl160); if (state.failed) return;
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
		dbg.location(71, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "arrayDecl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "arrayDecl"



	// $ANTLR start "identifier"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:73:1: identifier : ID ;
	public final void identifier() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "identifier");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(73, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:73:12: ( ID )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:73:14: ID
			{
			dbg.location(73,14);
			match(input,ID,FOLLOW_ID_in_identifier170); if (state.failed) return;
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
			dbg.exitRule(getGrammarFileName(), "identifier");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "identifier"



	// $ANTLR start "type"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:76:1: type : TYPE ;
	public final void type() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "type");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(76, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:76:5: ( TYPE )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:76:7: TYPE
			{
			dbg.location(76,7);
			match(input,TYPE,FOLLOW_TYPE_in_type179); if (state.failed) return;
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
		dbg.location(77, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "type");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "type"



	// $ANTLR start "statement"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:79:1: statement : ( semiColon | exprColon | idAssign | arrayAssign | ifElseBlock | ifBlock | whileBlock | printlnStmt | printStmt | returnStmt );
	public final void statement() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "statement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(79, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:79:10: ( semiColon | exprColon | idAssign | arrayAssign | ifElseBlock | ifBlock | whileBlock | printlnStmt | printStmt | returnStmt )
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

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:79:12: semiColon
					{
					dbg.location(79,12);
					pushFollow(FOLLOW_semiColon_in_statement188);
					semiColon();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:80:2: exprColon
					{
					dbg.location(80,2);
					pushFollow(FOLLOW_exprColon_in_statement193);
					exprColon();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:81:2: idAssign
					{
					dbg.location(81,2);
					pushFollow(FOLLOW_idAssign_in_statement198);
					idAssign();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:82:2: arrayAssign
					{
					dbg.location(82,2);
					pushFollow(FOLLOW_arrayAssign_in_statement203);
					arrayAssign();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:83:2: ifElseBlock
					{
					dbg.location(83,2);
					pushFollow(FOLLOW_ifElseBlock_in_statement208);
					ifElseBlock();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:84:2: ifBlock
					{
					dbg.location(84,2);
					pushFollow(FOLLOW_ifBlock_in_statement213);
					ifBlock();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:85:2: whileBlock
					{
					dbg.location(85,2);
					pushFollow(FOLLOW_whileBlock_in_statement218);
					whileBlock();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 8 :
					dbg.enterAlt(8);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:86:2: printlnStmt
					{
					dbg.location(86,2);
					pushFollow(FOLLOW_printlnStmt_in_statement223);
					printlnStmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 9 :
					dbg.enterAlt(9);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:87:2: printStmt
					{
					dbg.location(87,2);
					pushFollow(FOLLOW_printStmt_in_statement228);
					printStmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 10 :
					dbg.enterAlt(10);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:88:2: returnStmt
					{
					dbg.location(88,2);
					pushFollow(FOLLOW_returnStmt_in_statement233);
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
		dbg.location(89, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "statement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "statement"



	// $ANTLR start "whileBlock"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:91:1: whileBlock : WHILE '(' expr ')' block ;
	public final void whileBlock() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "whileBlock");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(91, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:91:11: ( WHILE '(' expr ')' block )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:91:13: WHILE '(' expr ')' block
			{
			dbg.location(91,13);
			match(input,WHILE,FOLLOW_WHILE_in_whileBlock242); if (state.failed) return;dbg.location(91,18);
			match(input,19,FOLLOW_19_in_whileBlock243); if (state.failed) return;dbg.location(91,22);
			pushFollow(FOLLOW_expr_in_whileBlock245);
			expr();
			state._fsp--;
			if (state.failed) return;dbg.location(91,26);
			match(input,20,FOLLOW_20_in_whileBlock246); if (state.failed) return;dbg.location(91,30);
			pushFollow(FOLLOW_block_in_whileBlock248);
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
		dbg.location(92, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "whileBlock");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "whileBlock"



	// $ANTLR start "printlnStmt"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:94:1: printlnStmt : PRINTLN expr ';' ;
	public final void printlnStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "printlnStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(94, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:94:12: ( PRINTLN expr ';' )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:94:14: PRINTLN expr ';'
			{
			dbg.location(94,14);
			match(input,PRINTLN,FOLLOW_PRINTLN_in_printlnStmt257); if (state.failed) return;dbg.location(94,22);
			pushFollow(FOLLOW_expr_in_printlnStmt259);
			expr();
			state._fsp--;
			if (state.failed) return;dbg.location(94,27);
			match(input,25,FOLLOW_25_in_printlnStmt261); if (state.failed) return;
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
		dbg.location(95, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "printlnStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "printlnStmt"



	// $ANTLR start "printStmt"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:97:1: printStmt : PRINT expr ';' ;
	public final void printStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "printStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(97, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:97:10: ( PRINT expr ';' )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:97:12: PRINT expr ';'
			{
			dbg.location(97,12);
			match(input,PRINT,FOLLOW_PRINT_in_printStmt270); if (state.failed) return;dbg.location(97,18);
			pushFollow(FOLLOW_expr_in_printStmt272);
			expr();
			state._fsp--;
			if (state.failed) return;dbg.location(97,23);
			match(input,25,FOLLOW_25_in_printStmt274); if (state.failed) return;
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
			dbg.exitRule(getGrammarFileName(), "printStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "printStmt"



	// $ANTLR start "returnStmt"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:100:1: returnStmt : RETURN ( expr )? ';' ;
	public final void returnStmt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "returnStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(100, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:100:11: ( RETURN ( expr )? ';' )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:100:13: RETURN ( expr )? ';'
			{
			dbg.location(100,13);
			match(input,RETURN,FOLLOW_RETURN_in_returnStmt283); if (state.failed) return;dbg.location(100,20);
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:100:20: ( expr )?
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

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:100:20: expr
					{
					dbg.location(100,20);
					pushFollow(FOLLOW_expr_in_returnStmt285);
					expr();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(8);}
			dbg.location(100,26);
			match(input,25,FOLLOW_25_in_returnStmt288); if (state.failed) return;
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
			dbg.exitRule(getGrammarFileName(), "returnStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "returnStmt"



	// $ANTLR start "semiColon"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:103:1: semiColon : ';' ;
	public final void semiColon() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "semiColon");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(103, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:103:10: ( ';' )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:103:12: ';'
			{
			dbg.location(103,12);
			match(input,25,FOLLOW_25_in_semiColon297); if (state.failed) return;
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
			dbg.exitRule(getGrammarFileName(), "semiColon");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "semiColon"



	// $ANTLR start "exprColon"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:106:1: exprColon : expr ';' ;
	public final void exprColon() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "exprColon");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(106, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:106:10: ( expr ';' )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:106:12: expr ';'
			{
			dbg.location(106,12);
			pushFollow(FOLLOW_expr_in_exprColon306);
			expr();
			state._fsp--;
			if (state.failed) return;dbg.location(106,17);
			match(input,25,FOLLOW_25_in_exprColon308); if (state.failed) return;
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
			dbg.exitRule(getGrammarFileName(), "exprColon");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "exprColon"



	// $ANTLR start "idAssign"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:109:1: idAssign : identifier '=' expr ';' ;
	public final void idAssign() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "idAssign");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(109, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:109:9: ( identifier '=' expr ';' )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:109:11: identifier '=' expr ';'
			{
			dbg.location(109,11);
			pushFollow(FOLLOW_identifier_in_idAssign317);
			identifier();
			state._fsp--;
			if (state.failed) return;dbg.location(109,22);
			match(input,27,FOLLOW_27_in_idAssign319); if (state.failed) return;dbg.location(109,26);
			pushFollow(FOLLOW_expr_in_idAssign321);
			expr();
			state._fsp--;
			if (state.failed) return;dbg.location(109,31);
			match(input,25,FOLLOW_25_in_idAssign323); if (state.failed) return;
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
		dbg.location(110, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "idAssign");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "idAssign"



	// $ANTLR start "arrayAssign"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:112:1: arrayAssign : identifier '[' expr ']' '=' expr ';' ;
	public final void arrayAssign() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "arrayAssign");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(112, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:112:12: ( identifier '[' expr ']' '=' expr ';' )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:112:14: identifier '[' expr ']' '=' expr ';'
			{
			dbg.location(112,14);
			pushFollow(FOLLOW_identifier_in_arrayAssign332);
			identifier();
			state._fsp--;
			if (state.failed) return;dbg.location(112,25);
			match(input,29,FOLLOW_29_in_arrayAssign334); if (state.failed) return;dbg.location(112,29);
			pushFollow(FOLLOW_expr_in_arrayAssign336);
			expr();
			state._fsp--;
			if (state.failed) return;dbg.location(112,33);
			match(input,30,FOLLOW_30_in_arrayAssign337); if (state.failed) return;dbg.location(112,37);
			match(input,27,FOLLOW_27_in_arrayAssign339); if (state.failed) return;dbg.location(112,41);
			pushFollow(FOLLOW_expr_in_arrayAssign341);
			expr();
			state._fsp--;
			if (state.failed) return;dbg.location(112,46);
			match(input,25,FOLLOW_25_in_arrayAssign343); if (state.failed) return;
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
		dbg.location(113, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "arrayAssign");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "arrayAssign"



	// $ANTLR start "ifElseBlock"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:115:1: ifElseBlock : IF '(' expr ')' block ELSE block ;
	public final void ifElseBlock() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ifElseBlock");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(115, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:115:12: ( IF '(' expr ')' block ELSE block )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:115:14: IF '(' expr ')' block ELSE block
			{
			dbg.location(115,14);
			match(input,IF,FOLLOW_IF_in_ifElseBlock352); if (state.failed) return;dbg.location(115,16);
			match(input,19,FOLLOW_19_in_ifElseBlock353); if (state.failed) return;dbg.location(115,19);
			pushFollow(FOLLOW_expr_in_ifElseBlock354);
			expr();
			state._fsp--;
			if (state.failed) return;dbg.location(115,23);
			match(input,20,FOLLOW_20_in_ifElseBlock355); if (state.failed) return;dbg.location(115,27);
			pushFollow(FOLLOW_block_in_ifElseBlock357);
			block();
			state._fsp--;
			if (state.failed) return;dbg.location(115,33);
			match(input,ELSE,FOLLOW_ELSE_in_ifElseBlock359); if (state.failed) return;dbg.location(115,38);
			pushFollow(FOLLOW_block_in_ifElseBlock361);
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
		dbg.location(116, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ifElseBlock");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ifElseBlock"



	// $ANTLR start "ifBlock"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:118:1: ifBlock : IF '(' expr ')' block ;
	public final void ifBlock() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ifBlock");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(118, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:118:8: ( IF '(' expr ')' block )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:118:10: IF '(' expr ')' block
			{
			dbg.location(118,10);
			match(input,IF,FOLLOW_IF_in_ifBlock370); if (state.failed) return;dbg.location(118,12);
			match(input,19,FOLLOW_19_in_ifBlock371); if (state.failed) return;dbg.location(118,15);
			pushFollow(FOLLOW_expr_in_ifBlock372);
			expr();
			state._fsp--;
			if (state.failed) return;dbg.location(118,19);
			match(input,20,FOLLOW_20_in_ifBlock373); if (state.failed) return;dbg.location(118,23);
			pushFollow(FOLLOW_block_in_ifBlock375);
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
		dbg.location(119, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ifBlock");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ifBlock"



	// $ANTLR start "block"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:121:1: block : '{' ( statement )* '}' ;
	public final void block() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "block");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(121, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:121:6: ( '{' ( statement )* '}' )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:121:8: '{' ( statement )* '}'
			{
			dbg.location(121,8);
			match(input,31,FOLLOW_31_in_block384); if (state.failed) return;dbg.location(121,12);
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:121:12: ( statement )*
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

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:121:12: statement
					{
					dbg.location(121,12);
					pushFollow(FOLLOW_statement_in_block386);
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
			dbg.location(121,23);
			match(input,32,FOLLOW_32_in_block389); if (state.failed) return;
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
			dbg.exitRule(getGrammarFileName(), "block");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "block"



	// $ANTLR start "expr"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:124:1: expr : compareExpr ;
	public final void expr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "expr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(124, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:124:5: ( compareExpr )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:124:7: compareExpr
			{
			dbg.location(124,7);
			pushFollow(FOLLOW_compareExpr_in_expr398);
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
		dbg.location(125, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "expr"



	// $ANTLR start "compareExpr"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:127:1: compareExpr : lessExpr ( '==' lessExpr )* ;
	public final void compareExpr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "compareExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(127, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:127:12: ( lessExpr ( '==' lessExpr )* )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:127:14: lessExpr ( '==' lessExpr )*
			{
			dbg.location(127,14);
			pushFollow(FOLLOW_lessExpr_in_compareExpr407);
			lessExpr();
			state._fsp--;
			if (state.failed) return;dbg.location(127,23);
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:127:23: ( '==' lessExpr )*
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

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:127:24: '==' lessExpr
					{
					dbg.location(127,24);
					match(input,28,FOLLOW_28_in_compareExpr410); if (state.failed) return;dbg.location(127,29);
					pushFollow(FOLLOW_lessExpr_in_compareExpr412);
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
		dbg.location(128, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "compareExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "compareExpr"



	// $ANTLR start "lessExpr"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:130:1: lessExpr : plmiExpr ( '<' plmiExpr )* ;
	public final void lessExpr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "lessExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(130, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:130:9: ( plmiExpr ( '<' plmiExpr )* )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:130:11: plmiExpr ( '<' plmiExpr )*
			{
			dbg.location(130,11);
			pushFollow(FOLLOW_plmiExpr_in_lessExpr423);
			plmiExpr();
			state._fsp--;
			if (state.failed) return;dbg.location(130,20);
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:130:20: ( '<' plmiExpr )*
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

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:130:21: '<' plmiExpr
					{
					dbg.location(130,21);
					match(input,26,FOLLOW_26_in_lessExpr426); if (state.failed) return;dbg.location(130,25);
					pushFollow(FOLLOW_plmiExpr_in_lessExpr428);
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
		dbg.location(131, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "lessExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "lessExpr"



	// $ANTLR start "plmiExpr"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:133:1: plmiExpr : multExpr ( ( '+' | '-' ) multExpr )* ;
	public final void plmiExpr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "plmiExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(133, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:133:9: ( multExpr ( ( '+' | '-' ) multExpr )* )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:133:11: multExpr ( ( '+' | '-' ) multExpr )*
			{
			dbg.location(133,11);
			pushFollow(FOLLOW_multExpr_in_plmiExpr439);
			multExpr();
			state._fsp--;
			if (state.failed) return;dbg.location(133,20);
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:133:20: ( ( '+' | '-' ) multExpr )*
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

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:133:21: ( '+' | '-' ) multExpr
					{
					dbg.location(133,21);
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
					}dbg.location(133,31);
					pushFollow(FOLLOW_multExpr_in_plmiExpr448);
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
		dbg.location(134, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "plmiExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "plmiExpr"



	// $ANTLR start "multExpr"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:136:1: multExpr : atom ( '*' atom )* ;
	public final void multExpr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "multExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(136, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:136:9: ( atom ( '*' atom )* )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:136:11: atom ( '*' atom )*
			{
			dbg.location(136,11);
			pushFollow(FOLLOW_atom_in_multExpr459);
			atom();
			state._fsp--;
			if (state.failed) return;dbg.location(136,16);
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:136:16: ( '*' atom )*
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

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:136:17: '*' atom
					{
					dbg.location(136,17);
					match(input,21,FOLLOW_21_in_multExpr462); if (state.failed) return;dbg.location(136,21);
					pushFollow(FOLLOW_atom_in_multExpr464);
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
		dbg.location(137, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "multExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "multExpr"



	// $ANTLR start "atom"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:139:1: atom : ( literal | identifier | functionCall | arrayRef | parenExpr );
	public final void atom() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "atom");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(139, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:139:5: ( literal | identifier | functionCall | arrayRef | parenExpr )
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

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:139:7: literal
					{
					dbg.location(139,7);
					pushFollow(FOLLOW_literal_in_atom475);
					literal();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:140:2: identifier
					{
					dbg.location(140,2);
					pushFollow(FOLLOW_identifier_in_atom480);
					identifier();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:141:2: functionCall
					{
					dbg.location(141,2);
					pushFollow(FOLLOW_functionCall_in_atom485);
					functionCall();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:142:2: arrayRef
					{
					dbg.location(142,2);
					pushFollow(FOLLOW_arrayRef_in_atom490);
					arrayRef();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:143:2: parenExpr
					{
					dbg.location(143,2);
					pushFollow(FOLLOW_parenExpr_in_atom496);
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
		dbg.location(144, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "atom");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "atom"



	// $ANTLR start "functionCall"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:146:1: functionCall : identifier '(' exprList ')' ;
	public final void functionCall() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "functionCall");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(146, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:146:13: ( identifier '(' exprList ')' )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:146:15: identifier '(' exprList ')'
			{
			dbg.location(146,15);
			pushFollow(FOLLOW_identifier_in_functionCall505);
			identifier();
			state._fsp--;
			if (state.failed) return;dbg.location(146,25);
			match(input,19,FOLLOW_19_in_functionCall506); if (state.failed) return;dbg.location(146,29);
			pushFollow(FOLLOW_exprList_in_functionCall508);
			exprList();
			state._fsp--;
			if (state.failed) return;dbg.location(146,38);
			match(input,20,FOLLOW_20_in_functionCall510); if (state.failed) return;
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
		dbg.location(147, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "functionCall");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "functionCall"



	// $ANTLR start "arrayRef"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:149:1: arrayRef : identifier '[' expr ']' ;
	public final void arrayRef() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "arrayRef");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(149, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:149:9: ( identifier '[' expr ']' )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:149:11: identifier '[' expr ']'
			{
			dbg.location(149,11);
			pushFollow(FOLLOW_identifier_in_arrayRef519);
			identifier();
			state._fsp--;
			if (state.failed) return;dbg.location(149,21);
			match(input,29,FOLLOW_29_in_arrayRef520); if (state.failed) return;dbg.location(149,24);
			pushFollow(FOLLOW_expr_in_arrayRef521);
			expr();
			state._fsp--;
			if (state.failed) return;dbg.location(149,28);
			match(input,30,FOLLOW_30_in_arrayRef522); if (state.failed) return;
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
		dbg.location(150, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "arrayRef");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "arrayRef"



	// $ANTLR start "parenExpr"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:152:1: parenExpr : '(' expr ')' ;
	public final void parenExpr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "parenExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(152, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:152:10: ( '(' expr ')' )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:152:12: '(' expr ')'
			{
			dbg.location(152,12);
			match(input,19,FOLLOW_19_in_parenExpr532); if (state.failed) return;dbg.location(152,16);
			pushFollow(FOLLOW_expr_in_parenExpr534);
			expr();
			state._fsp--;
			if (state.failed) return;dbg.location(152,21);
			match(input,20,FOLLOW_20_in_parenExpr536); if (state.failed) return;
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
			dbg.exitRule(getGrammarFileName(), "parenExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "parenExpr"



	// $ANTLR start "exprList"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:155:1: exprList : expr ( exprMore )* ;
	public final void exprList() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "exprList");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(155, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:155:9: ( expr ( exprMore )* )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:155:11: expr ( exprMore )*
			{
			dbg.location(155,11);
			pushFollow(FOLLOW_expr_in_exprList545);
			expr();
			state._fsp--;
			if (state.failed) return;dbg.location(155,16);
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:155:16: ( exprMore )*
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

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:155:16: exprMore
					{
					dbg.location(155,16);
					pushFollow(FOLLOW_exprMore_in_exprList547);
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
		dbg.location(156, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "exprList");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "exprList"



	// $ANTLR start "exprMore"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:158:1: exprMore : ',' expr ;
	public final void exprMore() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "exprMore");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(158, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:158:9: ( ',' expr )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:158:11: ',' expr
			{
			dbg.location(158,11);
			match(input,23,FOLLOW_23_in_exprMore557); if (state.failed) return;dbg.location(158,15);
			pushFollow(FOLLOW_expr_in_exprMore559);
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
		dbg.location(159, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "exprMore");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "exprMore"



	// $ANTLR start "literal"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:161:1: literal : ( stringconstant | integerconstant | characterconstant | floatconstant | bool );
	public final void literal() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "literal");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(161, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:161:8: ( stringconstant | integerconstant | characterconstant | floatconstant | bool )
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

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:161:10: stringconstant
					{
					dbg.location(161,10);
					pushFollow(FOLLOW_stringconstant_in_literal569);
					stringconstant();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:162:2: integerconstant
					{
					dbg.location(162,2);
					pushFollow(FOLLOW_integerconstant_in_literal574);
					integerconstant();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:163:2: characterconstant
					{
					dbg.location(163,2);
					pushFollow(FOLLOW_characterconstant_in_literal579);
					characterconstant();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:164:2: floatconstant
					{
					dbg.location(164,2);
					pushFollow(FOLLOW_floatconstant_in_literal584);
					floatconstant();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:165:2: bool
					{
					dbg.location(165,2);
					pushFollow(FOLLOW_bool_in_literal589);
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
		dbg.location(166, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "literal");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "literal"



	// $ANTLR start "stringconstant"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:168:1: stringconstant : STRINGCONSTANT ;
	public final void stringconstant() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "stringconstant");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(168, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:168:15: ( STRINGCONSTANT )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:168:17: STRINGCONSTANT
			{
			dbg.location(168,17);
			match(input,STRINGCONSTANT,FOLLOW_STRINGCONSTANT_in_stringconstant598); if (state.failed) return;
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
		dbg.location(169, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "stringconstant");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "stringconstant"



	// $ANTLR start "floatconstant"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:171:1: floatconstant : FLOATCONSTANT ;
	public final void floatconstant() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "floatconstant");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(171, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:171:14: ( FLOATCONSTANT )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:171:16: FLOATCONSTANT
			{
			dbg.location(171,16);
			match(input,FLOATCONSTANT,FOLLOW_FLOATCONSTANT_in_floatconstant607); if (state.failed) return;
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
		dbg.location(172, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "floatconstant");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "floatconstant"



	// $ANTLR start "characterconstant"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:174:1: characterconstant : CHARACTERCONSTANT ;
	public final void characterconstant() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "characterconstant");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(174, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:174:18: ( CHARACTERCONSTANT )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:174:20: CHARACTERCONSTANT
			{
			dbg.location(174,20);
			match(input,CHARACTERCONSTANT,FOLLOW_CHARACTERCONSTANT_in_characterconstant616); if (state.failed) return;
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
			dbg.exitRule(getGrammarFileName(), "characterconstant");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "characterconstant"



	// $ANTLR start "integerconstant"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:177:1: integerconstant : INTEGERCONSTANT ;
	public final void integerconstant() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "integerconstant");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(177, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:177:16: ( INTEGERCONSTANT )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:177:18: INTEGERCONSTANT
			{
			dbg.location(177,18);
			match(input,INTEGERCONSTANT,FOLLOW_INTEGERCONSTANT_in_integerconstant625); if (state.failed) return;
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
		dbg.location(178, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "integerconstant");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "integerconstant"



	// $ANTLR start "bool"
	// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:180:1: bool : BOOL ;
	public final void bool() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "bool");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(180, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:180:5: ( BOOL )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:180:7: BOOL
			{
			dbg.location(180,7);
			match(input,BOOL,FOLLOW_BOOL_in_bool634); if (state.failed) return;
			}

		}

		        catch (RecognitionException ex) {
		                reportError(ex);
		                throw ex;
		        }

		finally {
			// do for sure before leaving
		}
		dbg.location(181, 1);

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
		// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:80:2: ( exprColon )
		dbg.enterAlt(1);

		// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:80:2: exprColon
		{
		dbg.location(80,2);
		pushFollow(FOLLOW_exprColon_in_synpred8_ulNoActions193);
		exprColon();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred8_ulNoActions

	// $ANTLR start synpred9_ulNoActions
	public final void synpred9_ulNoActions_fragment() throws RecognitionException {
		// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:81:2: ( idAssign )
		dbg.enterAlt(1);

		// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:81:2: idAssign
		{
		dbg.location(81,2);
		pushFollow(FOLLOW_idAssign_in_synpred9_ulNoActions198);
		idAssign();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred9_ulNoActions

	// $ANTLR start synpred10_ulNoActions
	public final void synpred10_ulNoActions_fragment() throws RecognitionException {
		// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:82:2: ( arrayAssign )
		dbg.enterAlt(1);

		// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:82:2: arrayAssign
		{
		dbg.location(82,2);
		pushFollow(FOLLOW_arrayAssign_in_synpred10_ulNoActions203);
		arrayAssign();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred10_ulNoActions

	// $ANTLR start synpred11_ulNoActions
	public final void synpred11_ulNoActions_fragment() throws RecognitionException {
		// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:83:2: ( ifElseBlock )
		dbg.enterAlt(1);

		// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:83:2: ifElseBlock
		{
		dbg.location(83,2);
		pushFollow(FOLLOW_ifElseBlock_in_synpred11_ulNoActions208);
		ifElseBlock();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred11_ulNoActions

	// $ANTLR start synpred12_ulNoActions
	public final void synpred12_ulNoActions_fragment() throws RecognitionException {
		// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:84:2: ( ifBlock )
		dbg.enterAlt(1);

		// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:84:2: ifBlock
		{
		dbg.location(84,2);
		pushFollow(FOLLOW_ifBlock_in_synpred12_ulNoActions213);
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



	public static final BitSet FOLLOW_function_in_program42 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_EOF_in_program45 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionDecl_in_function54 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_functionBody_in_function56 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compoundType_in_functionDecl65 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_identifier_in_functionDecl67 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_functionDecl69 = new BitSet(new long[]{0x0000000000110000L});
	public static final BitSet FOLLOW_formalParameters_in_functionDecl71 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_functionDecl74 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compoundType_in_formalParameters83 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_identifier_in_formalParameters85 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_moreFormals_in_formalParameters87 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_23_in_moreFormals97 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_compoundType_in_moreFormals99 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_identifier_in_moreFormals101 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_functionBody110 = new BitSet(new long[]{0x00000001020BFF30L});
	public static final BitSet FOLLOW_varDecl_in_functionBody112 = new BitSet(new long[]{0x00000001020BFF30L});
	public static final BitSet FOLLOW_statement_in_functionBody116 = new BitSet(new long[]{0x00000001020AFF30L});
	public static final BitSet FOLLOW_32_in_functionBody119 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compoundType_in_varDecl128 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_identifier_in_varDecl130 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_varDecl132 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_compoundType141 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayDecl_in_compoundType148 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_arrayDecl157 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_arrayDecl158 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_integerconstant_in_arrayDecl159 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_arrayDecl160 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_identifier170 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_in_type179 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_semiColon_in_statement188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprColon_in_statement193 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_idAssign_in_statement198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayAssign_in_statement203 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifElseBlock_in_statement208 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifBlock_in_statement213 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileBlock_in_statement218 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_printlnStmt_in_statement223 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_printStmt_in_statement228 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_returnStmt_in_statement233 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_whileBlock242 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_whileBlock243 = new BitSet(new long[]{0x0000000000088B30L});
	public static final BitSet FOLLOW_expr_in_whileBlock245 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_whileBlock246 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_block_in_whileBlock248 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINTLN_in_printlnStmt257 = new BitSet(new long[]{0x0000000000088B30L});
	public static final BitSet FOLLOW_expr_in_printlnStmt259 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_printlnStmt261 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_printStmt270 = new BitSet(new long[]{0x0000000000088B30L});
	public static final BitSet FOLLOW_expr_in_printStmt272 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_printStmt274 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURN_in_returnStmt283 = new BitSet(new long[]{0x0000000002088B30L});
	public static final BitSet FOLLOW_expr_in_returnStmt285 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_returnStmt288 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_semiColon297 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_exprColon306 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_exprColon308 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_idAssign317 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_idAssign319 = new BitSet(new long[]{0x0000000000088B30L});
	public static final BitSet FOLLOW_expr_in_idAssign321 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_idAssign323 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_arrayAssign332 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_arrayAssign334 = new BitSet(new long[]{0x0000000000088B30L});
	public static final BitSet FOLLOW_expr_in_arrayAssign336 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_arrayAssign337 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_arrayAssign339 = new BitSet(new long[]{0x0000000000088B30L});
	public static final BitSet FOLLOW_expr_in_arrayAssign341 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_arrayAssign343 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifElseBlock352 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_ifElseBlock353 = new BitSet(new long[]{0x0000000000088B30L});
	public static final BitSet FOLLOW_expr_in_ifElseBlock354 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_ifElseBlock355 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_block_in_ifElseBlock357 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ELSE_in_ifElseBlock359 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_block_in_ifElseBlock361 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifBlock370 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_ifBlock371 = new BitSet(new long[]{0x0000000000088B30L});
	public static final BitSet FOLLOW_expr_in_ifBlock372 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_ifBlock373 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_block_in_ifBlock375 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_block384 = new BitSet(new long[]{0x00000001020AFF30L});
	public static final BitSet FOLLOW_statement_in_block386 = new BitSet(new long[]{0x00000001020AFF30L});
	public static final BitSet FOLLOW_32_in_block389 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compareExpr_in_expr398 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lessExpr_in_compareExpr407 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_28_in_compareExpr410 = new BitSet(new long[]{0x0000000000088B30L});
	public static final BitSet FOLLOW_lessExpr_in_compareExpr412 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_plmiExpr_in_lessExpr423 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_26_in_lessExpr426 = new BitSet(new long[]{0x0000000000088B30L});
	public static final BitSet FOLLOW_plmiExpr_in_lessExpr428 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_multExpr_in_plmiExpr439 = new BitSet(new long[]{0x0000000001400002L});
	public static final BitSet FOLLOW_set_in_plmiExpr442 = new BitSet(new long[]{0x0000000000088B30L});
	public static final BitSet FOLLOW_multExpr_in_plmiExpr448 = new BitSet(new long[]{0x0000000001400002L});
	public static final BitSet FOLLOW_atom_in_multExpr459 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_21_in_multExpr462 = new BitSet(new long[]{0x0000000000088B30L});
	public static final BitSet FOLLOW_atom_in_multExpr464 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_literal_in_atom475 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_atom480 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_atom485 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayRef_in_atom490 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parenExpr_in_atom496 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_functionCall505 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_functionCall506 = new BitSet(new long[]{0x0000000000088B30L});
	public static final BitSet FOLLOW_exprList_in_functionCall508 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_functionCall510 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_arrayRef519 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_arrayRef520 = new BitSet(new long[]{0x0000000000088B30L});
	public static final BitSet FOLLOW_expr_in_arrayRef521 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_arrayRef522 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_parenExpr532 = new BitSet(new long[]{0x0000000000088B30L});
	public static final BitSet FOLLOW_expr_in_parenExpr534 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_parenExpr536 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_exprList545 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_exprMore_in_exprList547 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_23_in_exprMore557 = new BitSet(new long[]{0x0000000000088B30L});
	public static final BitSet FOLLOW_expr_in_exprMore559 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stringconstant_in_literal569 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_integerconstant_in_literal574 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_characterconstant_in_literal579 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_floatconstant_in_literal584 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bool_in_literal589 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRINGCONSTANT_in_stringconstant598 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOATCONSTANT_in_floatconstant607 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTERCONSTANT_in_characterconstant616 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGERCONSTANT_in_integerconstant625 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOL_in_bool634 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprColon_in_synpred8_ulNoActions193 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_idAssign_in_synpred9_ulNoActions198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayAssign_in_synpred10_ulNoActions203 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifElseBlock_in_synpred11_ulNoActions208 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifBlock_in_synpred12_ulNoActions213 = new BitSet(new long[]{0x0000000000000002L});
}
