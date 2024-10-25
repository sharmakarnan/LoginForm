package task4;

import java.util.Scanner;

public class If_Condition {

	public static void main(String[] args) {

		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		
		for(int i = n; i <= n; i++) {
			if(n / i == 1) {
				System.out.println("weird");
			}
		}
		
		System.out.println();
		System.out.println("Enter the number : ");
		int n1 = sc.nextInt();
		
		for(int i = 2; i <= n1; i++) {
			if(i % 2 == 0) {
				System.out.println("Not weird");
			}
		}
		
		System.out.println();
		System.out.println("Enter the number : ");
		int n2 = sc.nextInt();
		
		
		for(int i = 6; i <= n2; i++) {
			if(i % 2 == 0) {
				System.out.println("weird");
			}
		}

		System.out.println();
		System.out.println("Enter the number : ");
		int n3 = sc.nextInt();
		int count = 0;
		
		for(int i = 0; i <= n3; i++) {
			if(i > 20) {
				if(i % 2 == 0) {
					count++;
					System.out.println("Not weird");
				}
			}	
		}
		System.out.println(count);
	}

}
