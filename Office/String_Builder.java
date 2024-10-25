package Office;

public class String_Builder {

	public static void main(String[] args) {
	
		        StringBuilder sb = new StringBuilder("Welcome");

		        sb.append(" to Java");
		        System.out.println("After append: " + sb);

		        sb.replace(8, 10, "Python");
		        System.out.println("After replace: " + sb);
		        
		        sb.insert(6, "Java ");
		        System.out.println("After insert: " + sb);

		        sb.delete(6, 11);
		        System.out.println("After delete: " + sb);
		        
		        sb.reverse();
		        System.out.println("After reverse: " + sb);

		        String sub = sb.substring(3, 8);
		        System.out.println("Substring: " + sub);
		    }
		}


	