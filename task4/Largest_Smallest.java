package task4;
import java.util.Scanner;


public class Largest_Smallest {
          
	public static String getSmallestAndLargest(String s, int k) {
		        String smallest = s.substring(0, k);
		        String largest = s.substring(0, k);
		        
		        for (int i = 1; i <= s.length() - k; i++) {
		            String substring = s.substring(i, i + k);
		            
		            if (substring.compareTo(smallest) < 0) {
		                smallest = substring;
		            }
		            if (substring.compareTo(largest) > 0) {
		                largest = substring;
		            }
		        }
		        
		        return smallest + "\n" + largest;
		    }
		    
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        
		        String s = scanner.nextLine();
		        int k = scanner.nextInt();
		        
		        String result = getSmallestAndLargest(s, k);
		        System.out.println(result);
		        
		        scanner.close();
		    
		


	}

}
