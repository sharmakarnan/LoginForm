package Office;



public class pattern {
	public static void pattern1(int n) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print("* ");
			}
			System.out.println();	
		}
		System.out.println("=========");
	}
	public static void pattern2(int n) {
		char ch = 'A';
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i+1;j++) {
				System.out.print(ch + " ");
				
			}
			System.out.println();
			ch++;
		}
		System.out.println("=========");
	}
	public static void pattern3(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("=========");
	}
	public static void pattern4(int n) {
		 for(int i=1;i<=n;i++){
			 for(int j=1;j<=i;j++){
			        System.out.print(" ");
			      }
		      for(int k=i;k<=n;k++){
		        System.out.print("*");
		      }
		      System.out.println();
		    }
		System.out.println("=========");
	}
	public static void pattern5(int n) {
		 for(int i=1;i<=n;i++){
		      for(int k=i;k<=n;k++){
		        System.out.print(" ");
		      }
		      for(int j=1;j<=i;j++){
		        System.out.print("*");
		      }
		      
		      System.out.println();
		    }
		  
		System.out.println("=========");
	}
	public static void pattern6(int n) {
		for(int i=0;i<=n;i++) {
			for(int j=i;j<=9;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=1+(i*2);j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("======================");
	}
	public static void pattern7(int n) {
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
				
			}
			System.out.println();
			
		}
		System.out.println("=========");
	}
	public static void pattern8(int n) {
		for(int i=1;i<=2*n;i++) {
			int totalColsInRow = i>n ? 2*n - i: i ;
			for(int j=1;j<=totalColsInRow;j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("=========");
	}
	public static void pattern9(int n) {
		for(int i=0;i<=2*n;i++) {
			int totalColsInRow = i>n ? 2*n - i: i ;
			
			int totalSpace = n - totalColsInRow;
			for(int s = 0; s<totalSpace; s++) {
				System.out.print(" ");
			}
			for(int j=0;j<=totalColsInRow;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("=========");
	}
	public static void pattern10(int n) {
		for(int i=1;i<=n;i++) {
			for(int space = 0;space<=n-i;space++) {
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
			for(int k=2;k<=i;k++) {
				System.out.print(k);
			}
			System.out.println();
		}
		System.out.println("===========");

	}
	public static void pattern11(int n) {
		for(int i=1;i<=2*n;i++) {
			int c = i>n ? 2*n - i : i ;
			for(int space = 0;space<n-c;space++) {
				System.out.print(" ");
			}
			for(int j=c;j>=1;j--) {
				System.out.print(j);
			}
			for(int k=2;k<=c;k++) {
				System.out.print(k);
				
				}
			System.out.println();
		}
		System.out.println("===========");
	}
	public static void pattern12(int n) {
		int originalN = n;
		n= 2*n;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				int atEveryIndex = originalN - Math.min(Math.min(i, j), Math.min(n-i, n-j));
				System.out.print(atEveryIndex + " ");
			}
			System.out.println();
		}
		System.out.println("=====================");
	}
	public static void pattern13(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=n;j>=i;j--) {
				System.out.print("*");
			}
			for(int k=6;k>=i;k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=================");
	}
	public static void pattern14(int n) {
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=n;j++) {
				if(i==j || i+j == n+1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		System.out.println("===========");
	}
	public static void pattern15(int n) {
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=n;j++) {
				if(i==j || i+j == n+1) {
					System.out.print(i);
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		System.out.println("===========");
	}
	public static void pattern16(int n) {
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=n;j++) {
				if(i== n/2+1|| j == n/2+1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		System.out.println("===========");
	}
	public static void pattern17(int n) {
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=n;j++) {
				if(i== 1|| j == 1 || i==n||j == n) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		System.out.println("===========");
	}
	public static void pattern18(int n) {
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=n;j++) {
				if(i==5|| j == 1 || i==j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		System.out.println("==============");
	}

		public static void pattern19(int n) {
			int count = 1;
			for(int i=1;i<=5;i++) {
				for(int j=1;j<=5;j++) {
					if(count < 10) {
						System.out.print("0");
					}
					System.out.print(count++ + " ");
				}
				System.out.println();	
			}
			System.out.println("==============");
		}
		public static void pattern20(int n) {
			for(int i=1;i<=5;i++) {
				for(int j=1;j<=5;j++) {
					if(i*j < 10) {
						System.out.print("0");
					}
					System.out.print(i*j + " ");
				}
				System.out.println();	
			}
			System.out.println("==============");
		}
		public static void pattern21(int n) {
			int count;
			for(int i=0;i<n;i++) {
				count = i+1;
				for(int j=0;j<n;j++) {
					System.out.print(count++ + " ");
				}
				System.out.println();	
			}
			System.out.println("==============");
		}
	

	public static void main(String[] args) {
		pattern1(5);//square box
		pattern2(5);//reverse right half pyramid
		pattern3(5);//right half pyramid
		pattern4(5);//reverse left half pyramid
		pattern5(5);//left half pyramid
		pattern6(9);//town pyramid
		pattern7(5);//right half integer number
		pattern8(5);//left side pyramid
		pattern9(5);//diamond
		pattern10(5);//integer pyramid
		pattern11(5);//integer diamond
		pattern12(5);//integer square box
		pattern13(7);//up pyramid
		pattern14(5);// x pattern
		pattern15(5);// number x pattern
		pattern16(5);//plus pattern
		pattern17(5);//hollow space pattern
		pattern18(5);// hollow space triangle
		pattern19(5);// number pattern
		pattern20(5);//multiple pattern
		pattern21(5);//increment pattern
	}

}

