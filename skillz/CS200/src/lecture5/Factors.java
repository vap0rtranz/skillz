/**
 * 
 */
package lecture5;

/**
 * @author Justin
 *
 */
public class Factors {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numerator = 10;
		int denominator = 1;
		if ( numerator >= denominator) {
			if ( numerator % denominator == 0 ){
				System.out.println(denominator + " is a factor of " + numerator);
			}
			denominator++;
		}
	}

}
