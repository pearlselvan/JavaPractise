/**
 * Created by muthuselvan on 6/14/17.
 * -------------
 *  ALL
 *  ------------
 *
 *  http://www.geeksforgeeks.org/binary-tree-data-structure/
 *
 * What is Tree ?
 * Trees: Unlike Arrays, Linked Lists, Stack and queues, which are linear data structures,
 * trees are hierarchical data structures.
 *
 *
 *  tree
    ----
        j    <-- root
     /   \
    f      k
 /   \      \
 a     h      z    <-- leaves
 *
 *
 *
 * Practical Example for :
 * -------------------------
 * the file system on a computer:
 *
 *
 * Why Trees?
 1. One reason to use trees might be because you want to store information that naturally forms a hierarchy. For example, the file system on a computer:

             file system
             -----------
                /    <-- root
             /      \
    ...       home
             /          \
             ugrad        course
             /       /      |     \
             ...      cs101  cs112  cs113
 2. Trees (with some ordering e.g., BST) provide moderate access/search (quicker than Linked List and slower than arrays).
 3. Trees provide moderate insertion/deletion (quicker than Arrays and slower than Unordered Linked Lists).
 4. Like Linked Lists and unlike Arrays, Trees don’t have an upper limit on number of nodes as nodes are linked using pointers.


 *
 * Question 1 Explanation:

 In skewed Binary Search Tree (BST), all three operations can take O(n).
 See the following example BST and operations in worst case its O(n)

            10
            /
          20
         /
       30
      /
    40

 Search 40.
 Delete 40
 Insert 50.
 *
 *
 */
package DataStructure.TreeDemo;
