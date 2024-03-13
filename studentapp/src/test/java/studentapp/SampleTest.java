package studentapp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SampleTest {
	
	@Before
	public  void display1() {
		System.out.println("Hai");
	}
	
	@After
	public  void display2() {
		System.out.println("Heyyy");
	}
	
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
	@Test
	public void test2() {
		//test logics // condition --> true
		assertTrue(10>2);//testcase 2
	}
	 
	@Test
	public void test3() {
		//test logics // condition --> false
		assertFalse(10<2);//testcase 3
	}
	
	@Test
	public void test4() {
		//test logics // checks for null
		String s = null;		
		assertNull(s); //testcase 4
	}
	
	@Test
	public void test5() {
		//test logics // checks for Non null
		String s = "";		
		assertNotNull(s); //testcase 4
	}
}
