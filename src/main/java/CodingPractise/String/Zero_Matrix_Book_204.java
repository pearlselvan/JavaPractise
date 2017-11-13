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
 *
 * [00,01,02,03]
 * [10,11,12,13]
 * [20,21,22,23]
 * [30,31,32,33]
 *
 *  STEP 1 :
 *  Check ZERO for  00,01,02,03 , if true then  rowHasZero=True
 *
 *  STEP 2 :
 *  Check ZERO for 00,10,20,30, if true then colHasZero=True
 *
 *  STEP 3 :
 *  Check ZERO (STEP 1 and STEP 2 ) for
 *  11,12,13
 *  21,22,23
 *  31,32,33
 *
 *  if True then making corresponding first row 0
 *   example :
 *   if 11 ZERO then 10 and 01 will be ZERO
 *   if 22 ZERO then 20 and 02 will be ZERO
 *   if 33 ZERO then 30 and 03 will be ZERO
 *
 *
 * STEP 4 : Nullify Column for Checking col 01 ,02,03
 *    if 01 is ZERO then make 11,21,31 ZERO
 *    if 02 is ZERO then make 12,22,32 ZERO
 *    if 03 is ZERO then make 13,23,33 ZERO
 *
 * STEP 5 : Nullify row for Checking row 10,20,30
 *    if 10 is ZERO then make 11,12,13 ZERO
 *    if 20 is ZERO then make 21,22,23 ZERO
 *    if 30 is ZERO then make 21,22,23 ZERO
 *
 *  STEP 6 : from STEP 1 if rowHasZero=True then
 *   Make : 00,01,02,03 as ZERO
 *
 *  STEP 7 : from STEP 2 if colHasZero=True then
 *  Make : 00,10,20,30 as ZERO
 *
 *
 *
 */
public class Zero_Matrix_Book_204 {

    public static void main(String[] args) {

//       int[][] data = new int[3][3];

//         int[][] m = {
//                 {10,1},
//                 {0,0}
//         };

//        int[][] m = {
//                {10,1,2,5},
//                {1,0,10,40},
//                {11,10,10,40},
//                {12,02,10,40}
//        };


        int[][] m = {
                {0,1,2,5},
                {1,0,10,40},
                {11,10,10,40},
                {12,02,10,40}
        };


        System.out.println("Before Set " +Arrays.deepToString(m));
         setZeroes(m);
        System.out.println("After Set " +Arrays.deepToString(m));
    }

    public static void print2D() {

    }

    public static void setZeroes(int[][] matrix) {
        if(matrix==null){
            return;
        }

        int row_length = matrix.length;
        int col_length = matrix[0].length;
        System.out.println("Row sz :" +row_length);
        System.out.println("Col sz :" +col_length);

        boolean rowHasZero = false;
        boolean colHasZero = false;
        // Have col as static : 0 so that we can traverse row that is top left to right
        System.out.println("############################# STEP 1 #############################");
        for(int i=0; i<col_length; i++){

//            System.out.println("Row index : " +i );
            System.out.println("Checking ROW ZERO @ Row 0 and col " +i +" -  " +matrix[0][i]);
            if(matrix[0][i]==0){
                System.out.println(":-) Found  ZERO @ Row : 0 and col " +i + "  making rowHasZero is true");
                rowHasZero = true; // why we are not chaning the values because rest of them we need to check , if we chaning will make all matrix zero
                break;
            }
        }
        System.out.println("############################# STEP 1 DONE ########################");
        System.out.println();

        System.out.println("############################# STEP 2 #############################");

        for(int i=0; i<row_length; i++){
//            System.out.println("Col index : " +i);
//            System.out.println("Values @ matrix[i][0] for cols :" +matrix[i][0]);
            System.out.println("Checking COL ZERO @ Row "+ i +" and col 0  - "  +matrix[i][0]);
            if(matrix[i][0]==0){
                System.out.println("Checking first col as zero");
                colHasZero = true; // why we are not chaning the values because rest of them we need to check , if we chaning will make all matrix zero
                break;
            }
        }

        System.out.println("############################# STEP 2 DONE #############################");
        System.out.println();

        /*
           int[][] row_length = {
                {10,1,2,5},
                {1,0,10,40},
                {11,10,10,40},
                {12,02,10,40}
        };
         */
        System.out.println("So far matrix : " +Arrays.deepToString(matrix));
        System.out.println();


        System.out.println("############################# STEP 3 #############################");

        for(int i=1; i<row_length; i++){
            for(int j=1; j<col_length; j++){
                System.out.println("Values @ Row "+i + " col "+ j+ " @ matrix[i][j] " +matrix[i][j]);
                if(matrix[i][j]==0){
                    System.out.println(":-) found 0 second row and col is zero in row : " +i +" col : " +j);
//                    System.out.println("Changing : matrix[i][0] " +matrix[i][0]);
                    System.out.println("Changing Row " +i + " Col 0 as ZERO" );
                    matrix[i][0] = 0; // Changing corresponding row on top
//                    System.out.println("Changing : matrix[0][i] " +matrix[0][j]);
                    System.out.println("Changing Row 0  Col " +j + " as ZERO" );
                    matrix[0][j] = 0; // Changin corresponding col as right side
                }
            }
        }
        System.out.println("So far matrix : " +Arrays.deepToString(matrix));
        System.out.println();


        System.out.println("############################# STEP 3 DONE #############################");


        System.out.println();
        System.out.println("############################# STEP 4 #############################");

        for(int j=1;j<col_length; j++){
            System.out.println("Checking ZERO @ Row : 0 and col " +j);
//            System.out.println("Values @ matrix[0][j] for rest 1 by traversing cols : " +matrix[0][j]);
            if(matrix[0][j]==0){
                System.out.println(":-) Found  ZERO @ Row : 0 and col " +j + " So Calling nullifyCol");
                nullifyCol(matrix, j, row_length, col_length);
            }
        }

        System.out.println("############################# STEP 4 DONE #############################");

        System.out.println("############################# STEP 5 #############################");

        for(int i=1; i<row_length; i++){
            System.out.println("Checking ZERO @ Row : "+ i + " and col 0" );
//            System.out.println("Values @ matrix[i][0] for rest 2 : by traversing row " +matrix[0][i]);
            if(matrix[i][0]==0){
                System.out.println(":-) Found  ZERO @ Row : "+i + " and col 0 , So Calling nullifyRow");
                nullifyRow(matrix, i, row_length, col_length);
            }
        }

        System.out.println("############################# STEP 5 DONE #############################");
        if(rowHasZero){

            System.out.println(" if rowHasZero = true ");
            nullifyRow(matrix, 0, row_length, col_length);
        }
        if(colHasZero){
            System.out.println(" if colHasZero = true ");
            nullifyCol(matrix, 0, row_length, col_length);
        }

    }

    public static void nullifyRow(int[][] matrix, int i, int m, int n){
        for(int col=0; col<n; col++){
            System.out.println("[ nullifyRow ] Changing Row " +i +" col : " +col+ " as Zero ");
            matrix[i][col] = 0;
        }
    }

    // iterating columm as j
    public static void nullifyCol(int[][] matrix, int j, int m, int n){

        for(int row=0; row<m; row++){
            System.out.println("[ nullifyCol ] Changing Row " +row +" col : " +j+ " as Zero ");
            matrix[row][j] = 0;
        }
    }
}
