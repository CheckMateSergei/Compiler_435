// $ANTLR 3.5.2 simple.g 2020-01-27 08:55:12

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class simpleParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "INT", "WS", "'*'", "'+'", 
		"';'", "'='", "'output'"
	};
	public static final int EOF=-1;
	public static final int T__7=7;
	public static final int T__8=8;
	public static final int T__9=9;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int ID=4;
	public static final int INT=5;
	public static final int WS=6;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public simpleParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public simpleParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return simpleParser.tokenNames; }
	@Override public String getGrammarFileName() { return "simple.g"; }



	// $ANTLR start "program"
	// simple.g:3:1: program returns [Program p] : (s= statement )* EOF ;
	public final Program program() throws RecognitionException {
		Program p = null;


		Statement s =null;


			// executed before the method starts
			p = new Program();

		try {
			// simple.g:13:2: ( (s= statement )* EOF )
			// simple.g:14:2: (s= statement )* EOF
			{
			// simple.g:14:2: (s= statement )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==ID||LA1_0==11) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// simple.g:14:4: s= statement
					{
					pushFollow(FOLLOW_statement_in_program30);
					s=statement();
					state._fsp--;

					p.addStatement(s);
					}
					break;

				default :
					break loop1;
				}
			}

			match(input,EOF,FOLLOW_EOF_in_program36); 
			}


				// excuted after the method is finished

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return p;
	}
	// $ANTLR end "program"



	// $ANTLR start "statement"
	// simple.g:17:1: statement returns [Statement s] : (i1= id '=' e1= expr ';' | 'output' i2= id ';' );
	public final Statement statement() throws RecognitionException {
		Statement s = null;


		Identifier i1 =null;
		Expression e1 =null;
		Identifier i2 =null;

		try {
			// simple.g:18:2: (i1= id '=' e1= expr ';' | 'output' i2= id ';' )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==ID) ) {
				alt2=1;
			}
			else if ( (LA2_0==11) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// simple.g:19:2: i1= id '=' e1= expr ';'
					{
					pushFollow(FOLLOW_id_in_statement55);
					i1=id();
					state._fsp--;

					match(input,10,FOLLOW_10_in_statement57); 
					pushFollow(FOLLOW_expr_in_statement61);
					e1=expr();
					state._fsp--;

					 s = new AssignmentStatement(i1,e1);
					match(input,9,FOLLOW_9_in_statement65); 
					}
					break;
				case 2 :
					// simple.g:20:4: 'output' i2= id ';'
					{
					match(input,11,FOLLOW_11_in_statement70); 
					pushFollow(FOLLOW_id_in_statement74);
					i2=id();
					state._fsp--;

					 s = new OutputStatement(i2);
					match(input,9,FOLLOW_9_in_statement77); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return s;
	}
	// $ANTLR end "statement"



	// $ANTLR start "expr"
	// simple.g:23:1: expr returns [Expression e] : m1= multExpr ( '+' m2= multExpr )? ;
	public final Expression expr() throws RecognitionException {
		Expression e = null;


		Expression m1 =null;
		Expression m2 =null;

		try {
			// simple.g:24:2: (m1= multExpr ( '+' m2= multExpr )? )
			// simple.g:25:2: m1= multExpr ( '+' m2= multExpr )?
			{
			pushFollow(FOLLOW_multExpr_in_expr95);
			m1=multExpr();
			state._fsp--;

			e = m1;
			// simple.g:25:24: ( '+' m2= multExpr )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==8) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// simple.g:25:26: '+' m2= multExpr
					{
					match(input,8,FOLLOW_8_in_expr101); 
					pushFollow(FOLLOW_multExpr_in_expr105);
					m2=multExpr();
					state._fsp--;

					e = new PlusExpression(m1,m2);
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return e;
	}
	// $ANTLR end "expr"



	// $ANTLR start "multExpr"
	// simple.g:28:1: multExpr returns [Expression e] : a1= atom ( '*' a2= atom )? ;
	public final Expression multExpr() throws RecognitionException {
		Expression e = null;


		Expression a1 =null;
		Expression a2 =null;

		try {
			// simple.g:29:2: (a1= atom ( '*' a2= atom )? )
			// simple.g:30:2: a1= atom ( '*' a2= atom )?
			{
			pushFollow(FOLLOW_atom_in_multExpr128);
			a1=atom();
			state._fsp--;

			e = a1;
			// simple.g:30:20: ( '*' a2= atom )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==7) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// simple.g:30:22: '*' a2= atom
					{
					match(input,7,FOLLOW_7_in_multExpr134); 
					pushFollow(FOLLOW_atom_in_multExpr138);
					a2=atom();
					state._fsp--;

					e = new MultExpression(e,a2);
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return e;
	}
	// $ANTLR end "multExpr"



	// $ANTLR start "atom"
	// simple.g:33:1: atom returns [ Expression e ] : (i= id |i2= intliteral );
	public final Expression atom() throws RecognitionException {
		Expression e = null;


		Identifier i =null;
		IntegerLiteral i2 =null;

		try {
			// simple.g:34:2: (i= id |i2= intliteral )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==ID) ) {
				alt5=1;
			}
			else if ( (LA5_0==INT) ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// simple.g:35:4: i= id
					{
					pushFollow(FOLLOW_id_in_atom164);
					i=id();
					state._fsp--;

					e = new IdentifierValue(i);
					}
					break;
				case 2 :
					// simple.g:36:4: i2= intliteral
					{
					pushFollow(FOLLOW_intliteral_in_atom174);
					i2=intliteral();
					state._fsp--;

					e = i2;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return e;
	}
	// $ANTLR end "atom"



	// $ANTLR start "id"
	// simple.g:39:1: id returns [Identifier id] : i= ID ;
	public final Identifier id() throws RecognitionException {
		Identifier id = null;


		Token i=null;

		try {
			// simple.g:40:2: (i= ID )
			// simple.g:41:2: i= ID
			{
			i=(Token)match(input,ID,FOLLOW_ID_in_id198); 
			 id = new Identifier(i.getText());
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return id;
	}
	// $ANTLR end "id"



	// $ANTLR start "intliteral"
	// simple.g:44:1: intliteral returns [IntegerLiteral il] : i= INT ;
	public final IntegerLiteral intliteral() throws RecognitionException {
		IntegerLiteral il = null;


		Token i=null;

		try {
			// simple.g:44:39: (i= INT )
			// simple.g:45:2: i= INT
			{
			i=(Token)match(input,INT,FOLLOW_INT_in_intliteral217); 
			 il = new IntegerLiteral(Integer.parseInt(i.getText()));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return il;
	}
	// $ANTLR end "intliteral"

	// Delegated rules



	public static final BitSet FOLLOW_statement_in_program30 = new BitSet(new long[]{0x0000000000000810L});
	public static final BitSet FOLLOW_EOF_in_program36 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_id_in_statement55 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_statement57 = new BitSet(new long[]{0x0000000000000030L});
	public static final BitSet FOLLOW_expr_in_statement61 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_statement65 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_11_in_statement70 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_id_in_statement74 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_statement77 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multExpr_in_expr95 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_8_in_expr101 = new BitSet(new long[]{0x0000000000000030L});
	public static final BitSet FOLLOW_multExpr_in_expr105 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_multExpr128 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_7_in_multExpr134 = new BitSet(new long[]{0x0000000000000030L});
	public static final BitSet FOLLOW_atom_in_multExpr138 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_id_in_atom164 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_intliteral_in_atom174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_id198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_intliteral217 = new BitSet(new long[]{0x0000000000000002L});
}
