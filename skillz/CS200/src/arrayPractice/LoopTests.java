import java.util.Scanner;

public class LoopTests
{
   public static void main(String[] args)
   {
      Scanner inp = new Scanner(System.in);
      System.out.println( "Print the numbers from 2 through 10 inclusive\n-----");
      System.out.println( "------\nPrint the numbers from 10 through 2 inclusive\n-----");
      System.out.println( "------\nPrint the numbers from 1 through 50 inclusive, five numbers per line\n-----");
      System.out.println( "------\nPrint all positive odd numbers less than 100\n-----" );
      System.out.println( "------\nPrint all positive odd numbers less than 100, five per line.\n-----" );
      System.out.println( "------\nPrint the full pattern 2 5 8 ... 98 all on one line.\n-----" );
      System.out.println( "------\n(Nested loops) Print the numbers 00 01 02 03 ... 98 99\n-----" );   
      System.out.println( "------\n(Nested loops) Print the numbers 00 01 02 03 ... 98 99 five numbers per line.\n-----" );   
      System.out.println( "------\nPrint a 7 by 7 block of asterisks.\n-----" );
      System.out.println( "------\nPrint an n by n block of asterisks.\n-----" );
      System.out.println( "------\nPrint an n by n block of asterisks filled with @s.\n-----" );
      System.out.println( "------\nGet five values from the user, 1 at a time, print the sum, average, max, and min.\n-----" );   
      System.out.println( "------\nGet two different values from the user, print all values between the low and high value inclusive.\n-----" );   
      System.out.println( "------\nGet a value from the user, then keep getting values from the user until the original number is entered again. Print the sum and average.\n-----" );   
      System.out.println( "------\nGet values from the user, keep track of how many of the same elements in a row they enter.");
      System.out.println( "\t\tif they enter 1 in a row, print \"one in a row!\" ");
      System.out.println( "\t\tif they enter 2 in a row, print \"two in a row!\" ");
      System.out.println( "\t\tif they enter 3 in a row, print \"three in a row!\" ");
      System.out.println( "\t\tif they enter 4 in a row, print \"four in a row!\" ");
      System.out.println( "\t\tif they enter 5 in a row, print \"goodbye!\" and exit the input loop.");
      System.out.println( "After they enter 5 in a row, print the sum and average of all the values entered.\n------" );
   }
}

/*
 
  ----jGRASP exec: java LoopTestsAnswered -Xlint:unchecked
 Print the numbers from 2 through 10 inclusive
 -----
 2
 3
 4
 5
 6
 7
 8
 9
 10
 ------
 Print the numbers from 10 through 2 inclusive
 -----
 10
 9
 8
 7
 6
 5
 4
 3
 2
 ------
 Print the numbers from 1 through 50 inclusive, five numbers per line
 -----
 1 2 3 4 5 
 6 7 8 9 10 
 11 12 13 14 15 
 16 17 18 19 20 
 21 22 23 24 25 
 26 27 28 29 30 
 31 32 33 34 35 
 36 37 38 39 40 
 41 42 43 44 45 
 46 47 48 49 50 
 ------
 Print all positive odd numbers less than 100
 1
 3
 5
 7
 9
 11
 13
 15
 17
 19
 21
 23
 25
 27
 29
 31
 33
 35
 37
 39
 41
 43
 45
 47
 49
 51
 53
 55
 57
 59
 61
 63
 65
 67
 69
 71
 73
 75
 77
 79
 81
 83
 85
 87
 89
 91
 93
 95
 97
 99
 ------
 Print all positive odd numbers less than 100, five per line.
 1 3 5 7 9 
 11 13 15 17 19 
 21 23 25 27 29 
 31 33 35 37 39 
 41 43 45 47 49 
 51 53 55 57 59 
 61 63 65 67 69 
 71 73 75 77 79 
 81 83 85 87 89 
 91 93 95 97 99 
 ------
 Print the full pattern 2 5 8 ... 98 all on one line.
 2 5 8 11 14 17 20 23 26 29 32 35 38 41 44 47 50 53 56 59 62 65 68 71 74 77 80 83 86 89 92 95 98 
 ------
 (Nested loops) Print the numbers 00 01 02 03 ... 98 99
 00
 01
 02
 03
 04
 05
 06
 07
 08
 09
 10
 11
 12
 13
 14
 15
 16
 17
 18
 19
 20
 21
 22
 23
 24
 25
 26
 27
 28
 29
 30
 31
 32
 33
 34
 35
 36
 37
 38
 39
 40
 41
 42
 43
 44
 45
 46
 47
 48
 49
 50
 51
 52
 53
 54
 55
 56
 57
 58
 59
 60
 61
 62
 63
 64
 65
 66
 67
 68
 69
 70
 71
 72
 73
 74
 75
 76
 77
 78
 79
 80
 81
 82
 83
 84
 85
 86
 87
 88
 89
 90
 91
 92
 93
 94
 95
 96
 97
 98
 99
 ------
 (Nested loops) Print the numbers 00 01 02 03 ... 98 99 five numbers per line.
 00 01 02 03 04 
 05 06 07 08 09 
 10 11 12 13 14 
 15 16 17 18 19 
 20 21 22 23 24 
 25 26 27 28 29 
 30 31 32 33 34 
 35 36 37 38 39 
 40 41 42 43 44 
 45 46 47 48 49 
 50 51 52 53 54 
 55 56 57 58 59 
 60 61 62 63 64 
 65 66 67 68 69 
 70 71 72 73 74 
 75 76 77 78 79 
 80 81 82 83 84 
 85 86 87 88 89 
 90 91 92 93 94 
 95 96 97 98 99 
 ------
 Print a 7 by 7 block of asterisks.
 -----
 *******
 *******
 *******
 *******
 *******
 *******
 *******
 ------
 Print an n by n block of asterisks.
 -----
 Please enter a number between 1 and 9: 7
 *******
 *******
 *******
 *******
 *******
 *******
 *******
 ------
 Print an n by n block of asterisks filled with @s.
 -----
 Please enter a number between 1 and 9: 8
 ********
 *@@@@@@*
 *@@@@@@*
 *@@@@@@*
 *@@@@@@*
 *@@@@@@*
 *@@@@@@*
 ********
 ------
 Get five values from the user, 1 at a time, print the sum, average, max, and min.
 Please enter a value: 2
 Please enter a value: 3
 Please enter a value: 5
 Please enter a value: 8
 Please enter a value: 7
 Sum = 25, avg = 5.0, max = 8, min = 2
 ------
 Get two different values from the user, print all values between the low and high value inclusive.
 Please enter a value: 9
 Please enter a second value: 4
 4
 5
 6
 7
 8
 9
 ------
 Get a value from the user, then keep getting values from the user until the original number is entered again. Print the sum and average.
 Please enter a value: 4
 Please enter a value: 3
 Please enter a value: 2
 Please enter a value: 6
 Please enter a value: 7
 Please enter a value: -3
 Please enter a value: -4
 Please enter a value: 3
 Please enter a value: 7
 Please enter a value: 7
 Please enter a value: 8
 Please enter a value: 4
 Sum = 44, average = 3.6666666666666665
 
  ----jGRASP: operation complete.
 */