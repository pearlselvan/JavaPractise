package CodingPractise.Array;

import java.util.Arrays;

/**
 * Created by muthuselvan on 6/6/17.
 * http://www.geeksforgeeks.org/check-if-array-elements-are-consecutive/
 *
 * Given an unsorted array of numbers, write a function that returns true
 * if array consists of consecutive numbers.

 Examples:
 ========
 a) If array is {5, 2, 3, 1, 4}, then the function should return true
 because the array has consecutive numbers from 1 to 5.

 b) If array is {83, 78, 80, 81, 79, 82}, then the function should
 return true because the array has consecutive numbers from 78 to 83.

 c) If the array is {34, 23, 52, 12, 3 }, then the function should return false
 because the elements are not consecutive.

 d) If the array is {7, 6, 5, 5, 3, 4}, then the function should return false because
 5 and 5 are not consecutive.


 Method 1 (Use Sorting)
 =======================
 1) Sort all the elements.
 2) Do a linear scan of the sorted array. If the difference between current element and next element is anything other than 1, then return false. If all differences are 1, then return true.

 Time Complexity:
 ================
 O(nLogn)

 Method 2 (Use visited array)
 =============================
 The idea is to check for following two conditions. If following two conditions are true, then return true.

 1) max – min + 1 = n where max is the maximum element (5 for : 5, 2, 3, 1, 4 ) in array, min is minimum element (1 for : 5, 2, 3, 1, 4 ) in array and n is the number of elements in array.
      5-1+1 = 5
 2) All elements are distinct.

 To check if all elements are distinct, we can create a visited[] array of size n.
 We can map the ith element of input array arr[] to visited array by using arr[i] – min as index in visited[].

  Time :
 =======
 Time Complexity: O(n) and Extra Space: O(n)






 *
 */
public class ConsecutiveArray {

    public static void main(String[] args) {

        ConsecutiveArray consecutive = new ConsecutiveArray();
        int arr[] = {5, 4, 2, 3, 1, 6};
        int n = arr.length;
        if (consecutive.areConsecutive(arr, n) == true)
            System.out.println("Array elements are consecutive");
        else
            System.out.println("Array elements are not consecutive");


    }


    boolean areConsecutive(int arr[], int n)
    {
        if (n < 1)
            return false;

        /* 1) Get the minimum element in array */
        int min = getMin(arr, n);

        /* 2) Get the maximum element in array */
        int max = getMax(arr, n);

        /* 3) max-min+1 is equal to n then only check all elements */
        if (max - min + 1 == n)
        {
            int i;
            for (i = 0; i < n; i++)
            {
                int j;

                if (arr[i] < 0)
                    j = -arr[i] - min;
                else
                    j = arr[i] - min;

                // if the value at index j is negative then
                // there is repitition
                if (arr[j] > 0)
                    arr[j] = -arr[j];
                else
                    return false;
            }
            System.out.println(Arrays.toString(arr));
            /* If we do not see a negative value then all elements
               are distinct */
            return true;
        }

        return false; // if (max-min+1 != n)
    }

    /* UTILITY FUNCTIONS */
    int getMin(int arr[], int n)
    {
        int min = arr[0];
        for (int i = 1; i < n; i++)
        {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }

    int getMax(int arr[], int n)
    {
        int max = arr[0];
        for (int i = 1; i < n; i++)
        {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }
}
