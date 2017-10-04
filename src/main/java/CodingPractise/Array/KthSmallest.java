package CodingPractise.Array;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by muthuselvan on 6/4/17.
 *
 * Question :
 * ===========
 * Given an array and a number k where k is smaller than size of array,
 * we need to find the k’th smallest element in the given array.
 * It is given that ll array elements are distinct.
 *
 *
 * Examples:
 * =========

 Input: arr[] = {7, 10, 4, 3, 20, 15}
 k = 3
 Output: 7

 Input: arr[] = {7, 10, 4, 3, 20, 15}
 k = 4
 Output: 10


 Method 1 (Simple Solution)
 ===========================
 A Simple Solution is to sort the given array using a O(nlogn)
 sorting algorithm like Merge Sort, Heap Sort, etc and return the element at index k-1
 in the sorted array.
 Time Complexity of this solution is O(nLogn)

  http://www.geeksforgeeks.org/kth-smallestlargest-element-unsorted-array/


 Method 2 (Using Min Heap – HeapSelect)
 =======================================
 We can find k’th smallest element in time complexity better than O(nLogn).
 A simple optomization is to create a Min Heap of the given n elements
 and call extractMin() k times.

 http://www.geeksforgeeks.org/kth-smallestlargest-element-unsorted-array/

 Method 3 (Using Max-Heap)
 ==========================
 We can also use Max Heap for finding the k’th smallest element. Following is algorithm.
 1) Build a Max-Heap MH of the first k elements (arr[0] to arr[k-1]) of the given array. O(k)

 2) For each element, after the k’th element (arr[k] to arr[n-1]), compare it with root of MH.
 ……a) If the element is less than the root then make it root and call heapify for MH
 ……b) Else ignore it.
 // The step 2 is O((n-k)*logk)

 3) Finally, root of the MH is the kth smallest element.

 Time complexity of this solution is O(k + (n-k)*Logk)

 Method 4 (QuickSelect)
 ========================
 This is an optimization over method 1 if QuickSort is used as a sorting algorithm in first step.
 In QuickSort, we pick a pivot element, then move the pivot element to its correct position
 and partition the array around it. The idea is, not to do complete quicksort,
 but stop at the point where pivot itself is k’th smallest element.
 Also, not to recur for both left and right sides of pivot,
 but recur for one of them according to the position of pivot.
 The worst case time complexity of this method is O(n2), but it works in O(n) on average.


 Question may ask : https://leetcode.com/problems/kth-smallest-number-in-multiplication-table/description/
 * Input: m = 3, n = 3, k = 5
 Output:
 Explanation:
 The Multiplication Table:
 1	2	3
 2	4	6
 3	6	9


 Pre- request :
 ===============
 * http://www.geeksforgeeks.org/kth-smallestlargest-element-unsorted-array/
 * http://www.geeksforgeeks.org/kth-smallestlargest-element-unsorted-array-set-2-expected-linear-time/
 * http://algorithms.tutorialhorizon.com/find-kth-smallest-or-largest-element-in-an-array/
 *
 *
 * Using min heap : Refer : HeapSort.java
 *
 */
public class KthSmallest {

    public static void main(String[] args) {
        KthSmallest kthSmallest = new KthSmallest();
        Integer[] dataInt = {11,120,130,40,50,99,97};
        System.out.println("K th largest : " +kthSmallest.findKthSmallesttUsingSorting(dataInt,2));
    }


    public int findKthSmallesttUsingSorting(Integer[] arr, int k){
        int largest = 0;
        Arrays.sort(arr);
        // Print the first kth largest elements
        for (int i = 0; i < k; i++) {
//            System.out.print(arr[i] + " ");
            largest = arr[i];
        }

        return largest;
    }

}
