package ra.grammar.error;

import org.antlr.v4.runtime.*;
import ra.Query;
import ra.exceptions.RAException;

/**
 * Created by jordanly on 10/18/15.
 */
public class RAErrorListener extends BaseErrorListener {
    private Query query;

    public RAErrorListener(Query query) {
        this.query = query;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                            int line, int charPositionInLine, String msg, RecognitionException e) {
        if (query.isValid()) {
            if (e instanceof LexerNoViableAltException) { // Lexer exceptions
                query.setException(
                    new RAException(
                        line, ((LexerNoViableAltException) e).getStartIndex(),
                        line, ((LexerNoViableAltException) e).getStartIndex() + 1,
                        "Syntax Error: " + msg
                    )
                );
            } else { // All other parser exceptions
                query.setException(
                        new RAException(
                                (CommonToken) offendingSymbol,
                                (CommonToken) offendingSymbol,
                                "Syntax Error: " + msg
                        )
                );
            }
            throw e; // Do not continue to lex/parse
        }
    }
}
