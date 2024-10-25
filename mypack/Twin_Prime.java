package mypack;

import java.util.Scanner;

public class Twin_Prime {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number a : " );
		int a = sc.nextInt();
		System.out.println("Enter the number b : " );
		int b = sc.nextInt();
		
		if(isPrime(a,b)) {
			System.out.println("is Twin Prime");
		}else {
			System.out.println("is not Twin prime");
		}
		

	}

	private static boolean isPrime(int a, int b) {
		
		return (is_Prime(a) && is_Prime(b) && Math.abs(a - b) == 2);
	}

	private static boolean is_Prime(int num) {
		int div = 0;
		div = num/2;
		
		if(num == 0 || num == 1) {
			return false;
		}else {
			if(div >= 2) {
				for(int i = 2; i <= div; i++) {
					if(num % i == 0) {
						return false;
					}
				}
			}
		}
		
		
		
		return true;
	}

}
