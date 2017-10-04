package DataStructure.TreeDemo;

/**
 * Created by muthuselvan on 9/4/17.
 *
 *  Question ?
 *  -----------
 *  http://javabypatel.blogspot.in/2015/11/find-kth-largest-element-in-binary-search-tree.html
 *
 *
 * http://www.geeksforgeeks.org/kth-largest-element-in-bst-when-modification-to-bst-is-not-allowed/
 *
 *  Method 1 :
 *  ---------
 *  O(n) time

   Method 2 :
  -----------
 * O(h) time where h is height of BST
 *
 * Can we find k’th largest element in better than O(n)
 * time and no augmentation? Yes
 *
 * a method is discussed that takes O(h + k) time. This method doesn’t require any change to BST.

 Using in-order :
 ----------------
 The idea is to do reverse inorder traversal of BST.
 The reverse inorder traversal traverses all nodes in decreasing order.
 While doing the traversal, we keep track of count of nodes visited so far.
 When the count becomes equal
 to k, we stop the traversal and print the key.
 *
 */
public class KthLargestInBST {
}
