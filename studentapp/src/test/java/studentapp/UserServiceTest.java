package studentapp;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.timeout;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;

public class UserServiceTest {
		public UserDAO userDAO ;
//		@After
//	    public void tearDown() {
//	        // Reset the mock after each test method to ensure a clean state for the next test
//	        Mockito.reset(userDAO);
//	    }
		
	   @Test
	    public void testIsValidUser() {
	        // Create a mock UserDAO
	        userDAO = mock(UserDAO.class);
	        
	        // Define behavior of the mock object
	        when(userDAO.exists("john")).thenReturn(false);
	        when(userDAO.exists("doe")).thenReturn(true);

	        // Create UserService with the mock UserDAO
	        UserService userService = new UserService(userDAO);

	        // Test cases
	        assertFalse(userService.isValidUser("john")); // Should return true
	        assertTrue(userService.isValidUser("doe")); // Should return false
	        
	        verify(userDAO,timeout(5000)).exists("johns");
	        
	        
	    }
	 @Test
	 public void display() {
		// Create a mock UserDAO
	     UserDAO userDAO = mock(UserDAO.class);
	     //when(userDAO.exists("john")).thenReturn(false);
	     
	    // Define the behavior of the mock to throw an exception when exists() is called
	     doThrow(new RuntimeException("Database error")).when(userDAO).exists("john");
	     
	     // Create UserService with the mock UserDAO
	      UserService userService = new UserService(userDAO);

        // Test cases
	   // Perform the action that should trigger the exception
	      boolean result = userService.isValidUser("johns");
	      assertFalse(result); // Should return true

	 }
	 
	 @Test
	 public void display1() {
		// Create a mock UserDAO
	     UserDAO userDAO = mock(UserDAO.class);  
	  // Define a callback to perform custom logic when add() is called
	        when(userDAO.exists(anyString())).thenAnswer(invocation -> {
	            String arg1 = invocation.getArgument(0);	   
//	            System.out.println("Welcome "+arg1);
	            if(arg1.length() > 5) {
	            	return true;
	            }else {
	            	return false;
	            }	            
	        });	     
	     // Create UserService with the mock UserDAO
	      UserService userService = new UserService(userDAO);
        // Test cases
	   // Perform the action that should trigger the exception
	      boolean result = userService.isValidUser("johnson");
	      assertTrue(result); // Should return true
	 }
}
