package CodingPractise.Array;

import java.util.Arrays;

/**
 * Created by muthuselvan on 9/6/17.
 * Time Complexity: O(n*log(n))
  Auxiliary Space: O(n)
 * http://www.geeksforgeeks.org/minimum-number-swaps-required-sort-array/
 * ========================================================================
 *
 * An operation "swap" means removing an element from the array and appending it at the back of the same array. Find the minimum number of "swaps" needed to sort that array.

 Eg :- 3124
 Output: 2 (3124->1243->1234)

 How to do it less than O(n^2) ?

 Doing it in less than O(n^2) time means that we cannot actually perform the "swap". The idea is that we need to calculate the number of elements that are already sorted in the array, and the rest elements needs to be "swapped".

 e.g., 3124: 1, 2 are sorted, swap 3, 4
 7, 9, 8, 3, 5: 3, 5 are sorted, swap 7, 9, 8
 *
 * http://shirleyisnotageek.blogspot.com/2015/01/find-minimum-swaps-needed-to-sort-array.html
 *
 *
 1 4 2 3 =>  1 2 3 4
 *
 */
public class Sort_Minimum_Swaps {
    public static void main(String[] args) {
        int[] data= {2 ,5, 3, 1}; //1 2 3 4
//        Arrays.sort();
        minSwap(data);
    }

    public static void minSwap(int[] data) {
        int[] sorted = new int[data.length];
        for (int i=0;i<data.length;i++) {
            sorted[i]=data[i];
        }
        Arrays.sort(sorted);
        int count = 0 ;
        for (int i=0;i<data.length;i++) {
            if (data[i] == sorted[i])  {
                count++;
            }
        }
        System.out.println("count : " +count);
        System.out.println(data.length-count-1);


    }

}
