/**
 * 
 */
package homework3;

import java.util.Scanner;

/**
 * @author jupittma
 *
 */
public class Problem3_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		// I just didn't have the confidence to this much math without variables :)
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the coefficients of your linear equation so I can do Carmer's rule:");
		double coefficient_a = input.nextInt();
		double coefficient_b = input.nextInt();
		double coefficient_c = input.nextInt();
		double coefficient_d = input.nextInt();
		double coefficient_e = input.nextInt();
		double coefficient_f = input.nextInt();

		System.out.println("For the linear equation given,");
		if ((coefficient_a*coefficient_d)-(coefficient_b*coefficient_c) == 0)
		{
			System.out.println("There is no real solution.");
		} else
		{
			System.out.println("x is : " + ((coefficient_e*coefficient_d) - (coefficient_b*coefficient_f)) / ((coefficient_a*coefficient_d) - (coefficient_b*coefficient_c)) );
			System.out.println("y is : " + ((coefficient_a*coefficient_f) - (coefficient_e*coefficient_c)) / ((coefficient_a*coefficient_d) - (coefficient_b*coefficient_c)) );
		}
	}

}
