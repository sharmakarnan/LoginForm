package task3;

public class Add_Matrices {

	public static void main(String[] args) {
		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int b[][] = {{7,8,9},{6,5,4},{1,2,3}};
		int c[][] = new int[3][3];
	
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a.length; j++) {
				 c[i][j] = a[i][j] + b[i][j];
				 System.out.print(c[i][j] + " ");
				 
			}
			System.out.println();
		}
		
		

	}

}
