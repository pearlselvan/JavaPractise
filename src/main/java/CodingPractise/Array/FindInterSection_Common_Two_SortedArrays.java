package CodingPractise.Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by muthuselvan on 9/2/17.
 * http://www.geeksforgeeks.org/find-common-elements-three-sorted-arrays/
 *
 *  Union Intersection :
 *  http://www.geeksforgeeks.org/union-and-intersection-of-two-sorted-arrays-2/
 *
 *
 *  https://www.programcreek.com/2015/05/leetcode-intersection-of-two-arrays-java/
 *
 *  Using HashSet :
 *  Java Solution 1 - HashSet
    Time = O(n).
    Space = O(n).


 */
public class FindInterSection_Common_Two_SortedArrays {

    public static void main(String[] args) {
       int[] arr1 = {1, 3, 4, 5, 7};
       int[] arr2 = {2, 3, 5, 6};
        System.out.println("Intersection : " + Arrays.toString(intersection(arr1,arr2)));


    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> intersect = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }



        set.forEach(out-> System.out.println("set for n1 :" +out));
        System.out.println("After Added : " +set);

        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                intersect.add(nums2[i]);
            }
        }

        intersect.forEach(out-> System.out.println("inter set for n1 :" +out));
        int[] result = new int[intersect.size()];
        int i = 0;
        for (Integer num : intersect) {
            result[i++] = num;
        }
        return result;
    }
}
