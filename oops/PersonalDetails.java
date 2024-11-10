package oops1;
import java.util.Scanner;


public class PersonalDetails {

	public static void main(String[] args) {

		
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter your name: ");
		        String name = scanner.nextLine();

		        System.out.print("Enter your date of birth (e.g., 01/01/2000): ");
		        String dob = scanner.nextLine();

		        System.out.print("Enter your mobile number: ");
		        String mobileNumber = scanner.nextLine();

		        System.out.print("Enter your address: ");
		        String address = scanner.nextLine();

		        System.out.println("\n--- Personal Details ---");
		        System.out.println("Name: " + name);
		        System.out.println("Date of Birth: " + dob);
		        System.out.println("Mobile Number: " + mobileNumber);
		        System.out.println("Address: " + address);

		        scanner.close();
		    }
		}


	
