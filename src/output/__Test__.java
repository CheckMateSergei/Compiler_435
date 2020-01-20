import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        ulNoActionsLexer lex = new ulNoActionsLexer(new ANTLRFileStream("/home/braydon/Desktop/Spring2020/Compilers/tests/accept/fifteen.ul", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        ulNoActionsParser g = new ulNoActionsParser(tokens, 49100, null);
        try {
            g.program();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}