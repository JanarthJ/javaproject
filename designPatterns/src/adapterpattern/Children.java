package adapterpattern;

interface Child {
	String getFirstName(); //abstract method
	String getLastName(); //
	String getRollNo(); // incompatible 
	String getAddress();
	int getAge();
}

public class Children implements Child {
	private String firstName;
	private String lastName;
	private String rollNo;
	private String address;
	private int age;
	
	public String toString() {
		return "Name : "+this.firstName + " Roll : "+this.rollNo;
	}

	public Children(String firstName, String lastName, String rollNo, String address, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.rollNo = rollNo;
		this.address = address;
		this.age = age;
	}

	@Override
	public String getFirstName() {
		// TODO Auto-generated method stub
		return firstName;
	}

	@Override
	public String getLastName() {
		// TODO Auto-generated method stub
		return lastName;
	}

	@Override
	public String getRollNo() {
		// TODO Auto-generated method stub
		return rollNo;
	}

	@Override
	public String getAddress() {
		// TODO Auto-generated method stub
		return address;
	}

	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return age;
	}
}
