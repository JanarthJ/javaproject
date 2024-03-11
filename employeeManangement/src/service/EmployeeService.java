package service;

import dao.EmployeeDAO;
import model.Employee;

public class EmployeeService {
	@SuppressWarnings("unused")
	private EmployeeDAO empdao;
	public EmployeeService() {
		this.empdao = new EmployeeDAO();
	}
	
	public Employee getEmployeeById(int id) {
		System.out.println("Id In Service :"+id);
		return empdao.read(id);		
	}
}
