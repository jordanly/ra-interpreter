package ra;
import grammar.RAEvalVisitor;
import grammar.gen.RAGrammarLexer;
import grammar.gen.RAGrammarParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.sql.*;
import java.util.Properties;


/**
 * Created by jordanly on 10/6/15.
 */
public class RA {
    public static void main(String[] args) {
        // Test AST
        ANTLRInputStream inputStream = new ANTLRInputStream("Serves\n" +
                "\\diff\n" +
                "\\project_{bar3,beer3,price3}\n" +
                "  \\select_{price1 < price2 and price2 < price3}\n" +
                "    (\\rename_{bar1, beer1, price1} Serves \\cross\n" +
                "     \\rename_{bar2, beer2, price2} Serves \\cross\n" +
                "     \\rename_{bar3, beer3, price3} Serves);");
        RAGrammarLexer lexer = new RAGrammarLexer(inputStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        RAGrammarParser parser = new RAGrammarParser(tokenStream);

        try {
            ParseTree tree = parser.exp0();
            String query = new RAEvalVisitor().visit(tree);
            System.out.println(query);

            Connection conn = connectToDB();
            Statement st = conn.createStatement();
            st.execute(query);
            ResultSet rs = st.getResultSet();

            printResultSet(rs);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public static Connection connectToDB() {
        String connString = "jdbc:postgresql:beers";
        Properties prop = new Properties();
        prop.setProperty("user", "raservice");
        prop.setProperty("password", "test");
        try {
            Connection conn = DriverManager.getConnection(connString, prop);
            return conn;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static void printResultSet(ResultSet rs) {
        try {
            ResultSetMetaData md = rs.getMetaData();
            int numCols = md.getColumnCount();
            for (int i = 1; i <= numCols; i++) {
                System.out.print(md.getColumnName(i) + " ");
            }
            System.out.println();

            while (rs.next()) {
                for (int i = 1; i <= numCols; i++) {
                    System.out.print(rs.getString(i) + " ");
                }
                System.out.println();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
