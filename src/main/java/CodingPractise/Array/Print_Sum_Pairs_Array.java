package CodingPractise.Array;

/**
 * Created by muthuselvan on 9/6/17.
 */
import java.util.Arrays;
import java.util.HashMap;


//https://www.fitcoding.com/2014/03/05/find-pairs-that-equal-to-a-specific-sum-in-an-array/

class Print_Sum_Pairs_Array
{
    static int arr[] = new int[]{1, 5, 7, -1, 5} ;

    // Returns number of pairs in arr[0..n-1] with sum equal
    // to 'sum'
    static int getPairsCount(int n, int sum)
    {
        HashMap<Integer, Integer> hm = new HashMap<>();

        // Store counts of all elements in map hm
        for (int i=0; i<n; i++){

            // initializing value to 0, if key not found
            if(!hm.containsKey(arr[i]))
                hm.put(arr[i],0);

            hm.put(arr[i], hm.get(arr[i])+1);
        }

//        hm.forEach((k,v)-> System.out.println(k +":" +v));
        int twice_count = 0;

        // iterate through each element and increment the
        // count (Notice that every pair is counted twice)
        for (int i=0; i<n; i++)
        {
            if(hm.get(sum-arr[i]) != null)
                twice_count += hm.get(sum-arr[i]);

            // if (arr[i], arr[i]) pair satisfies the condition,
            // then we need to ensure that the count is
            // decreased by one such that the (arr[i], arr[i])
            // pair is not considered
            if (sum-arr[i] == arr[i])
                twice_count--;
        }

        hm.forEach((k,v)-> System.out.println(k +":" +v));


        // return the half of twice_count
        return twice_count/2;
    }


    //==================

    public static void printAllPairsEqualTo(int[] nFooBarArray, int nSum)
    {
        Arrays.sort(nFooBarArray);
        System.out.println("A" +Arrays.toString(nFooBarArray) +", target ; " +nSum );

        for (int i = nFooBarArray.length-1; i >= 0; --i)
        {
            int current_sum = nSum - nFooBarArray[i];
            System.out.println(nSum +" : Current index value : " +nFooBarArray[i]);
            System.out.println("Current Sum : " +current_sum);
            if (isInSortedArray(nFooBarArray, current_sum))
            {
                System.out.println("Pair Found: " + nFooBarArray[i] + " , " + (nSum - nFooBarArray[i]));
            }
        }
    }

    public static boolean isInSortedArray(int[] nFooBarArray, int nFindMe)
    {
        //index of the search key, if it is contained in the array; otherwise
//        http://www.geeksforgeeks.org/arrays-binarysearch-java-examples-set-1/
        if (Arrays.binarySearch(nFooBarArray, nFindMe) < 0)  // or you could use our own binary search from our previous post ;D
        {
            return false;
        }
        return true;
    }

    //==================

    // Driver method to test the above function
    public static void main(String[] args) {
        int sum = 6;
//        System.out.println("Count of pairs is " +
//                getPairsCount(arr.length,sum));
        printAllPairsEqualTo(arr,6); // This is working code @ https://www.fitcoding.com/2014/03/05/find-pairs-that-equal-to-a-specific-sum-in-an-array/

    }
}
