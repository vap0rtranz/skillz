package homework5;
/**
 * 
 */

/**
 * @author Justin
 * compute 2 things & display results
 * 1) calculate tuition inflation (in 10yrs)
 * 2) calculate total cost (for 4 years after 10th)
 *
 */
public class Problem5_7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 5% inflation
		double inflationYearlyRate = 1.05;
		double tuitionYearly = 10000.00;
		double tuitionPayment = 0;
		for (int year = 1; year < 15; year++) {
			tuitionYearly = tuitionYearly * inflationYearlyRate;
			if (year == 10) {
				System.out.println("Yearly tuition has inflated to: " + tuitionYearly);
			}
			if (year > 10) {
				tuitionPayment += tuitionYearly;
			}
		}
		System.out.println("Your total, 4yr tuition payment will be: " + tuitionPayment);
	}

}
