package studentapp;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class SampleJunitTesting {
	@BeforeClass
	public static void display3() {
		// create object or instance for the testing
		// initial invoked method
		System.out.println("Hello Test case Started");
	}
	
	@AfterClass
	public static void display4() {
		// closing // finally block
		// Final invoked method
		System.out.println("Hello Test case Ended");
	}
	
	@Test
	public void test1() {
		//test logics		
		assertEquals(2,1+1); //testcase 1
	}
}
