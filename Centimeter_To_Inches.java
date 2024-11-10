package oops1;

import java.util.Scanner;

public class Centimeter_To_Inches {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("enter the centimeter : " );
		double centimeter = sc.nextDouble();
		
		double inches = centimeter / 2.54;
		
		System.out.println("Centimeter to inches : " + inches + "inch");

	}

}
