package homework2;

/**
 * calculate area of triangle
 * given 2D coordinates from user
 * areaTriangle = sqrt (sideA^2 + sideB^2 + sideC^2)
 * when given only coordinate points, 2 step process :
 * 1) calculate distance between points (line)
 * 2) use Heron's formula
 * any triangular area is side * side * side??
 * cannot use h*b/2 b/c not right triangle and hypotenuse unknown
 * 
 * @author Justin
 *
 */
 
import java.util.Scanner;

public class Problem2_19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter SideA [x1 y1]: ");
      double x1 = keyboard.nextDouble();
      double y1 = keyboard.nextDouble();
      System.out.print("Enter SideB [x2 y2]: ");
      double x2 = keyboard.nextDouble();
      double y2 = keyboard.nextDouble();
      System.out.print("Enter SideB [x3 y3]: ");
      double x3 = keyboard.nextDouble();
      double y3 = keyboard.nextDouble();
      System.out.print("\n");
      
      /*
      *  areaTriangle = sqrt (sideA^2 + sideB^2 + sideC^2)
      * Distance formula for 2 points, expend for 3:
      *  double distance = Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2));
      * Heron's formula:
      * 2a) half of triangles perimeter, s
      * s = (sideA + sideB + sideC) / 2
      * 2b) area of any triangle
      * A = sqrt (s(s-sideA)(s-sideB)(s-SideC))
      */
      
      double distanceSideA = Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2));
      double distanceSideB = Math.sqrt(Math.pow(x3 - x1,2) + Math.pow(y3 - y1,2));
      double distanceSideC = Math.sqrt(Math.pow(x2 - x3,2) + Math.pow(y2 - y3,2));
      double s = (distanceSideA + distanceSideB + distanceSideC) / 2;
      double Area = Math.sqrt(s*(s-distanceSideA)*(s-distanceSideB)*(s-distanceSideC));
      System.out.println("The area of this triangle is: " + Area);
	}

}
