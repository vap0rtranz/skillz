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
		for (int i = 0, j = myArray.length - 1; i < myArray.length && j > 0; i++, j--)
			return true;
		return false;
	}

}
