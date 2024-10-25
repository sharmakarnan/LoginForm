package task3;

import java.util.Arrays;

public class Equal_Matrices {

	public static void main(String[] args) {
		int a[][] = {{1,1,1}, {2,2,2}, {3,3,3}};
		int b[][] = {{1,1,1}, {2,2,2}, {3,3,3}};
		
		
//		for(int i = 0; i < a.length; i++) {
//			for(int j = 0; j < a.length; j++) {
//				if(a[i][j] == b[i][j]) {
//					System.out.println("is Equal Matrices");
//				}else {
//					System.out.println("not Equal Matrices");
//				}
//			}
//		}
		
		boolean isEqual_ab = Arrays.deepEquals(a, b);
		System.out.println(isEqual_ab);
	}
			

	}

	


