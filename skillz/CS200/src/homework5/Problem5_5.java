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
public class Problem5_5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double leftPounds = 0; double rightKilograms = 0;
		System.out.println("Kilograms\tPounds\t|\tPounds\tKilograms");
		// iternate 1 to 199
		for (int leftKilograms = 1, rightPounds = 20; leftKilograms < 200; rightPounds <= 515; leftKilograms+=2; rightPounds+=5) {
			leftPounds = leftKilograms * 2.2;
			/** for (int rightPounds = 20; rightPounds <= 515; rightPounds+=5) {
			 * 
			 */
				rightKilograms = rightPounds * .45;
				System.out.println(leftKilograms + "\t" + leftPounds + "\t|\t" + rightPounds + "\t" + rightKilograms);
			//}
		}

	}

}
