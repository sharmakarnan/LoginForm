package task4;


import java.util.Scanner;

public class String_Intro {

	public static void main(String[] args) {
		
	    Scanner sc = new Scanner(System.in);
	    
	    String A = sc.nextLine();
	    String B = sc.nextLine();
	    
	    int length_sum = A.length() + B.length();
	    System.out.println(length_sum);
	    
	    if(A.compareTo(B) > 0) {
	    	System.out.println("yes");
	    }else {
	    	System.out.println("No");
	    }
	    
	    String capitalA = A.substring(0, 1).toUpperCase() + A.substring(1);
	    String capitalB = B.substring(0, 1).toUpperCase() + B.substring(1);
	    
	    System.out.println(capitalA + " " + capitalB);
	    
	}

}
