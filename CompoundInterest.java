package oops1;
import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {
	
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter the principal amount (P): ");
		        double principal = scanner.nextDouble();

		        System.out.print("Enter the annual interest rate (in %): ");
		        double rate = scanner.nextDouble();

		        System.out.print("Enter the number of times interest is compounded per year (n): ");
		        int timesCompounded = scanner.nextInt();

		        System.out.print("Enter the time in years (t): ");
		        int time = scanner.nextInt();

		        double amount = principal * Math.pow(1 + (rate / 100) / timesCompounded, timesCompounded * time);

		        double compoundInterest = amount - principal;

		        System.out.printf("Final amount (A) after compound interest: %.2f%n", amount);
		        System.out.printf("Compound interest (CI): %.2f%n", compoundInterest);

		        scanner.close();
		    }
		}


	