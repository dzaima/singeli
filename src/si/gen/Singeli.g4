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

texpr: dyn=':'? expr | callable;
tinv: '{' (texpr (','texpr)*)? '}';
callable: n=NAME t=tinv?;

expr: v=NAME tinv*                        # defExpr
    | v= INT                              # intExpr
    | v=TINT                              # tintExpr
    | v=(THEX|HEX)                        # hexExpr
    | v=F32                               # f32Expr
    | v=F64                               # f64Expr
    | 'true'                              # trueExpr
    | 'false'                             # falseExpr
    | '(' expr ')'                        # groupExpr
    | '*' expr                            # ptrExpr
    | '$' NAME                            # fvecExpr
    | '[' expr ']' NAME                   # vecExpr
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
   | 'exec' '('expr(','expr)*','NAME')' ';' # execStt
   | '@'(c=callable | 'for') '(' (name2(','name2)* 'over')? i=NAME (('from' s=expr)? 'to' e=expr)? ')' stt # forStt
   ;
name2: NAME; // make retreiving separate names simpler

targ: name=NAME ('::' spec=expr)?;
treq: l=expr '=' r=expr #eqReq
    | e=expr            #boolReq
    ;
targs: '{' (targ (','targ)*)? ('&' treq)* '}';
arg: NAME ':' expr;

fn: n=NAME targs? '(' (arg (','arg)*)? ')' (':' retT=expr)? ('=' '{' stt* retV=expr? '}' | '=>' retV=expr ';');

def: 'def' n=NAME targs* ('=' '{' stt* retV=expr? '}' | '=>' retV=expr ';');

export: SYMB '=' callable ';';

prog: (fn | export | def)*;
WS: [ \t\n\r] + -> skip;
     COMMENT: '/*' .*? '*/' -> channel(HIDDEN);
LINE_COMMENT: ('//'|'#') ~[\r\n]* -> channel(HIDDEN);