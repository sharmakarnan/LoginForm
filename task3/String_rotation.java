package task3;

public class String_rotation {


		
		public static boolean isRotation(String str1, String str2) {
	        if (str1.length() != str2.length() || str1.isEmpty()) {
	            return false;
	        }
	        
	        String concatenated = str1 + str1;

	        return concatenated.contains(str2);
	    }

	    public static void main(String[] args) {
	        String str1 = "waterbottle";
	        String str2 = "erbottlewat";

	        if (isRotation(str1, str2)) {
	            System.out.println(str2 + " is a rotation of " + str1);
	        } else {
	            System.out.println(str2 + " is NOT a rotation of " + str1);
	        }
	}

}
