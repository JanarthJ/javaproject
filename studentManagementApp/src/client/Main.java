package client;

import java.util.List;
import java.util.Scanner;

import model.Student;
import service.StudentService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//entry point
		String user = "admin";
		String pass="admin123";
		
		StudentService stuService = new StudentService();
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Hey user!.. Welcome to Student Management App");
		System.out.print("Enter the username : ");
		String username = sc.nextLine();
		System.out.print("Enter the Password : ");
		String password = sc.nextLine();
		
		do {
		int roll;		
		if(user.equals(username) && pass.equals(password)) {
			System.out.println("Here, Few Choice are Available ");
			System.out.println("Enter Choice 1 : Get StudentByRollNo");
			System.out.println("Enter Choice 2 : Get All Students");
			System.out.println("Enter Choice 3 : Logout");
			System.out.print("Enter the Choice");
			choice = sc.nextInt();
			switch(choice) {
				case 1:
					System.out.print("Enter the student Roll No");
					roll = sc.nextInt();
				
					Student result =  stuService.getStudentByRollno(roll);
					if(result != null) {
						System.out.println("Student Name : "+result.getName());
						System.out.println("Student Dept : "+result.getDept());
						System.out.println("Student Year : "+result.getYear());
					}else {
						System.out.println("Student with roll no : "+roll+ "Not found");
					}
					break;
				case 2:
					List<Student> res = stuService.getStudentAll();
					for(Student stu : res) {
						System.out.println("Student Roll No : "+stu.getRollno());
						System.out.println("Student Name : "+stu.getName());
						System.out.println("Student Dept : "+stu.getDept());
						System.out.println("Student Year : "+stu.getYear());
						System.out.println();
					}
					break;
				default:
					System.out.println("Choice Correct Choice like 1 or 2");
					break;
			}	
		}else {
			System.out.println("oops!.. Access Denied !... Invalid Credential");
		}
		}while(choice !=3);			
	}

}
