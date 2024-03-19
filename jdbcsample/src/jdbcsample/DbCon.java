package jdbcsample;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbCon {
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn = null;
		try {
				//	step 1: load the driver
			Class.forName("com.mysql.jdbc.Driver");
			// step 2 : create a connection
			conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root", "");
			
//			CallableStatement clst = conn.prepareCall("{call GetEmployeeById(?)}")
			String query =  "select * from employee where id = 3"; // fixed statement
			
			//prepared Statement
			String query1 =  "select * from employee where id  = ?";
			
//			int add(int a,int b) {
				
//			}
			
//			int sum(int a) {
				
//			}
//																														2,300
//			CallableStatement clst = conn.prepareCall("{call GetEmployeeById(?,?)}")
			 // Create a CallableStatement object
            try (PreparedStatement ps =  conn.prepareStatement(query1);) {
                // Set input parameters, if any
            	ps.setInt(1, 2); // Assuming the employee ID is 1            	
//            	ps.setInt(2, 300);
//            	ps.setInt(3, 40);
            	
//            	select * from employee where id = empid;
                // Execute the stored procedure
                try (ResultSet resultSet = ps.executeQuery()) {
                    // Process the result set
                    while (resultSet.next()) {
                        int id = resultSet.getInt("id");
                        String name = resultSet.getString("empname");
                        // Process other columns as needed
                        System.out.println("ID: " + id + ", Name: " + name);
                    }
                }
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
