grammar BasicLang;

parse
 : block EOF
 ;

block
 : stat*
 ;

stat
 : assignment
 | if_stat
 | while_stat
 | log
 | OTHER {System.err.println("unknown char: " + $OTHER.text);}
 ;

assignment
 : ID ASSIGN expr SCOL
 ;

if_stat
 :  expr AANENKIL stat_block_if (ATHAVA condition_block AANENKIL)* (ALLENKIL stat_block)?
 ;

condition_block
 : expr stat_block
 ;

stat_block_if
 : OBRACE block CBRACE
 | stat
 ;

stat_block
 : OBRACE block CBRACE
 | stat
 ;

while_stat
 : expr AAYIRIKKUMPOL stat_block
 ;

log
 : LOG OPAR expr CPAR SCOL
 ;

expr
 : MINUS expr                           #unaryMinusExpr
 | NOT expr                             #notExpr
 | expr op=(MULT | DIV | MOD) expr      #multiplicationExpr
 | expr op=(PLUS | MINUS) expr          #additiveExpr
 | expr op=(LTEQ | GTEQ | LT | GT) expr #relationalExpr
 | expr op=(EQ | NEQ) expr              #equalityExpr
 | expr AND expr                        #andExpr
 | expr OR expr                         #orExpr
 | atom                                 #atomExpr
 ;

atom
 :  OPAR expr CPAR #parExpr
 |  INT            #IntAtom
 |  FLOAT          #FloatAtom
 |  (TRUE | FALSE) #booleanAtom
 |  ID             #idAtom
 |  STRING         #stringAtom
 |  NIL            #nilAtom
 ;

OR : '||';
AND : '&&';
EQ : '==';
NEQ : '!=';
GT : '>';
LT : '<';
GTEQ : '>=';
LTEQ : '<=';
PLUS : '+';
MINUS : '-';
MULT : '*';
DIV : '/';
MOD : '%';
NOT : '!';

SCOL : ';';
ASSIGN : '=';
OPAR : '(';
CPAR : ')';
OBRACE : '{';
CBRACE : '}';

TRUE : 'true';
FALSE : 'false';
NIL : 'nil';
AANENKIL : 'ആണെങ്കില്‍';
ATHAVA  : 'അഥവാ';
ALLENKIL : 'അല്ലെങ്കില്‍';
AAYIRIKKUMPOL : 'ആയിരിക്കുമ്പോള്‍';
LOG : 'പതിക്കുക';

ID
 :[A-Za-z\u0d00-\u0d7f]+
 ;


INT
 : [0-9]+
 ;

FLOAT
 : [0-9]+ '.' [0-9]*
 | '.' [0-9]+
 ;

STRING
 : '"' (~["\r\n] | '""')* '"'
 ;
COMMENT
 : '#' ~[\r\n]* -> skip
 ;
SPACE
 : [ \t\r\n] -> skip
 ;
OTHER
 : .
 ;