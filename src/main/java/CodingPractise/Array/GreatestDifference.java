package CodingPractise.Array;

import java.util.Arrays;

/**
 * Created by muthuselvan on 3/31/17.
 */
public class GreatestDifference {

    /*
    For example, if our input is [5,8,6,1],
    the greatest difference we can get is 8-1, which is 7. So we should return 7.
     */

    public static void main(String[] args) {
        int[] array = {5,8,6,1};
        System.out.println("Max 1: " +new GreatestDifference().greatestDiff(array));
        System.out.println("Max  2: " +new GreatestDifference().greatestDiffBetter(array));
        System.out.println("Max  3: " +new GreatestDifference().greatestDiffBest(array));

    }

    //“order of n²” or O(n²)!
    public int greatestDiff(int[] data) {
        int currentMax=0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 1; j < data.length; j++) {
                int max = data[j] - data[i] ;

                if (max > currentMax) {
                currentMax = max;
                }



            }
//            System.out.println("Max : " +currentMax);

        }
        return currentMax;
    }
  //It turns out that in general sorting costs O(n * log2(n)) time
    //0(n)
    public int greatestDiffBetter(int[] data) {
        Arrays.sort(data);
        int diff = data[data.length-1] - data[0];
        return diff;

    }


    //This method is also O(n) time complexity solution, but it requires O(n) extra space
    //Time Complexity: O(n)
    //Auxiliary Space: O(n)
    // below method : maxDiffwithOoneExtracSpance as o(1)

    int maxDiff(int arr[], int n)
    {
        // Create a diff array of size n-1. The array will hold
        //  the difference of adjacent elements
        int diff[] = new int[n - 1];
        for (int i = 0; i < n - 1; i++)
            diff[i] = arr[i + 1] - arr[i];

        // Now find the maximum sum subarray in diff array
        int max_diff = diff[0];
        for (int i = 1; i < n - 1; i++)
        {
            if (diff[i - 1] > 0)
                diff[i] += diff[i - 1];
            if (max_diff < diff[i])
                max_diff = diff[i];
        }
        return max_diff;
    }

   //http://www.geeksforgeeks.org/maximum-difference-between-two-elements/ check last
   //Time Complexity: O(n)
   //Auxiliary Space: O(1)
    int maxDiffwithOoneExtracSpance (int arr[], int n)
    {
        // Initialize diff, current sum and max sum
        int diff = arr[1]-arr[0];
        int curr_sum = diff;
        int max_sum = curr_sum;

        for(int i=1; i<n-1; i++)
        {
            // Calculate current diff
            diff = arr[i+1]-arr[i];

            // Calculate current sum
            if (curr_sum > 0)
                curr_sum += diff;
            else
                curr_sum = diff;

            // Update max sum, if needed
            if (curr_sum > max_sum)
                max_sum = curr_sum;
        }

        return max_sum;
    }


    public int greatestDiffBest(int[] data) {
        int max=data[0];
        int min = data[0] ;

        for (int i=1;i<data.length;i++) {

            if (max < data[i]) {
                max= data[i];
            } else if (min > data[i]) {
                min=data[i];
            }
        }
        System.out.println("Max : " +max);
        System.out.println("Min : " +min);

      return max-min;

    }




    }

