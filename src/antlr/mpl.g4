grammar MPL;

@header {
    package mpl.antlr;
}

goal
    : header
      body
      EOF
    ;

header
    : attribute* 
    ;

attribute
    : attrKey ':' attrVal ';'
    ;

attrKey
    : ID
    ;

attrVal
    : ~(';')*
    ;

body
    : expr*
    ;

expr
    : measure
    | repeat
    ;

measure
    : '|' notes
    ;

notes
    : note+
    ;

note
    : ('#'|'_')* TONE'\''*
    ;

TONE
    : [a-gA-G]
    ;

repeat
    : '[' expr* ']'
    ;

WS
    :   [ \r\t\n]+ -> skip
    ;

ID
    : [a-zA-Z_][0-9a-zA-Z_]*
    ;

