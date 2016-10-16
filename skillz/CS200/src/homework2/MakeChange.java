import java.util.Scanner;

public class MakeChange {
  public static void main (String[] args) {
      Scanner keyboard = new Scanner(System.in);
      int totPennies; int numQuarters; int numDimes; int numNickels; int numPennies;
      System.out.println("Enter the amount of pennies you brought: ");
      totPennies = keyboard.nextInt();
      numQuarters = totPennies / 25;
      totPennies = totPennies - numQuarters * 25;
      numDimes = totPennies / 10;
      totPennies = totPennies - numDimes * 10;
      numNickels = totPennies / 5;
      totPennies = totPennies - numNickels * 5;
      numPennies = totPennies;
      
      if ( numQuarters != 1 )
         System.out.println(numQuarters + " quarters ");
      else
         System.out.println(numQuarters + " quarter ");

      if (numDimes != 1)
         System.out.println(numDimes + " dimes ");
      else
         System.out.println(numDimes + " dime ");
         
      if (numNickels != 1)
         System.out.println(numNickels + " nickels ");
      else 
         System.out.println(numNickels + " nickel ");
         
      if (numPennies != 1)
         System.out.println(numPennies + " pennies.");
      else
         System.out.println(numPennies + " penny");
  }
}