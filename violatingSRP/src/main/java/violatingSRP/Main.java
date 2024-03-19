package violatingSRP;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//entry point
		System.out.println("This Data is from  Violating SRP PACKAGE");
		EmployeeService obj =  new EmployeeService();
		int id = 5;
		Employee result = obj.fetchEmployeeByIdService(id);
		if(result != null) {				
			System.out.println("EMP NAME : "+ result.getEmpname());
			System.out.println("EMP Salary : "+ result.getEmpsalary());
			System.out.println("EMP DEPT : "+ result.getEmpdept());
		}else {
			System.out.println("oopss !.... Invalid EMP ID ");
			System.out.println("There in No employee with "+id);
		}
	}

}
