package service;


import java.util.List;

import model.Employee;
import respository.EmployeeRepo;

public class EmployeeService {
	private EmployeeRepo emprepo;
	public EmployeeService() {
		this.emprepo = new EmployeeRepo();
	}
	
	public Employee getEmployeeById(int id) {
		System.out.println("Id In Service :"+id);
		return emprepo.read(id);		
//		return null;
	}
	
	public  List<Employee> getAllEmployees() {
		return emprepo.getAllEmployees();		
//		return null;
	}
	
	
}
