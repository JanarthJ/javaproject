package studentapp;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ClientTest {
	private boolean condition;
    private boolean expected;
    private boolean actual;
    private Object obj;
    private Object notNullObj;

    @Before
    public void setUp() {
        // Initialize variables before each test
        condition = true;
        expected = true;
        actual = true;
        obj = null;
        notNullObj = new Object();
    }

    @After
    public void tearDown() {
        // Clean up resources after each test (if needed)
    }

    
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
