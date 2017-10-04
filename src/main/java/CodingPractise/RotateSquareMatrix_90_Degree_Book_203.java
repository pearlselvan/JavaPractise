package CodingPractise;

/**
 * Created by muthuselvan on 4/2/17.
 *
 * Big - O - O(N sqr) :
 * ---------------------
 * Inplace rotate square matrix by 90 degrees | Set 1 : ( No Extra Space )
 * =====================================================
 * http://www.geeksforgeeks.org/inplace-rotate-square-matrix-by-90-degrees/
 *
 * Rotate a matrix by 90 degree without using any extra space | Set 2
 * ==================================================================
 * http://www.geeksforgeeks.org/rotate-matrix-90-degree-without-using-extra-space-set-2/
 *
 *
 * Without space : in-space :
 * ========================
 *

 *  clockwise rotate
 * first reverse up to down, then swap the symmetry
 * 1 2 3     7 8 9     7 4 1
 * 4 5 6  => 4 5 6  => 8 5 2
 * 7 8 9     1 2 3     9 6 3
 * Code : * https://leetcode.com/problems/rotate-image/discuss/
 */

public class RotateSquareMatrix_90_Degree_Book_203 {

//    static int[][] array = new int[2][2];

    static int N;

//  static  int[][]mat = {
//            {0,1} ,
//            {2,3}
//    };



//
//        static  int[][] mat = {
//            { 1, 2, 3 },
//            { 4, 5, 6 },
//            { 7, 8, 9 }
//    };

    static int mat[][] =
    {
        {1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12},
        {13, 14, 15, 16}
    };

    // this will not rotate because this is not suare
//    static  int[][] mat = {
//            { 1, 2, 3 ,4},
//            { 5, 6, 7 ,9},
//            { 9, 10, 11,12 }
//    };


    public static void main(String[] args) {

        String f1 = "javaj2ee";
        String f2=  "muthusel";
        String f3 = f1+f2 ;

        if (f3.contains(f2)){
            System.out.println("rotation of is true");
        } else {
            System.out.println("rotation of is NOT true");
        }



        N=mat.length; // row values

        System.out.println("Original");
   printArray(mat);

   rotateMatrixInPlace(mat);

//   System.out.print("After rotated");
        System.out.println("Rotated");
        printArray(mat);




    }

    public static void rotateMatrix(int[][] array) {
        int last = array.length-1;
        for (int i=0;i<last;i++) {
            swap(array[i][i],array[i][last]);
            swap(array[i][i],array[i][last]);
            swap(array[i][i],array[i][last]);
        }

    }

    public static void swap(int num1,int num2){
        int temp = num1;
        num1 = num2 ;
        num2 = temp ;
    }

    // An Inplace function to rotate a N x N matrix
// by 90 degrees in anti-clockwise direction
//    Time complexity :O(R*C)
    public static void rotateMatrixInPlace(int mat[][])
    {
        //Where N=mat.length;
        // Consider all squares one by one
        System.out.println("Row Size : " +N);
        for (int layer = 0; layer < N / 2; layer++)
        {
            // Consider elements in group of 4 in
            // current square
            int first = layer ;
            int last = N-layer-1; // Last will be 3 if mat size is 3 // that 0 to 3 inner loop
            System.out.println("Last: " +last);
            // for loop for rotating layer by layer

            //basically we are doing swapping in the following sequence
            // 1. TEMP_TOP = TOP_MATRIX
            // 2. TOP_MATRIX = LEFT_MATRIX
            // 3. LEFT_MATRIX = BOTTOM_MATRIX
            // 4. BOTTOM_MATRIX = LEFT_MATRIX
            // 5. LEFT_MATRIX = TEMP_TOP

            for (int current = first; current < last; current++)
            {
                int offset = N-1-current;
                System.out.println("Off set  : " +offset);

                System.out.println("Initial first and current , TOP side of the matrix: " +mat[first][current]);
                // store current cell in temp variable
                int top = mat[first][current];

//                System.out.println("After assigned Top = first and current: " +top);

                System.out.println("Initial current and last , RIGHT of the matrix: " +mat[current][last]);

                // move values from right to top
                mat[first][current] = mat[current][last];


                System.out.println("Initial last and offset , BOTTOM of the MATRIX ..right to left : " +mat[last][offset]);

                // move values from bottom to right
                mat[current][last] = mat[last][offset];
                // move values from left to bottom
                System.out.println("Initial offset and first , LEFT of the MATRIX ..bottom to top : " +mat[offset][first]);
                mat[last][offset] = mat[offset][first];
                // assign temp to left
                    mat[offset][first] = top;
            }
        }
    }

    public static void printArray(int[][] data){

        for(int i = 0; i < data.length; i++){
            for(int j = 0; j <data[i].length; j++){
                System.out.print(" "+data[i][j]);

            }
            System.out.println();
        }


    }
}
