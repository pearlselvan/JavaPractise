package CodingPractise.Array;

import java.util.HashSet;

/**
 * Created by muthuselvan on 9/6/17.
 * https://leetcode.com/problems/valid-sudoku/description/
 *
 * https://www.programcreek.com/2014/05/leetcode-valid-sudoku-java/
 *
 * How about the empty cell ?
 * The Sudoku board could be partially filled, where empty cells are filled with the character '.'.
 *
   2D array to check all the values :

 * http://web.cs.iastate.edu/~smkautz/cs227s12/examples/week10/SudokuChecker.java
 *
 * http://algorithms.tutorialhorizon.com/backtracking-sudoku-solver/
 *
 * RULES :
 * ------
 * http://sudoku.com.au/TheRules.aspx
 */
public class ValidateSudoku {

    public static void main(String[] args) {


    }

    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i<9; i++){
            HashSet<Character> rows = new HashSet<Character>();
            HashSet<Character> columns = new HashSet<Character>();
            HashSet<Character> cube = new HashSet<Character>();
            for (int j = 0; j < 9;j++){
                if(board[i][j]!='.' && !rows.add(board[i][j]))
                    return false;
                if(board[j][i]!='.' && !columns.add(board[j][i]))
                    return false;
                int RowIndex = 3*(i/3);
                int ColIndex = 3*(i%3);
                if(board[RowIndex + j/3][ColIndex + j%3]!='.' && !cube.add(board[RowIndex + j/3][ColIndex + j%3]))
                    return false;
            }
        }
        return true;
    }
}
