package task4;

import java.util.Scanner;

public class Single_Integer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		int arr[] = new int[3];
		int i;
		
		for(i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("your enetered : ");
		for(int j = 0; j < n; j++) {
			System.out.println(arr[j]);
		}
           
	}

}
