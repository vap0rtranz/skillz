/**
 * 
 */
package homework3;

/**
 * @author jupittma
 *
 */
public class Problem3_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		// index months starting with 0, not 1388602
		
		int someNumber = (int)(Math.random() * 11);
		String month;
		//int timedNumber = (int)(System.currentTimeMillis() % 11);
		
		switch (someNumber)
		{
		case 0: month = "January"; break;
		case 1: month = "February"; break;
		case 2: month = "March"; break;
		case 3: month = "April"; break;
		case 4: month = "May"; break;
		case 5: month = "June"; break;
		case 6: month = "July"; break;
		case 7: month = "August"; break;
		case 8: month = "September"; break;
		case 9: month = "October"; break;
		case 10: month = "November"; break;
		case 11: month = "December"; break;
		default: month = "oops";
		}
		
		System.out.println("random month is: " + month);
		//System.out.println("Well, your answer random and timed numbers are: " + someNumber + ", " + timedNumber);
		
	}

}
