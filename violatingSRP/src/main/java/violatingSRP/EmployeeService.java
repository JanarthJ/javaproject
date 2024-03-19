package violatingSRP;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//code EmployeeService is not in the form of SRP 
// violating SRP
public class EmployeeService {
	
	private Connection con;
	public EmployeeService() {
		//1. Establishing the DB connection 
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
	}
	
	//2. Service or business logic
	public Employee fetchEmployeeByIdService(int id) {
		return getEmployeeById(id);
	}
	
	
	//3. DB logic
	//used for fetch the employee -- 
	public Employee getEmployeeById(int id) {
		Employee emp = null;
		try {
//			String query =  "SELECT * FROM employee WHERE ID =5";
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
