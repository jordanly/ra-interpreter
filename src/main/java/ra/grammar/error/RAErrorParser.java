package ra.grammar.error;

import org.antlr.v4.runtime.ParserRuleContext;
import ra.Query;
import ra.RA;
import ra.exceptions.RAException;
import ra.grammar.error.handlers.InvalidColumnReferenceHandler;
import ra.grammar.error.handlers.RAErrorHandler;
import ra.grammar.error.handlers.RelationDoesNotExistHandler;

import java.sql.SQLException;

public class RAErrorParser {
    private static RAErrorHandler[] HANDLERS = {
            new InvalidColumnReferenceHandler(),
            new RelationDoesNotExistHandler()
    };
    private RA ra;

    public RAErrorParser(RA ra) {
        this.ra = ra;
    }

    public boolean validate(Query query, String command, ParserRuleContext ctx) {
        // If error already occured, skip check
        if (!query.isValid()) {
            return false;
        }

        if (command == null) {
            return false;
        }

        // Add SELECT * FROM to command since not all of our nodes are complete
        // SQL statements (binary ones for example)
        String formattedCommand = String.format("SELECT * FROM ( %s ) %s",
                command, "validateQueryTempTable");

        // Run command. If there is an exception, check it and log it
        try {
            ra.evaluateSQLQuery(formattedCommand);
        } catch (SQLException e) {
            if (!checkAndLogError(query, e, ctx)) {
                // No matching error handle, set exception in query and log it
                query.setException(new RAException(
                        ctx.getStart(),
                        ctx.getStop(),
                        "UNKNOWN: Did not recognize this error, contact an administrator -- STACK TRACK "
                                + e.getMessage()
                ));
                System.err.println(query.toString());
            }

            return false;
        }

        return true;
    }

    private boolean checkAndLogError(Query query, Exception e, ParserRuleContext ctx) {
        for (RAErrorHandler h : HANDLERS) {
            if (h.handle(query, e.getMessage(), ctx)) {
                return true;
            }
        }

        return false;
    }
}
