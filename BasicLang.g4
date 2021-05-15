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
 | sweekarikkukaStatement
 //| samkhyaFunction
 | OTHER {System.err.println("unknown char: " + $OTHER.text);}
 ;

samkhyaFunction
 : 'സംഖ്യ' samkhyaExpr
 ;

samkhyaExpr
 : OPAR (string|identifier) (',' integerAtom)? CPAR	#directSamkhyaCall
 | OPAR sweekarikkukaExpr CPAR			#SamkhyaSweekarikkuka
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

sweekarikkukaStatement
 : (ID ASSIGN)? sweekarikkukaExpr SCOL
 ;
 sweekarikkukaExpr
 : 'സ്വീകരിക്കുക' OPAR expr? CPAR
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
 | samkhyaFunction						#samkhyaFunctionExpr
 | atom                                 #atomExpr
 ;
/* 
atom
 :  OPAR expr CPAR #parExpr
 |  INT            #IntAtom     
 |  FLOAT          #FloatAtom
 |  (TRUE | FALSE) #booleanAtom
 |  ID             #idAtom
 |  STRING         #stringAtom
 |  NIL            #nilAtom
 ;
 */
 atom
 	: parathesisedExpr
	| integerAtom
	| floatAtom
	| booleanAtom
	| identifier
	| string
	| nil
	;
parathesisedExpr
	: OPAR expr CPAR
	;
integerAtom
	: INT
	;
floatAtom
	: FLOAT
	;
booleanAtom
	: (TRUE | FALSE)
	;
identifier
	: ID
	;
string
	: STRING
	;
nil 
	: NIL
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
 :LETTER(LETTER|DIGIT)*
 ;
fragment
LETTER	:'\u0024'
		|'\u0041'..'\u005a'
		|'\u005f'
		|'\u0061'..'\u007a'
		|'\u00c0'..'\u00d6'
		|'\u00d8'..'\u00f6'
		|'\u00f8'..'\u00ff'
		|'\u0100'..'\u1fff'
		|'\u3040'..'\u318f'
		|'\u3300'..'\u337f' 
		|'\u3400'..'\u3d2d'
		|'\u4e00'..'\u9fff'
		|'\uf900'..'\ufaff'
		| '\u200c'
		| '\u200d'
  	 	;

fragment
DIGIT	:'\u0030'..'\u0039'
		|'\u0660'..'\u0669'
		|'\u06f0'..'\u06f9'
		|'\u0966'..'\u096f'
		|'\u09e6'..'\u09ef'
		|'\u0a66'..'\u0a6f'
		|'\u0ae6'..'\u0aef' 
		|'\u0b66'..'\u0b6f'
		|'\u0be7'..'\u0bef'
		|'\u0c66'..'\u0c6f' 
		|'\u0ce6'..'\u0cef' 
		|'\u0d66'..'\u0d6f' 
		|'\u0e50'..'\u0e59'
		|'\u0ed0'..'\u0ed9'
		|'\u1040'..'\u1049'
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
 : '//' ~[\r\n]* -> skip
 ;
SPACE
 : [ \t\r\n] -> skip
 ;
OTHER
 : . 
 ;