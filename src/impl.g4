grammar impl;

start   : '.hardware' IDENTIFIER 'inputs' IDENTIFIER '.outputs' IDENTIFIER latchdec '.update' EOF;

latchdec : '.latch' IDENTIFIER '->' IDENTIFIER;
updateDecl : IDENTIFIER + '=' + expr;
expr : ('&&' + expr)*;
RESET : [0] | [1];

IDENTIFIER : [a-zA-Z_] [a-zA-Z0-9_]*;
CONST : [0-9]+ ('.' [0-9]+)? ;
HVIDRUM : [ \t\n\r]+ -> skip ;
KOMMENTAR : '//' ~[\n]* -> skip ;
MULTILINECOMMENTS :  '/*'  ( '*'~[/] | ~[*]  )* '*/' -> skip; 




