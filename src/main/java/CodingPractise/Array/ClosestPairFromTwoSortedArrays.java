package CodingPractise.Array;

/**
 * Created by muthuselvan on 6/4/17.
 * CODE :
 * http://www.geeksforgeeks.org/given-two-sorted-arrays-number-x-find-pair-whose-sum-closest-x/
 *
 *
 * Ask ?
 * ====
 * Array is sorted ?
 *
 *
 * A Simple Solution is to run two loops.
 ========================================
 * The outer loop considers every element of first array and inner loop checks
 * for the pair in second array.
 *
 * We keep track of minimum difference between ar1[i] + ar2[j] and x.
 *
 *
 *
 * We can do it in O(n) time using following steps.
 * =================================================
 1) Merge given two arrays into an auxiliary array
  of size m+n using merge process of merge sort.

 While merging keep another boolean array of size m+n to indicate whether
 the current element in merged array is from ar1[] or ar2[].

 2) Consider the merged array and use the linear time algorithm to find
 the pair with sum closest to x. One extra thing we need to consider only
 those pairs which have one element from ar1[] and other from ar2[],
 we use the boolean array for this purpose.
 *
 *
 * IDEA :
 * The idea is to start from left side of one array and right side of another array,
 * and use the algorithm same as step 2 of above approach. Following is
 * detailed algorithm.
 *
 * Input:  ar1[] = {1, 4, 5, 7};
           ar2[] = {10, 20, 30, 40};
            x = 32
            Output:  1 and 30

    Input:  ar1[] = {1, 4, 5, 7};
    ar2[] = {10, 20, 30, 40};
    x = 50
    Output:  7 and 40
 *
 */
public class ClosestPairFromTwoSortedArrays {

    public static void main(String[] args) {

        ClosestPairFromTwoSortedArrays closestPairFromTwoSortedArrays = new ClosestPairFromTwoSortedArrays();
        int ar1[] = {1, 4, 5, 7};
        int ar2[] = {10, 20, 30, 40};
        int m = ar1.length;
        int n = ar2.length;
        int x = 38;
        closestPairFromTwoSortedArrays.printClosest(ar1, ar2, m, n, x);

    }

    // ar1[0..m-1] and ar2[0..n-1] are two given sorted
    // arrays/ and x is given number. This function prints
    // the pair from both arrays such that the sum of the
    // pair is closest to x.
    void printClosest(int ar1[], int ar2[], int m, int n, int x)
    {
        // Initialize the diff between pair sum and x.
        int diff = Integer.MAX_VALUE;

        // res_l and res_r are result indexes from ar1[] and ar2[]
        // respectively
        int res_l = 0, res_r = 0;

        // Start from left side of ar1[] and right side of ar2[]
        int l = 0, r = n-1;
        while (l<m && r>=0)
        {
            // If this pair is closer to x than the previously
            // found closest, then update res_l, res_r and diff
            System.out.println("Target : " +x);
            System.out.println("Math.abs(ar1[l] + ar2[r] - x : " +Math.abs(ar1[l] + ar2[r] - x));
            if (Math.abs(ar1[l] + ar2[r] - x) < diff)
            {
                res_l = l;
                res_r = r;
                diff = Math.abs(ar1[l] + ar2[r] - x);
            }
            System.out.println("res_l " +res_l+ " res_r " +res_r);
            // If sum of this pair is more than x, move to smaller
            // side
            if (ar1[l] + ar2[r] > x)
                r--;
            else  // move to the greater side
                l++;
        }

        // Print the result
        System.out.print("The closest pair is [" + ar1[res_l] +
                ", " + ar2[res_r] + "]");
    }

}
