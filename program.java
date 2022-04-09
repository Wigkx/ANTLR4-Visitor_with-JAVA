import java.io.IOException;

import org.antlr.v4.runtime.*;

public class program {

    public static void main(String[] args) throws IOException {
        
        String input = "5 + 5 * 3; 1 / 4 ;";
        // Get Lexer
        //TODO : cannot get input
        ExprLexer lexer = new ExprLexer(CharStreams.fromString(input));

        // Get a list of matched tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // Pass tokens to parser
        ExprParser parser = new ExprParser(tokens);
        org.antlr.v4.runtime.tree.ParseTree ctx = parser.expr();
        AstNodes root = new AstNodes();
        root.dfs_test(ctx);
        ctx = parser.expr();
        root.dfs_test(ctx);
        ExprBaseVisitor visitor = new ExprBaseVisitor<>();
        Object obj = visitor.visit(ctx);
        System.out.println(obj);
        
    }
}