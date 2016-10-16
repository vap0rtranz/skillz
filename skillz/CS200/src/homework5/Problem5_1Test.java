package homework5;

import static org.junit.Assert.*;
import org.junit.Test;

public class Problem5_1Test {

	@Test
	public void testMain() {
		fail("Not yet implemented"); // TODO
	}

	@Test 
	public void defaultTest() {
		// test 3 inputs and 2 numbers
		int number1 = -1; int number2 = 1; int number3 = 0;
		
		Problem5_1 simulate = new Problem5_1();
		//double average = sum / (counterPositive + counterNegative);
	    //Assert.assertEquals("this test once you have added your own.", 0, 1);
	  	assertTrue("sum passed", sum == 9);
	  	assertTrue("avg passed", test == 9);
	  	assertTrue("sum passed", test == 9);
	  	assertFalse("monthly payment test failed", test != 9);
	   }
}
