package oops1;
import java.util.Scanner;

public class SumNotDivisibleBy12 {

	public static void main(String[] args) {
	

		
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter the first integer: ");
		        int start = scanner.nextInt();

		        System.out.print("Enter the second integer: ");
		        int end = scanner.nextInt();

		        int sum = 0;

		        for (int i = Math.min(start, end); i <= Math.max(start, end); i++) {
		            if (i % 12 != 0) { 
		                sum += i;
		            }
		        }

		        System.out.println("The sum of all numbers not divisible by 12 between " + start + " and " + end + " is: " + sum);

		        scanner.close();
		    }
		}

	