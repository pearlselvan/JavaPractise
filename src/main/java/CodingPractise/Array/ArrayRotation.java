package CodingPractise.Array;

/**
 * Created by muthuselvan on 6/4/17.
 *
 * REFER ALSO : RotateKTimes.java
 * =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
 *
 *
 * Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.
 *
 * Example :
 * I/P : 1->2->3->4->5->6->7
 *
 * O/P : 6->7->1->2->3->4->5->6
 *
 * METHOD 1 (Use temp array)
 * =========================
 *
 * STEPS :
 * ========

    Input arr[] = [1, 2, 3, 4, 5, 6, 7], d = 2, n =7
    1) Store d elements in a temp array
    temp[] = [1, 2]
    2) Shift rest of the arr[]
    arr[] = [3, 4, 5, 6, 7, 6, 7]
    3) Store back the d elements
    arr[] = [3, 4, 5, 6, 7, 1, 2]
 Big(0) :
 ========
    Time complexity O(n)
    Auxiliary Space: O(d) ---temp array

 METHOD 2 (Rotate one by one)
 =============================
 leftRotate(arr[], d, n)
 start
 For i = 0 to i < d
 Left rotate all elements of arr[] by one
 end

  Impl :
  ========
 To rotate by one, store arr[0] in a temporary variable temp,
 move arr[1] to arr[0], arr[2] to arr[1] …and finally temp to arr[n-1]

 Let us take the same example arr[] = [1, 2, 3, 4, 5, 6, 7], d = 2
 Rotate arr[] by one 2 times
 We get [2, 3, 4, 5, 6, 7, 1] after first rotation and [ 3, 4, 5, 6, 7, 1, 2] after second rotation.

  Big (0)
 ==========
 Time complexity: O(n*d)
 Auxiliary Space: O(1)


 METHOD 3 (A Juggling Algorithm)  ----Don't tell this interviewer ..initially
 ===============================

 This is an extension of method 2. Instead of moving one by one, divide the array in different sets
 where number of sets is equal to GCD of n and d and move the elements within sets.
 If GCD is 1 as is for the above example array (n = 7 and d =2),
 then elements will be moved within one set only, we just start with temp = arr[0]
 and keep moving arr[I+d] to arr[I] and finally store temp at the right place.

 Here is an example for n =12 and d = 3. GCD is 3 and

 Refer for diagram : http://www.geeksforgeeks.org/array-rotation/


 REFER ALSO : RotateKTimes.java


 EASY TO UNDERSTAND :
 =====================

 public void rotate(int[] nums, int k) {
 k %= nums.length;
 reverse(nums, 0, nums.length - 1);
 reverse(nums, 0, k - 1);
 reverse(nums, k, nums.length - 1);
 }

 public void reverse(int[] nums, int start, int end) {
 while (start < end) {
 int temp = nums[start];
 nums[start] = nums[end];
 nums[end] = temp;
 start++;
 end--;
 }
 }




 */

//The below code in method 2 :
public class ArrayRotation {
    // Driver program to test above functions
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        leftRotate(arr, 2, 7); // move 2 times , for size : 7
        printArray(arr, 7);
    }
    /*Function to left rotate arr[] of size n by d*/
    static void leftRotate(int arr[], int d, int n)
    {
        int i;
        for (i = 0; i < d; i++)
            leftRotatebyOne(arr, n);
    }
        static void leftRotatebyOne(int arr[], int n)
        {
            int i, temp;
            temp = arr[0];
            for (i = 0; i < n - 1; i++)
                arr[i] = arr[i + 1];
            arr[i] = temp;
        }
    /* utility function to print an array */
    static void printArray(int arr[], int size)
    {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
    }
}
