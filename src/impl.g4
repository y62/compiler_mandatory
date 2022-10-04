grammar impl;

start   : '.hardware' IDENTIFIER '.inputs'
        IDENTIFIER '.outputs' IDENTIFIER+
        latchdec '.update' updateDecl+
        '.simulate' simInp EOF                        #Program
        ;

latchdec : '.latch' IDENTIFIER '->' IDENTIFIER        #Latch
         ;
updateDecl : IDENTIFIER '=' expr*                     #Update
         ;
expr     : '!' expr                                   #Expression
         | expr '&&' expr
         |  IDENTIFIER
         ;

simInp   : IDENTIFIER '=' NUM                         #Simulate
         ;

D    : ALPHA (ALPHA|NUM) ;
NUM   : [0-1]+;
FLOAT : NUM+ ('.' NUM+)? ;
ALPHA : [a-zA-Z_ÆØÅæøå] ;
HIGHLOW : [0-1];
IDENTIFIER : [a-zA-Z_] [a-zA-Z0-9_]*;
CONST : [0-9]+ ('.' [0-9]+)? ;
HVIDRUM : [ \t\n\r]+ -> skip ;
KOMMENTAR : '//' ~[\n]* -> skip ;
MULTILINECOMMENTS :  '/*'  ( '*'~[/] | ~[*]  )* '*/' -> skip; 




