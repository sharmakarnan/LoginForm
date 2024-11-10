package oops1;

import java.util.Scanner;

public class Number_Square_Cube {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			int square = i * i;
			int cube = i * i * i;
			
			System.out.println(i + " " + square + " " + cube);
		}

	}

}
