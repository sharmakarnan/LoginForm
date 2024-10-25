package task3;

public class Another_Array {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		int b[] = new int[a.length];
		
		
		for(int c = 0; c < a.length; c++) {
			b[c] = a[c];
		}
		
		System.out.println("one array");
        for(int i = 0; i < a.length; i++) {
        	System.out.print(a[i] + " ");
        }
        
        System.out.println();
        System.out.println("Another Array");
        for(int j = b.length-1; j >= 0; j--) {
        	System.out.print(b[j] + " ");
        }

	}

}
