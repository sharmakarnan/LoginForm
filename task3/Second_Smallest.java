package task3;

import java.util.Arrays;

public class Second_Smallest {

	public static void main(String[] args) {
		int arr[] = {22,10,11,55,88};
		System.out.println("Second Smallest no : " + get(arr, 5));

	}

	private static int get(int[] arr, int i) {
		Arrays.sort(arr);
		return arr[2];
	}

}
