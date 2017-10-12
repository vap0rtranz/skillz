package methods_practice;

public class PassingArrays {
	public static void printArray(int[] array) 
	{
		for (int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}
	}
	public static void main(String[] args)
	{
		printArray(new int[]{0,1,2,3,4,5});
	}
}
