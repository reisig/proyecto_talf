grammar Catalog2;

prog : 
		(statement SEMICOLON)*
       | (assignment)*
       | (control_flow)*
	   ;

statement:
            PRINT LPAREN expresion RPAREN
         |  COPY LPAREN expresion COMMA expresion RPAREN
         |  MOVE LPAREN expresion COMMA expresion RPAREN
         |  DELETE LPAREN expresion RPAREN 
         ;

assignment:
              ID ASSIGN expresion SEMICOLON
			  ;  
                     
control_flow   :
            IF LPAREN (expresion) RPAREN 
            LBRACE (statement)* RBRACE
            (ELSE LBRACE (statement)* RBRACE)*
            (ELSEIF LPAREN (expresion) RPAREN 
             LBRACE (statement)* RBRACE)* #ifCondition
        |   FOR LPAREN expresion (IN|INSIDE) expresion 
            (COLON 'sort' LPAREN ID COMMA ('1'|'-1') RPAREN)? RPAREN 
            LBRACE  (statement)* RBRACE   #forCycle
        ;

expresion :
              LPAREN expresion RPAREN
            | (EXCL|MINUS) expresion
            | expresion op=(MULT|DIV|MOD) expresion
            | expresion op=(PLUS|MINUS) expresion
            | expresion AND expresion
            | expresion OR expresion
            | expresion op=(EQUALS|NOTEQ|GT|LT|GTE|LTE) expresion
            | NUMBER
            | tf = (TRUE|FALSE)
            | ID
            | STRING PERIOD ID
			| STRING
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
ID : ('$')(LETTER)(LETTER|DIGIT)*;

STRING : '"' ( '"' '"' | ~('"'))* '"';
WS : (' '|'\t'|'\n' | '\r') -> skip;
COMMENT : '#'(~('\n'|'\r'))* -> skip;
