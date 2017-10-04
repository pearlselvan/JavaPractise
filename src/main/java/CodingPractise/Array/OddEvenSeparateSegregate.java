package CodingPractise.Array;

import java.util.Arrays;
//http://www.geeksforgeeks.org/segregate-even-and-odd-numbers/

/**
 * Created by muthuselvan on 9/28/17.
 */
public class OddEvenSeparateSegregate {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(segregateEvenOdd(new int[]{1, 34, 45, 9, 8, 90, 3})));
//        System.out.println(Arrays.toString(segregateEvenOdd(new int[]{2, 1, 4,9})));
//        System.out.println(Arrays.toString(segregateEvenOdd(new int[]{5,2,9,12})));


    }

    static int[] segregateEvenOdd(int arr[])
    {
        /* Initialize left and right indexes */
        int left = 0, right = arr.length - 1;
        while (left < right)
        {
            /* Increment left index while we see 0 at left */
            while (arr[left]%2 == 0 && left < right)
                left++;
            System.out.println("No of even nos : " +left);

            /* Decrement right index while we see 1 at right */
            while (arr[right]%2 == 1 && left < right)
                right--;

            System.out.println("No of odd nos : " +right);

            if (left < right)
            {
                /* Swap arr[left] and arr[right]*/
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        } // End outer while loop
        return arr;
    }



}
