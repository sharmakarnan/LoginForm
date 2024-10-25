package mypack;

public class ThreeD {

	public static void main(String[] args) {
		int a[][][] = {{{1,2,3}, {4,5,6}, {7,8,9}},	{{9,8,7}, {6,5,4}, {3,2,1}}};
		int b[][][] = {{{9,8,7}, {6,5,4}, {3,2,1}}, {{1,2,3}, {4,5,6}, {7,8,9}}};
		int[][][] c = new int[2][3][3];
		
		System.out.println("Addition");
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				for(int k = 0; k < a[i][j].length; k++) {
					c[i][j][k] = a[i][j][k] + b[i][j][k];
					
					System.out.print(c[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		System.out.println("Subtraction");
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				for(int k = 0; k < a[i][j].length; k++) {
					c[i][j][k] = a[i][j][k] - b[i][j][k];
					
					System.out.print(c[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}

}
