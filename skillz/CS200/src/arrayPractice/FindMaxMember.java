/**
 * 
 */
package arrayPractice;

/**
 * @author Justin
 *
 */
public class FindMaxMember {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayA = {7, 3, 9, 8, 2, 6, 5, 3, 11};
		int[] arrayB = {1, 9, 4, 11, 10, 3, 8, 2, 13};
		int maxNum = -1; int matches = 0;
		for (int i = 0; i < arrayA.length; i++)
			for (int j = 0; j < arrayB.length; j++)
			{
				if (arrayA[i] == arrayB[j])
					matches++;
					if (arrayA[i] > maxNum) 
					{
						maxNum = arrayA[i];
						break; // don't keep finding another repeat in 2nd array
					}
			}
		System.out.println("the max number is: " + maxNum);
	}

}
