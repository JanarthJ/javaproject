package client;

import java.util.List;
import java.util.Scanner;

import model.Employee;
import service.AccountService;
import service.EmployeeService;

public class Main {
	public static void main(String args[]) {
		EmployeeService empService = new EmployeeService();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Emp ID : ");
		int empid = sc.nextInt();				
	     Employee retrievedEmployee = empService.getEmployeeById(empid);
	      
	      if(retrievedEmployee != null) {
	        	System.out.println("Name : " + retrievedEmployee.getEmpname());
	            System.out.println("Dept : " + retrievedEmployee.getEmpdept());
	            System.out.println("Salary : " + retrievedEmployee.getEmpsalary());
	        }else {
	        	System.out.println("Employee ID "+empid+" Not found");
	       }
	      
	      AccountService acService =  new AccountService();
	      int totalsalary = acService.getTotalEmpSalary();
	      System.out.println("Total EMP Salay In Our Company : "+totalsalary);
        
        sc.close();
	}
}
