package DynamicProgramming;

import java.util.Arrays;

/**
 * Created by muthuselvan on 3/28/17.
 *
 * Recursive :
 * ==========
 * Time complexity of the above implementation is exponential as it tries every possible
 * path from 0 to N-1. The above solution solves same subrpoblems multiple times
 * (it can be seen by drawing recursion tree for minCostPathRec(0, 5).
 *
 * http://www.geeksforgeeks.org/find-the-minimum-cost-to-reach-a-destination-where-every-station-is-connected-in-one-direction/
 * LOGIC :
 * We can solve it using Recur­sion ( return Min(path going right, path going down))
 * but that won’t be a good solu­tion because we will be solv­ing many sub-problems mul­ti­ple times.
 * Since at every cell we have 2 options the time com­plex­ity will O(2n).
 *
 * Formula :
 * minCost(0, N-1) =
 MIN { 2D_array[0][n-1],
 2D_array[0][1] + minCost(1, N-1),
 minCost(0, 2) + minCost(2, N-1),
 ........,
 minCost(0, N-2) + 2D_array[N-2][n-1] }



 *  DP : Time Com­plex­ity: O(n2).///formual is same --- fill : Bottom-up manner
 *  =====
 * http://algorithms.tutorialhorizon.com/dynamic-programming-minimum-cost-path-problem/
 */

/*
For the give matrix find minum cost reach from
top left cornet to top right corner
 */
public class MinimumCostPath {

    public static void main(String[] args) {

        int[][] A = { { 1, 7, 9, 2 }, { 8, 6, 3, 2 }, { 1, 6, 7, 8 },
                { 2, 9, 8, 2 } };
        System.out.println("Minimum Cost Path " + find(A));

    }


    public static int find(int[][] A) {
        int[][] solution = new int[A.length][A.length];

        solution[0][0] = A[0][0];
        System.out.println("Result : " + Arrays.deepToString(solution));

        // fill the first row
        for (int i = 1; i < A.length; i++) {
            solution[0][i] = A[0][i] + solution[0][i - 1];
        }

        System.out.println("Result After fill first ROW : " + Arrays.deepToString(solution));

        // fill the first column
        for (int i = 1; i < A.length; i++) {
            solution[i][0] = A[i][0] + solution[i - 1][0];
        }

        System.out.println("Result After fill first COL : " + Arrays.deepToString(solution));

        // path will be either from top or left, choose which ever is minimum
        for (int i = 1; i < A.length; i++) {
            for (int j = 1; j < A.length; j++) {
                solution[i][j] = A[i][j]
                        + Math.min(solution[i - 1][j], solution[i][j - 1]);
            }
        }

        System.out.println("Result After top / left : " + Arrays.deepToString(solution));
        return solution[A.length - 1][A.length - 1];
    }

}
