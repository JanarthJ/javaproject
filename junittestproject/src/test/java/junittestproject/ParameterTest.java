package junittestproject;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterTest {
	
	@ParameterizedTest
	@ValueSource(ints= {1,21,31,41})
	public void testwithvalues(int n) {
		assertTrue(isOdd(n));
	}
	
	public boolean isOdd(int num) {
		if(num % 2 != 0) {
			return true;
		}else {
			return false;
		}
	}
}
