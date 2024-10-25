package task3;

public class Sum_Row_Col {

	public static void main(String[] args) {


		int a[][] = {{1,2,3}, 
				     {4,5,6},
				     {7,8,9}};
		int row,col,sumRow,sumCol;
		row = a.length;
		col = a[0].length;
		
		for(int i = 0; i < row; i++) {
			sumRow = 0;
			for(int j = 0; j < col; j++) {
				sumRow = sumRow + a[i][j];
			}
			System.out.println("Sum of row " + (i + 1) + " row " + sumRow);
		}
		for(int i = 0; i < col; i++) {
			sumCol = 0;
			for(int j = 0; j < row; j++) {
				sumCol = sumCol + a[j][i];
			}
			System.out.println("Sum of col " + (i + 1) + " col " + sumCol);
		}
		

	}

}
