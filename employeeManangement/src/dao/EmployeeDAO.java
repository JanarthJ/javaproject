package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Employee;

public class EmployeeDAO {
	private Connection con;
	public EmployeeDAO() {
		try {			
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");			
		}catch(SQLException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public Employee read(int id ) {
		System.out.println("Id In DAO :"+id);
		Employee emp = null;
		try {
			//String query =  "SELECT * FROM employee WHERE ID =5";
			String query =  "SELECT * FROM employee WHERE ID =?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				emp = new Employee();
				emp.setId(rs.getInt("id"));
				emp.setEmpname(rs.getString("empname"));
				emp.setEmpdept(rs.getString("empdept"));
				emp.setEmpsalary(rs.getInt("empsalary"));
			}
		}catch(SQLException e) {
			System.out.println(e);
		}
		return emp;
	}
	
}
