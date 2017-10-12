/**
 * 
 */
package lectures3;
import java.util.*;

/**
 * @author Justin
 *
 */
public class FirstLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean isFinished = false;
		int computerNum = (int) (Math.random() * 100 + 1);
		/* 
		 *  the 0-1 range from random()
		 *  offset by multiply and additive factor
		 *  we do not take factor by 11 b/c we want to include 0
		 */
		Scanner keyboard = new Scanner(System.in);
		int guess = keyboard.nextInt();
		
		while (isFinished == false)
		{
			if ( guess == computerNum )
			{
				System.out.println("congrats!");
				isFinished = true;
			} else {
				if ( computerNum < guess )
				{
					System.out.println("too high!");
				} else {
					System.out.println("too low!");
				}
				guess = keyboard.nextInt();
			}
		}
	}
}
