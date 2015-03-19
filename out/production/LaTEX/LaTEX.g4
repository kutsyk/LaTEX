/*
    @author Kutsyk Vasyl
*/

grammar LaTEX;

compilationUnit:
    ('\r' | '\n')* documentDeclaration ('\r' | '\n')* EOF
;

documentDeclaration:
	'\\begin{document}' ('\r' | '\n')* frontPart ('\r' | '\n')* documentBody '\\end{document}'
;

documentBody:
   bodyPart
;

frontPart:
    '\\begin{flushleft}'
    frontBody
    memberList*
    '\\end{flushleft}'
;

frontBody:
    ('\r' | '\n')*
    mainTitle
    ('\r' | '\n')*
    authorList
    address+
;

mainTitle:
    '{'
    '\\Large' ('\r' | '\n')*
    '\\textbf' ('\r' | '\n')*
    '\\newline'?
    '{' text '}' ('\r' | '\n')*
    '}'
    ('\r' | '\n')*
    '\\newline'?
;

authorList:
'\\\\'
    author (',' author)*
    (',')?
    ('\r' | '\n')*
 '\\\\'
;
author:
  authorName  ('\\textsuperscript' | '$^') textsuperscriptBlock ('$')?
;

textsuperscriptBlock:
'{' (numbers | '*' | isoEnt | ',')+ '}'
;

authorName:
    text
;

address:
    ('\r' | '\n')*
    '\\bf' '{' numbers '}' text
    '\\\\' ('\r' | '\n')*
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
    title
	| table
	| abstractBlock

    | block
    | reference

    | label
    | citeReferences
    | reference
    | newLine
	| textRules

	| figureBlock
	| supplementaryFigureBlock

	| captionBlock

	| algorithmBlock
	| algorithmicBlock

	| input
	| output
	| state
	| forBlock
	| ifBlock
	| returnBlock


	| multicolsBlock

	| descriptionList

	| sectionDeclaration
	| subsectionDeclaration
	| subsubsectionDeclaration

	| renewcommandDeclaration
	| url

	//---to skip
	| ifThenElse
;

landScapeBlock:
	'\\begin{landscape}'
		memberList
	'\\end{landscape}'
;

textRules:
	dollarBlock
	| block
	| texttypeDeclarator
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

	| interval
	| measures
	| simpleText+

	| arabic
	| multicolumn
	| dots
	| comma
;

textSymbols:
	dot
	| isoEnt
	| Lparen
	| Rparen

	| COLON
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
	boxBlock | texttypeDeclarator | simpleText | textSymbols | dollarBlock | block | comma | url  | ( '\n' | '\r')
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
	(~('\r' | '\n'))+ ( '\n' | '\r')
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
	item*;

item:
	( '\n' | '\r')* '\\item' memberList*
;

descriptionList:
	('\\begin{description}' descriptionItems '\\end{description}')
;

descriptionItems:
	descriptionItem*
;

descriptionItem:
	( '\n' | '\r')* '\\item' descriptionTitle memberList*
;

descriptionTitle:
	'[' memberList* ']'
;

captionBlock:
	'\\caption' options? newLine* block
;


table:
    '\\begin{table}' options?
    ( '\n' | '\r')*
    '\\begin{adjustwidth}{-2.25in}{0in}'*
    ( '\n' | '\r')*
    tableCaption
    ( '\n' | '\r')*
    tabular
    ( '\n' | '\r')*
    tableDefinition
    ( '\n' | '\r')*
    label
    ( '\n' | '\r')*
    '\\end{adjustwidth}'*
    ( '\n' | '\r')*
    '\\end{table}'
;

tableCaption:
     '\\caption' block
;

tabular:
    '\\begin{tabular}' tableSkipBlock
    ( '\n' | '\r')*
    '\\hline'
    ( '\n' | '\r')*
    (tableRow '\\\\ \\hline' ( '\n' | '\r')?)+
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
	| ('{\\bf' memberList '}')
	| ('\\bf' '{' memberList '}')
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
		',' ( '\n' | '\r')* citeReference ( '\n' | '\r')*
	)*
;

citeReference:
	(simpleText | Lparen | Rparen)*
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
Lparen: '(' ;
Rparen: ')' ;


dollarBlock:
	('$' (~('$'))+ '$')
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
	( '\n' | '\r')
	| doubleSlash
;

doubleSlash:
	'\\\\'
;

reference:
	'~'? simpleText? '('? '\\ref{' text '}' ')'?
;

simpleText:
	String
	| numbers
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
MUL             : '*';
BITAND          : '&';
BITOR           : '|';
CARET           : '^';


// Skip part

COMMENT:
	'/*' .*? '*/' -> skip
;

LINE_COMMENT:
	'%' ~[\r\n]* ('\r' | '\n') -> skip
;

WS:
    ('\t' | ' ' | '\r' | '\u000C')+ -> skip
;


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
	| '\\vspace' )
	~[\r\n]* ('\r' | '\n') -> skip
;

Affil
:
	'\\affil' ~[\r\n]* ('\r' | '\n') -> skip
;

isoEnt:
'=' |
'\\hspace{1em}' |
'\\hspace{0.5em}' |
'\\hspace{0.33em}' |
'\\hspace{0.25em}' |
'\\hphantom{0}' |
'"\\hphantom{' |
'\\hspace{0.167em}' |
'\\hspace{1pt}' |
'---' |
'--' |
'\\textvisiblespace' |
'\\ldots' |
'\\nldr' |
'\\sfrac{1}{3}' |
'\\sfrac{2}{3}' |
'\\sfrac{1}{5}' |
'\\sfrac{2}{5}' |
'\\sfrac{3}{5}' |
'\\sfrac{4}{5}' |
'\\sfrac{1}{6}' |
'\\sfrac{5}{6}' |
'\\incare' |
'\\block' |
'\\uhblk' |
'\\lhblk' |
'\\blocktwenty' |
'\\blockfifty' |
'\\blockeighty' |
'\\marker' |
'\\circ' |
'\\square' |
'\\Rectangle' |
'\\vartriangle' |
'\\triangledown' |
'\\ding{73}' |
'\\bullet' |
'\\blacksquare' |
'\\blacktriangle' |
'\\blacktriangledown' |
'\\blacktriangleleft' |
'\\blacktriangleright' |
'\\ding{168}' |
'\\ding{169}' |
'\\ding{170}' |
'\\ding{171}' |
'\\maltese' |
'\\dag' |
'\\ddag' |
'\\checkmark' |
'\\ding{55}' |
'\\sharp' |
'\\flat' |
'\\male' |
'\\female' |
'\\phone' |
'\\recorder' |
'\\circledP' |
'"\\mathchar""1356"' |
'","' |
'",,"' |
'ff' |
'fi' |
'fj' |
'ffi' |
'ffl' |
'fl' |
'\\mldr' |
'\'\'' |
'\'' |
'\\\'' |
'`' |
'\\`' |
'\\vdots' |
'\\hybull' |
'\\lozenge' |
'\\blacklozenge' |
'\\triangleleft' |
'\\triangleright' |
'\\bigstar' |
'\\natural' |
'\\Rx' |
'\\ding{86}' |
'"\\mathchar""2208"' |
'\\dlcrop' |
'\\drcrop' |
'\\ulcrop' |
'\\urcrop' |
'\\sfrac{1}{2}' |
'\\sfrac{1}{2}' |
'\\sfrac{1}{4}' |
'\\sfrac{3}{4}' |
'\\sfrac{1}{8}' |
'\\sfrac{3}{8}' |
'\\sfrac{5}{8}' |
'\\sfrac{7}{8}' |
'^1' |
'^2' |
'^3' |
'+' |
'\\pm' |
'<' |
'>' |
'\\div' |
'\\times' |
'\\currency' |
'\\pounds' |
'\\$' |
'\\cent' |
'\\yen' |
'\\#' |
'\\%' |
'\\&' |
'\\ast' |
'@' |
'[' |
'\\backslash' |
']' |
'\\{' |
'---' |
'\\vert' |
'\\}' |
'\\mathrm{\\mu}' |
'\\Omega' |
'^\\circ' |
'\\ordm' |
'\\ordf' |
'\\S' |
'\\P' |
'\\cdot' |
'\\leftarrow' |
'\\rightarrow' |
'\\uparrow' |
'\\downarrow' |
'\\copyright' |
'\\textregistered' |
'\\texttrademark' |
'\\brokenvert' |
'\\lnot' |
'\\eighthnote' |
'!' |
'!\'' |
'""""' |
'","' |
'\\lowbar' |
'/' |
'?' |
'?\'' |
'\\guillemotleft' |
'\\guillemotright' |
'\'\'' |
'~' |
'\\-' |
'\\boxh' |
'\\boxv' |
'\\boxur' |
'\\boxul' |
'\\boxdl' |
'\\boxdr' |
'\\boxvr' |
'\\boxhu' |
'\\boxvl' |
'\\boxhd' |
'\\boxvh' |
'\\boxvR' |
'\\boxhU' |
'\\boxvL' |
'\\boxhD' |
'\\boxvH' |
'\\boxH' |
'\\boxV' |
'\\boxUR' |
'\\boxUL' |
'\\boxDL' |
'\\boxDR' |
'\\boxVR' |
'\\boxHU' |
'\\boxVL' |
'\\boxHD' |
'\\boxVH' |
'\\boxVr' |
'\\boxHu' |
'\\boxVl' |
'\\boxHd' |
'\\boxVh' |
'\\boxuR' |
'\\boxUl' |
'\\boxdL' |
'\\boxDr' |
'\\boxUr' |
'\\boxuL' |
'\\boxDl' |
'\\boxdR' |
'\\aleph' |
'\\wedge' |
'\\sqangle' |
'\\sphericalangle' |
'\\approx' |
'\\because' |
'\\bot' |
'\\cap' |
'\\cong' |
'\\oint' |
'\\cup' |
'\\equiv' |
'\\exists' |
'\\forall' |
'\\qeq' |
'\\iff' |
'\\infty' |
'\\int' |
'\\in' |
'\\langle' |
'\\Leftarrow' |
'\\leq' |
'\\mp' |
'\\nabla' |
'\\not=' |
'\\ni' |
'\\vee' |
'\\parallel' |
'\\partial' |
'\\permil' |
'\\perp' |
'{^\\prime}' |
'\\propto' |
'\\surd' |
'\\rangle' |
'\\Rightarrow' |
'\\sim' |
'\\simeq' |
'\\square' |
'\\subset' |
'\\subseteq' |
'\\supset' |
'\\supseteq' |
'\\therefore' |
'\\Vert' |
'\\AA' |
'\\mathscr{B}' |
'\\circ' |
'\\ddot{}' |
'\\ddddot' |
'\\mathscr{H}' |
'\\mathscr{L}' |
'{_\\ast}' |
'\\not\\in' |
'\\mathit{o}' |
'\\mathscr{M}' |
'\\dddot' |
'{\'\'\'}' |
'\\wedgeq' |
'\\alpha' |
'\\beta' |
'\\gamma' |
'\\Gamma' |
'\\digamma' |
'\\delta' |
'\\Delta' |
'\\epsilon' |
'\\varepsilon' |
'\\epsilon' |
'\\zeta' |
'\\eta' |
'\\theta' |
'\\Theta' |
'\\vartheta' |
'\\iota' |
'\\kappa' |
'\\varkappa' |
'\\lambda' |
'\\Lambda' |
'\\mu' |
'\\nu' |
'\\xi' |
'\\Xi' |
'\\pi' |
'\\varpi' |
'\\Pi' |
'\\rho' |
'\\varrho' |
'\\sigma' |
'\\Sigma' |
'\\varsigma' |
'\\tau' |
'\\upsilon' |
'\\Upsilon' |
'\\phi' |
'\\Phi' |
'\\varphi' |
'\\chi' |
'\\psi' |
'\\Psi' |
'\\omega' |
'\\Omega' |
'\\boldsymbol{\\alpha}' |
'\\boldsymbol{\\beta}' |
'\\boldsymbol{\\gamma}' |
'\\boldsymbol{\\Gamma}' |
'\\boldsymbol{\\digamma}' |
'\\boldsymbol{\\delta}' |
'\\boldsymbol{\\Delta}' |
'\\boldsymbol{\\epsilon}' |
'\\boldsymbol{\\varepsilon}' |
'\\boldsymbol{\\epsilon}' |
'\\boldsymbol{\\zeta}' |
'\\boldsymbol{\\eta}' |
'\\boldsymbol{\\theta}' |
'\\boldsymbol{\\Theta}' |
'\\boldsymbol{\\vartheta}' |
'\\boldsymbol{\\iota}' |
'\\boldsymbol{\\kappa}' |
'\\boldsymbol{\\varkappa}' |
'\\boldsymbol{\\lambda}' |
'\\boldsymbol{\\Lambda}' |
'\\boldsymbol{\\mu}' |
'\\boldsymbol{\\nu}' |
'\\boldsymbol{\\xi}' |
'\\boldsymbol{\\Xi}' |
'\\boldsymbol{\\pi}' |
'\\boldsymbol{\\Pi}' |
'\\boldsymbol{\\varpi}' |
'\\boldsymbol{\\rho}' |
'\\boldsymbol{\\varrho}' |
'\\boldsymbol{\\sigma}' |
'\\boldsymbol{\\Sigma}' |
'\\boldsymbol{\\varsigma}' |
'\\boldsymbol{\\tau}' |
'\\boldsymbol{\\upsilon}' |
'\\boldsymbol{\\Upsilon}' |
'\\boldsymbol{\\phi}' |
'\\boldsymbol{\\Phi}' |
'\\boldsymbol{\\varphi}' |
'\\boldsymbol{\\chi}' |
'\\boldsymbol{\\psi}' |
'\\boldsymbol{\\Psi}' |
'\\boldsymbol{\\omega}' |
'\\boldsymbol{\\Omega}' |
'\\angle' |
'\\measuredangle' |
'\\beth' |
'{^\\backprime}' |
'\\complement' |
'\\daleth' |
'\\ell' |
'\\emptyset' |
'\\gimel' |
'\\Im' |
'\\imath' |
'\\jmath' |
'\\nexists' |
'\\circledS' |
'\\hbar' |
'\\re' |
'\\Re' |
'\\smallsetminus' |
'{\'}' |
'\\wp' |
'\\amalg' |
'\\doublebarwedge' |
'\\barwedge' |
'\\Cap' |
'\\Cup' |
'\\curlyvee' |
'\\curlywedge' |
'\\diamond' |
'\\divideontimes' |
'\\intercal' |
'\\leftthreetimes' |
'\\ltimes' |
'\\boxminus' |
'\\circledast' |
'\\circledcirc' |
'\\circleddash' |
'\\odot' |
'\\ominus' |
'\\oplus' |
'\\oslash' |
'\\otimes' |
'\\boxplus' |
'\\dotplus' |
'\\rightthreetimes' |
'\\rtimes' |
'\\cdot' |
'\\boxdot' |
'\\setminus' |
'\\sqcap' |
'\\sqcup' |
'\\smallsetminus' |
'\\star' |
'\\boxtimes' |
'\\top' |
'\\uplus' |
'\\wr' |
'\\bigcirc' |
'\\bigtriangledown' |
'\\bigtriangleup' |
'\\coprod' |
'\\prod' |
'\\sum' |
'\\approxeq' |
'\\asymp' |
'\\backcong' |
'\\backepsilon' |
'\\bowtie' |
'\\backsim' |
'\\backsimeq' |
'\\Bumpeq' |
'\\bumpeq' |
'\\circeq' |
':=' |
'\\curlyeqprec' |
'\\curlyeqsucc' |
'\\preccurlyeq' |
'\\dashv' |
'\\eqcirc' |
'=:' |
'\\doteqdot' |
'\\doteq' |
'\\fallingdotseq' |
'\\eqslantgtr' |
'\\eqslantless' |
'\\risingdotseq' |
'\\pitchfork' |
'\\frown' |
'\\gtrapprox' |
'\\gtrdot' |
'\\geqq' |
'\\gtreqless' |
'\\gtreqqless' |
'\\geqslant' |
'\\ggg' |
'\\gtrless' |
'\\gtrsim' |
'\\gg' |
'\\lessapprox' |
'\\lessdot' |
'\\leqq' |
'\\lesseqqgtr' |
'\\lesseqgtr' |
'\\leqslant' |
'\\lessgtr' |
'\\lll' |
'\\lesssim' |
'\\ll' |
'\\trianglelefteq' |
'\\mid' |
'\\models' |
'\\prec' |
'\\precapprox' |
'\\preceq' |
'\\precsim' |
'\\trianglerighteq' |
'\\smallamalg' |
'\\succ' |
'\\succapprox' |
'\\succcurlyeq' |
'\\succeq' |
'\\succsim' |
'\\smallfrown' |
'\\shortmid' |
'\\smile' |
'\\shortparallel' |
'\\sqsubset' |
'\\sqsubseteq' |
'\\sqsupset' |
'\\sqsupseteq' |
'\\smallsmile' |
'\\Subset' |
'\\subseteqq' |
'\\Supset' |
'\\supseteqq' |
'\\thickapprox' |
'\\thicksim' |
'\\triangleq' |
'\\between' |
'\\vdash' |
'\\Vdash' |
'\\vDash' |
'\\veebar' |
'\\vartriangleleft' |
'\\varpropto' |
'\\vartriangleright' |
'\\Vvdash' |
'\\gnapprox' |
'\\gneq' |
'\\gneqq' |
'\\gnsim' |
'\\gvertneqq' |
'\\lnapprox' |
'\\lneqq' |
'\\lneq' |
'\\lnsim' |
'\\lvertneqq' |
'\\not\\approx' |
'\\not\\cong' |
'\\not\\equiv' |
'\\ngeqq' |
'\\not\\geq' |
'\\ngeqslant' |
'\\not>' |
'\\not\\leq' |
'\\nleqq' |
'\\nleqslant' |
'\\not<' |
'\\ntriangleleft' |
'\\ntrianglelefteq' |
'\\nmid' |
'\\nparallel' |
'\\not\\prec' |
'\\not\\preceq' |
'\\ntriangleright' |
'\\ntrianglerighteq' |
'\\not\\succ' |
'\\not\\succeq' |
'\\not\\sim' |
'\\not\\simeq' |
'\\nshortmid' |
'\\nshortparallel' |
'\\not\\subset' |
'\\not\\subseteq' |
'\\nsubseteqq' |
'\\not\\supset' |
'\\nsupseteqq' |
'\\not\\supseteq' |
'\\nvdash' |
'\\nvDash' |
'\\nVDash' |
'\\nVdash' |
'\\precnapprox' |
'\\precneqq' |
'\\precnsim' |
'\\succnapprox' |
'\\succneqq' |
'\\succnsim' |
'\\subsetneq' |
'\\subsetneqq' |
'\\supsetneq' |
'\\supsetneqq' |
'\\varsubsetneqq' |
'\\varsubsetneq' |
'\\varsupsetneq' |
'\\varsupsetneqq' |
'\\curvearrowleft' |
'\\curvearrowright' |
'\\Downarrow' |
'\\downdownarrows' |
'\\downharpoonleft' |
'\\downharpoonright' |
'\\Lleftarrow' |
'\\twoheadleftarrow' |
'\\leftleftarrows' |
'\\hookleftarrow' |
'\\looparrowleft' |
'\\leftarrowtail' |
'\\leftharpoondown' |
'\\leftharpoonup' |
'\\Leftrightarrow' |
'\\leftrightarrow' |
'\\leftrightarrows' |
'\\rightleftarrows' |
'\\leftrightsquigarrow' |
'\\rightleftharpoons' |
'\\leftrightharpoons' |
'\\Lsh' |
'\\mapsto' |
'\\multimap' |
'\\nearrow' |
'\\nLeftarrow' |
'\\nleftarrow' |
'\\nLeftrightarrow' |
'\\nleftrightarrow' |
'\\nrightarrow' |
'\\nRightarrow' |
'\\nwarrow' |
'\\circlearrowleft' |
'\\circlearrowright' |
'\\Rrightarrow' |
'\\twoheadrightarrow' |
'\\rightrightarrows' |
'\\hookrightarrow' |
'\\looparrowright' |
'\\rightarrowtail' |
'\\rightsquigarrow' |
'\\rightharpoondown' |
'\\rightharpoonup' |
'\\Rsh' |
'\\searrow' |
'\\swarrow' |
'\\Uparrow' |
'\\upuparrows' |
'\\Updownarrow' |
'\\updownarrow' |
'\\upharpoonleft' |
'\\upharpoonright' |
'\\Longleftarrow' |
'\\Longleftrightarrow' |
'\\longleftrightarrow' |
'\\Longrightarrow' |
'\\rceil' |
'\\rfloor' |
'\\rightparengtr' |
'\\urcorner' |
'\\lrcorner' |
'\\lceil' |
'\\lfloor' |
'\\leftparengtr' |
'\\ulcorner' |
'\\llcorner' |
'\\\'{a}' |
'\\\'{A}' |
'\\^{a}' |
'\\^{A}' |
'\\\'{a}' |
'\\\'{A}' |
'\\aa' |
'\\AA' |
'\\~{a}' |
'\\~{A}' |
'"\\""{a}"' |
'"\\""{A}"' |
'\\ae' |
'\\AE' |
'\\c{c}' |
'\\c{C}' |
'\\dh' |
'\\DH' |
'\\\'{e}' |
'\\\'{E}' |
'\\^{e}' |
'\\^{E}' |
'\\\'{e}' |
'\\\'{E}' |
'"\\""{e}"' |
'"\\""{E}"' |
'\\\'{i}' |
'\\\'{I}' |
'\\^{i}' |
'\\^{I}' |
'\\\'{i}' |
'\\\'{I}' |
'"\\""{i}"' |
'"\\""{I}"' |
'\\~{n}' |
'\\~{N}' |
'\\\'{o}' |
'\\\'{O}' |
'\\^{o}' |
'\\^{O}' |
'\\\'{o}' |
'\\\'{O}' |
'\\o' |
'\\O' |
'\\~{o}' |
'\\~{O}' |
'"\\""{o}"' |
'"\\""{O}"' |
'\\ss' |
'\\th' |
'\\TH' |
'\\\'{u}' |
'\\\'{U}' |
'\\^{u}' |
'\\^{U}' |
'\\\'{u}' |
'\\\'{U}' |
'"\\""{u}"' |
'"\\""{U}"' |
'\\\'{y}' |
'\\\'{Y}' |
'"\\""{y}"' |
'\\u{a}' |
'\\u{A}' |
'\\={a}' |
'\\={A}' |
'\\k{a}' |
'\\k{A}' |
'\\\'{c}' |
'\\\'{C}' |
'\\v{c}' |
'\\v{C}' |
'\\^{c}' |
'\\^{C}' |
'\\.{c}' |
'\\.{C}' |
'\\v{d}' |
'\\v{D}' |
'\\dj' |
'\\DJ' |
'\\v{e}' |
'\\v{E}' |
'\\.{e}' |
'\\.{E}' |
'\\={e}' |
'\\={E}' |
'\\k{e}' |
'\\k{E}' |
'\\\'{g}' |
'\\u{g}' |
'\\u{G}' |
'\\c{G}' |
'\\^{g}' |
'\\c{g}' |
'\\^{G}' |
'\\.{g}' |
'\\.{G}' |
'\\^{h}' |
'\\^{H}' |
'\\hstrok' |
'\\Hstrok' |
'\\.{I}' |
'\\={I}' |
'\\={\\i}' |
'\\ij' |
'\\IJ' |
'\\i' |
'\\k{i}' |
'\\k{I}' |
'\\~{\\i}' |
'\\~{I}' |
'\\^{\\j}' |
'\\^{J}' |
'\\c{k}' |
'\\c{K}' |
'\\textsc{k}' |
'\\\'{l}' |
'\\\'{L}' |
'\\v{l}' |
'\\v{L}' |
'\\c{l}' |
'\\c{L}' |
'\\lmidot' |
'\\Lmidot' |
'\\l' |
'\\L' |
'\\\'{n}' |
'\\\'{N}' |
'\\ng' |
'\\NG' |
'n\\\'{}' |
'\\v{n}' |
'\\v{N}' |
'\\c{n}' |
'\\c{N}' |
'\\H{o}' |
'\\H{O}' |
'\\={O}' |
'\\={o}' |
'\\oe' |
'\\OE' |
'\\\'{r}' |
'\\\'{R}' |
'\\v{r}' |
'\\v{R}' |
'\\c{r}' |
'\\c{R}' |
'\\\'{s}' |
'\\\'{S}' |
'\\v{s}' |
'\\v{S}' |
'\\c{s}' |
'\\c{S}' |
'\\^{s}' |
'\\^{S}' |
'\\v{t}' |
'\\v{T}' |
'\\c{t}' |
'\\c{T}' |
'\\tstrok' |
'\\Tstrok' |
'\\u{u}' |
'\\u{U}' |
'\\H{u}' |
'\\H{U}' |
'\\={u}' |
'\\={U}' |
'\\k{u}' |
'\\k{U}' |
'\\r{u}' |
'\\r{U}' |
'\\~{u}' |
'\\~{U}' |
'\\^{w}' |
'\\^{W}' |
'\\^{y}' |
'\\^{Y}' |
'"\\""{Y}"' |
'\\\'{z}' |
'\\\'{Z}' |
'\\v{z}' |
'\\v{Z}' |
'\\.{z}' |
'\\.{Z}' |
'\\\'{}' |
'\\u{}' |
'\\v{}' |
'\\c{}' |
'\\^{}' |
'\\H{}' |
'"\\""{}"' |
'\\.{}' |
'\\\'{}' |
'\\={}' |
'\\k{}' |
'\\r{}' |
'\\~{}' |
'"\\""{}"' |
'\\cyr{a}' |
'\\cyr{A}' |
'\\cyr{b}' |
'\\cyr{B}' |
'\\cyr{v}' |
'\\cyr{V}' |
'\\cyr{g}' |
'\\cyr{G}' |
'\\cyr{d}' |
'\\cyr{D}' |
'\\cyr{e}' |
'\\cyr{E}' |
'"\\cyr{\\""e}"' |
'"\\cyr{\\""E}"' |
'\\cyr{zh}' |
'\\cyr{Zh}' |
'\\cyr{z}' |
'\\cyr{Z}' |
'\\cyr{i}' |
'\\cyr{I}' |
'\\cyr{\\u\\i}' |
'\\cyr{\\u{I}}' |
'\\cyr{k}' |
'\\cyr{K}' |
'\\cyr{l}' |
'\\cyr{L}' |
'\\cyr{m}' |
'\\cyr{M}' |
'\\cyr{n}' |
'\\cyr{N}' |
'\\cyr{o}' |
'\\cyr{O}' |
'\\cyr{p}' |
'\\cyr{P}' |
'\\cyr{r}' |
'\\cyr{R}' |
'\\cyr{s}' |
'\\cyr{S}' |
'\\cyr{t}' |
'\\cyr{T}' |
'\\cyr{u}' |
'\\cyr{U}' |
'\\cyr{f}' |
'\\cyr{F}' |
'\\cyr{kh}' |
'\\cyr{Kh}' |
'\\cyr{ts}' |
'\\cyr{Ts}' |
'\\cyr{ch}' |
'\\cyr{Ch}' |
'\\cyr{sh}' |
'\\cyr{Sh}' |
'\\cyr{shch}' |
'\\cyr{Shch}' |
'\\cyr{\\cdprime}' |
'\\cyr{\\Cdprime}' |
'\\cyr{y}' |
'\\cyr{Y}' |
'\\cyr{\\cprime}' |
'\\cyr{\\Cprime}' |
'\\cyr{\\\'e}' |
'\\cyr{\\\'E}' |
'\\cyr{yu}' |
'\\cyr{Yu}' |
'\\cyr{ya}' |
'\\cyr{Ya}' |
'\\cyr{N0}' |
'\\cyr{dj}' |
'\\cyr{Dj}' |
'\\cyr{\\\'g}' |
'\\cyr{\\\'G}' |
'\\cyr{\\=e}' |
'\\cyr{\\=E}' |
'\\cyr{\\dz}' |
'\\cyr{\\Dz}' |
'\\cyr{\\=\\i}' |
'\\cyr{\\=I}' |
'"\\cyr{\\""\\i}"' |
'"\\cyr{\\""I}"' |
'\\cyr{j}' |
'\\cyr{J}' |
'\\cyr{lj}' |
'\\cyr{Lj}' |
'\\cyr{nj}' |
'\\cyr{Nj}' |
'\\cyr{\\\'c}' |
'\\cyr{\\\'C}' |
'\\cyr{\\\'k}' |
'\\cyr{\\\'K}' |
'\\cyr{\\u{u}}' |
'\\cyr{\\u{U}}' |
'\\cyr{\\dzh}' |
'\\cyr{\\Dzh}' |
'\\mgreek{a}' |
'\\mgreek{A}' |
'\\mgreek{b}' |
'\\mgreek{B}' |
'\\mgreek{g}' |
'\\mgreek{G}' |
'\\mgreek{d}' |
'\\mgreek{D}' |
'\\mgreek{e}' |
'\\mgreek{E}' |
'\\mgreek{z}' |
'\\mgreek{Z}' |
'\\mgreek{h}' |
'\\mgreek{H}' |
'\\mgreek{j}' |
'\\mgreek{J}' |
'\\mgreek{i}' |
'\\mgreek{I}' |
'\\mgreek{k}' |
'\\mgreek{K}' |
'\\mgreek{l}' |
'\\mgreek{L}' |
'\\mgreek{m}' |
'\\mgreek{M}' |
'\\mgreek{n}' |
'\\mgreek{N}' |
'\\mgreek{x}' |
'\\mgreek{X}' |
'\\mgreek{o}' |
'\\mgreek{O}' |
'\\mgreek{p}' |
'\\mgreek{P}' |
'\\mgreek{r}' |
'\\mgreek{R}' |
'\\mgreek{s}' |
'\\mgreek{S}' |
'\\mgreek{c}' |
'\\mgreek{t}' |
'\\mgreek{T}' |
'\\mgreek{u}' |
'\\mgreek{U}' |
'\\mgreek{f}' |
'\\mgreek{F}' |
'\\mgreek{q}' |
'\\mgreek{Q}' |
'\\mgreek{y}' |
'\\mgreek{Y}' |
'\\mgreek{w}' |
'\\mgreek{W}' |
'\\mgreek{\'a}' |
'\\mgreek{\'A}' |
'\\mgreek{\'e}' |
'\\mgreek{\'E}' |
'\\mgreek{\'h}' |
'\\mgreek{\'H}' |
'"\\mgreek{""i}"' |
'"\\mgreek{""I}"' |
'\\mgreek{\'i}' |
'\\mgreek{\'I}' |
'"\\mgreek{""\'i}"' |
'\\mgreek{\'o}' |
'\\mgreek{\'O}' |
'"\\mgreek{""u}"' |
'"\\mgreek{""U}"' |
'\\mgreek{\'u}' |
'\\mgreek{\'U}' |
'"\\mgreek{""\'u}"' |
'\\mgreek{\'w}' |
'\\mgreek{\'W}' |
'``'
  ;