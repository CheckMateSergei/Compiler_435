import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        simpleLexer lex = new simpleLexer(new ANTLRFileStream("/home/braydon/Desktop/Spring2020/Compilers/Lab2/lab2/input1.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        simpleParser g = new simpleParser(tokens, 49100, null);
        try {
            g.program();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}