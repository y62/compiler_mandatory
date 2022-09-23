grammar impl3;

start   : e1=expr EOF;  

/*
command : IDENTIFIER '=' expr ';'
	| 'while' '(' condition ')' block 
	;
	
block : '{' command* '}'
      | command
      ;

condition : expr ('>'|'<'|'=='|'!=') expr ;
*/

expr : e1=expr op=('*'|'/') e2=expr   # Multiplication
     | e1=expr op=('+'|'-') e2=expr   # Addition
     | '(' e1=expr ')'   	   # Parentheses
     | c=CONST		     	   # Constant
     | x=IDENTIFIER	     	   # Variable
     ;

IDENTIFIER : [a-zA-Z_] [a-zA-Z0-9_]*;

CONST : [0-9]+ ('.' [0-9]+)? ;

HVIDRUM : [ \t\n]+ -> skip ;
KOMMENTAR : '//' ~[\n]* -> skip ;
MULTILINECOMMENTS :  '/*'  ( '*'~[/] | ~[*]  )* '*/' -> skip; 

