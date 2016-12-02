/**
 * 
 */
package arrayPractice;

/**
 * @author Justin
 *
 */
public class BonusGame {

	/**
	 * @param args
	 */
	
	public static int[] getButtonStream(int[] myButtonStream)
	{
		return myButtonStream;
	}
	
	public static int findBonusSequence(int[] myButtonStream, int[][] myBonusButtonSequence)
	{
		int matchCount;
		int myBonusIndex = -1;
		// find match between button stream and bonus sequence
		for (int streamIndex = 0; streamIndex < myButtonStream.length; streamIndex++)
		{
			for (int sequenceIndex = 0; sequenceIndex < myBonusButtonSequence.length; sequenceIndex++)
			{
				matchCount = 0;
				for (int buttonIndex = 0; buttonIndex < myBonusButtonSequence[sequenceIndex].length; buttonIndex++)
				{
					if (myBonusButtonSequence[sequenceIndex][buttonIndex] != myButtonStream[streamIndex]) { break; }
					else { matchCount++; }
				}
				if ( matchCount == myBonusButtonSequence[sequenceIndex].length ) {myBonusIndex = sequenceIndex; break; } 
			}
		}
		return myBonusIndex;
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
	}

}
