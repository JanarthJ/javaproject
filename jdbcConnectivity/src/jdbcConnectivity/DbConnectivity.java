package jdbcConnectivity;

import java.sql.Connection; // core API 
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnectivity {
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn = null;
		try {
				//	step 1: load the driver
			Class.forName("com.mysql.jdbc.Driver");
			// step 2 : create a connection
			conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root", "");
			
			// step 3: create a statement
			Statement st = conn.createStatement();
			//step 4 : Execute query
			ResultSet rs = st.executeQuery("select * from student");
			
			//step 5 : optional that result processing
			while(rs.next()) {
				System.out.println("Id : "+ rs.getInt("rollno")+" Name : "+rs.getString("name"));
			}			
		}catch(ClassNotFoundException e) {
			System.out.print(e);
		}catch(SQLException e) {
			System.out.print(e);
		}finally {
			//step 6 : close connection 
			conn.close();
		}
	}

}
