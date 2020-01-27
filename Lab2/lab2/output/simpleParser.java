// $ANTLR null /home/braydon/Desktop/Spring2020/Compilers/Lab2/lab2/simple.g 2020-01-27 08:57:27

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings("all")
public class simpleParser extends DebugParser {
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


	public static final String[] ruleNames = new String[] {
		"invalidRule", "intliteral", "program", "statement", "multExpr", "expr", 
		"atom", "id"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public simpleParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public simpleParser(TokenStream input, int port, RecognizerSharedState state) {
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

	public simpleParser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg, new RecognizerSharedState());
	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

	@Override public String[] getTokenNames() { return simpleParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/braydon/Desktop/Spring2020/Compilers/Lab2/lab2/simple.g"; }



	// $ANTLR start "program"
	// /home/braydon/Desktop/Spring2020/Compilers/Lab2/lab2/simple.g:3:1: program returns [Program p] : (s= statement )* EOF ;
	public final Program program() throws RecognitionException {
		Program p = null;


		Statement s =null;


			// executed before the method starts
			p = new Program();

		try { dbg.enterRule(getGrammarFileName(), "program");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(3, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/Lab2/lab2/simple.g:13:2: ( (s= statement )* EOF )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/Lab2/lab2/simple.g:14:2: (s= statement )* EOF
			{
			dbg.location(14,2);
			// /home/braydon/Desktop/Spring2020/Compilers/Lab2/lab2/simple.g:14:2: (s= statement )*
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( (LA1_0==ID||LA1_0==11) ) {
					alt1=1;
				}

				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// /home/braydon/Desktop/Spring2020/Compilers/Lab2/lab2/simple.g:14:4: s= statement
					{
					dbg.location(14,5);
					pushFollow(FOLLOW_statement_in_program30);
					s=statement();
					state._fsp--;
					dbg.location(14,16);
					p.addStatement(s);
					}
					break;

				default :
					break loop1;
				}
			}
			} finally {dbg.exitSubRule(1);}
			dbg.location(14,39);
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
		dbg.location(15, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "program");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return p;
	}
	// $ANTLR end "program"



	// $ANTLR start "statement"
	// /home/braydon/Desktop/Spring2020/Compilers/Lab2/lab2/simple.g:17:1: statement returns [Statement s] : (i1= id '=' e1= expr ';' | 'output' i2= id ';' );
	public final Statement statement() throws RecognitionException {
		Statement s = null;


		Identifier i1 =null;
		Expression e1 =null;
		Identifier i2 =null;

		try { dbg.enterRule(getGrammarFileName(), "statement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(17, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/Lab2/lab2/simple.g:18:2: (i1= id '=' e1= expr ';' | 'output' i2= id ';' )
			int alt2=2;
			try { dbg.enterDecision(2, decisionCanBacktrack[2]);

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
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(2);}

			switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// /home/braydon/Desktop/Spring2020/Compilers/Lab2/lab2/simple.g:19:2: i1= id '=' e1= expr ';'
					{
					dbg.location(19,4);
					pushFollow(FOLLOW_id_in_statement55);
					i1=id();
					state._fsp--;
					dbg.location(19,8);
					match(input,10,FOLLOW_10_in_statement57); dbg.location(19,14);
					pushFollow(FOLLOW_expr_in_statement61);
					e1=expr();
					state._fsp--;
					dbg.location(19,20);
					 s = new AssignmentStatement(i1,e1);dbg.location(19,59);
					match(input,9,FOLLOW_9_in_statement65); 
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/braydon/Desktop/Spring2020/Compilers/Lab2/lab2/simple.g:20:4: 'output' i2= id ';'
					{
					dbg.location(20,4);
					match(input,11,FOLLOW_11_in_statement70); dbg.location(20,15);
					pushFollow(FOLLOW_id_in_statement74);
					i2=id();
					state._fsp--;
					dbg.location(20,19);
					 s = new OutputStatement(i2);dbg.location(20,50);
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
		dbg.location(21, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "statement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return s;
	}
	// $ANTLR end "statement"



	// $ANTLR start "expr"
	// /home/braydon/Desktop/Spring2020/Compilers/Lab2/lab2/simple.g:23:1: expr returns [Expression e] : m1= multExpr ( '+' m2= multExpr )? ;
	public final Expression expr() throws RecognitionException {
		Expression e = null;


		Expression m1 =null;
		Expression m2 =null;

		try { dbg.enterRule(getGrammarFileName(), "expr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(23, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/Lab2/lab2/simple.g:24:2: (m1= multExpr ( '+' m2= multExpr )? )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/Lab2/lab2/simple.g:25:2: m1= multExpr ( '+' m2= multExpr )?
			{
			dbg.location(25,4);
			pushFollow(FOLLOW_multExpr_in_expr95);
			m1=multExpr();
			state._fsp--;
			dbg.location(25,14);
			e = m1;dbg.location(25,24);
			// /home/braydon/Desktop/Spring2020/Compilers/Lab2/lab2/simple.g:25:24: ( '+' m2= multExpr )?
			int alt3=2;
			try { dbg.enterSubRule(3);
			try { dbg.enterDecision(3, decisionCanBacktrack[3]);

			int LA3_0 = input.LA(1);
			if ( (LA3_0==8) ) {
				alt3=1;
			}
			} finally {dbg.exitDecision(3);}

			switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// /home/braydon/Desktop/Spring2020/Compilers/Lab2/lab2/simple.g:25:26: '+' m2= multExpr
					{
					dbg.location(25,26);
					match(input,8,FOLLOW_8_in_expr101); dbg.location(25,32);
					pushFollow(FOLLOW_multExpr_in_expr105);
					m2=multExpr();
					state._fsp--;
					dbg.location(25,42);
					e = new PlusExpression(m1,m2);
					}
					break;

			}
			} finally {dbg.exitSubRule(3);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(26, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return e;
	}
	// $ANTLR end "expr"



	// $ANTLR start "multExpr"
	// /home/braydon/Desktop/Spring2020/Compilers/Lab2/lab2/simple.g:28:1: multExpr returns [Expression e] : a1= atom ( '*' a2= atom )? ;
	public final Expression multExpr() throws RecognitionException {
		Expression e = null;


		Expression a1 =null;
		Expression a2 =null;

		try { dbg.enterRule(getGrammarFileName(), "multExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(28, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/Lab2/lab2/simple.g:29:2: (a1= atom ( '*' a2= atom )? )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/Lab2/lab2/simple.g:30:2: a1= atom ( '*' a2= atom )?
			{
			dbg.location(30,4);
			pushFollow(FOLLOW_atom_in_multExpr128);
			a1=atom();
			state._fsp--;
			dbg.location(30,10);
			e = a1;dbg.location(30,20);
			// /home/braydon/Desktop/Spring2020/Compilers/Lab2/lab2/simple.g:30:20: ( '*' a2= atom )?
			int alt4=2;
			try { dbg.enterSubRule(4);
			try { dbg.enterDecision(4, decisionCanBacktrack[4]);

			int LA4_0 = input.LA(1);
			if ( (LA4_0==7) ) {
				alt4=1;
			}
			} finally {dbg.exitDecision(4);}

			switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// /home/braydon/Desktop/Spring2020/Compilers/Lab2/lab2/simple.g:30:22: '*' a2= atom
					{
					dbg.location(30,22);
					match(input,7,FOLLOW_7_in_multExpr134); dbg.location(30,28);
					pushFollow(FOLLOW_atom_in_multExpr138);
					a2=atom();
					state._fsp--;
					dbg.location(30,34);
					e = new MultExpression(e,a2);
					}
					break;

			}
			} finally {dbg.exitSubRule(4);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(31, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "multExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return e;
	}
	// $ANTLR end "multExpr"



	// $ANTLR start "atom"
	// /home/braydon/Desktop/Spring2020/Compilers/Lab2/lab2/simple.g:33:1: atom returns [ Expression e ] : (i= id |i2= intliteral );
	public final Expression atom() throws RecognitionException {
		Expression e = null;


		Identifier i =null;
		IntegerLiteral i2 =null;

		try { dbg.enterRule(getGrammarFileName(), "atom");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(33, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/Lab2/lab2/simple.g:34:2: (i= id |i2= intliteral )
			int alt5=2;
			try { dbg.enterDecision(5, decisionCanBacktrack[5]);

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
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(5);}

			switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// /home/braydon/Desktop/Spring2020/Compilers/Lab2/lab2/simple.g:35:4: i= id
					{
					dbg.location(35,5);
					pushFollow(FOLLOW_id_in_atom164);
					i=id();
					state._fsp--;
					dbg.location(35,9);
					e = new IdentifierValue(i);
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/braydon/Desktop/Spring2020/Compilers/Lab2/lab2/simple.g:36:4: i2= intliteral
					{
					dbg.location(36,6);
					pushFollow(FOLLOW_intliteral_in_atom174);
					i2=intliteral();
					state._fsp--;
					dbg.location(36,18);
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
		dbg.location(37, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "atom");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return e;
	}
	// $ANTLR end "atom"



	// $ANTLR start "id"
	// /home/braydon/Desktop/Spring2020/Compilers/Lab2/lab2/simple.g:39:1: id returns [Identifier id] : i= ID ;
	public final Identifier id() throws RecognitionException {
		Identifier id = null;


		Token i=null;

		try { dbg.enterRule(getGrammarFileName(), "id");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(39, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/Lab2/lab2/simple.g:40:2: (i= ID )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/Lab2/lab2/simple.g:41:2: i= ID
			{
			dbg.location(41,4);
			i=(Token)match(input,ID,FOLLOW_ID_in_id198); dbg.location(41,8);
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
		dbg.location(42, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "id");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return id;
	}
	// $ANTLR end "id"



	// $ANTLR start "intliteral"
	// /home/braydon/Desktop/Spring2020/Compilers/Lab2/lab2/simple.g:44:1: intliteral returns [IntegerLiteral il] : i= INT ;
	public final IntegerLiteral intliteral() throws RecognitionException {
		IntegerLiteral il = null;


		Token i=null;

		try { dbg.enterRule(getGrammarFileName(), "intliteral");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(44, 0);

		try {
			// /home/braydon/Desktop/Spring2020/Compilers/Lab2/lab2/simple.g:44:39: (i= INT )
			dbg.enterAlt(1);

			// /home/braydon/Desktop/Spring2020/Compilers/Lab2/lab2/simple.g:45:2: i= INT
			{
			dbg.location(45,3);
			i=(Token)match(input,INT,FOLLOW_INT_in_intliteral217); dbg.location(45,8);
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
		dbg.location(46, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "intliteral");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
