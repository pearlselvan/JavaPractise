package DynamicProgramming;

/**
 * Created by muthuselvan on 3/23/17.
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
}
