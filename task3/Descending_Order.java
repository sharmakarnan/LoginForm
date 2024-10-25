package task3;

import java.util.Scanner;

public class Descending_Order {

	public static void main(String[] args) {
		
		int arr1[] = {2,6,8,4,9,};
		int temp, j;
		for( j = 0; j < arr1.length; j++) {
			for(int k = j + 1; k < arr1.length; k++) {
				if(arr1[j] < arr1[k]) {
					temp = arr1[j];
					arr1[j] = arr1[k];
					arr1[k] = temp;
				}
				
			}
			System.out.print(arr1[j] + " ");
			
			
		}
		
		
		

	}

}
