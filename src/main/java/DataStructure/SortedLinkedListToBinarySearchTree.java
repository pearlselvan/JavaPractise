package DataStructure;

/**
 * Created by muthuselvan on 4/1/17.
 * http://www.geeksforgeeks.org/sorted-linked-list-to-balanced-bst/
 *
 * Input:  Linked List 1->2->3
 Output: A Balanced BST
 2
 /  \
 1    3


 Input: Linked List 1->2->3->4->5->6->7
 Output: A Balanced BST
      4
    /   \
   2     6
 /  \   / \
 1   3  4   7

 Input: Linked List 1->2->3->4
 Output: A Balanced BST
      3
    /  \
   2    4
  /
 1

 Input:  Linked List 1->2->3->4->5->6
 Output: A Balanced BST
       4
     /   \
    2     6
   /  \   /
  1   3  5
 *
 *
 * Imple :
 *
 * 1) Get the Middle of the linked list and make it root.
 2) Recursively do same for left half and right half.
 a) Get the middle of left half and make it left child of the root
 created in step 1.
 b) Get the middle of right half and make it right child of the
 root created in step 1.

 Time complexity:
 -----------------
 O(nLogn)
 where n is the number of nodes in Linked List.





 */
public class SortedLinkedListToBinarySearchTree {

    public static void main(String[] args) {

        SortedLinkedListToBinarySearchTree bst = new SortedLinkedListToBinarySearchTree();

    }

}


class LList {
    int data ;
    LLNode next,prev ;

    public LList(int data) {
        this.data = data;
        next=prev=null;
    }
}
