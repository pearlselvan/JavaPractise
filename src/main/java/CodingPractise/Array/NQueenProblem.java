package CodingPractise.Array;

/**
 * Created by muthuselvan on 8/19/17.
 * http://www.geeksforgeeks.org/backtracking-set-3-n-queen-problem/
 * https://www.youtube.com/watch?v=xouin83ebxE&t=414s
 *
 *
 * if it 4 cross 4 then our recursion will be 4 level deep
 *
 * @ Zero the recursion , we will placing zero th queen on zero th row
 * @ first recursion -> first queen on first row such this will not attack the first queen
 * @ second recursion -> second queen on second row such this will not zero th and first row of the queen
 *
 *  at any point of time , if we can't find square for a queen on that row then we are going to return false to the calling
 *  function and then that level ( previous level) of recursion will place the queen on the next avaialbe square of the row ,
 *  if that row does'<></>
 *
 *
 *
 *  1) Start in the leftmost column
 2) If all queens are placed
 return true
 3) Try all rows in the current column.  Do following for every tried row.
 a) If the queen can be placed safely in this row then mark this [row,
 column] as part of the solution and recursively check if placing
 queen here leads to a solution.
 b) If placing queen in [row, column] leads to a solution then return
 true.
 c) If placing queen doesn't lead to a solution then umark this [row,
 column] (Backtrack) and go to step (a) to try other rows.
 3) If all rows have been tried and nothing worked, return false to trigger
 backtracking.
 *
 */
public class NQueenProblem {

    final int N = 4;

    /* A utility function to print solution */
    void printSolution(int board[][])
    {
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
                System.out.print(" " + board[i][j]
                        + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {

        NQueenProblem n = new NQueenProblem();
        System.out.println(n.solveNQ());


    }

    /* This function solves the N Queen problem using
       Backtracking.  It mainly uses  solveNQUtil() to
       solve the problem. It returns false if queens
       cannot be placed, otherwise return true and
       prints placement of queens in the form of 1s.
       Please note that there may be more than one
       solutions, this function prints one of the
       feasible solutions.*/
    boolean solveNQ()
    {
        int board[][] = {{0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };

        if (solveNQUtil(board, 0) == false)
        {
            System.out.print("Solution does not exist");
            return false;
        }

        printSolution(board);
        return true;
    }


    /* A recursive utility function to solve N
          Queen problem */
    boolean solveNQUtil(int board[][], int col)
    {
        /* base case: If all queens are placed
           then return true */
        if (col >= N)
            return true;

        /* Consider this column and try placing
           this queen in all rows one by one  that is
           ITERATING OVER EACH COLUMN */
        for (int i = 0; i < N; i++)
        {
            /* Check if queen can be placed on
               board[i][col] */
    //            IF ITS SAFE UPDATE THE BOARD
            if (isSafe(board, i, col))
            {
                /* Place this queen in board[i][col] */
                board[i][col] = 1;

                /* recur to place rest of the queens */
                if (solveNQUtil(board, col + 1) == true)  // RECUSTION
                    return true;

                /* If placing queen in board[i][col]
                   doesn't lead to a solution then
                   remove queen from board[i][col] */
                board[i][col] = 0; // BACKTRACK
            }
        }

        /* If queen can not be place in any row in
           this colum col, then return false */
        return false;
    }

    /* A utility function to check if a queen can
       be placed on board[row][col]. Note that this
       function is called when "col" queens are already
       placeed in columns from 0 to col -1. So we need
       to check only left side for attacking queens */
    boolean isSafe(int board[][], int row, int col)
    {
        int i, j;

        /* Check this row on left side */
        for (i = 0; i < col; i++)
            System.out.println("ROW ON LEFT SIDE - ROW " +row+ " - COL " +col);
            if (board[row][i] == 1)
                return false;

        /* Check upper diagonal on left side */
        for (i=row, j=col; i>=0 && j>=0; i--, j--)
//            System.out.println("Uppear diagonal on left side , ROW " +i+ "COL : " +col);
            if (board[i][j] == 1)
                return false;

        /* Check lower diagonal on left side */
        for (i=row, j=col; j>=0 && i<N; i++, j--)
//            System.out.println("Lower diagonal on left side , ROW " +i+ "COL : " +col);
            if (board[i][j] == 1)
                return false;

        return true;
    }


}


