package ra.grammar.error.handlers;

import org.antlr.v4.runtime.ParserRuleContext;
import ra.Query;
import ra.exceptions.RAException;
import ra.grammar.gen.RAGrammarParser;

/**
 * Created by jordanly on 4/30/16.
 */
public class RelationDoesNotExistHandler extends RAErrorHandler {
    private static String PATTERN = "relation \"(.*)\" does not exist";
    private static String MESSAGE = "ERROR: Relation '%s' does not exists";
    private static Class[] CLASSES = {
            RAGrammarParser.UnitExpressionContext.class
    };

    public RelationDoesNotExistHandler() {
        super(PATTERN, MESSAGE, CLASSES);
    }

    @Override
    public boolean handle(Query query, String s, ParserRuleContext ctx) {
        if (!check(s, ctx)) { // Check if need to handle
            return false;
        }

        if (ctx.getRuleContext().getClass().equals(RAGrammarParser.UnitExpressionContext.class)) {
            ParserRuleContext problemContext = (ParserRuleContext) ctx;

            RAException e = new RAException(
                    problemContext.start,
                    problemContext.stop,
                    printMessage()
            );
            e.setErrorHandler(this);

            query.setException(e);
        } else {
            // TODO log that there is some instance where this does not apply.
        }

        return true;
    }
}
