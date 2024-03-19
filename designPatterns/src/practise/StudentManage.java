package practise;

import java.util.ArrayList;
import java.util.List;

interface Student{//interface
	String getStudentName();
	String getStudentRoll();
	String getStudentAddress();
}

class collegeStudent implements Student{
	private String StudentName;
	private String StudentRoll;
	private String StudentAddress;
	
	public collegeStudent(String studentName, String studentRoll, String studentAddress) {
		this.StudentName = studentName;
		this.StudentRoll = studentRoll;
		this.StudentAddress = studentAddress;
	}
	@Override
	public String getStudentName() {
		return StudentName;
	}
	@Override
	public String getStudentRoll() {
		return StudentRoll;
	}
	@Override
	public String getStudentAddress() {
		return StudentAddress;
	}	
	@Override
	public String toString() {
		return "name=" + StudentName + ", roll=" + StudentRoll;
	}    
}

interface Children{
	String getFirstName();
	String getLastName();
	String getRoll();
	String getAddress();
}

class SchoolStudent implements Children {
	private String firstName;
	private String lastName;
	private String roll;
	private String address;
	public SchoolStudent(String firstName, String lastName, String roll, String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.roll = roll;
		this.address = address;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getRoll() {
		return roll;
	}
	public String getAddress() {
		return address;
	}	
	@Override
	public String toString() {
		return "name=" + firstName+lastName + ", roll=" + roll;
	}   
}

class StudentAdpater implements Student{
	private SchoolStudent ss;	
	public StudentAdpater(SchoolStudent ss) {
		this.ss = ss;
	}

	@Override
	public String getStudentName() {
		// TODO Auto-generated method stub
		return this.ss.getFirstName()+this.ss.getLastName();
	}

	@Override
	public String getStudentRoll() {
		// TODO Auto-generated method stub
		return this.ss.getRoll();
	}

	@Override
	public String getStudentAddress() {
		// TODO Auto-generated method stub
		return this.ss.getAddress();
	}
	@Override
	public String toString() {
		return "name=" + this.ss.getFirstName()+this.ss.getLastName() + ", roll=" + this.ss.getRoll();
	}  
}

public class StudentManage {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> allStudent = new ArrayList<>();
		collegeStudent c1  =  new collegeStudent("JJ","100","Chennai");
		allStudent.add(c1);		
		SchoolStudent s1 = new SchoolStudent("Jack","hary","1000","Chennai");
//		allStudent.add(s1);
		allStudent.add( new StudentAdpater(s1));		
		for(Student obj : allStudent) {
			System.out.println(obj);
		}
	}

}
