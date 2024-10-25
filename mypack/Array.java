package mypack;


import java.util.*;

public class Array {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
				
				int arr[] = new int[5];
				arr[0] = scan.nextInt();
				arr[1] = 2;
				arr[2] = 3;
				arr[3] = 4;
				arr[4] = 5;
				
				System.out.print(arr[1]);
				System.out.print(arr[2]);
				System.out.print(arr[3]);
				System.out.print(arr[4]);
				System.out.println();
				
				int arr1[] = {1,2,3,4,5};
				
				System.out.println(Arrays.toString(arr1));
				
				for(int i = 0; i < arr.length; i++) {
					
					System.out.print(arr[i] + " ");
			}
				for(int i = 0; i < arr.length; i++) {
					arr1[i] = scan.nextInt();
				}
				
				
				
			}

	}



