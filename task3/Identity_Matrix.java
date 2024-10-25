package task3;

public class Identity_Matrix {

	public static void main(String[] args) {
		int row, col;
		boolean flag = true;
		int a[][] = {{1,0,0},
				{0,1,0},
				{0,0,1}};
		
		row = a.length;
		col = a[0].length;
		
		if(row != col) {
			System.out.println("not matrix");
		}else {
			for(int i = 0; i < row; i++) {
				for(int j = 0; j < col; j++) {
					if(i == j && a[i][j] != 1) {
						flag = false;
						break;
					}
					if(i != j && a[i][j] != 0) {
						flag = false;
						break;
					}
				}
			}
			if(flag) {
				System.out.println("Is Identity Matrix");
			}else {
				System.out.println("Is Not Identity Matrix");
			}
		}
		}
		

	}


