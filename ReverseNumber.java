package oops1;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter the number : ");
		 int number = sc.nextInt();
		 int reverse = 0;
		 
		 while(number > 0) {
			 int n = number % 10;
			 reverse = reverse * 10 + n;
			 number = number / 10;
		 }
		 
		 System.out.println("Enter the reverse number : " + reverse );

	}

}
