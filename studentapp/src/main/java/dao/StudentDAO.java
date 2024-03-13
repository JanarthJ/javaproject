package dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import model.Student;

public class StudentDAO {
	private Connection con;
	Properties props = new Properties();
	
	public StudentDAO() {
		//		Step 1 : loading the driver
		try {
			try {
				FileInputStream fs = new FileInputStream("C:\\Users\\Janarthanan\\Downloads\\eclipsespace\\studentapp\\src\\main\\resources\\config.properties");
				props.load(fs);	
				String dbdriver = props.getProperty("ds.db-driver");
				String dbUrl = props.getProperty("ds.db-url");
				String dbUsername = props.getProperty("ds.username");
				String dbPassword = props.getProperty("ds.password");
				if(dbdriver == null || dbUrl == null || dbUsername ==null || dbPassword == null) {
					throw new IllegalArgumentException("One of the any value is empty"); 
				}else {
//					Class.forName("com.mysql.jdbc.Driver");
//					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
					Class.forName(dbdriver);
					con = DriverManager.getConnection(dbUrl,dbUsername,dbPassword);
				}
						
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
