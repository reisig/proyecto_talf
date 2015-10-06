grammar Catalog;

@header { package model; }

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
	| foreach_stat
	| print
	| copy
	| move
	| delete
	| OTHER {System.err.println("unknown char: " + $OTHER.text);}
	;

assignment
	: ID ASSIGN expr SCOL								
	;
	
if_stat
 	: IF condition_block (ELSE IF condition_block)* (ELSE stat_block)?
 	;
 	
while_stat
	 : WHILE expr stat_block
	 ;
	 
foreach_stat
	: FOREACH OPAR expr op=(IN|INSIDE) expr CPAR stat_block 
	;

print
	 : PRINT expr SCOL
	 ;
	 
copy
	:	COPY OPAR expr COMMA expr CPAR SCOL
	;

move
	:	MOVE OPAR expr COMMA expr CPAR SCOL
	;

delete
	:	DELETE expr SCOL
	;
 	
condition_block
	 : expr stat_block
	 ;

stat_block
	 : OBRACE block CBRACE
	 | stat
	 ;


expr
	 :<assoc=right> expr POW expr           	#powExpr
	 | MINUS expr                           	#unaryMinusExpr
	 | NOT expr                             	#notExpr
	 | expr op=(MULT | DIV | MOD) expr      	#multiplicationExpr
	 | expr op=(PLUS | MINUS) expr          	#additiveExpr
	 | expr op=(LTE | GTE | LT | GT) expr 		#relationalExpr
	 | expr op=(EQ | NEQ) expr              	#equalityExpr
	 | expr AND expr                       	 	#andExpr
	 | expr OR expr                         	#orExpr
	 | expr DOT expr							#dotExpr
	 | CREATE OPAR expr COMMA expr CPAR SCOL	#createExpr
	 | atom                                 	#atomExpr
	 ;

atom
	 : OPAR expr CPAR #parExpr
	 | (INT | FLOAT)  #numberAtom
	 | (TRUE | FALSE) #booleanAtom
	 | ID             #idAtom
	 | STRING         #stringAtom
	 | NIL            #nilAtom
	 ;
	 
	 
OR 		: '||';
AND 	: '&&';
EQ 		: '==';
NEQ 	: '!=';
GT 		: '>';
LT 		: '<';
GTE 	: '>=';
LTE 	: '<=';
PLUS 	: '+';
MINUS 	: '-';
MULT 	: '*';
DIV 	: '/';
MOD 	: '%';
POW 	: '^';
NOT 	: '!';
DOT		: '.';

SCOL 	: ';';
ASSIGN 	: '=';
OPAR 	: '(';
CPAR 	: ')';
OBRACE 	: '{';
CBRACE	: '}';
COMMA	: ',';

TRUE 	: 'true';
FALSE 	: 'false';
NIL 	: 'nil';
IF 		: 'if';
ELSE 	: 'else';
WHILE 	: 'while';
PRINT 	: 'print';
COPY	: 'copy';
MOVE	: 'move';
DELETE	: 'delete';
FOREACH	: 'foreach';
SORT 	: 'sort';
IN		: 'in';
INSIDE	: 'inside';
CREATE	: 'create';

ID
 : LETTER (DIGIT|LETTER)*
 ;

fragment LETTER 
	: [a-zA-Z_]
	;

INT
 : [0-9]+
 ;

fragment DIGIT
	: [0-9]
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