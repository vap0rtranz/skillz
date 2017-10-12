/**
 * 
 */
package lectures3;

import java.util.Scanner;

/**
 * @author Justin
 *
 */
public class SecondLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int guess = keyboard.nextInt();
		int div = 1;
		while (div <= guess)
		{
			if (guess % div == 0)
			{
				System.out.println(div + " is a factor ");
			} else {
				//System.out.println(div + " isn't a factor ");
			}
			div = div + 1;
		}
	}

}
