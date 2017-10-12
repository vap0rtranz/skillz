/**
 * 
 */
package arrayPractice;

/**
 * @author Justin
 *
 */
public class AnotherArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 3, 4, 5, 5, 4, 3 };
		findPalendrone(numbers);
	}
	
	public static boolean findPalendrone(int[] myArray)
	{
		int matchCounter = 0;
		for (int i = 0, j = myArray.length - 1; i <= j; i++, j--)
		{
			if (myArray[i] == myArray[j])
			{
				matchCounter++;
				if (matchCounter >= myArray.length / 2) 
				{
					System.out.println("Palindrome!");
					return true;
				}
			}
		}
		return false;
	}

}
