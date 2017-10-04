package CodingPractise.Array;

/**
 * Created by muthuselvan on 8/28/17.
 * https://www.programcreek.com/2016/08/leetcode-kth-smallest-element-in-a-sorted-matrix-java/
 *
 *   JAVA Code : http://www.dsalgo.com/2013/02/find-kth-largest-element-in-sorted.html ---> Check this code is working or not
 *

 Example:
 =========

 matrix = [
 [ 1, 5, 9],
 [10, 11, 13],
 [12, 13, 15]
 ],
 k = 8,

 ====> return 13.
 *
 */
public class KthSmallest2DMatrix {

    public static void main(String[] args) {
//        int[][] matrix = {
//                {1, 5, 9},
//                {10, 11, 13},
//                {12, 13, 15}
//        };


        int[][] matrix = {
                {1, 5, 7},
                {3, 7, 8},
                {4, 8, 9}
        };


        KthSmallest2DMatrix kthSmallest2DMatrix = new KthSmallest2DMatrix();
        System.out.println("Smallest for 2D .. " +kthSmallest2DMatrix.kthSmallest(matrix,6));
    }

    public int kthSmallest(int[][] matrix, int target) {
        int m=matrix.length;

        int lower = matrix[0][0];
        int upper = matrix[m-1][m-1];
        System.out.println("Upper : " +upper);
        System.out.println("Lower : " +upper);
        System.out.println((upper-lower)>>1);


        if (target >= upper) return -1;


        while(lower<upper){
            int mid = lower + ((upper-lower)>>1);
            System.out.println("Mid " +mid);

            int count = count(matrix, mid);
            System.out.println("Count : " +count);

            if(count<target){
                lower=mid+1;
            }else{
                upper=mid;
            }
        }

        return upper;
    }

    private int count(int[][] matrix, int target){
        int m=matrix.length;
        int i=m-1;
        int j=0;
        int count = 0;

        while(i>=0&&j<m){
            if(matrix[i][j]<=target){
                count += i+1;
                j++;
            }else{
                i--;
            }
        }

        return count;
    }


}
