package methods_practice;

import java.util.*;

public class ClassGrades {
	
	public static float getPercentGrade() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is this student's grade as a percent?");
		float percentGrade = keyboard.nextFloat();
		return percentGrade;
	}
	
	public static void printLetterGrade(float percentGrade) {
		char letterGrade = letterGradeConvertor(percentGrade);
		System.out.println("The student's letter grade is: " + letterGrade);
	}
	
	public static char letterGradeConvertor(float percentGrade) {
		char letterGrade = 'a';
		if (percentGrade >= 90) {
			letterGrade = 'A';
		} else if (percentGrade >= 80 && percentGrade < 90) {
			letterGrade = 'B';
		} else if (percentGrade >= 70 && percentGrade < 80) {
			letterGrade = 'C';
		} else if (percentGrade >= 60 && percentGrade < 70) {
			letterGrade = 'D';
		} else if (percentGrade < 60) {
			letterGrade = 'F';
		} else { 
			System.out.println("Invalid percent grade");
		}
		return letterGrade;
	}
	
	public static void main(String[] args) {
		float percentGrade = getPercentGrade();
		printLetterGrade(percentGrade);
		
	}

}


