package CodingPractise.Array;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by muthuselvan on 6/4/17.
 * http://www.geeksforgeeks.org/k-largestor-smallest-elements-in-an-array/
 *
 *
 * Question:
 * ========
 * Write an efficient program for printing k largest elements in an array.
 * Elements in array can be in any order.
 *
 * For example,
 * ============
 * if given array is [1, 23, 12, 9, 30, 2, 50] and
 * you are asked for the largest 3 elements i.e., k = 3
 * then your program should print 50, 30 and 23.
 *
 * K

 The 5-th smallest number is 3 (1, 2, 2, 3, 3).
 *
 * Using java SDK :
 * =================
 * http://www.programcreek.com/2014/05/leetcode-kth-largest-element-in-an-array-java/
 *
 *
 * Using max heap : Refer : HeapSort.java
 *
 *
 *
 */
public class KthLargest {

    public static void main(String[] args) {
//        int[] data = {10,20,30,40,50,99,97};
        int[] data = {11,120,130,40,50,99,97};


        Integer[] dataInt = {11,120,130,40,50,99,97};
        System.out.println("K th largest Using sorting : " +new KthLargest().findKthLargestUsingSorting(dataInt,2));
        System.out.println("K th largest : " +new KthLargest().findKthLargest(data,2));

    }

    public int findKthLargestUsingSorting(Integer[] arr, int k){

        int largest = 0;
        Arrays.sort(arr, Collections.reverseOrder());

        // Print the first kth largest elements
        for (int i = 0; i < k; i++) {
//            System.out.print(arr[i] + " ");
            largest = arr[i];
        }

        return largest;
}


    public int findKthLargest(int[] nums, int k) {
        if (k < 1 || nums == null) {
            return 0;
        }

        return getKth(nums.length - k +1, nums, 0, nums.length - 1);
    }

    public int getKth(int k, int[] nums, int start, int end) {

        int pivot = nums[end];

        int left = start;
        int right = end;

        while (true) {

            while (nums[left] < pivot && left < right) {
                left++;
            }

            while (nums[right] >= pivot && right > left) {
                right--;
            }

            if (left == right) {
                break;
            }

            swap(nums, left, right);
        }

        swap(nums, left, end);

        if (k == left + 1) {
            return pivot;
        } else if (k < left + 1) {
            return getKth(k, nums, start, left - 1);
        } else {
            return getKth(k, nums, left + 1, end);
        }
    }



    public void swap(int[] nums, int n1, int n2) {
        int tmp = nums[n1];
        nums[n1] = nums[n2];
        nums[n2] = tmp;
    }

}
