package respository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import model.Employee;

public class AccountRepo {
	private Connection connection;

    public AccountRepo() {
    	this.connection = DbUtil.getConnection();
    }  
   
    
    public int getTotalSalary() {
    	int totalSalary =0;
        try {
            String query = "SELECT empsalary FROM employee";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
            	Employee employee = new Employee();                
                employee.setEmpsalary(resultSet.getInt("empsalary"));
                totalSalary +=employee.getEmpsalary();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return totalSalary;
    }
}
