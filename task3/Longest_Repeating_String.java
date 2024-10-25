package task3;

public class Longest_Repeating_String {

	public static void main(String[] args) {
		String str = "bcc";
		System.out.println("the longest repeating string : " + Longest_repeating(str));

	}

	private static String Longest_repeating(String str) {
		String str1 = "";
		
		
		for(int i = 0; i < str.length(); i++) {
			for(int j = i + 1; j < str.length(); j++) {
					String subseq = "";
					
					int k = i, l = j;
					while(k < str.length() && l < str.length() && str.charAt(k) == str.charAt(l)) {
						subseq += str.charAt(k);
						k++;
						l++;
					}
					
					if(subseq.length() > str1.length()) {
						str1 = subseq;
					}
			}
		}
		return str1;
	}

}
