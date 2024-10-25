package task4;

import java.util.Scanner;

public class Generate_series {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		int q = sc.nextInt();
		
		for(int i = 0; i < q; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int n = sc.nextInt();
			
			generate_series(a,b,n);
		}

	}

	private static void generate_series(int a, int b, int n) {


		int current = a;
		
		for(int j = 0; j < n; j++) {
			current += Math.pow(2, j) * b;
			System.out.print(current + " ");
		}
		System.out.println();
		
	}

}
