package lectures3;

public class trickyQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numStudents = 20;
		if( numStudents > 20) {
			System.out.println("20");
		}
		if( numStudents > 12) {
			System.out.println("12");
		}
		if( numStudents > 5 && numStudents <=12) {
			System.out.println("5 and 12");
		}
		else {
			System.out.println("else");
		}
		double value = 3.84;
		int roundedVal = (int) value;
		System.out.println(roundedVal);
		value = 3.0001;
		roundedVal = (int) value;
		System.out.println(roundedVal);
		System.out.println(4/2.0);
			
	}

}
