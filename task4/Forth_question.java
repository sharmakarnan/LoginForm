package task4;

import java.util.Scanner;

public class Forth_question {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println("=====================");
		for(int i = 0; i < n; i++) {
			String str = sc.next();
			int num = sc.nextInt();
			
			System.out.printf("%-15s%03d%n" , str, num);
			
		}

	}

}
