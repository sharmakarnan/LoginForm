package oops1;

public class Swap_two_Variable {

	public static void main(String[] args) {
		int a = 5;
		int b = 6;
		
		System.out.println("before swap");
		System.out.println(a + " " + b);
		System.out.println();
		
		a = a^b;
		b = a^b;
		a = a^b;
		
		System.out.println("After swap");
		System.out.println(a + " " + b);

	}

}
