package oops1;

import java.util.Scanner;

public class Simple_interest {

	public static void main(String[] args) {

		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the principal : ");
		double principal = sc.nextDouble();
		
		System.out.println("Enter the rate : ");
		double rate = sc.nextDouble();
		
		System.out.println("Enter the time : ");
		double time = sc.nextDouble();
		
		double Interest = principal * rate * time / 100;
		
		System.out.println("Rate of interest : " + Interest);
	}

}
