package task3;

public class Duplicate_Element {

	public static void main(String[] args) {
		int arr[] = {1,2,3,2,3,4,5,1,6,4};
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					System.out.print(arr[j] + " "); 
				}
			}
		}

	}

}
