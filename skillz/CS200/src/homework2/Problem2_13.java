/**
 * compound savings calculator
 * user inputs how much they save monthly
 * user inputs their annual savings rate
 * calculate monthly savings subtotal
 * calculate monthly compounding subtotal
 * forecast savings
 * 
 * @author Justin
 *
 */

package homework2;
import java.util.*;
import java.math.*;

public class Problem2_13 {

	public static void main(String[] args) {
		
		/**
		 * Get loan paramters from user
		 * 
*/
		
		Scanner keyboard = new Scanner(System.in);
			    
	   System.out.println( "How much are you saving monthly?" );
	   float savingsAmount = keyboard.nextFloat();
	   System.out.println( "What's the interest on this savings account? [APR] "?
      float monthlyInterestRate = keyboard.nextFloat() / 100 / 12;
	   System.out.println( "How many months do you want to forecast in total, compounded savings?" );
	   short numberOfMonths = keyboard.nextShort();
	     	    
	    /**
		 * monthly subtotal = previous total + monthly savings
       * monthly compounding = monthly subtotal * monthly rate
       * monthly total = monthly subtotal + monthly compounding
 		 */

	    double monthlySavingsAccount = ((savingsAmount * monthlyInterestRate ) / 
	    		(1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfMonths))));
	    System.out.println("Your monthly payment should be: " + monthlySavingsAccount);
	}

}
