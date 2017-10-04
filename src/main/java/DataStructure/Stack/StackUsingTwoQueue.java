package DataStructure.Stack;

import java.util.Queue;

import java.util.LinkedList;

/**
 * Created by muthuselvan on 4/3/17.
 *
 * using oneQ , twoQ :
 * https://leetcode.com/articles/implement-stack-using-queues/
 * https://stackoverflow.com/questions/688276/implement-stack-using-two-queues
 *
 Queue is a particular kind of abstract data type or collection in which the entities
 in the collection are kept in order and the principal (or only) operations on the collection
 are the addition of entities to the rear terminal position, known as enqueue, and removal
 of entities from the front terminal position, known as dequeue.
 This makes the queue a First-In-First-Out (FIFO) data structure.

 Stack is a particular kind of abstract data type or collection in which the principal
 (or only) operations on the collection are the addition of an entity to the collection,
 known as push and removal of an entity, known as pop.
 The relation between the push and pop operations is such that the stack is a Last-In-First-Out (LIFO)
 data structure.


 Version A (efficient push):
 ===========================

 push:
 enqueue in queue1
 pop:
 while size of queue1 is bigger than 1, pipe dequeued items from queue1 into queue2
 dequeue and return the last item of queue1, then switch the names of queue1 and queue2

 Version B (efficient pop):
 ===========================

 push:
 enqueue in queue2
 enqueue all items of queue1 in queue2, then switch the names of queue1 and queue2
 pop:
 deqeue from queue1

 *
 */
public class StackUsingTwoQueue {


    private Queue<Integer> queue1 = new LinkedList();
    private Queue<Integer> queue2 = new LinkedList();
    private int top =0 ;


    public static void main(String[] args) {
        StackUsingTwoQueue stackUsingTwoQueue = new StackUsingTwoQueue();
        stackUsingTwoQueue.push(10);
        stackUsingTwoQueue.push(20);
        System.out.println("Stack " +stackUsingTwoQueue);
    }

    public StackUsingTwoQueue() {


    }

    public void push(int data) {
        this.queue1.offer(data);
    }


    public void pop() {

        while (queue1.size() > 1 ) {
            top = this.queue1.remove();
            this.queue2.add(top);
        }

        queue1.remove();
        Queue<Integer> temp = queue1;
        System.out.println("pop : " + queue1.peek());
        queue1=queue2;
        queue2=temp;

    }


}
