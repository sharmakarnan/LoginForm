package mypack;

public class RightRotate {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int n = 3;
		
		System.out.println("original Array");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		for(int i = 0; i < n; i++) {
			int j, last;
			last = a[a.length -1];
			
			for(j = a.length-1; j > 0; j--) {
				a[j] = a[j-1];
			}
			a[j] = last;
		}
		
		System.out.println();
		System.out.println("after Array");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

}
