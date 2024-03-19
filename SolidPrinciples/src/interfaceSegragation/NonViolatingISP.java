package interfaceSegragation;

//interface Employee{
//	void manage(); // manager will manage the employee
//	void develop(); // developer can able to develop as well as testing  
//	void test(); // tester can able to test only
//	void working(); // manager, tester and developer all 4 will work
//}

interface EmployeeISP{
	void working(); // manager, tester and developer all 4 will work
	void getSalary();
	void getLeave();
}
interface ManageISP{
	void manage(); // manager will manage the employee
}

interface DevelopISP{
	void develop(); // developer can able to develop as well as testing  
}

interface TestISP{
	void test(); // tester can able to test only
}

class ManagerISP  implements EmployeeISP,ManageISP{
	public void manage() {
		System.out.println("Manager will manage");
	}
	public void working() {
		System.out.println("Manager will Work");
	}
	@Override
	public void getSalary() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void getLeave() {
		// TODO Auto-generated method stub
		
	}	
}

class DeveloperISP implements EmployeeISP,DevelopISP,TestISP{
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
	public void getSalary() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void getLeave() {
		// TODO Auto-generated method stub
		
	}
	
}

class TesterISP implements EmployeeISP,TestISP{
	public void working() {
		System.out.println("Tester will Work");
	}
	public void test() {
		System.out.println("Tester will test the code");
	}
	@Override
	public void getSalary() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void getLeave() {
		// TODO Auto-generated method stub
		
	}	
}


public class NonViolatingISP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
