package DataStructure.LinkedListDemos;

/**
 * Created by muthuselvan on 5/31/17.
 * http://www.devinline.com/2014/05/how-to-merge-two-sorted-linked-list.html
 * http://algorithms.tutorialhorizon.com/merge-or-combine-two-sorted-linked-lists/
 *
 * Given two sorted linked list, merge two linked list and form third sorted linked list containing all
 * elements of given liked list. Solve using non-recursive and recursive approach.
 *
 * /*  Merge two sorted linked lists and form third sorted linked list
 *List1: 4-->5-->12 -->24 -->83
 *List2: 8-->9-->14 -->21 -->31 -->132 -->136
 * Result(Sorted list) : 4->5->8->9->12->14->21->24->31->83->132->136
 *
 * 1. Non-recursive approach(Iterative):-
 ** ============================================
 * Iterative Since all elements are sorted in both linked list,
 * we can traverse both liked list and by comparing element of both linked
 * list we can decide which is smaller and put that in result linked list
 * and repeat this until all elements are covered in one of the list
 * and after that just copy all elements from second list.

 Algorithm:-  Lets consider head1 and head2 are referring first node of two linked list.
 1. Traverse linked list List1 and List2 until head1 is null or head 2 is null.
 2. Compare data of first node of both list - add node with lesser value into result linked list and increment head of that linked list.
 3. Repeat step 2 and move corresponding head.
 4. Once head of one of list has reached at end of list, just copy all elements from another linked list into result list.

 Time and space complexity :-
 -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
 Since each element is traversed only once so time complexity is order of O(p+q),
 p and q are length of linked list. Space complexity is constant O(p+q) , length of result list.

 *
 * 2. Using recursion:-
 * ======================
 * Algorithm:-
 * 1. Check head of both list , if one of them is null returns others, because that list does not have more elements.
 2. Next, if both are non- null, check for node with lesser value and assume that node as head of result liked list. Call same method recursively with next element of that list. Do the same if other list has lesser values node.
 3. Return head of result linked list.

 Time and space complexity :-
 -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
 Since each element is traversed only once so time complexity is order of O(p+q),
 p and q are length of linked list. Space complexity is constant O(p+q) , length of result list.
 Below is complete sample program to merge two sorted linked list in third linked list
 (Both non-recursive and recursive approach) :-
 *
 */



public class MergerSortedLinkedList {
}
