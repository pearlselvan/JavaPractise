package CodingPractise.General;

import java.util.Arrays;

/**
 * Created by muthuselvan on 7/26/17.
 *
 * [ 1,2,0,4,0,0,5] => [1,2,4,5,0,0,0] => moving all zero at end and maintaining rest element order  same postion
 *
 */
public class AppleArray {

    public static void main(String[] args) {
        int[] data = {1,2,0,4,0,0,5};
        System.out.println(Arrays.toString(data));
        Arrays.sort(data);
        System.out.println(Arrays.toString(data));
        int mid = ( data.length -1 ) / 2 ;
        System.out.println("Mid >> : " +mid);

        int itr = 0;
        int count = 0 ;
        if (data[mid] != 0) {
            while (itr < mid) {
                System.out.println("Itr : " +itr);
                if (data[itr] == 0 ) {
                    count++;
                }
                itr++;
            }
        }
        System.out.println("Count of Zreo " +count);
        int[] result = new int[data.length];
        System.out.println(Arrays.toString(result));
        int arr[] = {1, 0, 1, 0, 1, 1, 1};
//        int arr[] = {1, 0, 1, 0, 1, 0, 0};
        int n = arr.length;
        Arrays.sort(arr);
        System.out.println("Count of zeroes is " + countZeroes(arr, n));
    }


    static int countbinary(int[] data,int start,int end) {

        int mid = ( data.length -1 ) / 2 ;
        int itr = 0;
        int count = 0 ;


        while (start<end){

            if  ((mid !=0) || data [start] == 0) {
                count++;
            }  else {


            }

            start++;


        }

        return 10;




    }


    public static int getnonZero(int[] data) {
        for (int number : data) {

        }
        return 1;

    }


    /*
    Input: arr[] = {1, 1, 1, 1, 0, 0}
    Output: 2

    Input: arr[] = {1, 0, 0, 0, 0}
    Output: 4

    Input: arr[] = {0, 0, 0}
    Output: 3

    Input: arr[] = {1, 1, 1, 1}
    Output: 0
     */

    public static int findZero(int[] arr,int low,int high) {
        if (high >= low)
        {
            // Check if mid element is first 0
            int mid = low + (high - low) / 2;
            if ((mid == 0 || arr[mid - 1] == 1) && arr[mid] == 0)
                return mid;

            if (arr[mid] == 1) // If mid element is not 0
                return findZero(arr, (mid + 1), high);
            else // If mid element is 0, but not first 0
                return findZero(arr, low, (mid - 1));
        }
        return -1;


    }



    static int countZeroes(int arr[], int n)
    {
        // Find index of first zero in given array
        int first = findZero(arr, 0, n - 1);
        // If 0 is not present at all, return 0
        if (first == -1)
            return 0;

        return (n - first);
    }
}
