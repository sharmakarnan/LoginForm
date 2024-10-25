package mypack;
import java.util.*;

public class SwapUsingXOR {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number (a) : " );
		int a = sc.nextInt();
		
		System.out.println("Enter the second number (b) : " );
		int b = sc.nextInt();
		
		System.out.println("before swapping : " + a + " and " + b);
		
		a = a^b;
		b = a^b;
		a = a^b;
		
		System.out.println("after swapping : " + a + " and " + b);

	}

}
