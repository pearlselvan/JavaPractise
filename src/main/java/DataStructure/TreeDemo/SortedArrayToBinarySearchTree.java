package DataStructure.TreeDemo;

/**
 * Created by muthuselvan on 4/1/17.
 * http://www.geeksforgeeks.org/sorted-array-to-balanced-bst/
 *
 *
 * What is Binary Search Tree ?
 * A binary search tree (BST) is a node based binary tree data structure which has the following properties.
 • The left subtree of a node contains only nodes with keys less than the node’s key.
 • The right subtree of a node contains only nodes with keys greater than the node’s key.
 • Both the left and right subtrees must also be binary search trees.


 *
 *
 Input:  Array {1, 2, 3}
 Output: A Balanced BST
   2
 /  \
 1    3

 o/p : 2 1 3

 Input: Array {1, 2, 3, 4}
 Output: A Balanced BST
     3
    /  \
   2    4
  /
 1


 Implementaton :
 1) Get the Middle of the array and make it root.
 2) Recursively do same for left half and right half.
 a) Get the middle of left half and make it left child of the root
 created in step 1.
 b) Get the middle of right half and make it right child of the
 root created in step 1.


 */
public class SortedArrayToBinarySearchTree {
}
