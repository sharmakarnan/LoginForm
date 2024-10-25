package task3;
import java.util.Scanner;

public class Uppercase_Lowercase {

	public static void main(String[] args) {
		

		
		    
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a string: ");
		        String input = scanner.nextLine();

		        
		        String result = swapCase(input);

		        System.out.println("String after swapping cases: " + result);

		      
		    }

		    public static String swapCase(String str) {
		        StringBuilder swapped = new StringBuilder();

		        for (char ch : str.toCharArray()) {
		            if (Character.isLowerCase(ch)) {
		                swapped.append(Character.toUpperCase(ch)); 
		            } else if (Character.isUpperCase(ch)) {
		                swapped.append(Character.toLowerCase(ch));  
		            } else {
		                swapped.append(ch);  
		            }
		        }
		        return swapped.toString();
		    }
		


	}


