/**
 * 
 */
package homework3;

import java.util.Scanner;

/**
 * @author jupittma
 *
 */
public class Problem3_8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("enter 3 integers:");
		int num1 = keyboard.nextInt();
		int num2 = keyboard.nextInt();
		int num3 = keyboard.nextInt();
		// sort for non-descreasing; constantly increasing
		int smallnum = num1; int midnum = num2; int bignum = num3;
		int tmpnum;
		
		while ( !((smallnum <= midnum) && (midnum <= bignum)) ) 
		{
		if (smallnum > midnum ) 
		{	
			tmpnum = midnum;
			midnum = smallnum; smallnum = tmpnum;
		}
		if (midnum > bignum)
		{	
			tmpnum = bignum;
			bignum = midnum; midnum = tmpnum;
		}
		if (smallnum > bignum)
		{	
			tmpnum = bignum;
			bignum = smallnum; smallnum = tmpnum;
		}
		}
		
		System.out.println("non-descending order of [" + num1 + ", " + num2 + ", " + num3 + "] is: " + smallnum + ", " + midnum + ", " + bignum);

	}

}
