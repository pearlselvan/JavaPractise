package CodingPractise.Array;

import java.util.Arrays;

/**
 * Created by muthuselvan on 8/26/17.
 * http://www.geeksforgeeks.org/find-the-smallest-positive-number-missing-from-an-unsorted-array/
 */
public class SeparateNegativeNumber {



    public static void main(String[] args) {

        int[] arr = {0, 10, 2, -10, -20};
        int size = arr.length;


        // First separate positive and
        // negative numbers
        int shift = segregate (arr, size);
        System.out.println("Size of non negative nos : including zero " +shift);
        System.out.println(Arrays.toString(arr));

    }

    /* Utility function that puts all non-positive
       (0 and negative) numbers on left side of
       arr[] and return count of such numbers */
    static int segregate (int arr[], int size)
    {
        int j = 0, i;
        for(i = 0; i < size; i++)
        {
            if (arr[i] <= 0)
            {
                int temp;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                // increment count of non-positive
                // integers
                j++;
            }
        }

        return j;
    }



}
