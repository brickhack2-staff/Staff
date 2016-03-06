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
    : (attribute [\r\n])*
    ;

attribute
    : attrKey ':' attrVal ';'
    ;

attrKey
    : [a-zA-Z_][0-9a-zA-Z_]*
    ;

attrVal
    : ~[;]*
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
    : noteGroup*
    ;

noteGroup
    : note*
    ;

note
    : [#_]*tone'*
    ;

tone
    : [a-hA-H]
    ;

repeat
    : '[' expr* ']'
    ;

WS
    :   [ \r\t\n]* -> skip
    ;
