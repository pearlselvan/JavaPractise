package DataStructure.TreeDemo;

/**
 * Created by muthuselvan on 3/8/17.
 * http://www.geeksforgeeks.org/sorted-array-to-balanced-bst/
 */

/*
Input:  Array {1, 2, 3}
Output: A Balanced BST
     2
   /  \
  1    3

Input: Array {1, 2, 3, 4}
Output: A Balanced BST
      3
    /  \
   2    4
 /
1

Impl :
=======
1) Get the Middle of the array and make it root.
2) Recursively do same for left half and right half.
      a) Get the middle of left half and make it left child of the root
          created in step 1.
      b) Get the middle of right half and make it right child of the
          root created in step 1.

Time Complexit :

Time Complexity: O(n)
Following is the recurrance relation for sortedArrayToBST().

  T(n) = 2T(n/2) + C
  T(n) -->  Time taken for an array of size n
   C   -->  Constant (Finding middle of array and linking root to left
                      and right subtrees take constant time)
 */
public class SortedArrayToBST {
}

//A Binary Tree node */

class BinaryTreeNode {

    int data ;
    BinaryTreeNode left ;
    BinaryTreeNode right ;

    public BinaryTreeNode(int data) {
        this.data = data;
//        this.left = null;
//        this.right = null ;
        //or
        left=right=null;

    }


}
