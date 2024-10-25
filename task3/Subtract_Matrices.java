package task3;

public class Subtract_Matrices {

	public static void main(String[] args) {
		int a[][] = {{2,2,2},{5,5,5},{8,8,8}};
		int b[][] = {{3,3,3},{6,6,6},{9,9,9}};
	    int c[][] = new int[3][3];
	    
	    for(int i = 0; i < a.length; i++) {
	    	for(int j = 0; j < a.length; j++) {
	    		c[i][j] = b[i][j] - a[i][j];
	    		System.out.print(c[i][j] + " ");
	    	}
	    	System.out.println();
	    }

	}

}
