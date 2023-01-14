package librarymanangementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {

    public static Connection Connect() {
        Connection conn = null;
        try {
            String url1 = "jdbc:mysql://localhost:3306/library";
            String user = "root";
            String password = "";
            conn = (Connection) DriverManager.getConnection(url1, user, password);
            if (conn != null) {
                System.out.println("Successfly connected to database");
            }
        } catch (SQLException ex) {
            System.out.println("" + ex);
        }
        return conn;

    }

}
