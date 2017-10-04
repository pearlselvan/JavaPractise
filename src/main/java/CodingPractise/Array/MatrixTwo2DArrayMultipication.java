package CodingPractise.Array;

/**
 * Created by muthuselvan on 8/28/17.
 *
 * Suppose that we partition each of A, B, and C into four n=2   n=2 matrices

 Refer PDF : Introduction to Algorithms  : page : 76
 http://www.sanfoundry.com/java-program-perform-matrix-multiplication/

 Understanding about matrix multiplication :
 https://www.mathsisfun.com/algebra/matrix-multiplying.html

 *
 */


public class MatrixTwo2DArrayMultipication {

    public static void main(String[] args) {

    	int mat1[][]  =
                { {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50},
        };

        int mat2[][]  =
                { {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50},
        };

        multiply(mat1,mat2);

    }

    public static void multiply(int[][] matrix1,int[][] matrix2) {
    	int matrix1_length = matrix1.length * matrix1[0].length ;
    	System.out.println("M1 length : " +matrix1_length);
    	int matrix2_length = matrix2.length * matrix2[0].length;
    	System.out.println("M2 length : " +matrix2_length);

   	for (int i=0;i<matrix1.length;i++){
   		for (int j=0;j<matrix1[0].length;j++) {

   			System.out.print(matrix1[i][j]);

   		}

   	}

//        for(int i=0; i<matrix1.length; i++)
//        {
//            for(int j=0; j<matrix1[0].length; j++)
//            {
//                int number = matrix1[i][j];
//                System.out.println("Row => " +number);
//
//            }
//        }



    }



}
