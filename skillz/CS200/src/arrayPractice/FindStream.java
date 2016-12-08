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
		int[] stream = { 2, 9, 9, 4, 7, 3, 2, 9, 4 };
		int[] sequence = { 2, 9, 4 };
		findSequence(stream, sequence);
	}
	
	public static boolean findSequence(int[] myStream, int[] mySequence)
	{
		int matchCount = 0;
		for (int i = 0; i < myStream.length; i++)
		{
				if (matchCount < mySequence.length && myStream[i] == mySequence[matchCount])
				{
					matchCount++;
					if (matchCount == mySequence.length) { return true; }
				}
				else 
				{ 
					matchCount = 0;
				}
		}
		return false;
	}
}
