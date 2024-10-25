package mypack;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a = sc.nextInt();
		
		for(int i = 1; i <= a; i++) {
			if(isprime(i)) {
				System.out.println(i + " ");
			}
		}
	}

	private static boolean isprime(int i) {
		int count = 0;
            if(i == 0 || i == 1) {
            	return false;
            }
            for(int k = 2; k < i; k++) {
            	if(i % k == 0) {
            		
            		
            		return false;
            	}
            	
            }
		return true;
	}

}
