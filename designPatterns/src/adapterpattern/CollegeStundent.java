package adapterpattern;

interface Student {
	String getStudentName(); //abstract method
	String getStudentRoll();
	String getStudentAddress();
	int getStudentAge();
}
//concreate class --> Student interface
public class CollegeStundent implements Student{
	private String studentName;
	private String studentRoll;
	private String studentAddress;
	private int studentAge;
	
	
	public CollegeStundent(String studentName, String studentRoll, String studentAddress, int studentAge) {
		super();
		this.studentName = studentName;
		this.studentRoll = studentRoll;
		this.studentAddress = studentAddress;
		this.studentAge = studentAge;
	}

	@Override
	public String getStudentName() { //getter method for StudentName
		// TODO Auto-generated method stub
		return studentName;
	}

	@Override
	public String getStudentRoll() {
		// TODO Auto-generated method stub
		return studentRoll;
	}

	@Override
	public String getStudentAddress() {
		// TODO Auto-generated method stub
		return studentAddress;
	}

	@Override
	public int getStudentAge() {
		// TODO Auto-generated method stub
		return studentAge;
	}
	
	public String toString() {
		return "Name : "+this.studentName + " Roll : "+this.studentRoll;
	}
	
}
