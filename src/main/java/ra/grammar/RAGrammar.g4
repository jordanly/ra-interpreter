grammar RAGrammar ;

// Lexer rules

fragment DIGIT : [0-9] ;
fragment ALPHA : [a-zA-Z]+ ;

// Reserved Keywords
AND : 'and' ;
OR  : 'or' ;
NOT : 'not' ;
LIKE : 'like' ;

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

exp0
    : exp STATEMENT_TERMINATOR EOF ;

exp_unit
    : ID                                        #tableExp
    | LEFT_PAREN exp1 RIGHT_PAREN               #parenExp
    ;

exp_unary
    : exp_unit                                  #unitExp
    | SELECT operatorOption exp_unary           #unaryExp
    | PROJECT operatorOption exp_unary          #unaryExp
    | RENAME operatorOption exp_unary           #unaryExp
    ;

exp
    : exp_unary                                 #singleUnaryExp
    | exp_unary JOIN operatorOption exp_unary   #joinExp
    | exp_unary JOIN exp_unary                  #binaryExp
    | exp_unary CROSS exp_unary                 #binaryExp
    | exp_unary UNION exp_unary                 #binaryExp
    | exp_unary DIFF exp_unary                  #binaryExp
    | exp_unary INTERSECT exp_unary             #binaryExp
    ;

exp1
    : exp                                       #singleTermExp
    | exp JOIN operatorOption exp_unary         #joinTermExp
    | exp JOIN exp_unary                        #binaryTermExp
    | exp CROSS exp_unary                       #binaryTermExp
    | exp UNION exp_unary                       #binaryTermExp
    | exp DIFF exp_unary                        #binaryTermExp
    | exp INTERSECT exp_unary                   #binaryTermExp
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
    : condition
    | NOT condition
    ;

andCondition
    : notCondition
    | notCondition ( AND notCondition )*
    ;

orCondition
    : notCondition
    | notCondition ( OR notCondition )*
    ;

attributeList
    : ID ( COMMA ID )*
    ;

operatorOption
    : LEFT_BRACE selectCondition RIGHT_BRACE
    | LEFT_BRACE joinCondition RIGHT_BRACE
    | LEFT_BRACE attributeList RIGHT_BRACE
    ;

// ==========================================
