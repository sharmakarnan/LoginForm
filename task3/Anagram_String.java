package task3;

import java.util.Arrays;

public class Anagram_String {

	public static void main(String[] args) {
		String str1 = "Brag";
		String str2 = "Grab";
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		if(str1.length() != str2.length()) {
			System.out.println("this is not a Anagram");
		}else {
			char[] t = str1.toCharArray();
			char[] s = str2.toCharArray();
			
			Arrays.sort(t);
			Arrays.sort(s);
			
			if(Arrays.equals(t, s) == true) {
				System.out.println("this is anagram");
			}else {
				System.out.println("this is not a anagram");
			}
		}
	}

}
