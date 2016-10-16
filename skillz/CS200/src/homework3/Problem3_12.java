/**
 * 
 */
package homework3;

import java.util.Scanner;

/**
 * @author jupittma
 *
 */
public class Problem3_12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3 digit palindrome
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 3 numbers:");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		
		if (num1 == num3) { System.out.println("Your sequence is a palindrome.");}
		else { System.out.println("Your sequence of " + num1 + num2 + num3 + " is not a palindrome.");}

	}

}
