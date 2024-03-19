package nonViolatingSRP;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConncetion {
			private Connection con;
			//1. Establishing the DB connection 
			public Connection getDBConnection() {				
				try {
					Class.forName("com.mysql.jdbc.Driver");
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return con;
		}
}
