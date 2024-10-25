package task3;

public class Largest_Smallest_Array {

	public static void main(String[] args) {
		int arr[] = {24,55,88,22,11,66};
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.print(max + " ");
		
		System.out.println();
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.print(min + " ");

	}

}
