package Collections;

/**
 * Created by muthuselvan on 6/21/17.
 * https://www.interviewcake.com/java-interview-questions#arraylist-linkedlist
 *
 Linked List vs Dynamic Array
 ----------------------------
 The first difference is that LinkedList is, predictably enough, an implementation of a linked list ↴
 . ArrayList and Vector, on the other hand, are implementations of dynamic arrays ↴ .

 So LinkedList has the strengths and weaknesses of a linked list,
 while ArrayList and Vector have the strengths and weaknesses of a dynamic array. In particular:

 Advantages of Dynamic Arrays
 ----------------------------

 getting the item at a specific position/index (()) is faster. It's O(1)O(1) time, vs O(n)O(n) time for a linked list
 they take up less space than linked lists. In a linked list, each new "node" is a separate data structure which incurs some space overhead, whereas for a dynamic array each new item is simply another element in the underlying array. This difference is asymptotically insignificant, however—both data structures take O(n)O(n) space.
 they're more cache friendly, since the elements are actually next to each-other in memory. This means that reads, especially sequential reads, often end up being much faster. Again, this difference is asymptotically insignificant.
 Advantages of Linked Lists

 () is faster with a linked list. It's O(1)O(1) time, vs O(n)O(n) time for a dynamic array (dynamic arrays have to "scoot over" each subsequent item to fill in the gap created by the removal).
 () is faster with a linked list. It's O(1)O(1) time, vs O(n)O(n) time for a dynamic array (dynamic arrays have to "scoot over" each subsequent item to make space for the new item).
 () is always O(1)O(1) time. Dynamic arrays have an amortized O(1)O(1) time cost for (), but a worst case O(n)O(n) time cost, because an () could trigger a doubling of the underlying array.
 So which should you use? Conventional wisdom is that dynamic arrays are usually the right choice. The main exception is if you plan to use () and/or () very heavily and you don't plan to use () very often. Then a LinkedList might be the right choice, although it may take up more memory and—because it's less cache-friendly—it may have slower reads.

 ArrayList vs Vector
 ---------------------
 So within our options for dynamic array data structures, which one should we choose?

 The main difference (though there are others) is that Vector is entirely thread-safe, because it synchronizes on each individual operation.

 But you should almost always use ArrayList, even if you're writing code that needs to be thread-safe. The reason is that synchronizing on each operation is generally not the best way to make your dynamic array thread-safe. Often what you really want is to synchronize a whole set of operations, such as looping through the dynamic array, making some modifications as you go. If you're going to be doing multiple operations while looping through a Vector, you'll need to take out a lock for that whole series of operations anyway, or else another thread could modify the Vector underneath you, causing a ConcurrentModificationException.

 For this reason, Vectors are generally considered to be obsolete. Use an ArrayList instead, and manage any necessary synchronization by hand.
 */
public class ArrayList_Vector_LinkedList {
}
