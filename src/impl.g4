grammar impl;

start   : '.hardware' IDENTIFIER 'inputs' IDENTIFIER '.outputs' IDENTIFIER latchdec '.update' updateDecl* '.simulate' EOF;
latchdec : '.latch' IDENTIFIER '->' IDENTIFIER;
updateDecl : IDENTIFIER '=' (expr)*;

expr     :  expr ('&&' expr)
         | '!' expr ('!' expr)
         |  IDENTIFIER;



D    : ALPHA (ALPHA|NUM) ;
FLOAT : NUM+ ('.' NUM+)? ;
ALPHA : [a-zA-Z_ÆØÅæøå] ;
NUM   : [0-9] ;

OPERATOR : '&&'
         | '!'
         | '||';

RESET : [0] | [1];



IDENTIFIER : [a-zA-Z_] [a-zA-Z0-9_]*;
CONST : [0-9]+ ('.' [0-9]+)? ;
HVIDRUM : [ \t\n\r]+ -> skip ;
KOMMENTAR : '//' ~[\n]* -> skip ;
MULTILINECOMMENTS :  '/*'  ( '*'~[/] | ~[*]  )* '*/' -> skip; 




