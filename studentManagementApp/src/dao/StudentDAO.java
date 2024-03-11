package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Student;

public class StudentDAO {
	private Connection con;
	public StudentDAO() {
		//		Step 1 : loading the driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
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
	
	public List<Student> fetchAllStudent() {
		List<Student> lis =  new ArrayList<>();
		try {
			String query =  "SELECT * FROM student";
			PreparedStatement ps =  con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Student st =  new Student();
				st.setRollno(rs.getInt("rollno"));
				st.setName(rs.getString("name"));
				st.setYear(rs.getInt("year"));
				st.setDept(rs.getString("dept"));
				
				lis.add(st);
			}
		}catch(SQLException e) {
			System.out.println(e);
		}
		return lis;
	}
}
