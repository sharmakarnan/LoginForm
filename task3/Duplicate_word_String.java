package task3;

public class Duplicate_word_String {

	public static void main(String[] args) {
		String s = "Big black bug bit a big black dog on his big black nose";
		
		String str = s.toLowerCase();
		
		String word[] = str.split(" ");
		
//		for(int i = 0; i < word.length; i++) {
//			int count = 1;
//			for(int j = i + 1; j < word.length; j++) {
//				if(word[i].equals(word[j])) {
//					count++;
//					word[j] = "0";
//				}
//			}
//			if(count > 1 && word[i] != "0" ) {
//				System.out.print(word[i] + " ");
//			}
//			
//		}
		
		for(int i = 0; i < word.length; i++) {
			int count = 1; 
			for(int j = i+1; j < word.length; j++){
				if(word[i].equals(word[j]) && word[i].length() == word[j].length() && word[i] != "0") {
					count++;
					word[j] = "0";
				}
				}
			if(count > 1 && word[i] != "0") {
				System.out.println(word[i] + " ");
			}
			}
		

	}

}
