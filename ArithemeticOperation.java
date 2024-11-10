package oops1;
import java.util.Scanner;

public class ArithemeticOperation {

	public static void main(String[] args) {
	

		
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter the first number: ");
		        double num1 = scanner.nextDouble();

		        System.out.print("Enter the second number: ");
		        double num2 = scanner.nextDouble();

		        double addition = num1 + num2;
		        double subtraction = num1 - num2;
		        double multiplication = num1 * num2;
		        double division = num2 != 0 ? num1 / num2 : 0;  // Check to avoid division by zero

		        System.out.println("Addition: " + addition);
		        System.out.println("Subtraction: " + subtraction);
		        System.out.println("Multiplication: " + multiplication);
		        
		        if (num2 != 0) {
		            System.out.println("Division: " + division);
		        } else {
		            System.out.println("Division: Cannot divide by zero");
		        }

		        scanner.close();
		    }
		}


	
