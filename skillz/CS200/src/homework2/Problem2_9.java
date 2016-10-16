package homework2;

/**
 * calculate average acceleration (aka speed)
 * input of velocity & time from console
 * output acceleration to console
 * 
 * @author Justin
 *
 */
 
import java.util.Scanner;

public class Problem2_9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter v0, v1, and t [with spaces between!]: ");
      double v0 = keyboard.nextDouble();
      double v1 = keyboard.nextDouble();
      double t = keyboard.nextDouble();
      System.out.print("\n");
      
      /*
      * a = (v1 - v0) / t
      */
      
      double a = (v1 - v0) / t;
      System.out.println("Your acceleration a is: " + a);
	}

}
