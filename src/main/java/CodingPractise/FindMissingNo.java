package CodingPractise;

/**
 * Created by muthuselvan on 2/7/17.
 */
public class FindMissingNo {

    public static void main(String[] args) {
        System.out.println(10^11^11);

        // if you know max of array element in array
        int[] a = {1,2,4,5};
//        int[] a = {1,2,4,5};
//        int[] a = {0,1,3};
        int sumOfNnumbers = sumOfN(maxinArray(a));

        //Step 2
        int sumOfElements = sumOfElements(a);

        System.out.println("sumOfElements " +sumOfElements);
        System.out.println("sumOfNnumbers " +sumOfNnumbers);
        int missingNumber = sumOfNnumbers - sumOfElements;
        System.out.println("Missing Number is = "+missingNumber);
        System.out.println("Max : " +maxinArray(a));
        System.out.println("Using Bit is not working  >>>> " +missingNumberUsingBit(a));


        //Pretty simple since we are told that we are missing only one number in [1,n], we just need to look
        // at the difference between the sum([1,n]) = n * (n+1) / 2 and the sum of nums in our array.

        /* Simple code :
        public int missingNumber(int[] nums) {
        int sum = 0;
        for(int num: nums)
            sum += num;

        return (nums.length * (nums.length + 1) )/ 2 - sum;
    }
         */


    }

 //https://leetcode.com/problems/missing-number/description/
    /*
    The basic idea is to use XOR operation. We all know that a^b^b =a, which means
     two xor operations with the same number will eliminate the number and reveal the original number.
In this solution, I apply XOR operation to both the index and value of the array.
In a complete array with no missing numbers, the index and value should be perfectly
corresponding( nums[index] = index), so in a missing array, what left finally is the missing number.
     */
    public static int missingNumberUsingBit(int[] nums) {

        int xor = 0, i = 0;
        for (i = 0; i < nums.length; i++) {
            xor = xor ^ i ^ nums[i];
            System.out.println("M :" +xor);
        }

        return xor ^ i;
    }

    public static int maxinArray(int[] a) {
        int max = a[0];

        for (int i=0;i<=a.length-1;i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Max : " +max);
        return max;

    }

    public static int sumOfN(int n) {
        int sum = (n * (n+1))/ 2;
        return sum;
    }

    static int sumOfElements(int[] array)
    {
        int sum = 0;
        for (int i = 0; i < array.length; i++)
        {
            sum = sum + array[i];
        }
        return sum;
    }

}


