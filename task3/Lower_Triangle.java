package task3;

public class Lower_Triangle {

	public static void main(String[] args) {
		int size = 4;
		int matrix[][] = new int[size][size];
		
		int count = 1;
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				if(j > i) {
					matrix[i][j] = 0;
				}else {
					matrix[i][j] = count++;
				}
			}
		}
		System.out.println("Lower Triangle Matrix");
		Lower_Triangle(matrix);

	}

	private static void Lower_Triangle(int[][] matrix) {
		for(int[] val : matrix) {
			for(int row : val) {
				System.out.print(row + " ");
			}
			System.out.println();
		}
		
	}

}
