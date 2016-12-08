/**
 * 
 */
package arrayPractice;

/**
 * @author Justin
 *
 */
public class FindStream {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] stream = { 7, 3, 2, 9, 4, 8 };
		int[] sequence = { 2, 9, 4 };
		findSequence(stream, sequence);
	}
	
	public static boolean findSequence(int[] myStream, int[]mySequence)
	{
		int matchCount = 0;
		for (int i = 0; i < (myStream.length - mySequence.length); i++)
		{
			for (int j = 0; j < mySequence.length; j++)
			{
				if (myStream[i] == mySequence[j])
				{
					matchCount++;
					if (matchCount == mySequence.length) { return true; }
				}
				else 
				{ 
					matchCount = 0;
					break;
				}
			}
		}
		return false;
	}
}
