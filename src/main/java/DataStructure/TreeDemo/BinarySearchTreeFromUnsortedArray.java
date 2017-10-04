package DataStructure.TreeDemo;

/**
 * Created by muthuselvan on 4/4/17.
 * http://javatroops.blogspot.com/2012/11/create-binary-search-tree-from-array.html
 *
 *  Eg : { 60 40 30 28 35 42 70 65 62 68 72 }
 *
 *  Approach :
 * 1. Remember the property of a BST -
 * parent is greater than its left and less than its right.
 * 2.
 *
 *
 *  Approach :
 *  1) Get the Middle of the array and make it root.
 2) Recursively do same for left half and right half.
 a) Get the middle of left half and make it left child of the root
 created in step 1.
 b) Get the middle of right half and make it right child of the
 root created in step 1.
 *
 *
 *  Question 1 :
 *  ===========
 *  Sorted Array to Balanced BST : (*  Using DFS Recurstion :)
 *  -----------------------------------------------------------
 *  http://www.geeksforgeeks.org/sorted-array-to-balanced-bst/
 *
 *  Example :
 *  --------
 *  http://javabypatel.blogspot.com/2016/10/sorted-array-to-binary-search-tree.html
 *
 *
 *  Using DFS Recurstion :
 *  =====================
 *  https://www.programcreek.com/2013/01/leetcode-convert-sorted-array-to-binary-search-tree-java/
 *
 *
 *
 *
 */
public class BinarySearchTreeFromUnsortedArray {
}
