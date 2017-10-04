package CodingPractise.Array;

/**
 * Created by muthuselvan on 8/28/17.
 *
 * * simple solution : o(n Sqr) :
 * ----------------------

 * http://www.geeksforgeeks.org/search-in-row-wise-and-column-wise-sorted-matrix/
 *
 Better solution
 ---------------
 is to use Divide and Conquer to find the element.
 Time complexity of this solution is O(n1.58)


 Below is an efficient solution that works in O(n) time.
 =======================================================
 1) Start with top right element
 2) Loop: compare this element e with x
 ….i) if they are equal then return its position
 …ii) e < x then move it to down (if out of bound of matrix then break return false) ..iii) e > x then move it to left (if out of bound of matrix then break return false)
 3) repeat the i), ii) and iii) till you find element or returned false

 *
 *
 * Time Complexity: O(m + n):
 * --------------------------
 *
 * https://www.programcreek.com/2014/04/leetcode-search-a-2d-matrix-ii-java/
 *
 *
 * Other Approach :
 * http://articles.leetcode.com/searching-2d-sorted-matrix
 * http://articles.leetcode.com/searching-2d-sorted-matrix-part-ii/
 *
 * Sorted means :
 * Table[i][j] ≤ Table[i][j + 1],
   Table[i][j] ≤ Table[i + 1][j]
 */
public class Search2DMatrix {


    public static void main(String[] args) {


//        int[][] data = {
//
//                {1,   4,  7, 11, 15},
//                {2,   5,  8, 12, 19},
//                {3,   6,  9, 16, 22},
//                {10, 13, 14, 17, 24},
//                {18, 21, 23, 26, 30}
//
//        };


        int[][] data = {

                {1,   4,  7, 11, 15,56},
                {2,   5,  8, 12, 19,78},
                {3,   6,  9, 16, 22,99},
                {10, 13, 14, 17, 24,1122},
                {18, 21, 23, 26, 30,7890}

        };


        System.out.println("Search in 2D " +new Search2DMatrix().searchMatrix(data,1122));
        System.out.println("Search in 2D using Binary Search " +new Search2DMatrix().binarySearchMatrix(data,1122));
        System.out.println("Search in 2D using Diagonally Search " +new Search2DMatrix().searchDiagonallyMatrix(data,1122));




    }

//    Time Complexity: O(m + n) ,  i
// s this step wise lineach search in http://articles.leetcode.com/searching-2d-sorted-matrix-part-ii/
    // This diagoanlly serach . improved binary search
    public boolean searchMatrix(int[][] matrix, int target) {
        int row_length=matrix.length-1; //Row
        int column_length=matrix[0].length-1; // Column
        System.out.println("Column length :" +row_length);
        System.out.println("Row Length:" +column_length);

        int row_index=row_length;
        int column_index=0;

        while(row_index>=0 && column_index<=column_length){
            if(target < matrix[row_index][column_index]){
                row_index--;
            }else if(target > matrix[row_index][column_index]){
                column_index++;
            }else{
                return true;
            }
        }
        System.out.println(row_index);

        return false;
    }


    //o(n log (n))
    public boolean binarySearchMatrix(int[][] matrix, int target) {

        int row_num = matrix.length;
        int col_num = matrix[0].length;

        int begin = 0, end = row_num * col_num - 1;

        while(begin <= end){
            int mid = (begin + end) / 2;
            int mid_value = matrix[mid/col_num][mid%col_num];

            if( mid_value == target){
                return true;

            }else if(mid_value < target){
                //Should move a bit further, otherwise dead loop.
                begin = mid+1;
            }else{
                end = mid-1;
            }
        }

        return false;
    }

 /*
 We start search the matrix from top right corner, initialize
 the current position to top right corner, if the target is greater
 than the value in current position, then the target can not be in entire
 row of current position because the row is sorted,

  if the target is less than the value in current position, then the target can not in the entire
  column because the column is sorted too. We can rule out one row or one column each time,
  so the time complexity is O(m+n).
  */
 //// This diagoanlly serach . improved binary search
    public boolean searchDiagonallyMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length < 1 || matrix[0].length <1) {
            return false;
        }
        int col = matrix[0].length-1;
        int row = 0;
        while(col >= 0 && row <= matrix.length-1) {
            if(target == matrix[row][col]) {
                return true;
            } else if(target < matrix[row][col]) {
                col--;
            } else if(target > matrix[row][col]) {
                row++;
            }
        }
        return false;
    }


}
