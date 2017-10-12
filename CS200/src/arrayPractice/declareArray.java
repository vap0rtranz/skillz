/**
 * 
 */
package arrayPractice;

/**
 * @author Justin
 *
 */
import java.util.*;

public class declareArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// always initialize before entering a while loop
		int evenCounter = 0; int oddCounter = 0;
		System.out.println("Enter your numer: ");
		Scanner keyboard = new Scanner(System.in);
		int userNumber = keyboard.nextInt();
		
		// now begin looping
		while (userNumber > 10)
		{
			if (userNumber % 2 == 0) { evenCounter++; }
			else oddCounter++;
			
			// remember to allow terminate the while condition at the end
			System.out.println("Thanx.  Next number: ");
			userNumber = keyboard.nextInt();
		}
		
		// now some array fun
		int[] array1D = new int[20]; // of 20 members
		double[][] array2D = new double[10][20]; // of 10 row & 20 col
		printArray(array2D);
		
	}
	
	public static void printArray(double[][] my2DArray) {
		// now some array fun
				
		// loop through row & col to print each member
		for (int row = 0; row < my2DArray.length; row++)
		{
			for (int col = 0; col < my2DArray[row].length; col++)
			{
				System.out.print(my2DArray[row][col] + " ");
			}
			System.out.println();
		}
		
	}

}
