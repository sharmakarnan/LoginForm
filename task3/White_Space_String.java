package task3;

public class White_Space_String {

	public static void main(String[] args) {
		String str1 = "this is end you have my number";
		
		  str1 = str1.replaceAll("\\s+", "");
		System.out.println(str1);

	}

}
