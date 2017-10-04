package DataStructure;

/**
 * Created by muthuselvan on 2/6/17.
 * http://www.geeksforgeeks.org/merge-sort/
 *
 *
 * Merge Sort :  (divide-and-conquer)  O(n log(n))  :
 ————————————
 1. The divide step takes constant time, regardless of the subarray size

 Example of 8 numbers, we have 3 levels of sorting:
 * 4 list sorts when the list sizes are 2
 * 2 list sorts when the list sizes are 4
 * 1 list sort when the list size is 8
 *
 Now consider if I were to double the number of elements to 16: this would only require one more level of sorting. Hopefully your recognise this is a log n scale.

 However, on each level of sorting a total of n operations takes place (look at the red boxes in the diagram above).  this results in (n * log n) operations, e.g. O(n log n).

 Best use case :
 ————————————---
 Sorting linked list   :  http://www.geeksforgeeks.org/merge-sort-for-linked-list/


 Why MergeSort is preferred over QuickSort for Linked Lists?
 ===========================================================
 In case of linked lists the case is different mainly due to difference in memory allocation of arrays
 and linked lists. Unlike arrays, linked list nodes may not be adjacent in memory. Unlike array,
 in linked list, we can insert items in the middle in O(1) extra space and O(1) time.
 Therefore merge operation of merge sort can be implemented without extra space for linked lists.

 In arrays, we can do random access as elements are continuous in memory. Let us say we have an integer
 (4-byte) array A and let the address of A[0] be x then to access A[i], we can directly access the memory
 at (x + i*4). Unlike arrays, we can not do random access in linked list. Quick Sort requires a lot of
 this kind of access. In linked list to access i’th index, we have to travel each and every node from the head
 to i’th node as we don’t have continuous block of memory. Therefore, the overhead increases for quick sort.
 Merge sort accesses data sequentially and the need of random access is low.

 *
 */
public class MergeSort {
}
