package task4;
import java.util.Scanner;
import java.util.Calendar;

public class Calendar_Day {

		    public static String findDay(int month, int day, int year) {
		        Calendar cal = Calendar.getInstance();

		        cal.set(year, month - 1, day); 

		        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

		        String[] days = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", 
		                         "THURSDAY", "FRIDAY", "SATURDAY"};

		        return days[dayOfWeek - 1];
		    }

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        int month = scanner.nextInt();
		        int day = scanner.nextInt();
		        int year = scanner.nextInt();
		        scanner.close();

		        System.out.println(findDay(month, day, year));
		    }
		


	

}
