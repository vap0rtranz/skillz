package homework2;
/**
 * 
 */

import java.util.Scanner;

/**
 * @author Justin
 *
 */
class Problem2_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a degree in Celcius: ");
		double degreeCelcius = keyboard.nextDouble();
		
		// algo for conversion
		double degreeFahrenheit = ((9.0/5.0) * degreeCelcius) + (double)32;
		
		System.out.println("That's " + degreeFahrenheit + " degrees Fahrenheit!");
		
	}

}
