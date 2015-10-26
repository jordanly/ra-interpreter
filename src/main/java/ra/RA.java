package ra;
import util.TempUtil;

import java.sql.*;

public class RA {
    private Connection dbConnection;

    public RA(Connection dbConnection) {
        this.dbConnection = dbConnection;

        if (dbConnection == null) {
            System.err.println("NULL connection supplied to RA");
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

    public ResultSet evaluateSQLQuery(String sqlQuery) throws SQLException {
        Statement st = dbConnection.createStatement();
        st.execute(sqlQuery);

        return st.getResultSet();
    }

    public static void main(String[] args) {
        String query = ("\\project_{drinker} (\n" +
                "\t\\select_{beer='Amstel'} Likes\t\n" +
                "\t)\n" +
                "\\diff\n" +
                "\\project_{drinker, beer} (\n" +
                "\t\\select_{beer='Corona'} Likes\n" +
                "\t)\n" +
                ";");
        System.out.println(query);
        RA ra = new RA(TempUtil.createLocalDBConnection());
        Query ans = ra.evaluateRAQuery(query);
        System.out.println(ans.toJson());

//        try {
//            ra.evaluateSQLQuery("SELECT * FROM (  ( SELECT * FROM frequents t51 )  ) t80 WHERE drinker = 'Ben' ");
//            System.out.println("Success");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }
}
