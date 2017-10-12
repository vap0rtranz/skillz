package homework2;

/* * 
 * this little program calculates the shortest, linear distance from point to point (2D, so x & y)
 * @author Justin
 *
 */

import java.util.*;
import java.math.*;

public class Problem2_15 {

   public static void main(String[] args) {
		
		/**
		 * Get points from user
		 * 
*/
		
       Scanner keyboard = new Scanner(System.in);
		
       System.out.println("Enter coordinate points [x1 y1]: ");
	    double x1 = keyboard.nextDouble();
       double y1 = keyboard.nextDouble();
	    
	    System.out.println("Enter coordinate points [x2 y2]:" );
	    double x2 = keyboard.nextDouble();
       double y2 = keyboard.nextDouble();
	    
	    /**
		 * Forumla for linear distance b/w 2 points in 2D:
		 * 1)	D = sqrt (x2 - x1)^2 + (y2 - y1)^2 
       */

	    double distance = Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2));
	    System.out.println("The linear distance between those points is: " + distance);
	}

}
