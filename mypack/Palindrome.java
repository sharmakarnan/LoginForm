package mypack;

public class Palindrome {

	public static void main(String[] args) {
		int x = 12321;
		int temp;
		int result = 0;
		int r = x;
		
		while(x > 0) {
			temp = x % 10;
			result = (result*10) +  temp;
			x = x / 10;
			
		}
		System.out.println(result);
		
		if(result == r) {
			System.out.println("is palindrome");
		}else {
			System.out.println("is not palindrome");
		}
		

	}

}
