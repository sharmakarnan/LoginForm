package Office;

public class Capacity {

	public static void main(String[] args) {

		        StringBuffer sb = new StringBuffer("Hello");

		        System.out.println("Initial capacity: " + sb.capacity()); 
		        System.out.println("Initial length: " + sb.length());

		        sb.ensureCapacity(50);
		        System.out.println("Capacity after ensureCapacity(50): " + sb.capacity());
		    }
		}


	
