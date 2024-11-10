package oops1;
import java.util.Scanner;

public class IntegerOperator {

	public static void main(String[] args) {

	            Scanner scanner = new Scanner(System.in);

		        System.out.print("Input 1st integer: ");
		        int num1 = scanner.nextInt();

		        System.out.print("Input 2nd integer: ");
		        int num2 = scanner.nextInt();

		        int sum = num1 + num2;
		        int difference = num1 - num2;
		        int product = num1 * num2;
		        double average = (double) sum / 2; 
		        int distance = Math.abs(difference); 
		        int max = Math.max(num1, num2);
		        int min = Math.min(num1, num2);

		        System.out.println("Sum of two integers: " + sum);
		        System.out.println("Difference of two integers: " + difference);
		        System.out.println("Product of two integers: " + product);
		        System.out.printf("Average of two integers: %.2f%n", average);
		        System.out.println("Distance of two integers: " + distance);
		        System.out.println("Max integer: " + max);
		        System.out.println("Min integer: " + min);

		        scanner.close();
		    }
		}

	
