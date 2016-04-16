package ra;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.json.JSONObject;
import ra.ast.RAASTNode;
import ra.ast.RAASTVisitor;
import ra.exceptions.RAException;
import ra.grammar.RAEvalVisitor;
import ra.grammar.error.RAErrorListener;
import ra.grammar.error.RAErrorStrategy;
import ra.grammar.gen.*;
import ra.util.ResultSetUtilities;

import java.sql.ResultSet;

public class Query {
    private ParseTree tree;
    private RAException exception;
    private ResultSet resultSet;
    private String raQuery;
    private String sqlQuery;
    private RAASTNode astTree;

    public Query(RA ra, String raQuery) {
        this.raQuery = raQuery;
        init(ra);
    }

    private void init(RA ra) {
        ANTLRInputStream inputStream = new ANTLRInputStream(raQuery);
        RAGrammarLexer lexer = new RAGrammarLexer(inputStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        RAGrammarParser parser = new RAGrammarParser(tokenStream);

        /**
         * Do not use the default ANTLRErrorStrategy as it attempts to fix
         * user's queries. Instead, just halt on first error.
         */
        parser.setErrorHandler(new RAErrorStrategy());

        /**
         * Remove the default ANTLR listeners before adding our own listeners. The
         * default ANTLR listeners just prints errors to STDERR"
         */
        lexer.removeErrorListeners();
        lexer.addErrorListener(new RAErrorListener(this));
        parser.removeErrorListeners();
        parser.addErrorListener(new RAErrorListener(this));

        try {
            this.tree = parser.program();
            this.sqlQuery = new RAEvalVisitor(ra, this).visit(tree);
            this.astTree = new RAASTVisitor().visit(tree);
        } catch (RecognitionException e) {
            // Exception should already be set in query from listener, just return
            return;
        } catch (Exception e) {
            // Don't quite know this exception, log it
            e.printStackTrace();
            System.err.println("UNKNOWN ERROR: " + e.toString());
            return;
        }

        if (isValid()) {
            try {
                this.resultSet = ra.evaluateSQLQuery(sqlQuery);
            } catch (Exception e) {
                this.exception = new RAException(
                    "UNKNOWN EXCEPTION: " + e.getMessage()
                );
            }
        }
    }

    public boolean isValid() {
        return (exception == null);
    }

    public RAException getException() {
        return this.exception;
    }

    public void setException(RAException e) {
        this.exception = e;
    }

    public JSONObject toJson() {
        JSONObject obj = new JSONObject();

        obj.put("query", raQuery);
        obj.put("isError", exception != null);
        if (exception != null) {
            obj.put("error", exception.asJson());
        } else {
            obj.put("columnNames", ResultSetUtilities.columnsToJSONArray(resultSet));
            obj.put("data", ResultSetUtilities.toJSONArray(resultSet));
        }

        return obj;
    }

    public ResultSet getResultSet() {
        return resultSet;
    }

    public JSONObject getAstTreeJson() {
        JSONObject obj = new JSONObject();

        obj.put("query", raQuery);
        obj.put("isError", astTree == null);
        if (astTree == null) {
            obj.put("error", exception.asJson());
        } else {
            obj.put("tree", astTree.toJson());
        }

        return obj;
    }

    @Override
    public String toString() {
        return raQuery;
    }
}
