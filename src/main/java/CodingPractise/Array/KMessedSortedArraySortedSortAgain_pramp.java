package CodingPractise.Array;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * Created by muthuselvan on 9/26/17.

 */
public class KMessedSortedArraySortedSortAgain_pramp {

    public static void main(String[] args) {

//        int[] arr = {2,0,4,1,5,3,8,9,6,7};
//        int[] arr = {2,0,4,1,5,3,8,9,6,7};
        int[] arr = {1, 4, 5, 2, 3, 7, 8, 6, 10, 9};

        System.out.println("Sorted " +Arrays.toString(insertionSort(arr,arr.length-1,2)));

        System.out.println("Using heap");
        usingHeap(arr,2);

    }

    //Create a Min Heap of size k+1 with first k+1 elements. This will take O(k) time
    // Add first k element in min heap // constrcuting min heap o(n) time
    // arr : 2,0,4,1,5,3,8,9,6,7 (
    // min heap : 0 ,2
    // LOOP --START
    // Extract min from heap , why we are extracting min from heap ?
    // because lets say k=4 , finally element come at index = 0 th position will be in o to k th position
    // not beyond that
    // Extract min heap , that removing min element from min heap
    // insert the next element k+1 to min heap
    // LOOP --END
    // over all TC : Removing an element and adding a new element to min heap will take Logk time.
    // So overall complexity will be O(k) + O((n-k)*logK) ..you can tell : o (log k ) and spance : o(k)
//    http://www.geeksforgeeks.org/nearly-sorted-algorithm/


    public static void usingHeap(int [] arr , int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(k+1);
        for(int i=0; i<=k && i<arr.length; i++)
            queue.add(arr[i]);
        System.out.println(queue);

        //// If there are remaining elements, then place root
        // of heap at target index and add arr[i]
        // to Min Heap
        for(int i = k+1, ti = 0; ti < arr.length; i++, ti++){

            if(i < arr.length){
                int root = queue.poll();
                arr[ti] = root;
                queue.add(arr[i]);
            }

            // Otherwise place root at its target index and reduce heap size
            else{
                int root = queue.poll();
                arr[ti] = root;
            }

        } // End for
        System.out.println("Finally "  +Arrays.toString(arr));



    }


    //    Time Complexity : O(nk) , this will work only for small element .
    // for big element that k < n if k > n then insertion sort will not work
    private static int[] insertionSort(int[] arr, int size, int key) {
        int j = 0;
        for(int i = 1; i < size; ++i) {
            key = arr[i];
            j = i-1; // j is previous pointer
            System.out.println("Key: " +key +" - i: " +i+ " - j: " +j+ " - arr[j] : " +arr[j]);
            while(j >= 0 && arr[j] > key) { // key is used for current
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;

        }
        return arr;
    }

}
