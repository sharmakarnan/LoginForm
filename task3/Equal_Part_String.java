package task3;

import java.util.Scanner;

public class Equal_Part_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the word : ");
		String a = sc.nextLine();
		
		System.out.println("Enter the number : ");
		int b = sc.nextInt();
		
		int len = a.length();
		if(len % b != 0) {
			System.out.println("this is not a equal part of string");
		}else {
			int partsize = len / b;
			System.out.println("enter the partsize : " + partsize );
			
			for(int i = 0; i < len; i += partsize) {
				System.out.println(a.substring(i, i + partsize));
			}
		}

	}

}
