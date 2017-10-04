package DataStructure.Stack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by muthuselvan on 5/29/17.
 * http://www.geeksforgeeks.org/next-greater-element/
 * Python : and java
 *
 *
 * Next Greater Element
 Given an array, print the Next Greater Element (NGE) for every element.
 The Next greater Element for an element x is the first greater element
 on the right side of x in array. Elements for which no greater element exist,
 consider next greater element as -1.
 *
 *
 * https://leetcode.com/problems/next-greater-element-i/discuss/ : 0(n)
 */
public class StackNextGreaterElement {

    public static void main(String[] args) {
        int[] data = {4, 5, 2, 25};
        int[] find = {5};
        System.out.println(Arrays.toString(nextGreaterElement(find,data)));


    }

    public static int[] nextGreaterElement(int[] findNums, int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(); // map from x to next greater element of x
        Stack<Integer> stack = new Stack<>();
        for (int num : nums) {
            while (!stack.isEmpty() && stack.peek() < num)
                map.put(stack.pop(), num);
            stack.push(num);
        }
        System.out.println("Map after pushed : " +map);

        for (int i = 0; i < findNums.length; i++)
            findNums[i] = map.getOrDefault(findNums[i], -1);
        return findNums;
    }
}
