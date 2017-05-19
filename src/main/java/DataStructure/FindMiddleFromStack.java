package DataStructure;

/**
 * Created by muthuselvan on 3/16/17.
 * Design a stack with operations on middle element
 * http://www.geeksforgeeks.org/design-a-stack-with-find-middle-operation/

 *  JAVA FOR THE ABOVE :
 * https://github.com/nkatre/Operations-on-Stack/blob/master/findMiddle%20and%20deleteMiddle%20in%20constant%20time%20in%20Stack

 *  The important question is,
 *  ===========================
 *  whether to use a linked list or array for implementation of stack?
 *
 *  ARRAY : Deleting an element from middle is not O(1) for array Also, we may need to move the middle pointer
 *  up when we push an element and move down when we pop().
 *
 *  In singly linked list, moving middle pointer in both directions is not possible.
 *
 *  The idea is to use Doubly Linked List (DLL).
 *  We can delete middle element in O(1) time by maintaining mid pointer.
 *  We can move mid pointer in both directions using previous and next pointers
 *
 *  ===========
 *
 *
 * Since the stack's size is not limited we can choose a linked list or preferably double linkedlist to store and retireve the elements
 * of stack. Advantage of using doubly linked list is deletion of middle element would be easy.
 * So, if we uve a doubly linked list,
 *
 * insertion(push()) would be done in O(1) time by keeping track of last node.
 * Pop(0 is also can be done in the same way as we are aware of what the last node is.
 * To find the mid element we use a variable which keeps track of middle element and gets
 * updated during insertions and deletions of elements from stack.
 *
 * The same would be updated during deletion of middle element based on stack size.
 * We maintain a flag that would help in assessing middle element behavior.
 *
 * * c++: http://mycppexperiments.blogspot.com/2013/06/design-stack-which-performs-middle.html
 *
 */
public class FindMiddleFromStack {

}

class DLLN {

    DLLN prev ;
    DLLN next ;
    int data ;

    public DLLN(int data) {
        this.data = data;
        this.prev=null;
        this.next = null ;
    }


}
