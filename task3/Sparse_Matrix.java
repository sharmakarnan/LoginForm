package task3;

public class Sparse_Matrix {

	public static void main(String[] args) {
		int row, col,size, count = 0;
		  int a[][] = {       
                  {4, 0, 0},    
                  {0, 5, 0},    
                  {0, 0, 6}    
              }; 
		  row = a.length;
			col = a[0].length;
			
			size = row*col;
			
			for(int i = 0; i < row; i++) {
				for(int j = 0; j < col; j++) {
					if(a[i][j] == 0){
						count++;
					}
				}
		  }
			if(count > (size/2)) {
				System.out.println("is sparse matrix");
			}else {
				System.out.println("is not sparse matrix");
			}

	}

}
