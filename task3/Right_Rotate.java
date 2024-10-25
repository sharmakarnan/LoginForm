package task3;

public class Right_Rotate {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int n = 3;
		
		System.out.println("Before Rotate");
		for(int i = 0; i < arr.length; i++ ) {
			System.out.print(arr[i ] + " ");
		}
		
		for(int j = 0; j < n; j++ ) {
			int k, last;
			
			last = arr[arr.length-1];
			for(k = arr.length-1; k > 0; k--) {
				arr[k] = arr[k - 1];
			}
			arr[k] = last;
		}
		
		System.out.println();
		System.out.println("After Rotate");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
