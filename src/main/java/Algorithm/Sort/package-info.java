/**
 * Created by muthuselvan on 6/6/17.
 * http://techieme.in/category/algorithms/sorting/
 *
 *
 */
package Algorithm.Sort;

/*
https://betterexplained.com/articles/sorting-algorithms/

Complexity :
=============

1 Bubble Sort [Best: O(n), Worst:O(N^2)]
2 Selection Sort [Best/Worst: O(N^2)]
3 Insertion Sort [Best: O(N), Worst:O(N^2)]
4 Quicksort [Best: O(N lg N), Avg: O(N lg N), Worst:O(N^2)]
5 Heapsort [Best/Avg/Worst: O(N lg N)]
6 Counting sort [Best/Avg/Worst: O(N)]
7 Radix sort [Best/Avg/Worst: O(N)]

High-level thoughts :
=====================

1. Some algorithms (selection, bubble, heapsort) work by moving elements to their final position, one at a time.
 You sort an array of size N, put 1 item in place, and continue sorting an array of size N – 1
 (heapsort is slightly different).

2. Some algorithms (insertion, quicksort, counting, radix) put items into a temporary position, close(r)
 to their final position. You rescan, moving items closer to the final position with each iteration.

 */

//What is the running time of Radix Sort?
//http://www.geeksforgeeks.org/radix-sort/


