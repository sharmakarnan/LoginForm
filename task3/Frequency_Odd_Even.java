package task3;

public class Frequency_Odd_Even {

	public static void main(String[] args) {
		int matrix[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
		
		int Odd = 0;
		int Even = 0;
		for(int[] row : matrix) {
			for(int val : row) {
				if(val % 2 == 0) {
					Even++;
				}else {
					Odd++;
				}
			}
		}
		System.out.println(Even);
		System.out.println(Odd);

	}

}
