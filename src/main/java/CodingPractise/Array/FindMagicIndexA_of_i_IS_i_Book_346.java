package CodingPractise.Array;

import java.util.Arrays;

/**
 * Created by muthuselvan on 8/26/17.
 * http://algorithms.tutorialhorizon.com/magic-index-find-index-in-sorted-array-such-that-ai-i/
 *
 * Liner Search : Time Complexity: O(n) : http://www.geeksforgeeks.org/find-a-fixed-point-in-a-given-array/
 *
 * (Binary Search)
 * ===============
 First check whether middle element is Fixed Point or not. If it is, then return it; otherwise
 check whether index of middle element is greater than value at the index. If index is greater,
 then Fixed Point(s) lies on the right side of the middle point (obviously only if there is a Fixed Point).
 Else the Fixed Point(s) lies on left side.
 *
 * Example :
 * int[] A = { -1, 0, 1, 2, 4, 10 };

    Magic index or fixed point is : 4

 Solution 1:
 Better solution would Modify the Binary Search
 — Time Complex­ity O(logN).
 *
 */
public class FindMagicIndexA_of_i_IS_i_Book_346 {


    public int search(int[] A, int start, int end) {


        if (start <= end) {
            int mid = (start + end) / 2;
            if (mid == A[mid]) // check for magic index.
                return mid;
            if (mid > A[mid]) { // If mid>A[mid] means fixed point might be on
                // the right half of the array
                return search(A, mid + 1, end);
            } else {// If mid<A[mid] means fixed point might be on
                // the left half of the array
                return search(A, start, mid - 1);
            }
        }
        return -1;
    }

// This code work for duplicate values as well using recursive
    public static int magicFast(int[] array, int start, int end) {
        if (end < start) {
            return -1;
        }
        int midIndex = (start + end) / 2;
        int midValue = array[midIndex];
        if (midValue == midIndex) {
            return midIndex;
        }
		/* Search left */
        int leftIndex = Math.min(midIndex - 1, midValue);
        int left = magicFast(array, start, leftIndex); //Recursion
        if (left >= 0) {
            return left;
        }

		/* Search right */
        int rightIndex = Math.max(midIndex + 1, midValue);
        int right = magicFast(array, rightIndex, end); //Recursion

        return right;
    }

    public static int BF_magicIndex(int[] data) {

        for (int i=0;i<data.length;i++) {

            if (data[i] == i) {
                return i;
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        FindMagicIndexA_of_i_IS_i_Book_346 m = new FindMagicIndexA_of_i_IS_i_Book_346();
//        int[] A = { -1, 0, 1, 2, 4, 10 }; // Sorted Array  No Duplicates
//        int[] A = {-10, -1, 0, 3 , 10, 11, 30, 50, 100};

//        int[] A = { -1, 0, 4, 4, 4, 10 };
//                int[] A = { 4, 4, 4, 4, 4, 4 };
                int[] A = { 1, 1, 1, 1, 1, 1 };
//                int[] A = { 0, 4, 4, 4, 4, 4 };
//        int[] A = {9,8,7,4,4,2,1};
//        int[] A = {1,1,4,1,4,8,7};




        System.out.println("Magic index from Book Recursion  using binary search :" + m.magicFast(A, 0, A.length - 1));
        System.out.println("BF " +BF_magicIndex(A));

        System.out.println("Magic index will not work for duplicate values " + m.search(A, 0, A.length - 1));

    }



}
