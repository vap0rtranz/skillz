/**
 * 
 */
package methods_practice;

/**
 * @author jupittma
 *
 */
public class SumNumbers {

	/**
	 * @param args
	 * 
	 */
	public static int sum(int num1, int num2) {
		int result = 0;
		for (int i = num1; i <= num2; i++)
		{
			result += i;
		}
		return result;
	}
	
	public static void PrintNum(int num) {
		System.out.println("The number is: " + num);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ehllo");
		int summation = sum(1,10);
		System.out.print("The sum of 1 to 10 is: ");
		PrintNum(summation);

	}

}
