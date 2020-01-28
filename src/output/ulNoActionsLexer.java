// $ANTLR null /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g 2020-01-28 02:23:05

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ulNoActionsLexer extends Lexer {
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
	@Override public String getGrammarFileName() { return "/home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g"; }

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:2:7: ( '(' )
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:2:9: '('
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
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:3:7: ( ')' )
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:3:9: ')'
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
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:4:7: ( '*' )
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:4:9: '*'
			{
			match('*'); 
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
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:5:7: ( '+' )
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:5:9: '+'
			{
			match('+'); 
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
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:6:7: ( ',' )
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:6:9: ','
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
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:7:7: ( '-' )
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:7:9: '-'
			{
			match('-'); 
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
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:8:7: ( ';' )
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:8:9: ';'
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
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:9:7: ( '<' )
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:9:9: '<'
			{
			match('<'); 
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
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:10:7: ( '=' )
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:10:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:11:7: ( '==' )
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:11:9: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:12:7: ( '[' )
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:12:9: '['
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
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:13:7: ( ']' )
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:13:9: ']'
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
	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:14:7: ( '{' )
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:14:9: '{'
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
	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:15:7: ( '}' )
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:15:9: '}'
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
	// $ANTLR end "T__32"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:295:4: ( 'if' )
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:295:6: 'if'
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
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:298:6: ( 'else' )
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:298:8: 'else'
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
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:301:7: ( 'while' )
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:301:9: 'while'
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
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:304:7: ( 'print' )
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:304:9: 'print'
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
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:307:9: ( 'println' )
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:307:11: 'println'
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
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:310:8: ( 'return' )
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:310:10: 'return'
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
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:313:6: ( 'true' | 'false' )
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
					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:313:8: 'true'
					{
					match("true"); 

					}
					break;
				case 2 :
					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:314:4: 'false'
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

	// $ANTLR start "TYPE"
	public final void mTYPE() throws RecognitionException {
		try {
			int _type = TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:317:6: ( 'int' | 'float' | 'string' | 'char' | 'boolean' | 'void' )
			int alt2=6;
			switch ( input.LA(1) ) {
			case 'i':
				{
				alt2=1;
				}
				break;
			case 'f':
				{
				alt2=2;
				}
				break;
			case 's':
				{
				alt2=3;
				}
				break;
			case 'c':
				{
				alt2=4;
				}
				break;
			case 'b':
				{
				alt2=5;
				}
				break;
			case 'v':
				{
				alt2=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:317:8: 'int'
					{
					match("int"); 

					}
					break;
				case 2 :
					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:318:6: 'float'
					{
					match("float"); 

					}
					break;
				case 3 :
					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:319:6: 'string'
					{
					match("string"); 

					}
					break;
				case 4 :
					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:320:6: 'char'
					{
					match("char"); 

					}
					break;
				case 5 :
					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:321:6: 'boolean'
					{
					match("boolean"); 

					}
					break;
				case 6 :
					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:322:6: 'void'
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

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:325:4: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' )* )
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:325:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:325:29: ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' | '_' )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:
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
					break loop3;
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

	// $ANTLR start "STRINGCONSTANT"
	public final void mSTRINGCONSTANT() throws RecognitionException {
		try {
			int _type = STRINGCONSTANT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:328:16: ( '\"' ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | ( '0' .. '9' ) | '!' | ',' | '.' | ':' | '_' | '{' | '}' | ' ' )* '\"' )
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:328:18: '\"' ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | ( '0' .. '9' ) | '!' | ',' | '.' | ':' | '_' | '{' | '}' | ' ' )* '\"'
			{
			match('\"'); 
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:328:21: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | ( '0' .. '9' ) | '!' | ',' | '.' | ':' | '_' | '{' | '}' | ' ' )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= ' ' && LA4_0 <= '!')||LA4_0==','||LA4_0=='.'||(LA4_0 >= '0' && LA4_0 <= ':')||(LA4_0 >= 'A' && LA4_0 <= 'Z')||LA4_0=='_'||(LA4_0 >= 'a' && LA4_0 <= '{')||LA4_0=='}') ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:
					{
					if ( (input.LA(1) >= ' ' && input.LA(1) <= '!')||input.LA(1)==','||input.LA(1)=='.'||(input.LA(1) >= '0' && input.LA(1) <= ':')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= '{')||input.LA(1)=='}' ) {
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
					break loop4;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRINGCONSTANT"

	// $ANTLR start "INTEGERCONSTANT"
	public final void mINTEGERCONSTANT() throws RecognitionException {
		try {
			int _type = INTEGERCONSTANT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:331:17: ( ( '0' .. '9' )+ )
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:331:19: ( '0' .. '9' )+
			{
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:331:19: ( '0' .. '9' )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:
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
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
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

	// $ANTLR start "FLOATCONSTANT"
	public final void mFLOATCONSTANT() throws RecognitionException {
		try {
			int _type = FLOATCONSTANT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:334:15: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ )
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:334:17: ( '0' .. '9' )+ '.' ( '0' .. '9' )+
			{
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:334:17: ( '0' .. '9' )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:
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
					if ( cnt6 >= 1 ) break loop6;
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
			}

			match('.'); 
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:334:31: ( '0' .. '9' )+
			int cnt7=0;
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:
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
					if ( cnt7 >= 1 ) break loop7;
					EarlyExitException eee = new EarlyExitException(7, input);
					throw eee;
				}
				cnt7++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOATCONSTANT"

	// $ANTLR start "CHARACTERCONSTANT"
	public final void mCHARACTERCONSTANT() throws RecognitionException {
		try {
			int _type = CHARACTERCONSTANT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:337:19: ( '\\'' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '!' | ',' | '.' | ':' | '_' | '{' | '}' ) '\\'' )
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:337:21: '\\'' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '!' | ',' | '.' | ':' | '_' | '{' | '}' ) '\\''
			{
			match('\''); 
			if ( input.LA(1)=='!'||input.LA(1)==','||input.LA(1)=='.'||(input.LA(1) >= '0' && input.LA(1) <= ':')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= '{')||input.LA(1)=='}' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHARACTERCONSTANT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:345:9: ( ( '\\t' | ' ' | ( '\\r' | '\\n' ) )+ )
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:345:11: ( '\\t' | ' ' | ( '\\r' | '\\n' ) )+
			{
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:345:11: ( '\\t' | ' ' | ( '\\r' | '\\n' ) )+
			int cnt8=0;
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( ((LA8_0 >= '\t' && LA8_0 <= '\n')||LA8_0=='\r'||LA8_0==' ') ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:
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
					if ( cnt8 >= 1 ) break loop8;
					EarlyExitException eee = new EarlyExitException(8, input);
					throw eee;
				}
				cnt8++;
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
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:348:9: ( '//' (~ ( '\\r' | '\\n' ) )* ( '\\r' | '\\n' ) )
			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:348:11: '//' (~ ( '\\r' | '\\n' ) )* ( '\\r' | '\\n' )
			{
			match("//"); 

			// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:348:16: (~ ( '\\r' | '\\n' ) )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( ((LA9_0 >= '\u0000' && LA9_0 <= '\t')||(LA9_0 >= '\u000B' && LA9_0 <= '\f')||(LA9_0 >= '\u000E' && LA9_0 <= '\uFFFF')) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:
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
					break loop9;
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
		// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:1:8: ( T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | IF | ELSE | WHILE | PRINT | PRINTLN | RETURN | BOOL | TYPE | ID | STRINGCONSTANT | INTEGERCONSTANT | FLOATCONSTANT | CHARACTERCONSTANT | WS | COMMENT )
		int alt10=29;
		alt10 = dfa10.predict(input);
		switch (alt10) {
			case 1 :
				// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:1:10: T__19
				{
				mT__19(); 

				}
				break;
			case 2 :
				// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:1:16: T__20
				{
				mT__20(); 

				}
				break;
			case 3 :
				// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:1:22: T__21
				{
				mT__21(); 

				}
				break;
			case 4 :
				// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:1:28: T__22
				{
				mT__22(); 

				}
				break;
			case 5 :
				// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:1:34: T__23
				{
				mT__23(); 

				}
				break;
			case 6 :
				// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:1:40: T__24
				{
				mT__24(); 

				}
				break;
			case 7 :
				// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:1:46: T__25
				{
				mT__25(); 

				}
				break;
			case 8 :
				// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:1:52: T__26
				{
				mT__26(); 

				}
				break;
			case 9 :
				// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:1:58: T__27
				{
				mT__27(); 

				}
				break;
			case 10 :
				// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:1:64: T__28
				{
				mT__28(); 

				}
				break;
			case 11 :
				// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:1:70: T__29
				{
				mT__29(); 

				}
				break;
			case 12 :
				// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:1:76: T__30
				{
				mT__30(); 

				}
				break;
			case 13 :
				// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:1:82: T__31
				{
				mT__31(); 

				}
				break;
			case 14 :
				// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:1:88: T__32
				{
				mT__32(); 

				}
				break;
			case 15 :
				// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:1:94: IF
				{
				mIF(); 

				}
				break;
			case 16 :
				// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:1:97: ELSE
				{
				mELSE(); 

				}
				break;
			case 17 :
				// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:1:102: WHILE
				{
				mWHILE(); 

				}
				break;
			case 18 :
				// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:1:108: PRINT
				{
				mPRINT(); 

				}
				break;
			case 19 :
				// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:1:114: PRINTLN
				{
				mPRINTLN(); 

				}
				break;
			case 20 :
				// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:1:122: RETURN
				{
				mRETURN(); 

				}
				break;
			case 21 :
				// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:1:129: BOOL
				{
				mBOOL(); 

				}
				break;
			case 22 :
				// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:1:134: TYPE
				{
				mTYPE(); 

				}
				break;
			case 23 :
				// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:1:139: ID
				{
				mID(); 

				}
				break;
			case 24 :
				// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:1:142: STRINGCONSTANT
				{
				mSTRINGCONSTANT(); 

				}
				break;
			case 25 :
				// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:1:157: INTEGERCONSTANT
				{
				mINTEGERCONSTANT(); 

				}
				break;
			case 26 :
				// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:1:173: FLOATCONSTANT
				{
				mFLOATCONSTANT(); 

				}
				break;
			case 27 :
				// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:1:187: CHARACTERCONSTANT
				{
				mCHARACTERCONSTANT(); 

				}
				break;
			case 28 :
				// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:1:205: WS
				{
				mWS(); 

				}
				break;
			case 29 :
				// /home/braydon/Desktop/Spring2020/Compilers/src/ulNoActions.g:1:208: COMMENT
				{
				mCOMMENT(); 

				}
				break;

		}
	}


	protected DFA10 dfa10 = new DFA10(this);
	static final String DFA10_eotS =
		"\11\uffff\1\40\4\uffff\13\31\2\uffff\1\56\5\uffff\1\60\14\31\3\uffff\1"+
		"\75\13\31\1\uffff\1\111\3\31\1\115\3\31\1\75\1\31\1\75\1\uffff\1\122\1"+
		"\124\1\31\1\uffff\1\115\1\75\2\31\1\uffff\1\31\1\uffff\1\131\1\75\1\31"+
		"\1\133\1\uffff\1\75\1\uffff";
	static final String DFA10_eofS =
		"\134\uffff";
	static final String DFA10_minS =
		"\1\11\10\uffff\1\75\4\uffff\1\146\1\154\1\150\1\162\1\145\1\162\1\141"+
		"\1\164\1\150\2\157\2\uffff\1\56\5\uffff\1\60\1\164\1\163\2\151\1\164\1"+
		"\165\1\154\1\157\1\162\1\141\1\157\1\151\3\uffff\1\60\1\145\1\154\1\156"+
		"\1\165\1\145\1\163\1\141\1\151\1\162\1\154\1\144\1\uffff\1\60\1\145\1"+
		"\164\1\162\1\60\1\145\1\164\1\156\1\60\1\145\1\60\1\uffff\2\60\1\156\1"+
		"\uffff\2\60\1\147\1\141\1\uffff\1\156\1\uffff\2\60\1\156\1\60\1\uffff"+
		"\1\60\1\uffff";
	static final String DFA10_maxS =
		"\1\175\10\uffff\1\75\4\uffff\1\156\1\154\1\150\1\162\1\145\1\162\1\154"+
		"\1\164\1\150\2\157\2\uffff\1\71\5\uffff\1\172\1\164\1\163\2\151\1\164"+
		"\1\165\1\154\1\157\1\162\1\141\1\157\1\151\3\uffff\1\172\1\145\1\154\1"+
		"\156\1\165\1\145\1\163\1\141\1\151\1\162\1\154\1\144\1\uffff\1\172\1\145"+
		"\1\164\1\162\1\172\1\145\1\164\1\156\1\172\1\145\1\172\1\uffff\2\172\1"+
		"\156\1\uffff\2\172\1\147\1\141\1\uffff\1\156\1\uffff\2\172\1\156\1\172"+
		"\1\uffff\1\172\1\uffff";
	static final String DFA10_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\uffff\1\13\1\14\1\15\1\16"+
		"\13\uffff\1\27\1\30\1\uffff\1\33\1\34\1\35\1\12\1\11\15\uffff\1\31\1\32"+
		"\1\17\14\uffff\1\26\13\uffff\1\20\3\uffff\1\25\4\uffff\1\21\1\uffff\1"+
		"\22\4\uffff\1\24\1\uffff\1\23";
	static final String DFA10_specialS =
		"\134\uffff}>";
	static final String[] DFA10_transitionS = {
			"\2\35\2\uffff\1\35\22\uffff\1\35\1\uffff\1\32\4\uffff\1\34\1\1\1\2\1"+
			"\3\1\4\1\5\1\6\1\uffff\1\36\12\33\1\uffff\1\7\1\10\1\11\3\uffff\32\31"+
			"\1\12\1\uffff\1\13\1\uffff\1\31\1\uffff\1\31\1\27\1\26\1\31\1\17\1\24"+
			"\2\31\1\16\6\31\1\21\1\31\1\22\1\25\1\23\1\31\1\30\1\20\3\31\1\14\1\uffff"+
			"\1\15",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\37",
			"",
			"",
			"",
			"",
			"\1\41\7\uffff\1\42",
			"\1\43",
			"\1\44",
			"\1\45",
			"\1\46",
			"\1\47",
			"\1\50\12\uffff\1\51",
			"\1\52",
			"\1\53",
			"\1\54",
			"\1\55",
			"",
			"",
			"\1\57\1\uffff\12\33",
			"",
			"",
			"",
			"",
			"",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"\1\61",
			"\1\62",
			"\1\63",
			"\1\64",
			"\1\65",
			"\1\66",
			"\1\67",
			"\1\70",
			"\1\71",
			"\1\72",
			"\1\73",
			"\1\74",
			"",
			"",
			"",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"\1\76",
			"\1\77",
			"\1\100",
			"\1\101",
			"\1\102",
			"\1\103",
			"\1\104",
			"\1\105",
			"\1\106",
			"\1\107",
			"\1\110",
			"",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"\1\112",
			"\1\113",
			"\1\114",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"\1\116",
			"\1\117",
			"\1\120",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"\1\121",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\13\31\1\123\16\31",
			"\1\125",
			"",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"\1\126",
			"\1\127",
			"",
			"\1\130",
			"",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"\1\132",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			""
	};

	static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
	static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
	static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
	static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
	static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
	static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
	static final short[][] DFA10_transition;

	static {
		int numStates = DFA10_transitionS.length;
		DFA10_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
		}
	}

	protected class DFA10 extends DFA {

		public DFA10(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 10;
			this.eot = DFA10_eot;
			this.eof = DFA10_eof;
			this.min = DFA10_min;
			this.max = DFA10_max;
			this.accept = DFA10_accept;
			this.special = DFA10_special;
			this.transition = DFA10_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | IF | ELSE | WHILE | PRINT | PRINTLN | RETURN | BOOL | TYPE | ID | STRINGCONSTANT | INTEGERCONSTANT | FLOATCONSTANT | CHARACTERCONSTANT | WS | COMMENT );";
		}
	}

}
