grammar LaTEX;

compilationUnit
:
	newLine* startingDeclaration* newLine* documentDeclaration newLine* EOF
;

documentDeclaration
:

	'\\begin{document}' documentBody '\\end{document}'
;

startingDeclaration:
	newCommandList	
;

newCommandList:
	(newcommandDeclaration | renewcommandDeclaration)
	(newcommandDeclaration | renewcommandDeclaration | newLine) *
;

documentBody
:
   '\n'* frontPart '\n'* bodyPart
;

frontPart:
    '\\begin{flushleft}'
    '\n'*
    frontBody
    '\n'*
    '\\end{flushleft}'
;

frontBody:
    mainTitle
    '\n'*
    authorList
    '\n'*
    address+

    memberList
;

mainTitle:
    '{'
    '\\Large' '\n'*
    '\\textbf' '\n'*
    '\\newline'?
    '{' text '}' '\n'*
    '}'
    '\n'*
    '\\newline'?
;

authorList:
'\\\\'
    author (',' author)*
    '\n'*
 '\\\\'
;
author:
  authorName  '\\textsuperscript' textsuperscriptBlock
;

textsuperscriptBlock:
'{' (numbers | '*' | specialCharacters | ',')+ '}'
;

authorName:
    text
;

address:
    '\\bf' '{' numbers '}' text
    '\\\\' '\n'*
;

bodyPart:
    memberList*
;

memberList
:
	member member*
;

member
:

    specialCharacters
    | title
	| table
	| abstractBlock
	
	| textRules
	
	| figureBlock
	| supplementaryFigureBlock
	
	| algorithmBlock
	| algorithmicBlock
	
	| input
	| output
	| state
	| forBlock
	| ifBlock
	| returnBlock
	
	| captionBlock
	| multicolsBlock

	| label
	
	| descriptionList

	| sectionDeclaration
	| subsectionDeclaration
	| subsubsectionDeclaration

	| renewcommandDeclaration

	| citeReferences
	| ref

	| newLine
	| url
	
	//---to skip
	| ifThenElse
	| authorItemMiss
;

landScapeBlock:
	'\\begin{landscape}'
		memberList
	'\\end{landscape}'
;

textRules:
	dollarBlock
	| textSymbols
	| landScapeBlock
	| inlineEquation
	| equationBlock
	| displayEquation
	
	| paragraph
	
	| list
	| textformatingBlockFlushLeft
	| textformatingBlockCenter
	| textSC
	
	| block
	
	| texttypeDeclarator

	| interval	
	| measures
	| simpleText+

	| arabic
	| identificator
	| multicolumn
	| dots
	| comma
	| colon
;
	
textSymbols:
	dot
	| appos
	| lparen
	| rparen
	| '-'
	| '/'
	| '*'
	| '@'
;

paragraph:
	('\\paragraph' '{' memberList* '}')
	|
	('\\paragraph*' '{' memberList* '}')
;

text:
	 textBody textBody*
;

textBody:
	boxBlock | texttypeDeclarator | simpleText | textSymbols | dollarBlock | block | colon | comma | url  | '\n'
;

textSC:
	'\\textsc' block
;
label
:
	'\\label' '{' text '}'
;

boxBlock:
	'\\mbox' block
;

abstractBlock:
	('\\begin{abstract}'
			memberList*
	'\\end{abstract}'
	)
	|
	( '\\Abstract' block ) 
;

title:
	'\\title' block
;

newcommandDeclaration
:
	'\\newcommand' '{' identificator '}' options* commandBody
; 

commandBody
:
	(~('\n'))+ '\n'
;

renewcommandDeclaration
:
	'\\renewcommand' '{' identificator '}' options* commandBody
;

identificator:
	'\\' simpleText
;

block
:
	(
		'{' memberList* '}'
	)
	|
	(
		'\\left' memberList* '\\right'
	)
;

multicolsBlock:
	'\\begin{multicols}' '{'INT'}' memberList*  '\\end{multicols}'
;

list:
	('\\begin{enumerate}' options* items '\\end{enumerate}')
	| ('\\begin{itemize}' items '\\end{itemize}')
;

items:
	item*
;

item:
	'\n'* '\\item' memberList*
;

descriptionList:
	('\\begin{description}' descriptionItems '\\end{description}')
;

descriptionItems:
	descriptionItem*
;

descriptionItem:
	'\n'* '\\item' descriptionTitle memberList*
;

descriptionTitle:
	'[' memberList* ']'
;

captionBlock:
	'\\caption' options? newLine* block
;


table:
    '\\begin{table}' options?
    '\n'*
    '\\begin{adjustwidth}{-2.25in}{0in}'*
    '\n'*
    tableCaption
    '\n'*
    tabular
    '\n'*
    tableDefinition
    '\n'*
    label
    '\n'*
    '\\end{adjustwidth}'*
    '\n'*
    '\\end{table}'
;

tableCaption:
     '\\caption' block
;

tabular:
    '\\begin{tabular}' tableSkipBlock
    '\n'*
    '\\hline'
    '\n'*
    (tableRow '\\\\ \\hline' '\n')+
    '\\end{tabular}'
;

tableSkipBlock:
    '{' (~('}'))+ '}'
;

tableDefinition:
    '\\begin{flushleft}'
        memberList
    '\\end{flushleft}'
;

multicolumn:
	'\\multicolumn' block tableSkipBlock block?
;

tableRow:
    tableCell ('&' tableCell)*
;

tableCell:
    '$'? memberList '$'?
;

texttypeDeclarator
:
	 italictypeDeclaration
	| smallcapsDeclaration
	| boldTypeDeclaration
	| ('\\Large' | '\\large'	| '\\LARGE')
	| ttStyle
;

ttStyle:
	'{\\tt' memberList* '}'
;

boldTypeDeclaration:
	('\\textbf' block)
	| ('{\\bf' memberList* '}')
	| ('\\bf' '{' memberList* '}')
;

smallcapsDeclaration:
	'{\\sc' text* '}'
;

italictypeDeclaration
:
	italicBlock
	| italicOutBlock
;

italicBlock:
	('{\\em' memberList* '}')
	| ('{\\it' memberList* '}' '\\'?)
;

italicOutBlock:
	('\\textit' block)
	| ('\\emph' block)
;

textformatingBlockFlushLeft
:
	'\\begin{flushleft}' memberList '\\end{flushleft}'
;

textformatingBlockCenter
:
	'\\begin{center}' memberList* '\\end{center}'
;

sectionDeclaration
:
	(('\\section*' | '\\section') '{' label? text '}')
;

subsectionDeclaration
:
	(('\\subsection*' | '\\subsection') '{' label? text '}')
;

subsubsectionDeclaration
:
	(('\\subsubsection*' | '\\subsubsection') '{' label? text '}')
;

citeReferences
:
	'~'? ('\\cite'| '\\citep' | '\\citet' | '\\citemain') options* '{' citeReferencesList '}'
;

citeReferencesList
:
	citeReference
	(
		',' '\n'* citeReference '\n'* 
	)*
;

citeReference:
	(simpleText | lparen | rparen | colon)*
;

measures: 
	' ms'
	|' Hz'
;

figureBlock:
('\\begin{figure}' options? memberList*  '\\end{figure}')
|
('\\begin{figure*}'  options? memberList* '\\end{figure*}') 
;

supplementaryFigureBlock:
('\\begin{suppfigure}'  options? memberList* '\\end{suppfigure}')
|
('\\begin{suppfigure*}'  options? memberList* '\\end{suppfigure*}')
;

algorithmBlock:
	'\\begin{algorithm}'  options? memberList* '\\end{algorithm}'
;

algorithmicBlock:
	'\\begin{algorithmic}'  options? memberList* '\\end{algorithmic}'
;

input:
	'\\REQUIRE' block
;

output:
	'\\ENSURE' block
;

state:
	'\\STATE' textRules* newLine
;

forBlock:
	'\\FOR' block
;

ifBlock:
	'\\IF' block
;

returnBlock:
	'\\RETURN' textRules* newLine
;

IgnoreAlgorithmKeyWords:
	(
	'\\ENDIF'
	| '\\ENDFOR'
	) -> skip
;

IgnoreUrlPrefix:
 ( '\\urlprefix' (~'}')+ '}' ) -> skip
;

url:
'\\url' '{' urlText '}'
;

urlText:
    text
;

options:
	'[' (~(']'))* ']'
;

comma:',';
dot:'.';
dots:'\\dots';
appos:'\\\'';
colon: ':';
lparen: '(' ;
rparen: ')' ;

dollarBlock:
	('$' (~('$'))? '$')
;


inlineEquation:
	('$$' (~('$$'))+ '$$')
	| dollarBlock
	| ('\\begin{align}' (~('\\end{align}'))+ '\\end{align}')
	| ('\\begin{align*}' (~('\\end{align*}'))+ '\\end{align*}')
	| ('\\begin{subequations}' (~('\\end{subequations}'))+ '\\end{subequations}')
	| ('\\beqa'(~('\\eea'))+  '\\eea')
	| eqnArray
;

equationBlock:
    ('\\begin{equation}' label (~('\\end{equation}'))+ '\\end{equation}')
   	|
    ('\\begin{equation*}' label (~('\\end{equation*}'))+  '\\end{equation*}')
;

displayEquation:
	('\\[' (~('\\]'))+ '\\]')
;

eqnArray:
	('\\begin{eqnarray*}'
		(~('\\end{eqnarray*}'))+
	'\\end{eqnarray*}'
	) |
	('\\begin{eqnarray}'
		(~('\\end{eqnarray}'))+
	'\\end{eqnarray}'
	)
;

eqnArrayBody:
	(eqnEquation | '&')*
;

eqnEquation:
	(~('&' | '\\end{eqnarray*}' | '\\end{eqnarray}'))+
;

newLine
:
	'\n'
	| doubleSlash	
;

doubleSlash:
	'\\\\'
;

ref:
	'~' '('? '\\ref{' text '}' ')'?
;

simpleText:	
	String
	| numbers
	/*
	| Supplementary

	| numbers
	| texttypeDeclarator
	| url

	| 'number'
	| 'Figure'
	| 'Fig.'
	| 'Figures'
	| 'Table'
	| 'begin'
	| 'multicols'
	| 'et'
	| 'al'

	| 'and'
	| 'journal'
	| 'author'
	| 'title'
	| 'volume'

	| '\\lorem\\'
	| '\\ipsum\\'
	*/
;

interval:
	numbers'-'numbers
;

numbers
:
	Num
;

arabic:
	'\\arabic'
;

/*
 * 	TOKENS
 */

String
:
	NameStartChar NameChar*
;

Num
:
    INT
    | DOUBLE
;


specialCharacters:
'\\ddag'
| '\\Yinyang'
| '\\textcurrency'
| '\\textcurrency a'
| '\\dag'
| '\\textpilcrow'
;


INT :  '0'..'9'+ ;
fragment DOUBLE :   '0'..'9'+'.''0'..'9'+ ;
fragment
NameChar
	:   NameStartChar
	|   '0'..'9'
	|   '_'
	|   '\u00B7'
	|   '\u0300'..'\u036F'
	|   '\u203F'..'\u2040'
	;

fragment
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
	; // ignores | ['\u10000-'\uEFFFF] ;

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
DIV             : '/';
BITAND          : '&';
BITOR           : '|';
CARET           : '^';
MOD             : '%';

// Skip part

COMMENT
:
	'/*' .*? '*/' -> skip
;

LINE_COMMENT
:
	'%' ~[\r\n]* '\r'? '\n' -> skip
;

WS:  ('\t' | ' ' | '\r' | '\u000C')+ -> skip;


WORDS_TO_SKIP:
	 ( '\\indent'
	 | '\\noindent'
	 | '\\renewcommand'
	 | '\\Keywords'
	 | '\\par'
	 | '\\centering'
	 | '\\small'
	 | '\\footnotesize'
	 | '\\/'
	 | '\\clearpage'
	 | '\\begin{bmcformat}'
	 | '\\end{bmcformat}'
	 | '\\lorem\\'
	 | '\\ipsum\\'
	 ) -> skip
;

ifThenElse:
	'\\ifthenelse' 	block block block
;

ifThenText:
	(simpleText
	| '\\'
	| '{'
	| '}'
	)*
;

//---------------------------------------------------------

authorItemMiss:
	('\\author' options* block)
;

Skip
:
	('\\NeedsTeXFormat'
	| '\\input'
	| '\\onecolumn'
	| '\\setcounter'
	| '\\newcounter'
	| '\\pagebreak'
	| '\\def'
	| '\\ProvidesPackage'
	| '\\maketitle'
	| '\\RequirePackage'
	| '\\bibliographystyle'
	| '\\affil'
	| '\\includegraphics'
	| '\\nofloatfigure'
	| '\\bottomrule'
	| '\\toprule'
	| '\\medskip'
	| '\\smallskip'
	
	| '\\bibliographymain'
	| '\\refstepcounter'
	| '\\toprule'
	| '\\midrule'
	| '\\bottomrule'
	| '\\newpage'
	
	| '\\vspace'

	)
	 ~[\r\n]* '\r'? '\n' -> skip
;

Affil
:
	'\\affil' ~[\r\n]* '\r'? '\n' -> skip
;