package task4;

import java.util.Scanner;

public class Eight_question {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int Lineno = 1;
		
		while(sc.hasNext()) {
			String line = sc.nextLine();
			System.out.println(Lineno + " " + line);
			Lineno++;
		}

	}

}
