package junittestproject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SampleTest {
	
	@Test
	public void validate() {
		// define your test logic
		int expectedValue = 10;
		int acutualValue =0;
		for(int i =0;i<4;i++) {
			acutualValue += i; 
		}
		assertEquals(expectedValue,acutualValue);
	}
}
