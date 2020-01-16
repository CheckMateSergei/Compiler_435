// $ANTLR 3.5.2 ./src/ulNoActions.g 2020-01-16 14:34:15

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ulNoActionsLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public ulNoActionsLexer() {} 
	public ulNoActionsLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public ulNoActionsLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "./src/ulNoActions.g"; }

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./src/ulNoActions.g:2:7: ( '\"' )
			// ./src/ulNoActions.g:2:9: '\"'
			{
			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./src/ulNoActions.g:3:7: ( '(' )
			// ./src/ulNoActions.g:3:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./src/ulNoActions.g:4:7: ( ')' )
			// ./src/ulNoActions.g:4:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./src/ulNoActions.g:5:7: ( ',' )
			// ./src/ulNoActions.g:5:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./src/ulNoActions.g:6:7: ( '.' )
			// ./src/ulNoActions.g:6:9: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./src/ulNoActions.g:7:7: ( ';' )
			// ./src/ulNoActions.g:7:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./src/ulNoActions.g:8:7: ( '[' )
			// ./src/ulNoActions.g:8:9: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./src/ulNoActions.g:9:7: ( ']' )
			// ./src/ulNoActions.g:9:9: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./src/ulNoActions.g:10:7: ( '{' )
			// ./src/ulNoActions.g:10:9: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./src/ulNoActions.g:11:7: ( '}' )
			// ./src/ulNoActions.g:11:9: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__27"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./src/ulNoActions.g:115:4: ( 'if' )
			// ./src/ulNoActions.g:115:6: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./src/ulNoActions.g:118:6: ( 'else' )
			// ./src/ulNoActions.g:118:8: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE"

	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./src/ulNoActions.g:121:7: ( 'while' )
			// ./src/ulNoActions.g:121:9: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHILE"

	// $ANTLR start "PRINT"
	public final void mPRINT() throws RecognitionException {
		try {
			int _type = PRINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./src/ulNoActions.g:124:7: ( 'print' )
			// ./src/ulNoActions.g:124:9: 'print'
			{
			match("print"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PRINT"

	// $ANTLR start "PRINTLN"
	public final void mPRINTLN() throws RecognitionException {
		try {
			int _type = PRINTLN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./src/ulNoActions.g:127:9: ( 'println' )
			// ./src/ulNoActions.g:127:11: 'println'
			{
			match("println"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PRINTLN"

	// $ANTLR start "RETURN"
	public final void mRETURN() throws RecognitionException {
		try {
			int _type = RETURN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./src/ulNoActions.g:130:8: ( 'return' )
			// ./src/ulNoActions.g:130:10: 'return'
			{
			match("return"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RETURN"

	// $ANTLR start "BOOL"
	public final void mBOOL() throws RecognitionException {
		try {
			int _type = BOOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./src/ulNoActions.g:133:6: ( 'true' | 'false' )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='t') ) {
				alt1=1;
			}
			else if ( (LA1_0=='f') ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// ./src/ulNoActions.g:133:8: 'true'
					{
					match("true"); 

					}
					break;
				case 2 :
					// ./src/ulNoActions.g:134:3: 'false'
					{
					match("false"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BOOL"

	// $ANTLR start "OP"
	public final void mOP() throws RecognitionException {
		try {
			int _type = OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./src/ulNoActions.g:137:4: ( '*' | '+' | '-' | '<' | '==' )
			int alt2=5;
			switch ( input.LA(1) ) {
			case '*':
				{
				alt2=1;
				}
				break;
			case '+':
				{
				alt2=2;
				}
				break;
			case '-':
				{
				alt2=3;
				}
				break;
			case '<':
				{
				alt2=4;
				}
				break;
			case '=':
				{
				alt2=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// ./src/ulNoActions.g:137:6: '*'
					{
					match('*'); 
					}
					break;
				case 2 :
					// ./src/ulNoActions.g:138:4: '+'
					{
					match('+'); 
					}
					break;
				case 3 :
					// ./src/ulNoActions.g:139:4: '-'
					{
					match('-'); 
					}
					break;
				case 4 :
					// ./src/ulNoActions.g:140:4: '<'
					{
					match('<'); 
					}
					break;
				case 5 :
					// ./src/ulNoActions.g:141:4: '=='
					{
					match("=="); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP"

	// $ANTLR start "TYPE"
	public final void mTYPE() throws RecognitionException {
		try {
			int _type = TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./src/ulNoActions.g:144:6: ( 'int' | 'float' | 'char' | 'string' | 'boolean' | 'void' )
			int alt3=6;
			switch ( input.LA(1) ) {
			case 'i':
				{
				alt3=1;
				}
				break;
			case 'f':
				{
				alt3=2;
				}
				break;
			case 'c':
				{
				alt3=3;
				}
				break;
			case 's':
				{
				alt3=4;
				}
				break;
			case 'b':
				{
				alt3=5;
				}
				break;
			case 'v':
				{
				alt3=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// ./src/ulNoActions.g:144:8: 'int'
					{
					match("int"); 

					}
					break;
				case 2 :
					// ./src/ulNoActions.g:145:3: 'float'
					{
					match("float"); 

					}
					break;
				case 3 :
					// ./src/ulNoActions.g:146:3: 'char'
					{
					match("char"); 

					}
					break;
				case 4 :
					// ./src/ulNoActions.g:147:3: 'string'
					{
					match("string"); 

					}
					break;
				case 5 :
					// ./src/ulNoActions.g:148:3: 'boolean'
					{
					match("boolean"); 

					}
					break;
				case 6 :
					// ./src/ulNoActions.g:149:3: 'void'
					{
					match("void"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TYPE"

	// $ANTLR start "INTEGERCONSTANT"
	public final void mINTEGERCONSTANT() throws RecognitionException {
		try {
			int _type = INTEGERCONSTANT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./src/ulNoActions.g:152:17: ( ( '0' .. '9' )+ )
			// ./src/ulNoActions.g:152:19: ( '0' .. '9' )+
			{
			// ./src/ulNoActions.g:152:19: ( '0' .. '9' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// ./src/ulNoActions.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTEGERCONSTANT"

	// $ANTLR start "CHARACTERCONSTANT"
	public final void mCHARACTERCONSTANT() throws RecognitionException {
		try {
			int _type = CHARACTERCONSTANT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./src/ulNoActions.g:155:19: ( '\\'' 'a' .. 'z' | 'A' .. 'Z' '\\'' )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='\'') ) {
				alt5=1;
			}
			else if ( ((LA5_0 >= 'A' && LA5_0 <= 'Z')) ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// ./src/ulNoActions.g:155:21: '\\'' 'a' .. 'z'
					{
					match('\''); 
					matchRange('a','z'); 
					}
					break;
				case 2 :
					// ./src/ulNoActions.g:155:35: 'A' .. 'Z' '\\''
					{
					matchRange('A','Z'); 
					match('\''); 
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHARACTERCONSTANT"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./src/ulNoActions.g:159:4: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' )* )
			// ./src/ulNoActions.g:159:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// ./src/ulNoActions.g:159:29: ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '0' && LA6_0 <= '9')||(LA6_0 >= 'A' && LA6_0 <= 'Z')||LA6_0=='_'||(LA6_0 >= 'a' && LA6_0 <= 'z')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// ./src/ulNoActions.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop6;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./src/ulNoActions.g:167:9: ( ( '\\t' | ' ' | ( '\\r' | '\\n' ) )+ )
			// ./src/ulNoActions.g:167:11: ( '\\t' | ' ' | ( '\\r' | '\\n' ) )+
			{
			// ./src/ulNoActions.g:167:11: ( '\\t' | ' ' | ( '\\r' | '\\n' ) )+
			int cnt7=0;
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= '\t' && LA7_0 <= '\n')||LA7_0=='\r'||LA7_0==' ') ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// ./src/ulNoActions.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt7 >= 1 ) break loop7;
					EarlyExitException eee = new EarlyExitException(7, input);
					throw eee;
				}
				cnt7++;
			}

			 _channel = HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ./src/ulNoActions.g:170:9: ( '//' (~ ( '\\r' | '\\n' ) )* ( '\\r' | '\\n' ) )
			// ./src/ulNoActions.g:170:11: '//' (~ ( '\\r' | '\\n' ) )* ( '\\r' | '\\n' )
			{
			match("//"); 

			// ./src/ulNoActions.g:170:16: (~ ( '\\r' | '\\n' ) )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( ((LA8_0 >= '\u0000' && LA8_0 <= '\t')||(LA8_0 >= '\u000B' && LA8_0 <= '\f')||(LA8_0 >= '\u000E' && LA8_0 <= '\uFFFF')) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// ./src/ulNoActions.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop8;
				}
			}

			if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			 _channel = HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	@Override
	public void mTokens() throws RecognitionException {
		// ./src/ulNoActions.g:1:8: ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | IF | ELSE | WHILE | PRINT | PRINTLN | RETURN | BOOL | OP | TYPE | INTEGERCONSTANT | CHARACTERCONSTANT | ID | WS | COMMENT )
		int alt9=24;
		alt9 = dfa9.predict(input);
		switch (alt9) {
			case 1 :
				// ./src/ulNoActions.g:1:10: T__18
				{
				mT__18(); 

				}
				break;
			case 2 :
				// ./src/ulNoActions.g:1:16: T__19
				{
				mT__19(); 

				}
				break;
			case 3 :
				// ./src/ulNoActions.g:1:22: T__20
				{
				mT__20(); 

				}
				break;
			case 4 :
				// ./src/ulNoActions.g:1:28: T__21
				{
				mT__21(); 

				}
				break;
			case 5 :
				// ./src/ulNoActions.g:1:34: T__22
				{
				mT__22(); 

				}
				break;
			case 6 :
				// ./src/ulNoActions.g:1:40: T__23
				{
				mT__23(); 

				}
				break;
			case 7 :
				// ./src/ulNoActions.g:1:46: T__24
				{
				mT__24(); 

				}
				break;
			case 8 :
				// ./src/ulNoActions.g:1:52: T__25
				{
				mT__25(); 

				}
				break;
			case 9 :
				// ./src/ulNoActions.g:1:58: T__26
				{
				mT__26(); 

				}
				break;
			case 10 :
				// ./src/ulNoActions.g:1:64: T__27
				{
				mT__27(); 

				}
				break;
			case 11 :
				// ./src/ulNoActions.g:1:70: IF
				{
				mIF(); 

				}
				break;
			case 12 :
				// ./src/ulNoActions.g:1:73: ELSE
				{
				mELSE(); 

				}
				break;
			case 13 :
				// ./src/ulNoActions.g:1:78: WHILE
				{
				mWHILE(); 

				}
				break;
			case 14 :
				// ./src/ulNoActions.g:1:84: PRINT
				{
				mPRINT(); 

				}
				break;
			case 15 :
				// ./src/ulNoActions.g:1:90: PRINTLN
				{
				mPRINTLN(); 

				}
				break;
			case 16 :
				// ./src/ulNoActions.g:1:98: RETURN
				{
				mRETURN(); 

				}
				break;
			case 17 :
				// ./src/ulNoActions.g:1:105: BOOL
				{
				mBOOL(); 

				}
				break;
			case 18 :
				// ./src/ulNoActions.g:1:110: OP
				{
				mOP(); 

				}
				break;
			case 19 :
				// ./src/ulNoActions.g:1:113: TYPE
				{
				mTYPE(); 

				}
				break;
			case 20 :
				// ./src/ulNoActions.g:1:118: INTEGERCONSTANT
				{
				mINTEGERCONSTANT(); 

				}
				break;
			case 21 :
				// ./src/ulNoActions.g:1:134: CHARACTERCONSTANT
				{
				mCHARACTERCONSTANT(); 

				}
				break;
			case 22 :
				// ./src/ulNoActions.g:1:152: ID
				{
				mID(); 

				}
				break;
			case 23 :
				// ./src/ulNoActions.g:1:155: WS
				{
				mWS(); 

				}
				break;
			case 24 :
				// ./src/ulNoActions.g:1:158: COMMENT
				{
				mCOMMENT(); 

				}
				break;

		}
	}


	protected DFA9 dfa9 = new DFA9(this);
	static final String DFA9_eotS =
		"\13\uffff\7\32\1\uffff\4\32\2\uffff\1\32\3\uffff\1\52\14\32\1\uffff\1"+
		"\67\13\32\1\uffff\1\103\3\32\1\107\2\32\1\67\2\32\1\67\1\uffff\1\114\1"+
		"\116\1\32\1\uffff\1\107\1\67\2\32\1\uffff\1\32\1\uffff\1\123\1\67\1\32"+
		"\1\125\1\uffff\1\67\1\uffff";
	static final String DFA9_eofS =
		"\126\uffff";
	static final String DFA9_minS =
		"\1\11\12\uffff\1\146\1\154\1\150\1\162\1\145\1\162\1\141\1\uffff\1\150"+
		"\1\164\2\157\2\uffff\1\47\3\uffff\1\60\1\164\1\163\2\151\1\164\1\165\1"+
		"\154\1\157\1\141\1\162\1\157\1\151\1\uffff\1\60\1\145\1\154\1\156\1\165"+
		"\1\145\1\163\1\141\1\162\1\151\1\154\1\144\1\uffff\1\60\1\145\1\164\1"+
		"\162\1\60\1\145\1\164\1\60\1\156\1\145\1\60\1\uffff\2\60\1\156\1\uffff"+
		"\2\60\1\147\1\141\1\uffff\1\156\1\uffff\2\60\1\156\1\60\1\uffff\1\60\1"+
		"\uffff";
	static final String DFA9_maxS =
		"\1\175\12\uffff\1\156\1\154\1\150\1\162\1\145\1\162\1\154\1\uffff\1\150"+
		"\1\164\2\157\2\uffff\1\47\3\uffff\1\172\1\164\1\163\2\151\1\164\1\165"+
		"\1\154\1\157\1\141\1\162\1\157\1\151\1\uffff\1\172\1\145\1\154\1\156\1"+
		"\165\1\145\1\163\1\141\1\162\1\151\1\154\1\144\1\uffff\1\172\1\145\1\164"+
		"\1\162\1\172\1\145\1\164\1\172\1\156\1\145\1\172\1\uffff\2\172\1\156\1"+
		"\uffff\2\172\1\147\1\141\1\uffff\1\156\1\uffff\2\172\1\156\1\172\1\uffff"+
		"\1\172\1\uffff";
	static final String DFA9_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\7\uffff\1\22\4\uffff"+
		"\1\24\1\25\1\uffff\1\26\1\27\1\30\15\uffff\1\13\14\uffff\1\23\13\uffff"+
		"\1\14\3\uffff\1\21\4\uffff\1\15\1\uffff\1\16\4\uffff\1\20\1\uffff\1\17";
	static final String DFA9_specialS =
		"\126\uffff}>";
	static final String[] DFA9_transitionS = {
			"\2\33\2\uffff\1\33\22\uffff\1\33\1\uffff\1\1\4\uffff\1\30\1\2\1\3\2\22"+
			"\1\4\1\22\1\5\1\34\12\27\1\uffff\1\6\2\22\3\uffff\32\31\1\7\1\uffff\1"+
			"\10\1\uffff\1\32\1\uffff\1\32\1\25\1\23\1\32\1\14\1\21\2\32\1\13\6\32"+
			"\1\16\1\32\1\17\1\24\1\20\1\32\1\26\1\15\3\32\1\11\1\uffff\1\12",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\35\7\uffff\1\36",
			"\1\37",
			"\1\40",
			"\1\41",
			"\1\42",
			"\1\43",
			"\1\44\12\uffff\1\45",
			"",
			"\1\46",
			"\1\47",
			"\1\50",
			"\1\51",
			"",
			"",
			"\1\30",
			"",
			"",
			"",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
			"\1\53",
			"\1\54",
			"\1\55",
			"\1\56",
			"\1\57",
			"\1\60",
			"\1\61",
			"\1\62",
			"\1\63",
			"\1\64",
			"\1\65",
			"\1\66",
			"",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
			"\1\70",
			"\1\71",
			"\1\72",
			"\1\73",
			"\1\74",
			"\1\75",
			"\1\76",
			"\1\77",
			"\1\100",
			"\1\101",
			"\1\102",
			"",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
			"\1\104",
			"\1\105",
			"\1\106",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
			"\1\110",
			"\1\111",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
			"\1\112",
			"\1\113",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
			"",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\13\32\1\115\16\32",
			"\1\117",
			"",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
			"\1\120",
			"\1\121",
			"",
			"\1\122",
			"",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
			"\1\124",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
			"",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
			""
	};

	static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
	static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
	static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
	static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
	static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
	static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
	static final short[][] DFA9_transition;

	static {
		int numStates = DFA9_transitionS.length;
		DFA9_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
		}
	}

	protected class DFA9 extends DFA {

		public DFA9(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 9;
			this.eot = DFA9_eot;
			this.eof = DFA9_eof;
			this.min = DFA9_min;
			this.max = DFA9_max;
			this.accept = DFA9_accept;
			this.special = DFA9_special;
			this.transition = DFA9_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | IF | ELSE | WHILE | PRINT | PRINTLN | RETURN | BOOL | OP | TYPE | INTEGERCONSTANT | CHARACTERCONSTANT | ID | WS | COMMENT );";
		}
	}

}
