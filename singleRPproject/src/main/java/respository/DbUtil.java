package respository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
	private static Connection connection = null;

    public static Connection getConnection() {
        if (connection != null)
            return connection;
        else {
            try {
                String driver = "com.mysql.jdbc.Driver";
                String url = "jdbc:mysql://localhost:3306/test";
                String username = "root";
                String password = "";
                Class.forName(driver);
                connection = DriverManager.getConnection(url, username, password);
            } catch (SQLException | ClassNotFoundException e) {
                e.printStackTrace();
            }
            return connection;
        }
    }
}
