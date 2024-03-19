package nonViolatingSRP;

import violatingSRP.Employee;

public class EmployeeServiceSRP {
	EmployeeDatalogicSRP dl;
	public EmployeeServiceSRP() {
		dl =  new EmployeeDatalogicSRP();
	}
	
	//2. Service or business logic
		public EmployeeSRP fetchEmployeeByIdService(int id) {
			return dl.getEmployeeById(id);
		}
}
