package mypack;

import java.util.Scanner;

public class SeriesSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int a = sc.nextInt();
		
		int sum = 0;
		int term = 0;
		
		for(int i = 1; i <= a; i++) {
			term = (term*10) + 1;
			sum += term;
			
			
		}
		System.out.println(sum);
	}

}
