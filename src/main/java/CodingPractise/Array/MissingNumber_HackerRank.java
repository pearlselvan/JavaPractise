package CodingPractise.Array;

import java.util.HashMap;

/**
 * Created by muthuselvan on 9/21/17.
 */
public class MissingNumber_HackerRank {
//#https://www.hackerrank.com/challenges/missing-numbers/problem
    public static void main(String[] args) {

        int[] list1={3,3,4};
        int[] list2={3,3,3,4}; //list 2 is main set then all the nus in list 2 will be there in list1
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for (int i=0;i<list2.length;i++) {
            if (!hashMap.containsKey(list2[i])) {
                hashMap.put(list2[i],1);
            } else {
                hashMap.put(list2[i],hashMap.get(list2[i])+1);
            }
        }

        System.out.println(hashMap);

        for (int i=0;i<list1.length;i++) {
            //d[k]
            hashMap.put(list1[i],hashMap.get(list2[i])-1);

        }

        System.out.println(hashMap);





    }


}
