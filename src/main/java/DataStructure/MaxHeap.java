package DataStructure;

/**
 * Created by muthuselvan on 4/3/17.
 * https://www.tutorialspoint.com/data_structures_algorithms/heap_data_structure.htm
 *
 * Heap Property :
 * A Heap data structure is a Tree based data structure that satisfies the HEAP Property
 * “If A is a parent node of B then key(A) is ordered with respect to key(B) with the same ordering applying across
 * the heap.”
 *
 *
 * Max Heap Property  :
 * --------------------
 * If A is a parent node of B then key(A) is greater than key(B) with the same ordering applying across the heap
 *
 * Steps :
 * ------
 * Step 1 − Create a new node at the end of heap.
   Step 2 − Assign new value to the node.
   Step 3 − Compare the value of this child node with its parent.
   Step 4 − If value of parent is less than child, then swap them.
   Step 5 − Repeat step 3 & 4 until Heap property holds.
 *
 * java impl : http://www.sanfoundry.com/java-program-implement-max-heap/
 *
 * important note :
 * parent = index / 2
 * leftchild=2*index
 * rightchild=(2*index)+1
 *
 */
public class MaxHeap {
}
