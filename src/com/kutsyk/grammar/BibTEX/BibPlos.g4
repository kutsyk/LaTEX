grammar BibPlos;

compilationUnit:
    acknowledgment
    refs
;

acknowledgment:
  '\\section*{' ('Acknowledgments' | 'acknowledgments') '}'
    (simpleText | COMMA | DOT)+
;

refs:
    '\\begin{thebibliography}{' Text '}'
     bibItem+
     '\\end{thebibliography}'
;

bibItem:
    '\\bibitem' LBRACE bibLabel RBRACE
    authorList '.' additionalInfo
;

authorList:
    author (COMMA author)*
;

author:
    simpleText+
;

additionalInfo:
    (simpleText
    | DOT
    | COMMA
    | LPAREN
    | RPAREN
    )*
;

bibLabel:
    simpleText
;

bibYear:
    simpleText
;

title:
    simpleText* DOT
;

address:
    simpleText* Text* COMMA
;

publishing:
    simpleText* DOT
;

simpleText:
    Text
;

/*
 * 	TOKENS
 */

Text:
    (String | Number)+
;

String
:
	NameStartChar NameChar*
;

Number
:
    INT
    | DOUBLE
;

INT :  '0'..'9'+ ;
DOUBLE :   '0'..'9'+'.''0'..'9'+ ;

NameChar
	:   NameStartChar
	|   '0'..'9'
	|   '_'
	|   COLON
	|   '\u00B7'
	|   '\u0300'..'\u036F'
	|   '\u203F'..'\u2040'
	;

NameStartChar
	:   'A'..'Z'
	|   'a'..'z'
	|   '\u00C0'..'\u00D6'
	|   '\u00D8'..'\u00F6'
	|   '\u00F8'..'\u02FF'
	|   '\u0370'..'\u037D'
	|   '\u037F'..'\u1FFF'
	|   '\u200C'..'\u200D'
	|   '\u2070'..'\u218F'
	|   '\u2C00'..'\u2FEF'
	|   '\u3001'..'\uD7FF'
	|   '\uF900'..'\uFDCF'
	|   '\uFDF0'..'\uFFFD'
	|   COLON
	|   SEMI
	|   SUB
	|   '/'
	;

ASSIGN          : '=';
GT              : '>';
LT              : '<';
BANG            : '!';
TILDE           : '~';
QUESTION        : '?';
COLON           : ':';
EQUAL           : '==';
LE              : '<=';
GE              : '>=';
NOTEQUAL        : '!=';
AND             : '&&';
OR              : '||';
INC             : '++';
DEC             : '--';
ADD             : '+';
SUB             : '-';
MUL             : '*';
BITAND          : '&';
BITOR           : '|';
CARET           : '^';

LPAREN          : '(';
RPAREN          : ')';
LBRACE          : '{';
RBRACE          : '}';
LBRACK          : '[';
RBRACK          : ']';
SEMI            : ';';
COMMA           : ',';
DOT             : '.';


//
// Whitespace and comments
//
WS  :  [ \t\r\n\u000C]+ -> skip;

LINE_COMMENT:
	'%' ~[\r\n]* ('\r' | '\n') -> skip
;

SkipString:
    '\\nolinenumbers' ~[\r\n]* ('\r' | '\n') -> skip
;