package homework2;

/**
 * calculate/convert units of time from period of time
 * 
 * @author Justin
 *
 */
 
import java.util.Scanner;

public class Problem2_7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter a number of minutes: ");
      int minutes = keyboard.nextInt();
      System.out.print("\n");
      
      /*
      * minutes -> days -> years
      * 60mins * 24hrs = 1 day; 365 days = 1 year
      */
      
      int days = minutes / 24 / 60;
      int years = days / 365;
      
      System.out.println(minutes + " mins is " + years + " years and " + days + " days.");
	}

}
