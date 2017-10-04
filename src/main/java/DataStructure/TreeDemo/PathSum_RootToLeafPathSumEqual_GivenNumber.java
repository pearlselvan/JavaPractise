package DataStructure.TreeDemo;

/**
 * Created by muthuselvan on 9/1/17.
 * http://www.geeksforgeeks.org/root-to-leaf-path-sum-equal-to-a-given-number/
 *
 Algorithem :
 Recursively check if left or right child has path sum equal to ( number – value at current node)


 Simple :
 -------
 The basic idea is to subtract the value of current node from sum until it
 reaches a leaf node and the subtraction equals 0, then we know that we got a hit.
 Otherwise the subtraction at the end could not be 0.

 https://leetcode.com/problems/path-sum/discuss/
 */
public class PathSum_RootToLeafPathSumEqual_GivenNumber {
}
