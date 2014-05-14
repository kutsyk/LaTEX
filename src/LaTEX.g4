grammar LaTEX;

compilationUnit
:
	documentDeclaration EOF
;

documentDeclaration
:
	'\\begin{document}' documentBody '\\end{document}'
;

documentBody
:
	documentBodyDeclaration
;

documentBodyDeclaration
:
	memberList*
;

memberList
:
	member
	(
		member
	)*
;

member
:
	simpleText
	| numbers
	| captionDeclarator
	| table
	
	| textformatingBlock
	| block
	| texttypeDeclarator
	
	| references
	
	| newcommandDeclaration
	| sectionDeclaration
	| subsectionDeclaration
	| subsubsectionDeclaration
	
	| items
	
	| equation
	
	| paragraph
	| leftBrace
	| rightBrace
	| hyphen
	| colon
	| comma
	| italicDollar
	| newLine
	| apostrophe
	| upperHead
	| bracketsLeft
	| bracketsRight
	
	|bibliography
;

newcommandDeclaration
:
	'\\newcommand' '{' Identificator '}' block
;

block
:
	('{' blockDeclaration* '}')
	|
	('\\left' blockDeclaration* '\\right')
;

blockDeclaration
:
	memberList
;

items:
'\\begin{itemize}'
	itemList
'\\end{itemize}'
;

itemList:
	item*
;

item:
'\\item' memberList
;

table
:
	'\\begin{tabular}' tableDeclaration '\\end{tabular}'
;

tableDeclaration
:
	tableOptions? tableStyle? tableBody
;

tableOptions
:
	'[' simpleText ']'
;

tableStyle
:
	block
;

tableBody
:
	tableBodyDeclaration
;

tableBodyDeclaration
:
	newTableLine*
;

newTableLine
:
	tableLine
	| tableColumns
;

tableLines
:
	tableLine
	(
		tableLine
	)*
;

tableLine
:
	'\\hline'
;

tableColumns
:
	tableColumn
	(
		'&' tableColumn
	)* '\\\\'
;

tableColumn
:
	memberList
;

italicDollar
:
	'$'
;

italicTextDeclaration:
	memberList
;

numbers
:
	INT
;

equation:
'\\begin{equation}'
	memberList
'\\end{equation}'
;

texttypeDeclarator
:
	'\\bf'
	| italictypeDeclaration
	|
	(
		'\\Large'
		| '\\large'
		| '\\LARGE'
	)
	| '\\textbf' memberList*
;

italictypeDeclaration:
	('\\it' memberList*)
	| ('\\textit' memberList*) 
;

textformatingBlock
:
	(
		'\\begin{flushleft}' memberList '\\end{flushleft}'
	)
	|
	(
		'\\begin{figure}' memberList '\\end{figure}'
	)
	|
	(
		'\\begin{center}' memberList '\\end{center}'
	)
;

sectionDeclaration
:
	'\\section*' '{' simpleText '}'
;

subsectionDeclaration
:
	'\\subsection*' '{' simpleText '}'
;

subsubsectionDeclaration
:
	'\\subsubsection*' '{' simpleText '}'
;

captionDeclarator
:
	'\\caption' block
;

references
:
	'\\cite' '{' referencesList '}' 
;

referencesList:
	simpleText (',' simpleText)*
;

formula
:
	mathFormula
	| mathSymbols
;

mathFormula
:
	'\\frac' block block
;

mathSymbols
:
	'\\mathcal' block
	| '\\dot' block
	|
	(
		'\\Psi'
		| '\\psi'
	)
	| '\\kappa'
	| '\\chi'
	| '\\theta'
	|
	(
		'\\Phi'
		| '\\phi'
	)
	| '\\cdot'
	| '\\omega'
	| '\\circ'
	| '\\ast'
	| '\\alpha'
	| '\\in'
	| '\\ast'
	
	| '\\rho'
	
	| '\\overset'
	| '\\underset'
	| '\\sum'
	| '\\overline'
	| '\\sqrt'
	| '\\overline'
	| '\\langle'
	| '\\rangle'
	| '\\tilde'
	| '\\neq'
	| '\\times'
	| '\\pm'
;

bibliography:
	'\\bibliography'
;

paragraph:
	newLine* simpleText (newLine | '\\\\')
;

simpleText
:
	TEXT
	| formula
;

apostrophe:
 '\''
;

hyphen:
 '-'
;

colon:
 ':'
;

leftBrace:
 '('
;

rightBrace:
 ')'
;

bracketsLeft:
 '['
;

bracketsRight:
 ']'
;

comma:
 ','
;

newLine:
	'\n'
	| '\r'
	| '\\\\'
;

upperHead:
'^'
;


INT
:
	[0-9]+
;

Identificator
:
	'\\' STRING
;

INDEX
:
	'_'
	(
		INT
		| STRING
	)
;

TEXT
:
	STRING
	(
		' ' STRING
	)*
;

CHARACTER
:
	[a-zA-Z0-9]
	| '.'
	| '*'
;

STRING
:
	CHARACTER+
	| INT
	| INDEX
;

WS
:
	[\t\u000C]+ -> skip
;

COMMENT
:
	'/*' .*? '*/' -> channel ( HIDDEN )
;

NEW_COUNTER:
'\\newcounter' ~[\r\n]* '\r'? '\n' -> channel ( HIDDEN )
;

SET_COUNTER:
'\\setcounter' ~[\r\n]* '\r'? '\n' -> channel ( HIDDEN )
;

LINE_COMMENT
:
	'%' ~[\r\n]* '\r'? '\n' -> channel ( HIDDEN )
;

DEFINE:
	'\\def' ~[\r\n]* '\r'? '\n' -> channel ( HIDDEN )
;

LABEL:
	'\\label' ~[\r\n]* '\r'? '\n' -> channel ( HIDDEN )
;

BEGIN_OF_DOCUMENT
:
	'\\documentclass' .*? '\\beginOfDocument' -> skip
;
