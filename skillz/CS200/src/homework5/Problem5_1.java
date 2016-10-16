/**
 * 
 */
package homework5;

import java.util.Scanner;

/**
 * @author Justin
 *
 */
public class Problem5_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 *  is input 0? if not keep getting input
		 *  count amount of inputted positive #s & negative #s (exclude 0)
		 *  compute sum and average of all #'s (exclude 0)
		 */
		
		// initialize loop
		Scanner keyboard = new Scanner(System.in);
		int number = keyboard.nextInt();
		int counterPositive = 0; int counterNegative = 0; int sum = 0;
		// did user ask to stop inputting?
		while (number != 0) {
			// which kind of # did we get?
			if (number > 0) { counterPositive++; } 
			else { counterNegative++; }
			// computations
			sum = sum + number;
			// get another number
			number = keyboard.nextInt();
		}
		//output computations
		double average = sum / (counterPositive + counterNegative);
		System.out.println("You entered " + counterPositive + " positive and " + counterNegative + " negative numbers");
		System.out.println("Sum of your numbers is: " + sum);
		System.out.println("Average of your numbers is: " + average);
	}

}
