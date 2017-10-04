package CodingPractise.Array;

/**
 * Created by muthuselvan on 6/1/17.
 * http://www.geeksforgeeks.org/equilibrium-index-of-an-array/
 *
 * Problem :
 * ===========
 *
 * i/P = [-7,1,5,2,-4,3,0]
 *
 * A[0] = -7, A[1] = 1, A[2] = 5, A[3] = 2, A[4] = -4, A[5] = 3, A[6]=0
 *
 * 3 is an equilibrium index, because:
 A[0] + A[1] + A[2] = A[4] + A[5] + A[6]

 6 is also an equilibrium index, because sum of zero
 elements is zero, i.e., A[0] + A[1] + A[2] + A[3] + A[4] + A[5]=0

 7 is not an equilibrium index, because it is not a
 valid index of array A.

 Question :
 ==========
 Write a function int equilibrium(int[] arr, int n); that given a
 sequence arr[] of size n,
 returns an equilibrium index (if any) or -1
 if no equilibrium indexes exist.


 Method 1 (Simple but inefficient)
 ================================
 Use two loops. Outer loop iterates through all the element
 and inner loop finds out whether the
 current index picked by the outer loop is equilibrium index or not.

 Time complexity of this solution is O(n^2).

 Method 2 (Tricky and Efficient)
 ================================

 The idea is to get total sum of array first.
 Then Iterate through the array and keep updating
 the left sum which is initialized as zero. In the loop, we can get right sum by subtracting
 the elements one by one.

 1) Initialize leftsum  as 0
 2) Get the total sum of the array as sum
 3) Iterate through the array and for each index i, do following.
 a)  Update sum to get the right sum.
 sum = sum - arr[i]
 // sum is now right sum
 b) If leftsum is equal to sum, then return current index.
 c) leftsum = leftsum + arr[i] // update leftsum for next iteration.
 4) return -1 // If we come out of loop without returning then
 // there is no equilibrium index

 Time Complexity: O(n)
 =====================


 *
 */
public class EquilibriumIndex_EqualPartion_Array_Index {
    public static void main(String[] args) {

        EquilibriumIndex_EqualPartion_Array_Index equi = new EquilibriumIndex_EqualPartion_Array_Index();
        int arr[] = {-7, 1, 5, 2, -4, 3, 0};
        int arr_size = arr.length;
        System.out.println("First equilibrium index is " +
                equi.equilibrium(arr, arr_size));

    }

    /*
    Time Complexity: O(n)
     =====================

     */
    int equilibrium(int arr[], int n)
    {
        int sum = 0;      // initialize sum of whole array
        int leftsum = 0; // initialize leftsum

        /* Find sum of the whole array */
        for (int i = 0; i < n; ++i)
            sum += arr[i];

        for (int i = 0; i < n; ++i)
        {
            sum -= arr[i]; // sum is now right sum for index i

            if (leftsum == sum)
                return i;

            leftsum += arr[i];
        }

        /* If no equilibrium index found, then return 0 */
        return -1;
    }

}
