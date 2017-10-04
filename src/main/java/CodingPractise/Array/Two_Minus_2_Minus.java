package CodingPractise.Array;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by muthuselvan on 9/29/17.
 * https://leetcode.com/problems/k-diff-pairs-in-an-array/discuss/
 */
public class Two_Minus_2_Minus {

    public static void main(String[] args) {
        System.out.println("boolean  - " +checkTwominus(new int[] {4,3,5,2,10,1,100,99},1));
        System.out.println("count  - " +findpairsUsingHM(new int[] {4,3,5,4},1));
    }


     // O(n) finding number of minus of given target
    static int findpairsUsingHM(int[] data,int k) {

        if (data==null && data.length ==0) return -1;

        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int count = 0;

        /* This code will be simplified , using : getOrDefault
        for (int i=0;i<data.length;i++) {
            if (hashMap.containsKey(data[i])) {
                hashMap.put(data[i],hashMap.get(data[i])+1);
            } else {
                hashMap.put(data[i],1);
            }
        }
        */


        for (int i:data) {
//            System.out.println(i);
            // if no key then exist // This will give : {1=1, 2=1, 3=1, 99=1, 4=1, 100=1, 5=1, 10=1}
            hashMap.put(i, hashMap.getOrDefault(i, 0) + 1);
        }
        System.out.println("HM :" +hashMap);
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            System.out.println("K : " +entry.getKey());
            System.out.println("V : " +entry.getValue());
            if (k == 0) {
                //count how many elements in the array that appear more than twice.
                if (entry.getValue() >= 2) {
                    count++;
                }
            } else {
                if (hashMap.containsKey(entry.getKey() + k)) {
                    count++;
                }
            }
        }

        return count;





    }


    static boolean checkTwominus(int[] data, int target) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i=0;i<data.length;i++) {
            hashMap.put(data[i],i);
        }

        for (int i=0;i<data.length;i++) {
            int sum = data[i] + target;

            if (hashMap.containsKey(sum)) {
                return true;
            }

        }




        return false;
    }
}
