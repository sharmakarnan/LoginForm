package task3;

public class String_Count {

	public static void main(String[] args) {
		String s = "character";
		int count = 0;
		
		for(int i = 0; i < s.length(); i++) {
			count++;
			s.charAt(i);
		}
		System.out.print(count);

	}

}
