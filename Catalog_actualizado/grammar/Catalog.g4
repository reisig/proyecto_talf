/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar Catalog;

tokens { STATEMENTS, REVERSE, FOR }

file  : (stmt SEMI)* EOF;	

stmt :
	PRINT (stmt|STRING|NUMBER)					#printStmt
	|	IF or LBRACE (stmt SEMI)* RBRACE   		#ifStmt
	|	COPY stmt STRING   						#copyStmt
	| 	MOVE stmt STRING 						#moveStmt
	| 	DELETE stmt 							#deleteStmt
	|	foreach									#forStmt
	|	VAR ASSIGN stmt 						#assignStmt
	|	or 										#orStmt
        ;		
	
or: and (OR and)*; // ||

and: eqneq (AND eqneq)*; // &&

eqneq: comp ((EQ | NOTEQ) comp)*; // == and !=

comp: addsub ((LESS | LESSEQ | GREAT | GREATEQ) addsub)*; // <, <=, >, >=

addsub: multdiv ((PLUS | MINUS) multdiv)*; // + and -

multdiv: pattern ((TIMES | DIV) pattern)*; // * and /

pattern: property (LPAREN property RPAREN)*;

property: basic (PERIOD basic)*;

basic: 	(ID|VAR|NUMBER|STRING)
        |  MINUS basic 
        |  (TRUE|FALSE)
        |  LPAREN stmt RPAREN ; // basic element
		
foreach: FOREACH VAR (IN | INSIDE) filelist (sort)? LBRACE (stmt SEMI)* RBRACE;

sort: SORT ID ((PLUS|MINUS))?;

filelist: STRING (PERIOD ID)*;

// arithmetic
PLUS: '+';
MINUS: '-';
TIMES: '*';
DIV: '/';
ASSIGN: '=';

// grouping/separating
SEMI: ';';
LPAREN: '(';
RPAREN: ')';
LBRACE: '{';
RBRACE: '}';
PERIOD: '.';

// comparison
EQ: '==';
NOTEQ: '!=';
GREAT: '>';
LESS: '<';
GREATEQ:'>=';
LESSEQ: '<=';

// logical
AND: '&&';
OR: '||';
TRUE: 'true';
FALSE: 'false';

// keywords/commands
PRINT: 'print';
IF: 'if';
COPY: 'cp';
MOVE: 'mv';
DELETE: 'del';
FOREACH: 'foreach';

LETTER : [a-zA-Z];
NUMBER : [0-9]+;
UNDERSC: '_';

IN : 'in';
INSIDE : 'inside';
SORT : 'sortby';

ID : (UNDERSC|LETTER)(UNDERSC|LETTER|NUMBER)*;

VAR: '$' ID;
STRING: '"' ( '"' '"' | ~('"'))* '"'; // string, escape " with ")
WS: (' '|'\t'|'\n'|'\r') -> skip; // white space
COMMENTS: '#'(~('\n'|'\r'))* -> skip; // single line comments
