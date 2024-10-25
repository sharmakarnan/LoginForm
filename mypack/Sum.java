package mypack;

public class Sum {

	public static void main(String[] args) {
		int a = 3456;
		int sum = sumOfDigits(a);
		System.out.println("Sum of all digits : " + sum);
		
	}

	private static int sumOfDigits(int a) {
          if(a == 0) {
        	  return 0;
          }

		return (int) (a % 10) + sumOfDigits(a / 10);
	}

}
