package CodingPractise;

/**
 * Created by muthuselvan on 6/21/17.
 * http://www.programcreek.com/2012/12/leetcode-median-of-two-sorted-arrays-java/
 *
 What is median ?
 ----------------
 Problem :
 ---------
 After reading 1st element of stream - 5 -> median - 5
 After reading 2nd element of stream - 5, 15 -> median - 10
 After reading 3rd element of stream - 5, 15, 1 -> median - 5
 After reading 4th element of stream - 5, 15, 1, 3 -> median - 4, so on..

 Solution :
 ----------
 Making it clear, when the input size is odd, we take the middle element of sorted data.
 If the input size is even, we pick average of middle two elements in sorted stream.

 *
 * There are two sorted arrays A and B of size m and n respectively.
 * Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 *
 * This problem can be converted to the problem of finding kth element, k is (A's length + B' Length)/2.
 *
 *
 *
 *
 *
 */
public class MedianofTwoSortedArray {
}
