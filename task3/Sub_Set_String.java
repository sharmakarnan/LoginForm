package task3;

public class Sub_Set_String {

	public static void main(String[] args) {
		String s = "java";
		int len = s.length();
		int temp = 0;
	    String arr[] = new String[len*(len+1)/2];
	    
	    for(int i = 0; i < len; i++) {
	    	for(int j = i; j < len; j++) {
	    		arr[temp] = s.substring(i, (j + 1));
	    		temp++; 
	    	}
	    	
	    }
	    for(int i = 0; i < arr.length; i++) {
	    	System.out.print(arr[i] + " ");
	    }
	    

	}

}
