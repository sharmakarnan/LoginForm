package mypack;
import java.util.*;

public class IsoscelesTriangleCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the side length1 : ");
		double side1 = sc.nextDouble();
		System.out.println("Enter the side length2 : ");
		double side2 = sc.nextDouble();
		System.out.println("Enter the side length3 : ");
		double side3 = sc.nextDouble();
		
		if(IsoscelesTriangleCheck(side1,side2,side3)) {
			System.out.println("This is an Isoceles Triangle");
		}else {
			System.out.println("This is an not Isoceles Triangle");

		}
		
		

	}

	private static boolean IsoscelesTriangleCheck(double side1, double side2, double side3) {
		
		return (side1 == side2) || (side2 == side3) || (side3 == side1);
	}

}
