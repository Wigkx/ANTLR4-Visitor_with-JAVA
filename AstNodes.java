/*

define Ast Nodes

*/

import java.io.IOException;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;


public class AstNodes {
    private int evalute_value;
    private ParseTree parse;
    public void dfs_test(org.antlr.v4.runtime.tree.ParseTree ctx){
        // System.out.print("in : ");
        // System.out.printf("%s %d\n", ctx, cnt);
        // for(int i=0; i<ctx.getChildCount(); i++){
        //     org.antlr.v4.runtime.tree.ParseTree next = ctx.getChild(i);
        //     dfs_test(next, cnt+1);
        // }
        // System.out.print("out : ");
        // System.out.printf("%s %d\n", ctx, cnt);
        for(int i=0; i<ctx.getChildCount(); i++){
            org.antlr.v4.runtime.tree.ParseTree next = ctx.getChild(i);
            dfs_test(next);
        }
        if(ctx.getChildCount() == 0){
            System.out.println(ctx);
        }
    }}