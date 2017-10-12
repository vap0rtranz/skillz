/**
 * 
 */
package mytest;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * @author Justin
 *
 */
public class LoanTest {

	/**
	 * Test method for {@link mytest.Loan#Loan(double, int, double)}.
	 */
	@Test
	public void testGetMonthlyPayment() {
		double annualInterestRate = 2.5; int numberOfYears = 10; double loanAmount = 1000;
		Loan loanTest = new Loan(annualInterestRate, numberOfYears, loanAmount);
		int paymentTest = (int) loanTest.getMonthlyPayment();
		assertTrue("Monthly payement calculation correct", paymentTest == 9);
		assertFalse("monthly payment test failed", paymentTest != 9);
	}

	/**
	 * Test method for {@link mytest.Loan#getMonthlyPayment()}.
	 */
	
	/**
	 * 
	 * @Test
		public void testGetTotalPayment() {
		
		fail("Not yet implemented"); // TODO
	} 
	 * 
	 * 
	 */	

}
