/**
 * 
 */
package arrayPractice;

/**
 * @author Justin
 *
 */
public class BonusGame {
	
	public static int[] getButtonStream(int[] myButtonStream)
	{
		return myButtonStream;
	}
	
	public static int findBonusSequence(int[] myButtonStream, int[][] myBonusButtonSequence)
	{
		// find match between button stream and bonus sequence
		int matchCount;
		for (int streamIndex = 0; streamIndex < myButtonStream.length; streamIndex++)
		{
			matchCount = 0;
			for (int sequenceIndex = 0; sequenceIndex < myBonusButtonSequence.length; sequenceIndex++)
			{
				while (myButtonStream[streamIndex] == myBonusButtonSequence[sequenceIndex][matchCount])
				{
					if ( matchCount < myBonusButtonSequence[sequenceIndex].length ) { matchCount++; }
					else if (matchCount == myBonusButtonSequence[sequenceIndex].length) { return sequenceIndex; }
				} 
				matchCount = 0;
			}
		}
		return -1;
	}
	
	public static void printBonus(int myBonusIndex, int[] myBonusPoints)
	{
		System.out.println("Your bonus points are: " + myBonusPoints[myBonusIndex]);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// the bonus points
		int[] bonusPoints = new int[] { 0, 10, 100, 1000};
		// the console button sequences that earn bonus
		int[][] bonusButtonSequences = new int[][] {{1, 1, 2, 2}, {1, 3, 5, 7}, {9, 8, 7, 6}, {0, 0, 0, 0}};
		// a sample console button sequence
		int[] buttonStreamSample = new int[] { 0, 1, 1, 2, 2, 0, 9, 8, 7, 6, 0, 1, 1, 2, 2, 1, 3, 5, 7};
		// just get a stream of buttons
		int[] buttonStream = getButtonStream(buttonStreamSample);
		// search through the button stream for a sequence of buttons that are a bonus, and tell which bonus
		int bonusIndex = findBonusSequence(buttonStream, bonusButtonSequences);
		// print the bonus points
		printBonus(bonusIndex, bonusPoints);
		//
	}

}
