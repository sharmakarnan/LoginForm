package oops1;

import java.util.Scanner;

public class DaysConvert {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("enter the day : " );
		int totalDays = sc.nextInt();
		
		int years = totalDays / 365;
		int yearsRemainDays = totalDays % 365;
		
		int weeks = yearsRemainDays / 7;
		int days = yearsRemainDays % 7;
		
		 System.out.println(totalDays + " days is equivalent to:");
	        System.out.println("Years: " + years);
	        System.out.println("Weeks: " + weeks);
	        System.out.println("Days: " + days);
		
		

	}

}
