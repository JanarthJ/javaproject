package interfaceSegragation;

interface Employee{
	void manage(); // manager will manage the employee
	void develop(); // developer can able to develop as well as testing  
	void test(); // tester can able to test only
	void working(); // manager, tester and developer all 4 will work
}



class Manager implements Employee{
	public void manage() {
		System.out.println("Manager will manage");
	}
	public void working() {
		System.out.println("Manager will Work");
	}
	@Override
	public void develop() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}
}

class Developer implements Employee{
	public void working() {
		System.out.println("Developer will Work");
	}
	public void develop() {
		System.out.println("Developer will Develop the code");
	}
	public void test() {
		System.out.println("Developer will test the code");
	}
	@Override
	public void manage() {
		// TODO Auto-generated method stub
		
	}
}

class Tester implements Employee{
	public void working() {
		System.out.println("Tester will Work");
	}
	public void test() {
		System.out.println("Tester will test the code");
	}
	@Override
	public void manage() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void develop() {
		// TODO Auto-generated method stub
		
	}	
}





public class ViolatingISP {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
