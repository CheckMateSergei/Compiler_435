// $ANTLR 3.5.2 ./src/ulNoActions.g 2020-01-16 16:48:40

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
		"ELSE", "ID", "IF", "INTEGERCONSTANT", "OP", "PRINT", "PRINTLN", "RETURN", 
		"TYPE", "WHILE", "WS", "'\"'", "'('", "')'", "'*'", "'+'", "','", "'-'", 
		"'.'", "';'", "'='", "'['", "']'", "'{'", "'}'"
	};
	public static final int EOF=-1;
	public static final int T__18=18;
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
	public static final int BOOL=4;
	public static final int CHARACTERCONSTANT=5;
	public static final int COMMENT=6;
	public static final int ELSE=7;
	public static final int ID=8;
	public static final int IF=9;
	public static final int INTEGERCONSTANT=10;
	public static final int OP=11;
	public static final int PRINT=12;
	public static final int PRINTLN=13;
	public static final int RETURN=14;
	public static final int TYPE=15;
	public static final int WHILE=16;
	public static final int WS=17;

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
	// ./src/ulNoActions.g:45:1: program : ( function )+ ;
	public final void program() throws RecognitionException {
		try {
			// ./src/ulNoActions.g:45:9: ( ( function )+ )
			// ./src/ulNoActions.g:45:11: ( function )+
			{
			// ./src/ulNoActions.g:45:11: ( function )+
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
					// ./src/ulNoActions.g:45:11: function
					{
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
					throw eee;
				}
				cnt1++;
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
	// $ANTLR end "program"



	// $ANTLR start "function"
	// ./src/ulNoActions.g:48:1: function : functionDecl functionBody ;
	public final void function() throws RecognitionException {
		try {
			// ./src/ulNoActions.g:48:9: ( functionDecl functionBody )
			// ./src/ulNoActions.g:48:11: functionDecl functionBody
			{
			pushFollow(FOLLOW_functionDecl_in_function53);
			functionDecl();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_functionBody_in_function55);
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
	}
	// $ANTLR end "function"



	// $ANTLR start "functionDecl"
	// ./src/ulNoActions.g:51:1: functionDecl : compoundType identifier '(' ( formalParameters )? ')' ;
	public final void functionDecl() throws RecognitionException {
		try {
			// ./src/ulNoActions.g:51:13: ( compoundType identifier '(' ( formalParameters )? ')' )
			// ./src/ulNoActions.g:51:15: compoundType identifier '(' ( formalParameters )? ')'
			{
			pushFollow(FOLLOW_compoundType_in_functionDecl64);
			compoundType();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_identifier_in_functionDecl66);
			identifier();
			state._fsp--;
			if (state.failed) return;
			match(input,19,FOLLOW_19_in_functionDecl68); if (state.failed) return;
			// ./src/ulNoActions.g:51:43: ( formalParameters )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==TYPE) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// ./src/ulNoActions.g:51:43: formalParameters
					{
					pushFollow(FOLLOW_formalParameters_in_functionDecl70);
					formalParameters();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,20,FOLLOW_20_in_functionDecl73); if (state.failed) return;
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
	// $ANTLR end "functionDecl"



	// $ANTLR start "formalParameters"
	// ./src/ulNoActions.g:54:1: formalParameters : compoundType identifier ( moreFormals )* ;
	public final void formalParameters() throws RecognitionException {
		try {
			// ./src/ulNoActions.g:54:17: ( compoundType identifier ( moreFormals )* )
			// ./src/ulNoActions.g:54:19: compoundType identifier ( moreFormals )*
			{
			pushFollow(FOLLOW_compoundType_in_formalParameters82);
			compoundType();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_identifier_in_formalParameters84);
			identifier();
			state._fsp--;
			if (state.failed) return;
			// ./src/ulNoActions.g:54:43: ( moreFormals )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==23) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// ./src/ulNoActions.g:54:43: moreFormals
					{
					pushFollow(FOLLOW_moreFormals_in_formalParameters86);
					moreFormals();
					state._fsp--;
					if (state.failed) return;
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
	}
	// $ANTLR end "formalParameters"



	// $ANTLR start "moreFormals"
	// ./src/ulNoActions.g:57:1: moreFormals : ',' compoundType identifier ;
	public final void moreFormals() throws RecognitionException {
		try {
			// ./src/ulNoActions.g:57:12: ( ',' compoundType identifier )
			// ./src/ulNoActions.g:57:14: ',' compoundType identifier
			{
			match(input,23,FOLLOW_23_in_moreFormals96); if (state.failed) return;
			pushFollow(FOLLOW_compoundType_in_moreFormals98);
			compoundType();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_identifier_in_moreFormals100);
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
	}
	// $ANTLR end "moreFormals"



	// $ANTLR start "functionBody"
	// ./src/ulNoActions.g:60:1: functionBody : '{' ( varDecl | statement )* '}' ;
	public final void functionBody() throws RecognitionException {
		try {
			// ./src/ulNoActions.g:60:13: ( '{' ( varDecl | statement )* '}' )
			// ./src/ulNoActions.g:60:15: '{' ( varDecl | statement )* '}'
			{
			match(input,30,FOLLOW_30_in_functionBody109); if (state.failed) return;
			// ./src/ulNoActions.g:60:19: ( varDecl | statement )*
			loop4:
			while (true) {
				int alt4=3;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==TYPE) ) {
					alt4=1;
				}
				else if ( (LA4_0==ID||LA4_0==INTEGERCONSTANT||LA4_0==19||LA4_0==26) ) {
					alt4=2;
				}

				switch (alt4) {
				case 1 :
					// ./src/ulNoActions.g:60:20: varDecl
					{
					pushFollow(FOLLOW_varDecl_in_functionBody112);
					varDecl();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// ./src/ulNoActions.g:60:30: statement
					{
					pushFollow(FOLLOW_statement_in_functionBody116);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop4;
				}
			}

			match(input,31,FOLLOW_31_in_functionBody120); if (state.failed) return;
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
	// ./src/ulNoActions.g:63:1: varDecl : compoundType identifier ';' ;
	public final void varDecl() throws RecognitionException {
		try {
			// ./src/ulNoActions.g:63:8: ( compoundType identifier ';' )
			// ./src/ulNoActions.g:63:10: compoundType identifier ';'
			{
			pushFollow(FOLLOW_compoundType_in_varDecl129);
			compoundType();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_identifier_in_varDecl131);
			identifier();
			state._fsp--;
			if (state.failed) return;
			match(input,26,FOLLOW_26_in_varDecl133); if (state.failed) return;
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
	// ./src/ulNoActions.g:66:1: compoundType : ( type | type '[' INTEGERCONSTANT ']' );
	public final void compoundType() throws RecognitionException {
		try {
			// ./src/ulNoActions.g:66:13: ( type | type '[' INTEGERCONSTANT ']' )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==TYPE) ) {
				int LA5_1 = input.LA(2);
				if ( (LA5_1==ID) ) {
					alt5=1;
				}
				else if ( (LA5_1==28) ) {
					alt5=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 5, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// ./src/ulNoActions.g:66:15: type
					{
					pushFollow(FOLLOW_type_in_compoundType142);
					type();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// ./src/ulNoActions.g:66:22: type '[' INTEGERCONSTANT ']'
					{
					pushFollow(FOLLOW_type_in_compoundType146);
					type();
					state._fsp--;
					if (state.failed) return;
					match(input,28,FOLLOW_28_in_compoundType148); if (state.failed) return;
					match(input,INTEGERCONSTANT,FOLLOW_INTEGERCONSTANT_in_compoundType150); if (state.failed) return;
					match(input,29,FOLLOW_29_in_compoundType152); if (state.failed) return;
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



	// $ANTLR start "identifier"
	// ./src/ulNoActions.g:69:1: identifier : ID ;
	public final void identifier() throws RecognitionException {
		try {
			// ./src/ulNoActions.g:69:12: ( ID )
			// ./src/ulNoActions.g:69:14: ID
			{
			match(input,ID,FOLLOW_ID_in_identifier163); if (state.failed) return;
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
	// ./src/ulNoActions.g:72:1: type : TYPE ;
	public final void type() throws RecognitionException {
		try {
			// ./src/ulNoActions.g:72:5: ( TYPE )
			// ./src/ulNoActions.g:72:7: TYPE
			{
			match(input,TYPE,FOLLOW_TYPE_in_type172); if (state.failed) return;
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
	// ./src/ulNoActions.g:75:1: statement : ( ( expr )? ';' | identifier '=' expr ';' | identifier '[' expr ']' '=' expr ';' );
	public final void statement() throws RecognitionException {
		try {
			// ./src/ulNoActions.g:75:10: ( ( expr )? ';' | identifier '=' expr ';' | identifier '[' expr ']' '=' expr ';' )
			int alt7=3;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==INTEGERCONSTANT||LA7_0==19||LA7_0==26) ) {
				alt7=1;
			}
			else if ( (LA7_0==ID) ) {
				int LA7_2 = input.LA(2);
				if ( (synpred8_ulNoActions()) ) {
					alt7=1;
				}
				else if ( (synpred9_ulNoActions()) ) {
					alt7=2;
				}
				else if ( (true) ) {
					alt7=3;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// ./src/ulNoActions.g:75:11: ( expr )? ';'
					{
					// ./src/ulNoActions.g:75:11: ( expr )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==ID||LA6_0==INTEGERCONSTANT||LA6_0==19) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// ./src/ulNoActions.g:75:13: expr
							{
							pushFollow(FOLLOW_expr_in_statement182);
							expr();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,26,FOLLOW_26_in_statement187); if (state.failed) return;
					}
					break;
				case 2 :
					// ./src/ulNoActions.g:76:2: identifier '=' expr ';'
					{
					pushFollow(FOLLOW_identifier_in_statement192);
					identifier();
					state._fsp--;
					if (state.failed) return;
					match(input,27,FOLLOW_27_in_statement194); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_statement196);
					expr();
					state._fsp--;
					if (state.failed) return;
					match(input,26,FOLLOW_26_in_statement198); if (state.failed) return;
					}
					break;
				case 3 :
					// ./src/ulNoActions.g:77:2: identifier '[' expr ']' '=' expr ';'
					{
					pushFollow(FOLLOW_identifier_in_statement203);
					identifier();
					state._fsp--;
					if (state.failed) return;
					match(input,28,FOLLOW_28_in_statement204); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_statement205);
					expr();
					state._fsp--;
					if (state.failed) return;
					match(input,29,FOLLOW_29_in_statement206); if (state.failed) return;
					match(input,27,FOLLOW_27_in_statement208); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_statement210);
					expr();
					state._fsp--;
					if (state.failed) return;
					match(input,26,FOLLOW_26_in_statement212); if (state.failed) return;
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



	// $ANTLR start "block"
	// ./src/ulNoActions.g:80:1: block : '{' ( statement )* '}' ;
	public final void block() throws RecognitionException {
		try {
			// ./src/ulNoActions.g:80:6: ( '{' ( statement )* '}' )
			// ./src/ulNoActions.g:80:8: '{' ( statement )* '}'
			{
			match(input,30,FOLLOW_30_in_block221); if (state.failed) return;
			// ./src/ulNoActions.g:80:12: ( statement )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==ID||LA8_0==INTEGERCONSTANT||LA8_0==19||LA8_0==26) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// ./src/ulNoActions.g:80:12: statement
					{
					pushFollow(FOLLOW_statement_in_block223);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop8;
				}
			}

			match(input,31,FOLLOW_31_in_block226); if (state.failed) return;
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
	// ./src/ulNoActions.g:84:1: expr : plmiExpr ;
	public final void expr() throws RecognitionException {
		try {
			// ./src/ulNoActions.g:84:5: ( plmiExpr )
			// ./src/ulNoActions.g:84:7: plmiExpr
			{
			pushFollow(FOLLOW_plmiExpr_in_expr236);
			plmiExpr();
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



	// $ANTLR start "plmiExpr"
	// ./src/ulNoActions.g:93:1: plmiExpr : multExpr ( ( '+' | '-' ) multExpr )* ;
	public final void plmiExpr() throws RecognitionException {
		try {
			// ./src/ulNoActions.g:93:9: ( multExpr ( ( '+' | '-' ) multExpr )* )
			// ./src/ulNoActions.g:93:11: multExpr ( ( '+' | '-' ) multExpr )*
			{
			pushFollow(FOLLOW_multExpr_in_plmiExpr251);
			multExpr();
			state._fsp--;
			if (state.failed) return;
			// ./src/ulNoActions.g:93:20: ( ( '+' | '-' ) multExpr )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==22||LA9_0==24) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// ./src/ulNoActions.g:93:21: ( '+' | '-' ) multExpr
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
					pushFollow(FOLLOW_multExpr_in_plmiExpr260);
					multExpr();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop9;
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
	// ./src/ulNoActions.g:96:1: multExpr : atom ( '*' atom )* ;
	public final void multExpr() throws RecognitionException {
		try {
			// ./src/ulNoActions.g:96:9: ( atom ( '*' atom )* )
			// ./src/ulNoActions.g:96:11: atom ( '*' atom )*
			{
			pushFollow(FOLLOW_atom_in_multExpr271);
			atom();
			state._fsp--;
			if (state.failed) return;
			// ./src/ulNoActions.g:96:16: ( '*' atom )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==21) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// ./src/ulNoActions.g:96:17: '*' atom
					{
					match(input,21,FOLLOW_21_in_multExpr274); if (state.failed) return;
					pushFollow(FOLLOW_atom_in_multExpr276);
					atom();
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
	// $ANTLR end "multExpr"



	// $ANTLR start "atom"
	// ./src/ulNoActions.g:99:1: atom : ( INTEGERCONSTANT | identifier | identifier '(' expr ')' | identifier '[' exprList ']' | '(' expr ')' );
	public final void atom() throws RecognitionException {
		try {
			// ./src/ulNoActions.g:99:5: ( INTEGERCONSTANT | identifier | identifier '(' expr ')' | identifier '[' exprList ']' | '(' expr ')' )
			int alt11=5;
			switch ( input.LA(1) ) {
			case INTEGERCONSTANT:
				{
				alt11=1;
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
				case 26:
				case 29:
					{
					alt11=2;
					}
					break;
				case 19:
					{
					alt11=3;
					}
					break;
				case 28:
					{
					alt11=4;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 11, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case 19:
				{
				alt11=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// ./src/ulNoActions.g:99:7: INTEGERCONSTANT
					{
					match(input,INTEGERCONSTANT,FOLLOW_INTEGERCONSTANT_in_atom287); if (state.failed) return;
					}
					break;
				case 2 :
					// ./src/ulNoActions.g:100:2: identifier
					{
					pushFollow(FOLLOW_identifier_in_atom292);
					identifier();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// ./src/ulNoActions.g:101:2: identifier '(' expr ')'
					{
					pushFollow(FOLLOW_identifier_in_atom297);
					identifier();
					state._fsp--;
					if (state.failed) return;
					match(input,19,FOLLOW_19_in_atom298); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_atom299);
					expr();
					state._fsp--;
					if (state.failed) return;
					match(input,20,FOLLOW_20_in_atom300); if (state.failed) return;
					}
					break;
				case 4 :
					// ./src/ulNoActions.g:102:2: identifier '[' exprList ']'
					{
					pushFollow(FOLLOW_identifier_in_atom305);
					identifier();
					state._fsp--;
					if (state.failed) return;
					match(input,28,FOLLOW_28_in_atom306); if (state.failed) return;
					pushFollow(FOLLOW_exprList_in_atom307);
					exprList();
					state._fsp--;
					if (state.failed) return;
					match(input,29,FOLLOW_29_in_atom308); if (state.failed) return;
					}
					break;
				case 5 :
					// ./src/ulNoActions.g:103:2: '(' expr ')'
					{
					match(input,19,FOLLOW_19_in_atom313); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_atom314);
					expr();
					state._fsp--;
					if (state.failed) return;
					match(input,20,FOLLOW_20_in_atom315); if (state.failed) return;
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



	// $ANTLR start "exprList"
	// ./src/ulNoActions.g:106:1: exprList : expr ( exprMore )* ;
	public final void exprList() throws RecognitionException {
		try {
			// ./src/ulNoActions.g:106:9: ( expr ( exprMore )* )
			// ./src/ulNoActions.g:106:11: expr ( exprMore )*
			{
			pushFollow(FOLLOW_expr_in_exprList324);
			expr();
			state._fsp--;
			if (state.failed) return;
			// ./src/ulNoActions.g:106:16: ( exprMore )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==23) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// ./src/ulNoActions.g:106:16: exprMore
					{
					pushFollow(FOLLOW_exprMore_in_exprList326);
					exprMore();
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
	// $ANTLR end "exprList"



	// $ANTLR start "exprMore"
	// ./src/ulNoActions.g:109:1: exprMore : ',' expr ;
	public final void exprMore() throws RecognitionException {
		try {
			// ./src/ulNoActions.g:109:9: ( ',' expr )
			// ./src/ulNoActions.g:109:11: ',' expr
			{
			match(input,23,FOLLOW_23_in_exprMore336); if (state.failed) return;
			pushFollow(FOLLOW_expr_in_exprMore338);
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
	// ./src/ulNoActions.g:115:1: literal : ( stringconstant | INTEGERCONSTANT | CHARACTERCONSTANT | floatconstant | BOOL );
	public final void literal() throws RecognitionException {
		try {
			// ./src/ulNoActions.g:115:8: ( stringconstant | INTEGERCONSTANT | CHARACTERCONSTANT | floatconstant | BOOL )
			int alt13=5;
			switch ( input.LA(1) ) {
			case 18:
				{
				alt13=1;
				}
				break;
			case INTEGERCONSTANT:
				{
				int LA13_2 = input.LA(2);
				if ( (LA13_2==25) ) {
					alt13=4;
				}
				else if ( (LA13_2==EOF) ) {
					alt13=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 13, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case CHARACTERCONSTANT:
				{
				alt13=3;
				}
				break;
			case BOOL:
				{
				alt13=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}
			switch (alt13) {
				case 1 :
					// ./src/ulNoActions.g:115:10: stringconstant
					{
					pushFollow(FOLLOW_stringconstant_in_literal353);
					stringconstant();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// ./src/ulNoActions.g:116:2: INTEGERCONSTANT
					{
					match(input,INTEGERCONSTANT,FOLLOW_INTEGERCONSTANT_in_literal358); if (state.failed) return;
					}
					break;
				case 3 :
					// ./src/ulNoActions.g:117:2: CHARACTERCONSTANT
					{
					match(input,CHARACTERCONSTANT,FOLLOW_CHARACTERCONSTANT_in_literal363); if (state.failed) return;
					}
					break;
				case 4 :
					// ./src/ulNoActions.g:118:2: floatconstant
					{
					pushFollow(FOLLOW_floatconstant_in_literal368);
					floatconstant();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					// ./src/ulNoActions.g:119:2: BOOL
					{
					match(input,BOOL,FOLLOW_BOOL_in_literal373); if (state.failed) return;
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
	// ./src/ulNoActions.g:122:1: stringconstant : '\"' ( CHARACTERCONSTANT )* '\"' ;
	public final void stringconstant() throws RecognitionException {
		try {
			// ./src/ulNoActions.g:122:15: ( '\"' ( CHARACTERCONSTANT )* '\"' )
			// ./src/ulNoActions.g:122:17: '\"' ( CHARACTERCONSTANT )* '\"'
			{
			match(input,18,FOLLOW_18_in_stringconstant382); if (state.failed) return;
			// ./src/ulNoActions.g:122:21: ( CHARACTERCONSTANT )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==CHARACTERCONSTANT) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// ./src/ulNoActions.g:122:21: CHARACTERCONSTANT
					{
					match(input,CHARACTERCONSTANT,FOLLOW_CHARACTERCONSTANT_in_stringconstant384); if (state.failed) return;
					}
					break;

				default :
					break loop14;
				}
			}

			match(input,18,FOLLOW_18_in_stringconstant387); if (state.failed) return;
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
	// ./src/ulNoActions.g:125:1: floatconstant : INTEGERCONSTANT '.' INTEGERCONSTANT ;
	public final void floatconstant() throws RecognitionException {
		try {
			// ./src/ulNoActions.g:125:14: ( INTEGERCONSTANT '.' INTEGERCONSTANT )
			// ./src/ulNoActions.g:125:16: INTEGERCONSTANT '.' INTEGERCONSTANT
			{
			match(input,INTEGERCONSTANT,FOLLOW_INTEGERCONSTANT_in_floatconstant396); if (state.failed) return;
			match(input,25,FOLLOW_25_in_floatconstant397); if (state.failed) return;
			match(input,INTEGERCONSTANT,FOLLOW_INTEGERCONSTANT_in_floatconstant398); if (state.failed) return;
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

	// $ANTLR start synpred8_ulNoActions
	public final void synpred8_ulNoActions_fragment() throws RecognitionException {
		// ./src/ulNoActions.g:75:11: ( ( expr )? ';' )
		// ./src/ulNoActions.g:75:11: ( expr )? ';'
		{
		// ./src/ulNoActions.g:75:11: ( expr )?
		int alt15=2;
		int LA15_0 = input.LA(1);
		if ( (LA15_0==ID||LA15_0==INTEGERCONSTANT||LA15_0==19) ) {
			alt15=1;
		}
		switch (alt15) {
			case 1 :
				// ./src/ulNoActions.g:75:13: expr
				{
				pushFollow(FOLLOW_expr_in_synpred8_ulNoActions182);
				expr();
				state._fsp--;
				if (state.failed) return;
				}
				break;

		}

		match(input,26,FOLLOW_26_in_synpred8_ulNoActions187); if (state.failed) return;
		}

	}
	// $ANTLR end synpred8_ulNoActions

	// $ANTLR start synpred9_ulNoActions
	public final void synpred9_ulNoActions_fragment() throws RecognitionException {
		// ./src/ulNoActions.g:76:2: ( identifier '=' expr ';' )
		// ./src/ulNoActions.g:76:2: identifier '=' expr ';'
		{
		pushFollow(FOLLOW_identifier_in_synpred9_ulNoActions192);
		identifier();
		state._fsp--;
		if (state.failed) return;
		match(input,27,FOLLOW_27_in_synpred9_ulNoActions194); if (state.failed) return;
		pushFollow(FOLLOW_expr_in_synpred9_ulNoActions196);
		expr();
		state._fsp--;
		if (state.failed) return;
		match(input,26,FOLLOW_26_in_synpred9_ulNoActions198); if (state.failed) return;
		}

	}
	// $ANTLR end synpred9_ulNoActions

	// Delegated rules

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



	public static final BitSet FOLLOW_function_in_program42 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_functionDecl_in_function53 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_functionBody_in_function55 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compoundType_in_functionDecl64 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_identifier_in_functionDecl66 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_functionDecl68 = new BitSet(new long[]{0x0000000000108000L});
	public static final BitSet FOLLOW_formalParameters_in_functionDecl70 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_functionDecl73 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compoundType_in_formalParameters82 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_identifier_in_formalParameters84 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_moreFormals_in_formalParameters86 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_23_in_moreFormals96 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_compoundType_in_moreFormals98 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_identifier_in_moreFormals100 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_functionBody109 = new BitSet(new long[]{0x0000000084088500L});
	public static final BitSet FOLLOW_varDecl_in_functionBody112 = new BitSet(new long[]{0x0000000084088500L});
	public static final BitSet FOLLOW_statement_in_functionBody116 = new BitSet(new long[]{0x0000000084088500L});
	public static final BitSet FOLLOW_31_in_functionBody120 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compoundType_in_varDecl129 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_identifier_in_varDecl131 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_varDecl133 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_compoundType142 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_compoundType146 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_compoundType148 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_INTEGERCONSTANT_in_compoundType150 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_compoundType152 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_identifier163 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_in_type172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_statement182 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_statement187 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_statement192 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_statement194 = new BitSet(new long[]{0x0000000000080500L});
	public static final BitSet FOLLOW_expr_in_statement196 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_statement198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_statement203 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_statement204 = new BitSet(new long[]{0x0000000000080500L});
	public static final BitSet FOLLOW_expr_in_statement205 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_statement206 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_statement208 = new BitSet(new long[]{0x0000000000080500L});
	public static final BitSet FOLLOW_expr_in_statement210 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_statement212 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_block221 = new BitSet(new long[]{0x0000000084080500L});
	public static final BitSet FOLLOW_statement_in_block223 = new BitSet(new long[]{0x0000000084080500L});
	public static final BitSet FOLLOW_31_in_block226 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_plmiExpr_in_expr236 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multExpr_in_plmiExpr251 = new BitSet(new long[]{0x0000000001400002L});
	public static final BitSet FOLLOW_set_in_plmiExpr254 = new BitSet(new long[]{0x0000000000080500L});
	public static final BitSet FOLLOW_multExpr_in_plmiExpr260 = new BitSet(new long[]{0x0000000001400002L});
	public static final BitSet FOLLOW_atom_in_multExpr271 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_21_in_multExpr274 = new BitSet(new long[]{0x0000000000080500L});
	public static final BitSet FOLLOW_atom_in_multExpr276 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_INTEGERCONSTANT_in_atom287 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_atom292 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_atom297 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_atom298 = new BitSet(new long[]{0x0000000000080500L});
	public static final BitSet FOLLOW_expr_in_atom299 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_atom300 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_atom305 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_atom306 = new BitSet(new long[]{0x0000000000080500L});
	public static final BitSet FOLLOW_exprList_in_atom307 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_atom308 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_atom313 = new BitSet(new long[]{0x0000000000080500L});
	public static final BitSet FOLLOW_expr_in_atom314 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_atom315 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_exprList324 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_exprMore_in_exprList326 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_23_in_exprMore336 = new BitSet(new long[]{0x0000000000080500L});
	public static final BitSet FOLLOW_expr_in_exprMore338 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stringconstant_in_literal353 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGERCONSTANT_in_literal358 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTERCONSTANT_in_literal363 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_floatconstant_in_literal368 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOL_in_literal373 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_stringconstant382 = new BitSet(new long[]{0x0000000000040020L});
	public static final BitSet FOLLOW_CHARACTERCONSTANT_in_stringconstant384 = new BitSet(new long[]{0x0000000000040020L});
	public static final BitSet FOLLOW_18_in_stringconstant387 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGERCONSTANT_in_floatconstant396 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_floatconstant397 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_INTEGERCONSTANT_in_floatconstant398 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_synpred8_ulNoActions182 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_synpred8_ulNoActions187 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_synpred9_ulNoActions192 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_synpred9_ulNoActions194 = new BitSet(new long[]{0x0000000000080500L});
	public static final BitSet FOLLOW_expr_in_synpred9_ulNoActions196 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_synpred9_ulNoActions198 = new BitSet(new long[]{0x0000000000000002L});
}
