package ra.util;

import org.json.JSONArray;
import org.json.JSONObject;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by jordanly on 10/18/15.
 */
public final class ResultSetUtilities {
    private ResultSetUtilities() { }

    public static String asString(ResultSet rs) {
        StringBuilder sb = new StringBuilder();
        try {
            ResultSetMetaData md = rs.getMetaData();
            int numCols = md.getColumnCount();
            for (int i = 1; i <= numCols; i++) {
                sb.append(md.getColumnName(i) + " | ");
            }
            sb.append("\n");

            while (rs.next()) {
                for (int i = 1; i <= numCols; i++) {
                    sb.append(rs.getString(i) + " | ");
                }
                sb.append("\n");
            }
            return sb.toString();
        } catch (SQLException e) {
            return e.toString();
        }
    }

    public static JSONArray toJSONArray(ResultSet rs) {
        JSONArray rows = new JSONArray();

        try {
            ResultSetMetaData rsmd = rs.getMetaData();
            String[] columns = new String[rsmd.getColumnCount()];
            for (int i = 0; i < columns.length; i++) {
                columns[i] = rsmd.getColumnName(i + 1);
            }

            while (rs.next()) {
                JSONObject obj = new JSONObject();
                for (int i = 0; i < columns.length; i++) {
                    obj.put(columns[i], rs.getString(i + 1));
                }
                rows.put(obj);
            }
        } catch (Exception e) {
            e.printStackTrace(); // TODO throw real error
        }

        return rows;
    }

    public static JSONArray columnsToJSONArray(ResultSet rs) {
        JSONArray cols = new JSONArray();

        try {
            ResultSetMetaData rsmd = rs.getMetaData();
            for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                cols.put(rsmd.getColumnName(i));
            }
        } catch (Exception e) {
            e.printStackTrace(); // TODO throw real error
        }

        return cols;
    }

    public static JSONArray columnValuesAsJSONArray(ResultSet rs, String columnName) {
        JSONArray values = new JSONArray();

        try {
            int colIndex = rs.findColumn(columnName);
            while (rs.next()) {
                values.put(rs.getString(colIndex));
            }
        } catch (Exception e) {
            // do nothing, return empty list // TODO do something better
        }
        return values;
    }

    public static void print(ResultSet rs) {
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

    public static boolean validateResultSet(ResultSet rs, String[][] ans) throws Exception {
        ResultSetMetaData md = rs.getMetaData();
        int numCols = md.getColumnCount();
        List<List<String>> rows = new ArrayList<>();
        while (rs.next()) {
            List<String> line = new ArrayList<>();
            for (int i = 1; i <= numCols; i++) {
                line.add(rs.getString(i));
            }
            rows.add(line);
        }

        String[][] out = new String[rows.size()][rows.get(0).size()];
        for (int i = 0; i < out.length; i++) {
            out[i] = rows.get(i).toArray(new String[out[0].length]);
        }

        Arrays.sort(ans, new StringMatrixComparator());
        Arrays.sort(out, new StringMatrixComparator());

        for (int i = 0; i < ans.length; i++) {
            if (!Arrays.equals(ans[i], out[i])) {
                return false;
            }
        }

        return true;
    }

    private static class StringMatrixComparator implements Comparator<String[]> {
        @Override
        public int compare(String[] o1, String[] o2) {
            for (int i = 0; i < Math.min(o1.length, o2.length); i++) {
                int val = o1[i].compareTo(o2[i]);
                if (val != 0) return val;
            }

            if (o1.length != o2.length) return o1.length - o2.length;
            return 0;
        }
    }
}
