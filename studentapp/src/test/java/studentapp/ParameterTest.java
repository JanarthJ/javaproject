package studentapp;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParameterTest {
	@ParameterizedTest
    @ValueSource(ints = {1, 21, 3, 41, 5})
    public void testIsPrime(int number) {
//        boolean result = isOdd(number);
        assertTrue(isOdd(number));
    }
	 public boolean isOdd(int num) {
		 if(num % 2 !=0) {
			 return true;
		 }else {
			 return false;
		 }
	 }	 
}
