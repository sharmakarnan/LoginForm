package task3;

public class Vowels_Consonants {

	public static void main(String[] args) {
		int v_Count = 0, c_Count = 0;
		String s = "education";

		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == '0' || s.charAt(i) == 'u') {
				v_Count++;
			}else {
				c_Count++;
			}
			
		}
		
		System.out.println("This is vowels count : " + v_Count);
		System.out.println("This is consonants count  : " + c_Count);

	}

}
