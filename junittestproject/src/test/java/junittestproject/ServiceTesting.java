package junittestproject;



import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.timeout;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Test;
import org.mockito.Mockito;

public class ServiceTesting {
	public UserDAO userDAO; // global scope
	@After
	public void tearDown() {
//		System.out.print("Mock reseted");
		Mockito.reset(userDAO); // reset the behaviour of userDAO after the each testcase invoked
	}
	@Test
	public void test1() {
		//mock object of Student Database 
		userDAO =  mock(UserDAO.class);
		
//		public boolen isStudentExist(String name) {
			// db operation 
			// fetch the student details from DB by student name --> getting from parameter
			//	it will check the student details if the detials retrived means  return true
			//	other wise return false
//		}
		
		//	behaviour of your mock method
//		when(userDAO.isStudentExist("Jan")).thenReturn(true); // jan in service -- true
//		doThrow(new RuntimeException("Student Not exist")).when(userDAO).isStudentExist("JAK"); // jak in service -- false
//		when(userDAO.isStudentExist("RB")).thenReturn(true);
//		when(userDAO.isStudentExist("RK")).thenReturn(false);
		// setup the behaviour 
		
		// i need to verify the USERDAO. isStudentExist will return value true or false
		// true  -- > Given Student exist
		//false -- > Given Student Not Exist.
		
		//callbacks
		when(userDAO.isStudentExist(anyString())).thenAnswer(invocation ->{
			String param1 = invocation.getArgument(0);
//			System.out.println("Student Name : "+param1);
			if(param1.length() > 5) {
				return true;
			}else {
				return false;
			}
			//provide custom implementation in addtion to actual implementation
		});
		UserService us =  new UserService(userDAO);
		
		//testcase definition
		assertTrue(us.checkStudent("Janarth")); // true
//		assertFalse(us.checkStudent("JAK")); //false
		
		
//		verify(userDAO).isStudentExist("Jan");
		//verify method is used to check the given value along with the method 
		//triggered or not 

		
		//		when(userDAO.isStudentExist("john")).thenReturn(false);
		
		
	}
	
	@Test
	public void test2() {
		userDAO =  mock(UserDAO.class);
		when(userDAO.isStudentExist("Jan")).thenReturn(true); 
		assertNotNull(userDAO); //true
		UserService us =  new UserService(userDAO);
		
		//testcase definition
		assertTrue(us.checkStudent("Jan")); // true
		verify(userDAO,timeout(5000)).isStudentExist("Jan");
	}

	
}
