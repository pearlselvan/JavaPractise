package CodingPractise.Array;

/**
 * Created by muthuselvan on 6/4/17.
 * http://www.geeksforgeeks.org/given-two-sorted-arrays-number-x-find-pair-whose-sum-closest-x/
 *
 * A Simple Solution is to run two loops.
 ========================================
 * The outer loop considers every element of first array and inner loop checks
 * for the pair in second array. We keep track of minimum difference between ar1[i] + ar2[j] and x.
 *
 * We can do it in O(n) time using following steps.
 * =================================================
 1) Merge given two arrays into an auxiliary array of size m+n using merge process of merge sort. While merging keep another boolean array of size m+n to indicate whether the current element in merged array is from ar1[] or ar2[].

 2) Consider the merged array and use the linear time algorithm to find the pair with sum closest to x. One extra thing we need to consider only those pairs which have one element from ar1[] and other from ar2[], we use the boolean array for this purpose.
 *
 *
 */
public class ClosestPairFromTwoSortedArrays {
}
