package DataStructure.TreeDemo;

/**
 * Created by muthuselvan on 6/14/17.
 *
 *
 * Code :
 * ======
 * http://www.geeksforgeeks.org/binary-search-tree-set-2-delete/
 *
 *
 * Different Approach :
 * =====================
 * https://leetcode.com/problems/delete-node-in-a-bst/description/
 *
 *
 *
 * Time Complexity: The worst case time complexity of delete operation is O(h)
 * where h is height of Binary Search Tree. In worst case, we may have to travel from root to
 * the deepest leaf node. The height of a skewed tree may become n and the time complexity of
 * delete operation may become O(n)
 *



        When we delete a node, the property of BST tree must be conserved


        when d

        1) Node to be deleted is leaf: Simply remove from the tree.

           50                            50
        /     \         delete(20)      /   \
        30      70       --------->    30     70
        /  \    /  \                     \    /  \
        20   40  60   80                   40  60   80

        2) Node to be deleted has only one child: Copy the child to the node and delete the child

            50                            50
         /     \         delete(30)      /   \
        30      70       --------->    40     70
         \    /  \                          /  \
         40  60   80                       60   80

        3) Node to be deleted has two children: Find inorder successor of the node.
        Copy contents of the inorder successor to the node and delete the inorder successor.
         Note that inorder predecessor can also be used.

           50                            60
        /     \         delete(50)      /   \
        40      70       --------->    40    70
        /  \                            \
        60   80                           80

        CASE 3 : Deleteting node with two childrent
     Check the video : https://www.youtube.com/watch?v=gcULXE7ViZw&vl=en

       APPROACH 1 :
        1. Find minimum in right side and replace the node which will be deleted
      APPROACH 2 :
        1. Find maximun in left side

                USE RECURSION TO DELETE THE NODE


        The important thing to note is, inorder successor is needed only when right
        child is not empty. In this particular case, inorder successor can be obtained by
         finding the minimum value in right child of the node.
*/
public class BinarySearchDelete {


}
