package DataStructure.Stack;

/**
 * Created by muthuselvan on 5/29/17.
 * http://www.geeksforgeeks.org/find-maximum-sum-possible-equal-sum-three-stacks/
 *
 *
 * Question :
 * ===========
 *
 * Find maximum sum possible equal sum of three stacks
 * ----------------------------------------------------
 *
 * Given three stack of the positive numbers, the task is to find the possible
 * equal maximum sum of the stacks with removal of top elements allowed.
 * Stacks are represented as array, and the first index of the array
 * represent the top element of the stack.
 *
 *
 Input :
 -------
 stack1[] = { 3, 10}
 stack2[] = { 4, 5 }
 stack3[] = { 2, 1 }
 Output : 0
 Sum can only be equal after removing all elements
 from all stacks.

 Example 2 :

 # Driven Program
 -----------------
 stack1 = [ 3, 2, 1, 1, 1 ]
 stack2 = [ 4, 3, 2 ]
 stack3 = [ 1, 1, 4, 1 ]

 Output : 5
 ----------




 * Algorithm for solving this problem:
 * ====================================

 1. Find sum of all elements of in individual stacks.
 2 If the sum of all three stacks is same, then this is the maximum sum.
 3. Else remove the top element of the stack having the maximum sum among three of stacks.
 Repeat step 1 and step 2.

 Time Complexity : O(n1 + n2 + n3) where n1, n2 and n3 are sizes of three stacks.

 */
public class FindEqualSumThreeStack {
}
