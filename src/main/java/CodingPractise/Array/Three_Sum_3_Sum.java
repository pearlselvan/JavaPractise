package CodingPractise.Array;

import java.util.*;

/**
 * Created by muthuselvan on 9/6/17.
 *
 *
 *
 * APPROCHES :
 * http://algorithms.tutorialhorizon.com/find-three-elements-in-an-array-that-sum-to-a-zero/
 *
 *
 * //code from :
 * http://www.lifeincode.net/programming/leetcode-two-sum-3-sum-3-sum-closest-and-4-sum-java/
 *
 * http://www.geeksforgeeks.org/find-a-triplet-that-sum-to-a-given-value/
 *
 * 3 Sum for zero : http://buttercola.blogspot.com/2014/07/leetcode-3sum.html
 *
 * function getTarget(inputArray, target) {
 const n = inputArray.length;

 inputArray.sort((a, b) => a - b);

 const output = [];
 for (let i = 0; i < n - 2; i++) {
 const compliment = target - inputArray[i]; // 11
 let left = i + 1; // l=1
 let right = n - 1; // r=5

 while (left < right) { //4 < 5 , 3,5,
 const sum = inputArray[left] + inputArray[right]; //5+6 = 11
 if (sum === compliment) {
 output.push([inputArray[i], inputArray[left], inputArray[right]]); // [1,5,6]
 }

 if (sum < compliment) { // 10< 11
 left += 1;// l=4
 } else { // sum > compliment because we checked "===" case above
 right -= 1;
 }
 }  //
 }

 return output;
 }

 console.log(getTarget([2, 4, 1, 5, 3, 6], 15));

 *
 */
public class Three_Sum_3_Sum {

    public static void main(String[] args) {

//        System.out.println(Arrays.toString(new int[]{-1, 0, 1, 2, -1, -4}));
//           int[] data = {-1, 0, 1, 2, 2, -4};
//           int[] data = {1,1,2,1,9,4};
           int[] data = {1,2,-5, 4, 6,-8, 3, 7, 9};
//           int[] data = {1,1,2,0,0,4};
//           int[] data = {-2,2,0,0,-4,4}; //Duplicate values
//        int[] data = {-2,2,2,0,2,4}; // This TC will fail for negative
        int targetSum = -7;
//        System.out.println(" - Using BF " +new Three_Sum_3_Sum().find3NumbersWorstBruit(data,data.length-1,targetSum));
           //callng threeSum :
//           threeSum(data,targetSum).forEach(out-> System.out.println("3 Sum " +out));


//        threeSumHashMap(data).forEach(out-> System.out.println("3 Sum Hash Map for find target is zero" +out));
//        threeSumUsingSorting(data,targetSum).forEach(out-> System.out.println("3 Sum Using sorting : " +out));

   //http://www.byte-by-byte.com/threesum/


        ArrayList<int[]> threesumreturn = threeSumByteByteSolution(data,targetSum);
        System.out.println("size : " +threesumreturn.get(0).length);
        System.out.println(threesumreturn.get(0)[0]);
        System.out.println(threesumreturn.get(0)[1]);
        System.out.println(threesumreturn.get(0)[2]);

//        isSpecialSubstring('abcdefg', 'abc') => true
        //isSpecialSubstring('abcdefg', 'acb') => false;

//        System.out.println("CONTAINS : " +"abcdefg".contains("acb"));


    }


    // returns true if there is triplet with sum equal
    // to 'sum' present in A[]. Also, prints the triplet
    boolean  find3NumbersWorstBruit(int A[], int arr_size, int sum)
    {
        int l, r;

        // Fix the first element as A[i]
        for (int i = 0; i < arr_size - 2; i++)
        {
            // Fix the second element as A[j]
            for (int j = i + 1; j < arr_size - 1; j++)
            {
                // Now look for the third number
                for (int k = j + 1; k < arr_size; k++)
                {
                    if (A[i] + A[j] + A[k] == sum)
                    {
                        System.out.print("Triplet is " + A[i] + " ," + A[j]
                                + " ," + A[k]);
                        return true;
                    }
                }
            }
        }

        // If we reach here, then no triplet was found
        return false;
    }


 //http://www.byte-by-byte.com/threesum/
    // iterating the loop
    // Go to the index 0
    // then search  for any 2 numbers that will add up and give the target
    // Example : { -4 , -1,-1,0,1,2}  => go to index[0]=-4 then sum up two number that will give target
    // Logic or thought process : is How to search the remaing two values
    // so create two pointer : one is frond ( start in below next to curent index and end will be last in array )
    // Example : { -4 , -1,-1,0,1,2}
    //              ^    ^        ^
    //then sum the element and check if target is reached  ( in beloe code : arr[i] + arr[start] + arr[end])
    // if sum of the number is too small then we need crease the sum by incrementing start pointer  ( in code : if (arr[i] + arr[start] + arr[end] < target) {)
    // flip side : if sum of the numer is big the decrement the end pointer )
    // in this possible compination we can able to find the sum of number which makes the target
    // NOTE : we need take care removing or avoiding dulicates , so increment the pointer until values get changed ( in code : if (i == 0 || arr[i] > arr[i - 1]) {)

    public static ArrayList<int[]> threeSumByteByteSolution(int[] arr,int target) {
        System.out.println("Byte Byte : ");
        ArrayList<int[]> results = new ArrayList<int[]>();
        System.out.println("Org unsorted array " +Arrays.toString(arr));
        Arrays.sort(arr); // Why sorting because we can find out it in linear time
        System.out.println("After sorted array " +Arrays.toString(arr));

        for (int i = 0; i < arr.length - 3; i++) {
            if (i == 0 || arr[i] > arr[i - 1]) { // This if loops avoiding the dulicate or remving the duplucates
                // this if loops increment the pointer untill values of the array gets changed
                int start = i + 1;
                int end = arr.length - 1;
                System.out.println("Initail Ponters [ Index : " +i +" Start : " +start +" End : " +end+ " ] ");
                System.out.println("Initail Ponters  with vals : [ Index : " +arr[i] +" Start : " +arr[start] +" End : " +arr[end]+ " ] ");


                while (start < end) {
                    int sum = arr[i] + arr[start] + arr[end] ;
                    if (sum == target) {
                        results.add(new int[] {arr[i], arr[start], arr[end]});
                    }
                    System.out.println("Sum so far " +sum +" Ponters [ Index : " +i +" Start : " +start +" End : " +end+ " ] ");
                    System.out.println("Sum so far with vals " +sum +" Ponters [ Index : " +arr[i] +" Start : " +arr[start] +" End : " +arr[end]+ " ] ");


                    if (arr[i] + arr[start] + arr[end] < target) {
                        int currentStart = start;
                        System.out.println("Current start : " +currentStart+ " start " +start+ " end " +end) ;
                        while (arr[start] == arr[currentStart] && start < end) { // increment until end greater then start
                            start++;
                        }
                    } else {
                        int currentEnd = end;
                        System.out.println("Current end : " +currentEnd+ " end " +end + " start " +start) ;
                        while (arr[end] == arr[currentEnd] && start < end) { // decrement until end greater then start
                            end--;
                        }
                    }
                } // End while loop
            } // End if loops here
        } //for loops ends here

        return results;
    }


    public static ArrayList<ArrayList<Integer>> threeSum1(int[] num) {
        final int length = num.length;
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

        if (length < 3) return result;

        // Sort the array
        Arrays.sort(num);

        for (int i = 0; i < length - 2; i++) {
            if (num[i] > 0) break;
            if (i == 0 || num[i] > num[i - 1]) {
                int target = 0 - num[i];
                int start = i + 1;
                int end = length - 1;
                while (start < end) {
                    if (num[start] + num[end] == target) {
                        ArrayList<Integer> elem = new ArrayList<Integer>();
                        elem.add(num[i]);
                        elem.add(num[start]);
                        elem.add(num[end]);

                        result.add(elem);
                        start++;
                        end--;

                        // Remove duplicated results
                        while (start < end && num[end + 1] == num[end]) end--;
                        while (start < end && num[start - 1] == num[start]) start++;
                    } else
                    if (num[start] + num[end] > target) end--;
                    else start++;
                }
            }
        }
        return result;
    }

    public static ArrayList<ArrayList<Integer>> threeSumHashMap(int[] num) {
        final int length = num.length;
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        HashMap<Integer, int[]> hashMap = new HashMap<Integer, int[]>();

        // if length is less than 3, return empty result set
        if (length < 3) return result;

        Arrays.sort(num);

        for (int i = 0; i < length - 2; i++) {
            if (num[i] > 0) break;
            hashMap.clear();

            if (i == 0 || num[i] > num[i - 1]) {
                for (int j = i + 1; j < length; j++) {
                    //HM
                    hashMap.forEach((key,value) -> System.out.println("Key: " +key + " : Value  " +Arrays.toString(value)));
                    if (hashMap.containsKey(num[j])) { // found target
                        ArrayList<Integer> elem = new ArrayList<Integer>(3);

                        elem.add(hashMap.get(num[j])[0]);
                        elem.add(hashMap.get(num[j])[1]);
                        elem.add(num[j]);

                        result.add(elem);

                        // remove duplicated elements
//                        while (j < (length - 1) && num[j] == num[j + 1]) j++; // This code is not required ...i just commented and its working
                    } else {
                        int[] temp = new int[2];
                        temp[0] = num[i];
                        temp[1] = num[j];
                        hashMap.put(0 - (num[i] + num[j]), temp); //what is key is integer () , values is array of integer
                        //int[] data = {-1, 0, 1, 2, 2, -4}; -> Key: 5 : Value  [-4, -1]
                    }
                }
            }
        }
        return result;
    }







    //Code from : http://www.lifeincode.net/programming/leetcode-two-sum-3-sum-3-sum-closest-and-4-sum-java/
    //O(nlogn)O(nlogn)  +  O(n2)O(n2) =  O(n2)O(n2) ,good
    // Using sorting
    public static List<List<Integer>> threeSum(int[] num, int targetSum) {
        Arrays.sort(num);
        LinkedList<List<Integer>> ret = new LinkedList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < num.length - 2; i++) {
            int left = i + 1; // left is pointer starting from start
            int right = num.length - 1; // right is pointer starting from end
            System.out.println("Start : " +left);
            System.out.println("End : " +right);
            while (left < right) {
                if (num[i] + num[left] + num[right] == targetSum) {
                    LinkedList<Integer> oneResultList = new LinkedList<>();
                    oneResultList.add(num[i]);
                    oneResultList.add(num[left]);
                    oneResultList.add(num[right]);
                    set.add(oneResultList);
                    left++;
                    right--;
                } else {
                    if (num[i] + num[left] + num[right] < 0)
                        left++; // moving starting / left pointer if sum is less < 0 that is - values
                    else
                        right--; // or else move end / right pointer toward right direction
                }
            }
        }
        ret.addAll(set);
        return ret;
    }
}
