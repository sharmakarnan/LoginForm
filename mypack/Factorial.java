package mypack;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int a = sc.nextInt();
		
		while(a > 0) {
			
			int sum = 0;
			
			int digit = a % 10;
			sum += factorail(digit);
			a = a / 10;
			
		}
		
		

	}

	public static int factorail(int digit) {
		int fact = 1;
		
		for(int i = 1; i <= digit; i++) {
			fact *= i;
		}
		System.out.println(fact);
		return fact;
	}

	

}
