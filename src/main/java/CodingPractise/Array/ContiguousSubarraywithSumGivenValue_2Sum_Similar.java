package CodingPractise.Array;

/**
 * Created by muthuselvan on 6/7/17.
 * http://algorithms.tutorialhorizon.com/in-an-array-find-the-subarray-with-sum-to-a-given-value/
 */
public class ContiguousSubarraywithSumGivenValue_2Sum_Similar {

    public static void main(String[] args) {
        int[] arrA = { 2,5,6,8};
//        int[] arrA = { 25, 12, 14, 15, 16, 15, 10, 23 };
//        int[] arrA = { 1, -11, -12,3,23};
        int Sum = 10;
        ContiguousSubarraywithSumGivenValue_2Sum_Similar i = new ContiguousSubarraywithSumGivenValue_2Sum_Similar();
//        i.findSubArray(arrA, Sum);
//        System.out.println("Boolean flag : " +i.findSubArrayReturnBoolean(arrA, Sum));
        System.out.println("Boolean flag >> : " +i.subArraySum(arrA, arrA.length,Sum));

    }


    static int subArraySum(int arr[], int n, int sum)
    {
        int curr_sum = arr[0], start = 0, i;

        // Pick a starting point
        for (i = 1; i <= n; i++)
        {
            // If curr_sum exceeds the sum, then remove the starting elements
            while (curr_sum > sum && start < i-1)
            {
                curr_sum = curr_sum - arr[start];
                start++;
            }

            // If curr_sum becomes equal to sum, then return true
            if (curr_sum == sum)
            {
                int p = i-1;
                System.out.println("Sum found between indexes " + start
                        + " and " + p);
                return 1;
            }

            // Add this element to curr_sum
            if (i < n)
                curr_sum = curr_sum + arr[i];

        }

        System.out.println("No subarray found");
        return 0;
    }

    public boolean findSubArrayReturnBoolean(int[] arrA, int Sum) {
        int currSum = 0;
        int start = 0;
        for (int i = 0; i <arrA.length; i++) {
            System.out.println("Index : " +i+ " - values : " +arrA[i]);

            System.out.println("Target : " +Sum);

            while (currSum > Sum && start < i-1) {
                System.out.println("Current Sum : " +currSum);
                // System.out.println(currSum + " reducing");

                currSum = currSum - arrA[start++];
                // System.out.println(currSum + " reduced");
            }
//            System.out.println(currSum);
            if (currSum == Sum) {
                System.out.println(Sum + " is found between indexes " + start
                        + " and " + (i - 1));
                // print the exact elements
//                System.out.print("And Elements are : ");
                // Un comment the below line if you want to print the array values
//                for (int j = start; j <= i - 1; j++) {
//                    System.out.print(" " + arrA[j]);
//                }
                return true;
            } //End if
            System.out.println("Current index : " +i);
            if (i <= arrA.length)
                currSum = currSum + arrA[i];
             System.out.println("Current Sum " +currSum);

        } // for ends here
        System.out.println("No subarray is found with sum equals to " + Sum);
        return false;
        // if we have reached that means that we have not found the subarray
        // with summation equals to Sum

    }


    public void findSubArray(int[] arrA, int Sum) {
        int currSum = 0;
        int start = 0;
        for (int i = 0; i <= arrA.length; i++) {
            System.out.println("C" +currSum);
            System.out.println("S" +Sum);

            while (currSum > Sum) {
                // System.out.println(currSum + " reducing");
                currSum = currSum - arrA[start++];
                // System.out.println(currSum + " reduced");
            }
            System.out.println(currSum);
            if (currSum == Sum) {
                System.out.println(Sum + " is found between indexes " + start
                        + " and " + (i - 1));
                // print the exact elements
                System.out.print("And Elements are : ");
                for (int j = start; j <= i - 1; j++) {
                    System.out.print(" " + arrA[j]);
                }
                return;
            }
            if (i < arrA.length)
                currSum = currSum + arrA[i];
            // System.out.println(currSum);
        }

        // if we have reached that means that we have not found the subarray
        // with summation equals to Sum
        System.out.println("No subarray is found with sum equals to " + Sum);
    }





}
