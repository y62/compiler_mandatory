grammar impl;

start   : '.hardware' x1=IDENTIFIER '.inputs'
        x2=IDENTIFIER '.outputs' x3=IDENTIFIER+
        latchdec '.update' updateDecl+
        '.simulate' simInp EOF                        #Program //Sequence
        ;

latchdec : '.latch' x1=IDENTIFIER '->' x2=IDENTIFIER  #Latch
         ;
updateDecl : x1=IDENTIFIER '=' e1=expr*               #Update
         ;
expr     : '!' e1=expr                                #Not
         | e1=expr '&&' e2=expr                       #And
         | c=NUM		     	                      #Constant
         | x1=IDENTIFIER                              #Variable
         ;

simInp   : x1=IDENTIFIER '=' c=NUM                    #Simulate
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




