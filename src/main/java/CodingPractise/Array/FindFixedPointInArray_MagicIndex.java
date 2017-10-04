package CodingPractise.Array;

/**
 * Created by muthuselvan on 9/6/17.
 * http://algorithms.tutorialhorizon.com/magic-index-find-index-in-sorted-array-such-that-ai-i/
 *
 * Refer  : FindMagicIndexA_of_i_IS_i_Book_346.java
 */
public class FindFixedPointInArray_MagicIndex {

    public static void main(String[] args) {

        int arr[] = {-10, -1, 0, 3 , 4, 11, 30, 50, 100};
        int n = arr.length;
        System.out.println("Fixed Point is "
                + binarySearch(arr,0, n-1));

    }

    static int binarySearch(int arr[], int low, int high)
    {
        if(high >= low)
        {
            /* low + (high - low)/2; */
            int mid = (low + high)/2;
            if(mid == arr[mid])
                return mid;
            if(mid > arr[mid])
                return binarySearch(arr, (mid + 1), high);
            else
                return binarySearch(arr, low, (mid -1));
        }

        /* Return -1 if there is
           no Fixed Point */
        return -1;
    }
}
