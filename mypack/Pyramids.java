package mypack;
import java.util.*;

public class Pyramids {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int a = sc.nextInt();
		
		for(int i =0; i <= a; i++){
			for(int j = i; j <= a; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
