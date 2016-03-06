grammar MPL;

@header {
    package mpl.antlr;
}

goal
    : meta
      body
      EOF
    ;

meta
    : attribute+
    ;

attribute
    : attrKey ':' attrVal ';'
    ;

attrKey
    : ID
    ;

attrVal
    : ID
    ;

body
    : expr*
    ;

expr
    : measure
    | repeat
    ;

measure
    : '|' notes '|'?
    ;

notes
    : note+
    ;

note
    : accidentals ID octaves
    ;

/*
TONE
    : [a-gA-G]
    ;
*/

repeat
    : '[' expr* ']'
    ;

accidentals
    : accidental*
    ;

accidental
    : '_'
    # flat
    | '^'
    # sharp
    ;

octaves
    : octave*
    ;

octave
    : ','
    # downOctave
    | '\''
    # upOctave
    ;

ID
    :   [a-zA-Z][0-9a-zA-Z]*
    ;

WS
    :   [ \r\t\n]+ -> skip
    ;

COMMENT
    : '/*' .*? '*/' -> skip
    ;

LINE_COMMENT
    : '//' ~[\r\n]* -> skip
    ;
