package oops1;
import java.util.Scanner;

public class AgeClassifier {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        int babyCount = 0;
		        int schoolAgeCount = 0;
		        int adultCount = 0;

		        System.out.println("Enter the ages of 15 people:");

		        for (int i = 1; i <= 15; i++) {
		            System.out.print("Enter age of person " + i + ": ");
		            int age = scanner.nextInt();

		            if (age >= 0 && age <= 5) {
		                babyCount++;
		            } else if (age >= 6 && age <= 17) {
		                schoolAgeCount++;
		            } else if (age >= 18) {
		                adultCount++;
		            }
		        }

		        System.out.println("Total Baby age (0-5): " + babyCount);
		        System.out.println("Total School age (6-17): " + schoolAgeCount);
		        System.out.println("Total Adult age (18+): " + adultCount);

		        scanner.close();
		    }
		}

	
