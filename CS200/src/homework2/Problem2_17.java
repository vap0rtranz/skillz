package homework2;

/* wind chill factor
 * user enters (ambient) temp in F & windspeed in mph
 * this program calculates windchill (temperature) as:
 * t_wc = 35.74 + (0.6215 * t_a) - (35.75 * v^0.16) + (0.4275 * (t_a * v^0.16))
 * Problem2_17
*/

import java.util.*;
import java.math.*;

public class Problem2_17 {
   public static void main (String[] args) {
      
      Scanner keyboard = new Scanner (System.in);
      System.out.println("Enter ambient temperature [F]: ");
      double t_a = keyboard.nextDouble();
      System.out.println("Enter windspeed [mph]: ");
      double v = keyboard.nextDouble();
      
      double t_wc = 35.74 + (0.6215 * t_a) - (35.75 * Math.pow(v, 0.16)) + (0.4275 * (t_a * Math.pow(v, 0.16)));
      System.out.println("Windchill is: " + t_wc);
   }
}