grammar BibTex;

options {
  output=AST;
  ASTLabelType=CommonTree;
}

tokens {
  BIBTEXFILE;
  TYPE;
  STRING;
  PREAMBLE;
  COMMENT;
  TAG;
  CONCAT;
}

//////////////////////////////// Parser rules ////////////////////////////////
parse
  :  (entry (Comma? entry)* Comma?)? EOF             -> ^(BIBTEXFILE entry*)
  ;

entry
  :  Type Name Comma tags CloseBrace                 -> ^(TYPE Name tags)
  |  StringType Name Assign QuotedContent CloseBrace -> ^(STRING Name QuotedContent)
  |  PreambleType content CloseBrace                 -> ^(PREAMBLE content)
  |  CommentType                                     -> ^(COMMENT CommentType)
  ;

tags
  :  (tag (Comma tag)* Comma?)?                      -> tag*
  ;

tag
  :  Name Assign content                             -> ^(TAG Name content)
  ;

content
  :  concatable (Concat concatable)*                 -> ^(CONCAT concatable+)
  |  Number
  |  BracedContent
  ;

concatable
  :  QuotedContent
  |  Name
  ;

//////////////////////////////// Lexer rules ////////////////////////////////
Assign
  :  '='
  ;

Concat
  :  '#'
  ;

Comma
  :  ','
  ;

CloseBrace
  :  '}'
  ;

QuotedContent
  :  '"' (~('\\' | '{' | '}' | '"') | '\\' . | BracedContent)* '"'
  ;

BracedContent
  :  '{' (~('\\' | '{' | '}') | '\\' . | BracedContent)* '}'
  ;

StringType
  :  '@' ('s'|'S') ('t'|'T') ('r'|'R') ('i'|'I') ('n'|'N') ('g'|'G') SP? '{'
  ;

PreambleType
  :  '@' ('p'|'P') ('r'|'R') ('e'|'E') ('a'|'A') ('m'|'M') ('b'|'B') ('l'|'L') ('e'|'E') SP? '{'
  ;

CommentType
  :  '@' ('c'|'C') ('o'|'O') ('m'|'M') ('m'|'M') ('e'|'E') ('n'|'N') ('t'|'T') SP? BracedContent
  |  '%' ~('\r' | '\n')*
  ;

Type
  :  '@' Letter+ SP? '{'
  ;

Number
  :  Digit+
  ;

Name
  :  Letter (Letter | Digit | ':' | '-')*
  ;

Spaces
  :  SP {skip();}
  ;

//////////////////////////////// Lexer fragments ////////////////////////////////
fragment Letter
  :  'a'..'z'
  |  'A'..'Z'
  ;

fragment Digit
  :  '0'..'9'
  ;

fragment SP
  :  (' ' | '\t' | '\r' | '\n' | '\f')+
  ;  