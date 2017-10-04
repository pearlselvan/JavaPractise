package Algorithm.Sort;



/**
 * Created by muthuselvan on 2/6/17.
 * //http://www.sanfoundry.com/java-program-implement-heap-sort/
 * http://faculty.simpson.edu/lydia.sinapova/www/cmsc250/LN250_Weiss/L13-HeapSortEx.htm



Heapsort is a comparison-based sorting algorithm to create a sorted array
 (or list),
and is part of the selection sort family.
Although somewhat slower in practice on most machines
 than a well-implemented quicksort,
it has the advantage of a more favorable worst-case O(n log n) runtime.
Heapsort is an in-place algorithm, but it is not a stable sort.
Big-O
-------
Worst case performance : O(n log n)
Best case performance : O(n log n)
Average case performance : O(n log n)



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


HEPFY APPLYING ON NODE AND EACH ROOT
 NODE MUST BE GREATER THEN OR EQUAL ITS CHILDREN



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

//		int arr[] = {12, 11, 13, 5, 6, 7};
		int arr[] = {15, 19, 10, 7, 17, 16};
		int n = arr.length;

		HeapSort ob = new HeapSort();
		printArray(arr);
		ob.heapSort(arr);

		System.out.println("Sorted array is");
		printArray(arr);

	}

	// To heapify a subtree rooted with node i which is
	// an index in arr[]. n is size of heap

	// This will make child will less on root
	void heapify(int ARRAY[], int n, int current_root_index)
	{
		int current_root = current_root_index;  // Initialize largest as root
		int l = 2*current_root_index + 1;  // left = 2*i + 1
		int r = 2*current_root_index + 2;  // right = 2*i + 2

		printArray(ARRAY);
		System.out.println("==============================================================");
		System.out.println("current largest : ie ;;  i - " +current_root);

		try {
			System.out.println("current root " + ARRAY[current_root]);
			System.out.println("Left index : " + l + " for current largest " +current_root+  " or root  index " +current_root);
			System.out.println("Left Child " + ARRAY[l] +" for current largest , "+current_root+ " or root " + ARRAY[current_root]);
			System.out.println("Right index : " + r + " for current largest " +current_root+ " for root index " + current_root);
			System.out.println("Right Child " + ARRAY[r]+ " for current largest for root " + ARRAY[current_root]);


		} catch (ArrayIndexOutOfBoundsException e ) {
			System.out.println(e.getMessage());
		}
		// If left child is larger than root
		System.out.println("Swapping largest index " +current_root+ " with left index " +l+ " if left is greater then with root");

		// NOTE : for building max heapying just change the > ----> <
		if (l < n && ARRAY[l] > ARRAY[current_root]) {
			System.out.println("Compared root " +ARRAY[current_root]+" with left child " +ARRAY[l]);
			current_root = l;
			System.out.println("After swapped largest " +current_root);
		}
		// If right child is larger than largest so far
		// NOTE : for building max heapying just change the > ----> <
		System.out.println("Swapping largest index " +current_root+ " with right index " +l+ " if right is greater then with root");
		if (r < n && ARRAY[r] > ARRAY[current_root]) {
			System.out.println("Compared root " +ARRAY[current_root]+" with right child " +ARRAY[r]);
			current_root = r;
			System.out.println("After swapped largest " + current_root);
		}

		// If largest is not root // if largest is changed from the above
		if (current_root != current_root_index)
		{
			System.out.println("If largest is not root");
			int swap = ARRAY[current_root_index];
			ARRAY[current_root_index] = ARRAY[current_root];
			ARRAY[current_root] = swap;

			// Recursively heapify the affected sub-tree
			heapify(ARRAY, n, current_root);
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

	public void heapSort(int arr[])
	{
		int n = arr.length;

		// Build heap (rearrange array)
		for (int current_root_index = n / 2 - 1; current_root_index >= 0; current_root_index--) {
			System.out.println("Heapifying from index (i) : " +current_root_index);
			heapify(arr, n, current_root_index);
		}

		printArray(arr);

		System.out.println("========= Extracting =========");

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
