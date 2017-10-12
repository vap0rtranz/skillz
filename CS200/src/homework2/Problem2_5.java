package homework2;

/**
 * calculate tips
 * 
 * @author Justin
 *
 */
 
import java.util.Scanner;

public class Problem2_5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter the bill subtotal and gratuity rate [with spaces between!]: ");
      double billSubtotal = keyboard.nextDouble();
      double gratuityRate = keyboard.nextDouble();
      System.out.print("\n");
      
      /*
      * billTotal = billSubtotal * (gratuityRate / 100)
      */
      
      double gratuityTotal = billSubtotal * (gratuityRate / 100);
      double billTotal = billSubtotal + (billSubtotal * (gratuityRate / 100));
      System.out.println("The gratuity is " + gratuityTotal + " and your total bill is: " + billTotal);
	}

}
