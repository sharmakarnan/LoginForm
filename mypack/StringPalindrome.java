package mypack;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		
		String a, rev = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word : ");
		a = sc.nextLine();
		
		for(int i = a.length()-1; i >= 0; i--) {
			rev = rev + a.charAt(i);
		}
		if(a.equals(rev)) {
			System.out.println("is palindrome");
		}else {
			System.out.println("is not palindrome");
		}

	}

}
