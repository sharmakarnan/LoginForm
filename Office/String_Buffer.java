package Office;

public class String_Buffer {

	public static void main(String[] args) {

		        StringBuffer sb = new StringBuffer("Hello");

		        sb.append(" World");
		        System.out.println("After append: " + sb);
		        
		        sb.replace(5,6, " Python ");
		        System.out.println("After replace: " + sb);

		        sb.insert(6, "Java ");
		        System.out.println("After insert: " + sb);

		        sb.delete(6, 11);
		        System.out.println("After delete: " + sb);

		        sb.reverse();
		        System.out.println("After reverse: " + sb);
		    }
		}

