// $ANTLR 3.5.2 ./src/ulNoActions.g 2020-01-16 14:34:15

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ulNoActionsParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "BOOL", "CHARACTERCONSTANT", "COMMENT", 
		"ELSE", "ID", "IF", "INTEGERCONSTANT", "OP", "PRINT", "PRINTLN", "RETURN", 
		"TYPE", "WHILE", "WS", "'\"'", "'('", "')'", "','", "'.'", "';'", "'['", 
		"']'", "'{'", "'}'"
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
	// ./src/ulNoActions.g:41:1: program : ( function )+ ;
	public final void program() throws RecognitionException {
		try {
			// ./src/ulNoActions.g:41:9: ( ( function )+ )
			// ./src/ulNoActions.g:41:11: ( function )+
			{
			// ./src/ulNoActions.g:41:11: ( function )+
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
					// ./src/ulNoActions.g:41:11: function
					{
					pushFollow(FOLLOW_function_in_program32);
					function();
					state._fsp--;

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
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
	// ./src/ulNoActions.g:44:1: function : functionDecl functionBody ;
	public final void function() throws RecognitionException {
		try {
			// ./src/ulNoActions.g:44:9: ( functionDecl functionBody )
			// ./src/ulNoActions.g:44:11: functionDecl functionBody
			{
			pushFollow(FOLLOW_functionDecl_in_function43);
			functionDecl();
			state._fsp--;

			pushFollow(FOLLOW_functionBody_in_function45);
			functionBody();
			state._fsp--;

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
	// ./src/ulNoActions.g:47:1: functionDecl : compoundType identifier '(' ( formalParameters )? ')' ;
	public final void functionDecl() throws RecognitionException {
		try {
			// ./src/ulNoActions.g:47:13: ( compoundType identifier '(' ( formalParameters )? ')' )
			// ./src/ulNoActions.g:47:15: compoundType identifier '(' ( formalParameters )? ')'
			{
			pushFollow(FOLLOW_compoundType_in_functionDecl54);
			compoundType();
			state._fsp--;

			pushFollow(FOLLOW_identifier_in_functionDecl56);
			identifier();
			state._fsp--;

			match(input,19,FOLLOW_19_in_functionDecl58); 
			// ./src/ulNoActions.g:47:43: ( formalParameters )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==TYPE) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// ./src/ulNoActions.g:47:43: formalParameters
					{
					pushFollow(FOLLOW_formalParameters_in_functionDecl60);
					formalParameters();
					state._fsp--;

					}
					break;

			}

			match(input,20,FOLLOW_20_in_functionDecl63); 
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
	// ./src/ulNoActions.g:50:1: formalParameters : compoundType identifier ( moreFormals )* ;
	public final void formalParameters() throws RecognitionException {
		try {
			// ./src/ulNoActions.g:50:17: ( compoundType identifier ( moreFormals )* )
			// ./src/ulNoActions.g:50:19: compoundType identifier ( moreFormals )*
			{
			pushFollow(FOLLOW_compoundType_in_formalParameters72);
			compoundType();
			state._fsp--;

			pushFollow(FOLLOW_identifier_in_formalParameters74);
			identifier();
			state._fsp--;

			// ./src/ulNoActions.g:50:43: ( moreFormals )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==21) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// ./src/ulNoActions.g:50:43: moreFormals
					{
					pushFollow(FOLLOW_moreFormals_in_formalParameters76);
					moreFormals();
					state._fsp--;

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
	// ./src/ulNoActions.g:53:1: moreFormals : ',' compoundType identifier ;
	public final void moreFormals() throws RecognitionException {
		try {
			// ./src/ulNoActions.g:53:12: ( ',' compoundType identifier )
			// ./src/ulNoActions.g:53:14: ',' compoundType identifier
			{
			match(input,21,FOLLOW_21_in_moreFormals86); 
			pushFollow(FOLLOW_compoundType_in_moreFormals88);
			compoundType();
			state._fsp--;

			pushFollow(FOLLOW_identifier_in_moreFormals90);
			identifier();
			state._fsp--;

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
	// ./src/ulNoActions.g:56:1: functionBody : '{' ( varDecl )* ( statement )* '}' ;
	public final void functionBody() throws RecognitionException {
		try {
			// ./src/ulNoActions.g:56:13: ( '{' ( varDecl )* ( statement )* '}' )
			// ./src/ulNoActions.g:56:15: '{' ( varDecl )* ( statement )* '}'
			{
			match(input,26,FOLLOW_26_in_functionBody99); 
			// ./src/ulNoActions.g:56:19: ( varDecl )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==TYPE) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// ./src/ulNoActions.g:56:19: varDecl
					{
					pushFollow(FOLLOW_varDecl_in_functionBody101);
					varDecl();
					state._fsp--;

					}
					break;

				default :
					break loop4;
				}
			}

			// ./src/ulNoActions.g:56:28: ( statement )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==23) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// ./src/ulNoActions.g:56:28: statement
					{
					pushFollow(FOLLOW_statement_in_functionBody104);
					statement();
					state._fsp--;

					}
					break;

				default :
					break loop5;
				}
			}

			match(input,27,FOLLOW_27_in_functionBody107); 
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
	// ./src/ulNoActions.g:59:1: varDecl : compoundType identifier ';' ;
	public final void varDecl() throws RecognitionException {
		try {
			// ./src/ulNoActions.g:59:8: ( compoundType identifier ';' )
			// ./src/ulNoActions.g:59:10: compoundType identifier ';'
			{
			pushFollow(FOLLOW_compoundType_in_varDecl116);
			compoundType();
			state._fsp--;

			pushFollow(FOLLOW_identifier_in_varDecl118);
			identifier();
			state._fsp--;

			match(input,23,FOLLOW_23_in_varDecl120); 
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
	// ./src/ulNoActions.g:62:1: compoundType : ( type | type '[' INTEGERCONSTANT ']' );
	public final void compoundType() throws RecognitionException {
		try {
			// ./src/ulNoActions.g:62:13: ( type | type '[' INTEGERCONSTANT ']' )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==TYPE) ) {
				int LA6_1 = input.LA(2);
				if ( (LA6_1==ID) ) {
					alt6=1;
				}
				else if ( (LA6_1==24) ) {
					alt6=2;
				}

				else {
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
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// ./src/ulNoActions.g:62:15: type
					{
					pushFollow(FOLLOW_type_in_compoundType129);
					type();
					state._fsp--;

					}
					break;
				case 2 :
					// ./src/ulNoActions.g:62:22: type '[' INTEGERCONSTANT ']'
					{
					pushFollow(FOLLOW_type_in_compoundType133);
					type();
					state._fsp--;

					match(input,24,FOLLOW_24_in_compoundType135); 
					match(input,INTEGERCONSTANT,FOLLOW_INTEGERCONSTANT_in_compoundType137); 
					match(input,25,FOLLOW_25_in_compoundType139); 
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
	// ./src/ulNoActions.g:65:1: identifier : ID ;
	public final void identifier() throws RecognitionException {
		try {
			// ./src/ulNoActions.g:65:12: ( ID )
			// ./src/ulNoActions.g:65:14: ID
			{
			match(input,ID,FOLLOW_ID_in_identifier150); 
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
	// ./src/ulNoActions.g:68:1: type : TYPE ;
	public final void type() throws RecognitionException {
		try {
			// ./src/ulNoActions.g:68:5: ( TYPE )
			// ./src/ulNoActions.g:68:7: TYPE
			{
			match(input,TYPE,FOLLOW_TYPE_in_type159); 
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
	// ./src/ulNoActions.g:71:1: statement : ';' ;
	public final void statement() throws RecognitionException {
		try {
			// ./src/ulNoActions.g:71:10: ( ';' )
			// ./src/ulNoActions.g:71:12: ';'
			{
			match(input,23,FOLLOW_23_in_statement168); 
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
	// ./src/ulNoActions.g:74:1: block : '{' ( statement )* '}' ;
	public final void block() throws RecognitionException {
		try {
			// ./src/ulNoActions.g:74:6: ( '{' ( statement )* '}' )
			// ./src/ulNoActions.g:74:8: '{' ( statement )* '}'
			{
			match(input,26,FOLLOW_26_in_block178); 
			// ./src/ulNoActions.g:74:12: ( statement )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==23) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// ./src/ulNoActions.g:74:12: statement
					{
					pushFollow(FOLLOW_statement_in_block180);
					statement();
					state._fsp--;

					}
					break;

				default :
					break loop7;
				}
			}

			match(input,27,FOLLOW_27_in_block183); 
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



	// $ANTLR start "literal"
	// ./src/ulNoActions.g:100:1: literal : ( stringconstant | INTEGERCONSTANT | CHARACTERCONSTANT | floatconstant | BOOL );
	public final void literal() throws RecognitionException {
		try {
			// ./src/ulNoActions.g:100:8: ( stringconstant | INTEGERCONSTANT | CHARACTERCONSTANT | floatconstant | BOOL )
			int alt8=5;
			switch ( input.LA(1) ) {
			case 18:
				{
				alt8=1;
				}
				break;
			case INTEGERCONSTANT:
				{
				int LA8_2 = input.LA(2);
				if ( (LA8_2==22) ) {
					alt8=4;
				}
				else if ( (LA8_2==EOF) ) {
					alt8=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 8, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case CHARACTERCONSTANT:
				{
				alt8=3;
				}
				break;
			case BOOL:
				{
				alt8=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// ./src/ulNoActions.g:100:10: stringconstant
					{
					pushFollow(FOLLOW_stringconstant_in_literal200);
					stringconstant();
					state._fsp--;

					}
					break;
				case 2 :
					// ./src/ulNoActions.g:101:2: INTEGERCONSTANT
					{
					match(input,INTEGERCONSTANT,FOLLOW_INTEGERCONSTANT_in_literal205); 
					}
					break;
				case 3 :
					// ./src/ulNoActions.g:102:2: CHARACTERCONSTANT
					{
					match(input,CHARACTERCONSTANT,FOLLOW_CHARACTERCONSTANT_in_literal210); 
					}
					break;
				case 4 :
					// ./src/ulNoActions.g:103:2: floatconstant
					{
					pushFollow(FOLLOW_floatconstant_in_literal215);
					floatconstant();
					state._fsp--;

					}
					break;
				case 5 :
					// ./src/ulNoActions.g:104:2: BOOL
					{
					match(input,BOOL,FOLLOW_BOOL_in_literal220); 
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
	// ./src/ulNoActions.g:107:1: stringconstant : '\"' ( CHARACTERCONSTANT )+ '\"' ;
	public final void stringconstant() throws RecognitionException {
		try {
			// ./src/ulNoActions.g:107:15: ( '\"' ( CHARACTERCONSTANT )+ '\"' )
			// ./src/ulNoActions.g:107:17: '\"' ( CHARACTERCONSTANT )+ '\"'
			{
			match(input,18,FOLLOW_18_in_stringconstant229); 
			// ./src/ulNoActions.g:107:21: ( CHARACTERCONSTANT )+
			int cnt9=0;
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==CHARACTERCONSTANT) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// ./src/ulNoActions.g:107:21: CHARACTERCONSTANT
					{
					match(input,CHARACTERCONSTANT,FOLLOW_CHARACTERCONSTANT_in_stringconstant231); 
					}
					break;

				default :
					if ( cnt9 >= 1 ) break loop9;
					EarlyExitException eee = new EarlyExitException(9, input);
					throw eee;
				}
				cnt9++;
			}

			match(input,18,FOLLOW_18_in_stringconstant234); 
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
	// ./src/ulNoActions.g:110:1: floatconstant : INTEGERCONSTANT '.' INTEGERCONSTANT ;
	public final void floatconstant() throws RecognitionException {
		try {
			// ./src/ulNoActions.g:110:14: ( INTEGERCONSTANT '.' INTEGERCONSTANT )
			// ./src/ulNoActions.g:110:16: INTEGERCONSTANT '.' INTEGERCONSTANT
			{
			match(input,INTEGERCONSTANT,FOLLOW_INTEGERCONSTANT_in_floatconstant243); 
			match(input,22,FOLLOW_22_in_floatconstant244); 
			match(input,INTEGERCONSTANT,FOLLOW_INTEGERCONSTANT_in_floatconstant245); 
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

	// Delegated rules



	public static final BitSet FOLLOW_function_in_program32 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_functionDecl_in_function43 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_functionBody_in_function45 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compoundType_in_functionDecl54 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_identifier_in_functionDecl56 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_functionDecl58 = new BitSet(new long[]{0x0000000000108000L});
	public static final BitSet FOLLOW_formalParameters_in_functionDecl60 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_functionDecl63 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compoundType_in_formalParameters72 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_identifier_in_formalParameters74 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_moreFormals_in_formalParameters76 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_21_in_moreFormals86 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_compoundType_in_moreFormals88 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_identifier_in_moreFormals90 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_functionBody99 = new BitSet(new long[]{0x0000000008808000L});
	public static final BitSet FOLLOW_varDecl_in_functionBody101 = new BitSet(new long[]{0x0000000008808000L});
	public static final BitSet FOLLOW_statement_in_functionBody104 = new BitSet(new long[]{0x0000000008800000L});
	public static final BitSet FOLLOW_27_in_functionBody107 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compoundType_in_varDecl116 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_identifier_in_varDecl118 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_varDecl120 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_compoundType129 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_compoundType133 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_compoundType135 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_INTEGERCONSTANT_in_compoundType137 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_compoundType139 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_identifier150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_in_type159 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_statement168 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_block178 = new BitSet(new long[]{0x0000000008800000L});
	public static final BitSet FOLLOW_statement_in_block180 = new BitSet(new long[]{0x0000000008800000L});
	public static final BitSet FOLLOW_27_in_block183 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stringconstant_in_literal200 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGERCONSTANT_in_literal205 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHARACTERCONSTANT_in_literal210 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_floatconstant_in_literal215 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOL_in_literal220 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_stringconstant229 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CHARACTERCONSTANT_in_stringconstant231 = new BitSet(new long[]{0x0000000000040020L});
	public static final BitSet FOLLOW_18_in_stringconstant234 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGERCONSTANT_in_floatconstant243 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_floatconstant244 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_INTEGERCONSTANT_in_floatconstant245 = new BitSet(new long[]{0x0000000000000002L});
}
