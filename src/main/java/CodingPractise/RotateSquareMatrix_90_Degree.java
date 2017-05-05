package CodingPractise;

/**
 * Created by muthuselvan on 4/2/17.
 * http://www.geeksforgeeks.org/inplace-rotate-square-matrix-by-90-degrees/
 */
public class RotateSquareMatrix_90_Degree {

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



        N=mat.length;




   printArray(mat);

   rotateMatrixInPlace(mat);

//   System.out.print("After rotated");

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
    public static void rotateMatrixInPlace(int mat[][])
    {
        //Where N=mat.length;
        // Consider all squares one by one
        for (int layer = 0; layer < N / 2; layer++)
        {
            // Consider elements in group of 4 in
            // current square
            int first = layer ;
            int last = N-layer-1; // Last will be 3 if mat size is 3 // that 0 to 3 inner loop
            System.out.println("Last: " +last);
            for (int current = first; current < last; current++)
            {
                int offset = N-1-current;
                // store current cell in temp variable
                int top = mat[first][current];
                // move values from right to top
                mat[first][current] = mat[current][last];
                // move values from bottom to right
                mat[current][last] = mat[last][offset];
                // move values from left to bottom
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
