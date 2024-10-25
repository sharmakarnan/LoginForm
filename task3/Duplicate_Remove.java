package task3;

public class Duplicate_Remove {

	public static void main(String[] args) {
		int arr[] = {1,2,2,3,4,5,5,6,6};
		int[] temp = new int[arr.length];
		int length = arr.length;
		int j = 0;
		
		
        for (int i=0; i < length-1; i++){  

            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
        }  
        temp[j++] = arr[length-1];
		
		for(int i = 0; i < j; i++) {
			System.out.print(temp[i] + " ");
		}

	}

}
