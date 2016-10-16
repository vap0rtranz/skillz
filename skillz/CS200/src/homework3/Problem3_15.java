/**
 * 
 */
package homework3;

import java.util.Scanner;

/**
 * @author jupittma
 *
 */
public class Problem3_15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// lottery number is random w/ offset
		int lottery = (int)(Math.random() * 1000);
		Scanner input = new Scanner(System.in);
		
		// gullable user guesses 
		System.out.println("Guess a 3 digit number (between 0 - 1000). ex: 001, 199, 321: ");
		int guess = input.nextInt();
		//int guess = lottery;
		
		// parse numbers in guess & lottery
		int guessDigit1 = guess / 100;
		int guessDigit2 = guess / 10 % 10;
		int guessDigit3 = guess % 10;
		int lotteryDigit1 = lottery / 100;
		int lotteryDigit2 = lottery / 10 % 10;
		int lotteryDigit3 = lottery % 10;
		
		// win conditions
		if (guess == lottery)
		{
			System.out.println("Jackpot!  You win $10,000!");
		} else if (
				(guessDigit1 == lotteryDigit1 ||
				guessDigit1 == lotteryDigit2 ||
				guessDigit1 == lotteryDigit3 ) &&
				(guessDigit2 == lotteryDigit1 ||
				guessDigit2 == lotteryDigit2 ||
				guessDigit2 == lotteryDigit3) &&
				(guessDigit3 == lotteryDigit1 ||
				guessDigit3 == lotteryDigit2 ||
				guessDigit3 == lotteryDigit3 )
				)
		{
			System.out.println("Your guess matches all numbers in the lottery.  You win $3,000!");
		} else if (
				(guessDigit1 == lotteryDigit1 ||
				guessDigit1 == lotteryDigit2 ||
				guessDigit1 == lotteryDigit3 ||
				guessDigit2 == lotteryDigit1 ||
				guessDigit2 == lotteryDigit2 ||
				guessDigit2 == lotteryDigit3 ||
				guessDigit3 == lotteryDigit1 ||
				guessDigit3 == lotteryDigit2 ||
				guessDigit3 == lotteryDigit3 
				)
				)
		{
			System.out.println("Your guess matches at least one number in the lottery.  You win $1,000!");
		} else { System.out.println("Sorry, your guess matches no numbers in the lottery.  You win nothing."); }
		System.out.println("The lottery was: " + lottery);
	}

}
