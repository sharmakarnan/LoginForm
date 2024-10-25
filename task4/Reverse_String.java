package task4;

public class Reverse_String {

	public static void main(String[] args) {
		String s = "madam";
		String str = s;
		
		String s1 = "";
		
		for(int i = s.length()-1; i >= 0; i--) {
			s1 = s1 + s.charAt(i);
		}
		
		if(str.equals(s1)) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}

	}

}
