package DataStructure;

/**
 * Created by muthuselvan on 3/6/17.
 * http://javarevisited.blogspot.com/2013/05/find-if-linked-list-contains-loops-cycle-cyclic-circular-check.html
 */

/*
//Floyd’s cycle finding algorithm
1) Use two pointers fast and slow
2) Move fast two nodes and slow one node in each iteration
3) If fast and slow meet then linked list contains cycle
4) if fast points to null or fast.next points to null then linked list is not cyclic

//Other option then Floyd’s cycle finding algorithm

Use Hashing:
Traverse the list one by one and keep putting the node addresses in a Hash Table.
At any point, if NULL is reached then return false and if next of current node points
to any of the previously stored nodes in Hash then return true.

Mark Visited Nodes:
This solution requires modifications to basic linked list data structure.
Have a visited flag with each node.
Traverse the linked list and keep marking visited nodes.
If you see a visited node again then there is a loop.
This solution works in O(n) but requires additional information with each node.
A variation of this solution that doesn’t require modification
to basic data structure can be implemented using hash.
Just store the addresses of visited nodes in a hash and if you see an address that already exists in hash
then there is a loop.

http://www.geeksforgeeks.org/write-a-c-function-to-detect-loop-in-a-linked-list/

 */

public class CheckLLisCyclic {

    public static void main(String[] args) {

    }


}
