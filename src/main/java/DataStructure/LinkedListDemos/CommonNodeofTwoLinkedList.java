package DataStructure.LinkedListDemos;

/**
 * Created by muthuselvan on 5/31/17.
 * http://www.devinline.com/2014/04/find-common-node-of-two-linked-list.html
 *
 * Consideration :
 * In order to find common node of two linked lists we need to consider one of the important factor
 * - length of linked list.
 *
 * If length of both linked list is same then it is just a cake walk,
 * iterate both linked list with same frequency(one node at a time) and check whether both linked list reference
 * same node at any point, if intersection node exist we will find it, else reaches at end of list.
 *
 * However, problem is all about two linked list of different length.Refer following diagram,
 * length of first linked list is 4 and 3 for second one.
 *
 * We will start with brute force approach followed by some time efficient ways.
 *
 * 1 . Brute force approach
 *   Suppose length of linked lists are p and q respectively then, time complexity is O(pq) and space complexity is O(1)
 *    .
 * 2. By finding length of linked lists
 *     ---> Big (o) :  O(max(p,q)))
 * 3. Using two stack
 *     ------>> O(p+q))
 *
 *
 *     Example :
 *     ======Sample output============
 Linked list -1  [12 18 172 62 632  ]
 Linked list -2  [121 89 72 162 34 2 62 632  ]
 Common node of two linked list is with value(Brute force approach - O(pq)) : 62
 Common node of two linked list is with value(By finding length- O(max(p,q))) : 62
 Common node of two linked list is with value(using two stack- O(p+q)) : 62
 * .
 *
 *

 *
 */
public class CommonNodeofTwoLinkedList {
}
