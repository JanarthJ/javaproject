package nonViolatingSRP;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class EmployeeDatalogicSRP {
		private Connection con;
		public EmployeeDatalogicSRP() {
			DbConncetion obj = new DbConncetion();
			this.con =  obj.getDBConnection();
		}
		//3. DB logic
		//used for fetch the employee -- 
		public EmployeeSRP getEmployeeById(int id) {
			EmployeeSRP emp = null;
			try {
				//		String query =  "SELECT * FROM employee WHERE ID =5";
				String query =  "SELECT * FROM employee WHERE ID =?";
				PreparedStatement ps = con.prepareStatement(query);
				ps.setInt(1, id);
				ResultSet rs = ps.executeQuery();
				while(rs.next()) {
					emp = new EmployeeSRP();
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
