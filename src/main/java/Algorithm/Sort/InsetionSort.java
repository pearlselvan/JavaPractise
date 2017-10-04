package Algorithm.Sort;

/**
 * Created by muthuselvan on 2/20/17.
 *
 *
 * What is the real time use of insertion sort ? find median ?
 * Insertion Sort using it for finding median
 http://www.geeksforgeeks.org/median-of-stream-of-integers-running-integers/
 If we can sort the data as it appears, we can easily locate median element.
 Insertion Sort is one such online algorithm that sorts the data appeared so far.
 At any instance of sorting, say after sorting i-th element, the first i elements of array are sorted.
 The insertion sort doesn’t depend on future data to sort data input till that point. In other words,
 insertion sort considers data sorted so far while inserting next element. This is the key part of insertion sort that makes it an online algorithm.

 However, insertion sort takes O(n2) time to sort n elements. Perhaps we can use binary search on insertion sort
 to find location of next element in O(log n) time. Yet, we can’t do data movement in O(log n) time. No matter how efficient the implementation is, it takes polynomial time in case of insertion sort.
---------------------------
 *
 * Insertion sort is a simple sorting algorithm that builds the final sorted
 * array one item at a time. It is much less efficient on large lists
 * than more advanced algorithms such as quicksort, heapsort, or merge sort.
 * Every repetition of insertion sort removes an element from the input data,
 * inserting it into the correct position in the already-sorted list,
 * until no input elements remain. The choice of which element to remove
 * from the input is arbitrary, and can be made using almost any choice algorithm.
 * You can see the code implementation below: -
 * See more at: http://www.java2novice.com/java-interview-programs/insertion-sort/#sthash.G3Rjxch4.dpuf
 *
 * Animation Exaplanation :
 * https://www.khanacademy.org/computing/computer-science/algorithms/insertion-sort/a/insertion-sort
 */
public class InsetionSort {


    public static void main(String[] args) {
        InsetionSort insetionSort = new InsetionSort();
        int[] data = {10,4,5,7,8};
//        insetionSort.sort(data,data.length);

        insetionSort.sort(data);
        printArray(data);
    }


    void sort(int arr[])
    {
        int n = arr.length;
        for (int i=1; i<n; ++i)
        {
            int key = arr[i];
            int j = i-1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j>=0 && arr[j] < key)
            {
                arr[j+1] = arr[j]; // moving big number which is 0 th index to 0+1
                j = j-1;
            }
            arr[j+1] = key;
        }
    }


    /* A utility function to print array of size n*/
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }
//
//    public void sort(int[] data,int length) {
//
//        for (int i=1;i<data.length-1;i++) {
//
//            int value = data[i];
//            int key =  i ;
//
//
//            while (i>0 && data[key-1] > value) {
//                data[key] = data[key-1];
//                key-=1;
//                System.out.println("Key " +key);
//            }
//
//            data[key]=value;
//            System.out.println("Data : " +data[key]);
//
//
//
//
//
//        }

//    }


}
