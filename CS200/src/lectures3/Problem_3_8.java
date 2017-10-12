
package lectures3;
import java.util.*;

public class Problem_3_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("enter 3 integers: ");
		int num1 = keyboard.nextInt();
		int num2 = keyboard.nextInt();
		int num3 = keyboard.nextInt();
		int bignum; int midnum; int smallnum;
		
		/*
		 * how does one numerically determine the comparison of
		 * any sequence of integeters?
		 * take the difference!
		 * if bignum - smallnum, then difference >0
		 * if bignum - smallnum = 0, then equal
		 * if smallnum - bignum, then different <0
		 */
		
		/*
		 * another way is to store the bignum, midnum, and smallnum
		 * if num1 >= num2, then bignum = num1 && midnum = num2
		 * if num3 >= num1, then bignum = num3 && midnum = num1 && smallnum = num2
		 * else (num3 >= num2), then midnum = num3 && smallnum = num2
		 * 
		 */
		
		if (num1 >= num2) {
			bignum = num1; midnum = num2; smallnum = num3;
		}
		if (num2 > num3) {
			bignum = num1; midnum = num2; smallnum = num3;
		}
		if (num3 >= num1) {
			bignum = num3; midnum = num1; smallnum = num2;
		}
		else {
			// num3 >= num2
			smallnum = num1; midnum = num3; bignum = num2;	
		}

		System.out.println(bignum + " " + midnum + " " + smallnum);
	}

}
