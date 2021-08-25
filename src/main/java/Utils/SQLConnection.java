package Utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLConnection  {
    public SQLConnection() throws SQLException  {
        Connection conn = SQLJDBCUtil.getConnection();
        String query = "select *  from studentsInfo;";
        Statement stmt = conn.createStatement();
        ResultSet rs= stmt.executeQuery(query);
    }

}
