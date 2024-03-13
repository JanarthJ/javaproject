package client;

import StudentService.StudentService;
import model.Student;

public class Main {	
	public static void main(String[] args) {
		StudentService stuService = new StudentService();
		// TODO Auto-generated method stub
		System.out.print("Enter the student Roll No");
		int roll = 100;
	
		Student result =  stuService.getStudentByRollno(roll);
		if(result != null) {
			System.out.println("Student Name : "+result.getName());
			System.out.println("Student Dept : "+result.getDept());
			System.out.println("Student Year : "+result.getYear());
		}else {
			System.out.println("Student with roll no : "+roll+ "Not found");
		}
	}
}
