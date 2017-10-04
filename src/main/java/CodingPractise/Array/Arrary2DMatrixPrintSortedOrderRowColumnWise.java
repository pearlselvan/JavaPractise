package CodingPractise.Array;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * Created by muthuselvan on 9/1/17.
 * http://liesbeek.com/2016/07/20/print-elements-sorted-order-row-column-wise-sorted-matrix/
 */
public class Arrary2DMatrixPrintSortedOrderRowColumnWise {

    public static void main(String[] args) {


        int mat[][]  =
                { {10, 20, 30, 40},
                        {15, 25, 35, 45},
                        {27, 29, 37, 48},
                        {32, 33, 39, 50},
                };

        int sizeOf2DMatrix = mat[0].length * mat.length;
        System.out.println(sizeOf2DMatrix);

        mergeKSortedArrays(mat,sizeOf2DMatrix);

    }
/* The idea is to use a Min Heap of size N which stores elements of first column.
The do extract minimum. In extract minimum, replace the minimum element with
the next element of the row from which the element is extracted.

Time complexity of this solution is O(N2LogN).*/
    private static void mergeKSortedArrays(int[][] arr, int totalSize) {
        PriorityQueue<Integer> q = new PriorityQueue<Integer>(totalSize);
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[0].length; j++)
            {
                int number = arr[i][j];
                System.out.println("Row => " +number);
                q.offer(number);
            }
        }

        q.forEach(out-> System.out.print(" "+out+" "));
    }

}
