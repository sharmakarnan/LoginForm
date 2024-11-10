package oops1;

import java.util.Scanner;

public class SumOfTriple {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("num1 : ");
		int num1 = sc.nextInt();
		
		System.out.println("num2 : ");
		int num2 = sc.nextInt();
		
		int result;
		
		if(num1 == num2) {
			result = 3 * (num1 + num2);
		}else { 
			result = num1 + num2;
		}
		
		System.out.println("result : " + result);

	}

}
