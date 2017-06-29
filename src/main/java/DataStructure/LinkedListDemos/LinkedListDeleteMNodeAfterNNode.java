package DataStructure.LinkedListDemos;

/**
 * Created by muthuselvan on 5/31/17.
 * Time Complexity: O(n) where n is number of nodes in linked list.
 * http://www.geeksforgeeks.org/delete-n-nodes-after-m-nodes-of-a-linked-list/
 *
 *
 * Given a linked list and two integers M and N. Traverse the linked list such that you retain M nodes
 * then delete next N nodes, continue the same till end of the linked list.
 *
 *  Input:
    M = 2, N = 2
    Linked List: 1->2->3->4->5->6->7->8
    Output:
    Linked List: 1->2->5->6

    Input:
    M = 3, N = 2
    Linked List: 1->2->3->4->5->6->7->8->9->10
    Output:
    Linked List: 1->2->3->6->7->8

    Input:
    M = 1, N = 1
    Linked List: 1->2->3->4->5->6->7->8->9->10
    Output:
    Linked List: 1->3->5->7->9
 *
 *
 */
public class LinkedListDeleteMNodeAfterNNode {
}
