package oops1;

import java.util.Scanner;

public class CelsiusToFarenheit {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter the celsius  : ");
		double celsius = sc.nextDouble();
		
		double farenheit = (celsius * 9/5) + 32;
		
		System.out.printf("Farenheit :  %.1f°F%n " , farenheit);

	}

}
