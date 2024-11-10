package oops1;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		

		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter the upper limit (N): ");
		        int N = scanner.nextInt();

		        System.out.println("Leap years from 1 to " + N + ":");

		        for (int year = 1; year <= N; year++) {
		            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
		                System.out.print(year + " ");
		            }
		        }

		        scanner.close();
		    }
		}


	
