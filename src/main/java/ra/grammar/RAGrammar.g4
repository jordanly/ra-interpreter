grammar RAGrammar ;

// Lexer rules

fragment DIGIT : [0-9] ;
fragment ALPHA : [a-zA-Z]+ ;

// Reserved Keywords
AND : 'and' ; // TODO spaces in tokens?
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

LEFT_PAREN : '(' ;
RIGHT_PAREN : ')' ;
LEFT_BRACE : '_{' ;
RIGHT_BRACE : '}' ;
EQUALS : '=' ;
LT : '<' ;
LTE : '<=' ;
GT : '>' ;
GTE : '>=' ;
NOT_EQUALS : '<>' ;
COMMA : ',' ;
STATEMENT_TERMINATOR : ';' ;

INT : DIGIT+ ;
FLOAT : DIGIT+ '.' DIGIT+ ;
STRING_LITERAL : '\'' (.|[^'])*? '\'' ;

NAME : ALPHA (ALPHA|DIGIT|'_')* ; // same as column

// Whitespace
WHITESPACE : [ \t\r\n]+ -> skip;

// C style comments
COMMENT : '/*' .*? '*/' -> channel(HIDDEN) ;
SINGLELINE_COMMENT: '//' ~('\r'|'\n')*  -> channel(HIDDEN) ;

// ==========================================

// Parser Rules

exp0        : exp STATEMENT_TERMINATOR EOF ;

exp_unit    : NAME                                #tableExp
            | LEFT_PAREN exp1 RIGHT_PAREN               #parenExp
            ;

exp_unary   : exp_unit                                  #unitExp
            | SELECT select_cond exp_unary              #unaryExp
            | PROJECT proj_cond exp_unary               #unaryExp
            | RENAME proj_cond exp_unary                #unaryExp
            ;

exp         : exp_unary                                 #singleUnaryExp
            | exp_unary JOIN join_cond exp_unary        #joinExp
            | exp_unary JOIN exp_unary                  #binaryExp
            | exp_unary CROSS exp_unary                 #binaryExp
            | exp_unary UNION exp_unary                 #binaryExp
            | exp_unary DIFF exp_unary                  #binaryExp
            | exp_unary INTERSECT exp_unary             #binaryExp
            ;

exp1        : exp                                       #singleTermExp
            | exp JOIN join_cond exp_unary              #joinTermExp
            | exp JOIN exp_unary                        #binaryTermExp
            | exp CROSS exp_unary                       #binaryTermExp
            | exp UNION exp_unary                       #binaryTermExp
            | exp DIFF exp_unary                        #binaryTermExp
            | exp INTERSECT exp_unary                   #binaryTermExp
            ;

comp_atom   : GT
            | GTE
            | LT
            | LTE
            ;

eq_atom     : EQUALS
            | NOT_EQUALS
            ;

value       : INT
            | FLOAT
            ;

// TODO maybe have parenthesis in this? not (x > y)?

select_cond : LEFT_BRACE s_cond2 RIGHT_BRACE ;

s_cond0     : NAME comp_atom value
            | NAME comp_atom NAME
            | NAME eq_atom NAME
            | NAME eq_atom STRING_LITERAL
            | NAME LIKE STRING_LITERAL
            ;

s_cond1     : s_cond0
            | NOT s_cond0
            ;

s_cond2     : s_cond1
            | s_cond1 AND s_cond1
            | s_cond1 OR s_cond1
            ;

proj_cond   : LEFT_BRACE p_cond1 RIGHT_BRACE ;

p_cond0     : NAME
            ;

p_cond1     : p_cond0
            | p_cond1 COMMA p_cond0
            ;

join_cond   : LEFT_BRACE j_cond2 RIGHT_BRACE ;

j_cond0     : NAME eq_atom NAME
            | NAME comp_atom NAME
            ;

j_cond1     : j_cond0
            | NOT j_cond0
            ;

j_cond2     : j_cond1
            | j_cond1 AND j_cond1
            | j_cond1 OR j_cond1
            ;

// ==========================================
