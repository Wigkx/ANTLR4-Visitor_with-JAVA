grammar Expr;

// parser rules
prog : ((assign | expr) ';' NEWLINE?)* ;
expr : left=expr op=('*'|'/') right=expr  # opExpr
     | left=expr op=('+'|'-') right=expr  # opExpr
     | val=num                  # numberExpr
     | func=ID '(' num (',' num)+ ')' # funcExpr
     | '(' expr ')'         # parensExpr
     | var=ID                   # idExpr
     ;
num  : '-'? INT
     | '-'? REAL
     ;

assign: ID '=' (num) #varAssign
    ;

// lexer rules
NEWLINE: [\r\n]+ ;
INT: ( [0-9] | ([1-9] [0-9]+) ) ;   // should handle negatives
REAL: ( [0-9] | ([1-9] [0-9]+) ) '.' [0-9]* ; // should handle signs(+/-)
ID: [a-zA-Z]+ ;
WS: [ \t\r\n]+ -> skip ;
