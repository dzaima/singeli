grammar Singeli;

NAME : [a-zA-Z_] [a-zA-Z_0-9]*;

SYMB: '\'' [a-zA-Z_$] [a-zA-Z_$0-9]* '\'';
STR: '"' ~["]* '"';

INT: [1-9] [0-9]* | '0';
HEX: '0' 'x' [0-9a-fA-F]+;

DEC: INT '.' [0-9]+
   |     '.' [0-9]+
   | INT 
   ;

texpr: expr | callable;
callable: NAME ('{' texpr (','texpr)* '}')?;

expr: NAME                                # varExpr
    | '*' expr                            # ptrExpr
    | '[' expr ']' NAME                   # vecExpr
    | '(' expr ')'                        # groupExpr
    | INT                                 # intExpr
    | callable '(' (expr (','expr)*)? ')' # callExpr
    | expr ref='*' expr                   # mulExpr
    | expr ref='+' expr                   # addExpr
    | 'emit' expr STR expr*               # emitExpr
    ;

stt: expr ';'                          # exprStt
   | NAME (':' t=expr)? '=' v=expr ';' # nvarStt
   ;


targ: NAME;
treq: l=expr '=' r=expr #eqReq
    ;
arg: NAME ':' expr;
fn: NAME ('{' targ (','targ)* ('&' treq)* '}')? '(' (arg (','arg)*)? ')' (':' retT=expr)? ('{' stt* retV=expr? '}' | '=>' retV=expr ';');
export: SYMB '=' callable ';';

prog: (fn | export)*;
WS: [ \t\n\r] + -> skip;
     COMMENT: '/*' .*? '*/' -> channel(HIDDEN);
LINE_COMMENT: '//' ~[\r\n]* -> channel(HIDDEN);