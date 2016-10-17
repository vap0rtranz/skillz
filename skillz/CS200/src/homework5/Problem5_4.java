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
public class Problem5_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double miles = 0;
		System.out.println("Kilometers\tMiles");
		// iternate 1 to 199
		for (int kilometers = 1; kilometers <= 10; kilometers++) {
			miles = kilometers * 1.609;
			System.out.println(kilometers + "\t" + miles);
		}

	}

}
