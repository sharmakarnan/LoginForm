package task3;

public class String_Palindrome {

	public static void main(String[] args) {
	   String str = "race car";
	   
	   boolean ispalindrome = ispalindrome(str);
	   
	   if(ispalindrome) {
		   System.out.println("this is palindrome");
	   }else {
		   System.out.println("this is not palindrome");
	   }

	}

	private static boolean ispalindrome(String str) {

         str = str.replaceAll("\\s+", "");
         String reversed = new StringBuilder(str).reverse().toString();
         
		return str.equals(reversed);
	}

}
