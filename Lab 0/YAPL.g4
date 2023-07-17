grammar YAPL;

// -- Reglas Lexicas --
ID: [a-zA-Z][a-zA-Z0-9_]*; // Identificadores
INT_CONST: [0-9]+;
STR_CONST: '"' (~["\r\n\\] | '\\' [\\"'\r\n]) '"';

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

IF: 'if';
THEN: 'then';
ELSE: 'else';
FI: 'fi';
WHILE: 'while';
LOOP: 'loop';
POOL: 'pool';
LET: 'let';
IN: 'in';
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

// -- Reglas sintacticas --
program: clas_list?;

clas_list:
	'class' type ('inherits' type)? LBRACE (feature_list) RBRACE SEMI;

feature_list: feature* | formal*;

feature: attribute_definition | method_definition;

attribute_definition: ID COLON type SEMI | ID ASSIGN expr SEMI;
method_definition:
	ID LPAREN parameter_list? RPAREN COLON type LBRACE block RBRACE SEMI;

block: statement*;

statement:
	ID
	| assignment_statement
	| if_statement
	| while_statement; // Statements

formal: ID COLON type;

assignment_statement: ID ASSIGN expr SEMI;
if_statement: IF expr THEN block (ELSE block)? FI;
while_statement: WHILE expr LOOP block POOL;

parameter_list: formal (COMMA formal)*;

let_declaration: let_binding (COMMA let_binding)*;
let_binding: ID COLON type ( ASSIGN expr)?;

expr:
	ID ASSIGN expr
	| expr '.' ID
	| IF expr THEN expr ELSE expr FI
	| WHILE expr LOOP expr POOL
	| NEW type
	| ISVOID expr
	| expr '-' expr
	| expr '+' expr
	| expr '<' expr
	| expr '>' expr
	| expr '=' expr
	| expr '+' expr
	| expr '-' expr
	| expr '*' expr
	| expr '/' expr
	| expr '%' expr
	| expr '^' expr
	| expr '<=' expr
	| NOT expr
	| LPAREN expr RPAREN
	| ID
	| INT_CONST
	| STR_CONST
	| 'true'
	| 'false'
	| 'void'
	| if_statement
	| while_statement
	| ISVOID expr
	| block
	| NEW type
	| LET let_declaration IN expr;

