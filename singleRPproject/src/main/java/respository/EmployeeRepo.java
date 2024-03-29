package respository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Employee;



public class EmployeeRepo {
	private Connection connection;

    public EmployeeRepo() {
    	this.connection = DbUtil.getConnection();
//    	try {
//			//	step 1: load the driver
//		Class.forName("com.mysql.jdbc.Driver");
//		// step 2 : create a connection
//		connection =  DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root", "");
//		}catch(ClassNotFoundException e) {
//			System.out.print(e);
//		}catch(SQLException e) {
//			System.out.print(e);
//		}
    }
    
    //Read
    public Employee read(int id) {
    	Employee employee = null;
        try {
            String query = "SELECT * FROM employee WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                employee = new Employee();
                employee.setId(rs.getInt("id"));
                employee.setEmpname(rs.getString("empname"));
                employee.setEmpdept(rs.getString("empdept"));
                employee.setEmpsalary(rs.getInt("empsalary"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employee;
    }
    
    //Read All employee
    public List<Employee> getAllEmployees() {
        List<Employee> employees = new ArrayList<>();
        try {
            String query = "SELECT * FROM employee";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
            	Employee employee = new Employee();
                employee.setId(resultSet.getInt("id"));
                employee.setEmpname(resultSet.getString("empname"));
                employee.setEmpdept(resultSet.getString("empdept"));
                employee.setEmpsalary(resultSet.getInt("empsalary"));
                employees.add(employee);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employees;
    }    
    
    
}
