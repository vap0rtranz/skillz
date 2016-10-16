/**
 * 
 */
package mytest;

/**
 * @author Justin
 *
 */

public class Loan {
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
   	
	/** Default constructor */
	public Loan() {
		this (2.5, 1, 1000);
		System.out.println("Loan created!");
	}
	
	/** contrust loan */
	public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
		this.annualInterestRate = annualInterestRate;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
	}
	
	/** return annualInterestRate */
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	/** set new interest rate */
	public void setAnnualInterestRate (double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public int getNumberOfYears() {
		return numberOfYears;
	}
	
	public void setNumberOfYears(int numberOfYears) {
		this.numberOfYears = numberOfYears;
	}
	
	public double getLoanAmount() {
		return loanAmount;
	}
	
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	
	/** calculate monthly payment */
	public double getMonthlyPayment() {
		double monthlyInterestRate = annualInterestRate  / 1200;
		double monthlyPayment = loanAmount * monthlyInterestRate / 
				(1 - (1 / Math.pow(1 + monthlyInterestRate, 12 * numberOfYears)));
		System.out.println("Payment calculated!");
		return monthlyPayment;
	}
   
     public static void main (String[] args) {
   }

}
