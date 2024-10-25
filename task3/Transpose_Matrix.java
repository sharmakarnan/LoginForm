package task3;

public class Transpose_Matrix {

	public static void main(String[] args) {
		int a[][] = {{1,2,3}, 
			     {4,5,6},
			     {7,8,9}};
		int row,col;
		row = a.length;
		col = a[0].length;
		
		int t[][] = new int[col][row];
		
		for(int i = 0; i < col; i++) {
			for(int j = 0; j < row; j++) {
				t[i][j] = a[j][i];
				System.out.print(t[i][j] + " ");
			}
			System.out.println();
		}
		

	}

}
