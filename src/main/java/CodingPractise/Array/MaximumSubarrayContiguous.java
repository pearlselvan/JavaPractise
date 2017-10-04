package CodingPractise.Array;

import java.util.Arrays;

/**
 * Created by muthuselvan on 2/3/17.
 *
 * Ref : http://www.geeksforgeeks.org/largest-sum-contiguous-subarray/ for kadanie 0(n)
 *
 *
 * for DP :
 * https://leetcode.com/problems/maximum-subarray/discuss/





Largest Sub Array sum problem :
input :  -2 -3 4 -1 -2 1 5 -3
               *  *  * * *

* Indicates that MAX of continiuos sub array from orginal array

Use : Kadane’s Algorithm:
Kadane's algorithm consists of a scan through the array values,
computing at each position the maximum (positive sum)
subarray ending at that position.

This subarray is either empty (in which case its sum is zero) or
consists of one more element
than the maximum subarray ending at the previous position.

The algorithm only needs to keep track of the ending position because
the implied starting position is just after the last position at
which the sum went negative; a higher sum can always be found
by dropping any negative-sum prefix.



Initialize:
    max_so_far = 0
    max_ending_here = 0

Loop for each element of the array
  (a) max_ending_here = max_ending_here + a[i]
  (b) if(max_ending_here < 0)
            max_ending_here = 0
  (c) if(max_so_far < max_ending_here)
            max_so_far = max_ending_here
return max_so_far
 */


public class MaximumSubarrayContiguous {

    public MaximumSubarrayContiguous() {



    }

    public static void main(String[] args) {
//        int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
//        int [] a = {1,-3,1,3};
//        int [] a = {1,-1,1,3};
//        int [] a = {-11,1,-11,-3};
//        int [] a = {0,0,0,0,1,20,-1,55,1};
        int [] a = {-7, -3, 5, 8, 2, 4};
       // System.out.println("Maximum contiguous sum is " +
             //   maxSubArraySum(a));

        maxSubArraySumUsingBruitForce(a);
        System.out.println("=>" +maxSubArraySum(a));

        System.out.println("Maximum contiguous sum is " +
                maxSequenceSum(a));
    }


    //its not optimal : o(n2)
    static int maxSubArraySumUsingBruitForce(int a[]) {
            int maxSum = 0;

        for (int i=0;i<a.length;i++) {
            int currentSum = 0 ;
            for (int j=i;j<a.length;j++) {
//                System.out.println( i + "-" +j);
                currentSum = currentSum + a[j] ;
                if (currentSum > maxSum) {
                    maxSum = currentSum ;
                }
            }
            System.out.println( "curr sum : " +currentSum);
//            System.out.println( "i : " +i +" Max end :  " +maxEnd);



        }
        System.out.println("Using bruit force" +maxSum);
        return 1 ;
    }

    //optimal : o(n)
    //max sub arra ending at the nth index is either current element x or current element combined with previous
    //
    static int maxSubArraySum(int a[])
    {
        System.out.println("----Using Kadane’s Algorithm: org array  ---" + Arrays.toString(a));

        int size = a.length;
        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;

        for (int i = 0; i < size; i++)
        {
            max_ending_here = max_ending_here + a[i];
            System.out.println("max end here " +max_ending_here);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    static int maxSequenceSum(int[] arr)
    {
        int maxSoFar = arr[0], maxEndingHere = arr[0];

        for (int i = 1; i < arr.length; i++)
        {
            /* calculate maxEndingHere */
            if (maxEndingHere < 0)
                maxEndingHere = arr[i];
            else
                maxEndingHere += arr[i];

            /* calculate maxSoFar */
            if (maxEndingHere >= maxSoFar)
                maxSoFar = maxEndingHere;
        }
        return maxSoFar;
    }
}


