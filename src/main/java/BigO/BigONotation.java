package BigO;

/**
 * Created by muthuselvan on 3/23/17.

 *
 * https://www.topcoder.com/community/data-science/data-science-tutorials/the-importance-of-algorithms/
 * http://infotechgems.blogspot.com/2011/11/java-collections-performance-time.html
 *
  O(Log(N))	--- 10-7 seconds
  O(N)	--- 10-6 seconds
  O(N*Log(N)) -----	10-5 seconds
  O(N2)	---- 10-4 seconds
  O(N6)	--- 3 minutes
  O(2N)	--- 1014 years.
  O(N!)	----- 10142 years.

 ORDER :
 ======
  N! > 2 power n ( exponential ) > n3 > n2 > n log n > n > log n > 1


    What is log(8) , its base 2 that 2*2*2




 ArrayList Vs LinkedList
 ========================

 1) Search: ArrayList search operation is pretty fast compared to the LinkedList search operation.
 get(int index) in ArrayList gives the performance of O(1) while LinkedList performance is O(n).

 Reason: ArrayList maintains index based system for its elements as it uses array data structure implicitly which makes
 it faster for searching an element in the list. On the other side LinkedList implements doubly linked list
 which requires the traversal through all the elements for searching an element.

 http://beginnersbook.com/2013/12/difference-between-arraylist-and-linkedlist-in-java/



 When to use LinkedList and when to use ArrayList?

 1) As explained above the insert and remove operations give good performance (O(1))
 in LinkedList compared to ArrayList(O(n)). Hence if there is a requirement of frequent addition and deletion
 in application then LinkedList is a best choice.
 2) Search (get method) operations are fast in Arraylist (O(1)) but not in LinkedList (O(n)) so If there are less add and remove operations and more search operations requirement, ArrayList would be your best bet.


 -------------------------------------------------
 O(1) - Static
 O(log N ) -> Divide on conquer -> Binary Search
 O(N) - Directly and linearly connect with N
 O(N log N ) - Merge Search , search deck of cards
 O(N2) aka N square aks exponential -

 -------------------------------------------------

 Here are some examples of O(n) -
 -------------------------------
 * Traversing an array
 * Traversing a linked list
 * Linear Search
 * Deletion of a specific element in a Linked List (Not sorted)
 * Comparing two strings
 * Checking for Palindrome
 * Counting/Bucket Sort

 O(n2):
 ------
 * Bubble Sort
 * Insertion Sort
 * Selection Sort
 * Traversing a simple 2D array
 *
 *
 * Linearithmic time: O(n*Log n)
 * ------------------------------
 Linearithmic algorithms are capable of good performance with
 very large data sets. Some examples of linearithmic algorithms are:

 heapsort   ->  O(n) for build heap + 0(log(n) for heapify
 merge sort
 Quick sort
 *
 */
public class BigONotation {

}
