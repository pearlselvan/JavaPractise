package DataStructure.Stack;

import java.util.Stack;

/**
 * Created by muthuselvan on 4/1/17.
 * Keep 2 stacks, let's call them inbox and outbox.
 *
 * The idea behind this is :
 * in Stack : Adding and Deleting will happen in same end
 * in Queue : Adding and Deleting will happend in different end

 Enqueue: (Adding)
 -------------------
 Push the new element onto inbox

 Dequeue: (Deleting)
 -------------------


 If outbox is empty, refill it by popping each element from inbox and pushing it onto outbox
 Pop and return the top element from outbox
 Using this method, each element will be in each stack exactly once - meaning each element will be pushed twice and popped twice, giving amortized constant time operations

 Approach 2 :
 -----------
 https://leetcode.com/articles/implement-queue-using-stacks/
 Approach #1 (Two Stacks) Push - O(n)O(n) per operation, Pop - O(1)O(1) per operation.

 http://www.geeksforgeeks.org/queue-using-stacks/

 Method 1
 ========
 (By making enQueue operation costly)
 This method makes sure that oldest entered element is always at the top of stack 1,
 so that deQueue operation just pops from stack1. To put the element at top of stack1, stack2 is used.

 enQueue(q, x)
 1) While stack1 is not empty, push everything from satck1 to stack2.
 2) Push x to stack1 (assuming size of stacks is unlimited).
 3) Push everything back to stack1.

 dnQueue(q)
 1) If stack1 is empty then error
 2) Pop an item from stack1 and return it

 Method 2
 ========
 (By making deQueue operation costly)
 In this method, in en-queue operation, the new element is entered at the top of stack1.
 In de-queue operation, if stack2 is empty then all the elements are moved to stack2 and
 finally top of stack2 is returned.

 enQueue(q,  x)
 1) Push x to stack1 (assuming size of stacks is unlimited).

 deQueue(q)
 1) If both stacks are empty then error.
 2) If stack2 is empty
 While stack1 is not empty, push everything from stack1 to stack2.
 3) Pop the element from stack2 and return it.

 Which is better ?
 ==================
 Method 2 is definitely better than method 1.
 Method 1 moves all the elements twice in enQueue operation,
 while method 2 (in deQueue operation) moves the elements once and moves elements only if stack2 empty.
 Implementation of method 2:



 */
public class QueueImplementTwoStacks {

    public static void main(String[] args) {
        QueueN<Integer> qStack = new QueueN<>();
        qStack.queue(10);
        qStack.queue(20);
        System.out.println("Q deQueu" +qStack.dequeue());
    }
}


 class QueueN<E>
{

    private Stack<E> inbox = new Stack<E>();
    private Stack<E> outbox = new Stack<E>();

    public void queue(E item) {
        inbox.push(item);
    }

    public E dequeue() {
        if (outbox.isEmpty()) {
            while (!inbox.isEmpty()) {
                outbox.push(inbox.pop());
            }
        }
        return outbox.pop();
    }

}
