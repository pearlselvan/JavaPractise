package CodingPractise.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Created by muthuselvan on 9/5/17.
 *
 * https://web.stanford.edu/class/cs9/lectures/04/Two-Sum.pdf
 *
 * Code :
 *  First BF and Hash Table :
 * https://leetcode.com/articles/two-sum/
 */
public class Two_Sum_2_Sum {

    public static void main(String[] args) {
//        twoSumUsingHashMap(new int[]{1,2,2,3},4);
        twoSumUsingHashMap(new int[]{2,1,5,6,11,2},7);
//        twoSumUsingHashMap(new int[]{4, 6, 10, 15, 16,2,19},21);
//        System.out.println(Arrays.toString(twoSumUsingHashMap(new int[]{4, 6, 10, 15, 16,2,19},21)));
//        System.out.println("T : " +Arrays.toString(twoSum(new int[]{4,4,1},3)));
//        System.out.println("T : " +twoSumBoolean(new int[]{4, 6, 10, 15, 16},21));
//        System.out.println("T : " +twoSumBoolean(new int[]{-4, -6, 10, 15, 16},-10));

    }
 /*
 Complexity Analysis:

Time complexity : O(n)O(n). We traverse the list containing nn elements
exactly twice. Since the hash table reduces the look up time to O(1)O(1),
the time complexity is O(n)O(n).

Space complexity : O(n)O(n). The extra space required depends on the number
 of items stored in the hash table, which stores exactly nn elements
  */
    public static int[] twoSumUsingHashMapforintreturn(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                System.out.println("Value 11 : " +nums[i] +" :  Value 2  :" +nums[map.get(complement)]);
                return new int[] { i, map.get(complement) };
            }
        }
        throw new IllegalArgumentException("No two sum solution");

    }


    public static void twoSumUsingHashMap(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        Map<Integer, Integer> mylist = new HashMap<>();
//        LinkedList<Integer> mylist = new LinkedList<>();
//        LinkedList<Integer[]> mylist = new LinkedList<>();

//        mylist.add(1);
//        System.out.println("Contain " +mylist.contains(100));
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            //(nums[i] != map.get(complement)) ??? ToDo

            if (map.containsKey(complement) && map.get(complement) != i  && !mylist.containsKey(complement)) {

                mylist.put(nums[i],complement);
//                mylist.add(nums[i]);

//                    System.out.println("Value 11 : " + nums[i] + " :  Value 2  :" + complement);
//                    System.out.println("Value 11 : " + nums[i] + " :  Value 2  :" + nums[map.get(complement)]);


//                return new int[] { i, map.get(complement) };
            }
        }

        System.out.println("list :" +mylist);


    }



    public static boolean twoSumBoolean(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        System.out.println(map);
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            System.out.println("Complementry : " +complement);
//            if (map.containsKey(complement) && map.get(complement) != i) {
            if (map.containsKey(complement)) {
//                return new int[] { i, map.get(complement) };
                return true;
            }
        }
        return false;
    }
}
