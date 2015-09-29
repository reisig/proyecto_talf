grammar Catalog2;

prog : 
		(	  statement
       		| assignment
       		| control_flow
       	)*	
	   ;

statement:
            PRINT LPAREN VAR=expression RPAREN SEMICOLON					#printStatement
         |  COPY LPAREN expression COMMA expression RPAREN SEMICOLON		#copyStatement
         |  MOVE LPAREN expression COMMA expression RPAREN SEMICOLON		#moveStatement
         |  DELETE LPAREN expression RPAREN SEMICOLON						#deleteStatement
         ;

assignment:
              ID ASSIGN expression SEMICOLON								#assign
			  ;  
                     
control_flow   :
            IF LPAREN (expression) RPAREN 
            LBRACE (statement|control_flow)* RBRACE
            (ELSE LBRACE (statement|control_flow)* RBRACE)*
            (ELSEIF LPAREN (expression) RPAREN 
             LBRACE (statement|control_flow)* RBRACE)* #ifCondition
        |   FOR LPAREN expression (IN|INSIDE) expression 
            (COLON 'sort' LPAREN ID COMMA ('1'|'-1') RPAREN)? RPAREN 
            LBRACE  (statement|control_flow)* RBRACE   #forCycle
        ;

expression :
              LPAREN expression RPAREN									#parenExpression
            | (EXCL) expression											#negation
            | expression VAR=(MULT|DIV|MOD) expression					#multDivMod
            | expression VAR=(PLUS|MINUS) expression					#plusMinus
            | expression AND expression									#andOperator
            | expression OR expression									#orOperator
            | expression VAR=(EQUALS|NOTEQ|GT|LT|GTE|LTE) expression 	#comparison
            | VAR=NUMBER												#insertNumber
            | VAR=(TRUE|FALSE)											#trueFalse
            | ID														#insertVariable
            | STRING PERIOD ID											#stringDotId
			| ID PERIOD WORD											#idDotWord
			| VAR=STRING												#stringExpression
            ;

// arithmetic
PLUS    : '+';
MINUS   : '-';
MULT    : '*';
DIV     : '/';
ASSIGN  : '='; 
MOD     : '%';

// grouping/separating
SEMICOLON   : ';';
LPAREN      : '(';
RPAREN      : ')';
LBRACE      : '{';
RBRACE      : '}';
PERIOD      : '.';
COMMA       : ',';
COLON       : ':';

// comparison
EQUALS  : '==';
NOTEQ   : '!=';
GT      : '>';
LT      : '<';
GTE     :'>=';
LTE     : '<=';

// logical
AND     : '&&';
OR      : '||';
TRUE    : 'true';
FALSE   : 'false';
EXCL    : '!';

// keywords/commands
PRINT   : 'print';
IF      : 'if';
COPY    : 'cp';
MOVE    : 'mv';
DELETE  : 'del';
FOR     : 'foreach';
ELSE    : 'else';
ELSEIF  : 'elseif';
IN 		: 'in';
INSIDE	: 'inside';

LETTER  : [a-zA-Z];
DIGIT   : [0-9];
NUMBER  : (DIGIT)+ (PERIOD (DIGIT)+)?;
WORD	: LETTER+;
ID : ('$')(LETTER)(LETTER|DIGIT)*;

STRING : '"' ( '"' '"' | ~('"'))* '"';
WS : (' '|'\t'|'\n' | '\r') -> skip;
COMMENT : '#'(~('\n'|'\r'))* -> skip;
