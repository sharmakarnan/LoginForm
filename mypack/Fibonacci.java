package mypack;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fno = 0;
		int sno = 1;
		int next;
		
		System.out.println("Enter the number : ");
		int a = sc.nextInt();
		
		for(int i = 0; i <= a; i++) {
			System.out.println(fno);
			next = fno + sno;
			fno = sno;
			sno = next;
		}
		
		
		
	}

}
