package ra;
import util.TempUtil;

import java.sql.*;

public class RA {
    private Connection dbConnection;

    public RA(Connection dbConnection) {
        this.dbConnection = dbConnection;

        if (dbConnection == null) {
            System.err.println("Null connection supplied to RA");
            System.err.println("Shutting down.");
            System.exit(1);
        }
        try {
            // TODO log successful connection?
            DatabaseMetaData dbmd = dbConnection.getMetaData();
        } catch (SQLException e) {
            // TODO add backup plan? throw error instead of quitting?
            System.err.println("Could not connect to database.");
            System.err.println("Shutting down.");
            System.exit(1);
        }
    }

    public Query evaluateRAQuery(String raQuery) {
        return new Query(this, raQuery);
    }

    public ResultSet evaluateSQLQuery(String sqlQuery) {
        try {
            Statement st = dbConnection.createStatement();
            st.execute(sqlQuery);

            return st.getResultSet();
        } catch (SQLException e) {
            // TODO how to handle database errors/bad sql queries
            System.out.println(e.toString());
        }

        return null;
    }

    public static void main(String[] args) {
        String query = ("\\select_{name='Ben'} Drinkker;");
        System.out.println(query);
        RA ra = new RA(TempUtil.createLocalDBConnection());
        Query ans = ra.evaluateRAQuery(query);
        System.out.println(ans.toJson());
    }
}
