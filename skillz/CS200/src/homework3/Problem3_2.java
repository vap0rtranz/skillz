/**
 * 
 */
package homework3;

import java.util.Scanner;

/**
 * @author jupittma
 *
 */
public class Problem3_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		int number1 = (int)(System.currentTimeMillis() % 10);
		int number2 = (int)(System.currentTimeMillis() / 7 % 10);
		int number3 = (int)(System.currentTimeMillis() / 3 % 10);
		
		Scanner input = new Scanner(System.in);
		System.out.println("What is " + number1 + " + " + number2 + " + " + number3 + "?");
		int guess = input.nextInt();
		System.out.println("Well, your answer is: " + (number1 + number2 + number3 == guess));
		
	}

}
