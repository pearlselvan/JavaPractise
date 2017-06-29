package DataStructure.TreeDemo;

/**
 * Created by muthuselvan on 6/14/17.
 * http://www.geeksforgeeks.org/binary-search-tree-set-2-delete/
 *
 * Time Complexity: The worst case time complexity of delete operation is O(h)
 * where h is height of Binary Search Tree. In worst case, we may have to travel from root to
 * the deepest leaf node. The height of a skewed tree may become n and the time complexity of
 * delete operation may become O(n)
 *
 */

/*
        When we delete a node, there possibilities arise.

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

        The important thing to note is, inorder successor is needed only when right
        child is not empty. In this particular case, inorder successor can be obtained by
         finding the minimum value in right child of the node.
*/
public class BinarySearchDelete {


}
