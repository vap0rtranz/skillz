/**
 * 
 */
package homework3;

import java.util.Scanner;

/**
 * @author Justin
 *
 */
public class Problem3_17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int userNum;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("scissor, rock, or paper?");
		String userSelect = keyboard.next();
		switch(userSelect)
		{
		case "scissor": userNum = 0; break;
		case "rock": userNum = 1; break;
		case "paper": userNum = 2; break;
		default: userNum = -1;
		}
		int computerNum = (int)(Math.random() * 10 % 2);
		//int computerNum = 2;
		// tie
		if (userNum == computerNum ) { System.out.println("A tie!"); }
		// scissor beats paper
		if (userNum == 0 && computerNum == 2) { System.out.println("You win! I drew paper."); }
		// rock beats scissor
		if (userNum == 1 && computerNum == 0) { System.out.println("You win! I drew scissor"); }
		// paper beats rock
		if (userNum == 2 && computerNum == 1) { System.out.println("You win! I drew rock."); }
		// and inverse
		if (computerNum == 0 && userNum == 2) { System.out.println("You lose. I drew scissor."); }
		// rock beats scissor
		if (computerNum == 1 && userNum == 0) { System.out.println("You lose. I drew rock"); }
		// paper beats rock
		if (computerNum == 2 && userNum == 1) { System.out.println("You lose. I drew paper."); }
	}
}
