package CodingPractise;

/**
 * Created by muthuselvan on 4/22/17.
 * http://www.geeksforgeeks.org/search-in-row-wise-and-column-wise-sorted-matrix/
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

        search(mat,mat.length,150);


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
