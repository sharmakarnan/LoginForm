package oops1;
import java.util.Scanner;


public class SumOfOddandEven {

	public static void main(String[] args) {

		
		        Scanner scanner = new Scanner(System.in);
		        int sumOfOdds = 0;

		        System.out.println("Enter 5 numbers:");
		        for (int i = 0; i < 5; i++) {
		            int number = scanner.nextInt();
		            if (number % 2 != 0) { 
		                sumOfOdds += number;
		            }
		        }

		        System.out.println("Sum of all odd values: " + sumOfOdds);

		        System.out.println("Even numbers between 1 and 50:");
		        for (int i = 1; i <= 50; i++) {
		            if (i % 2 == 0) { 
		                System.out.print(i + " ");
		            }
		        }

		        scanner.close();
		    }
		}


	