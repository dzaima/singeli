grammar Singeli;

NAME : [a-zA-Z_] [a-zA-Z_0-9]*;

SYMB: '\'' (~['] | '\\' ["'nrt])* '\'';

INT: [1-9] [0-9]* | '0';
HEX: '0' 'x' [0-9a-fA-F]+;

DEC: INT '.' [0-9]+
   |     '.' [0-9]+
   | INT 
   ;

type: NAME              # name
    | '*' type          # ptr
    | INT '*' type      # mul
    | '$' NAME          # freg
    | '[' expr ']' NAME # vec
    ;

texpr: type | expr | callable;
callable: NAME ('{' texpr (','texpr)* '}')?;

expr: NAME                                # varExpr
    | '(' expr ')'                        # groupExpr
    | INT                                 # intExpr
    | callable '(' (expr (','expr)*)? ')' # callExpr
    | expr '*' expr                       # mulExpr
    | expr '+' expr                       # addExpr
    ;

stt: expr ';'                      # exprStt
   | NAME (':' type)? '=' expr ';' # nvarStt
   ;


targ: NAME;
arg: NAME ':' type;
fn: NAME ('{' targ (','targ)* '}')? '(' (arg (','arg)*)? ')' (':' type)? ('{' stt* expr? '}' | '=>' expr ';');
export: SYMB '=' callable ';';

prog: (fn | export)*;
WS: [ \t\n\r] + -> skip;
     COMMENT: '/*' .*? '*/' -> channel(HIDDEN);
LINE_COMMENT: '//' ~[\r\n]* -> channel(HIDDEN);