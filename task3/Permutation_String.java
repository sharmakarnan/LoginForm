package task3;

public class Permutation_String {

	public static void main(String[] args) {

		String str = "ABC";
		System.out.println("All Permutation of the String : ");
		generate_permutation(str, 0, str.length()-1);
	}

	private static void generate_permutation(String str, int left, int right) {
		if(left == right) {
			System.out.println(str);
		}else {
			for(int k = left; k <= right ; k++) {
				
				str = swap(str, left, k);
				
				generate_permutation(str, left+1, right);
				
				str = swap(str, left, k);
			}
		}
		
	}

	private static String swap(String str, int i, int j) {
		char charArray[] = str.toCharArray();
		char temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

}
