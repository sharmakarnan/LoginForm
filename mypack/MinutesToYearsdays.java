package mypack;
import java.util.*;

public class MinutesToYearsdays {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter the minutes : ");
		long min = sc.nextLong();
		
	    long minutesInYear = 60*24*365;
	    long minutesInDay = 60*24;
	    
	    long years = min / minutesInYear;
	    long remainingMinutes = min % minutesInYear;
	    long days = remainingMinutes / minutesInDay;
	    
	    System.out.println(min + " minutes is approximately " + years + " years and " + days + " Days");
	    
	  

	}

}
