/**
 * 
 */
package homework5;

/**
 * @author Justin
 * iterate through kilograms to pounds conversion BUT
 * only calculate every odd kilogram, silly
 *
 */
public class Problem5_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double pounds = 0;
		System.out.println("Kilograms\tPounds");
		// iternate 1 to 199
		for (int kilograms = 1; kilograms < 200; kilograms+=2) {
			pounds = kilograms * 2.2;
			System.out.println(kilograms + "\t" + pounds);
		}

	}

}
