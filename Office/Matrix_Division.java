package Office;

public class Matrix_Division {

		    public static double[][] inverse(double[][] matrix) {
		        double a = matrix[0][0], b = matrix[0][1];
		        double c = matrix[1][0], d = matrix[1][1];

		        double determinant = a * d - b * c;
		        if (determinant == 0) {
		            throw new IllegalArgumentException("Matrix is singular, cannot find inverse.");
		        }

		        double[][] inverse = {
		            { d / determinant, -b / determinant },
		            { -c / determinant, a / determinant }
		        };
		        return inverse;
		    }

		    public static double[][] multiply(double[][] A, double[][] B) {
		        double[][] result = new double[2][2];
		        for (int i = 0; i < 2; i++) {
		            for (int j = 0; j < 2; j++) {
		                result[i][j] = A[i][0] * B[0][j] + A[i][1] * B[1][j];
		            }
		        }
		        return result;
		    }

		    public static double[][] divide(double[][] A, double[][] B) {
		        double[][] inverseB = inverse(B);
		        return multiply(A, inverseB);
		    }

		    public static void printMatrix(double[][] matrix) {
		        for (double[] row : matrix) {
		            for (double element : row) {
		                System.out.printf("%6.2f ", element);
		            }
		            System.out.println();
		        }
		    }

		    public static void main(String[] args) {
		        double[][] A = { { 4, 7 }, { 2, 6 } };
		        double[][] B = { { 1, 2 }, { 3, 4 } };

		        double[][] result = divide(A, B);
		        System.out.println("Result of A / B:");
		        printMatrix(result);
		    }
		}



