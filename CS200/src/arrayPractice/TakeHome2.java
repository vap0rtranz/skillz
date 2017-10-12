package arrayPractice;

public class TakeHome2
{
   public static void main(String[] args)
   {
      /* let's declare a 2-D array and 
         give it some hard-coded values */
      int [][] a = {{15,14,13,11,12},{6,10,8,9,7},
                  {24,25,23,21,22},{20,17,18,19,16},
                     {5,2,3,4,1}};
      int [][] a2 = {{15,19,13,11,12},{6,10,8,9,7},
                  {24,25,23,21,22},{20,17,18,19,16},
                     {5,2,3,4,1}, {3,6,2,1,5}};
                     
      int[][] a3 = {{1,1,1}, {1,1,1}, {1,1,1}};                  
                  
                  
      System.out.println( "------ Here is the original array ------");
      display(a);
      System.out.println( "------ Here is a copy of the original array ------");
      int[][] b = copyArray(a);
      display(b);
      System.out.println( "------ Here is a copy of the original array with rows 1 and 3 swapped ------");
      int[][] c = swapRows(a, 1,3);
      display(c);
      System.out.println( "------ Here is the original array again ------");
      display(a);
      System.out.println( "------------");
      int maxRow = largestRow(a);
      System.out.println( "Index of row with largest sum is: " + maxRow );
      int maxCol = largestCol(a);
      System.out.println( "Index of column with largest sum is: " + maxCol );  
      
      /* MORE STUFF */
      System.out.println( "\n-------------MORE STUFF--------------" );
      
      System.out.println( "\n------------- a2 --------------------" );
      display( a2 );     
      
      System.out.print( "Sum of row 2 = " );
      System.out.println( sumRow( a2, 1 ) ); 
        
      System.out.print( "Sum of col 2 = " );
      System.out.println( sumCol( a2, 1 ) ); 

      System.out.print( "Sum of array a is: " );
      System.out.println( sum( a ) );

      System.out.print( "Sum of array a2 is: " );
      System.out.println( sum( a2 ) );

      System.out.print( "Sum of Diagonal of array a is: " );
      System.out.println( sumDiag( a ) );

      System.out.print( "Sum of Diagonal of array a2 is: " );
      System.out.println( sumDiag( a2 ) );

      if( allTheSame( a ) )
      {
         System.out.println( "All the values in a are the same! " );
      }
      else
      {
         System.out.println( "All the values in a are not the same! " );
      }

      if( allTheSame( a2 ) )
      {
         System.out.println( "All the values in a2 are the same! " );
      }
      else
      {
         System.out.println( "All the values in a2 are not the same! " );
      }
      
      System.out.println( "\n------------- a3 --------------------" );
      display( a3 );     

      if( allTheSame( a3 ) )
      {
         System.out.println( "All the values in a3 are the same! " );
      }
      else
      {
         System.out.println( "All the values in a3 are not the same! " );
      }

      if( sameValuesInRow( a3 ) )
      {
         System.out.println( "Array a3 has a row with all the same values!" );
      }
      else
      {
         System.out.println( "Array a3 does not have a row with all the same values!" );      
      }
      if( sameValuesInRow( a ) )
      {
         System.out.println( "Array a has a row with all the same values!" );
      }
      else
      {
         System.out.println( "Array a does not have a row with all the same values!" );      
      }
      if( sameValuesInRow( a2 ) )
      {
         System.out.println( "Array a2 has a row with all the same values!" );
      }
      else
      {
         System.out.println( "Array a2 does not have a row with all the same values!" );      
      }
      
      if( sameValuesInCol( a3 ) )
      {
         System.out.println( "Array a3 has a column with all the same values!" );
      }
      else
      {
         System.out.println( "Array a3 does not have a column with all the same values!" );      
      }
      if( sameValuesInCol( a ) )
      {
         System.out.println( "Array a has a column with all the same values!" );
      }
      else
      {
         System.out.println( "Array a does not have a column with all the same values!" );      
      }
      if( sameValuesInCol( a2 ) )
      {
         System.out.println( "Array a2 has a column with all the same values!" );
      }
      else
      {
         System.out.println( "Array a2 does not have a column with all the same values!" );      
      }
      
      System.out.println( "Index of row in a with the smallest sum is: " + smallestRow(a)); 
      System.out.println( "Index of column in a with the smallest sum is: " + smallestCol(a)); 
   }
   
   /* write a void method named display that receives a 2d array
      and displays it to the screen one array row per screen row.  
      Each value of the array should be separated by a 
      single tab character */
   public static void display(int[][] r)
   {
      for( int i=0; i<r.length; i++ ) 
      {
         for(int j=0; j<r[i].length; j++ ) 
         {
            System.out.print( r[i][j] + "\t" );         
         }
         System.out.println();
      }
   }

   /* write an int method named largestRow that receives a 2d array
      and returns the index (0-based) of the row with the largest sum */
   public static int largestRow(int[][] g)
   {
      int max = 0;
      int maxIdx = 0;
      int sum = 0;
      for( int j=0; j<g[0].length; j++ ) 
      {
         sum = sum + g[0][j]; 
      }
      max = sum;
      for( int i=1; i<g.length; i++ )
      {
         sum = 0;
         for( int j=0; j<g[i].length; j++ ) 
         {
            sum = sum + g[i][j]; 
         }
         if( sum > max )
         {
            max = sum;
            maxIdx = i;
         }
      }
      return maxIdx;
   }
   /* write an int[][] method named copyArray that receives a 
      2d array and returns a new 2d array of the same size that 
      contains the same values in the same locations as the 
      original array */  
   public static int[][] copyArray(int[][] r)
   {
      int[][] t = new int[r.length][r[0].length];
      for( int i=0; i<t.length; i++ )
      {
         for( int j=0; j<t[0].length; j++ ) 
         {
            t[i][j] = r[i][j];
         }
      }
      return t;
   }
   
   /* write an int method named largestCol that receives a 2d array
      and returns the index (0-based) of the column with the 
      largest sum */
   public static int largestCol(int[][] g)
   {
      int max = 0;
      int maxIdx = 0;
      int sum = 0;
      for( int j=0; j<g.length; j++ ) 
      {
         sum = sum + g[j][0]; 
      }
      max = sum;
      for( int j=1; j<g[0].length; j++ )
      {
         sum = 0;
         for( int i=0; i<g.length; i++ ) 
         {
            sum = sum + g[i][j]; 
         }
         if( sum > max )
         {
            max = sum;
            maxIdx = j;
         }
      }
      return maxIdx;
   }
   
   /* write an int[][] method named swapRows that receives a 
      2d array along with two row indices and returns a new 
         2d array of the same size that contains the same 
         values in the same locations as the original array. 
         The difference here is the values of two rows indicated 
         by the row indices are swapped */  
   public static int[][] swapRows(int[][] s, int r1, int r2)
   {
      int[][] t = copyArray(s);
      for( int i=0; i<t[0].length; i++ )
      {
         int tmp = t[r1][i];
         t[r1][i] = t[r2][i];
         t[r2][i] = tmp;
      }
      return t;
   }
   /* MORE STUFF TO WORK ON */
   
/* return the sum of the r'th row of array a */
   public static int sumRow( int[][] a, int r )
   {
      int sumRow = 0;
      for (int i = 0; i < a[r].length; i++)
      {
    	  sumRow += a[r][i];
      }
	  return sumRow;
   }

/* return the sum of the c'th column of array a */
   public static int sumCol( int[][] a, int c )
   {
	  int sum = 0;
	  for (int j = 0; j < a.length; j++)
	  {
		  sum += a[j][c];
	  }
      return sum;
   }

/* return the sum of the diagonal from upper left to lower right */
/* this ONLY WORKS if array is SQUARE!  If it is not SQUARE, return -1 */
   public static int sumDiag( int[][] a )
   {
	  int sumDiag = 0;
	  if ( a.length == a[0].length )
	  {
		  for (int i = 0; i < a.length; i++)
		  {
			  sumDiag += a[i][i];
		  }
		  return sumDiag;
	  }
	  else { return -1; }
   }

/* return the sum of all values in the array */
   public static int sum( int[][] a )
   {
	  int sum = 0;
	  for (int i = 0; i < a.length; i++)
	  {
		  for (int j = 0; j < a[i].length; j++)
		  {
			  sum += a[i][j];
		  }
	  }
      return sum;   
   }

/* return true if all values in array a are the same */
   public static boolean allTheSame( int[][] a )
   {
	  for (int i = 0; i < a.length - 1; i++)
	  {
		  for (int j = 0; j < a[0].length - 1; j++)
		  {
			  if ( a[i][j] != a[i][j+1] )
				  return false;
			  if ( a[i][j] != a[i+1][j] )
				  return false;
		  }
	  }
      return true;   
   }

/* return true if array a has at least ONE ROW with all the same values */
   public static boolean sameValuesInRow( int[][] a )
   {
	  int matchCount = 0;
	  for (int i = 0; i < a.length; i++)
	  {
		 for (int j = 0; j < a[i].length - 1; j++)
		 {
			 if ( a[i][j] == a[i][j+1] ) { matchCount++; }
			 else { break; }
			 if ( matchCount == a.length ) { return true; }
		 }
	  }
	  return false;    
   }

/* return true if array a has at least ONE COLUMN with all the same values */
   public static boolean sameValuesInCol( int[][] a )
   {
	   int matchCount = 0;
		  for (int i = 0; i < a.length - 1; i++)
		  {
			 for (int j = 0; j < a[i].length ; j++)
			 {
				 if ( a[i][j] == a[i+1][j] ) { matchCount++; }
				 else { break; }
				 if ( matchCount == a[i].length ) { return true; }
			 }
		  }
		  return false;        
   }

/* return index (0 - n-1) of row with smallest sum. */
   public static int smallestRow( int[][] g )
   {
	   int min = 0;
	   int rowIndex = 0;
	   int sum = 0;
	   for( int j=0; j<g[0].length; j++ ) 
	   {
	      sum = sum + g[0][j]; 
	   }
	   min = sum;
	   for( int i=1; i<g.length; i++ )
	   {
	      sum = 0;
	      for( int j=0; j<g[i].length; j++ ) 
	      {
	         sum = sum + g[i][j]; 
	      }
	      if( sum < min )
	      {
	         min = sum;
	         rowIndex = i;
	      }
	   }
	   return rowIndex;   
   }

/* return index (0 - n-1) of column with smallest sum. */
   public static int smallestCol( int[][] a )
   {
	  int colIndex = 0; int min = 0; int sum = 0;
	  // get a 1st column sum
	  for (int i = colIndex; i < a[colIndex].length; i++)
	  {
		  sum += a[i][colIndex];
	  }
	  min = sum;
	  // iritate through rest of 2D array to check for smaller sum
      for (int i = colIndex + 1; i < a.length; i++)
      {
    	  sum = 0;
    	  for (int j = 0; j < a[i].length; j++)
    	  {
    		  sum += a[i][j];
    		  if ( sum < min) { min = sum; colIndex = j; }
    	  }
      }
	  return colIndex;   
   }
}