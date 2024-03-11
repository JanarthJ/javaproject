package service;

import java.util.List;

import dao.EmployeeDao;
import modal.Employee;

public class EmployeeService {
	private EmployeeDao employeeDAO;

    public EmployeeService() {
        this.employeeDAO = new EmployeeDao();
    }
    
    //method for fetch the employee by id
    public Employee getEmployeeById(int id) {
        return employeeDAO.read(id); // Call DAO method to find Employee by ID
    } 
	//method for fetch all employee
	public List<Employee> getAllEmployees() {
	    return employeeDAO.getAllEmployees(); // Call DAO method to fetchall Employee
	}
}

