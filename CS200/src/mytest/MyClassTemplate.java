package mytest;
import java.util.Scanner;

public class MyClassTemplate
{
   public static void main(String[] args)
   {
      Scanner kbd = new Scanner(System.in);
      String name;
      
      System.out.println( "Hello!  What is your name?" );
      name = kbd.nextLine();
      
      System.out.println( "Nice to meet you " + name + "!" );   
   }
}