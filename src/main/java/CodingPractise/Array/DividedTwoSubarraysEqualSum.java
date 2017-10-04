package CodingPractise.Array;

/**
 *
 * 0(n) and 0(n2)
 * --------------
 * http://www.geeksforgeeks.org/find-if-array-can-be-divided-into-two-subarrays-of-equal-sum/
 *
 *
 * Using DP :
 * ---------
 * We can create a 2D array part[][] of size (sum/2)*(n+1).
 * And we can construct the solution in bottom up manner such that every
 * filled entry has following property
 *
 * http://www.geeksforgeeks.org/dynamic-programming-set-18-partition-problem/
 *
 * QUESTION :
 *
 * Given an array of integers, find if it’s possible to remove exactly one integer
 * from the array that divides the array into two subarrays with the same sum.
 *
 */
public class DividedTwoSubarraysEqualSum {

    public static void main(String[] args) {

//        int arr[] = {6, 2, 3, 2, 1};
//        int arr[] = {2, 2, 2, 2, 2,-1,-1};
        int arr[] = {6, -1, 3, 2, 1};
//        int arr[] = {1,2,3,4}; // This code is not working for this input
        int n = arr.length;

        divideArray(arr, n); // This code not for int arr[] = {1,2,3,4};
        System.out.println("Can Partion " +canPartition(arr)); // This code not for int arr[] = {6, -1, 3, 2, 1};

    }


    static void printSubArray(int arr[], int start, int end)
    {
        System.out.print("[ ");
        for (int i = start; i <= end; i++)
            System.out.print(arr[i] +" ");
        System.out.print("] ");
    }

    // Function that divides the array into two subarrays
    // with the same sum
    static boolean divideArray(int arr[], int n)
    {
        // sum stores sum of all elements of the array
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += arr[i];

        // sum stores sum till previous index of the array
        int sum_so_far = 0;

        for (int i = 0; i < n; i++)
        {
            // If on removing arr[i], we get equals left
            // and right half
            if (2 * sum_so_far + arr[i] == sum)
            {
                System.out.print("The array can be divided into "
                        +"two subarrays with equal sum\nThe"
                        +" two subarrays are - ");
                printSubArray(arr, 0, i - 1);
                printSubArray(arr, i + 1, n - 1);

                return true;
            }
            // add current element to sum_so_far
            sum_so_far += arr[i];
        }

        // The array cannot be divided
        System.out.println("The array cannot be divided into two "
                +"subarrays with equal sum");

        return false;
    }


    public static boolean canPartition(int[] nums) {
        // check edge case
        if (nums == null || nums.length == 0) {
            return true;
        }
        // preprocess
        int volumn = 0;
        for (int num : nums) {
            volumn += num;
        }
        if (volumn % 2 != 0) {
            return false;
        }
        volumn /= 2;
        // dp def
        boolean[] dp = new boolean[volumn + 1];
        // dp init
        dp[0] = true;
        // dp transition
        for (int i = 1; i <= nums.length; i++) {
            for (int j = volumn; j >= nums[i-1]; j--) {
                dp[j] = dp[j] || dp[j - nums[i-1]];
            }
        }
        return dp[volumn];
    }


    public static boolean canPartition1(int[] nums) {
        int sum = 0;
        for(int num: nums) sum += num;
        if(sum % 2 == 1) return false;

        int target = sum / 2;
        boolean[][] dp = new boolean[nums.length][target + 1];
        // deal with the first row
        if(nums[0] <= target) dp[0][nums[0]] = true;

        // deal with the first col
        for(int i = 0; i < nums.length; i++) dp[i][0] = true;

        // deal with the rest
        for(int i = 1; i < dp.length; i++) {
            for(int j = 1; j < dp[0].length; j++) {
                if(j < nums[i]) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - nums[i]];
                }
            }
        }
        return dp[dp.length - 1][dp[0].length - 1];
    }


}
