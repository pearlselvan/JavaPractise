package DataStructure;

/**
 * Created by muthuselvan on 2/6/17.
 * //http://www.sanfoundry.com/java-program-implement-heap-sort/
 */

/*
Heapsort is a comparison-based sorting algorithm to create a sorted array (or list),
and is part of the selection sort family.
Although somewhat slower in practice on most machines than a well-implemented quicksort,
it has the advantage of a more favorable worst-case O(n log n) runtime.
Heapsort is an in-place algorithm, but it is not a stable sort.
Big-O
-------
Worst case performance : O(n log n)
Best case performance : O(n log n)
Average case performance : O(n log n)
*/

/*
Implementation :
------------------
Heap Sort Algorithm for sorting in increasing order:

1. Build a max heap from the input data.
2. At this point, the largest item is stored
at the root of the heap. Replace it with the last item
of the heap followed by reducing the size of heap by 1.
Finally, heapify the root of tree.
3. Repeat above steps while size of heap is greater than 1.

How to build the heap?

Heapify procedure can be applied to a node only
if its children nodes are heapified.
So the heapification must be performed in the bottom up order.


 */

/*

Input data: 4, 10, 3, 5, 1
---------------------------

         4(0)
		/   \
	10(1)   3(2)
      /      \
    5(3)    1(4)

The numbers in bracket represent the indices in the array
representation of data.

Applying heapify procedure to index 1:
(NOTE : Heapify procedure can be applied to a node only
Prerequest : if its children nodes are heapified.
Order : So the heapification must be performed in the bottom up order.)
 		 4(0)
		/   \
   10(1)    3(2)
      /      \
	5(3)    1(4)

Applying heapify procedure to index 0:

	    10(0)
		/  \
	 5(1)  3(2)
      /    \
   4(3)    1(4)

The heapify procedure calls itself recursively
to build heap in top down manner.


 */


public class HeapSort {

    public static void main(String[] args) {

        int arr[] = {12, 11, 13, 5, 6, 7};
        int n = arr.length;

        HeapSort ob = new HeapSort();
        ob.sort(arr);

        System.out.println("Sorted array is");
        printArray(arr);

    }

    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    void heapify(int arr[], int n, int i)
    {
        int largest = i;  // Initialize largest as root
        int l = 2*i + 1;  // left = 2*i + 1
        int r = 2*i + 2;  // right = 2*i + 2

        // If left child is larger than root
        if (l < n && arr[l] > arr[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest])
            largest = r;

        // If largest is not root
        if (largest != i)
        {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

    /* A utility function to print array of size n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    public void sort(int arr[])
    {
        int n = arr.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // One by one extract an element from heap
        for (int i=n-1; i>=0; i--)
        {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }



}


