package oops1;

import java.util.Scanner;

public class Entered_Number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		
		if(n == 0) {
			System.out.println("Zero");
		}else if(n < 0) {
			System.out.println("negative");
		}else {
			System.out.println("positive");
		}

	}

}
