package dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import model.Student;

public class StudentDAO {
	private Connection con;
	Properties prop = new Properties(); 
	public StudentDAO() {
		
		try {
			//	Step 1 : loading the driver
			//Class.forName("com.mysql.jdbc.Driver");
			//con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
			
			FileInputStream ip= new FileInputStream("C:\\Users\\Janarthanan\\Downloads\\eclipsespace\\samplepro\\src\\main\\resources\\config.properties");
			prop.load(ip);
			String dname = prop.getProperty("ds.database-driver");
			String dbConnUrl = prop.getProperty("ds.url");
			String dbUserName = prop.getProperty("ds.username");
			String dbPassword = prop.getProperty("ds.password");

			if (dname == null || dbConnUrl == null || dbUserName == null || dbPassword == null) {
			    throw new IllegalArgumentException("One or more properties are missing in ds-connection.properties.");
			}else {
            	System.out.println(dname+" : "+ dbConnUrl +" : "+dbUserName+" : "+dbPassword);
	            Class.forName(dname); 
	            con = DriverManager.getConnection(dbConnUrl, dbUserName, dbPassword); 
            }
            if (con != null) { 
                System.out.println("Connection Successful"); 
            } 
            else { 
                System.out.println("Failed to make connection!"); 
            } 
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(Exception e ) {
			System.out.println("error in con : "+e);
		}
		
	}
	
	public Student fetchStudent(int rollno ) {
		Student stu = null;
		try {
			String query = "SELECT * FROM student WHERE rollno = ?";
			PreparedStatement ps =  con.prepareStatement(query);
			ps.setInt(1, rollno);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				stu = new Student();
				stu.setRollno(rs.getInt("rollno"));
				stu.setName(rs.getString("name"));
				stu.setYear(rs.getInt("year"));
				stu.setDept(rs.getString("dept"));
			}
		}catch(SQLException e) {
			System.out.println(e);
		}
		return stu;
	}
}
