package mypack;

import java.util.Scanner;

public class EvenAndOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a = sc.nextInt();
		
		for(int i = 1; i <= a; i++) {
			if(i % 2 == 0) {
				System.out.println("Even number : " + i);
			}
			if(i % 2 != 0) {
				System.out.println("Odd number : " + i);
			}
		}

	}

}
