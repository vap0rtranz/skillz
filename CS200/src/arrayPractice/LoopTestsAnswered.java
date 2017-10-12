import java.util.Scanner;

public class LoopTestsAnswered
{
   public static void main(String[] args)
   {
      Scanner inp = new Scanner(System.in);
      System.out.println( "Print the numbers from 2 through 10 inclusive\n-----");
      for(int i=2; i<=10; i++ ) 
      {
         System.out.println( i );
      }
      System.out.println( "------\nPrint the numbers from 10 through 2 inclusive\n-----");
      for(int i=10; i>=2; i-- ) 
      {
         System.out.println( i );
      }
      
      System.out.println( "------\nPrint the numbers from 1 through 50 inclusive, five numbers per line\n-----");
      int   c = 0;
      for( int i=1; i<=50; i++ ) 
      {
         System.out.print( i + " " );
         c++;
         if( c%5==0 ) System.out.println();
      }
      System.out.println( "------\nPrint all positive odd numbers less than 100" );
      for( int i=0; i<100; i++ ) 
      {
         if( i % 2 == 1 ) 
            System.out.println( i );
      }
      System.out.println( "------\nPrint all positive odd numbers less than 100, five per line." );
      c = 0;
      for( int i=0; i<100; i++ ) 
      {
         if( i % 2 == 1 ) 
         {
            System.out.print( i + " " );
            c++;
            if( c % 5 == 0 ) System.out.println();
         }
      }

      System.out.println( "------\nPrint the full pattern 2 5 8 ... 98 all on one line." );
      for( int i=2; i<100; i+=3 ) 
      {
         System.out.print( i + " " );
      }
      System.out.println();
   
      System.out.println( "------\n(Nested loops) Print the numbers 00 01 02 03 ... 98 99" );   
      for( int i=0; i<10; i++ ) 
      {
         for( int j=0; j<10; j++ ) 
         {
            System.out.println( "" + i + j );         
         }
      }

      System.out.println( "------\n(Nested loops) Print the numbers 00 01 02 03 ... 98 99 five numbers per line." );   
      c = 0;
      for( int i=0; i<10; i++ ) 
      {
         for( int j=0; j<10; j++ ) 
         {
            System.out.print( "" + i + j + " " );  
            c++;
            if( c % 5 == 0 ) System.out.println();       
         }
      }
      System.out.println( "------\nPrint a 7 by 7 block of asterisks.\n-----" );
      for( int i=0; i<7; i++ ) 
      {
         for( int j=0; j<7; j++ ) 
         {
            System.out.print("*");
         }
         System.out.println();
      }
      System.out.println( "------\nPrint an n by n block of asterisks.\n-----" );
      int n = -1;
      while( n < 1 || n > 9 )
      {
         System.out.print( "Please enter a number between 1 and 9: " );
         n = inp.nextInt();
      }
      for( int i=0; i<n; i++ ) 
      {
         for( int j=0; j<n; j++ ) 
         {
            System.out.print("*");
         }
         System.out.println();
      }
      System.out.println( "------\nPrint an n by n block of asterisks filled with @s.\n-----" );
      n = -1;
      while( n < 1 || n > 9 )
      {
         System.out.print( "Please enter a number between 1 and 9: " );
         n = inp.nextInt();
      }
      for( int i=0; i<n; i++ ) 
      {
         for( int j=0; j<n; j++ ) 
         {
            if( j==0 || j == n-1 || i==0 || i==n-1 )
               System.out.print("*");
            else  
               System.out.print("@");
         }
         System.out.println();
      }

      System.out.println( "------\nGet five values from the user, 1 at a time, print the sum, average, max, and min." );   
      c = 0;
      int total = 0;
      int max = 0;
      int min = 0;
      for(; c < 5; c++ )
      {  
         System.out.print( "Please enter a value: " );
         n = inp.nextInt();
         total += n;
         if( c == 0 )
         {
             max = n;
             min = n;
         }
         if( max < n ) 
         {
            max = n;
         }
         if( min > n ) 
         {
            min = n;
         }
      }
      System.out.println( "Sum = " + total + ", avg = " + total/5. + ", max = " + max + ", min = " + min );
      System.out.println( "------\nGet two different values from the user, print all values between the low and high value inclusive." );   
      System.out.print( "Please enter a value: " );
      int a = inp.nextInt();
      int b = a;
      while( b == a )
      {
         System.out.print( "Please enter a second value: " );
         b = inp.nextInt();
      }      
      for( int i=Math.min(a,b); i<=Math.max(a,b); i++ ) 
      {
         System.out.println( i );
      }
      System.out.println( "------\nGet a value from the user, then keep getting values from the user until the original number is entered again. Print the sum and average." );   
      System.out.print( "Please enter a value: " );
      a = inp.nextInt();
      total = a;
      c = 1;
      b = a-1;
      while( a != b )
      {
         System.out.print( "Please enter a value: " );
         b = inp.nextInt();
         total += b;
         c++;  
      }
      System.out.println( "Sum = " + total + ", average = " + (double)total / c );
   }
}