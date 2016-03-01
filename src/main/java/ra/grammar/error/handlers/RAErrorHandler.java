package ra.grammar.error.handlers;

import org.antlr.v4.runtime.ParserRuleContext;
import ra.Query;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by jordanly on 11/29/15.
 */
public abstract class RAErrorHandler {
    private Pattern pattern;
    private Matcher matcher;
    private String message;
    private Set<Class> classes;

    public RAErrorHandler(String pattern, String message, Class[] classes) {
        this.pattern = Pattern.compile(pattern);
        this.message = message;
        this.classes = new HashSet<>(Arrays.asList(classes));
    }

    public abstract boolean handle(Query query, String s, ParserRuleContext ctx);

    protected String printMessage() {
        if (matcher == null) {
            throw new RuntimeException("Tried to print error message without a match");
        }

        String[] groups = new String[matcher.groupCount()];
        for (int i = 0; i < groups.length; i++) {
            groups[i] = matcher.group(i + 1); // + 1 since group 0 is full string
        }

        return String.format(message, groups);
    }

    protected boolean check(String s, ParserRuleContext ctx) {
        this.matcher = pattern.matcher(s);
        return (matcher.find() && classes.contains(ctx.getRuleContext().getClass()));
    }
}
