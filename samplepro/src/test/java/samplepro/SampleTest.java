package samplepro;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SampleTest {
	@Test
	public void test() {
		assertEquals( 2,1+2); 
	}
	@Test
	public void test1() {
		boolean condition = true;
		// assertTrue: checks that a condition is true
	    assertTrue(!condition); // Passes because condition is true
	}
}
