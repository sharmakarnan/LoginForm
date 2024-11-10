package oops1;
import java.util.Scanner;


public class TimeConvertor {

	public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter the number of seconds: ");
		        int totalSeconds = scanner.nextInt();

		        int hours = totalSeconds / 3600;                
		        int remainingSecondsAfterHours = totalSeconds % 3600;

		        int minutes = remainingSecondsAfterHours / 60;  
		        int seconds = remainingSecondsAfterHours % 60;

		        System.out.println(totalSeconds + " seconds is equivalent to:");
		        System.out.println("Hours: " + hours);
		        System.out.println("Minutes: " + minutes);
		        System.out.println("Seconds: " + seconds);

		        scanner.close();
		    }
		}


	
