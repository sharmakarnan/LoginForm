package task4;
import java.util.Scanner;

public class Int_to_String {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);
		        int n = scanner.nextInt(); 
		        scanner.close(); 

		        String s = String.valueOf(n);

		        if (n >= -100 && n <= 100) {
		            System.out.println("Good job");
		        } else {
		            System.out.println("Wrong answer");
		        }
		    }
		}


	

