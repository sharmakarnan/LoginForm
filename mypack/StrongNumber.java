package mypack;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a = sc.nextInt();
		
		if(isStrongNumber(a)) {
			System.out.println("is Strong Number");
		}else {
			System.out.println("is not Strong Number");
		}

	}

	private static boolean isStrongNumber(int a) {
		
		int Original_Number = a;
		int sum = 0;
		
		while(a > 0) {
			
		   int digit = a % 10;
		   sum += factorial(digit);
		   a /= 10;
		}
		
		return sum == Original_Number;
	}

	private static int factorial(int num) {
		int fact = 1;
		
		for(int i = 1; i <= num; i++) {
			fact *= i;
		}
		return fact;
	}

}
