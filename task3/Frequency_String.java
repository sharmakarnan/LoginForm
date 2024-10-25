package task3;

public class Frequency_String {

	public static void main(String[] args) {
		String s = "examination";
		
		char[] str = s.toCharArray();
		
		int[] freq = new int[s.length()];
		
		for(int i = 0; i < s.length(); i++) {
			 freq[i] = 1;
			 for(int j = i+1; j < s.length(); j++) {
				 if(str[i] == str[j]) {
					 freq[i]++;
					 str[j] = '0';
				 }
			 }
		}
		for(int i =0; i < freq.length; i++) {
			if(str[i] != '0') {
				System.out.println(str[i] + " " + freq[i]);
			}
		}
		
	}

}
