package task3;

public class Upper_Triangle {

	public static void main(String[] args) {
		int size = 4;
		int matrix[][] = new int[size][size];
		
		int count = 1;
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				if(j < i) {
					matrix[i][j] = 0;
				}else {
					matrix[i][j] = count++;
				}
			}
		}
		System.out.println("Upper Triangle Matrix");
		Upper_Triangle(matrix);

	}

	private static void Upper_Triangle(int[][] matrix) {
		for(int[] row : matrix) {
			for(int val : row) {
				System.out.print(val + " ");
			}
			System.out.println();
		}
		
	}

}
