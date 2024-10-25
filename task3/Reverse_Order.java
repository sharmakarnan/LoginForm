package task3;

public class Reverse_Order {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		
		System.out.println("Correct Order");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		System.out.println("reverse Order");
		for(int j = arr.length-1; j >= 0; j--) {
			System.out.print(arr[j] + " ");
		}

	}

}
