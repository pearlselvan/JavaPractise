/**
 * Created by muthuselvan on 6/22/17.
 *
 * The reason we re-implement a priority queue is to improve its effiiciency. When we implemented a priority queue with an array or a linked list, the efficiency of some operations were O(n).

 insert  	  deleteMin  	  remove  	  findMin
 ordered array	 O(n)	 O(1)	 O(n)	 O(1)
 ordered list	 O(n)	 O(1)	 O(1)	 O(1)
 unordered array	 O(1)	 O(n)	 O(1)	 O(n)
 unordered list	 O(1)	 O(n)	 O(1)	 O(n)
 Using a binary heap, the runtime of both the deleteMin and insert operations is O(log n).

 insert  	  deleteMin  	  remove  	  findMin
 binary heap	 O(log n)	 O(log n)	 O(log n)	 O(1)

 From : https://www.cs.cmu.edu/~adamchik/15-121/lectures/Binary%20Heaps/heaps.html

 *
 */
package DataStructure.Queue;


