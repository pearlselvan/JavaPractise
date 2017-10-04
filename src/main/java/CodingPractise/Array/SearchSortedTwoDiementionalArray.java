package CodingPractise.Array;

/**
 * Created by muthuselvan on 4/22/17.
 *
 * simple solution : o(n Sqr) :
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
 */
public class SearchSortedTwoDiementionalArray {

    public static void main(String[] args) {

        int[][] mat = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50},
        };

        search(mat,mat.length,-150);


    }

    public static void search(int[][] mat, int length,int search){
        int i=0;
        int j=length-1;

        while ((i< length) && ( j>= 0)) {
            if (mat[i][j] == search) {
                System.out.println("Found : " +search +"in" +i +":"+ +j);
                return;
            }

            if (mat[i][j] < search) {
                i++;
            } else {
                j--;
            }
        }
        System.out.println("Element not found");
        return;




    }
}
