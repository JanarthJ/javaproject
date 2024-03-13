package studentapp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class ServiceTesting {
	@BeforeClass
	public static void display3() {
		// create object or instance for the testing
		// initial invoked method
		System.out.println("Hello Test case Started in Service");
	}
	
	@AfterClass
	public static void display4() {
		// closing // finally block
		// Final invoked method
		System.out.println("Hello Test case Ended in Service");
	}
	
	@Test
	public void test1() {
		//test logics		
		String s = "";
		assertNotNull(s); //testcase 1
	}
}
