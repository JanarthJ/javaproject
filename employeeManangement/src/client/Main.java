package client;

import java.util.Scanner;

import model.Employee;
import service.EmployeeService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// entry point of my application
		try {
			do {	
			
			EmployeeService eservice = new EmployeeService();
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the EMPId To Fetch: ");
			int Id = sc.nextInt();
//			int Id = 2;
			Employee result = eservice.getEmployeeById(Id);
			if(result != null) {		
			
			System.out.println("EMP NAME : "+ result.getEmpname());
			System.out.println("EMP Salary : "+ result.getEmpsalary());
			System.out.println("EMP DEPT : "+ result.getEmpdept());
			}else {
				System.out.println("oopss !.... Invalid EMP ID ");
				System.out.println("There in No employee with "+Id);
			}
			}while(true);
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
