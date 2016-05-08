package ra.grammar.error;

import org.antlr.v4.runtime.*;

/**
 * The default error strategy in ANTLR attempts to recover inline by deleting
 * or inserting a character. We do not want to automatically recover for users.
 * Instead, we just throw the original RecognitionException with no attempts
 * at recovery.
 */
public class RAErrorStrategy extends DefaultErrorStrategy {
    @Override
    public Token recoverInline(Parser recognizer) throws RecognitionException {
        throw new InputMismatchException(recognizer);
    }

    @Override
    public void reportError(Parser recognizer, RecognitionException e) {
        if (e instanceof LexerNoViableAltException) {
            return;
        }

        super.reportError(recognizer, e);
    }

    @Override
    public void recover(Parser recognizer, RecognitionException e) {
        // Do not try to recover
        // super.recover(recognizer, e);
    }
}
