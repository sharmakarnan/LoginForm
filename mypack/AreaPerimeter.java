package mypack;
import java.util.*;

public class AreaPerimeter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius : ");
		double radius = sc.nextDouble();
		
		System.out.println("Perimeter : " + (2*radius*3.14));
		System.out.println("Area : " + (3.14*radius*radius));
		
		}

}
