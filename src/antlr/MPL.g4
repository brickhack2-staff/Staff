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
    : ID | TONE
    ;

attrVal
    : ID | TONE
    ;

body
    : expr*
    ;

expr
    : notes //measure
    | repeat
    ;

measure
    : '|' notes '|'?
    ;

notes
    : note+
    ;

note
    : accidentals TONE octaves
    ;

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

WS
    :   [ \r\t\n|]+ -> skip
    ;

COMMENT
    : '/*' .*? '*/' -> skip
    ;

LINE_COMMENT
    : '//' ~[\r\n]* -> skip
    ;


TONE
    : [a-gA-G]
    ;

ID
    :   TONE | [a-zA-Z]([0-9a-zA-Z])+ | [h-zH-Z]
    ;

