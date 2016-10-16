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
	public void testLoanDoubleIntDouble() {
		double annualInterestRate = 2.5;
		int numberOfYears = 5;
		double loanAmount = 1000;
		Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);
		assertTrue(loan.getMonthlyPayment() == 500);
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link mytest.Loan#getMonthlyPayment()}.
	 */
	@Test
	public void testGetMonthlyPayment() {
		
		fail("Not yet implemented"); // TODO
	}

}
