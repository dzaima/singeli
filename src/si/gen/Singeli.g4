grammar Singeli;

NAME : [a-zA-Z_] [a-zA-Z_0-9]*;

SYMB: '\'' [a-zA-Z_$] [a-zA-Z_$0-9]* '\'';
STR: '"' ~["]* '"';

INT: [1-9] [0-9]* | '0';
HEX: '0' 'x' [0-9a-fA-F]+;
TINT: INT [ui] INT;
THEX: HEX [ui] INT;

DEC: INT '.' [0-9]+
   |     '.' [0-9]+
   | INT
   ;
F32: DEC 'f';
F64: DEC 'd';

REL: '<' | '>' | '<=' | '>=';

texpr: expr | callable;
callable: NAME ('{' texpr (','texpr)* '}')?;

expr: v=NAME                              # varExpr
    | v= INT                              # intExpr
    | v=TINT                              # tintExpr
    | v=(THEX|HEX)                        # hexExpr
    | v=F32                               # f32Expr
    | v=F64                               # f64Expr
    | 'true'                              # trueExpr
    | 'false'                             # falseExpr
    | '*' expr                            # ptrExpr
    | '$' NAME                            # fvecExpr
    | '[' expr ']' NAME                   # vecExpr
    | '(' expr ')'                        # groupExpr
    | callable '(' (expr (','expr)*)? ')' # callExpr
    | l=expr ref=('*'|'/') r=expr         # mulExpr
    | l=expr ref=('+'|'-') r=expr         # addExpr
    | l=expr ref=REL       r=expr         # relExpr
    | 'emit' expr STR expr*               # emitExpr
    | e=expr '.' n=NAME                   # fldExpr
    ;

stt: expr ';'                               # exprStt
   | k=NAME ':'t=expr? '=' v=expr ';'       # nvarStt
   | k=NAME '=' v=expr ';'                  # mvarStt
   | 'if' '('c=expr')' t=stt ('else'f=stt)? # ifStt
   | '{' stt* '}'                           # blockStt
   | 'return' e=expr ';'                    # retnStt
   | 'while' '(' c=expr ')' t=stt           # whileStt
   | 'do' t=stt 'while' '(' c=expr ')' ';'  # doWhileStt
   ;


targ: name=NAME ('::' spec=expr)?;
treq: l=expr '=' r=expr #eqReq
    | e=expr            #boolReq
    ;
arg: NAME ':' expr;
fn: NAME ('{' targ (','targ)* ('&' treq)* '}')? '(' (arg (','arg)*)? ')' (':' retT=expr)? ('{' stt* retV=expr? '}' | '=>' retV=expr ';');
export: SYMB '=' callable ';';

prog: (fn | export)*;
WS: [ \t\n\r] + -> skip;
     COMMENT: '/*' .*? '*/' -> channel(HIDDEN);
LINE_COMMENT: ('//'|'#') ~[\r\n]* -> channel(HIDDEN);