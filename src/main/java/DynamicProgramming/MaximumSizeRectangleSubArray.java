package DynamicProgramming;

/**
 * Created by muthuselvan on 3/23/17.
 * Approach :
 * http://algorithms.tutorialhorizon.com/dynamic-programming-maximum-size-square-sub-matrix-with-all-1s/
 *
 * Using DP : http://www.geeksforgeeks.org/maximum-size-sub-matrix-with-all-1s-in-a-binary-matrix/
 * Using histogram : http://www.geeksforgeeks.org/maximum-size-rectangle-binary-sub-matrix-1s/
 *
 * DP :
 *
 *
 * Let the given binary matrix be M[R][C].
 * The idea of the algorithm is to construct an auxiliary size matrix S[][]
 * in which each entry S[i][j] represents size of the square sub-matrix
 * with all 1s including M[i][j] where M[i][j] is the rightmost
 * and bottommost entry in sub-matrix.

 1) Construct a sum matrix S[R][C] for the given M[R][C].
 a)	Copy first row and first columns as it is from M[][] to S[][]
 b)	For other entries, use following expressions to construct S[][]
 If M[i][j] is 1 then
 S[i][j] = min(S[i][j-1], S[i-1][j], S[i-1][j-1]) + 1    ==========>  min( left cell , top cell , top diagonal )
 Else If M[i][j] is then
/* S[i][j] = 0
 2) Find the maximum entry in S[R][C]
 3) Using the value and coordinates of maximum entry in S[i], print sub-matrix of M[][]

 https://leetcode.com/articles/maximal-square/
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
public class MaximumSizeRectangleSubArray {

    public static void main(String[] args) {

//        char[][] data = {
//
//                {  1, 0, 1, 0, 0 } ,
//                {  1 ,0, 1, 1, 1 },
//                {  1 ,1, 1, 1, 1 },
//                {  1, 0, 0, 1, 0 }
//
//        };

        char[][] data = {

                {  '1', '0', '1', '0', '0' } ,
                {  '1' ,'0', '1', '1', '1' },
                {  '1' ,'1', '1', '1', '1' },
                {  '1', '0', '0', '1', '0' }

        };
        System.out.println(maximalSquare(data));

    }

 //Complexity Analysis
//    Time complexity : O(mn)O(mn). Single pass.
//    Space complexity : O(n)O(n).
// Another array which stores elements in a row is used for dp.
    // This code from : https://leetcode.com/articles/maximal-square/
    public static int maximalSquare(char[][] matrix) {
        int rows = matrix.length, cols = rows > 0 ? matrix[0].length : 0;
        int[] dp = new int[cols + 1];  // Tabulation :
        int maxsqlen = 0, prev = 0;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                int temp = dp[j];
                if (matrix[i - 1][j - 1] == '1') {
                    dp[j] = Math.min(Math.min(dp[j - 1], prev), dp[j]) + 1;
                    maxsqlen = Math.max(maxsqlen, dp[j]);
                } else {
                    dp[j] = 0;
                }
                prev = temp;
            }
        }
        return maxsqlen * maxsqlen;
    }
}
