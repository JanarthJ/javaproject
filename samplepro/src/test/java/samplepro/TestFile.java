package samplepro;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestFile {
	@Test
	public void test() {
		assertEquals( 2,1+1); 
	}
	@Test
	public void test1() {
		boolean condition = true;
		// assertTrue: checks that a condition is true
	    assertTrue(condition); // Passes because condition is true
	}
	
	@Test
	public void test2() {
		boolean condition = false;
		// assertFalse: checks that a condition is false
	    assertFalse(condition); // Passes because the negation of condition is false
	}
	
	@Test
	public void test3() {
		Object obj = null;
	    // assertNull: checks that an object is null
	    assertNull(obj); // Passes because obj is null
	}
	
	@Test
	public void test4() {
		Object notNullObj = new Object();
		 // assertNotNull: checks that an object is not null
	    assertNotNull(notNullObj); // Passes because notNullObj is not null
	}
	
}
