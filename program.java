import java.io.IOException;
import org.antlr.v4.runtime.*;

public class program {

    public static void main(String[] args) throws IOException {
        
        String input = "1+3;";
        // Get Lexer
        //TODO : cannot get input
        ExprLexer lexer = new ExprLexer(CharStreams.fromString(input));

        // System.out.println(lexer);
        
        // Get a list of matched tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // System.out.println(tokens);
        // Pass tokens to parser
        ExprParser parser = new ExprParser(tokens);
        System.out.println(parser.prog());
        
    }
}