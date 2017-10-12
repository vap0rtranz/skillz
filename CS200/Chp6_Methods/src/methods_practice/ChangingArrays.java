package methods_practice;

public class ChangingArrays {
	
	public static void main(String[] args)
	{
		int member = 1;
		int[] members = new int[2];
		int[] changed = changer(member, members);
		changer(member, members);
		
	}
	
	public static int[] changer(int member, int[] members)
	{
		int[] changed = new int[members.length];
		member = 10;
		members[0] = 100;
		changed[0] = 100;
		return changed;
	}
}
