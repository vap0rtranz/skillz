/**
 * 
 */
package homework3;

import java.util.Scanner;

/**
 * @author jupittma
 *
 */
public class Problem3_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** solve for the roots of polynomial curve
		 * given the coefficients needed for the quadratic formula
		 *  returning the result based on discriminant
		 */
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("enter the 3 coefficients:");
		int coefficient_a = keyboard.nextInt();
		int coefficient_b = keyboard.nextInt();
		int coefficient_c = keyboard.nextInt();
	
		//verify discriminant to determine # of roots / solutions
		double discriminant = (Math.pow(coefficient_b, 2) - (4*coefficient_a*coefficient_c));
		//double discriminant = 0;
		
		// discriminant is 0 so 1 root
		if (discriminant == 0)
		{
			double root_1 = ((-1 * coefficient_b) + Math.pow(discriminant, 0.5)) / (2*coefficient_a);
			String root_2 = "Only one real root for this quadratic";
			System.out.println("Those coefficients can solve the quadratic equation as: " + root_1 + ", " + root_2);
		} else 
		{
			if (discriminant > 0)
			{
				double root_1 = ((-1 * coefficient_b) + Math.pow(discriminant, 0.5)) / (2*coefficient_a);
				double root_2 = ((-1 * coefficient_b) - Math.pow(discriminant, 0.5)) / (2*coefficient_a);
				System.out.println("Those coefficients can solve the quadratic equation as: " + root_1 + ", " + root_2);
			// discriminant is positive non-ngative so 2 roots
			} else 
			{
				// discriminant is negative so 0 roots
				System.out.println("So sorry: your coefficients have no real roots for a polynomial of power 2");
			}
		}
	}

}
