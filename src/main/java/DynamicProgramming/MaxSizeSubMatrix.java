package DynamicProgramming;

/**
 * Created by muthuselvan on 3/23/17.
 * DOWN VIDEO https://www.quora.com/What-are-the-top-10-most-popular-dynamic-programming-problems-among-interviewers
 * https://www.youtube.com/watch?v=_Lf1looyJMU
 * http://www.geeksforgeeks.org/maximum-size-sub-matrix-with-all-1s-in-a-binary-matrix/
 * http://www.geeksforgeeks.org/maximum-size-sub-matrix-with-all-1s-in-a-binary-matrix/
 */


/*

for the given : M[R][C]
----------------
   0  1  1  0  1
   1  1  0  1  0
   0  1  1  1  0
   1  1  1  1  0
   1  1  1  1  1
   0  0  0  0  0


output : S[R][C]
---------
   0  1  1  0  1
   1  1  0  1  0
   0  1  1  1  0
   1  1  2  2  0
   1  2  2  3  1
   0  0  0  0  0

Impl :
   1) Construct a sum matrix S[R][C] for the given M[R][C].
   a) Copy first row and first columns as it is from M[][] to S[][]
   b) For other entries, use following expressions to construct S[][]
 */

public class MaxSizeSubMatrix {
    public static void main(String[] args) {

        int[][] in= new int[][]{
                {0, 1, 1, 0},
                {0, 1, 1, 0},
                {0, 1, 1, 0},
                {0, 1, 1, 0}
        };

        printArray(in);


        int[][] out = new int[4][];
        System.arraycopy(in,0,out,0,in.length);

        // for column
        for (int j=0;j<in.length;j++) {
            out[j][0] = in[j][0];
        }

        // for row
        for (int i=0;i<in.length;i++) {
           out[0][i] = in[0][i];
        }


        for (int i=1;i<in.length;i++) {
            for (int j=1;j<in.length;j++) {

                if (in[i][j] == 1) {
                    out[i][j] = Math.min(in[i][j],Math.min(in[i][j],in[i][j])) +1 ;
                } else {
                    out[i][j] = 0 ;
                }
            }

        }

        printArray(out);

        System.out.println("Max Square IS : " +findMaxin2D(in));


    }

    public static void printArray(int[][] in) {
        for(int i=0;i<in.length;i++) {
            System.out.print(i+",");
            for(int j=0;j<in.length;j++) {
                System.out.print(in[i][j] +",");
            }
            System.out.println();
        }
    }


    public static void printArray(boolean[][] in) {
        for(int i=0;i<in.length;i++) {
            System.out.print(i+",");
            for(int j=0;j<in.length;j++) {
                System.out.print(in[i][j] +",");
            }
            System.out.println();
        }
    }


    public static int  findMaxin2D(int[][] in) {
        int max= 0 ;

        for(int i=0;i<in.length;i++) {
            for (int j = 0; j < in.length; j++) {

                if (in[i][j] > max ) {
                    max = in[i][j];
                }
            }
        }
        return max ;
    }

}
