package CodingPractise.String;

import java.util.Arrays;

/**
 * Created by muthuselvan on 9/6/17.
 * https://github.com/careercup/CtCI-6th-Edition/tree/master/Java/Ch%2001.%20Arrays%20and%20Strings/Q1_08_Zero_Matrix
 *
 * https://leetcode.com/problems/set-matrix-zeroes/description/
 *
 *
 * Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in place.
 *
 */
public class Zero_Matrix_Book_204 {

    public static void main(String[] args) {

//       int[][] data = new int[3][3];

         int[][] m = {
                 {10,1},
                 {0,0}
         };

         setZeroes(m);
        System.out.println(Arrays.deepToString(m));




    }

    public static void print2D() {

    }

    public static void setZeroes(int[][] matrix) {
        if(matrix==null){
            return;
        }

        int m = matrix.length;
        int n = matrix[0].length;

        boolean rowHasZero = false;
        boolean colHasZero = false;

        for(int i=0; i<n; i++){
            System.out.println("Row index : " +i);
            if(matrix[0][i]==0){
                rowHasZero = true;
                break;
            }
        }

        for(int i=0; i<m; i++){
            System.out.println("Col index : " +i);
            if(matrix[i][0]==0){
                colHasZero = true;
                break;
            }
        }

        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                if(matrix[i][j]==0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }



        for(int j=1;j<n; j++){
            if(matrix[0][j]==0){
                nullifyCol(matrix, j, m, n);
            }
        }

        for(int i=1; i<m; i++){
            if(matrix[i][0]==0){
                nullifyRow(matrix, i, m, n);
            }
        }

        if(rowHasZero){
            nullifyRow(matrix, 0, m, n);
        }
        if(colHasZero){
            nullifyCol(matrix, 0, m, n);
        }

    }

    public static void nullifyRow(int[][] matrix, int i, int m, int n){
        for(int col=0; col<n; col++){
            matrix[i][col] = 0;
        }
    }

    public static void nullifyCol(int[][] matrix, int j, int m, int n){
        for(int row=0; row<m; row++){
            matrix[row][j] = 0;
        }
    }
}
