package ra.exceptions;

import org.antlr.v4.runtime.Token;
import org.json.JSONObject;
import ra.grammar.error.handlers.RAErrorHandler;

public class RAException extends Exception {
    private int lineStart = -1;
    private int charStart = -1;
    private int lineEnd = -1;
    private int charEnd = -1;
    private String message;
    private RAErrorHandler errorHandler; // If exception is created by an errorHandler, used for testing

    public RAException(String message) {
        this.message = message;
    }

    public RAException(int lineStart, int charStart, int lineEnd, int charEnd,
                       String message) {

        this.lineStart = lineStart;
        this.charStart = charStart;
        this.lineEnd = lineEnd;
        this.charEnd = charEnd;
        this.message = message;
    }

    public RAException(Token start, Token end, String message) {
        this.lineStart = start.getLine();
        this.charStart = start.getCharPositionInLine();
        this.lineEnd = end.getLine();
        this.charEnd = end.getCharPositionInLine() + end.getText().length();
        this.message = message;
    }

    public RAErrorHandler getErrorHandler() {
        return errorHandler;
    }

    public void setErrorHandler(RAErrorHandler errorHandler) {
        this.errorHandler = errorHandler;
    }

    public JSONObject asJson() {
        JSONObject obj = new JSONObject();

        if (charStart != -1) {
            obj.put("start", lineStart + ":" + charStart);
        }
        if (charEnd != -1) {
            obj.put("end", lineEnd + ":" + charEnd);
        }
        obj.put("message", message);

        return obj;
    }
}
