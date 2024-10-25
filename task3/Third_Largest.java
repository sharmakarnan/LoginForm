package task3;

import java.util.Arrays;

public class Third_Largest {

	public static void main(String[] args) {
		int arr[] = {11,22,33,44,55};
		
		System.out.println("Third Largest no : " + get(arr, 5));

	}

	private static int get(int[] arr, int i) {
		Arrays.sort(arr);
		
		return arr[i - 3];
		
	}

}
