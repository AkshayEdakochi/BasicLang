grammar BasicLang;
parse
 : statemets EOF
 ;
statemets
 : stat+
 ;

stat
 : block
 | assignment
 | if_stat
 | while_stat
 | log
 | kadakkuPurath 
 | sweekarikkukaStatement
 
 //| samkhyaFunction
 | OTHER {System.err.println("unknown char: " + $OTHER.text);}
 ;

 block
  : OBRACE statemets CBRACE
  ;
kadakkuPurath
	: ('കടക്കൂപുറത്ത്'|'കടക്കൂ പുറത്ത്') SCOL
	;

samkhyaFunction
 : 'സംഖ്യ' samkhyaExpr
 ;

samkhyaExpr
 : OPAR (expr|identifier) (',' integerAtom)? CPAR	#directSamkhyaCall
 | OPAR sweekarikkukaExpr CPAR			#SamkhyaSweekarikkuka
 ;

assignment
//Here change the Evalvisitor function of visitAssignment to  variableAssignment
	: variableAssignment
	| shreniInitialisation
	| shreniElementAssignment
	;

variableAssignment
	: ID ASSIGN expr SCOL
	;
shreniInitialisation
	: ID ASSIGN elementList SCOL
	;

elementList
	: OBRACKET shreniElements? ','? CBRACKET	//Receive the Value List and pass it upwards to shreniInitialisation
	;
shreniElements 									//Return a List of elements as Value from here
	: shreniElement (',' shreniElement)*
	;
shreniElement
	: elementList
	| integerAtom
	| floatAtom
	| booleanAtom
	| string
	;
shreniElementAssignment
    : identifier (indexingExpr)+ ASSIGN expr SCOL
    ;

if_stat
 :  expr AANENKIL block (athavaBlock)* (allenkilBlock)?
 ;
 athavaBlock
  : ATHAVA expr AANENKIL block
  ;
 allenkilBlock
    : ALLENKIL block
    ;

while_stat
 : expr AAYIRIKKUMPOL block
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
 : MINUS expr	                        #unaryMinusExpr
 | NOT expr                             #notExpr
 | expr op=(MULT | DIV | MOD) expr      #multiplicationExpr
 | expr op=(PLUS | MINUS) expr          #additiveExpr
 | expr op=(LTEQ | GTEQ | LT | GT) expr #relationalExpr
 | expr op=(EQ | NEQ) expr              #equalityExpr
 | expr AND expr                        #andExpr
 | expr OR expr                         #orExpr
 | samkhyaFunction						#samkhyaFunctionExpr
 | atom                                 #atomExpr
 | shreniIndexed						#shreniIndexedExpr
 | shreniMultipleIndexed				#shreniMultipleIndexedExpr	
 ;
/* 
 unaryMinusExpr
	: MINUS expr
	;
notExpr
	: NOT expr
	;
*/
 
shreniIndexed
	: identifier indexingExpr
	;
shreniMultipleIndexed
	: shreniIndexed indexingExpr+
	;
//fragment
indexingExpr
	: OBRACKET expr CBRACKET
	;
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
OBRACKET : '[';
CBRACKET : ']';

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