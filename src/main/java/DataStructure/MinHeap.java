package DataStructure;

/**
 * Created by muthuselvan on 4/3/17.
 * https://www.tutorialspoint.com/data_structures_algorithms/heap_data_structure.htm
 *
 *
 * What is heap ? min-heap ?
 *
 * This Java program is to implement Min heap.
 * A Heap data structure is a Tree based data structure that satisfies
 * the HEAP Property “If A is a parent node of B then key(A) is ordered with respect to key(B)
 * with the same ordering applying across the heap.”
 *
 So in a Min Heap this property will be “If A is a parent node of B then key(A)
 is less than key(B) with the same ordering applying across the heap.” and
 in a max heap the key(A) will be greater than Key(B).

 Java code : http://www.sanfoundry.com/java-program-implement-min-heap/

 Time and Space Complexity:
 ---------------------------

 Space	O(n)
 Search	O(n)
 Insert	O(log n)
 Delete	O(log n)

 Implementation :
---------------------

 Use array to store the data.
 Start stor­ing from index 1, not 0.
 For any given node at posi­tion i:
 Its Left Child is at [2*i] if available.
 Its Right Child is at [2*i+1] if available.
 Its Par­ent Node is at [i/2]if avail­able.
 *
 */
public class MinHeap {
}
