package studentapp;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class ClientTest {
	@BeforeClass
	public static void display3() {
		// create object or instance for the testing
		// initial invoked method
		System.out.println("Hello Test case Started in client");
	}
	
	@AfterClass
	public static void display4() {
		// closing // finally block
		// Final invoked method
		System.out.println("Hello Test case Ended in client");
	}
	
	@Test
	public void test1() {
		//test logics		
		assertEquals(2,1+1); //testcase 1
	}
}
