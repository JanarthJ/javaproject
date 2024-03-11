package client;

import java.util.List;
import java.util.Scanner;

import modal.Employee;
import service.EmployeeService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeService empService = new EmployeeService();
		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter the Emp ID : ");
//		int empid = sc.nextInt();		
		
//        Employee retrievedEmployee = empService.getEmployeeById(empid);
//        
//        
//        if(retrievedEmployee != null) {
//        	System.out.println("Name : " + retrievedEmployee.getEmpname());
//            System.out.println("Dept : " + retrievedEmployee.getEmpdept());
//            System.out.println("Salary : " + retrievedEmployee.getEmpsalary());
//        }else {
//        	System.out.println("Employee ID "+empid+" Not found");
//        }
		
        List<Employee> rs = empService.getAllEmployees();
        for (Employee employee : rs) {
            System.out.println("ID: " + employee.getId());
            System.out.println("Name: " + employee.getEmpname());
            System.out.println("Department: " + employee.getEmpdept());
            System.out.println("Salary: " + employee.getEmpsalary());
            System.out.println();
        }
        
        sc.close();
	}

}
