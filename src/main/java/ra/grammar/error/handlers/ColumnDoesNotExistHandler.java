package ra.grammar.error.handlers;

import org.antlr.v4.runtime.ParserRuleContext;
import ra.Query;
import ra.exceptions.RAException;
import ra.grammar.gen.RAGrammarParser;

/**
 * Created by jordanly on 2/29/16.
 */
public class ColumnDoesNotExistHandler extends RAErrorHandler {
    private static String PATTERN = "column \"(.*)\" does not exist";
    private static String MESSAGE = "ERROR: Column '%s' does not exists";
    private static Class[] CLASSES = {
            RAGrammarParser.UnaryExpressionContext.class
    };

    public ColumnDoesNotExistHandler() {
        super(PATTERN, MESSAGE, CLASSES);
    }

    @Override
    public boolean handle(Query query, String s, ParserRuleContext ctx) {
        if (!check(s, ctx)) { // Check if need to handle
            return false;
        }

        if (ctx.getRuleContext().getClass().equals(RAGrammarParser.UnaryExpressionContext.class)) {
            ParserRuleContext problemContext = (ParserRuleContext) ctx.getChild(0) // unaryOperator
                    .getChild(1)  // operator option
                    .getChild(1); // condtion
            query.setException(
                    new RAException(
                            problemContext.start,
                            problemContext.stop,
                            printMessage()
                    )
            );
        } else if (ctx.getRuleContext().getClass().equals(RAGrammarParser.UnitExpressionContext.class)) {
            // TODO error?
        }

        return true;
    }
}
