grammar YAPL;

// -- Reglas Lexicas --
ID: [a-zA-Z][a-zA-Z0-9_]*; // Identificadores
INT_CONST: [0-9]+;
STR_CONST: '"' ( '\\' [\\"] | ~[\\"\r\n])* '"';

// Espacios en blanco y saltos de linea se ignoran
WS: [ \t\r\n]+ -> skip;

BOOL: 'Bool';
INT: 'Int';
STRING: 'String';
IO: 'IO';
OBJECT: 'Object';
SELF_TYPE: 'SELF_TYPE';

class: 'class';
inherits: 'inherits';

CASE: 'case';
OF: 'of';
ESAC: 'esac';
NEW: 'new';
ISVOID: 'isvoid';
NOT: 'not';

type: ID | BOOL | INT | STRING | IO | OBJECT | SELF_TYPE;
binary_op: '+' | '-' | '*' | '/' | '<' | '<=' | '=' | '@';
unary_op: '~' | NOT;

ASSIGN: '<-';
ARROW: '=>';
SEMI: ';';
COLON: ':';
COMMA: ',';
DOT: '.';
LPAREN: '(';
RPAREN: ')';
LBRACE: '{';
RBRACE: '}';
LINE_COMMENT:
	'//' .*? '\n' -> skip; // skip single line comments starting from // and ending with new line
COMMENT: '/*' .*? '*/' -> skip; // skip mutliple comments

// -- Reglas sintacticas --
program: clas_list+;

clas_list:
	'class' type ('inherits' type)? LBRACE (feature_list) RBRACE SEMI;

feature_list: feature* | formal*;

feature:
	attribute_definition
	| method_definition
	| simple_method_definition
	| var_assign;

attribute_definition:
	ID COLON type ('<-' expr)? (LPAREN expr SEMI RPAREN)? SEMI;
var_assign: ID '<-' expr SEMI;
method_definition:
	ID LPAREN parameter_list? RPAREN COLON type LBRACE (
		block
	)* RBRACE SEMI;

let_declaration:
	'let' let_binding (',' let_binding)* (
		'in' LBRACE (expr SEMI)* RBRACE
	)?;
let_binding: ID ':' type ('<-' expr)? (type)?;

if_statement:
	'if' expr ('then' (expr | while_statement | if_statement)*)* (
		'else' (expr | while_statement | if_statement)
	)? 'fi';
while_statement:
	'while' (expr | while_statement | if_statement)* 'loop' (
		expr
		| while_statement
		| if_statement
	)* 'pool';

block:
	if_statement
	| while_statement
	| let_declaration
	| var_assign
	| attribute_definition
	| expr;

simple_method_definition:
	ID LPAREN expr? (COMMA expr)* RPAREN SEMI
	| ID DOT ID LPAREN expr (COMMA expr)* RPAREN SEMI;

formal: ID COLON type;

parameter_list: formal (COMMA formal)*;

expr:
	ID ASSIGN expr
	| STR_CONST
	| ID '(' expr ')'
	| ID '(' parameter_list? ')'
	| '{' expr '}'
	| STR_CONST
	| ID '(' STR_CONST ')'
	| '(' STR_CONST ')'
	| INT_CONST
	| NEW ID
	| NEW type
	| ISVOID expr
	| INT_CONST
	| STR_CONST
	| NOT expr
	| LPAREN expr+? RPAREN
	| ISVOID expr
	| 'self'
	| 'true'
	| 'false'
	| 'void'
	| expr DOT ID
	| expr DOT ID LPAREN expr? RPAREN
	| expr DOT ID ASSIGN expr
	| expr '@' type DOT ID LPAREN expr (SEMI expr)* RPAREN
	| expr '~'
	| expr ('-' expr)+
	| expr ('+' expr)+
	| expr ('<' expr)+
	| expr ('>' expr)+
	| expr '=' expr
	| expr ('+' expr)+
	| expr ('-' expr)+
	| expr ('*' expr)+
	| expr ('/' expr)+
	| expr ('%' expr)+
	| expr '^' expr
	| expr '<=' expr
	| ID;

ErrorChar: .;
