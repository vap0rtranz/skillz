package homework2;

/**
 * population projection
 * 1 birth / 7 sec
 * 1 death / 13 sec
 * 1 immigrant / 45 sec
 * years inputted from console
 * 
 * @author Justin
 *
 */
 
import java.util.Scanner;

public class Problem2_11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

   // treat the contact frequency factors of population as periods of seconds
      int birthPeriodSeconds = 7;
      int deathPeriodSeconds = 13;
      int immigrantPeriodSeconds = 45;
      
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter a number of years: ");
      int years = keyboard.nextInt();
      System.out.print("\n");
      
      /*
      * projected population = # of births that year - # of deaths that year + # of immigrants that year
      * "that year" shall be multiplication of # of years
      * I can come up with a population delta factor by determining "that year"
      * this yearly total factor then multiplied by how long the affect, so # of years
      * projectedPopulation = (yearlyBirths - yearlyDeaths + yearlyImmigrants) * years
      */
      
      //convert population periods in seconds to yearly period
      // 1 year = 365 days -> 24hrs/day -> 60mins/hr -> 60sec/min
      int yearlySeconds = 60 * 60 * 24 * 365;
      int birthPeriodYear = yearlySeconds / (int)birthPeriodSeconds;
      int deathPeriodYear = yearlySeconds / (int)deathPeriodSeconds;
      int immigrantPeriodYear = yearlySeconds / (int)immigrantPeriodSeconds;
      
      //logic problem
      
      int projectedPopulation = (birthPeriodYear - deathPeriodYear + immigrantPeriodYear) * years;
      
      System.out.println("The population in " + years + " years is projected to be " + projectedPopulation);
	}

}
