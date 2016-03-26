grammar RAGrammar ;

// Lexer rules

fragment DIGIT : [0-9] ;
fragment ALPHA : [a-zA-Z]+ ;

// Reserved Keywords
AND : 'and' ;
OR  : 'or' ;
NOT : 'not' ;
LIKE : 'like' ;
LET : 'let' ;

// Base RA commands
SELECT : '\\select' ;
PROJECT : '\\project' ;
JOIN : '\\join' ;
CROSS : '\\cross' ;
UNION : '\\union' ;
DIFF : '\\diff' ;
INTERSECT: '\\intersect' ;
RENAME : '\\rename' ;

// Separators
LEFT_PAREN : '(' ;
RIGHT_PAREN : ')' ;
LEFT_BRACE : '_{' ;
RIGHT_BRACE : '}' ;
COMMA : ',' ;
DOT : '.' ;
STATEMENT_TERMINATOR : ';' ;

// Operations
EQUALS : '=' ;
LT : '<' ;
LTE : '<=' ;
GT : '>' ;
GTE : '>=' ;
NOT_EQUALS : '<>' ;

// Numbers
INT : DIGIT+ ;
FLOAT : DIGIT DOT DIGIT+ ;

// Strings
STRING_LITERAL : '\'' (.|[^'])*? '\'' ;

// Identifier
ID : ALPHA (ALPHA|DIGIT|'_')* ; // Column or table name

// Whitespace
WHITESPACE : [ \t\r\n]+ -> skip;

// C style comments
COMMENT : '/*' .*? '*/' -> channel(HIDDEN) ;
SINGLELINE_COMMENT: '//' ~('\r'|'\n')*  -> channel(HIDDEN) ;

// ==========================================

// Parser Rules

program
    : ( statement )+ EOF ;

statement
    : binaryExpression STATEMENT_TERMINATOR
    | assignmentExpression STATEMENT_TERMINATOR
    ;

assignmentExpression
    : LET ID EQUALS binaryExpression
    ;

unitExpression
    : ID
    | LEFT_PAREN binaryExpression RIGHT_PAREN
    ;

unaryOperator
    : SELECT operatorOption
    | PROJECT operatorOption
    | RENAME operatorOption
    ;

unaryExpression
    : unitExpression
    | unaryOperator unaryExpression
    ;

binaryOperator
    : JOIN operatorOption
    | JOIN
    | CROSS
    | UNION
    | DIFF
    | INTERSECT
    ;

binaryExpression
    : unaryExpression ( binaryOperator unaryExpression )*
    ;

comparisonOperator
    : GT
    | GTE
    | LT
    | LTE
    ;

equalityOperator
    : EQUALS
    | NOT_EQUALS
    ;

value
    : INT
    | FLOAT
    ;

selectCondition
    : ID comparisonOperator value
    | ID comparisonOperator ID
    | ID equalityOperator ID
    | ID equalityOperator STRING_LITERAL
    | ID LIKE STRING_LITERAL
    ;

joinCondition
    : ID equalityOperator ID
    | ID comparisonOperator ID
    ;

condition
    : selectCondition
    | joinCondition
    ;

notCondition
    : ( NOT )? condition
    ;

booleanOperator
    : AND
    | OR
    ;

booleanCondition
    : notCondition ( booleanOperator notCondition )*
    ;

attributeList
    : ID ( COMMA ID )*
    ;

operatorOption
    : LEFT_BRACE booleanCondition RIGHT_BRACE
    | LEFT_BRACE attributeList RIGHT_BRACE
    ;

// ==========================================
